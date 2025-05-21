package com.brideelabz.message_app.MessageApp.controller;

import com.brideelabz.message_app.MessageApp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    Map<String, String> response = new HashMap<>();

    @Autowired
    private GreetingService greetingService;

    // UC2 send response using service layer greeting service
    @GetMapping
    public Map<String, String> getGreet() {

        String message = greetingService.getGreeting();

        return Map.of("Message",message);
    }
    @PostMapping
    public Map<String, String> postGreet() {
        response.put("Message ", "Good morning post");
        return response;
    }

    @PutMapping
    public Map<String, String> putGreet() {
        response.put("Message ", "Good morning put");
        return response;
    }

    @DeleteMapping
    public Map<String, String> deleteGreet() {
        response.put("Message ", "Good morning delete");
        return response;
    }


}