package com.cqut.atao.springframework.test.service;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName UserService.java
 * @Description 测试类
 * @createTime 2023年07月17日 21:36:00
 */
public class UserService {

    private String uId;

    private UserDao userDao;

    public String queryUserInfo() {
        return userDao.queryUserName(uId);
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
