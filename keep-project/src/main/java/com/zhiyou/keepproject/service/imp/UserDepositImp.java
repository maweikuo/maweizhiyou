package com.zhiyou.keepproject.service.imp;

import com.zhiyou.keepproject.entity.ResponseData;
import com.zhiyou.keepproject.mapper.UserDepositMapper;
import com.zhiyou.keepproject.pojo.UserDeposit;
import com.zhiyou.keepproject.service.UserDepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDepositImp  implements UserDepositService {
    @Autowired
    private UserDepositMapper userDepositMapper;
    @Override
    public void inserUserDeposit(UserDeposit userDeposit) {
        userDepositMapper.insert(userDeposit);
    }

    @Override
    public ResponseData selectAllUserDeposit() {
        ResponseData<Object> a = new ResponseData<>();
        a.setData(userDepositMapper.selectList(null));
        return a;
    }
}
