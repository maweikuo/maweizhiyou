package com.zhiyou.keepproject.service;

import com.zhiyou.keepproject.pojo.User;
import com.zhiyou.keepproject.pojo.personalTrainerOrder;

import java.util.List;

public interface personalTrainerOrderService {
    //会员预约教练(添加)
    void insertpersonalTrainerOrder(personalTrainerOrder personalTrainerOrder);
    //通过教练id查询我的学员
    List<User> selectAllUByperorderId(Integer id);
    // 通过会员id查询我的私教
    List<personalTrainerOrder> selectPByUserId(Integer id);
}
