package com.zhiyou.keepproject.service.imp;

import com.zhiyou.keepproject.mapper.UserAdminMapper;
import com.zhiyou.keepproject.mapper.UserMapper;
import com.zhiyou.keepproject.pojo.User;
import com.zhiyou.keepproject.pojo.UserAdmin;
import com.zhiyou.keepproject.service.UserAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class UserAdminServiceImp implements UserAdminService {

    @Autowired
    private UserAdminMapper userAdminMapper;
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<UserAdmin> selectAll() {
        return userAdminMapper.selectAll();
    }

    @Override
    public void deleteById(Integer id) {
        UserAdmin userAdmin = userAdminMapper.selectById(id);
        userMapper.deleteById(userAdmin.getUserId());
        userAdminMapper.deleteById(id);
    }

    @Override
    public void insertUserAdmin(UserAdmin userAdmin) {
        Date date = new Date();
        userAdmin.setUserAdminNumber(Integer.valueOf((int) date.getTime()));
            userAdminMapper.insert(userAdmin);
    }

    @Override
    public void deleteByUserId(Integer id) {
        userAdminMapper.deleteByUserId(id);
    }
}
