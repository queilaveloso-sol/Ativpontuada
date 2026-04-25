package com.example.ativpontuada.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @GetMapping("/")
    public String bemVindo(){
        return "Seja Bem vindo!";
    }
    @GetMapping("/dev")
    public  String developer(){
        return "feito por: Queila Leal";
    }
}
