package com.thymeleaf.project.controller;

import com.thymeleaf.project.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

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

    // handle link expression request
    @GetMapping("/link-expression")
    public String linkExpression(Model model) {
        model.addAttribute("id", 1);
        return "link-expression";
    }

    // handle fragment expression request
    @GetMapping("/fragment-expression")
    public String fragmentExpression() {
        return "fragment-expression";
    }

    @GetMapping("/users")
    public String users(Model model) {
        User admin = new User("Sounak", "sounak@email.com", "Admin", "Male");
        User sherlock = new User("Sherlock", "sherlock@email.com", "Detective", "Male");
        User she = new User("She", "she@gmail.com", "Boss", "Female");

        List<User> userList = new ArrayList<>();
        userList.add(admin);
        userList.add(sherlock);
        userList.add(she);

        model.addAttribute("users", userList);

        return "users";
    }

    @GetMapping("/if-unless")
    public String ifUnless(Model model) {
        User admin = new User("Sounak", "sounak@email.com", "Admin", "Male");
        User sherlock = new User("Sherlock", "sherlock@email.com", "Detective", "Male");
        User she = new User("She", "she@gmail.com", "Boss", "Female");

        List<User> userList = new ArrayList<>();
        userList.add(admin);
        userList.add(sherlock);
        userList.add(she);

        model.addAttribute("users", userList);

        return "if-unless";
    }

    @GetMapping("switch-case")
    public String switchCase(Model model) {
        User user = new User("Ankan", "ankan@google.com", "Admin", "Male");
        model.addAttribute(user);
        return "switch-case";
    }
}
