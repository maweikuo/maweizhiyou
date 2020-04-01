package com.zhiyou.keepproject.service.imp;

import com.zhiyou.keepproject.entity.ResponseData;
import com.zhiyou.keepproject.mapper.YoukeIntoMapper;
import com.zhiyou.keepproject.pojo.YoukeInto;
import com.zhiyou.keepproject.service.YoukeIntoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class YoukeIntoServiceImp implements YoukeIntoService {

    @Autowired
    private YoukeIntoMapper youkeIntoMapper;
    @Override
    public void inserYoukeInto(YoukeInto youkeInto) {
        youkeIntoMapper.insert(youkeInto);
    }

    @Override
    public ResponseData selectYoukeInto() {
        ResponseData<Object> a = new ResponseData<>();
        a.setData(youkeIntoMapper.selectList(null));
        return a;
    }
}
