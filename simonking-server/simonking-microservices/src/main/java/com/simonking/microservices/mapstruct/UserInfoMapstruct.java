package com.simonking.microservices.mapstruct;

import com.simonking.api.bo.UserBO;
import com.simonking.resposity.model.UserInfo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;
import org.mapstruct.factory.Mappers;

/**
 * TODO
 *
 * @author: ws
 * @date: 2023/2/6 18:48
 */
@Mapper(componentModel = ComponentModel.SPRING)
public interface UserInfoMapstruct {

    UserInfoMapstruct INSTANCE = Mappers.getMapper(UserInfoMapstruct.class);

    UserBO info2bo(UserInfo userInfo);


}
