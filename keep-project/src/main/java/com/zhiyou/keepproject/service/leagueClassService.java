package com.zhiyou.keepproject.service;

import com.zhiyou.keepproject.pojo.leagueClass;

import java.util.List;

public interface leagueClassService {
    //查询团课
    List<leagueClass> selectAllleagueClass();
    //修改团课
    void updateleagueClass(leagueClass leagueClass);
    //删除团课
    void  deleteleagueClassByid(Integer id);
    //添加团课
    void insertleagueClass(leagueClass leagueClass);
}
