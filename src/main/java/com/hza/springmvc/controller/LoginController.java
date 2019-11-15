package com.hza.springmvc.controller;

import com.hza.springmvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

/**
 * Create by hza
 * 2019-11-14 13:58
 */
@Controller
public class LoginController {

    @GetMapping("/to_login")
    public String toLogin() {
        return "/login" ;
    }

    @PostMapping("/login")
    public String login(Map<String, Object> map, User user) {
        map.put("username", user.getUsername()) ;
        map.put("password", user.getPassword()) ;
        System.out.println(user.toString());
        if (user.getUsername() != null && !user.getUsername().trim().equals("") && user.getPassword() != null) {
            return "success" ;
        }
        return "redirect:/to_login" ;
    }
}
