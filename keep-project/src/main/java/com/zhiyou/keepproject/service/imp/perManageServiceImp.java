package com.zhiyou.keepproject.service.imp;

import com.zhiyou.keepproject.mapper.perManageMapper;
import com.zhiyou.keepproject.pojo.perManage;
import com.zhiyou.keepproject.service.perManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class perManageServiceImp implements perManageService {
    @Autowired
    private perManageMapper perManageMapper;
    @Override
    public List<perManage> selectAll() {
        return perManageMapper.selectList(null);
    }
}
