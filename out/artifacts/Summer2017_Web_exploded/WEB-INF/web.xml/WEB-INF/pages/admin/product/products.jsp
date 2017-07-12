<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kopylov
  Date: 30.06.2017
  Time: 9:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link type="text/css" rel="stylesheet" href='<c:url value="../../resources/bootstrap/css/bootstrap.min.css"/> '/>
    <title>Products</title>
</head>
<body>
<div class="table-responsive">
    <table class="table table-responsive">
        <tr>
            <td>Id</td>
            <td>Product name</td>
            <td>Category</td>
            <td>Description</td>
            <td>Cost</td>
            <td>Brand name</td>
            <td>Amount</td>
        </tr>
        <c:forEach var="products" items="${requestScope.products}">
            <tr>
                <td>${products.id}</td>
                <td>${products.pName}</td>
                <td>${products.productCategories.getCategoryName()}</td>
                <td>${products.description}</td>
                <td>${products.cost}</td>
                <td>${products.brandName}</td>
                <td>${products.amount}</td>
            </tr>
        </c:forEach>
    </table>
</div>
<a class="btn btn-default" href="<c:url value="/admin/product/add"/>" role="button">Add new product</a>
</body>
</html>
