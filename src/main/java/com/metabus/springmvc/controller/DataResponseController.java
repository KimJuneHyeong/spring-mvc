package com.metabus.springmvc.controller;

import domain.Star;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataResponseController {
    @GetMapping("response/json/string")
    public String helloJson(){
        return "{\"name\" : \"Meta\",\"age\" : 95}";
    }

    @GetMapping("response/json/instance")
    public Star helloInstanceJson(){
        return new Star("meta", 232);
    }
}
