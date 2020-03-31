package com.zhiyou.keepproject.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhiyou.keepproject.pojo.AdminLogin;
import com.zhiyou.keepproject.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AdminLoginMapper extends BaseMapper<AdminLogin> {
    @Select(value = "select * from admin_login where account =#{account}")
    AdminLogin selectByAccount(String account);
}
