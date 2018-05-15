package com.imooc.order.dataobject;

import com.imooc.order.enums.OrderStatusEnum;
import com.imooc.order.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by Patrick
 * 2018/5/9
 */

@Entity
@Data
@DynamicUpdate
public class OrderMaster {
    @Id
    private String orderId;

    /* 买家名字 */
    private String buyerName;

    /* 买家电话 */
    private String buyerPhone;

    /* 买家地址 */
    private String buyerAddress;

    /* 买家微信 openid */
    private String buyerOpenid;

    /* 订单总金额 */
    private BigDecimal orderAmount;

    /* 订单状态，默认为 0 新下单 */
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    /* 支付状态，默认为 0 未支付 */
    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    /* 创建时间 */
    private Date createTime;

    /* 更新时间 */
    private Date updateTime;

    // 已移动至 dto.OrderDTO
    /* 订单详情 */
    /*@Transient
    private List<OrderDetail> orderDetails;*/
}
