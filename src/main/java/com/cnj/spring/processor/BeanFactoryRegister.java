package com.cnj.spring.processor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

/**
 * @project:spring-learn
 * @package:com.cnj.spring.processor
 * @create_date:2017/12/7 9:06
 * @author:Subtimental
 * @description:TODO
 */
public class BeanFactoryRegister {
    public BeanFactory beanFactory(){
        DefaultListableBeanFactory beanFactory=new DefaultListableBeanFactory();
        beanFactory.addBeanPostProcessor(new MyBeanPostProcessor());
        return beanFactory;
    }

    public BeanFactory registerBeanFactoryPostProcessor(){
        DefaultListableBeanFactory beanFactory=new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(new FileSystemResource("datasource.xml"));

        PropertyPlaceholderConfigurer configurer=new PropertyPlaceholderConfigurer();
        configurer.setLocation(new FileSystemResource("jdbc.properties"));
        configurer.postProcessBeanFactory(beanFactory);
        return beanFactory;
    }
}
