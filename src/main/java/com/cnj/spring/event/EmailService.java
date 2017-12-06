package com.cnj.spring.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import java.util.List;

/**
 * @project:spring-learn
 * @package:com.cnj.spring.event
 * @create_date:2017/12/6 14:47
 * @author:Subtimental
 * @description:TODO
 */
public class EmailService implements ApplicationEventPublisherAware{

    private List<String> blackList;

    private ApplicationEventPublisher applicationEventPublisher;

    public void setBlackList(List<String> blackList) {
        this.blackList = blackList;
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher=applicationEventPublisher;
    }

    public void sendEmail(String address,String text){
        if (blackList.contains(address)){
            BlackListEvent blackListEvent=new BlackListEvent(this,address,text);
            applicationEventPublisher.publishEvent(blackListEvent);
            return;
        }
    }

}
