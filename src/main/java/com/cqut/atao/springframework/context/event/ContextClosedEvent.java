package com.cqut.atao.springframework.context.event;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName ContextClosedEvent.java
 * @Description 上下文关闭事件
 * @createTime 2023年09月24日 10:18:00
 */
public class ContextClosedEvent extends ApplicationContextEvent{

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ContextClosedEvent(Object source) {
        super(source);
    }

}

