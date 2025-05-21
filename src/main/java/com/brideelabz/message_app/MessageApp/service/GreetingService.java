package com.brideelabz.message_app.MessageApp.service;


import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String getGreeting(){
        return "hello world";
    }

    // greeting message based on firstname and user
     public String getGreeting(String firstname, String lastname) {

        if (firstname != null && lastname != null) {
            return "Hello " + firstname + " " + lastname;
        } else if (firstname != null) {
            return "Hello " + firstname;
        } else if (lastname != null) {
            return "Hello " + lastname;
        } else {
            return "hello world";
        }

    }
}