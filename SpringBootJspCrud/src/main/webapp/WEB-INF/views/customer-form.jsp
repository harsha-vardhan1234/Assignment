<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Customer Form</title>
</head>
<body>
    <h2>Customer Form</h2>
    <form:form action="${pageContext.request.contextPath}/customer/saveCustomer" modelAttribute="customer" method="POST">
        <form:hidden path="id" />
        <table>
            <tr>
                <td>Name:</td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><form:input path="email" /></td>
            </tr>
            <tr>
                <td>Phone:</td>
                <td><form:input path="phone" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Save" /></td>
            </tr>
        </table>
    </form:form>
    <br/>
    <a href="${pageContext.request.contextPath}/customer/list">Back to List</a>
</body>
</html>
