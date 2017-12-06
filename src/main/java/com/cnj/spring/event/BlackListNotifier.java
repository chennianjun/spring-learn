package com.cnj.spring.event;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.context.ApplicationListener;

/**
 * @project:spring-learn
 * @package:com.cnj.spring.event
 * @create_date:2017/12/6 14:53
 * @author:Subtimental
 * @description:TODO
 */
public class BlackListNotifier implements ApplicationListener<BlackListEvent>{

    private String notificationAddress;

    public void setNotificationAddress(String notificationAddress) {
        this.notificationAddress = notificationAddress;
    }

    @Override
    public void onApplicationEvent(BlackListEvent event) {
        System.out.println(event.getAddress()+"==="+event.getTest());
    }
}
