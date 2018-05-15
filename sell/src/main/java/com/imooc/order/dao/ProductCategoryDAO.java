package com.imooc.order.dao;

import com.imooc.order.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Patrick
 * 2018/4/23
 */
public interface ProductCategoryDAO extends JpaRepository<ProductCategory, Integer> {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
