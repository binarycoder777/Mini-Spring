package com.cqut.atao.springframework.beans;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName BeansException.java
 * @Description 定义 Bean 异常
 * @createTime 2023年07月19日 07:59:00
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}

