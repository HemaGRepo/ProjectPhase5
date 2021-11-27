package com.example.test;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class User {

    @RequestMapping(value="/users")
    public String getAll() {
    	return "Success";
    }
}


