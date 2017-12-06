package com.cnj.spring.message;

import org.springframework.context.MessageSource;

import java.util.Locale;

/**
 * @project:spring-learn
 * @package:com.cnj.spring.message
 * @create_date:2017/12/5 21:41
 * @author:Subtimental
 * @description:TODO
 */
public class MessageSourceExample {

    private MessageSource messageSource;

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public void execute(){
        String message = messageSource.getMessage("argument.required",
                new Object[]{"userDao"}, "Required", null);
        System.out.println(message);
    }

    public void internationalization (){
        String message = messageSource.getMessage("argument.required",
                new Object[]{"userDao"}, "Required", Locale.UK);
        System.out.println(message);
    }

    public void customLocal (){
        System.out.println(messageSource.getClass().getSimpleName());
        String message = messageSource.getMessage("info",
                null, "Info", null);
        System.out.println(message);
    }
}
