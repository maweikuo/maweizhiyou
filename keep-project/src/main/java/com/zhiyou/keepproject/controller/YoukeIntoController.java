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
        System.out.println(youkeInto);
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
    //通过id查询游客
    @RequestMapping("selectById")
    public YoukeInto m4(Integer id){
        return  youkeIntoService.selectById(id);
    }
    //修改游客
    @RequestMapping("update")
    public void m5(YoukeInto youkeInto){
        youkeIntoService.updateYouke(youkeInto);
    }
}
