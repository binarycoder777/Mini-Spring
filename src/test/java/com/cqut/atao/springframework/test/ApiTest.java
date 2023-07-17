package com.cqut.atao.springframework.test;

import com.cqut.atao.springframework.BeanDefinition;
import com.cqut.atao.springframework.BeanFactory;
import com.cqut.atao.springframework.test.service.UserService;
import org.junit.Test;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName ApiTest.java
 * @Description api 测试类
 * @createTime 2023年07月17日 21:35:00
 */
public class ApiTest {

    @Test
    public void test_beanfactory() {
        final BeanFactory beanFactory = new BeanFactory();

        final BeanDefinition beanDefinition = new BeanDefinition(new UserService());

        beanFactory.registerBeanDefinition("userService",beanDefinition);

        final UserService userService = (UserService)beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

}
