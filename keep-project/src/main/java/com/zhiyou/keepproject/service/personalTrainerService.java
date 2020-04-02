package com.zhiyou.keepproject.service;

import com.zhiyou.keepproject.pojo.personalTrainer;

import java.util.List;

public interface personalTrainerService {
    //查询所有教练
    List<personalTrainer> selectAllpersonalTrainer(Integer page);
    //修改教练信息
    void updatepersonalTrainer(personalTrainer personalTrainer);
    //添加教练
    void insertpersonalTrainer(personalTrainer personalTrainer);
    //删除教练
    void deletepersonalTrainer(Integer id);
}
