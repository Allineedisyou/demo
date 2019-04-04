package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    /**
     * 输出hello world
     * @param args
     */
    @RequestMapping("/hello")
    public static void main(String[] args){
        System.out.println("Hello World");
    }

}
