package com.simonking.common.framework.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 业务系统的枚举
 *
 * @author: ws
 * @date: 2023/6/17 14:53
 */
@Getter
@AllArgsConstructor
public enum BizEnum {

    ADMIN("10000", "后台业务系统"),
    APP("20000", "客户端系统");

    private final String code;
    private final String bizName;
}
