package com.cqut.atao.springframework.context;

import com.cqut.atao.springframework.beans.factory.HierarchicalBeanFactory;
import com.cqut.atao.springframework.beans.factory.ListableBeanFactory;
import com.cqut.atao.springframework.core.io.ResourceLoader;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName ApplicationContext.java
 * @Description 应用上下文
 * @createTime 2023年08月02日 23:12:00
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}


