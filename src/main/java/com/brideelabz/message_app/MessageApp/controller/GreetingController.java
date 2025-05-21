package com.brideelabz.message_app.MessageApp.controller;


import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    Map<String, String> response = new HashMap<>();

    @GetMapping
    public Map<String, String> getGreet() {
        response.put("Message ", "Good morning get");
        return response;
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