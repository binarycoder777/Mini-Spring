package com.cqut.atao.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName BeanFactory.java
 * @Description bean工厂类
 * @createTime 2023年07月17日 21:33:00
 */
public class BeanFactory {

    private Map<String,BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name,BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name,beanDefinition);
    }

}
