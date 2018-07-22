<html>
<head>
</head>
<body>

	<form action="<%=request.getContextPath()%>/loginForm" method="post">
		Username:<input type="text" name="username" value="Admin"></br>
		Password: <input type="password" name="password" value="Password"></br>
		<input type="submit" value="Submit">
	</form>

</body>
</html>