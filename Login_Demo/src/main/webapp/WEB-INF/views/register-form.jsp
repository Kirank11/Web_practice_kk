<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h2>User Registeration Form</h2>
<form:form action="user_data" modelAttribute="user">
Enter Full Name : <form:input path="name"/>
<br><br>
Enter Password : <form:input path="password"/>
<br><br>
Enter Email : <form:input path="email"/>
<br><br>
<form:button>Register</form:button>
</form:form>
</div>
</body>
</html>