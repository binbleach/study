package com.huangjiabin.servlet;

import com.huangjiabin.entity.Student;
import com.huangjiabin.service.impl.StudentServiceImpl;


import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StudentServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String id=req.getParameter("id");
        String name=req.getParameter("name");
        String email=req.getParameter("email");
        String age=req.getParameter("age");
        Student s = new Student(Integer.valueOf(id),name,email,Integer.valueOf(age));
        //01普通的创建

        /*ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");*/


        //02监听器创建,然后让在ServletContext里

        /*String attr= WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE;
        WebApplicationContext context=(WebApplicationContext)getServletContext().getAttribute(attr);*/

        /*第三种
        * 工具类*/
        WebApplicationContext context=WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());

        System.out.println(context);
        StudentServiceImpl service=(StudentServiceImpl) context.getBean("service");
        System.out.println(service.register(s));
        req.getRequestDispatcher("success.jsp").forward(req,resp);
    }
}
