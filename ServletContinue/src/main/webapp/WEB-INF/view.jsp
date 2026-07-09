<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Tags in JSP</h1>
	
	<%--This is comment tag and the next tag is Declaration tag --%>
	<%! String name = "view.jsp";%>
	
	<%--Scriptlet Tag--%>
	<% 
		out.println("This is inside Scriptlet Tag"+ "<br/>"+name+ "<br/>"	);
	%>
	
	<%--Expression Tag --%>
	<%=
		100 + 100 
	%>
	<%@ include file="footer.jsp" %>
</body>
</html>