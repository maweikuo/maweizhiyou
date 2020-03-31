package com.zhiyou.keepproject.service.imp;

import com.zhiyou.keepproject.entity.ResponseCode;
import com.zhiyou.keepproject.entity.ResponseData;
import com.zhiyou.keepproject.mapper.AdminLoginMapper;
import com.zhiyou.keepproject.pojo.AdminLogin;
import com.zhiyou.keepproject.service.AdminLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminLoginServiceImp implements AdminLoginService {
    @Autowired
    private AdminLoginMapper adminLoginMapper;

    @Override
    public ResponseData<AdminLogin> selectByAccAndPass(String account, String password) {
        ResponseData<AdminLogin> a = new ResponseData<>();
        if(account.isEmpty()){
            a.setCode(ResponseCode.ERROR_NULL.getCode());
            a.setMsg(ResponseCode.ERROR_NULL.getMsg());
            return a;
        }
        if(password.isEmpty()){
            a.setCode(ResponseCode.ERROR_NULL.getCode());
            a.setMsg(ResponseCode.ERROR_NULL.getMsg());
            return a;
        }
        AdminLogin user = adminLoginMapper.selectByAccount(account);
        if(user == null){
            a.setCode(ResponseCode.ERROR_LOGIN.getCode());
            a.setMsg(ResponseCode.ERROR_LOGIN.getMsg());
            return a;
        }
        if (!user.getPassword().equals(password)){
            a.setCode(ResponseCode.ERROR_LOGIN.getCode());
            a.setMsg(ResponseCode.ERROR_LOGIN.getMsg());
            return a;
        }
        a.setCode(ResponseCode.SUCCESS.getCode());
        a.setMsg(ResponseCode.SUCCESS.getMsg());
        a.setData(adminLoginMapper.selectByAccount(account));
        return a;
    }

    @Override
    public AdminLogin selectByAccount(String account) {
        return adminLoginMapper.selectByAccount(account);
    }
}
