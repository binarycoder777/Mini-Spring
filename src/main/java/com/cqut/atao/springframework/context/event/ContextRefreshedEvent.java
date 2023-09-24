package com.cqut.atao.springframework.context.event;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName ContextRefreshedEvent.java
 * @Description 上下文刷新事件
 * @createTime 2023年09月24日 10:20:00
 */
public class ContextRefreshedEvent extends ApplicationContextEvent{
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ContextRefreshedEvent(Object source) {
        super(source);
    }

}

