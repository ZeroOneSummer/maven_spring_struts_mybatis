<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <title>User</title>
        <meta charset="utf-8" />
    </head>
    <body>
        <table>
            <tr>
                <th>ID</th>
                <th>姓名</th>
                <th>性别</th>
                <th>电话</th>
            </tr>
            <c:if test="${!empty data}">
                <c:forEach var="user" items="${data}">
                    <tr>
                        <td align="center">${user.id}</td>
                        <td align="center">${user.name}</td>
                        <td align="center">${user.sex}</td>
                        <td align="center">${user.phone}</td>
                    </tr>
                </c:forEach>
            </c:if>
        </table>
    </body>
</html>
