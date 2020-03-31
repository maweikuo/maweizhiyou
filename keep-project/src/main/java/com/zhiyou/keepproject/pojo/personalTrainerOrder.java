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
@TableName(value = "personal_trainer_order")
public class personalTrainerOrder {
    @TableId(value = "id", type = IdType.AUTO)
    private  Integer id;
    @TableField(value = "user_id")
    private  Integer userId;
    @TableField(value = "personal_trainer_id")
    private  Integer personalTrainerId;
    @TableField(value = "personal_trainer_order_start_time")
    private Date personalTrainerOrderStartTime;
    @TableField(value = "personal_trainer_order_end_time")
    private  Date personalTrainerOrderEndTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPersonalTrainerId() {
        return personalTrainerId;
    }

    public void setPersonalTrainerId(Integer personalTrainerId) {
        this.personalTrainerId = personalTrainerId;
    }

    public Date getPersonalTrainerOrderStartTime() {
        return personalTrainerOrderStartTime;
    }

    public void setPersonalTrainerOrderStartTime(Date personalTrainerOrderStartTime) {
        this.personalTrainerOrderStartTime = personalTrainerOrderStartTime;
    }

    public Date getPersonalTrainerOrderEndTime() {
        return personalTrainerOrderEndTime;
    }

    public void setPersonalTrainerOrderEndTime(Date personalTrainerOrderEndTime) {
        this.personalTrainerOrderEndTime = personalTrainerOrderEndTime;
    }
}
