package com.cqut.atao.springframework.beans.factory.support;

import com.cqut.atao.springframework.core.io.DefaultResourceLoader;
import com.cqut.atao.springframework.core.io.ResourceLoader;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName AbstractBeanDefinitionReader.java
 * @Description
 * Abstract base class for bean definition readers which implement
 * the {@link BeanDefinitionReader} interface.
 * @createTime 2023年07月31日 16:02:00
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    private final BeanDefinitionRegistry registry;

    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this(registry, new DefaultResourceLoader());
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        this.registry = registry;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }

}
