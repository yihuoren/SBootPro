package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * 买家service
 * @Author wanghl
 * @Date: Created in 17:29 2019/9/7 0007
 */
public interface BuyerService {
    //订单详情（查询一个订单）
    OrderDTO findOrderOne(String openid,String orderId);
    //取消订单
    OrderDTO cancelOrder(String openid,String orderId);
}
