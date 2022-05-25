<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<link rel="styleSheet" href="/css/searchAuthor.css" />
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

					<h3 class="main-heading pt-4 mt-5">Display Author data</h3>
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
							
								<tr>
									<td><c:out value="${searchAuthor.authorId}" /></td>
									<td><c:out value="${searchAuthor.authorName}" /></td>
									<td><c:out value="${searchAuthor.gender}" /></td>
									<td><c:out value="${searchAuthor.bornDate}" /></td>
									<td><c:out value="${searchAuthor.bornLocation}" /></td>
									<td><c:out value="${searchAuthor.bookTheme}" /></td>
									<td><c:out value="${searchAuthor.numberOfBooksPublished}" /></td>
									<td><c:out value="${searchAuthor.lastBookPublishDate}" /></td>
									<td><a
										href="/author/Edit/<c:out value='${searchAuthor.authorId}'/>">
											<button>
												<i class="far fa-edit"></i>
											</button>
									</a></td>
									<td><a
										href="Delete?authorId=<c:out value='${searchAuthor.authorId}'/>">
											<button>
												<i class="fas fa-trash-alt"
													onclick="return confirm('Are You want to Delete')">
											</button></i>
											
									</a></td>
								</tr>

						</tbody>
					</table>
					<div class="center">
						<a href="ReturnMenu"><button class="btn btn-primary">Back</button></a>
					</div>

				</div>
			</div>
		</div>
	</div>

</body>

</html>