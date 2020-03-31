package com.zhiyou.keepproject.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhiyou.keepproject.pojo.UserInto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserIntoMapper extends BaseMapper<UserInto> {
    @Update(value = "update user_into set goto_time=#(now()) where id = #(id)_")
    public void updateUserInto(UserInto userInto);
    @Insert(value = "insert into user_into values(null,#{user_id},#{into_number},now(),null,#{into_static})")
    void insertUserInto(UserInto userInto);
}
