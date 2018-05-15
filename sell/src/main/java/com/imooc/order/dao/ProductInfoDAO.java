package com.imooc.order.dao;

import com.imooc.order.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Patrick
 * 2018/4/23
 */
public interface ProductInfoDAO extends JpaRepository<ProductInfo, String> {
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
