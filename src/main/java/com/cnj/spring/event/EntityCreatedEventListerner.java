package com.cnj.spring.event;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.context.ApplicationListener;

/**
 * @project:spring-learn
 * @package:com.cnj.spring.event
 * @create_date:2017/12/6 20:52
 * @author:Subtimental
 * @description:TODO
 */
public class EntityCreatedEventListerner implements ApplicationListener<EntityCreatedEvent>{
    @Override
    public void onApplicationEvent(EntityCreatedEvent event) {
        System.out.println(ReflectionToStringBuilder.toString(event.getSource(), ToStringStyle.MULTI_LINE_STYLE));
    }
}
