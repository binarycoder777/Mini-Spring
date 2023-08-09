package com.cqut.atao.springframework.context.support;

import com.cqut.atao.springframework.beans.BeansException;
import com.cqut.atao.springframework.beans.factory.config.BeanPostProcessor;
import com.cqut.atao.springframework.context.ApplicationContext;
import com.cqut.atao.springframework.context.ApplicationContextAware;

/**
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 */
public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware){
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

}
