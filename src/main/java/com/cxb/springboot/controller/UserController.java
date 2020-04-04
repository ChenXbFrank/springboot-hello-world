package com.cxb.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * descripiton:
 *
 * @author: kinson(2219945910 @ qq.com)
 * @date: 2019/1/31
 * @time: 21:58
 * @modifier:
 * @since:
 */
@RestController
public class UserController {

    @GetMapping(value = "hello")
    public String hello() {
        return "hello world docker!";
    }

}
