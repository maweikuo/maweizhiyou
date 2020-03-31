package com.zhiyou.keepproject.service;

import com.zhiyou.keepproject.entity.ResponseData;
import com.zhiyou.keepproject.pojo.gymCabinet;

import java.util.List;

public interface GymCabinetService  {
    //查询所有柜子的信息
    List<gymCabinet> selectAll();
}
