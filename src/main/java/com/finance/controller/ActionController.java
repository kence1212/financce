package com.finance.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration

public class ActionController {
    @RequestMapping(value={"/","/testHtml"})
    public String connectTestHtml(){
        return "main";
    }

    @ResponseBody
    @RequestMapping("test")
    public String connectTest(){
        return "Connection Success";
    }
}
