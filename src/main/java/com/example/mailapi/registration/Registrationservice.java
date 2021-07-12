package com.example.mailapi.registration;

import org.springframework.stereotype.Service;

@Service
public class Registrationservice {

    public String register(RegistrationRequest request){
        return "works";
    }
}
