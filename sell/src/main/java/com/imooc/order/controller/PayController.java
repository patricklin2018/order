package com.imooc.order.controller;

import com.imooc.order.dto.OrderDTO;
import com.imooc.order.enums.ResultEnum;
import com.imooc.order.exception.SellException;
import com.imooc.order.service.OrderService;
import com.imooc.order.service.PayService;
import com.lly835.bestpay.model.PayResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by Patrick
 * 2018/5/15
 */

@Controller
//@RequestMapping("/pay")
@Slf4j
public class PayController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private PayService payServicel;

    /*
        借用支付账号联调
    */
    @GetMapping("/pay")
    public ModelAndView index(@RequestParam("openid") String openid,
                        Map<String, Object> map) {
        log.info("openid = {}", openid);

        // 1. 查询订单
        String orderId = "1526530935071913573";
        OrderDTO orderDTO = orderService.findOne(orderId);
        if (orderDTO == null) {
            throw new SellException(ResultEnum.ORDERMASTER_NOT_EXIST);
        }

        // 发起支付
        orderDTO.setBuyerOpenid(openid);
        PayResponse payResponse = payServicel.create(orderDTO);
        map.put("payResponse", payResponse);
        map.put("returnUrl", "http://www.baidu.com");
        return new ModelAndView("pay/create", map);
    }

    @GetMapping("/create")
    public ModelAndView create(@RequestParam("orderId") String orderId,
                               @RequestParam("returnUrl") String returnUrl,
                               Map<String, Object> map) {
        // 1. 查询订单
        OrderDTO orderDTO = orderService.findOne(orderId);
        if (orderDTO == null) {
            throw new SellException(ResultEnum.ORDERMASTER_NOT_EXIST);
        }

        // 发起支付
        PayResponse payResponse = payServicel.create(orderDTO);
        map.put("payResponse", payResponse);
        map.put("returnUrl", returnUrl);
        return new ModelAndView("pay/create", map);
    }

    @PostMapping("/notify")
    public ModelAndView notify(@RequestBody String notifyData) {
        payServicel.notify(notifyData);

        // 返回给微信处理结果
        return new ModelAndView("pay/success");
    }
}
