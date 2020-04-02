package com.zhiyou.keepproject.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhiyou.keepproject.pojo.User;
import com.zhiyou.keepproject.pojo.personalTrainerOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface personalTrainerOrderMapper extends BaseMapper<personalTrainerOrder> {
    //通过会员id查询我的私教
    @Select(value = "select * from personal_trainer INNER JOIN personal_trainer_order po on personal_trainer.id= po.personal_trainer_id INNER JOIN `user` on `user`.id=#{id}")
    List<personalTrainerOrder> selectPByUserId(Integer id);
    //通过教练id查询我的学员
    @Select(value = "select * from `user` INNER JOIN personal_trainer_order po on `user`.id=po.user_id INNER JOIN personal_trainer p on po.personal_trainer_id=#{id}")
    List<User> selectAllUByperorderId(Integer id);
}
