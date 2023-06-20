package com.simonking.resposity.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Mybtis-plus 配置信息
 *
 * @author: ws
 * @date: 2023/6/16 13:22
 */
@Configuration
// 配置扫描Mapper接口
@MapperScan("com.simonking.resposity.mapper")
public class MybatisPlusConfig {

}
