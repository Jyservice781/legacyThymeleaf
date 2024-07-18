package com.nc13.legacyThymeleaf.controller;

import com.nc13.legacyThymeleaf.model.UserDTO;
import com.nc13.legacyThymeleaf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/")
public class UserController {
    @Autowired
    public UserService userService;

    @GetMapping("register")
    private String showRegister(){
        return "register";
    }

    @PostMapping("register")
    private void register(UserDTO userDTO){
        userService.insert(userDTO);
    }


}
