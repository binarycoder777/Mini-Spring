package com.cqut.atao.springframework.core.io;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName ResourceLoader.java
 * @Description 资源加载接口
 * @createTime 2023年07月26日 17:05:00
 */
public interface ResourceLoader {

    /**
     * Pseudo URL prefix for loading from the class path: "classpath:"
     */
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);

}
