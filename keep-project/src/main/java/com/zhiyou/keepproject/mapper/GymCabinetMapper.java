package com.zhiyou.keepproject.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhiyou.keepproject.pojo.gymCabinet;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface GymCabinetMapper extends BaseMapper<gymCabinet> {
    //查询最大的编号
    @Select(value = "select max(cab_number) from  gym_cabinet ")
    Integer selectBianHao();
}
