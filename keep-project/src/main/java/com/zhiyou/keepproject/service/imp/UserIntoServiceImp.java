package com.zhiyou.keepproject.service.imp;

import com.zhiyou.keepproject.mapper.UserIntoMapper;
import com.zhiyou.keepproject.pojo.UserInto;
import com.zhiyou.keepproject.service.UserIntoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserIntoServiceImp implements UserIntoService {
    @Autowired
    private UserIntoMapper userIntoMapper;

    @Override
    public void updateUserInto(UserInto userInto) {
        Date time1= new java.sql.Date(new java.util.Date().getTime());
        userInto.setGotoTime((java.sql.Date) time1);
        userInto.setIntoStatic("出场");
        userIntoMapper.updateById(userInto);
    }

    @Override
    public void insertUserInto(UserInto userInto) {
        Date date = new Date();
        userInto.setIntoNumber(Integer.valueOf((int) date.getTime()));
        Date time1= new java.sql.Date(new java.util.Date().getTime());
        userInto.setIntoTime((java.sql.Date) time1);
        userInto.setIntoStatic("进场");
        userIntoMapper.insert(userInto);
    }
}
