package com.imooc.enums;

import lombok.Getter;

/**
 * @Author wanghl
 * @Date: Created in 21:10 2019/8/22 0022
 */
@Getter
public enum ResultEnum {

    PRODUCT_NOT_EXIST(10, "商品不存在"),
    PRODUCT_STOCK_ERROR(11,"库存不正确");
    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
