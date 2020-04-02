package com.zhiyou.keepproject.service.imp;

import com.zhiyou.keepproject.mapper.personalTrainerOrderMapper;
import com.zhiyou.keepproject.pojo.User;
import com.zhiyou.keepproject.pojo.personalTrainerOrder;
import com.zhiyou.keepproject.service.personalTrainerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class personalTrainerOrderServiceImp  implements personalTrainerOrderService {
    @Autowired
    private personalTrainerOrderMapper personalTrainerOrderMapper;
    @Override
    public void insertpersonalTrainerOrder(personalTrainerOrder personalTrainerOrder) {
        personalTrainerOrderMapper.insert(personalTrainerOrder);
    }

    @Override
    public List<User> selectAllUByperorderId(Integer id) {
        return personalTrainerOrderMapper.selectAllUByperorderId(id);
    }

    @Override
    public List<personalTrainerOrder> selectPByUserId(Integer id) {
        return personalTrainerOrderMapper.selectPByUserId(id);
    }
}
