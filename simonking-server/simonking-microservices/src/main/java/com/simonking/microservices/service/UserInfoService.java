package com.simonking.microservices.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.simonking.resposity.model.UserInfo;

/**
 * Spring 中动态代理使用的接口，不对外提供服务
 *
 * @author: ws
 * @date: 2023/2/6 11:30
 */
public interface UserInfoService extends IService<UserInfo> {
    UserInfo getUserByJobSql(String job);
}
