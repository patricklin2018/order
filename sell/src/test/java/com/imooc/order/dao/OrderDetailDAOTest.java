package com.imooc.order.dao;

import com.imooc.order.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Patrick
 * 2018/5/9
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailDAOTest {

    @Autowired
    private OrderDetailDAO orderDetailDAO;

    @Test
    public void saveTest(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("123456789");
        orderDetail.setOrderId("123456");
        orderDetail.setProductId("2222");
        orderDetail.setProductName("皮蛋粥");
        orderDetail.setProductPrice(new BigDecimal(10));
        orderDetail.setProductIcon("https://xxx.com");
        orderDetail.setProductQuantity(2);

        OrderDetail result = orderDetailDAO.save(orderDetail);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByOrderId() {
        List<OrderDetail> orderDetailList = orderDetailDAO.findByOrderId("123456");
        Assert.assertNotEquals(0, orderDetailList.size());
    }
}