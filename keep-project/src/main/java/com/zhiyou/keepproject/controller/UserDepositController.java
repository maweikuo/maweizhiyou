package com.zhiyou.keepproject.controller;

import com.zhiyou.keepproject.entity.ResponseData;
import com.zhiyou.keepproject.pojo.UserDeposit;
import com.zhiyou.keepproject.service.UserDepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("userDeposit")
public class UserDepositController {
    @Autowired
    private UserDepositService userDepositService;
    //给会员添加充值记录
    public void m1(UserDeposit userDeposit){
        userDepositService.inserUserDeposit(userDeposit);
    }
    //查询会员充值记录
    public ResponseData m2(){
        return  userDepositService.selectAllUserDeposit();
    }


}
