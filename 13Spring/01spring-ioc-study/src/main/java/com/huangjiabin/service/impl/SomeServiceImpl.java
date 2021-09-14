package com.huangjiabin.service.impl;

import com.huangjiabin.service.SomeService;

public class SomeServiceImpl implements SomeService {
    public SomeServiceImpl(){
        System.out.println("无参构造方法调用，对象被创建");
    }
    @Override
    public void doSome() {
        System.out.println("SomeServiceImpl.doSome被调用了");
    }
}
