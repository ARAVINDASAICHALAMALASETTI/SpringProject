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

					<h3 class="main-heading pt-4 mt-5 mb-3">Display Author's data</h3>
					
					<form action="/author/searchAuthor">
					<c:out value='${inValid data}'/>
					<input type="text" placeholder="Enter data" name ="authorId" name="authorName" name="bornLocation" name="bookTheme">
					<button class="btn btn-primary" type="submit">search</button>
					</form>
					<table>
						<thead>
							<tr>
								<th>Author_Id</th>
								<th>Author_Name</th>
								<th>Gender</th>
								<th>Born</th>
								<th>Born_Location</th>
								<th>Book_theme</th>
								<th>Publish_Book_Count</th>
								<th>Last_Book_Publish_Date</th>
								<th>Action's</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${authorList}" var="author">
								<tr>
									<td><c:out value="${author.authorId}" /></td>
									<td><c:out value="${author.authorName}" /></td>
									<td><c:out value="${author.gender}" /></td>
									<td><fmt:formatDate type = "date" value="${author.bornDate}" /></td>
									<td><c:out value="${author.bornLocation}" /></td>
									<td><c:out value="${author.bookTheme}" /></td>
									<td><c:out value="${author.numberOfBooksPublished}" /></td>
									<td><c:out value="${author.lastBookPublishDate}" /></td>
									<td><a
										href="/author/Edit/<c:out value='${author.authorId}'/>">
											<button>
												<i class="far fa-edit"></i>
											</button>
									</a></td>
									<td><a
										href="Delete?authorId=<c:out value='${author.authorId}'/>">
											<button>
												<i class="fas fa-trash-alt"
													onclick="return confirm('Are You want to Delete')">
											</button></i>
											
									</a></td>
									<td><a
										href="/book/add?authorId=<c:out value='${author.authorId}'/>"><button>
												<i class="fas fa-plus-circle"></i>
											</button></a></td>
									<td><a
										href="/book/FindAuthorById?authorId=<c:out value='${author.authorId}'/>"><button>
												<i class="fas fa-eye"></i>
											</button></a></td>


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