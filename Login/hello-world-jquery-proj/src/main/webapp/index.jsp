<html>

<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<script>
$(document).ready(function(){
	$("button").click(function(){
		
		$.post("loginForm?username=admin&password=dev123",function(data){
			//alert("Data:"+data);
			
			//document.getElementById("serverData").innerHTML=data;
			$("#serverData").html(data);
		});
	});
});
</script>
</head>

<body>
		Username:<input type="text" name="username" value="Admin">
		Password: <input type="password" name="password" value="Password">
		<button >Submit</button>>

<div id="serverData"></div>
</body>

</html>


