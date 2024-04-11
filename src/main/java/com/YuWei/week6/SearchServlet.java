package com.YuWei.week6;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.WriteAbortedException;
import java.io.Writer;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String txt = request.getParameter("txt");
        String search = request.getParameter("search");
        /*PrintWriter out = response.getWriter();
        out.println(txt);
        out.println(search);*/

        if(txt == null || txt == ""){
            response.sendRedirect("index.jsp");
        }
        else{
            if(search.equals("baidu")){
                response.sendRedirect("https://www.baidu.com/s?wd="+txt);
            }
            else if(search.equals("bing")){
                response.sendRedirect("https://cn.bing.com/search?q="+txt);
            }
            else if(search.equals("google")){
                response.sendRedirect("https://www.google.cn/"+txt);
            }
            else {
                response.sendRedirect("https://www.baidu.com/s?wd="+txt);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
