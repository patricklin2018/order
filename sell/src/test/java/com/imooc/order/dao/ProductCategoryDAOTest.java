package com.imooc.order.dao;

import com.imooc.order.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Patrick
 * 2018/4/23
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryDAOTest {
    @Autowired
    private ProductCategoryDAO productCategoryDAO;

    @Test
    public void findOneTest(){
        ProductCategory productCategory = productCategoryDAO.findById(1).get();
        System.out.println(productCategory.toString());
    }

    @Test
    @Transactional
    public void saveTest(){
        /*ProductCategory productCategory = new ProductCategory("男生最爱", 4);
        ProductCategory result = productCategoryDAO.save(productCategory);
        Assert.assertNotNull(result);
        Assert.assertNotEquals(null, result);*/
    }

    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(2,3,4);

        List<ProductCategory> result = productCategoryDAO.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0, result.size());
    }
}