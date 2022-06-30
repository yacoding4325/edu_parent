package com.yacoding.servicebase.exception;

import com.yacoding.service.base.result.ResultCodeEnum;

/**
 * @Author yaCoding
 * @create 2022-06-30 下午 3:42
 */

public class YacodingException extends RuntimeException {

    private Integer code;

    public YacodingException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

//    public Integer getCode() {
//        return null;
//    }
}
