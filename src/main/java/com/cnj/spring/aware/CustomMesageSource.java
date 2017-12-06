package com.cnj.spring.aware;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

import java.util.Locale;

/**
 * @project:spring-learn
 * @package:com.cnj.spring.aware
 * @create_date:2017/12/6 9:56
 * @author:Subtimental
 * @description:TODO
 */
public class CustomMesageSource implements MessageSourceAware,BeanNameAware{

    MessageSource messageSource;

    @Override
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource=messageSource;
    }

    public void execute(){
        String message = messageSource.getMessage("argument.required",
                new Object[]{"userDao"}, "Required", Locale.UK);
        System.out.println(message);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println(name);
    }
}
