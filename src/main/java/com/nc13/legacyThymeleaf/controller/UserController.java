package com.nc13.legacyThymeleaf.controller;

import com.nc13.legacyThymeleaf.model.UserDTO;
import com.nc13.legacyThymeleaf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/")
public class UserController {
    @Autowired
    public UserService userService;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @GetMapping("register")
    public String showRegister(Model model){
        model.addAttribute("userDTO", new UserDTO());
        return "user/register";
    }

    @PostMapping("register")
    public String register(UserDTO userDTO){
        userDTO.setPassword(encoder.encode(userDTO.getPassword()));
        userService.insert(userDTO);
        return "redirect:/";
    }

}
