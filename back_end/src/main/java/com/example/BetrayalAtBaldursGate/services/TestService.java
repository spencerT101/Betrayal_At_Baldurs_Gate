package com.example.BetrayalAtBaldursGate.services;

import com.example.BetrayalAtBaldursGate.repositories.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TestService {

    @Autowired
    TestRepository testRepository;

    public String helloSpencer(String name) {
        return "Testy " + name;
    }
}
