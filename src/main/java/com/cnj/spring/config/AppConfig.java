package com.cnj.spring.config;

import com.cnj.spring.domain.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @project:spring-learn
 * @package:com.cnj.spring.config
 * @create_date:2017/12/5 19:39
 * @author:Subtimental
 * @description:TODO
 */
@Configuration
@PropertySource("classpath:/app.properties")
public class AppConfig {

    @Autowired
    private Environment environment;

    @Bean
    public TestBean testBean(){
        TestBean testBean=new TestBean();
        testBean.setName(environment.getProperty("testbean.name"));
        return testBean;
    }

}
