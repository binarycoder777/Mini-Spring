package com.cqut.atao.springframework.beans.factory;

import com.cqut.atao.springframework.beans.BeansException;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName BeanFactory.java
 * @Description bean工厂抽象
 * @createTime 2023年07月19日 07:56:00
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;;

}
