package com.hki.mpdemo;

import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * sql 执行效率分析器 如不需要可以不添加
 * @Auther: ZHANG.HAO
 * @Date: 2019-03-04 11:23
 * @Description:
 */
@EnableTransactionManagement
@Configuration
@MapperScan("com.hki.mpdemo.*.mapper")

public class MybatisPlusConfig {

    /**
     * SQL执行效率插件
     */
    @Bean
    @Profile({"dev","test"})// 设置 dev test 环境开启
    public PerformanceInterceptor performanceInterceptor() {
        return new PerformanceInterceptor();
    }

}