package com.example.groumetwebsite.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class RegisterController {
    /**
     * 登録画面の表示
     * @return
     */
    @RequestMapping("/register")
    public String register(){
        return "register";
    }
}
