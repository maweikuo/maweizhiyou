package com.zhiyou.keepproject.service;

import com.zhiyou.keepproject.pojo.GymCabInfo;

import java.util.List;

public interface GymCabInfoService {
    //添加租柜
    void insertGymCabInfo(GymCabInfo gymCabInfo);
    //删除租柜
    void deleteGymCabInfo(Integer id);
    //查询租柜
    List<GymCabInfo> selectAll();
}
