package com.imooc.order.dto;

import lombok.Data;

/**
 * 购物车
 * Created by Patrick
 * 2018/5/9
 */

@Data
public class CartDTO {

    /* 商品 id */
    private String productId;

    /* 商品数量 */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
