package com.zhiyou.keepproject.service;

import com.zhiyou.keepproject.entity.ResponseData;
import com.zhiyou.keepproject.pojo.Region;

public interface RegionService {
    //前台添加
    void  insertRegion(Region region);
    //显示所有前台
    ResponseData selectAllRegion();
}
