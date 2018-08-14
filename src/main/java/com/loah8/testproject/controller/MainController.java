package com.loah8.testproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping({"/", "/index", "/index/"})
    public String hello() {
        return "hello";
    }
}
