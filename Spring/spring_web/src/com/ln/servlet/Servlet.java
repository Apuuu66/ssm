package com.ln.servlet;

import com.ln.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: Fionar
 * Time: 2017/12/23 17:49
 */
@WebServlet(name = "Servlet", urlPatterns = "/login")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

//        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        //使用web工厂获取配置
        WebApplicationContext webac = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
        UserService us = (UserService) webac.getBean("userService");
        us.save();
        String name = request.getParameter("name");
        String pass = request.getParameter("pass");
        System.out.println(name);
        System.out.println(pass);
        System.out.println(getServletContext().getRealPath("/"));
        response.sendRedirect(request.getContextPath() + "/success.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
