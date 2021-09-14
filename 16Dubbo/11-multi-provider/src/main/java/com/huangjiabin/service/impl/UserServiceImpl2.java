package com.huangjiabin.service.impl;

import com.huangjiabin.domain.User;
import com.huangjiabin.service.UserService;

public class UserServiceImpl2 implements UserService {
    @Override
    public User getUser(Integer id, String name) {
        User user = new User();
        user.setId(123);
        user.setName("徐凤年");
        return user;
    }
}
