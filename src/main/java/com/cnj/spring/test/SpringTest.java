package com.cnj.spring.test;

import com.cnj.spring.autowired.AppConfig;
import com.cnj.spring.autowired.CachingMovieLister;
import com.cnj.spring.autowired.Foo;
import com.cnj.spring.autowired.SimpleMovieLister;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @project:spring-learn
 * @package:com.cnj.spring.test
 * @author:Subtimental
 * @create_date:2017/11/29 19:41
 * @todo:
 */
public class SpringTest {
    ConfigurableApplicationContext context=null;


    @Before
    public void init(){
        context=new ClassPathXmlApplicationContext("application.xml");
    }

    @Test
    public void testAutoWired(){
        SimpleMovieLister simpleMovieLister = context.getBean("simpleMovieLister", SimpleMovieLister.class);
        System.out.println(ReflectionToStringBuilder.toString(simpleMovieLister, ToStringStyle.MULTI_LINE_STYLE));
    }

    @Test
    public void testPostConstruct(){
        CachingMovieLister cachingMovieLister = context.getBean("cachingMovieLister", CachingMovieLister.class);
        System.out.println(ReflectionToStringBuilder.toString(cachingMovieLister, ToStringStyle.MULTI_LINE_STYLE));
        context.registerShutdownHook();
    }




}
