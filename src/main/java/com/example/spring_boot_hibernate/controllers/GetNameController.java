package com.example.spring_boot_hibernate.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class GetNameController {

    @GetMapping("/name/{name}")
    public String getName(@PathVariable String name){
        return name;
    }

}
