<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
	.Header{
  border: 1px outset black;
  background-color: lightblue;
  text-align: center;
}

.One{
	border-radius: 5px;
 	background-color: #f2f2f2;
  	padding: 20px;
}

 .Second{
 background-color: lightblue;
 padding: 5px;
 }
</style>
<meta charset="ISO-8859-1">
<title>UserLogin</title>
</head>
<body>
	<div class="Header">
		<h1>Welcome to FlyAway !</h1>
		<h2 >Live with  NO EXCUSES - Travel with NO REGRETS</h2><br>
	</div>
	
	<div class="One">
	<h2>User Login</h2>
	<form action="UserLogin" method="post">
        Enter your Email : <input type="text" name="email"  ><br><br>
        Enter your Password : <input type="password" name="pass" ><br><br>
        <button class="Second" type="submit" value="Submit"><b>Sign In</b></button>
	</form>
	</div>
</body>
</html>