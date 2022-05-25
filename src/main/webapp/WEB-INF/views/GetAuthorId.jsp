<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<link rel="styleSheet" href="/css/GetAuthorId.css" />
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
<script src="https://kit.fontawesome.com/de7f10dd08.js" crossorigin="anonymous"></script>  
    
</head>

<body>
    
    <div class="pt-5 pb-5">
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <div class="center">
                    <h3 class="main-heading pt-4 mt-5">View Book's data</h3>
                </div>
        <table>
            <thead>
        <tr>
                <th>Author_Id</th>
                <th>Book_Name</th>
                <th>Book_Pages</th>
                <th>Book_Publish_Date</th>
                <th>Joint_Authorship</th>
                <th>Book_Language</th>
                <th>Book_Price</th>
                <th>Publishment</th>
                 <th>Book_Id</th>
                
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${booksList}" var="book">
                <tr>
                  	<td><c:out value="${book.authorId}" /></td>
                     <td><c:out value="${book.bookName}" /></td> 
                    <td><c:out value="${book.bookPagesCount}" /></td>
                    <td><c:out value="${book.bookPublishDate}" /></td>
                    <td><c:out value="${book.jointAuthorship}" /></td>
                    <td><c:out value="${book.bookLanguage}" /></td>
                    <td><c:out value="${book.bookPrice}" /></td>
                    <td><c:out value="${book.publishment}" /></td>
                     <td><c:out value="${book.bookId}" /></td>
                    <td><a href="/book/edit/<c:out value="${book.bookId}"/>">
                    <button><i class="far fa-edit"></i></button></td>
                    <td><a href="/book/delete?bookId=<c:out value="${book.bookId}"/>">
                    <button><i class="fas fa-trash-alt" onclick="return confirm('Are You Sure want to Delete')"></button></i></td>
                </tr>
            </c:forEach>
        </tbody>
        </table>
        <div class="right"><a href="/author/GetAuthorServlet"><button class="btn btn-primary">Back</button></a></div>
       
    </div>
    </div>
    </div>
    </div>
   
</body>

</html>