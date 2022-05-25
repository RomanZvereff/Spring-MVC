package org.dp.cinema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignUpController {

    @PostMapping(value = "signUp")
    public String signUpUser(@RequestParam String firstName) {

        System.out.println(firstName);

        return "redirect:/";

    }

}
