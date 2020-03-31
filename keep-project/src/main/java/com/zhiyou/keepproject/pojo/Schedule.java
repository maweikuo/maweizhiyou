package com.zhiyou.keepproject.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@TableName(value = "schedule")
public class Schedule {
    @TableId(value = "id", type = IdType.AUTO)
    private  Integer id;
    @TableField(value = "schedule_number")
    private  Integer scheduleNumber;
    @TableField(value = "personal_trainer_number")
    private  Integer personalTrainerNumber;
    @TableField(value = "schedule_anpai")
    private  String scheduleAnpai;
    @TableField(value = "schedule_no_anpai")
    private  String scheduleNoAnpai;
    @TableField(value = "schedule_beizhu")
    private  String scheduleBeizhu;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getScheduleNumber() {
        return scheduleNumber;
    }

    public void setScheduleNumber(Integer scheduleNumber) {
        this.scheduleNumber = scheduleNumber;
    }

    public Integer getPersonalTrainerNumber() {
        return personalTrainerNumber;
    }

    public void setPersonalTrainerNumber(Integer personalTrainerNumber) {
        this.personalTrainerNumber = personalTrainerNumber;
    }

    public String getScheduleAnpai() {
        return scheduleAnpai;
    }

    public void setScheduleAnpai(String scheduleAnpai) {
        this.scheduleAnpai = scheduleAnpai;
    }

    public String getScheduleNoAnpai() {
        return scheduleNoAnpai;
    }

    public void setScheduleNoAnpai(String scheduleNoAnpai) {
        this.scheduleNoAnpai = scheduleNoAnpai;
    }

    public String getScheduleBeizhu() {
        return scheduleBeizhu;
    }

    public void setScheduleBeizhu(String scheduleBeizhu) {
        this.scheduleBeizhu = scheduleBeizhu;
    }
}