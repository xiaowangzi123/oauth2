package com.software.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @date 2020/10/26
 * @description 返回用户信息
 */
@RestController
public class GetUserController {

    @GetMapping("/user")
    public Principal user(Principal user){
        return user;
    }
}
