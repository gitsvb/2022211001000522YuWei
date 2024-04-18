<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%@include file="header.jsp"%>
<h1><%= "Welcome to my homepage" %>
</h1>
<br/>
<!--
<a href="hello-servlet">Hello Servlet-week1</a>
<br/>
<a href="hello">Student Info Servlet-week2</a>
<br/>
<a href="life">Life Cycle Servlet-week3</a>
<br/>
<a href="register.jsp">Register-getParameter-week3</a>
<br/>
<a href="config">Config parameter-week4</a>
<br/>
<a href="register.jsp">register JDBC -week4</a>
<br/>
<a href="login.jsp">Login week5</a>
-->

<form method="get" target="_blank" action="search">
    <input tyoe="text" name="txt" size="30">
    <select name="search">
        <option value="baidu">baidu</option>
        <option value="bing">bing</option>

        //my google browser can not open...
        <option value="google">google</option>
    </select>
    <input type="submit" value="search" >
</form>


<%@include file="footer.jsp"%>>
</body>
</html>