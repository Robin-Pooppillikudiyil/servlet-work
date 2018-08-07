<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>

<style>
body {
	background-image: url("background.jpg");
	background-position: 50% 50%;
	background-repeat: repeat;
}

div {
	padding-top: 110px;
	padding-right: 30px;
	padding-bottom: 50px;
	padding-left: 80px;
}
</style>

<script>
	function validate() {
		var fullname = document.form.fullname.value;
		var email = document.form.email.value;
		var username = document.form.username.value;
		var password = document.form.password.value;
		var conpassword = document.form.conpassword.value;

		if (fullname == null || fullname == "") {
			alert("Full Name can't be blank");
			return false;
		} else if (email == null || email == "") {
			alert("Email can't be blank");
			return false;
		} else if (username == null || username == "") {
			alert("Username can't be blank");
			return false;
		} else if (password.length < 6) {
			alert("Password must be at least 6 characters long.");
			return false;
		} else if (password != conpassword) {
			alert("Confirm Password should match with the Password");
			return false;
		}
	}
	function validateEmail(emailField) {
		var reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;

		if (reg.test(emailField.value) == false) {
			alert('Invalid Email Address');
			return false;
		}

		return true;

	}
</script>
</head>
<body>
	<div>
		<center>
			<h2>Registration Form</h2>
		</center>
		<form action="RegisterServlet" name="form" method="post"
			onsubmit="return validate()">
			<table align="center">
				<tr>
					<td>Full Name</td>
					<td><input type="text" name="fullname" /></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="email"
						onblur="validateEmail(this);" /></td>
				</tr>
				<tr>
					<td>Username</td>
					<td><input type="text" name="username" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td>Confirm Password</td>
					<td><input type="password" name="conpassword" /></td>
				</tr>

				<tr>
					<td><%=(request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage")%></td>
				</tr>

				<tr>
					<td></td>
					<td><input type="submit" value="Register"></input> <input
						type="reset" value="Reset"></input></td>
				</tr>

			</table>
		</form>
	</div>
</body>
</html>
