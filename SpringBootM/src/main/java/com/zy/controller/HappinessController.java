package com.zy.controller;

import com.zy.entity.Happiness;
import com.zy.service.HappinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class HappinessController {
    @Autowired
    private HappinessService happinessService;

    @RequestMapping("/login")
    public String index() {
        return "/login";
    }

    @RequestMapping("/query")
    public String testQuery(){
//        happinessService.selectService("西安");
        return "/homePage";
    }

    @RequestMapping("/insert")
    @ResponseBody
    public Happiness testInsert(){
        happinessService.insertService();
        return happinessService.selectService("西安");
    }
}