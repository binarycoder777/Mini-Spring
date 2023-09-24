package com.cqut.atao.springframework.context.event;

import com.cqut.atao.springframework.context.ApplicationEvent;
import com.cqut.atao.springframework.context.ApplicationListener;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName ApplicationEventMulticaster.java
 * @Description 应用事件广播
 * @createTime 2023年09月24日 10:22:00
 */
public interface ApplicationEventMulticaster {

    /**
     * Add a listener to be notified of all events.
     * @param listener the listener to add
     */
    void addApplicationListener(ApplicationListener<?> listener);

    /**
     * Remove a listener from the notification list.
     * @param listener the listener to remove
     */
    void removeApplicationListener(ApplicationListener<?> listener);

    /**
     * Multicast the given application event to appropriate listeners.
     * @param event the event to multicast
     */
    void multicastEvent(ApplicationEvent event);

}

