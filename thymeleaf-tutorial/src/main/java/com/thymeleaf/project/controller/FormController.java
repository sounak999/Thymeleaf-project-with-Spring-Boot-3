package com.thymeleaf.project.controller;

import com.thymeleaf.project.model.UserForm;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class FormController {

    // handle method to handle user registration page request
    @GetMapping("/register")
    public String userRegistrationPage(Model model) {
        UserForm userForm = new UserForm();
        model.addAttribute("userForm", userForm);

        List<String> listProfession = Arrays.asList("Developer", "Tester", "Architect");
        model.addAttribute("listProfession", listProfession);
        return "register-form";
    }
}
