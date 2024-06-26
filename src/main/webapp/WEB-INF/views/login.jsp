<%--
  Created by IntelliJ IDEA.
  User: 24825
  Date: 2024/3/31
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        * {
            margin: 0;
            padding: 0;
        }
        html {
            height: 100%;
        }
        body {
            height: 100%;
        }
        .container {
            height: 100%;
            background-image: linear-gradient(to right, #fbc2eb, #a6c1ee);
        }
        .login-wrapper {
            background-color: #fff;
            width: 358px;
            height: 588px;
            border-radius: 15px;
            padding: 0 50px;
            position: relative;
            left: 50%;
            top: 50%;
            transform: translate(-50%, -50%);
        }
        .header {
            font-size: 38px;
            font-weight: bold;
            text-align: center;
            line-height: 200px;
        }
        .input-item {
            display: block;
            width: 100%;
            margin-bottom: 20px;
            border: 0;
            padding: 10px;
            border-bottom: 1px solid rgb(128, 125, 125);
            font-size: 15px;
            outline: none;
        }
        .input-item::placeholder {
            text-transform: uppercase;
        }
        .submit {
            text-align: center;
            padding: 10px;
            width: 100%;
            margin-top: 40px;
            background-image: linear-gradient(to right, #a6c1ee, #fbc2eb);
            color: #fff;
        }
        .msg {
            text-align: center;
            line-height: 88px;
        }
        a {
            text-decoration-line: none;
            color: #abc1ee;
        }
    </style>
</head>
<body>
<%@include file="header.jsp"%>
<%
if(!(request.getAttribute("message")==null)){
    out.print("<h3>"+request.getAttribute("message")+"</h3>");
}%>
<div class="container">
    <div class="login-wrapper">
        <div class="header">Login</div>
        <div class="form-wrapper">
           <form action="login" method="post">
               <input type="text" name="username" placeholder="username" class="input-item">
               <input type="password" name="password" placeholder="password" class="input-item">
               <input class="submit" Type="submit" name="submit" value="Login in">
           </form>


        </div>
        <div class="msg">
            Don't have account?
            <a href="register.jsp">Sign up</a>
        </div>
    </div>
</div>
<%@include file="footer.jsp"%>
</body>
</html>
