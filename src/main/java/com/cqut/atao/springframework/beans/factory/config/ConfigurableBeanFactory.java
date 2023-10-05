package com.cqut.atao.springframework.beans.factory.config;

import com.cqut.atao.springframework.beans.factory.HierarchicalBeanFactory;
import com.cqut.atao.springframework.util.StringValueResolver;

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

    /**
     * 销毁单例对象
     */
    @Override
    void destroySingletons();

    /**
     * Add a String resolver for embedded values such as annotation attributes.
     * @param valueResolver the String resolver to apply to embedded values
     * @since 3.0
     */
    void addEmbeddedValueResolver(StringValueResolver valueResolver);

    /**
     * Resolve the given embedded value, e.g. an annotation attribute.
     * @param value the value to resolve
     * @return the resolved value (may be the original value as-is)
     * @since 3.0
     */
    String resolveEmbeddedValue(String value);
}

