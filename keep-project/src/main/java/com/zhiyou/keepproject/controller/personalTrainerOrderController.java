package com.zhiyou.keepproject.controller;

import com.zhiyou.keepproject.pojo.personalTrainerOrder;
import com.zhiyou.keepproject.service.personalTrainerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("personalTrainerOrder")
public class personalTrainerOrderController {
    @Autowired
    private personalTrainerOrderService personalTrainerOrderService;
    //会员预约教练
    public void m1(personalTrainerOrder personalTrainerOrder){
        personalTrainerOrderService.insertpersonalTrainerOrder(personalTrainerOrder);
    }

}
