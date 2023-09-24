package com.cqut.atao.springframework.context;

import java.util.EventListener;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName ApplicationListener.java
 * @Description 应用事件监听接口
 * @createTime 2023年09月24日 10:35:00
 */
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {

    /**
     * Handle an application event.
     * @param event the event to respond to
     */
    void onApplicationEvent(E event);

}

