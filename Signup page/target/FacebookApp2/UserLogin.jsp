<html>
<head>
   <meta name="viewport" content="width=device-width, initial-scale=1">
<style>

.container
{
   position:absolute;
   top: 100px;
   left: 450px;
    margin: 20px;
    max-width: 300px;
    padding: 16px;
    background-color: powderblue;
}
input[type=text], input[type=password] {
    width: 100%;
    padding: 15px;
    margin: 5px 0 22px 0;
    border: none;
    background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
    background-color: #ddd;
    outline: none;
}
</style>
</head>
<body background="images/facebook_cover.jpg">
      <form method = "POST" action ="j_security_check">
         <div class="container">
         <table border = "0">
            <tr>
               <td>Login</td>
               <td><input type = "text" name="j_username"></td>
            </tr>
            <tr>
               <td>Password</td>
               <td><input type = "password" name="j_password"></td>
            </tr>
         </table>
         <input type = "submit" value = "Login!">
         <input type="submit" value = "SignUp" align="right" formaction="/FacebookApp2/SignUp.jsp">
         </div>
      </form>
</body>
</html>
