package com.software.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date 2020/10/26
 * @description
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/get")
    public Object get() {
        return "获取成功";
    }
}
