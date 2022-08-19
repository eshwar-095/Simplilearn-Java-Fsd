<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Record Updated Successfully!</h3>
<c:set var="s" value="${info }"></c:set>
Student Id : ${s.id } <br>
Student Name : ${s.name } <br>
Email Id : ${s.email } <br>
Password : ${s.password } <br>
<br><br>
<a href="index.jsp">view</a>

</body>
</html>