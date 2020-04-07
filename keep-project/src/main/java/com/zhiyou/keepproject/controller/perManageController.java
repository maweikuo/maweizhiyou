package com.zhiyou.keepproject.controller;

import com.zhiyou.keepproject.pojo.perManage;
import com.zhiyou.keepproject.service.perManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "perManage")
public class perManageController {
    @Autowired
    private perManageService perManageService;
    //todo 查询假数据
    @RequestMapping(value = "selectAll")
    public List<perManage> m1(){
        return perManageService.selectAll();
    }
}
