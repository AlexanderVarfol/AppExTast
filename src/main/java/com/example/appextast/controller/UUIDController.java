package com.example.appextast.controller;
import nonapi.io.github.classgraph.json.JSONUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;
import java.util.UUID;


@Controller
public class UUIDController {

    @GetMapping("/generateUUID")
    @ResponseBody
    public String generateUUID() {


        UUID randomUUID = UUID.randomUUID();
        String uuidString = randomUUID.toString();

        return uuidString;
    }

}