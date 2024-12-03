package com.example.demotest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CartController {



    @ResponseBody
    @GetMapping("/cart")
    public  String cart(){

        return  "cart 완성";
    }
}
