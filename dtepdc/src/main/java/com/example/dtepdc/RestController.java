package com.example.dtepdc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestController {

    @RequestMapping("/")
    public String index() {
        return "Congratulations from RestController.java";
    }

}