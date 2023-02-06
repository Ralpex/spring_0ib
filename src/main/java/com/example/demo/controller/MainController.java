package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;

@RestController
public class MainController {

    @GetMapping("/")
    public String hello() {Date date = new Date(); return "Чернышов Дмитрий Андреевич " + date.toString();
    }

}
