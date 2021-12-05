package com.dailycodebuffer.Springboot.tutorial.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

        @GetMapping("/")
        public String Helloworld(){
            return "Welcome Thusila bandara. Have a nice day";
        }
}
