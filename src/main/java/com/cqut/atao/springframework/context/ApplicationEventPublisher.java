package com.cqut.atao.springframework.context;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName ApplicationEventPublisher.java
 * @Description 事件发布
 * @createTime 2023年09月24日 10:29:00
 */
public interface ApplicationEventPublisher {

    /**
     * Notify all listeners registered with this application of an application
     * event. Events may be framework events (such as RequestHandledEvent)
     * or application-specific events.
     * @param event the event to publish
     */
    void publishEvent(ApplicationEvent event);

}
