package com.cxb.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * descripiton:
 * helloworld
 * 小石潭记
 */
@RestController
public class UserController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "hello")
    public String hello() {
        return "hello world docker!" + port;
    }

}
