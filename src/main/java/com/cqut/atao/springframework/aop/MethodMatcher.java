package com.cqut.atao.springframework.aop;

import java.lang.reflect.Method;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName MethodMatcher.java
 * @Description 方法匹配
 * @createTime 2023年09月24日 15:25:00
 */
public interface MethodMatcher {

    /**
     * Perform static checking whether the given method matches. If this
     * @return whether or not this method matches statically
     */
    boolean matches(Method method, Class<?> targetClass);

}

