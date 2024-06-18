package com.example.FirstApp.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProductController2 {
    @GetMapping("/product2")
    String product2(){
        return "product 2 din ProductController2";
    }

}
