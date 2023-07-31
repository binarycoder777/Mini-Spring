package com.cqut.atao.springframework.util;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName ClassUtils.java
 * @Description 类工具
 * @createTime 2023年07月26日 17:12:00
 */
public class ClassUtils {

    public static ClassLoader getDefaultClassLoader() {
        ClassLoader cl = null;
        try {
            cl = Thread.currentThread().getContextClassLoader();
        }
        catch (Throwable ex) {
            // Cannot access thread context ClassLoader - falling back to system class loader...
        }
        if (cl == null) {
            // No thread context class loader -> use class loader of this class.
            cl = ClassUtils.class.getClassLoader();
        }
        return cl;
    }

}
