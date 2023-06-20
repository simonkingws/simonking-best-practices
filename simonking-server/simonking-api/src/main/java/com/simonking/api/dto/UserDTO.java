package com.simonking.api.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * 请求的参数实体
 *
 * @author: ws
 * @date: 2023/6/19 13:21
 */
@Data
public class UserDTO implements Serializable {

    private static final long serialVersionUID = 6900924733679247936L;

    @NotBlank(message = "job不允许为空!")
    private String job;
}
