package com.xiangwen.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class MainController {
    @RequestMapping("/getName")
    public String getMainInfo(){
        return "666" ;
    }
}
