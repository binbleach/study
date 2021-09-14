package com.huangjiabin;

import com.huangjiabin.entity.SysUser;
import com.huangjiabin.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test1(){
        //spring解耦合，面向接口编程时，当UserServiceImpl过时不用时,直接再创建一个接口实现类，该spring配置文件就好了
        //下面这段代码都不需要该
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service =(UserService) context.getBean("Service");
        SysUser user = new SysUser();
        service.addUser(user);
    }
}
