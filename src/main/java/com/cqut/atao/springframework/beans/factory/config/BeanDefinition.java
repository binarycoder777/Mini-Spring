package com.cqut.atao.springframework.beans.factory.config;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName BeanDefinition.java
 * @Description bean定义类
 * @createTime 2023年07月17日 21:31:00
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
