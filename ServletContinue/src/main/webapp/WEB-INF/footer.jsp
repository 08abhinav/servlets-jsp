<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Footer</title>
</head>
<body>

    <hr />
    <footer>
        <p align="center">
            &copy; <%= java.time.Year.now().getValue() %> Your Company Name. All rights reserved.
        </p>
        <p align="center">
            <a href="index.jsp">Home</a> | 
            <a href="about.jsp">About Us</a> | 
            <a href="contact.jsp">Contact</a> | 
            <a href="privacy.jsp">Privacy Policy</a>
        </p>
    </footer>
    </body>
</html>