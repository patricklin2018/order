package com.imooc.order.enums;

import lombok.Getter;

/**
 * Created by Patrick
 * 2018/4/23
 * 商品状态
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "上架"),
    DOWN(1, "下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
