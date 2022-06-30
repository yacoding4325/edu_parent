package com.yacoding.servicebase.handler;

/**
 * @Author yaCoding
 * @create 2022-06-30 下午 3:47
 */

import com.yacoding.service.base.result.R;
import com.yacoding.service.base.utils.ExceptionUtils;
import com.yacoding.servicebase.exception.YacodingException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常处理
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 处理所有的异常
     */
    @ResponseBody
    @ExceptionHandler(Exception.class)
    public R error(Exception e){
        //控制台打印异常
//        e.printStackTrace();
//        log.error(e.getMessage());
        log.error(ExceptionUtils.getMessage(e));
        //返回异常
        return R.error();
    }

    /**
     * 处理数学异常
     */
    @ResponseBody
    @ExceptionHandler(ArithmeticException.class)
    public R arithmeticException(Exception e){
        //控制台打印异常
//        e.printStackTrace();
//        log.error(e.getMessage());
        log.error(ExceptionUtils.getMessage(e));
        //返回异常
        return R.error().message("数学异常");
    }

    /**
     * 自定义异常
     */
    @ResponseBody
    @ExceptionHandler(YacodingException.class)
    public R yacodingbException(YacodingException e) {
        //控制台打印异常
//        e.printStackTrace();
//        log.error(e.getMessage());
        log.error(ExceptionUtils.getMessage(e));
        //返回异常
        return R.error().message(e.getMessage()).code(e.getCode());
    }
}
