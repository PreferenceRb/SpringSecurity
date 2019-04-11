package com.example.security.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by kobe on 2019/3/27.
 */
@Component
public class ContextProvider implements ApplicationContextAware {
    @Autowired
    private static ApplicationContext context;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ContextProvider.context = applicationContext;
    }

    public static <T> T getBean(Class<T> beanClass) {
        return ContextProvider.context.getBean(beanClass);
    }

    public static <T> T getBean(String beanName) {
        return (T)ContextProvider.context.getBean(beanName);
    }
}
