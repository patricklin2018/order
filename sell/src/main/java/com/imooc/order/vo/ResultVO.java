package com.imooc.order.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * Created by Patrick
 * 2018/4/23
 * http请求返回的最外层对象
 */
@Data
// 已用文件全局配置实现
// @JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultVO<T> {

    /* 错误码 */
    private Integer code;

    /* 提示信息 */
    private String msg;

    /* 具体内容 */
    private T data;
}
