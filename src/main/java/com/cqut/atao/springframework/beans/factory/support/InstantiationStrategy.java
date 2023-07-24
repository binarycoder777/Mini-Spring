package com.cqut.atao.springframework.beans.factory.support;

import com.cqut.atao.springframework.beans.BeansException;
import com.cqut.atao.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName InstantiationStrategy.java
 * @Description 实例化策略
 * @createTime 2023年07月19日 22:20:00
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;

}
