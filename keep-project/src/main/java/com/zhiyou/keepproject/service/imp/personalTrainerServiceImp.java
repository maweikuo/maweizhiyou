package com.zhiyou.keepproject.service.imp;

import com.zhiyou.keepproject.mapper.personalTrainerMapper;
import com.zhiyou.keepproject.pojo.personalTrainer;
import com.zhiyou.keepproject.service.personalTrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class personalTrainerServiceImp implements personalTrainerService {
    @Autowired
    private personalTrainerMapper personalTrainerMapper;
    @Override
    public List<personalTrainer> selectAllpersonalTrainer() {
        return personalTrainerMapper.selectList(null);
    }

    @Override
    public void updatepersonalTrainer(personalTrainer personalTrainer) {
        personalTrainerMapper.updateById(personalTrainer);
    }

    @Override
    public void insertpersonalTrainer(personalTrainer personalTrainer) {
        personalTrainerMapper.insert(personalTrainer);
    }

    @Override
    public void deletepersonalTrainer(Integer id) {
        personalTrainerMapper.deleteById(id);
    }
}
