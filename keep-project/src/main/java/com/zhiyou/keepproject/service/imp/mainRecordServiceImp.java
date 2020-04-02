package com.zhiyou.keepproject.service.imp;

import com.zhiyou.keepproject.mapper.mainRecordMapper;
import com.zhiyou.keepproject.pojo.mainRecord;
import com.zhiyou.keepproject.service.mainRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class mainRecordServiceImp  implements mainRecordService {
    @Autowired
    private mainRecordMapper mainRecordMapper;
    @Override
    public void insermainRecord(mainRecord mainRecord) {
        mainRecordMapper.insert(mainRecord);
    }

    @Override
    public void deletemainRecord(Integer id) {
        mainRecordMapper.deleteById(id);
    }

    @Override
    public void updatemainRecord(mainRecord mainRecord) {
        mainRecordMapper.updateById(mainRecord);
    }

    @Override
    public List<mainRecord> selectAllmainRecord() {
        return mainRecordMapper.selectList(null);
    }
}
