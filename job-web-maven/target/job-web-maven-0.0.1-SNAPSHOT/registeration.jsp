<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">

<link href="https://fonts.googleapis.com/css?family=Kaushan+Script"
	rel="stylesheet">
<link
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet"
	integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN"
	crossorigin="anonymous">
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script type="text/javascript"
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-show-password/1.0.3/bootstrap-show-password.min.js"></script>

<meta charset="ISO-8859-1">
<title>Registration</title>
<style>
body {
	padding-top: 0.5rem;
	padding-bottom: 4.2rem;
	padding-left: 50rem;
	background-image: url("image/j2.png");
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: 1400px 800px;
	background-opacity: 0.2;
	background-image: url("image/j2.png")
}

h1 {
	font-family: 'Kaushan Script', cursive;
	text-align: center;
}

.myform {
	padding: 1rem;
	width: 100%;
	font-style: arial;
	background-color: #fff;
	background-clip: padding-box;
	border: 1px solid rgba(0, 0, 0, .2);
	border-radius: 1.1rem;
}

.form {
	font-family: arial;
}

.login-or {
	position: relative;
	color: #aaa;
	margin-top: 10px;
	margin-bottom: 10px;
	padding-top: 10px;
	padding-bottom: 10px;
}

.span-or {
	display: block;
	position: absolute;
	left: 50%;
	top: -2px;
	margin-left: -25px;
	background-color: #fff;
	width: 50px;
	text-align: center;
}

.hr-or {
	height: 1px;
	margin-top: 0px !important;
	margin-bottom: 0px !important;
}
</style>
</head>
<body>
	<h1>Joodle Jobs</h1>
	<div class="container">
		<div class="row">
			<div class="col-md-12 mx-auto">
				<div id="first">
					<div class="myform form ">
						<div class="logo mb-5">
							<div class="col-md-12 text-center">
								<h1>Registration</h1>
							</div>
						</div>
						<form action="RegisterationServlet" method="post" id="form">
							<div class="form-group row">
								<label for="security" class="col-sm-4 col-form-label">Full
									Name</label>
								<div class="col-sm-6">
									<input type="text" class="form-control" name="fname"
										id="security" placeholder="Enter name" title="4-15 Characters,a-z,A-Z,space is only allowed"
									pattern="[A-Za-z- ]{4,15}" required maxlength="15">
								</div>
							</div>
							<div class="form-group row">
								<label for="security" class="col-sm-4 col-form-label">Email
									Address</label>
								<div class="col-sm-6">
									<input type="text" class="form-control" name="email"
										id="security" placeholder="Enter email" title="abc12@gmail.com" 
										pattern="[a-z0-9]+@[a-z]+.[a-z]{2,}" required>
								</div>
							</div>
							<div class="form-group row">
								<label for="security" class="col-sm-4 col-form-label">Create
									Password</label>
								<div class="col-sm-6">
									<input type="password" class="form-control" name="password"
										id="security" placeholder="Create password" pattern="[a-z0-9]{4,8}" required>
								</div>
							</div>
							<div class="form-group row">
								<label for="security" class="col-sm-4 col-form-label">Phone
									Number</label>
								<div class="col-sm-6">
									<input type="tel" class="form-control" name="phoneno"
										id="security" placeholder="Enter phoneno" title="only digits allowed" pattern="[6-9]{1}[0-9]{9}" maxlength="10"
										required>
								</div>
							</div>
							<div class="col-md-12 text-center">
								<button type="submit" class="btn btn-primary">Sign Up</button>
							</div>
							<div class="col-md-12 ">
								<div class="login-or">
									<hr class="hr-or">
									<span class="span-or">or</span>
								</div>
							</div>
							<!-- <div class="form-group">
								<p class="text-center">
									Don't you remember your password? <a href="forgotpassword.html"
										id="forgotpassword">Click here</a>
								</p>
							</div> -->
							<div class="form-group">
								<p class="text-center">
									Do have account? <a href="index.jsp" id="signin">Sign in
										here</a>
								</p>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	</script>
</body>
</html>