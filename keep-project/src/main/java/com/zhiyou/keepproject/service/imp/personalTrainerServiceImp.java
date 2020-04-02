package com.zhiyou.keepproject.service.imp;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhiyou.keepproject.mapper.personalTrainerMapper;
import com.zhiyou.keepproject.pojo.Paike;
import com.zhiyou.keepproject.pojo.personalTrainer;
import com.zhiyou.keepproject.service.personalTrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class personalTrainerServiceImp implements personalTrainerService {
    @Autowired
    private personalTrainerMapper personalTrainerMapper;
    private  final Integer size=4;
    @Override
    public List<personalTrainer> selectAllpersonalTrainer(Integer page) {
        if(page==null || page <=0){
            page=1;
        }
        IPage<personalTrainer> objectPage = new Page<>(page, size);
        objectPage=  personalTrainerMapper.selectPage(objectPage, null);
        List<personalTrainer> records = objectPage.getRecords();
        return records;
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
