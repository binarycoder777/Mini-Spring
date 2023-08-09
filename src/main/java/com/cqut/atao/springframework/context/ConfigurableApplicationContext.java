package com.cqut.atao.springframework.context;

import com.cqut.atao.springframework.beans.BeansException;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName ConfigurableApplicationContext.java
 * @Description SPI interface to be implemented by most if not all application contexts.
 * @createTime 2023年08月02日 23:13:00
 */
public interface ConfigurableApplicationContext extends ApplicationContext {

    /**
     * 刷新容器
     *
     * @throws BeansException
     */
    void refresh() throws BeansException;


    void registerShutdownHook();

    void close();
}

