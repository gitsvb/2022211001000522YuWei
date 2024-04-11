<%--
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
<table>
    <tr><td>username</td><td><%=request.getAttribute("username")%></td></tr>
    <tr><td>password</td><td><%=request.getAttribute("password")%></td></tr>
    <tr><td>email</td><td><%=request.getAttribute("email")%></td></tr>
    <tr><td>gender</td><td><%=request.getAttribute("gender")%></td></tr>
    <tr><td>brithdate</td><td><%=request.getAttribute("brithdate")%></td></tr>


</table>
<%@include file="footer.jsp"%>
</body>
</html>
