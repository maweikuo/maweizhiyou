package com.zhiyou.keepproject.service;

import com.zhiyou.keepproject.entity.ResponseData;
import com.zhiyou.keepproject.pojo.AdminLogin;

public interface AdminLoginService {
    //超级管理员账号密码登陆
    ResponseData selectByAccAndPass(String account, String password);
    //通过账号查询对象
    AdminLogin selectByAccount(String account);
}
