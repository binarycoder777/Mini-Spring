package com.cqut.atao.springframework.aop;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName ClassFilter.java
 * @Description 类过滤
 * @createTime 2023年09月24日 15:24:00
 */
public interface ClassFilter {

    /**
     * Should the pointcut apply to the given interface or target class?
     * @param clazz the candidate target class
     * @return whether the advice should apply to the given target class
     */
    boolean matches(Class<?> clazz);

}

