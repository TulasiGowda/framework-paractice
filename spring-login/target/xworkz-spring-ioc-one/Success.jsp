<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Click was Success
	<br>
	<br>
	<form action="submit.do">
		Enter Name    <input type="text" name="name" /> <br> <br>
		Enter Address <input type="text" name="text" /> <br> <br>
		Enter Email   <input type="text" name="text" /> <br> <br>
		Enter Phone Number <input type="text" name="text" /> <br> <br>
		Enter Symptoms <input type="text" name="text" /> <br> <br>
		
		Reported By : ${display} <br> <br> <input
			type="submit" value="Send" />
	</form>
</body>
</html>