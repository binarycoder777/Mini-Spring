package com.cqut.atao.springframework.beans.factory.config;

import com.cqut.atao.springframework.beans.factory.HierarchicalBeanFactory;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName ConfigurableBeanFactory.java
 * @Description
 * Configuration interface to be implemented by most bean factories. Provides
 * facilities to configure a bean factory, in addition to the bean factory
 * client methods in the {@link com.cqut.atao.springframework.beans.factory.BeanFactory}
 * interface.
 * @createTime 2023年07月31日 15:38:00
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

}

