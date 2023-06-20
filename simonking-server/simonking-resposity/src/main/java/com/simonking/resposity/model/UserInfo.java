package com.simonking.resposity.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 对象实体
 *
 * @author: ws
 * @date: 2023/2/6 11:16
 */
@Data
@TableName("user_info")
public class UserInfo implements Serializable {

    private static final long serialVersionUID = -8812579486662462522L;

    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private String sex;
    private String job;
    private Date birthday;
    private Date createdTime;
    private Date updateTime;
}
