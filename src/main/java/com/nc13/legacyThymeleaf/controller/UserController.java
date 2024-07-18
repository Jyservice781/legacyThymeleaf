package com.nc13.legacyThymeleaf.controller;

import com.nc13.legacyThymeleaf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/")
public class UserController {
    @Autowired
    public UserService userService;


}
