package com.zhiyou.keepproject.controller;

import com.zhiyou.keepproject.pojo.User;
import com.zhiyou.keepproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    //添加会员
    @RequestMapping(value = "insert")
    public  void m1(User user){
        System.out.println(user);
        userService.insertUser(user);
    }
    //删除会员
    @RequestMapping(value = "delete")
    public void m2(Integer id)
    {
        userService.deleteUser(id);
    }
    //修改会员
    @RequestMapping(value = "update")
    public void  m3(User user)
    {
        userService.updateUer(user);
    }
    //查询会员
    @RequestMapping(value = "select")
    public List<User> m4(){
        return  userService.selectAllUser();
    }


}