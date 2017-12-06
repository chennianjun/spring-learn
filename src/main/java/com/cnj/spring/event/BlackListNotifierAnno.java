package com.cnj.spring.event;

import org.springframework.context.event.EventListener;

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
    public void processBlackListEvent(BlackListEvent event){
        System.out.println("BlackListNotifierAnno:"+event.getAddress()+"=="+event.getTest());
    }

    @EventListener(BlackListEvent.class)
    public void handleContextStart(){
        System.out.println("BlackListNotifierAnno.handleContextStart");
    }

    @EventListener(condition = "#blEvent.test=='foo'")
    public void processBlackListEventCondition(BlackListEvent blEvent){
        System.out.println(blEvent.getTest());
        System.out.println("BlackListNotifierAnno.processBlackListEventCondition"+blEvent);
    }
}
