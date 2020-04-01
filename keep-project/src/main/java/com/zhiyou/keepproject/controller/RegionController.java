package com.zhiyou.keepproject.controller;

import com.zhiyou.keepproject.entity.ResponseData;
import com.zhiyou.keepproject.pojo.Region;
import com.zhiyou.keepproject.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "region")
public class RegionController {
    @Autowired
    private RegionService regionService;
    //前台签到
    @RequestMapping("insert")
    public  void m1(Region region){
        regionService.insertRegion(region);
    }
    //查询所有前台
    @RequestMapping("select")
    public ResponseData m2(){
        return  regionService.selectAllRegion();
    }

}
