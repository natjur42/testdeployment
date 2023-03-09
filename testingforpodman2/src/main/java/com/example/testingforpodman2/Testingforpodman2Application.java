package com.example.testingforpodman2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Testingforpodman2Application {

    @GetMapping("/")
    public String helloWorld(){
        return "hello world!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Testingforpodman2Application.class, args);
    }

}
