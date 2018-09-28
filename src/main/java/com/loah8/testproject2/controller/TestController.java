package com.loah8.testproject2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping({
        "/testSameMapper2"
    })
    public String develop2(){

        return "develop2";
    }
}
