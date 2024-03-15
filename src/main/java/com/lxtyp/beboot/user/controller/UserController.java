package com.lxtyp.beboot.user.controller;

import com.lxtyp.beboot.user.entity.UserVO;
import com.lxtyp.beboot.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/id")
    public UserVO getUserById() {
        UserVO userVO = userService.getUserVoById("");
        System.out.println(userVO);
        return userVO;
    }
}
