package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.model.User;
import com.spring.service.UserService;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public String userRegistration(@ModelAttribute User user, Model model) {
        System.out.println(user.toString());
        System.out.println(user.getFname());
        System.out.println(user.getLname());
        System.out.println(user.getEmail());
        System.out.println(user.getPhoneno());
        System.out.println(user.getGender());

        // Save user to database
        userService.saveUser(user);

        model.addAttribute("firstname", user.getFname());
        model.addAttribute("lastname", user.getLname());
        model.addAttribute("email", user.getEmail());
        model.addAttribute("phoneno", user.getPhoneno());
        model.addAttribute("Gender", user.getGender());
        return "welcome";
    }
}
