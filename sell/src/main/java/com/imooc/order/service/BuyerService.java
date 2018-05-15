package com.imooc.order.service;

import com.imooc.order.dto.OrderDTO;

/**
 * 买家 service
 * Created by Patrick
 * 2018/5/10
 */
public interface BuyerService {

    // 查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    // 取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
