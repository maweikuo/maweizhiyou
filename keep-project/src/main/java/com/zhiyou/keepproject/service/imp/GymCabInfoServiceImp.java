package com.zhiyou.keepproject.service.imp;

import com.zhiyou.keepproject.mapper.GymCabInfoMapper;
import com.zhiyou.keepproject.pojo.GymCabInfo;
import com.zhiyou.keepproject.service.GymCabInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class GymCabInfoServiceImp implements GymCabInfoService {
    @Autowired
    private GymCabInfoMapper gymCabInfoMapper;
    @Override
    public void insertGymCabInfo(GymCabInfo gymCabInfo) {
        Date date = new Date();
        String format = String.format("18", date);
        gymCabInfo.setCabInfoNumber(Integer.valueOf(format));
        gymCabInfoMapper.insert(gymCabInfo);
    }
}
