package com.imooc.order.service;

import com.imooc.order.dataobject.ProductCategory;

import java.util.List;

/**
 * Created by Patrick
 * 2018/4/23
 */
public interface CategoryService {
    /* 通过 id 查询目类 */
    ProductCategory findOne(Integer categoryId);

    /* 查询所有目类 */
    List<ProductCategory> findAll();

    /* 查询 list 下所有 id 的目类 */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    /* 保存 */
    ProductCategory save(ProductCategory productCategory);
}
