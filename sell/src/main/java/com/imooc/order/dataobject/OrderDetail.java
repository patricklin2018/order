package com.imooc.order.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by Patrick
 * 2018/5/9
 */

@Entity
@Data
public class OrderDetail {
    @Id
    private String detailId;

    /* 订单 id */
    private String orderId;

    /* 商品 id */
    private String productId;

    /* 商品名称 */
    private String productName;

    /* 商品单价 */
    private BigDecimal productPrice;

    /* 商品数量 */
    private Integer productQuantity;

    /* 商品小图 */
    private String productIcon;
}
