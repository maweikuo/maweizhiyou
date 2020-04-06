package com.zhiyou.keepproject.service;

import com.zhiyou.keepproject.pojo.UserAdmin;

import java.util.List;

public interface UserAdminService {
    //查询所有会员卡信息
    List<UserAdmin> selectAll();
    //删除会员卡
    void deleteById(Integer id);
    //添加会员卡
    void insertUserAdmin(UserAdmin userAdmin);
}
