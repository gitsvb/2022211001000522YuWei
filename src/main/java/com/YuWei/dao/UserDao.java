package com.YuWei.dao;

import com.YuWei.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDao implements IUserDao {
    @Override
    public boolean saveUser(Connection con, User user) throws SQLException {
        String username = user.getUsername();
        String password = user.getPassword();
        String email = user.getEmail();
        String gender = user.getGender();
        String brithdate = user.getBrithdate();
        String sql = "insert into tb_user values(?,?,?,?,?)";
       try{
           PreparedStatement statement = con.prepareStatement(sql);
           statement.setString(1,username);
           statement.setString(2,password);
           statement.setString(3,email);
           statement.setString(4,gender);
           statement.setString(5,brithdate);
           int a = statement.executeUpdate();
           if(a>0){
               System.out.println("insert successfully!!");
           }
           statement.close();
           con.close();
       }catch (SQLException e){
           e.printStackTrace();
       }

        return false;
    }

    @Override
    public int deleteUser(Connection con, User user) throws SQLException {
        String username = user.getUsername();
        String sql = "delete form tb_user where username = ?";
        try{
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1,username);
            int a1 = statement.executeUpdate();
            if(a1>0){
                System.out.println("delete successfully");
            }
            statement.close();
            con.close();
        }catch (SQLException e){
            e.printStackTrace();
        }

        return 0;
    }

    @Override
    public int updateUser(Connection con, User user) throws SQLException {
        String password = user.getPassword();
        String email = user.getEmail();
        String gender = user.getGender();
        String brithdate = user.getBrithdate();
        String username = user.getUsername();
        String sql = "update tb_user set password=?,email=?,gender=?,brithdate=? where username=?";
        try{
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1,password);
            statement.setString(2,email);
            statement.setString(3,gender);
            statement.setString(4,brithdate);
            statement.setString(4,username);
            int a2 = statement.executeUpdate();
            if(a2>0){
                System.out.println("update successfully");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public User findById(Connection con, Integer id) throws SQLException {
        return null;
    }

    @Override
    public User findByUsernamePassword(Connection con, String username, String password) throws SQLException {
        String sql = "select * from tb_user where username=? and password=?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1,username);
            statement.setString(2,password);
            ResultSet rs = statement.executeQuery();
            User user = null;
            if(rs.next()){
                user = new User();
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setEmail(rs.getString("email"));
                user.setGender(rs.getString("gender"));
                user.setBrithdate(rs.getString("brithdate"));
            }
        return user;

    }

    @Override
    public List<User> findByUsername(Connection con, String username) throws SQLException {
        List<User>userlist = null;
        String sql = "select * from tb_user where username = ?";
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setString(1,username);
        ResultSet rs = statement.executeQuery();
        if(rs.next()){
            userlist = new ArrayList<>();

            while (rs.next()){
                User user = new User();
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setEmail(rs.getString("email"));
                user.setGender(rs.getString("gender"));
                user.setBrithdate(rs.getString("brithdate"));
                userlist.add(user);
            }
        }


        return userlist;
    }

    @Override
    public List<User> findByPassword(Connection con, String password) throws SQLException {
        List<User>userlist = null;
        String sql = "select * from tb_user where password = ?";
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setString(1,password);
        ResultSet rs = statement.executeQuery();
        if(rs.next()){
            userlist = new ArrayList<>();

            while (rs.next()){
                User user = new User();
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setEmail(rs.getString("email"));
                user.setGender(rs.getString("gender"));
                user.setBrithdate(rs.getString("brithdate"));
                userlist.add(user);
            }
        }


        return userlist;
    }

    @Override
    public List<User> findByEmail(Connection con, String email) throws SQLException {
        List<User>userlist = null;
        String sql = "select * from tb_user where email = ?";
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setString(1,email);
        ResultSet rs = statement.executeQuery();
        if(rs.next()){
            userlist = new ArrayList<>();

            while (rs.next()){
                User user = new User();
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setEmail(rs.getString("email"));
                user.setGender(rs.getString("gender"));
                user.setBrithdate(rs.getString("brithdate"));
                userlist.add(user);
            }
        }
        return userlist;
    }


    @Override
    public List<User> findByGender(Connection con, String gender) throws SQLException {
        List<User>userlist = null;
        String sql = "select * from tb_user where gender = ?";
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setString(1,gender);
        ResultSet rs = statement.executeQuery();
        if(rs.next()){
            userlist = new ArrayList<>();

            while (rs.next()){
                User user = new User();
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setEmail(rs.getString("email"));
                user.setGender(rs.getString("gender"));
                user.setBrithdate(rs.getString("brithdate"));
                userlist.add(user);
            }
        }
        return userlist;
    }

    @Override
    public List<User> findByBirthdate(Connection con, String birthDate) throws SQLException {
        List<User>userlist = null;
        String sql = "select * from tb_user where brithdate ender = ?";
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setString(1,birthDate);
        ResultSet rs = statement.executeQuery();
        if(rs.next()){
            userlist = new ArrayList<>();

            while (rs.next()){
                User user = new User();
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setEmail(rs.getString("email"));
                user.setGender(rs.getString("gender"));
                user.setBrithdate(rs.getString("brithdate"));
                userlist.add(user);
            }
        }
        return userlist;
    }

    @Override
    public List<User> findAllUser(Connection con) throws SQLException {
        List<User>userList = null;
        String sql = "select * from tb_user";
        PreparedStatement statement = con.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();
        if(rs.next()){
            userList = new ArrayList<>();
            while (rs.next()){
                User user = new User();
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setEmail(rs.getString("email"));
                user.setGender(rs.getString("gender"));
                user.setBrithdate(rs.getString("brithdate"));
                userList.add(user);
            }
        }
        return userList;
    }
}
