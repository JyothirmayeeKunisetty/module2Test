<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Scheduled Sessions</title>
</head>
<body>

<h1>Scheduled Sessions</h1>

<form:form modelAttribute="scheduledsessions">

</form:form>

<table border="1px">
	<tr>
		<th>Session Name</th>
		<th>Duration(Days)</th>
		<th>Faculty</th>
		<th>Mode</th>
	</tr>
	<c:forEach items="${scheduledsessions}" var="scheduledsessions">
		<tr>
			<td>${scheduledsessions.name}</td>
			<td>${scheduledsessions.duration}</td>
			<td>${scheduledsessions.faculty}</td>
			<td>${scheduledsessions.mode1}</td>
			<td><a href="Success">Enroll Me</a>
		</tr>
	</c:forEach>
</table>

</body>
</html>