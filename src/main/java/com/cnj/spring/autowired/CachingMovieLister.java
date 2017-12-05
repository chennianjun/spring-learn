package com.cnj.spring.autowired;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @project:spring-learn
 * @package:com.cnj.spring.autowired
 * @create_date:2017/12/2 9:17
 * @author:Subtimental
 * @description:TODO
 */
public class CachingMovieLister implements InitializingBean{

    @PostConstruct
    public void populateMovieCache(){
        System.out.println("CachingMovieLister.populateMovieCache");
    }

    @PreDestroy
    public void clearMovieCache(){
        System.out.println("CachingMovieLister.clearMovieCache");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("CachingMovieLister.afterPropertiesSet");
    }
}
