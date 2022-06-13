<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<link rel="styleSheet" href="/css/editAuthorData.css" />
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
					<h3 class="main-heading pt-4 mt-5">Edit Author data</h3>
					<form action="/author/Edit" modelAttribute="author" method="post">
						<p class="error">
							<c:out value="${emptyFliedError }"></c:out>
						</p>
						<div class="d-flex flex-row justify-content-center mt-5">

							<input type="hidden" class="todo-user-input mt-2 "
								placeholder="enter username" name="AuthorId"
								value='<c:out value="${author.authorId}" />' />
						</div>
						<div class="d-flex flex-row justify-content-center mt-2">
							<p class="heading m-auto">Author Name</p>
							<input type="text" class="todo-user-input mt-2 "
								placeholder="enter username" name="AuthorName"
								value='<c:out value="${author.authorName}" />' />
						</div>
						<div class="d-flex flex-row justify-content-center mt-2">
							<p class="heading m-auto">Gender</p>
							<input type="text" class="todo-user-input mt-2 "
								placeholder="enter male/female/others" name="Gender"
								value='<c:out value="${author.gender}" />' />
						</div>
						<div class="d-flex flex-row justify-content-center mt-2">
							<p class="heading m-auto">Born</p>
							<input type="date" class="todo-user-input mt-2"
								placeholder="enter born date" name="BornDate"
								value='<c:out value="${author.bornDate}" />' />
						</div>
						<div class="d-flex flex-row justify-content-center mt-2">
							<p class="heading m-auto">Born Location</p>
							<input type="text" class="todo-user-input mt-2"
								placeholder="enter born location" name="BornLocation"
								value='<c:out value="${author.bornLocation}" />' />
						</div>
						<div class="d-flex flex-row justify-content-center mt-2">
							<p class="heading m-auto ">Book theme</p>
							<input type="text" class="todo-user-input mt-2"
								placeholder="enter book theme" name="BookTheme"
								value='<c:out value="${author.bookTheme}" />' />
						</div>
						<div class="d-flex flex-row justify-content-center mt-2">
							<p class="heading m-auto">Publish Book Count</p>
							<input type="text" class="todo-user-input mt-2"
								placeholder="enter book count" name="NumberOfBooksPublished"
								value='<c:out value="${author.numberOfBooksPublished}" />' />
						</div>
						<div class="d-flex flex-row justify-content-center mt-2">
							<p class="heading m-auto">Last Book Date</p>
							<input type="date" class="todo-user-input mt-2"
								placeholder="enter last book publish date"
								name="LastBookPublishDate"
								value='<c:out value="${author.lastBookPublishDate}" />' />
						</div>
						<div class="center mt-5">
							<button class="add-todo-button" type="submit">Submit</button>
						</div>
					</form>
					<div class="center mt-2">
						<a href="/author/GetAuthorServlet"><button class="add-todo-button">Cancel</button></a>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>

</html>