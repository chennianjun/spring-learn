package com.cnj.spring.test;

import com.cnj.spring.profile.UserConfig;
import com.cnj.spring.profile.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

/**
 * @project:spring-learn
 * @package:com.cnj.spring.test
 * @create_date:2017/12/3 20:48
 * @author:Subtimental
 * @description:TODO
 */
public class UserTest {

    @Test
    public void testUser(){
        ApplicationContext context=new AnnotationConfigApplicationContext(UserConfig.class);
        Environment environment = context.getEnvironment();
        System.out.println(environment.getProperty("env"));
        System.out.println(environment.containsProperty("env"));
        context.getBean(UserDao.class);
    }

}
