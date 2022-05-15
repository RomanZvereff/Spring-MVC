package org.spring.simple.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ThirdPageController {

    @GetMapping(value = "/third-page")
    public String getThirdPage() {
        return "third-page";
    }

    @PostMapping(value = "/result")
    public String getFormData(HttpServletRequest request, Model model) {
        String userName = request.getParameter("userName");
        model.addAttribute("name", userName);
        return "result-page";
    }
}
