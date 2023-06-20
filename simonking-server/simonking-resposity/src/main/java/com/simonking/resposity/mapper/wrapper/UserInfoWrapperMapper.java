package com.simonking.resposity.mapper.wrapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.simonking.resposity.model.UserInfo;

/**
 * sql封装，用来管理所有Wrapper拼接的sql
 *
 * @author: ws
 * @date: 2023/2/6 15:53
 */
public interface UserInfoWrapperMapper extends BaseMapper<UserInfo> {
    default UserInfo getUserByName(String userName){
        LambdaQueryWrapper<UserInfo> userQuery = Wrappers.lambdaQuery();
        userQuery.eq(UserInfo::getName, userName).last( "limit 1").select(UserInfo::getId, UserInfo::getName);
        return this.selectOne(userQuery);
    }

}
