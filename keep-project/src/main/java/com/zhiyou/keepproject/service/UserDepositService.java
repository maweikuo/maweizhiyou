package com.zhiyou.keepproject.service;

import com.zhiyou.keepproject.entity.ResponseData;
import com.zhiyou.keepproject.pojo.UserDeposit;

public interface UserDepositService {
    //添加会员充值记录
    void inserUserDeposit(UserDeposit userDeposit);
    //查询所有会员充值记录
    ResponseData selectAllUserDeposit();
}
