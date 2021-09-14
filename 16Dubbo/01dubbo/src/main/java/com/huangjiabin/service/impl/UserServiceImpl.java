package com.huangjiabin.service.impl;

import com.huangjiabin.domain.User;
import com.huangjiabin.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User getUserById() {
        User user = new User();
        user.setId(1234);
        user.setUsername("徐凤年");
        user.setAge(30);
        return user;
    }
}
