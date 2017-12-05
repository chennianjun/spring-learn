package com.cnj.spring.test;

import com.cnj.spring.config.AppConfig;
import com.cnj.spring.config.AppConfigPlaceholders;
import com.cnj.spring.domain.TestBean;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @project:spring-learn
 * @package:com.cnj.spring.test
 * @create_date:2017/12/5 19:52
 * @author:Subtimental
 * @description:TODO
 */
public class TestBeanName {
    AnnotationConfigApplicationContext context;
    @Before
    public void init(){
        context=new AnnotationConfigApplicationContext();
    }
    @Test
    public void testBean(){
        context.register(AppConfig.class);
        context.refresh();
        TestBean bean = context.getBean(TestBean.class);
        System.out.println(bean.getName());
    }
//
//    @Test
//    public void testBeanPlaceHolder(){
//        context.register(AppConfigPlaceholders.class);
//        context.refresh();
//        TestBean bean = context.getBean(TestBean.class);
//        System.out.println(bean.getName());
//    }
}
