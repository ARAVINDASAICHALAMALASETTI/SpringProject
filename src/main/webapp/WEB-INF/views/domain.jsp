<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

<head>

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
                <div = "d-flex flex-row justify-content-right">
                <h2 class="mt-5 center">Thank you...your record has been added to the database</h2>
                                    <a>
                    	<button class="btn btn-primary" onclick="Previous()">Back</button>
                    	</a>
                    	<h4 class="mt-5 center">Check your data is added or not in database..,press the button <p class="text-primary" >Get Author's List.</p> </h4>
                    	
                    <a href = "/author/GetAuthorServlet">
                    	<button class="btn btn-primary">Get Author's List</button>
                    	</a>
                    	</div>
                        
                    
                </div>
            </div>
       </div>
    </div>
    <script>function Previous(){
    	window.history.back()
    }</script>
</body>

</html>