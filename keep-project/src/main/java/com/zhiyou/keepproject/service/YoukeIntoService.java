package com.zhiyou.keepproject.service;

import com.zhiyou.keepproject.entity.ResponseData;
import com.zhiyou.keepproject.pojo.YoukeInto;

public interface YoukeIntoService {
    //游客登记（添加数据）
    void inserYoukeInto(YoukeInto youkeInto);
    //查询游客
    ResponseData selectYoukeInto();
}
