<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kopylov
  Date: 29.06.2017
  Time: 18:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin panel</title>
    <link type="text/css" rel="stylesheet" href='<c:url value="../../resources/bootstrap/css/bootstrap.min.css"/> '/>
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="col-sm-3"><a href="<c:url value="/admin/products"/>">Product</a></div>
            <div class="col-sm-3"><a href="<c:url value="/admin/users"/>">User</a></div>
            <div class="col-sm-3"><a href="<c:url value="/admin/orders"/>">Order</a></div>
            <div class="col-sm-3"><a href="<c:url value="/admin/banlist"/>">Banlist</a></div>
        </div>
    </div>
</body>
</html>
