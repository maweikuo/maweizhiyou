package com.zhiyou.keepproject.controller;

import com.zhiyou.keepproject.entity.ResponseCode;
import com.zhiyou.keepproject.entity.ResponseData;
import com.zhiyou.keepproject.pojo.AdminLogin;
import com.zhiyou.keepproject.service.AdminLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "adminLogin")
public class AdminLoginController {
    @Autowired
    private AdminLoginService adminLoginService;
    //健身管理系统登陆
    @RequestMapping(value = "login")
    public ResponseData m1(String account,String password){
       return adminLoginService.selectByAccAndPass(account, password);
    }
}
