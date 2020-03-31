package com.zhiyou.keepproject.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ResponseData<T> {
    private T data;
    private int code;
    private String msg;

    public ResponseData() {
    }

    public ResponseData(T data, int code, String msg) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }
}
