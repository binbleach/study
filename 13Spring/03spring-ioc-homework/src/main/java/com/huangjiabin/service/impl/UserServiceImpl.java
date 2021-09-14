package com.huangjiabin.service.impl;

import com.huangjiabin.entity.SysUser;
import com.huangjiabin.dao.UserDao;
import com.huangjiabin.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao dao;
     public void addUser(SysUser user){
         dao.insertUser(user);
     }

    public UserServiceImpl(UserDao dao) {
        this.dao = dao;
    }

    public UserDao getDao() {
        return dao;
    }

    @Override
    public String toString() {
        return "UserServiceImpl{" +
                "dao=" + dao +
                '}';
    }

    public void setDao(UserDao dao) {
        this.dao = dao;
    }
}
