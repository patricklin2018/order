package com.imooc.order.service.impl;

import com.imooc.order.dataobject.ProductCategory;
import com.imooc.order.service.CategoryService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Patrick
 * 2018/4/23
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {
    @Autowired
    private CategoryService categoryService;

    @Test
    public void findOne() throws Exception{
        ProductCategory productCategory = categoryService.findOne(1);
        Assert.assertNotEquals(new Integer(1), productCategory);
    }

    @Test
    public void findAll() throws Exception{
        List<ProductCategory> productCategoryList = categoryService.findAll();
        Assert.assertNotEquals(0, ((List) productCategoryList).size());
    }

    @Test
    public void findByCategoryTypeIn() throws Exception{
        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(Arrays.asList(1,2,3,4));
        Assert.assertNotEquals(0, productCategoryList.size());
    }

    @Test
    public void save() throws Exception{
        /*ProductCategory productCategory = new ProductCategory("男生最爱", 4);
        ProductCategory result = categoryService.save(productCategory);
        Assert.assertNotNull(result);*/
    }

}