<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel=stylesheet href="./css/loginform.css">
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
</head>
<body>

	<div class="change">
		<form action="Login" method="post">
			<div class="center">
				<h1 class="Page">Login</h1>
				
				<p class="error">
					<c:out value="${loginError}"></c:out>
			</div>
			<div class="center mt-3">
				<p class="heading">Email</p>
				<input type="email" name="username" placeholder="enter username"
					id="email" oninput="checker()" />

				<p class="heading mt-2">Password</p>
				<input type="password" name="password" placeholder="enter password"
					id="pin" oninput="check()" />

				<div class=" remember m-2">
					<input type="checkbox"><span class="word1 p-1">Remember
						me </span>
				</div>
				<button class="submit mb-5" onclick="Login()">Login</button>
			</div>

		</form type="submit">
	</div>




</body>

</html>