package com.finance.controller;

import com.finance.entity.Assets;
import com.finance.service.AssetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/getassets")
public class AssetsController {

    @Autowired
    private AssetsService assetsService;

    @RequestMapping("getasset")
    public Assets getAsset(){
        return assetsService.getAssets();
    }

    @RequestMapping("test")
    public String connectTest(){
        return "Connection Success";
    }

    @RequestMapping(value={"/","/testHtml"})
    public String connectTestHtml(){
        return "index";
    }
}
