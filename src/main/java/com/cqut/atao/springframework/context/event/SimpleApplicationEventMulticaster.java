package com.cqut.atao.springframework.context.event;

import com.cqut.atao.springframework.beans.factory.BeanFactory;
import com.cqut.atao.springframework.context.ApplicationEvent;
import com.cqut.atao.springframework.context.ApplicationListener;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName SimpleApplicationEventMulticaster.java
 * @Description 简单事件广播
 * @createTime 2023年09月24日 10:38:00
 */
public class SimpleApplicationEventMulticaster extends AbstractApplicationEventMulticaster {

    public SimpleApplicationEventMulticaster(BeanFactory beanFactory) {
        setBeanFactory(beanFactory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void multicastEvent(final ApplicationEvent event) {
        for (final ApplicationListener listener : getApplicationListeners(event)) {
            listener.onApplicationEvent(event);
        }
    }

}
