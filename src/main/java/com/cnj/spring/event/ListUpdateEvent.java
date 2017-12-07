package com.cnj.spring.event;

import org.springframework.context.ApplicationEvent;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;

/**
 * @project:spring-learn
 * @package:com.cnj.spring.event
 * @create_date:2017/12/6 19:42
 * @author:Subtimental
 * @description:TODO
 */
public class ListUpdateEvent extends ApplicationEvent {

    private Long timeStrap;

    public ListUpdateEvent(Object source) {
        super(source);
        this.timeStrap= LocalDateTime.now().getLong(ChronoField.DAY_OF_YEAR);
    }

}
