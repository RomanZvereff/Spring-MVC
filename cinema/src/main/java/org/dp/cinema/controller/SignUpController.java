package org.dp.cinema.controller;

import org.dp.cinema.service.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignUpController {

    UserRegistrationService userRegistrationService;

    @Autowired
    public void setUserRegistrationService(UserRegistrationService userRegistrationService) {
        this.userRegistrationService = userRegistrationService;
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

}
