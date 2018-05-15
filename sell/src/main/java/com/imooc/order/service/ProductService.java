package com.imooc.order.service;

import com.imooc.order.dataobject.ProductInfo;
import com.imooc.order.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by Patrick
 * 2018/4/23
 */

public interface ProductService {
    ProductInfo findOne(String productId);

    /**
     * 查询所有上架商品列表
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询分页下所有商品列表
     * @param pageable
     * @return
     */
    Page<ProductInfo> findAll(Pageable pageable);

    /**
     * 保存
     * @param productInfo
     * @return
     */
    ProductInfo save(ProductInfo productInfo);

    /* 加库存 */
    void increaseStock(List<CartDTO> cartDTOList);

    /* 扣库存 */
    void decreaseStock(List<CartDTO> cartDTOList);
}
