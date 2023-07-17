package com.cqut.atao.springframework;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName BeanDefinition.java
 * @Description bean定义类
 * @createTime 2023年07月17日 21:31:00
 */
public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
