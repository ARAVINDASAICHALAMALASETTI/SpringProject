<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<link rel="styleSheet" href="/css/GetData.css" />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"
	integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"
	integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13"
	crossorigin="anonymous"></script>
<script src="https://kit.fontawesome.com/de7f10dd08.js"
	crossorigin="anonymous"></script>

</head>

<body>

	<div class="todos-bg-container pt-5 pb-5">
		<div class="container">
			<div class="row">
				<div class="col-12">
				
					<h3 class="main-heading pt-4 mt-5 mb-3">Display Register User's List</h3>
					
					
					<table>
						<thead>
							<tr>
								<th>Register_Id</th>
								<th>User_name</th>
								<th>Gender</th>
								<th>E_mail</th>
								<th>Password</th>
								<th>Phone_Number</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${registerList}" var="register">
								<tr>
									<td><c:out value="${register.registerId}" /></td>
									<td><c:out value="${register.userName}" /></td>
									<td><c:out value="${register.gender}" /></td>
									<td><c:out value="${register.email}" /></td>
									<td><c:out value="${register.password}" /></td>
									<td><c:out value="${register.phoneNumber}" /></td>
									
									
								</tr>
							</c:forEach>
						</tbody>
					</table>
					<div class="center">
						<a href="/Menu"><button class="btn btn-primary">Back</button></a>
					</div>

				</div>
			</div>
		</div>
	</div>

</body>

</html>