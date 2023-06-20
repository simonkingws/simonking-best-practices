package com.simonking.common.framework.exception;

import com.simonking.common.framework.enums.BizEnum;
import lombok.Getter;

/**
 * 自定义业务异常异常
 *
 * @author: ws
 * @date: 2023/6/16 16:09
 */
@Getter
public class BizException extends RuntimeException{
    private static final long serialVersionUID = 2530367266350496707L;

    // 业务枚举 区分不同的业务系统
    private final BizEnum bizEnum;

    public BizException(BizEnum bizEnum, String msg) {
        super(msg);
        this.bizEnum = bizEnum;
    }
}
