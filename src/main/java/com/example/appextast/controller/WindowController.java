package com.example.appextast.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

//@RequiredArgsConstructor
//@RestController
@Controller
@RequestMapping({ "/first"})
public class WindowController {

    @RequestMapping({"/home"})
    public String home() {
        return "index-home";
    }

    @RequestMapping({"/{id}"})
    public String getCard(@PathVariable String id) {
        return "index-card";
    }

    @RequestMapping({"/g"})
    public String getUUID() {
        return "index-uuid";

    }





}
