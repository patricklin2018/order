package com.imooc.order.service.impl;

import com.imooc.order.dto.OrderDTO;
import com.imooc.order.service.OrderService;
import com.imooc.order.service.PayService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by Patrick
 * 2018/5/16
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class PayServiceImplTest {

    @Autowired
    private PayService payService;

    @Autowired
    private OrderService orderService;

    @Test
    public void create() {
        OrderDTO orderDTO = orderService.findOne("1525878981174343509");
        payService.create(orderDTO);
    }
}