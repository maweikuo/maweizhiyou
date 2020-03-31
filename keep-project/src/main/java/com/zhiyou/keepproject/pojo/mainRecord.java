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
@TableName(value = "main_record")
public class mainRecord {
    @TableId(value = "id", type = IdType.AUTO)
    private  Integer id;
    @TableField(value = "main_record_number")
    private  Integer main_record_number;
    @TableField(value = "equipment_on")
    private  String equipment_on;
    @TableField(value = "equipment_name")
    private  String equipment_name;
    @TableField(value = "equipment_bianhao")
    private  String equipment_bianhao;
    @TableField(value = "equipment_message")
    private  String equipment_message;
    @TableField(value = "main_record_time")
    private Date main_record_time;
    @TableField(value = "main_record_money")
    private  Integer main_record_money;
    @TableField(value = "record_becouse")
    private  String record_becouse;
    @TableField(value = "main_people_name")
    private  String main_people_name;
    @TableField(value = "main_people_phone")
    private  Integer main_people_phone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMain_record_number() {
        return main_record_number;
    }

    public void setMain_record_number(Integer main_record_number) {
        this.main_record_number = main_record_number;
    }

    public String getEquipment_on() {
        return equipment_on;
    }

    public void setEquipment_on(String equipment_on) {
        this.equipment_on = equipment_on;
    }

    public String getEquipment_name() {
        return equipment_name;
    }

    public void setEquipment_name(String equipment_name) {
        this.equipment_name = equipment_name;
    }

    public String getEquipment_bianhao() {
        return equipment_bianhao;
    }

    public void setEquipment_bianhao(String equipment_bianhao) {
        this.equipment_bianhao = equipment_bianhao;
    }

    public String getEquipment_message() {
        return equipment_message;
    }

    public void setEquipment_message(String equipment_message) {
        this.equipment_message = equipment_message;
    }

    public Date getMain_record_time() {
        return main_record_time;
    }

    public void setMain_record_time(Date main_record_time) {
        this.main_record_time = main_record_time;
    }

    public Integer getMain_record_money() {
        return main_record_money;
    }

    public void setMain_record_money(Integer main_record_money) {
        this.main_record_money = main_record_money;
    }

    public String getRecord_becouse() {
        return record_becouse;
    }

    public void setRecord_becouse(String record_becouse) {
        this.record_becouse = record_becouse;
    }

    public String getMain_people_name() {
        return main_people_name;
    }

    public void setMain_people_name(String main_people_name) {
        this.main_people_name = main_people_name;
    }

    public Integer getMain_people_phone() {
        return main_people_phone;
    }

    public void setMain_people_phone(Integer main_people_phone) {
        this.main_people_phone = main_people_phone;
    }
}
