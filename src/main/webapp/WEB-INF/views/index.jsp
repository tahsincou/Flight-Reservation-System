<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Management System</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
	<div class="container">

		<h2 style="text-align: center;">Employee List</h2>
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th>ID</th>
					<th>Email</th>
					<th>Name</th>
				</tr>
			</thead>
			<tbody>
				<tr th:each="employee : ${listEmployees}">
					<td th:text="${employee.id}"></td>
					<td th:text="${employee.name}"></td>
					<td th:text="${employee.email}"></td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>