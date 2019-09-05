package com.imooc.dto;

import lombok.Data;

/**
 * 购物项
 * @Author wanghl
 * @Date: Created in 11:13 2019/9/4 0004
 */
@Data
public class CartDTO {
    /** 商品ID*/
    private String productID;

    /** 商品数量*/
    private Integer productQuantity;

    public CartDTO(String productID, Integer productQuantity) {
        this.productID = productID;
        this.productQuantity = productQuantity;
    }
}
