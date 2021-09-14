package com.huangjiabin.dao.impl;

import com.huangjiabin.entity.SysUser;
import com.huangjiabin.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void insertUser(SysUser user) {
        System.out.println("UserDaoImpl的insertUser 方法被调用了");
    }

    public UserDaoImpl() {
    }
}
