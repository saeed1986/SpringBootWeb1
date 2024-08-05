package com.example.SpringBootWeb1;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    public String home() {
        System.out.println("Home Controller Method called");
        return "index";
    }
}
