package com.zhiyou.keepproject.controller;

import com.zhiyou.keepproject.entity.ResponseData;
import com.zhiyou.keepproject.pojo.gymCabinet;
import com.zhiyou.keepproject.service.GymCabinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "gymCabinet")
public class GymCabinetController {
    @Autowired
    private GymCabinetService gymCabinetService;

    @GetMapping(value = "gyms")
    public List<gymCabinet> m1(){
        return gymCabinetService.selectAll();
    }
}