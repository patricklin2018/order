package com.imooc.order.dao;

import com.imooc.order.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Patrick
 * 2018/4/23
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoDAOTest {

    @Autowired
    private ProductInfoDAO productInfoDAO;

    @Test
    public void findByProductStatus() {
        List<ProductInfo> productInfoList = productInfoDAO.findByProductStatus(0);
        Assert.assertNotNull(productInfoList);
    }

    @Test
    public void saveTest(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123456");
        productInfo.setProductName("皮蛋粥");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("很好喝的粥");
        productInfo.setProductIcon("http://pic83.huitu.com/res/20160804/911935_20160804213447633147_1.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(2);
        productInfoDAO.save(productInfo);
    }
}