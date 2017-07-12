<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<html>
<head>
    <title>Регистрация</title>
</head>
<body>
<h1>Registration</h1>
<c:url var="reg" value="/registration/add"/>
<form:form action="${reg}" modelAttribute="user">
    <table>
        <tr>
            <td><form:label path="fName">
                <spring:message text="Имя"/>
            </form:label></td>
            <td><form:input path="fName" type="text"/></td>
        </tr> <tr>
        <td><form:label path="lName">
            <spring:message text="Фамилия"/>
        </form:label></td>
        <td><form:input path="lName" type="text"/></td>
    </tr> <tr>
        <td><form:label path="email">
            <spring:message text="Email"/>
        </form:label></td>
        <td><form:input path="email" type="text"/></td>
    </tr><tr>
        <td><form:label path="password">
            <spring:message text="Пароль"/>
        </form:label></td>
        <td><form:input path="password" type="password"/></td>
    </tr>
        <tr>
            <td>
                <input type="submit" value="<spring:message text="Sign"/> "/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>