package com.imooc.order.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Patrick
 * 2018/5/15
 */

@Data
@Component
@ConfigurationProperties(prefix = "wechat")
public class WechatAccountConfig {

    /* 公众号 appId */
    private String mpAppId;

    /* 公众号 appSecret */
    private String mpAppSecret;

    /* 商户号 */
    private String mchId;

    /* 商户密钥 */
    private String mchKey;

    /* 商户证书路径 */
    private String keyPath;

    /* 借用公众号 appId */
    private String tmpMpAppId;

    /* 借用公众号 appSecret */
    private String tmpMpAppSerect;

    /* 支付异步通知 */
    private String notifyUrl;
}
