package com.carcaret.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloService {

    public String message() {
        return "Hello World!";
    }
}
