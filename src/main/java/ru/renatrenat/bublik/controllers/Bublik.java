package ru.renatrenat.bublik.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Bublik {

    @GetMapping("/")
    public String index(){
        return "index";
    }

}
