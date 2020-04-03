package com.zhiyou.keepproject.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhiyou.keepproject.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    //会员通过账号登陆
    @Select(value = "select * from user where user_account=#{userAccount}")
    User selectByUserAccount(String userAccount);

}
