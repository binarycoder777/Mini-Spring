package com.cqut.atao.springframework.beans.factory.support;

import com.cqut.atao.springframework.beans.BeansException;
import com.cqut.atao.springframework.core.io.Resource;
import com.cqut.atao.springframework.core.io.ResourceLoader;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName BeanDefinitionReader.java
 * @Description Simple interface for bean definition readers.
 * @createTime 2023年07月31日 16:00:00
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String... locations) throws BeansException;

}

