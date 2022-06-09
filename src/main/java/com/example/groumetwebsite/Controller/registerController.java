package com.example.groumetwebsite.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class registerController {
    
    @RequestMapping("/register")
    public String register(){
        return "register";
    }
}
