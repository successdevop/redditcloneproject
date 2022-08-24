package com.success.reddit.models.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class formController {
    @RequestMapping("/")
    public String getForm(){
        return "home";
    }
}
