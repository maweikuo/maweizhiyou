package com.zhiyou.keepproject.service;

import com.zhiyou.keepproject.pojo.UserLeagueClass;

import java.util.List;

public interface UserLeagueClassService {
    //通过用户id查询他报了哪些团课
    List<UserLeagueClass> selectAllByUserId(Integer id);
    //用户删除预约团课
    void deleteByUserId(Integer id);
    Integer selectAllBylIdAndUId(Integer leagueid,Integer userid);
    void insert(UserLeagueClass userLeagueClass);

}
