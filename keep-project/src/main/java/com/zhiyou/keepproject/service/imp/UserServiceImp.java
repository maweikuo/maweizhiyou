package com.zhiyou.keepproject.service.imp;

import com.zhiyou.keepproject.config.RedisTemplateConfig;
import com.zhiyou.keepproject.entity.Chinese2PinYinUtils;
import com.zhiyou.keepproject.mapper.UserMapper;
import com.zhiyou.keepproject.pojo.User;
import com.zhiyou.keepproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@Service
public class UserServiceImp implements UserService {
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private UserMapper userMapper;
    @Override
    public void insertUser(User user) {
        Date time1= new java.sql.Date(new java.util.Date().getTime());
        user.setTime((java.sql.Date) time1);
        String s = Chinese2PinYinUtils.trans2PinYin(user.getName());
        user.setUserAccount(s);
        user.setUserPassword(s);

        userMapper.insert(user);
    }

    @Override
    public void deleteUser(Integer id) {
        userMapper.deleteById(id);
    }

    @Override
    public void updateUer(User user) {
    userMapper.updateById(user);
    }



    @Override
    public List<User> selectAllUser() {
        String key="user:info";
        Boolean aBoolean = redisTemplate.hasKey(key);
        ValueOperations op = redisTemplate.opsForValue();
        if(aBoolean == false){
            List<User> users = userMapper.selectList(null);


                    op.set(key,users);

            return users;
        }else {
            Object o = op.get(key);
            return (List<User>) o;
        }


    }
}
