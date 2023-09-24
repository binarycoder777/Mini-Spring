package com.cqut.atao.springframework.aop;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName Pointcut.java
 * @Description 切点类
 * @createTime 2023年09月24日 15:23:00
 */
public interface Pointcut {

    /**
     * Return the ClassFilter for this pointcut.
     * @return the ClassFilter (never <code>null</code>)
     */
    ClassFilter getClassFilter();

    /**
     * Return the MethodMatcher for this pointcut.
     * @return the MethodMatcher (never <code>null</code>)
     */
    MethodMatcher getMethodMatcher();

}
