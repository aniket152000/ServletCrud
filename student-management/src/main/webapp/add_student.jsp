<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="all_css.jsp" %>
</head>
<body class="bg-light">
<%@include file="navbar.jsp" %>

<div class="container p-4" >
	<div class="row">
		<div class="col-md-6 offset-md-3">
			<div class="card">
				<div class="card-body">
					<p class="fs-3 text-center">Add Student</p>
					
			
					
					
<form action="register" method="post">
					
<div class="form-group">
    <label >Full Name</label>
    <input type="text" class="form-control" placeholder="Enter name" name="name">
  </div>
  
  <div class="form-group">
    <label >Date Of Birth</label>
    <input type="date" class="form-control" placeholder="Enter dob" name="dob">
  </div>
  
   <div class="form-group">
    <label >Address</label>
    <input type="text" class="form-control" placeholder="Enter address" name="address">
  </div>
  
  <div class="form-group">
    <label >Qualification</label>
    <input type="text" class="form-control" placeholder="Enter qualification" name="qualification">
  </div>
  
  <div class="form-group">
    <label >Email address</label>
    <input type="email" class="form-control" placeholder="Enter email" name="email">
  </div>
  
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
				</div>
			</div>
		</div>
	</div>
</div>

</body>
</html>