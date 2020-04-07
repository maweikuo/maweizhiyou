package com.zhiyou.keepproject.service;

import com.zhiyou.keepproject.pojo.Schedule;

import java.util.List;

public interface ScheduleService {
    //通过日程id查询
    Schedule selectById(Integer id);
    //通过教练id查询日程
    List<Schedule> selectAll(Integer id);
    //添加日程
    void insert(Schedule schedule);
    //修改日程
    void update(Schedule schedule);
    //删除日程
    void delete(Integer id);
}
