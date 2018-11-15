<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Сергей
  Date: 10.10.2018
  Time: 14:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=Cp1251" %>
<html>
<head>
    <title>Users</title>
    <link href="${pageContext.request.contextPath}/css/styles.css" rel="stylesheet" type="text/css">
</head>
<body>
    <table >
        <tr>
            <th>Имя</th>
            <th>День рождения</th>
        </tr>
        <c:forEach items="${users}" var="user">
            <tr onClick="location.href=location.pathname.concat('/${user.id}')">
                <td>${user.name}</td>
                <td>${user.birthDate}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
