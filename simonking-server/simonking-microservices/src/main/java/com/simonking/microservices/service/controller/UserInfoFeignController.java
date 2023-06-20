package com.simonking.microservices.service.controller;

import com.simonking.api.bo.UserBO;
import com.simonking.api.feign.UserInfoFeignClient;
import com.simonking.microservices.mapstruct.UserInfoMapstruct;
import com.simonking.resposity.mapper.UserInfoMapper;
import com.simonking.resposity.model.UserInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * 对外接口的实现
 *
 * @author: ws
 * @date: 2023/2/6 17:57
 */
@RestController
@RequiredArgsConstructor
public class UserInfoFeignController implements UserInfoFeignClient {

    private final UserInfoMapper userInfoMapper;
    private final UserInfoMapstruct userInfoConvert;

    @Override
    public UserBO getUserByJobSql(String job) {
        UserInfo userInfo = userInfoMapper.getUserByJobSql(job);
        return userInfoConvert.info2bo(userInfo);
    }
}
