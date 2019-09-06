package com.imooc.enums;

import lombok.Getter;

/**
 * 订单状态
 * @Author wanghl
 * @Date: Created in 15:42 2019/8/21 0021
 */
@Getter
public enum OrderStatusEnum {
    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCEL(2,"已取消");

    private Integer code;
    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
