package com.zhiyou.keepproject.controller;

import com.zhiyou.keepproject.pojo.User;
import com.zhiyou.keepproject.pojo.personalTrainerOrder;
import com.zhiyou.keepproject.service.personalTrainerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("personalTrainerOrder")
public class personalTrainerOrderController {
    @Autowired
    private personalTrainerOrderService personalTrainerOrderService;
    //会员预约教练
    public void m1(personalTrainerOrder personalTrainerOrder){
        personalTrainerOrderService.insertpersonalTrainerOrder(personalTrainerOrder);
    }
    //通过会员id查询我的私教
    @RequestMapping("selectByUserId")
    public List<personalTrainerOrder> m2(Integer id){
        return  personalTrainerOrderService.selectPByUserId(id);
    }
    //通过教练id查询我的学员
    @RequestMapping(value = "selectByPerOrderId")
    public List<User> m3(Integer id){
        return  personalTrainerOrderService.selectAllUByperorderId(id);
    }
}
