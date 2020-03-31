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
@TableName(value = "xunlian")
public class Xunlian {
    @TableId(value = "id", type = IdType.AUTO)
    private  Integer id;
    @TableField(value = "xunlian_number")
    private  Integer xunlianNumber;
    @TableField(value = "user_number")
    private  Integer userNumber;
    @TableField(value = "applian_name")
    private  String applianName;
    @TableField(value = "xunlian_time")
    private Date xunlianTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getXunlianNumber() {
        return xunlianNumber;
    }

    public void setXunlianNumber(Integer xunlianNumber) {
        this.xunlianNumber = xunlianNumber;
    }

    public Integer getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(Integer userNumber) {
        this.userNumber = userNumber;
    }

    public String getApplianName() {
        return applianName;
    }

    public void setApplianName(String applianName) {
        this.applianName = applianName;
    }

    public Date getXunlianTime() {
        return xunlianTime;
    }

    public void setXunlianTime(Date xunlianTime) {
        this.xunlianTime = xunlianTime;
    }
}
