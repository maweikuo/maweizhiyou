package com.zhiyou.keepproject.service.imp;

import com.zhiyou.keepproject.mapper.RegionMapper;
import com.zhiyou.keepproject.pojo.Region;
import com.zhiyou.keepproject.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegionServiceImp implements RegionService {
    @Autowired
    private RegionMapper regionMapper;
    @Override
    public void insertRegion(Region region) {
        regionMapper.insert(region);
    }
}
