package com.Blaza_Bank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class IndexController {
    @GetMapping("/")
    public ModelAndView getIndex(){
//        System.out.println("In index page");
        ModelAndView getIndex = new ModelAndView("index");
        getIndex.addObject("PageTitle", "home");
        return getIndex;
    }
}
