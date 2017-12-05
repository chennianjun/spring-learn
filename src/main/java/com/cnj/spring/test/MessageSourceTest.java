package com.cnj.spring.test;

import com.cnj.spring.message.MessageSourceExample;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @project:spring-learn
 * @package:com.cnj.spring.test
 * @create_date:2017/12/5 21:44
 * @author:Subtimental
 * @description:TODO
 */
public class MessageSourceTest {
    ApplicationContext context;
    @Before
    public void init(){
        context=new ClassPathXmlApplicationContext("bean.xml");
    }

    @Test
    public void testMessageSourceExample(){
        MessageSourceExample example = context.getBean("sourceExample", MessageSourceExample.class);
        example.execute();
    }
}
