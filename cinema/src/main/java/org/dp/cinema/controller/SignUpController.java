package org.dp.cinema.controller;

import org.dp.cinema.service.CustomerRegistrationService;
import org.dp.cinema.service.UserEmailValidationService;
import org.dp.cinema.service.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.util.Objects;

@Controller
public class SignUpController {

    private UserRegistrationService userRegistrationService;
    private UserEmailValidationService emailValidationService;
    private CustomerRegistrationService customerRegistrationService;

    @Autowired
    public void setUserRegistrationService(UserRegistrationService userRegistrationService) {
        this.userRegistrationService = userRegistrationService;
    }

    @Autowired
    public void setEmailValidationService(UserEmailValidationService emailValidationService) {
        this.emailValidationService = emailValidationService;
    }

    @Autowired
    public void setCustomerRegistrationService(CustomerRegistrationService customerRegistrationService) {
        this.customerRegistrationService = customerRegistrationService;
    }

    @PostMapping(value = "registration")
    public String signUpUser(HttpServletResponse response, @RequestParam String firstName, String lastName, String email, String pass) {
        Long newUserId = userRegistrationService.setUserDetails(email, pass);
        Long newCustomerId = customerRegistrationService.setCustomerDetails(firstName, lastName);
        if (Objects.nonNull(newUserId) && Objects.nonNull(newCustomerId)) {
            Cookie cookie = new Cookie("reg", "valid");
            cookie.setMaxAge(15 * 60);
            response.addCookie(cookie);
        } else {
            // ToDo: add handler for newUserId or newCustomerId == null or newUserId != newCustomerId
        }

        System.out.println(firstName + " " + lastName + " " + email);

        return "redirect:/";
    }

    @PostMapping(value = "signUpValidation")
    public ResponseEntity<String> validateEmail(HttpServletRequest request) {
        HttpStatus status = null;
        String body = null;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream()))) {
            String value = URLDecoder.decode(reader.readLine(), "UTF-8");
            boolean isEmailExists = emailValidationService.validateEmail(value);
            if (isEmailExists) {
                status = HttpStatus.INTERNAL_SERVER_ERROR;
                body = "{'msg': 'user exists'}";
            } else {
                status = HttpStatus.OK;
                body = "{'msg': 'ok'}";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(body, status);
    }

}
