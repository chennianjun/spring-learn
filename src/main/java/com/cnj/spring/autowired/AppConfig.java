package com.cnj.spring.autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @project:spring-learn
 * @package:com.cnj.spring.autowired
 * @create_date:2017/12/2 13:41
 * @author:Subtimental
 * @description:TODO
 */
@Configuration
public class AppConfig {
    @Bean(initMethod = "init",destroyMethod = "cleanup")
    public Foo foo(){
        return new Foo();
    }
}
