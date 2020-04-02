package com.zhiyou.keepproject.service.imp;

import com.zhiyou.keepproject.mapper.UserMapper;
import com.zhiyou.keepproject.pojo.User;
import com.zhiyou.keepproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void insertUser(User user) {
        Date time1= new java.sql.Date(new java.util.Date().getTime());
        user.setTime((java.sql.Date) time1);
        userMapper.insert(user);
    }

    @Override
    public void deleteUser(Integer id) {
        userMapper.deleteById(id);
    }

    @Override
    public void updateUer(User user) {
    userMapper.updateById(user);
    }

    @Override
    public List<User> selectAllUser() {
        return userMapper.selectList(null);
    }
}
