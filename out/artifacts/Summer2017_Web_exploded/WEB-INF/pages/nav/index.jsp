<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kopylov
  Date: 18.06.2017
  Time: 18:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>Main</title>
    <link type="text/css" rel="stylesheet" href='<c:url value="../../resources/bootstrap/css/bootstrap.min.css"/> '/></head>
<body>
<div class="container">
    <div class="row">
        <div class="col-sm-2">Logo</div>
        <div class="col-sm-2"><a href="<c:url value="/"/>">Home</a></div>
        <div class="col-sm-2"><a href="<c:url value="/shop"/>">Shop</a></div>
        <div class="col-sm-2">About</div>
        <div class="col-sm-2"><a href="<c:url value="/registration"/>">Registration</a></div>
        <div class="col-sm-2">Login</div>
    </div>
</div>
</body>
</html>
