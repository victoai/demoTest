package com.example.demotest;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JoinController {


    @ResponseBody
    @GetMapping("/joinus")
    public String  mehtod(){
        return "join us ok";
    }
}
