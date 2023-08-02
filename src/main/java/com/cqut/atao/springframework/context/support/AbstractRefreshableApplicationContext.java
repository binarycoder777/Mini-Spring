package com.cqut.atao.springframework.context.support;

import com.cqut.atao.springframework.beans.BeansException;
import com.cqut.atao.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.cqut.atao.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName AbstractRefreshableApplicationContext.java
 * @Description 抽象refreshable类
 * @createTime 2023年08月02日 23:24:00
 */
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext {

    private DefaultListableBeanFactory beanFactory;

    @Override
    protected void refreshBeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        loadBeanDefinitions(beanFactory);
        this.beanFactory = beanFactory;
    }

    private DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }

    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory() {
        return beanFactory;
    }

}
