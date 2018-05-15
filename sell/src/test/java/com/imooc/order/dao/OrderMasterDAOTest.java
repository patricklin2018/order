package com.imooc.order.dao;

import com.imooc.order.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by Patrick
 * 2018/5/9
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterDAOTest {

    @Autowired
    OrderMasterDAO orderMasterDAO;

    private String OPENID = "abc123";

    @Test
    public void saveTest() throws Exception{
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("1234567");
        orderMaster.setBuyerName("patrick");
        orderMaster.setBuyerPhone("12345678910");
        orderMaster.setBuyerAddress("ecnu-likelou");
        orderMaster.setBuyerOpenid(OPENID);
        orderMaster.setOrderAmount(new BigDecimal(2.3));

        OrderMaster result = orderMasterDAO.save(orderMaster);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByBuyerOpenid() throws Exception{
        PageRequest pageRequest = new PageRequest(0, 3);
        Page<OrderMaster> orderMasterPage = orderMasterDAO.findByBuyerOpenid(OPENID, pageRequest);
        Assert.assertNotEquals(0, orderMasterPage.getTotalElements());
    }
}