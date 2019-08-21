package com.imooc.enums;

import lombok.Getter;

/**
 * 支付状态
 *  @Author wanghl
 * @Date: Created in 15:43 2019/8/21 0021
 */
@Getter
public enum PayStatusEnum {
    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功");

    private Integer code;
    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
