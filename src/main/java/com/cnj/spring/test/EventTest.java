package com.cnj.spring.test;

import com.cnj.spring.domain.TestBean;
import com.cnj.spring.event.EmailService;
import com.cnj.spring.event.EntityCreatedEventNotifier;
import com.cnj.spring.domain.Person;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @project:spring-learn
 * @package:com.cnj.spring.test
 * @create_date:2017/12/6 15:15
 * @author:Subtimental
 * @description:TODO
 */
public class EventTest {
    ApplicationContext context;
    @Before
    public void init(){
        context=new ClassPathXmlApplicationContext("event.xml");
    }

    @Test
    public void testSendMessage(){
        EmailService emailService = context.getBean("emailService", EmailService.class);
        emailService.sendEmail("john.doe@example.org","foo");
    }

    @Test
    public void testGenericSendMessage(){
        EntityCreatedEventNotifier emailService = context.getBean("entityCreatedEventNotifier", EntityCreatedEventNotifier.class);
        emailService.sendEvent(new Person("张三",23));
    }

    @Test
    public void testGenericTestBean(){
        EntityCreatedEventNotifier emailService = context.getBean("entityCreatedEventNotifier", EntityCreatedEventNotifier.class);
        emailService.sendEvent(new TestBean("里斯"));
    }
}
