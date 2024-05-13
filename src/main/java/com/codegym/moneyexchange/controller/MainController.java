package com.codegym.moneyexchange.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @GetMapping("/home")
    public String showResult(){
    return "home";
    }
    @GetMapping("/calculate")
    public ModelAndView calculate(@RequestParam("vnd") String vnd){
        double result = 0;
        double num1 = Double.parseDouble(vnd);
        result = num1 * 25000;
        return new ModelAndView("result", "result", result);
    }



}
