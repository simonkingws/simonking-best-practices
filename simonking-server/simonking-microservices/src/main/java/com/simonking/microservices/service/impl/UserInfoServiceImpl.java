package com.simonking.microservices.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.simonking.microservices.service.UserInfoService;
import com.simonking.resposity.mapper.UserInfoMapper;
import com.simonking.resposity.model.UserInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 对外、对内所有接口的实现
 *
 * @author: ws
 * @date: 2023/2/6 11:36
 */
@Service("userInfoService")
@RequiredArgsConstructor
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

    private final UserInfoMapper userInfoMapper;

    @Override
    public UserInfo getUserByJobSql(String job) {
        return userInfoMapper.getUserByJobSql(job);
    }
}
