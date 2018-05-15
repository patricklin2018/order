package com.imooc.order.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.imooc.order.dataobject.OrderDetail;
import com.imooc.order.enums.OrderStatusEnum;
import com.imooc.order.enums.PayStatusEnum;
import com.imooc.order.utils.serializer.Date2LongSerializer;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by Patrick
 * 2018/5/9
 */

@Data
// 已用配置文件实现
// @JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {
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
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;

    /* 更新时间 */
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    /* 订单详情 */
    private List<OrderDetail> orderDetails;
}
