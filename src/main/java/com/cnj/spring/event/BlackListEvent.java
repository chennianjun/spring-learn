package com.cnj.spring.event;

import org.springframework.context.ApplicationEvent;

/**
 * @project:spring-learn
 * @package:com.cnj.spring.event
 * @create_date:2017/12/6 14:44
 * @author:Subtimental
 * @description:TODO
 */
public class BlackListEvent extends ApplicationEvent{
    private final String address;
    private final String test;

    public BlackListEvent(Object source, String address, String test) {
        super(source);
        this.address = address;
        this.test = test;
    }

    public String getAddress() {
        return address;
    }

    public String getTest() {
        return test;
    }
}
