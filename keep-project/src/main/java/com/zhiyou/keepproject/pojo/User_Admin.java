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
@TableName(value = "user_admin")
public class User_Admin {
    @TableId(value = "id", type = IdType.AUTO)
    private  Integer id;
    @TableField(value = "user_admin_number")
    private  Integer userAdminNumber;
    @TableField(value = "userId")
    private  Integer userId;
    @TableField(value = "startTime")
    private  Date startTime;
    @TableField(value = "endTime")
    private Date endTime;
    @TableField(value = "balance")
    private  Integer balance;
    @TableField(value = "userAdminStatic")
    private  String userAdminStatic;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserAdminNumber() {
        return userAdminNumber;
    }

    public void setUserAdminNumber(Integer userAdminNumber) {
        this.userAdminNumber = userAdminNumber;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getUserAdminStatic() {
        return userAdminStatic;
    }

    public void setUserAdminStatic(String userAdminStatic) {
        this.userAdminStatic = userAdminStatic;
    }
}
