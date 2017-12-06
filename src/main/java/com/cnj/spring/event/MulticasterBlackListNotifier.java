package com.cnj.spring.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.core.ResolvableType;

/**
 * @project:spring-learn
 * @package:com.cnj.spring.event
 * @create_date:2017/12/6 15:24
 * @author:Subtimental
 * @description:TODO
 */
public class MulticasterBlackListNotifier implements ApplicationEventMulticaster{
    @Override
    public void addApplicationListener(ApplicationListener<?> listener) {

    }

    @Override
    public void addApplicationListenerBean(String listenerBeanName) {

    }

    @Override
    public void removeApplicationListener(ApplicationListener<?> listener) {

    }

    @Override
    public void removeApplicationListenerBean(String listenerBeanName) {

    }

    @Override
    public void removeAllListeners() {

    }

    @Override
    public void multicastEvent(ApplicationEvent event) {

    }

    @Override
    public void multicastEvent(ApplicationEvent event, ResolvableType eventType) {

    }
}
