package com.zhiyou.keepproject.controller;

import com.zhiyou.keepproject.pojo.personalTrainer;
import com.zhiyou.keepproject.service.personalTrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("personalTrainer")
public class personalTrainerController {
    @Autowired
    private personalTrainerService personalTrainerService;
    //查询所有教练
    @RequestMapping(value = "select")
    public List<personalTrainer> m1(Integer page){
        return  personalTrainerService.selectAllpersonalTrainer(page);
    }
    //修改教练信息
    @RequestMapping(value = "update")
    public void m2(personalTrainer personalTrainer){
        personalTrainerService.updatepersonalTrainer(personalTrainer);
    }
    //添加教练
    @RequestMapping(value = "insert")
    public void m3(personalTrainer personalTrainer)
    {
        personalTrainerService.insertpersonalTrainer(personalTrainer);
    }
    //删除教练
    @RequestMapping(value = "delete")
    public void m4(Integer id)
    {
        personalTrainerService.deletepersonalTrainer(id);
    }

}
