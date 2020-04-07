package com.zhiyou.keepproject.service.imp;

import com.zhiyou.keepproject.mapper.XunlianMapper;
import com.zhiyou.keepproject.pojo.Xunlian;
import com.zhiyou.keepproject.service.XunlianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class XunlianServiceImp implements XunlianService {
    @Autowired
    private XunlianMapper xunlianMapper;
    @Override
    public void insertXunlian(Xunlian xunlian) {
        Date date = new Date();
        xunlian.setXunlianNumber(Integer.valueOf((int) date.getTime()));
        xunlian.setXunlianTime(xunlian.getXunlianTime());
        xunlianMapper.insert(xunlian);
    }

    @Override
    public List<Xunlian> selectAll() {
        return xunlianMapper.selectList(null);
    }

    @Override
    public void deleteById(Integer id) {
        xunlianMapper.deleteById(id);
    }

    @Override
    public  List<Xunlian> selectById(Integer id) {
        return xunlianMapper.selectByXunLianId(id);
    }
}
