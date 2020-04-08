package com.zhiyou.keepproject.service.imp;

import com.zhiyou.keepproject.mapper.GymCabInfoMapper;
import com.zhiyou.keepproject.mapper.GymCabinetMapper;
import com.zhiyou.keepproject.pojo.GymCabInfo;
import com.zhiyou.keepproject.pojo.gymCabinet;
import com.zhiyou.keepproject.service.GymCabInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

@Service
public class GymCabInfoServiceImp implements GymCabInfoService {
    @Autowired
    private GymCabInfoMapper gymCabInfoMapper;
    @Autowired
    private GymCabinetMapper gymCabinetMapper;
    @Override
    public void insertGymCabInfo(GymCabInfo gymCabInfo) {
        if (gymCabInfo.getCabCabinetId() == null){
            System.out.println("添加失败");
            return;
        }
        gymCabinet gymCabinet = new gymCabinet();
        gymCabinet.setId(gymCabInfo.getCabCabinetId());
        gymCabinet.setCabStatus(2);
        gymCabinetMapper.updateById(gymCabinet);
        Date date = new Date();
        gymCabInfo.setCabInfoNumber(Integer.valueOf((int) date.getTime()));
        Date time1= new java.sql.Date(new java.util.Date().getTime());
        gymCabInfo.setCabInfoCreateTime((java.sql.Date) time1);
        gymCabInfo.setCabInfoUpdateTime((java.sql.Date) time1);
        Integer de = gymCabInfo.getCabInfoDuration();
        if(de == 12){
            gymCabInfo.setCabInfoPrice(398);
        }
        if(de == 6){
            gymCabInfo.setCabInfoPrice(288);
        }
        if(de == 3){
            gymCabInfo.setCabInfoPrice(138);
        }
        if(de == 1){
            gymCabInfo.setCabInfoPrice(58);
        }
        gymCabInfo.setCabInfoStatus(1);
        gymCabInfoMapper.insert(gymCabInfo);
    }

    @Override
    public void deleteGymCabInfo(Integer id) {
        GymCabInfo info = gymCabInfoMapper.selectById(id);
        gymCabinet gymCabinet = new gymCabinet();
        gymCabinet.setId(info.getCabCabinetId());
        gymCabinet.setCabStatus(1);
        gymCabinetMapper.updateById(gymCabinet);
        gymCabInfoMapper.deleteById(id);
    }

    @Override
    public List<GymCabInfo> selectAll() {
        return gymCabInfoMapper.selectList(null);
    }

    @Override
    public void deleteByNetId(Integer id) {
        gymCabInfoMapper.deleteByNetId(id);
    }
}
