package com.zhiyou.keepproject.service.imp;

import com.zhiyou.keepproject.mapper.personalTrainerOrderMapper;
import com.zhiyou.keepproject.pojo.personalTrainerOrder;
import com.zhiyou.keepproject.service.personalTrainerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class personalTrainerOrderServiceImp  implements personalTrainerOrderService {
    @Autowired
    private personalTrainerOrderMapper personalTrainerOrderMapper;
    @Override
    public void insertpersonalTrainerOrder(personalTrainerOrder personalTrainerOrder) {
        personalTrainerOrderMapper.insert(personalTrainerOrder);
    }
}
