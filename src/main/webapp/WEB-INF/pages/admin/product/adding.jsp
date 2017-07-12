<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kopylov
  Date: 30.06.2017
  Time: 18:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add new product</title>
</head>
<body>
<c:url var="add" value="/admin/product/add"/>
<form:form action="${add}" modelAttribute="productDTO">
    <table>
        <tr>
            <td><form:label path="pName">
                <spring:message text="Product name"/>
            </form:label></td>
            <td><form:input path="pName" type="text"/></td>
        </tr> <tr>
        <td><form:label path="description">
            <spring:message text="Description"/>
        </form:label></td>
        <td><form:input path="description" type="text"/></td>
    </tr> <tr>
        <td><form:label path="cost">
            <spring:message text="Cost"/>
        </form:label></td>
        <td><form:input path="cost" type="text"/></td>
    </tr><tr>
        <td><form:label path="brandName">
            <spring:message text="Brand"/>
        </form:label></td>
        <td><form:input path="brandName" type="text"/></td>
    </tr><tr>
        <td><form:label path="amount">
            <spring:message text="Amount"/>
        </form:label></td>
        <td><form:input path="amount" type="text"/></td>
        <tr>
        <tr>
            <td><form:label path="productCategories">
                <spring:message text="Product category"/>
            </form:label></td>
            <td>
                <form:select path="productCategories" type="text" >
                    <c:forEach items="${requestScope.categories}" var="categories">
                        <option value=${categories.category}>${categories.categoryName}</option>
                    </c:forEach>
                </form:select>

            </td>
        </tr>

        <tr>
            <td>
                <input type="submit" value="<spring:message text="Add"/> "/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
