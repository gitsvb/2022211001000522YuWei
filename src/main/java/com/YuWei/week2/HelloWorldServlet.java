package com.YuWei.week2;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        PrintWriter writer = response.getWriter();
        writer.println("Name:YuWei ");
        writer.println("Id:2022211001000522");
        writer.println("Date and Time Thurs Mar 14 17:23:41 CST 2024");

    }
    public void doPost(HttpServletRequest request,HttpServletResponse response){

    }
}
