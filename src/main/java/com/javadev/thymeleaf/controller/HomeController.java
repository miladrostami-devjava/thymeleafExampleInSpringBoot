package com.javadev.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1")
public class HomeController {

    @GetMapping("/home")
    public String index(){
        return "home";
    }
    @GetMapping("/bootstrap")
    public String getBootstrap(){
        return "bootstrap";
    }


}
