<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Customer List</title>
    <style>
        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
            padding: 8px;
        }
    </style>
</head>
<body>
    <h2>Customer List</h2>
    <a href="${pageContext.request.contextPath}/customer/showFormForAdd">Add Customer</a>
    <br/><br/>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Phone</th>
            <th>Action</th>
        </tr>
        <c:forEach var="tempCustomer" items="${customers}">
            <c:url var="updateLink" value="/customer/showFormForUpdate">
                <c:param name="customerId" value="${tempCustomer.id}" />
            </c:url>
            <c:url var="deleteLink" value="/customer/delete">
                <c:param name="customerId" value="${tempCustomer.id}" />
            </c:url>
            <tr>
                <td>${tempCustomer.id}</td>
                <td>${tempCustomer.name}</td>
                <td>${tempCustomer.email}</td>
                <td>${tempCustomer.phone}</td>
                <td>
                    <a href="${updateLink}">Update</a> |
                    <a href="${deleteLink}" onclick="return confirm('Are you sure you want to delete this customer?')">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>