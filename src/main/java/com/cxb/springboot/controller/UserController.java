package com.cxb.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
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
        return "hello world !" + port;
    }

}
