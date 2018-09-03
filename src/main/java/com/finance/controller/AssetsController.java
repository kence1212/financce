package com.finance.controller;

import com.finance.entity.Assets;
import com.finance.service.AssetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
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
    public String connectTestHtml(ModelMap map)
    {
        map.put("asset",assetsService.getAssets());
        return "assets/assetList";

    }
}
