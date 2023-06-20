package com.simonking.microservices.controller;

import com.simonking.api.dto.UserDTO;
import com.simonking.common.framework.JsonResult;
import com.simonking.microservices.service.UserInfoService;
import com.simonking.resposity.model.UserInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 控制层Controller
 *
 * @author: ws
 * @date: 2023/6/16 11:29
 */
@RequestMapping("/foo")
@RestController
@RequiredArgsConstructor
public class FooController {
    private final UserInfoService userInfoService;

    @GetMapping("/getUser")
    public JsonResult<UserInfo> getUser(){
        UserInfo userInfo = userInfoService.getById(1);
        return JsonResult.ok(userInfo);
    }

    @GetMapping("/getUser2")
    public JsonResult<?> getUser2(@Valid UserDTO userDto){
        UserInfo userInfo = userInfoService.getUserByJobSql(userDto.getJob());
        return JsonResult.ok(userInfo);
    }
}
