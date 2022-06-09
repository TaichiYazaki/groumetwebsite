package com.example.groumetwebsite.Form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class RegisterForm {
    /**名前*/
    @NotBlank(message = "名前は必須です")
    private String name;
    /**メールアドレス */
    @Email(message = "Eメールの形式が不正です")
    @Size(min=1,max=100,message = "Eメールは1文字以上100文字以内で入力してください")
    private String email;
    /**パスワード */
    @Size(min=1,max=100,message = "パスワードは1文字以上100文字以内で入力してください")
    private String password;
}
