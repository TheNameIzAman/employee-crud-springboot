package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/kuchbhi")
    public String foo() {
        return "I Am From Foo";
    }

    // square of a number
    @GetMapping("/sqr")
    public String getMethodName(@RequestParam int num) {
        return "Num: " + num * num;
    }

    // addition of two numbers
    @GetMapping("/mycalc")
    public String add() {
        int x=5;
        int y=6;
        return x + " + " + y + " = " + (x + y);

    }
    
}
