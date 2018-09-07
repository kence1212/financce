package com.finance.controller;

import com.finance.entity.User;
import com.finance.util.StringUtil;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserContorller {
    /**
     * 用户登录请求
     * @param user
     * @return
     */
    public Map<String,Object> login(String imageCode, @Valid User user, BindingResult bindingResult, HttpSession session){
        Map<String,Object> map=new HashMap<String,Object>();
        if(StringUtil.isEmpty(imageCode)){
            map.put("success", false);
            map.put("errorInfo", "请输入验证码！");
            return map;
        }
        return map;
    }
}
