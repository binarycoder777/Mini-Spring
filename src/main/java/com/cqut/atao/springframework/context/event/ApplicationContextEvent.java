package com.cqut.atao.springframework.context.event;

import com.cqut.atao.springframework.context.ApplicationContext;
import com.cqut.atao.springframework.context.ApplicationEvent;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName ApplicationContextEvent.java
 * @Description 应用上下文事件
 * @createTime 2023年09月24日 10:18:00
 */
public class ApplicationContextEvent extends ApplicationEvent {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationContextEvent(Object source) {
        super(source);
    }

    /**
     * Get the <code>ApplicationContext</code> that the event was raised for.
     */
    public final ApplicationContext getApplicationContext() {
        return (ApplicationContext) getSource();
    }

}

