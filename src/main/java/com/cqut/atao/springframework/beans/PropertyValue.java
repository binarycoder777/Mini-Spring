package com.cqut.atao.springframework.beans;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName PropertyValue.java
 * @Description bean 属性信息
 * @createTime 2023年07月24日 19:09:00
 */
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }

}
