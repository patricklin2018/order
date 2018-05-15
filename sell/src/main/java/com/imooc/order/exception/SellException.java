package com.imooc.order.exception;

import com.imooc.order.enums.ResultEnum;

/**
 * Created by Patrick
 * 2018/5/9
 */
public class SellException extends RuntimeException {
    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String msg) {
        super(msg);

        this.code = code;
    }
}
