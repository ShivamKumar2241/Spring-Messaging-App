package com.brideelabz.message_app.MessageApp.service;


import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String getGreeting(){
        return "hello world";
    }

}