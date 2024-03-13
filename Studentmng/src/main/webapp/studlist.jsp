<%@page import="com.StudentPojo.StudPojo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Student Data</title>
</head>
<body>
	<%
	ArrayList<StudPojo> objects = (ArrayList<StudPojo>) request.getAttribute("objects");
	%>

	<table>
		<tr>
		<th><b>Id</b></th>
		<th><b>Name</b></th>
		<th><b>Roll no.</b></th>
		<th><b>Department</b></th>
		<th><b>Obtain Marks</b></th>
		<th><b>Total Marks</b></th>
		<th><b>Average</b></th>
		<th><b>Percentage</b></th>

		</tr>


	</table>


</body>
</html>