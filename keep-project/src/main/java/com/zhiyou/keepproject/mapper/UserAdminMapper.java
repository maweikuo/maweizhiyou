package com.zhiyou.keepproject.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhiyou.keepproject.pojo.UserAdmin;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserAdminMapper extends BaseMapper<com.zhiyou.keepproject.pojo.UserAdmin> {
    //查询
    @Select(value = "SELECT ua.*,`user`.`name` as user_name  from user_admin ua INNER JOIN `user` ON ua.user_id =`user`.id")
    List<UserAdmin> selectAll();
    //通过会员id删除
    @Delete(value = "delete from user_admin where user_id=#{id}")
    void deleteByUserId(Integer id);
}
