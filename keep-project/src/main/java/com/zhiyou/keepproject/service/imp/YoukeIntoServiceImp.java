package com.zhiyou.keepproject.service.imp;

import com.zhiyou.keepproject.entity.ResponseData;
import com.zhiyou.keepproject.mapper.YoukeIntoMapper;
import com.zhiyou.keepproject.pojo.YoukeInto;
import com.zhiyou.keepproject.service.YoukeIntoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class YoukeIntoServiceImp implements YoukeIntoService {

    @Autowired
    private YoukeIntoMapper youkeIntoMapper;
    @Override
    public void inserYoukeInto(YoukeInto youkeInto) {
        Date date = new Date();
        youkeInto.setYoukeNumber(Integer.valueOf((int) date.getTime()));
        Date time1= new java.sql.Date(new java.util.Date().getTime());
        youkeInto.setYoukeTime((java.sql.Date) time1);
        youkeIntoMapper.insert(youkeInto);
    }

    @Override
    public ResponseData selectYoukeInto() {
        ResponseData<Object> a = new ResponseData<>();
        a.setData(youkeIntoMapper.selectList(null));
        return a;
    }

    @Override
    public void deleteYouke(Integer id) {
        youkeIntoMapper.deleteById(id);
    }

    @Override
    public YoukeInto selectById(Integer id) {
        return youkeIntoMapper.selectById(id);
    }

    @Override
    public void updateYouke(YoukeInto youkeInto) {
        youkeIntoMapper.updateById(youkeInto);
    }
}
