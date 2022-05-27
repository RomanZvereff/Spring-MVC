package org.dp.cinema.controller;

import org.dp.cinema.service.UserEmailValidationService;
import org.dp.cinema.service.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLDecoder;

@Controller
public class SignUpController {

    private UserRegistrationService userRegistrationService;
    private UserEmailValidationService emailValidationService;

    @Autowired
    public void setUserRegistrationService(UserRegistrationService userRegistrationService) {
        this.userRegistrationService = userRegistrationService;
    }

    @Autowired
    public void setEmailValidationService(UserEmailValidationService emailValidationService) {
        this.emailValidationService = emailValidationService;
    }

    @PostMapping(value = "registration")
    public String signUpUser(@RequestParam String firstName, String lastName, String email, String pass) {
        userRegistrationService.setUserDetails(firstName, lastName, email, pass);

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(email);
        System.out.println(pass);

        return "redirect:/";
    }

    @PostMapping(value = "emailValidation")
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
