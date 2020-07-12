<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Click was Successful
	<br>
	<br>
	<form action="submit.do">
		Enter Name    <input type="text" name="name" /> <br> <br>
		Enter Address <input type="text" name="address" /> <br> <br>
		Enter Email   <input type="email" name="email" /> <br> <br>
		Enter PhoneNumber <input type="phone" name="phoneNumber" /> <br> <br>
		Enter Symptoms <input type="text" name="symptoms" /> <br> <br>
		
		
		<input type="submit" value="Send" />
	</form>
	<br>
	
	Reported By : ${display} <br> <br> 
</body>
</html>

