package com.huangjiabin.After;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAfter {
    /*最终通知*/
    @After(value = "a()")//自定义的切入点
    void after(){
        System.out.println("==========After通知方法执行============");
    }

    /*
    当较多的通知增强方法使用相同的 execution 切入点表达式时，编写、维护均较为麻烦。
    AspectJ 提供了@Pointcut 注解，用于定义 execution 切入点表达式
    */
    @Pointcut(value = "execution(* SomeServiceImpl.doSome())")
    void a(){

    }
}
