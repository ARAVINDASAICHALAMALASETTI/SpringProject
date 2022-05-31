<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>

<head>
<link rel="styleSheet" href="/css/addBook.css" />
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
<script src="https://kit.fontawesome.com/de7f10dd08.js" crossorigin="anonymous"></script>  
    
</head>

<body>
    <div class= pt-5 pb-5">
        <div class="container">
            <div class="row">
                <div class="col-12">
                <div class="center">
                    <h3 class="main-heading pt-4 mt-5 mb-2">Add Book's Data</h3>
                    
                    </div>
                    <form:form action = "/book/add" modelAttribute="person" method="post">
					
                    <div class="mt-5">
                        <form:input type="hidden" class="todo-user-input mt-2" path="authorId" value="${authorId}"/>
                    </div>
                    <p class= "center"><form:errors path ="bookName" /></p>
                    <div class="d-flex flex-row justify-content-center mt-2">
                        <p class="heading m-auto">Book Name</p>
                        <form:input class="todo-user-input mt-2 " placeholder="enter book name" path = "bookName"/>
                    </div>
               		<p class= "center"><form:errors path ="bookPagesCount" /></p>
                    <div class="d-flex flex-row justify-content-center mt-2">
                        <p class="heading m-auto">Book Pages</p>
                        <form:input type="number" class="todo-user-input mt-2" placeholder="enter pages count" path = "bookPagesCount"/>
                    </div>
              		<p class= "center"><form:errors path ="bookPublishDate" /></p>
            		<div class="d-flex flex-row justify-content-center mt-2">
                        <p class="heading m-auto">Book Publish Date</p>
                        <form:input type="date" class="todo-user-input mt-2" placeholder="enter (yyyy-mm-dd) date" path = "bookPublishDate"/>
                    </div>
                    <p class= "center"><form:errors path="jointAuthorship" /></p>
                    <div class="d-flex flex-row justify-content-center mt-2">
                        <p class="heading m-auto ">Joint Authorship</p>
                        <form:input class="todo-user-input mt-2" placeholder="enter author names" path = "jointAuthorship" />
                    </div>
                    <p class= "center"><form:errors path="bookLanguage" /></p>
                    <div class="d-flex flex-row justify-content-center mt-2">
                        <p class="heading m-auto">Book Language</p>
                        <form:input class="todo-user-input mt-2" placeholder="enter book language" path = "bookLanguage"  />
                    </div>
                    <p class= "center"><form:errors path="bookPrice" /></p>
                    <div class="d-flex flex-row justify-content-center mt-2">
                        <p class="heading m-auto">Book Price</p>
                        <form:input class="todo-user-input mt-2" placeholder="enter book price" path = "bookPrice" />
                    </div>
                    <p class= "center"><form:errors path="publishment" /></p>
                    <div class="d-flex flex-row justify-content-center mt-2">
                        <p class="heading m-auto">Book Publishment</p>
                        <form:input class="todo-user-input mt-2" placeholder="enter type of publishment" path = "publishment" />
                    </div>
                   
                   <div class="center mt-5">
                        <form:button class="add-todo-button">Add</form:button>
                    </div>
                    </form:form> 
                </div>
            </div>
        <div class="d-flex justify-content-end p-2">
        <a href="/author/GetAuthorServlet"><button class = "btn btn-primary">Back</button></a>
        </div>
    </div>
</body>

</html>