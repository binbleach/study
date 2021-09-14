package com.huangjiabin;

import com.huangjiabin.service.SomeService;
import com.huangjiabin.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class TestSomeServiceImpl {
    @Test
    public void someService() {
        /*不用Spring创建对象的话*/
        SomeServiceImpl s = new SomeServiceImpl();
        s.doSome();

        /*通过Spring容器创建对象的话*/
        //01Spring配置文件位置，也是从类路径开始的
        String resources = "beans.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(resources);
        SomeService service = (SomeService) context.getBean("SomeServiceImpl"); //面向接口编程
        service.doSome();
    }

    @Test
    public void test2(){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        int num=context.getBeanDefinitionCount();//获取容器中对象数量
        System.out.println("容器中对象数量："+num);
        String names[]=context.getBeanDefinitionNames();
        for(String name:names){
            System.out.println("容器中对象名："+name);
        }
    }

    @Test
    public void test3(){
        //获取非自定义对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Date date=(Date)context.getBean("Date");
        System.out.println(date);
    }

}
