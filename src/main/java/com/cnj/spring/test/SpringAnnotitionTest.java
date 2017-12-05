package com.cnj.spring.test;

import com.cnj.spring.autowired.AppConfig;
import com.cnj.spring.autowired.Foo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @project:spring-learn
 * @package:com.cnj.spring.test
 * @create_date:2017/12/2 13:45
 * @author:Subtimental
 * @description:TODO
 */
public class SpringAnnotitionTest {
    ConfigurableApplicationContext applicationContext=null;
    @Before
    public void init(){
        applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
    }

    @Test
    public void testBean(){
        Foo bean = applicationContext.getBean(Foo.class);
        System.out.println(bean);
        applicationContext.registerShutdownHook();
    }
}
