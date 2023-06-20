package com.simonking.resposity.mapper;

import com.simonking.resposity.mapper.wrapper.UserInfoWrapperMapper;
import com.simonking.resposity.model.UserInfo;
import org.apache.ibatis.annotations.Param;

/**
 * 管理扩展的SQL
 *
 * @author ws
 * @date 2023/2/6 16:00
 * @param null
 * @return {@link }
 */
public interface UserInfoMapper extends UserInfoWrapperMapper {
    UserInfo getUserByJobSql(@Param("job") String job);
}
