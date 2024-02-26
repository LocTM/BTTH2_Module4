package org.example.abc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
//dinh nghia request
    @GetMapping("/hello")
    public String index(){
        return "index";
    }
}
