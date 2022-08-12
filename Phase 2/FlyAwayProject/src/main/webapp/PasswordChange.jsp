<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="com.flyaway.AdminLogin" %>
<!DOCTYPE html>
<html>
<head>
<style>
	h1{
	border: 1px outset dashed;
  	background-color: lightblue;
 	text-align: left;
 	padding: 20px;
	}
	
	.one{
	border-radius: 5px;
 	background-color: #f2f2f2;
  	padding: 20px;
  	font: bo
  	text-align: left;
	}

 	.second{
 	background-color: lightblue;
 	padding: 5px;
 	font: bold;
  	text-align: left;
 	}
</style>
<meta charset="ISO-8859-1">
<title>Change Password</title>
</head>
<body>
	 <h1>Password Changing Portal !</h1>
            <%
            if (AdminLogin.isLoggedIn) {
            %>
            <div class="one">
                <form action="ChangePassword" method="post">
                   <label><b>Email : admin123@gmail.com </b></label><br><br>
 				   <label for="newPassword" >Enter New Password :</label>
                   <input type="password" name="newPassword" >
                   <button class="second" type="submit">  Change Password</button>
                </form>
            </div>
            <%
            }
            else {
                out.print("You must Login first");
            }
            %>
</body>
</html>