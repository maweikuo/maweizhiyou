package com.zhiyou.keepproject.controller;

import com.zhiyou.keepproject.entity.ResponseData;
import com.zhiyou.keepproject.pojo.YoukeInto;
import com.zhiyou.keepproject.service.YoukeIntoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("youkeInto")
public class YoukeIntoController {
    @Autowired
    private YoukeIntoService youkeIntoService;
//添加游客进场
    @RequestMapping("insert")
    public  void  m1(YoukeInto youkeInto){
        youkeIntoService.inserYoukeInto(youkeInto);
    }
    //查询游客进场所有信息
    @RequestMapping(value = "select")
    public ResponseData m2(){
       return youkeIntoService.selectYoukeInto();
    }
    //删除游客
    @RequestMapping(value = "delete")
    public void m3(Integer id)
    {
        youkeIntoService.deleteYouke(id);
    }

}
