package com.cnj.spring.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * @project:spring-learn
 * @package:com.cnj.spring.event
 * @create_date:2017/12/6 20:46
 * @author:Subtimental
 * @description:TODO
 */
public class EntityCreatedEventNotifier implements ApplicationEventPublisherAware{

    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher=applicationEventPublisher;
    }

    public <T> void sendEvent(T t){
        EntityCreatedEvent<T> entityCreatedEvent=new EntityCreatedEvent<>(t);
        applicationEventPublisher.publishEvent(entityCreatedEvent);
    }

}
