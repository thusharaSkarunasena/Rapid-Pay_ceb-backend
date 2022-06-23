package com.rapidpay.ceb.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/")
public class CebController {
    
    @GetMapping("/")
    public String get() {
        try {
            return "Rapid Pay - CEB Backend Up & Running...";
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

}
