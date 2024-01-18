package com.example.appextast.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class WindowController {

    @GetMapping("/h")
    public String helloPage(){
        return "first/hallo";
    }

    @GetMapping("/b")
    public String byePage(){
        return "first/goodbye";
    }

}
