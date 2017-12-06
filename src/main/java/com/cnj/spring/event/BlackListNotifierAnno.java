package com.cnj.spring.event;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;

/**
 * @project:spring-learn
 * @package:com.cnj.spring.event
 * @create_date:2017/12/6 16:28
 * @author:Subtimental
 * @description:TODO
 */
public class BlackListNotifierAnno {

    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    @EventListener
    @Order(100)
    public void processBlackListEvent(BlackListEvent event){
        System.out.println("1、BlackListNotifierAnno:"+event.getAddress()+"=="+event.getTest());
    }

    @EventListener(BlackListEvent.class)
    @Order(101)
    public void handleContextStart(){
        System.out.println("2、BlackListNotifierAnno.handleContextStart");
    }

    @EventListener(condition = "#blEvent.test=='foo'")
    @Order(102)
    public void processBlackListEventCondition(BlackListEvent blEvent){
        System.out.println("3、BlackListNotifierAnno.processBlackListEventCondition"+blEvent);
    }

    @EventListener
    public ListUpdateEvent handleBlackListEvent(BlackListEvent event) {
        return new ListUpdateEvent(event);
    }
}
