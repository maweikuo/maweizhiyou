package com.zhiyou.keepproject.service.imp;

import com.zhiyou.keepproject.mapper.XunlianMapper;
import com.zhiyou.keepproject.pojo.Xunlian;
import com.zhiyou.keepproject.service.XunlianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class XunlianServiceImp implements XunlianService {
    @Autowired
    private XunlianMapper xunlianMapper;
    @Override
    public void insertXunlian(Xunlian xunlian) {
        xunlianMapper.insert(xunlian);
    }
}
