package com.YuWei.week4;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        urlPatterns = {"/config"},
        initParams = {
                @WebInitParam(name="name",value="Yu Wei"),
                @WebInitParam(name="studentId",value="2022211001000522")
        },loadOnStartup = 1
)
public class ConfigDemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletConfig config = getServletConfig();
       //first task
        String name = config.getInitParameter("name");
        String id = config.getInitParameter("studentId");
        PrintWriter writer = response.getWriter();
        writer.println("name:"+name);
        writer.println("Student id:"+id);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
