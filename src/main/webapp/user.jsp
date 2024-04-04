<%@ page import="Week3homework.user" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 24825
  Date: 2024/3/26
  Time: 13:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User</title>

</head>
<body>
    <table border="1">
        <thead>
            <tr>
                <th>username</th>
                <th>password</th>
                <th>email</th>
                <th>gender</th>
                <th>brithdate</th>
            </tr>
        </thead>
        <tbody>
        <%
            ArrayList<user> list = (ArrayList<user>) request.getAttribute("list");
            for (user User : list) {
        %>
            <tr>
                <td><%=User.getUsername()%></td>
                <td><%=User.getPassword()%></td>
                <td><%=User.getEmail()%></td>
                <td><%=User.getGender()%></td>
                <td><%=User.getBrithdate()%></td>
            </tr>
        <%
            }
        %>>
        </tbody>
    </table>
</body>
</html>
