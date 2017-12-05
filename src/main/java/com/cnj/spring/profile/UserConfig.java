package com.cnj.spring.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @project:spring-learn
 * @package:com.cnj.spring.profile
 * @create_date:2017/12/3 20:45
 * @author:Subtimental
 * @description:TODO
 */
@Configuration
@Profile("default")
public class UserConfig {

    @Bean
    public UserDao userDao(){
        return new UserDao();
    }

}
