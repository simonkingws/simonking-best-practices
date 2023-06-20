package com.simonking.api.bo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 业务返回实体
 *
 * @author: ws
 * @date: 2023/6/19 14:10
 */
@Data
public class UserBO implements Serializable {

    private static final long serialVersionUID = -85668628175029520L;

    private Integer id;
    private String name;
    private String sex;
    private String job;
    private Date birthday;
    private Date createdTime;
    private Date updateTime;
}
