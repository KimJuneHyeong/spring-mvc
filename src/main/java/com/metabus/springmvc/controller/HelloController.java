package com.metabus.springmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class HelloController {
    @GetMapping("api/hello")
    @ResponseBody
    public String hello() {
        return "Hello World!";
    }
}
