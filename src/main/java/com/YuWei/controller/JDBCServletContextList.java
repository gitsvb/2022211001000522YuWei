package com.YuWei.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.sql.Connection;
import java.sql.DriverManager;
@WebListener
public class JDBCServletContextList implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        String drivername = context.getInitParameter("drivername");
        String url = context.getInitParameter("url");
        String username = context.getInitParameter("username");
        String password = context.getInitParameter("password");
        try {
            Class.forName(drivername);
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("i am in contextInitialized -->connection" + con);
            context.setAttribute("con",con);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("i am in ContextDestroyed");
        sce.getServletContext().removeAttribute("con");
    }
}
