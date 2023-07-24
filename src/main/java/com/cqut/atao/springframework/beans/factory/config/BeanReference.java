package com.cqut.atao.springframework.beans.factory.config;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName BeanReference.java
 * @Description Bean 的引用
 * @createTime 2023年07月24日 19:15:00
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

}
