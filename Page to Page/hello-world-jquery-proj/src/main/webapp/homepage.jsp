<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	Hello <%=request.getAttribute("username")%>
	</br> Hello <%=request.getAttribute("username")%>
	</br>
	<b>Hello</b> <%=request.getAttribute("username")%>
	</br>
	<i>Hello <%=request.getAttribute("username")%></br>Hello <%=request.getAttribute("username")%></br></i>
	<h1>Hello <%=request.getAttribute("username")%></h1>
	<strong>STRONG Man</strong>
</body>
</html>