package com.cnj.spring.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.DefaultMessageSourceResolvable;

import java.util.Locale;

/**
 * @project:spring-learn
 * @package:com.cnj.spring.test
 * @create_date:2017/12/5 20:59
 * @author:Subtimental
 * @description:TODO
 */
public class ResourceBundleMessageSourceTest {

    MessageSource messageSource;

    @Before
    public void init(){
        messageSource=new ClassPathXmlApplicationContext("application.xml");
    }

    @Test
    public void testResourceBundleMessageSourceTest(){
        String message = messageSource.getMessage("message", null, "default", null);
        System.out.println(message);
    }

    @Test
    public void testResourceBundleMessageSourceDefaultTest(){
        String message = messageSource.getMessage("message1", null, "default", null);
        System.out.println(message);
    }

    @Test
    public void testMessageSourceTest(){
        String message = messageSource.getMessage("argument.required", new Object[]{"message"}, "default", null);
        System.out.println(message);
    }

    @Test
    public void testMessageSourceResolvableTest(){
        MessageSourceResolvable sourceResolvable=new DefaultMessageSourceResolvable(new String[]{"user.info"},new Object[]{"spring","有趣"});
        String message = messageSource.getMessage(sourceResolvable, Locale.SIMPLIFIED_CHINESE);
        System.out.println(message);
    }
}
