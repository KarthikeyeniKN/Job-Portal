<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My profile</title>
<style type="text/css">
#Profile {
	margin-left: 7em;
}

#Functional {
	padding-top: -10%;
	margin-left: 7em;
}

#Language {
	padding-top: -10%;
	margin-left: 7em;
}

#Project {
	margin-left: 7em;
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

li1 {
	padding-right: 2rem;
}

li2 {
	padding-right: 2rem;
}

li3 {
	padding-left: 14rem;
}

li {
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
			<li class="nav-item"><a class="nav-link" href="JobServlet">Jobs
			</a></li>
			<!-- 	<li1 class="nav-item"> <a class="nav-link" href="#">Recruiters</a></li1> -->
			<div class="collapse navbar-collapse" id="navbarSupportedContent-4">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item dropdown show"><a
						class="nav-link dropdown-toggle" id="navbarDropdownMenuLink-4"
						data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
							Notification </a>
						<div class="dropdown-menu dropdown-menu-right dropdown-info"
							aria-labelledby="navbarDropdownMenuLink-4">
							<a class="dropdown-item" href="ViewSaveJobServlet">Saved Jobs</a>
							<a class="dropdown-item" href="ViewApplyJobServlet">Applied
								Jobs</a>
						</div></li>
				</ul>
			</div>
			<div class="collapse navbar-collapse" id="navbarSupportedContent-4">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item dropdown show active"><a
						class="nav-link dropdown-toggle" id="navbarDropdownMenuLink-4"
						data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
							<i class="fa fa-user"></i><span class="sr-only">(current)</span>
							Profile
					</a>
						<div class="dropdown-menu dropdown-menu-right dropdown-info"
							aria-labelledby="navbarDropdownMenuLink-4">
							<a class="dropdown-item" href="#" id="Pnav">My profile</a> <a
								class="dropdown-item" href="#" id="Fnav">Functional area</a> <a
								class="dropdown-item" href="#" id="Lnav">Language known</a> <a
								class="dropdown-item" href="#" id="Prnav">Project details</a>
						</div></li>
				</ul>
			</div>
			<li3 class="nav-item"> <a class="nav-link" href="index.jsp"><i
				class="fa fa-sign-out"></i> Logout</a></li3>
		</ul>
	</div>
	</nav>
	<main class="pt-5 mx-lg-5"> <!--Grid row-->
	<div class="row wow fadeIn" id="Profile">
		<!--Grid column-->
		<div class="col-md-9 mb-4">
			<!--Card-->
			<div class="card">
				<!--Card content-->
				<div class="card-body">
					<form action="UpdateProfileServlet" method="post"
						onSubmit="alert('Profile has been updated sucessfully.');">
						<h3>Update Personal Details</h3>
						<div class="form-group row">
							<label for="input-group date" class="col-sm-2 col-form-label">Date
								of Birth</label>
							<div class="col-sm-5">
								<input type="date" class="form-control" id="inputEmail3"
									name="dob" placeholder="Date of Birth" min="1950-01-01"
									max="2001-01-01" required>
							</div>
						</div>
						<fieldset class="form-group">
							<div class="row">
								<legend class="col-form-label col-sm-2 pt-0" required>Gender</legend>
								<div class="col-sm-10">
									<div class="form-check">
										<input class="form-check-input" type="radio" id="gridRadios1"
											name="gender" value="M"> <label
											class="form-check-label" for="gridRadios1"> Male</label>
									</div>
									<div class="form-check">
										<input class="form-check-input" type="radio" id="gridRadios2"
											name="gender" value="F"> <label
											class="form-check-label" for="gridRadios2"> Female</label>
									</div>
								</div>
							</div>
						</fieldset>
						<div class="form-group row">
							<label for="inputAddress" class="col-sm-2 col-form-label">Hometown</label>
							<div class="col-sm-5">
								<input type="text" class="form-control" id="inputAddress"
									name="address" placeholder="Address"
									title="4-25 Characters,a-z,0-9,A-Z,space,comma is only allowed"
									pattern="[A-Za-z0-9-,./  ]{4,25}" required maxlength="25">
							</div>
						</div>
						<div class="form-group row">
							<label for="inputPincode" class="col-sm-2 col-form-label">Pincode</label>
							<div class="col-sm-5">
								<input type="tel" class="form-control" id="inputPincode"
									name="pincode" placeholder="Pincode"
									title="6 Characters,0-9 is only allowed" pattern="[6]{1}[0-9]{5}"
									required maxlength="6">
							</div>
						</div>
						<fieldset class="form-group">
							<div class="row">
								<legend class="col-form-label col-sm-2 pt-0">Marial
									Status</legend>
								<div class="col-sm-10">
									<div class="form-check">
										<input class="form-check-input" type="radio" id="gridRadios1"
											name="marial" value="married"> <label
											class="form-check-label" for="gridRadios1"> Married </label>
									</div>
									<div class="form-check">
										<input class="form-check-input" type="radio" id="gridRadios2"
											name="marial" value="unmarried"> <label
											class="form-check-label" for="gridRadios2"> Unmarried</label>
									</div>
								</div>
							</div>
						</fieldset>
						<div class="form-group row">
							<label for="inputDegree" class="col-sm-2 col-form-label">Degree</label>
							<div class="col-sm-5">
								<input type="text" class="form-control" id="inputDegree"
									name="degree" placeholder="Degree"
									title="4-15 Characters,a-z,A-Z,space,/ is only allowed"
									pattern="[A-Za-z-/ ]{4,15}" required maxlength="15">
							</div>
						</div>
						<div class="form-group row">
							<label for="inputYear" class="col-sm-2 col-form-label">Year
								of Passing</label>
							<div class="col-sm-5">
								<input type="tel" class="form-control" id="inputYear"
									name="year" placeholder="Year of Passing"
									title="4 Characters,0-9 is only allowed" pattern="[1-2]{1}[0-9}{3}"
									required maxlength="4">
							</div>
						</div>
						<div class="form-group row">
							<label for="inputClgname" class="col-sm-2 col-form-label">College
								Name</label>
							<div class="col-sm-5">
								<input type="text" class="form-control" id="inputClgname"
									name="clgname" placeholder="College Name"
									title="4-30 Characters,a-z,A-Z,space is only allowed"
									pattern="[A-Za-z- ]{4,30}" required maxlength="30">
							</div>
						</div>
						<fieldset class="form-group">
							<div class="row">
								<legend class="col-form-label col-sm-2 pt-0">Relocate
									Anywhere</legend>
								<div class="col-sm-10">
									<div class="form-check">
										<input class="form-check-input" type="radio" id="gridRadios1"
											name="relocate" value="yes"> <label
											class="form-check-label" for="gridRadios1"> Yes</label>
									</div>
									<div class="form-check">
										<input class="form-check-input" type="radio" id="gridRadios2"
											name="relocate" value="no"> <label
											class="form-check-label" for="gridRadios2"> No</label>
									</div>

								</div>
							</div>
						</fieldset>
						<div class="form-group row">
							<div class="col-sm-10">
								<button type="submit" class="btn btn-primary">Update
									Profile</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>


	
	<div class="row wow fadeIn" id="Functional">
		<!--Grid column-->
		<div class="col-md-9 mb-4">
			<!--Card-->
			<div class="card">
				<!--Card content-->
				<div class="card-body">
					<form action="UpdateFunctionalServlet" method="post"
						onSubmit="alert('Functional area details has been updated sucessfully.');">
						<h3>Update Functional Area</h3>
						<div class="row">
							<legend class="col-form-label col-sm-2 pt-0">IT Industry</legend>
							<div class="col-sm-5">
								<select class="form-control" name="industry">
									<option value="Accounting/Finance">Accounting/Finance</option>
									<option value="Architecture/Interior design">Architecture/Interior
										design</option>
									<option value="Banking/Financial service">Banking/Financial
										service</option>
									<option value="Food Processing">Food Processing</option>
									<option value="Management consulting firms">Management
										consulting firms</option>
									<option value="IT-Hardware and Networking">IT-Hardware
										and Networking</option>
									<option value="IT-Software/Software Service">IT-Software/Software
										Service</option>
								</select>
							</div>
						</div>
						<br />

						<div class="row">
							<legend class="col-form-label col-sm-2 pt-0">Functional
								area</legend>
							<div class="col-sm-5">
								<select class="form-control" name="functional">
									<option value="Accounts/Finance/Tax">Accounts/Finance/Tax/CS/Audit</option>
									<option value="Architecture/interior design">Architecture/interior
										design</option>
									<option value="Banking Insurance">Banking Insurance</option>
									<option value="Catering">Catering</option>
									<option value="IT-Software ERP/CRM">IT-Software
										ERP/CRM</option>
									<option value="IT-Software Mainframe">IT-Software
										Mainframe</option>
									<option value="IT-Software QA & testing">IT-Software
										QA & testing</option>
									<option value="IT-Software System programming">IT-Software
										System programming</option>
									<option value="Top management">Top management</option>
									<option value="Web/ Graphic designer">Web/ Graphic
										designer</option>
								</select>
							</div>
						</div>
						<div class="row">
							<legend class="col-form-label col-sm-2 pt-0">Role</legend>
							<div class="col-sm-5">
								<select class="form-control" name="role">
									<option value="Insurance agent">Insurance agent</option>
									<option value="Real estate agent">Real estate agent</option>
									<option value="Scientist">Scientist</option>
									<option value="Director">Director</option>
									<option value="Outside consultant">Outside consultant</option>
									<option value="Head/VP/GM">Head/VP/GM</option>
									<option value="Head Package development">Head Package
										development</option>
									<option value="Head/VP/GM-Treasury">Head/VP/GM-Treasury</option>
									<option value="GM-Corporate advisory">GM-Corporate
										advisory</option>
									<option value="Designer">Designer</option>
									<option value="Receptionist">Receptionist</option>
									<option value="Web designer">Web designer</option>
									<option value="Testing">Testing</option>
									<option value="Programmer">Programmer</option>
								</select>
							</div>
						</div>
						<br />
						<fieldset class="form-group">
							<div class="row">
								<legend class="col-form-label col-sm-2 pt-0" name="jobtype">Job
									Type</legend>
								<div class="col-sm-10">
									<div class="form-check">
										<input class="form-check-input" type="radio" id="gridRadios1"
											value="option1" name="jobtype"> <label
											class="form-check-label" for="gridRadios1"> Permanent</label>
									</div>
									<div class="form-check">
										<input class="form-check-input" type="radio" name="jobtype"
											id="gridRadios2" value="option2"> <label
											class="form-check-label" for="gridRadios2">
											Contractual</label>
									</div>

								</div>
							</div>
						</fieldset>
						<fieldset class="form-group">
							<div class="row">
								<legend class="col-form-label col-sm-2 pt-0">Employment Type</legend>
								<div class="col-sm-10">
									<div class="form-check">
										<input class="form-check-input" type="radio"
											name="employmenttype" id="gridRadios1" value="option1">
										<label class="form-check-label" for="gridRadios1">
											Fulltime</label>
									</div>
									<div class="form-check">
										<input class="form-check-input" type="radio"
											name="employmenttype" id="gridRadios2" value="option2">
										<label class="form-check-label" for="gridRadios2">
											Parttime</label>
									</div>
								</div>
							</div>
						</fieldset>
						<div class="form-group row">
							<label for="inputAddress" class="col-sm-2 col-form-label"
								name="location">Location</label>
							<div class="col-sm-5">
								<input type="text" class="form-control" id="inputAddress"
									name="location" placeholder="Preferred Location"
									title="4-40 Characters,a-z,A-Z,space,comma is only allowed"
									pattern="[a-zA-z-, ]{3,40}" required maxlength="40">
							</div>
						</div>
						<div class="form-group row">
							<div class="col-sm-10">
								<button type="submit" class="btn btn-primary">Save
									Career</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	
	<div class="row wow fadeIn" id="Language">
		<!--Grid column-->
		<div class="col-md-9 mb-4">
			<!--Card-->
			<div class="card">
				<!--Card content-->
				<div class="card-body">
					<form action="UpdateLanguageServlet" method="post"
						onSubmit="alert('Languages details has been updated sucessfully.');">
						<h3>Update Languages Known</h3>
						<div class="form-group row">
							<label for="inputDegree" class="col-sm-2 col-form-label">Languages
								Known</label>
							<div class="col-sm-5">
								<input type="text" class="form-control" id="inputDegree"
									name="language" placeholder="Languages known"
									title="4-40 Characters,a-z,A-Z,space,comma is only allowed"
									pattern="[a-zA-Z-, ]{3,40}" required maxlength="40">
							</div>
						</div>
						<div class="form-group row">
							<label for="inputDegree" class="col-sm-2 col-form-label">Proficiency</label>
							<div class="col-sm-5">
								<input type="text" class="form-control" id="inputDegree"
									name="proficiency" placeholder="Language Certification"
									title="4-40 Characters,a-z,a-z,space,comma is only allowed"
									pattern="[a-zA-Z-, ]{4,40}" required maxlength="40">
							</div>
						</div>
						<div class="form-group row">
							<div class="col-sm-10">
								<button type="submit" class="btn btn-primary">Save
									Languages</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	
	<div class="row wow fadeIn" id="Project">
		<!--Grid column-->
		<div class="col-md-9 mb-4">
			<!--Card-->
			<div class="card">
				<!--Card content-->
				<div class="card-body">
					<form action="UpdateProjectServlet" method="post"
						onSubmit="alert('Project details has deen updated sucessfully.');">
						<h3>Update Project Details</h3>
						<div class="form-group row">
							<label for="inputDegree" class="col-sm-2 col-form-label">Project
								Title</label>
							<div class="col-sm-5">
								<input type="text" class="form-control" id="inputDegree"
									name="title" placeholder="Title"
									title="4-40 Characters,a-z,A-Z,comma,space is only allowed"
									pattern="[a-zA-Z-, ]{4,40}" required maxlength="40">
							</div>
						</div>
						<div class="form-group row">
							<label for="inputDegree" class="col-sm-2 col-form-label">Duration</label>
							<div class="col-sm-5">
								<input type="text" class="form-control" id="inputDegree"
									name="duration" placeholder="Duration"
									title="4-20 Characters,a-z,0-9,A-Z,space,comma is only allowed"
									pattern="[A-Za-z0-9-, ]{4,20}" required maxlength="20">
							</div>
						</div>
						<div class="form-group row">
							<label for="inputDegree" class="col-sm-2 col-form-label">Details
								of project</label>
							<div class="col-sm-5">
								<input type="text" class="form-control" id="inputDegree"
									name="details" placeholder="Description"
									title="4-60 Characters,a-z,0-9,A-Z,space,comma is only allowed"
									pattern="[a-z0-9A-Z-, ]{4,60}" required maxlength="60">
							</div>
						</div>
						<div class="form-group row">
							<label for="inputDegree" class="col-sm-2 col-form-label">Skills
								Used</label>
							<div class="col-sm-5">
								<input type="text" class="form-control" id="inputDegree"
									name="skills" placeholder="Skills"
									title="4-50 Characters,a-zA-z,space,comma is only allowed"
									pattern="[a-zA-Z-, ]{4,50}" required maxlength="50">
							</div>
						</div>
						<div class="form-group row">
							<div class="col-sm-10">
								<button type="submit" class="btn btn-primary">Save
									Project</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	</main>
</body>
<script type="text/javascript">
	$("#Profile").show();
	$("#Functional").hide();
	$("#Language").hide();
	$("#Project").hide();

	$("#Pnav").click(function() {
		$("#Profile").show();
		$("#Functional").hide();
		$("#Language").hide();
		$("#Project").hide();
	})
	$("#Fnav").click(function() {
		$("#Profile").hide();
		$("#Functional").show();
		$("#Language").hide();
		$("#Project").hide();
	})
	$("#Lnav").click(function() {
		$("#Profile").hide();
		$("#Functional").hide();
		$("#Language").show();
		$("#Project").hide();
	})
	$("#Prnav").click(function() {
		$("#Profile").hide();
		$("#Functional").hide();
		$("#Language").hide();
		$("#Project").show();
	})
</script>
</html>