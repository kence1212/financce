package com.finance.controller;

import com.finance.entity.Assets;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/getassets")
public class GetAssetsController {

    @RequestMapping("getasset")
    public Assets getAsset(){
        return null;
    }

    @RequestMapping("test")
    public String connectTest(){
        return "Connection Success";
    }
}
