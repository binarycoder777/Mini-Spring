package com.cqut.atao.springframework.beans.factory.support;

import com.cqut.atao.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName DefaultSingletonBeanRegistry.java
 * @Description 单例bean
 * @createTime 2023年07月18日 16:10:00
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }

}
