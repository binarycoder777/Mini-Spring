package com.cqut.atao.springframework.beans.factory.support;

import com.cqut.atao.springframework.beans.factory.config.BeanDefinition;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName BeanDefinitionRegistry.java
 * @Description bean注册接口
 * @createTime 2023年07月19日 08:01:00
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}

