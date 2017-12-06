package com.cnj.spring.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.core.ResolvableType;
import org.springframework.core.ResolvableTypeProvider;

/**
 * @project:spring-learn
 * @package:com.cnj.spring.event
 * @create_date:2017/12/6 20:35
 * @author:Subtimental
 * @description:TODO
 */
public class EntityCreatedEvent<T> extends ApplicationEvent implements ResolvableTypeProvider{

    public EntityCreatedEvent(T source) {
        super(source);
    }

    @Override
    public ResolvableType getResolvableType() {
        return ResolvableType.forClassWithGenerics(getClass(),ResolvableType.forInstance(getSource()));
    }
}
