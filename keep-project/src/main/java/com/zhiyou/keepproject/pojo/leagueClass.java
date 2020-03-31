package com.zhiyou.keepproject.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

import java.sql.Date;

@Data
@ToString
@TableName(value = "league_class")
public class leagueClass {
    @TableId(value = "id", type = IdType.AUTO)
    private  Integer id;
    @TableField(value = "league_class_number")
    private  Integer leagueClassNumber;
    @TableField(value = "league_class_name")
    private  String leagueClassName;
    @TableField(value = "league_class_type")
    private  String leagueClassType;
    @TableField(value = "league_class_start_time")
    private  Date leagueClassStartTime;
    @TableField(value = "league_class_end_time")
    private Date leagueClassEndTime;
    @TableField(value = "league_class_personal_trainer")
    private  String leagueClassPersonalTrainer;
    @TableField(value = "league_class_static")
    private  String leagueClassStatic;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLeagueClassNumber() {
        return leagueClassNumber;
    }

    public void setLeagueClassNumber(Integer leagueClassNumber) {
        this.leagueClassNumber = leagueClassNumber;
    }

    public String getLeagueClassName() {
        return leagueClassName;
    }

    public void setLeagueClassName(String leagueClassName) {
        this.leagueClassName = leagueClassName;
    }

    public String getLeagueClassType() {
        return leagueClassType;
    }

    public void setLeagueClassType(String leagueClassType) {
        this.leagueClassType = leagueClassType;
    }

    public Date getLeagueClassStartTime() {
        return leagueClassStartTime;
    }

    public void setLeagueClassStartTime(Date leagueClassStartTime) {
        this.leagueClassStartTime = leagueClassStartTime;
    }

    public Date getLeagueClassEndTime() {
        return leagueClassEndTime;
    }

    public void setLeagueClassEndTime(Date leagueClassEndTime) {
        this.leagueClassEndTime = leagueClassEndTime;
    }

    public String getLeagueClassPersonalTrainer() {
        return leagueClassPersonalTrainer;
    }

    public void setLeagueClassPersonalTrainer(String leagueClassPersonalTrainer) {
        this.leagueClassPersonalTrainer = leagueClassPersonalTrainer;
    }

    public String getLeagueClassStatic() {
        return leagueClassStatic;
    }

    public void setLeagueClassStatic(String leagueClassStatic) {
        this.leagueClassStatic = leagueClassStatic;
    }
}
