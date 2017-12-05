package com.cnj.spring.autowired;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ScopeMetadata;
import org.springframework.context.annotation.ScopeMetadataResolver;

/**
 * @project:spring-learn
 * @package:com.cnj.spring.autowired
 * @create_date:2017/12/2 9:39
 * @author:Subtimental
 * @description:TODO
 */
public class ScopeResolver implements ScopeMetadataResolver{
    @Override
    public ScopeMetadata resolveScopeMetadata(BeanDefinition definition) {
        System.out.println(definition+"============");
        return null;
    }
}
