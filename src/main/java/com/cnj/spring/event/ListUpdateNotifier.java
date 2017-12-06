package com.cnj.spring.event;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.context.ApplicationListener;

/**
 * @project:spring-learn
 * @package:com.cnj.spring.event
 * @create_date:2017/12/6 19:47
 * @author:Subtimental
 * @description:TODO
 */
public class ListUpdateNotifier implements ApplicationListener<ListUpdateEvent>{
    @Override
    public void onApplicationEvent(ListUpdateEvent event) {
        System.out.println(ReflectionToStringBuilder.toString(event, ToStringStyle.MULTI_LINE_STYLE));
    }
}
