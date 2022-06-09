package com.example.groumetwebsite.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.groumetwebsite.Form.RegisterForm;

@Controller
@RequestMapping("/")
public class RegisterController {

    /**
     * Formクラスを利用できるようにするための設定
     * 
     */
    @ModelAttribute
    public RegisterForm form(){
        return new RegisterForm();
    }


    /**
     * 登録画面の表示
     * @return
     */
    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    /**
     * ユーザーの登録
     */
    @RequestMapping("/insert")
    public String insert(
        @Validated RegisterForm form
        ,BindingResult result
        ){
            System.out.println(form);
            return "redirect:/login";
        }
}
