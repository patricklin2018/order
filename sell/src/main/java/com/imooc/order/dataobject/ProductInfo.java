package com.imooc.order.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by Patrick
 * 2018/4/23
 * 商品类
 */

@Entity
@Data
public class ProductInfo {
    @Id
    private String productId;

    /* 名称 */
    private String productName;

    /* 单价 */
    private BigDecimal productPrice;

    /* 库存 */
    private Integer productStock;

    /* 描述 */
    private String productDescription;

    /* 小图 */
    private String productIcon;

    /* 状态, 0正常,1下架*/
    private Integer productStatus;

    /* 商品类目编号 */
    private Integer categoryType;
}
