package com.imooc.order.service;

import com.imooc.order.dto.OrderDTO;

/**
 * Created by Patrick
 * 2018/5/15
 */
public interface PayService {

    void create(OrderDTO orderDTO);
}
