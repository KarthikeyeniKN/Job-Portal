<html>
<head>
<!-- Font Awesome -->
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
<meta charset="ISO-8859-1">
<title>Login</title>
<style>
body {
	padding-top: 3.2rem;
	padding-bottom: 4.2rem;
	padding-left: 50rem;
	background-image: url("image/j2.png");
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: 1400px 800px;
	background-opacity: 0.2;
}
h1 {
	font-family: 'Kaushan Script', cursive;
	text-align: center;
}
h4 {
font-family: 'Kaushan Script', cursive;
	text-align: center;
}
.myform {
	padding: 1rem;
	width: 100%;
	background-color: #fff;
	background-clip: padding-box;
	border: 1px solid rgba(0, 0, 0, .2);
	border-radius: 1.1rem;
}
.mybtn {
	border-radius: 50px;
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
<body>
<h1>Joodle Jobs</h1>
<div class="container">
		<div class="row">
			<div class="col-md-9 mx-auto">
				<div id="first">
					<div class="myform form ">
						<div class="logo mb-3">
							<div class="col-md-12 text-center">
								<h1>Login</h1>
							</div>	
						</div>
						<form action="LoginServlet" method="post" name="login">
							<div class="form-group">
								<label for="email">Email Id</label> <input type="email"
									name="email" class="form-control" id="email"
									placeholder="Enter Email" autofocus title="abc12@gmail.com"
										pattern="[a-z0-9]+@[a-z]+.[a-z]{2,}" required>
							</div>
							<div class="form-group">
								<label for="password">Password</label> <input type="password"
									name="password" id="password" class="form-control"
									placeholder="Enter Password" pattern="[a-z0-9]{4,8}" required>
							</div>
							<div class="col-md-12 text-center ">
								<button type="submit"
									class=" btn btn-block mybtn btn-primary tx-tfm">Login</button>
							</div>
							<h4>${ERROR}</h4>
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
									Don't have account? <a href="registeration.jsp" id="signup">Sign
										up here</a>
								</p>
							</div>
						</form>	
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
