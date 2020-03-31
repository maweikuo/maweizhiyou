package com.zhiyou.keepproject.controller;

import com.zhiyou.keepproject.pojo.GymCabInfo;
import com.zhiyou.keepproject.service.GymCabInfoService;
import com.zhiyou.keepproject.service.GymCabinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value ="GymCabInfo")
public class GymCabInfoController {
    @Autowired
    private GymCabInfoService gymCabInfoService;
    //添加租柜
    @RequestMapping(value = "insert")
    public void m1(GymCabInfo gymCabInfo){
        gymCabInfoService.insertGymCabInfo(gymCabInfo);
    }
}
