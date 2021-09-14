package com.huangjiabin.service.impl;

import com.huangjiabin.domain.User;
import com.huangjiabin.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User getUser() {
        User user = new User();
        user.setId(123);
        user.setName("黄家宾");
        user.setMoney(2);
        return user;
    }
}
