package com.finance.controller;

import com.finance.entity.User;
import com.finance.util.StringUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
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
        //验证码非空
        if(StringUtil.isEmpty(imageCode)){
            map.put("success", false);
            map.put("errorInfo", "请输入验证码！");
            return map;
        }
        //验证码正确
        if(!session.getAttribute("checkcode").equals(imageCode)){
            map.put("success", false);
            map.put("errorInfo", "验证码输入错误！");
            return map;
        }
        //其他判断
        if(bindingResult.hasErrors()){
            map.put("success", false);
            map.put("errorInfo", bindingResult.getFieldError().getDefaultMessage());
            return map;
        }
        //后续可以考虑写在config里面
        Subject subject=SecurityUtils.getSubject();
        return map;
    }
}
