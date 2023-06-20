package com.simonking.api.feign;

import com.simonking.api.bo.UserBO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 对外提供的方法，可以是feign接口也可以是dubbo等其他可访问的可用的接口
 *
 * @author: ws
 * @date: 2023/2/6 11:30
 */
@FeignClient(name = "simonking-microservices", contextId = "userInfo")
public interface UserInfoFeignClient {

    @GetMapping("/feign/getUserByJobSql")
    UserBO getUserByJobSql(@RequestParam("job") String job);
}
