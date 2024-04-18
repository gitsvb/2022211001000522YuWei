package com.YuWei.controller;

import com.YuWei.dao.UserDao;
import com.YuWei.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.*;
import java.util.List;

@WebServlet(
        urlPatterns = {"/login"}
)
public class loginServlet extends HttpServlet {

    Connection con =null;

    public void init()throws ServletException{
        con = (Connection) getServletContext().getAttribute("con");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        UserDao userDao = new UserDao();
        /*
        test other method code
        try{
            List<User>userList = userDao.findByPassword(con,"12345678");
            if(userList!=null){
                request.setAttribute("userlist",userList);
                request.getRequestDispatcher("WEB-INF/views/userInfo.jsp").forward(request,response);
            }
            else {
                request.setAttribute("message","username or password error!!");
                request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request,response);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }*/
        try{
            User user = userDao.findByUsernamePassword(con,username,password);
            if(user!=null){
                request.setAttribute("user",user);
                request.getRequestDispatcher("WEB-INF/views/userInfo.jsp").forward(request,response);
            }
            else {
                request.setAttribute("message","username or password error!!");
                request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request,response);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }

/*
      try{
          String sql ="Select * from tb_user where username = ? "+"and password = ?";
          PreparedStatement stat = con.prepareStatement(sql);
          stat.setString(1,username);
          stat.setString(2,password);
          ResultSet rs = stat.executeQuery();



          if(rs.next()){

              request.setAttribute("username",rs.getString("username"));
              request.setAttribute("password",rs.getString("password"));
              request.setAttribute("email",rs.getString("email"));
              request.setAttribute("gender",rs.getString("gender"));
              request.setAttribute("brithdate",rs.getString("brithdate"));
              request.getRequestDispatcher("userInfo.jsp").forward(request,response);
          }
          else{

              request.setAttribute("message","username or password error!!");
              request.getRequestDispatcher("login.jsp").forward(request,response);

          }


      }catch(SQLException e){
          e.printStackTrace();
      }
*/
    }
}