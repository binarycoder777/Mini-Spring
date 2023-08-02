package com.cqut.atao.springframework.beans.factory.config;

import com.cqut.atao.springframework.beans.BeansException;
import com.cqut.atao.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName BeanFactoryPostProcessor.java
 * @Description 允许自定义修改 BeanDefinition 属性信息
 * @createTime 2023年08月02日 23:16:00
 */
public interface BeanFactoryPostProcessor {

    /**
     * 在所有的 BeanDefinition 加载完成后，实例化 Bean 对象之前，提供修改 BeanDefinition 属性的机制
     *
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;

}

