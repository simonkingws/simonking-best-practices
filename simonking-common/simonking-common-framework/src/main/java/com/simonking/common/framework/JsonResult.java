package com.simonking.common.framework;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Map;

/**
 * 全局统一返回实体
 *
 * @author: ws
 * @date: 2023/6/16 15:13
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JsonResult<T> implements Serializable {

    private static final long serialVersionUID = -1331882824590589423L;

    // 返回的状态
    private boolean success;
    // 状态码
    private String code;
    // 返回的消息提示
    private String msg;
    // 返回的数据
    private T data;
    // 返回的扩展数据
    private Map<String, Object> extras;

    public static <T> JsonResult<T> ok(T t){
        JsonResult<T> jr = new JsonResult<>();
        jr.setSuccess(true);
        jr.setData(t);
        return jr;
    }

    public static <T> JsonResult<T> fail(String msg){
        JsonResult<T> jr = new JsonResult<>();
        jr.setSuccess(false);
        jr.setMsg(msg);
        return jr;
    }
}
