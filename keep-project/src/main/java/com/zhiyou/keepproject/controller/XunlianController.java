package com.zhiyou.keepproject.controller;

import com.zhiyou.keepproject.pojo.Xunlian;
import com.zhiyou.keepproject.service.XunlianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("xunlian")
public class XunlianController {
    @Autowired
    private XunlianService xunlianService;
    //给会员训练添加记录
    @RequestMapping("insert")
    public void m1(Xunlian xunlian){
        xunlianService.insertXunlian(xunlian);
    }
}
