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
                    <h3 class="main-heading pt-4 mt-5 mb-2">Register form</h3>
                    
                    </div>
                    <form:form action = "/author/addRegister" modelAttribute="registerForm" method="post">
					
                    <div class="mt-5">
                        <form:input type="hidden" class="todo-user-input mt-2" path="registerId" value="${registerId}"/>
                    </div>
                    <p class= "center"><form:errors path ="userName" /></p>
                    <div class="d-flex flex-row justify-content-center mt-2">
                        <p class="heading m-auto">UserName</p>
                        <form:input class="todo-user-input mt-2 " placeholder="enter username" path = "userName"/>
                    </div>
                    <p class= "center"><form:errors path ="gender" /></p>
                    <div class="d-flex flex-row justify-content-center mt-2">
                        <p class="heading m-auto">Gender</p>
                        <form:input class="todo-user-input mt-2 " placeholder="enter gender" path = "gender"/>
                    </div>
                    <p class= "center"><form:errors path ="Email" /></p>
                    <div class="d-flex flex-row justify-content-center mt-2">
                        <p class="heading m-auto">E-mail</p>
                        <form:input class="todo-user-input mt-2 " placeholder="enter email" path = "Email"/>
                    </div>
               		<p class= "center"><form:errors path ="password" /></p>
                    <div class="d-flex flex-row justify-content-center mt-2">
                        <p class="heading m-auto">Password </p>
                        <form:input type = "password" class="todo-user-input mt-2" placeholder="enter password" path = "password"/>
                    </div>
                    <p class= "center"><form:errors path="phoneNumber" /></p>
                    <div class="d-flex flex-row justify-content-center mt-2">
                        <p class="heading m-auto ">PhoneNumber</p>
                        <form:input type = "number" class="todo-user-input mt-2" placeholder="enter  phoneNumber" path = "phoneNumber" />
                    </div>
                   <div class="center mt-5">
                        <form:button class="add-todo-button">Submit</form:button>
                    </div>
                    </form:form> 
                </div>
            </div>
        <div class="d-flex justify-content-end p-2">
        <a href="/author/addRegister"><button class = "btn btn-primary">Cancel</button></a>
        </div>
    </div>
</body>

</html>