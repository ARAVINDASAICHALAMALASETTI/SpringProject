<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="styleSheet" href="/css/home.css" />
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

	<nav class="navbar navbar-expand-lg navbar-light bg-color fixed-top">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src="https://i.etsystatic.com/11216025/r/il/33aa90/3587580564/il_340x270.3587580564_lj6w.jpg"
				class="nav-image mb-1" />
			</a>
			<button class="navbar-toggler bg-light" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup"
				aria-controls="navbarNavAltMarkup" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
				<div class="navbar-nav m-auto">
					<a class="nav-link active text-white" aria-current="page" href="#">Home</a>
					<a class="nav-link active text-white" href="/author/Add">Add
						data</a> <a class="nav-link active text-white"
						href="/author/GetAuthorServlet">Get All Data</a>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle text-white" href="#"
						id="navbarDropdownMenuLink" role="button"
						data-bs-toggle="dropdown" aria-expanded="false"> Books </a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
							
							<li><a class="dropdown-item" href="/book/GetBookServlet">Get
									All Books Data</a></li>
							<li><a class="dropdown-item" href="/author/GetAllRegisterUsers">Get
							Register User's List</a></li>
						</ul></li>
				</div>
				<a class="nav-link active text-white" href="Logout">Logout</a>


			</div>
		</div>
	</nav>




</body>
</html>