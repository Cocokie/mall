package com.lix.mall.common.utils;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
public enum ResultEnum {
    UNKNOW_ERROR(10000,"系统未知异常"),
    PARAMS_ERROR(10001,"服务参数校验异常");
    private Integer code;
    private String message;

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
