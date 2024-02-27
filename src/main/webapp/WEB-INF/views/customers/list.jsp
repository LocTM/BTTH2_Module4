<%--
  Created by IntelliJ IDEA.
  User: tranminhloc
  Date: 27/02/2024
  Time: 08:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>DANH SACH KHACH HANG</h1>
<table>
    <tr>
        <td>Id</td>
        <td>Name</td>
        <td>Email</td>
        <td>Address</td>
    </tr>
    <c:forEach items= "${ds}" var="kh">
        <tr>
            <td>${kh.id}</td>
            <td>${kh.name}</td>
            <td>${kh.email}</td>
            <td>${kh.address}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
