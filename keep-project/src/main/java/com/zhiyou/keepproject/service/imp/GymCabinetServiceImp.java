package com.zhiyou.keepproject.service.imp;

import com.zhiyou.keepproject.entity.ResponseCode;
import com.zhiyou.keepproject.entity.ResponseData;
import com.zhiyou.keepproject.mapper.GymCabinetMapper;
import com.zhiyou.keepproject.pojo.gymCabinet;
import com.zhiyou.keepproject.service.GymCabinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GymCabinetServiceImp implements GymCabinetService {
    @Autowired
    private GymCabinetMapper gymCabinetMapper;
    @Override
    public List<gymCabinet> selectAll() {

        return gymCabinetMapper.selectList(null);
    }

    @Override
    public void inserGymCabinet(gymCabinet gymCabinet) {
        Integer integer = gymCabinetMapper.selectBianHao();
        gymCabinet.setCabNumber(integer+1);
        gymCabinetMapper.insert(gymCabinet);
    }

    @Override
    public void deleteGymCabinet(Integer id) {
        gymCabinetMapper.deleteById(id);
    }
}
