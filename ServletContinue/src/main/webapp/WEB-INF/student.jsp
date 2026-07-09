<%@page import="com.Abhinav.MVCDemo.Model.StudentModel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Details</title>
<style>
    table {
        width: 40%;
        border-collapse: collapse;
        margin-top: 20px;
    }
    th, td {
        border: 1px solid #dddddd;
        text-align: left;
        padding: 8px;
    }
    th {
        background-color: #f2f2f2;
    }
</style>
</head>
<body>
    <h2>Welcome, Below are your details.</h2>
    
    <% 
        StudentModel sm = (StudentModel) request.getAttribute("studentdata");
    %>

    <table>
        <tr>
            <th>Field</th>
            <th>Value</th>
        </tr>
        <tr>
            <td><strong>Name</strong></td>
            <td><%= sm.getName() %></td>
        </tr>
        <tr>
            <td><strong>Age</strong></td>
            <td><%= sm.getAge() %></td>
        </tr>
        <tr>
            <td><strong>Mobile</strong></td>
            <td><%= sm.getMobile() %></td>
        </tr>
        <tr>
            <td><strong>Address</strong></td>
            <td><%= sm.getAddress() %></td>
        </tr>
    </table>
</body>
</html>