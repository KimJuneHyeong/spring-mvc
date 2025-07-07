package com.metabus.springmvc.controller;

import domain.Star;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DataResponseController {
    @GetMapping("response/json/string")
    @ResponseBody
    public String helloJson(){
        return "{\"name\" : \"Meta\",\"age\" : 95}";
    }

    @GetMapping("response/json/instance")
    @ResponseBody
    public Star helloInstanceJson(){
        return new Star("meta", 88);

    }
}
