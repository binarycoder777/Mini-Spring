package com.cqut.atao.springframework.beans.factory.config;

import com.cqut.atao.springframework.beans.BeansException;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName BeanPostProcessor.java
 * @Description 用于修改新实例化 Bean 对象的扩展点
 * @createTime 2023年08月02日 23:16:00
 */
public interface BeanPostProcessor {

    /**
     * 在 Bean 对象执行初始化方法之前，执行此方法
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;

    /**
     * 在 Bean 对象执行初始化方法之后，执行此方法
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;

}

