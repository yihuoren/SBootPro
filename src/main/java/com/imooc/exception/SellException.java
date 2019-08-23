package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * @Author wanghl
 * @Date: Created in 21:20 2019/8/22 0022
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum){
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }
}
