package com.cqut.atao.springframework.context.support;

import com.cqut.atao.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.cqut.atao.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName AbstractXmlApplicationContext.java
 * @Description AbstractXmlApplicationContext
 * @createTime 2023年08月02日 23:31:00
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations){
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();

}
