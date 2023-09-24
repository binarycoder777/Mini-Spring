package com.cqut.atao.springframework.context;

import java.util.EventObject;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName ApplicationEvent.java
 * @Description 应用实践类
 * @createTime 2023年09月24日 10:15:00
 */
public abstract class ApplicationEvent extends EventObject {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationEvent(Object source) {
        super(source);
    }

}

