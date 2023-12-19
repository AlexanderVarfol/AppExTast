package com.example.appextast.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FirstController {

    @GetMapping("/h")
    public String helloPage(){
        return "first/hallo";
    }

    @GetMapping("/b")
    public String byePage(){
        return "first/goodbye";
    }


}
