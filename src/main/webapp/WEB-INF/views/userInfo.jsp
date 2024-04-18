<%@ page import="com.YuWei.model.User" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 24825
  Date: 2024/4/11
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>Title</title>
</head>
<body>
<%@include file="header.jsp"%>

<%User user = (User) request.getAttribute("user");%>
<table>
    <tr><td>username: </td><td><%=user.getUsername()%></td></tr>
    <tr><td>password: </td><td><%=user.getPassword()%></td></tr>
    <tr><td>email: </td><td><%=user.getEmail()%></td></tr>
    <tr><td>gender: </td><td><%=user.getGender()%></td></tr>
    <tr><td>brithdate: </td><td><%=user.getBrithdate()%></td></tr>


</table>

<%@include file="footer.jsp"%>
</body>
</html>
