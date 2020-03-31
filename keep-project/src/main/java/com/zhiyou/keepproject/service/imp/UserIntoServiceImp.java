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
        userIntoMapper.updateUserInto(userInto);
    }

    @Override
    public void insertUserInto(UserInto userInto) {
        Date date = new Date();
        String format = String.format("18", date);
        userInto.setIntoNumber(Integer.valueOf(format));
        userIntoMapper.insertUserInto(userInto);
    }
}
