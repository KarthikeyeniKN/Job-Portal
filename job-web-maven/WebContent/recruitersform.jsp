<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Font Awesome -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<!-- Bootstrap core CSS -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Material Design Bootstrap -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.5.8/css/mdb.min.css"
	rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">

<title>RecruitersForm</title>
<style>
#Recruiters {
margin-left: 10em;
}
h2 {
	font-family: 'Kaushan Script', cursive;
	padding-right: 5rem;
	padding-left: 10rem;
}

h3 {
	font-family: 'Kaushan Script', cursive;
	text-align: center;
}
li3 {
	padding-left: 14rem;
}

li {
	padding-right: 2rem;
}
li1 {
	padding-right: 2rem;
}

.navbar {
	font-size: 18px;
}

</style>
</head>
<body>
	<nav class="mb-1 navbar navbar-expand-lg navbar-dark info-color">
	<h2>Joodle jobs</h2>
	<div class="collapse navbar-collapse" id="navbar">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item active"><a class="nav-link" href="#">Post Vacancy
					<span class="sr-only">(current)</span>
			</a></li>
		   <li1 class="nav-item"> <a class="nav-link" href="AppliedServlet">Applied list</a></li1>
		   <li2 class="nav-item"> <a class="nav-link" href="ShortListedServlet">Shortlisted</a></li2>
				<li3 class="nav-item"> <a class="nav-link" href="index.jsp"><i
				class="fa fa-sign-out"></i> Logout</a></li3>
		</ul>
	</div>
	</nav>
<main class="pt-5 mx-lg-5"> 
	<div class="row wow fadeIn" id="Recruiters">
		<div class="col-md-9 mb-4">
			<div class="card">
				<div class="card-body">
					<form action="AddVacancyServlet" method="post"
					onSubmit="alert('Vacancy details has been updated sucessfully.');">
						<h3>Update Vacancy</h3>
						<div class="form-group row">
							<label for="inputName" class="col-sm-2 col-form-label">Recruiters Name</label>
							<div class="col-sm-5">
								<input type="text" class="form-control" id="inputName" name="Name" title="4-25 Characters,A-Z,a-z,space is only allowed"
									pattern="[A-Za-z- ]{4,25}" required maxlength="25"
									placeholder="Recruiters Name">
							</div>
						</div>
						<div class="form-group row">
							<label for="inputPosition" class="col-sm-2 col-form-label">Recruiters Position</label>
							<div class="col-sm-5">
								<input type="text" class="form-control" id="inputPosition" name="Position" title="2-40 Characters,A-Z,a-z,space is only allowed"
									pattern="[A-Za-z- ]{2,25}" required maxlength="40"
									placeholder="Recruiters Position">
							</div>
						</div>
						<div class="form-group row">
							<label for="inputCompany" class="col-sm-2 col-form-label">Company Name</label>
							<div class="col-sm-5">
								<input type="text" class="form-control" id="inputCname" name="Cname" title="3-50 Characters,A-Z,a-z,space is only allowed"
									pattern="[A-Za-z- ]{3,50}" required maxlength="50"
									placeholder="Company Name">
							</div>
						</div>
						<div class="form-group row">
							<label for="inputLocation" class="col-sm-2 col-form-label">Location</label>
							<div class="col-sm-5">
								<input type="text" class="form-control" id="inputLocation" name="Location" title="3-30 Characters,A-Z,a-z,space is only allowed"
									pattern="[A-Za-z- ]{3,30}" required maxlength="30"
									placeholder="Location">
							</div>
						</div>
						<div class="form-group row">
							<label for="inputSkills" class="col-sm-2 col-form-label">Skills Required</label>
							<div class="col-sm-5">
								<input type="text" class="form-control" id="inputSkills" name="Skills" title="1-30 Characters,A-Z,a-z,.,_ is only allowed"
									pattern="[a-zA-Z-_., ]{1,20}" required maxlength="30"
									placeholder="Skills Required">
							</div>
						</div>
						<div class="form-group row">
							<label for="inputVposition" class="col-sm-2 col-form-label">Vacancy Position</label>
							<div class="col-sm-5">
								<input type="text" class="form-control" id="inputVposition" name="Vposition" title="4-30 Characters,a-z,.,, is only allowed"
									pattern="[a-zA-Z-., ]{1,20}" required maxlength="30"
									placeholder="Vacancy Position">
							</div>
						</div>
						<div class="form-group row">
							<label for="inputVnumber" class="col-sm-2 col-form-label">Vacancy Available</label>
							<div class="col-sm-5">
								<input type="text" class="form-control" id="inputVnumber" name="Vaccancy" title="1-30 Characters,0-9 is only allowed"
									pattern="[0-50]{1,30}" required maxlength="30"
									placeholder="Vacancy Available">
							</div>
						</div>
						<div class="form-group row">
							<label for="inputVnumber" class="col-sm-2 col-form-label">About Company</label>
							<div class="col-sm-5">
								<input type="text" class="form-control" id="inputVnumber" name="About" title="4-100 Characters,A-Z,a-z,0-9 is only allowed"
									pattern="[a-zA-Z0-9-.,/ ]{4,100}" required maxlength="100"
									placeholder="About Company">
							</div>
						</div>
						<div class="form-group row">
							<label for="inputVnumber" class="col-sm-2 col-form-label">Criteria</label>
							<div class="col-sm-5">
								<input type="text" class="form-control" id="inputVnumber" name="Criteria" title="4-70 Characters,a-z,0-9 is only allowed"
									pattern="[a-zA-Z0-9-., /]{4,70}" required maxlength="70"
									placeholder="Criteria">
							</div>
						</div>
						<div class="form-group row">
							<label for="inputVnumber" class="col-sm-2 col-form-label">Perks</label>
							<div class="col-sm-5">
								<input type="text" class="form-control" id="inputVnumber" name="Perks" title="4-70 Characters,A-Z,a-z,0-9 is only allowed"
									pattern="[a-zA-Z0-9-., /]{4,70}" required maxlength="70"
									placeholder="Perks">
							</div>
						</div>
						
						<div class="form-group row">
							<div class="col-sm-10">
								<button type="submit" class="btn btn-primary">Update
									 Vacancy</button>
							</div>
						</div>
					</form>
					<h4>${add}</h4>
				</div>
			</div>
		</div>
	</div>	
</body>
</html>