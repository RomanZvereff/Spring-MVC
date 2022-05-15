package org.spring.simple.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SecondPageController {

    @RequestMapping(value = "/second-page", method = RequestMethod.GET)
    public String getSecondPage(Model model) {
        String captain = "Steve Rogers";
        model.addAttribute("userName", captain);
        return "second-page";
    }

}
