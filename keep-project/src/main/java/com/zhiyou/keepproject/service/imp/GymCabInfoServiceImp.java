package com.zhiyou.keepproject.service.imp;

import com.zhiyou.keepproject.mapper.GymCabInfoMapper;
import com.zhiyou.keepproject.pojo.GymCabInfo;
import com.zhiyou.keepproject.service.GymCabInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

@Service
public class GymCabInfoServiceImp implements GymCabInfoService {
    @Autowired
    private GymCabInfoMapper gymCabInfoMapper;
    @Override
    public void insertGymCabInfo(GymCabInfo gymCabInfo) {
        Date date = new Date();
        gymCabInfo.setCabInfoNumber(Integer.valueOf((int) date.getTime()));
        Date time1= new java.sql.Date(new java.util.Date().getTime());
        gymCabInfo.setCabInfoCreateTime((java.sql.Date) time1);
        gymCabInfo.setCabInfoUpdateTime((java.sql.Date) time1);
        gymCabInfoMapper.insert(gymCabInfo);
    }
}
