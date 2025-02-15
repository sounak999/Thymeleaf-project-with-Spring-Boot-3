package com.thymeleaf.project.controller;

import com.thymeleaf.project.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    // handler method to handle variable expression request
    @GetMapping("/variable-expression")
    public String variableExpression(Model model) {
        User user = new User("Sounak", "sounak.saha@email.com", "SDE", "male");
        model.addAttribute("user", user);
        return "variable-expression";
    }

    // handle selection expression request
    @GetMapping("/selection-expression")
    public String selectionExpression(Model model) {
        User user = new User("Ankan", "ankan.saha@email.com", "MBA", "male");
        model.addAttribute("user", user);
        return "selection-expression";
    }

    // handle message expression request
    @GetMapping("/message-expression")
    public String messageExpression() {
        return "message-expression";
    }
}
