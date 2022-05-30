package org.dp.cinema.controller;

import org.dp.cinema.model.CustomerModel;
import org.dp.cinema.service.UserEmailValidationService;
import org.dp.cinema.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLDecoder;

@Controller
public class SignInController {

    private UserLoginService userLoginService;
    private UserEmailValidationService emailValidationService;

    @Autowired
    public void setUserLoginService(UserLoginService userLoginService) {
        this.userLoginService = userLoginService;
    }

    @Autowired
    public void setEmailValidationService(UserEmailValidationService emailValidationService) {
        this.emailValidationService = emailValidationService;
    }

    @PostMapping(value = "login")
    public String signInUser(@RequestParam String email, String pass) {
        CustomerModel customerModel = null;
        boolean isValid = userLoginService.checkUserLoginProcess(email, pass);
        if (isValid) {
            System.out.println("Cool!!!");
        }


        return "index";
    }

    @PostMapping(value = "loginValidation")
    public ResponseEntity<String> validateEmail(HttpServletRequest request) {
        HttpStatus status = null;
        String body = null;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream()))) {
            String value = URLDecoder.decode(reader.readLine(), "UTF-8");
            boolean isEmailExists = emailValidationService.validateEmail(value);
            if (isEmailExists) {
                status = HttpStatus.OK;
                body = "{'msg' : 'ok'}";
            } else {
                status = HttpStatus.NOT_FOUND;
                body = "{'msg': 'user doesn't exist'}";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(body, status);
    }

}
