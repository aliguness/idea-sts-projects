package com.aligunes.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// http://localhost:8080/api/v1
// http://localhost:8080/surum1
@RestController
@RequestMapping({"/api/v1", "/surum1"})
public class HelloController {

    // http://localhost:8080/api/v1/hello
    // http://localhost:8080/surum1/hello
    @GetMapping("/hello")
    public String hello(){
        return "hello Docker";
    }

    @GetMapping("/metod2")
    public String metod2(){
        return "Metod 2-Ali";
    }

    @GetMapping("/metod3")
    public String meto3(){
        return "Metod 3- Ali Güneş";
    }

}