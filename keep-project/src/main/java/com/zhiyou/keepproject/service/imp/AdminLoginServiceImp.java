package com.zhiyou.keepproject.service.imp;

import com.zhiyou.keepproject.entity.ResponseCode;
import com.zhiyou.keepproject.entity.ResponseData;
import com.zhiyou.keepproject.mapper.AdminLoginMapper;
import com.zhiyou.keepproject.mapper.UserMapper;
import com.zhiyou.keepproject.mapper.personalTrainerMapper;
import com.zhiyou.keepproject.pojo.AdminLogin;
import com.zhiyou.keepproject.pojo.User;
import com.zhiyou.keepproject.pojo.personalTrainer;
import com.zhiyou.keepproject.service.AdminLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminLoginServiceImp implements AdminLoginService {
    @Autowired
    private AdminLoginMapper adminLoginMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private personalTrainerMapper  personalTrainerMapper;
    @Override
    public ResponseData<AdminLogin> selectByAccAndPass(String account, String password) {
        ResponseData a = new ResponseData<>();
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
        if(user != null){
            if (user.getPassword().equals(password)){
                a.setCode(ResponseCode.SUCCESS.getCode());
                a.setMsg("user");
                a.setData(adminLoginMapper.selectByAccount(account));
                return a;
            }
        }
        User user1 = userMapper.selectByUserAccount(account);
        if(user1 != null)
        {
            if(user1.getUserPassword().equals(password)){
                a.setCode(ResponseCode.SUCCESS.getCode());
                a.setMsg("user");
                a.setData(userMapper.selectByUserAccount(account));
                return a;
            }
        }
        personalTrainer user2 = personalTrainerMapper.selectByPersonalAccount(account);
        if(user2 != null)
        {
            if(user2.getPersonalTraninerPassword().equals(password)){
                a.setCode(ResponseCode.SUCCESS.getCode());
                a.setMsg("user");
                a.setData(personalTrainerMapper.selectByPersonalAccount(account));
                return a;
            }
        }

        a.setCode(ResponseCode.ERROR_LOGIN.getCode());
        a.setMsg(ResponseCode.ERROR_LOGIN.getMsg());
        return a;
    }

    @Override
    public AdminLogin selectByAccount(String account) {
        return adminLoginMapper.selectByAccount(account);
    }
}
