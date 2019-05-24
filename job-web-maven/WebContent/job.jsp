<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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


<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script> -->
<meta charset="ISO-8859-1">


<title>Home</title>
<style>
.mySlides {
	display: none;
}

#Vacancy {
	margin-left: 7em;
	width: 160%;
}

#about {
	padding-left: 100px;
	width: 160%;
}

#viewbtn {
	margin-left: 7em;
}

h2 {
	font-family: 'Kaushan Script', cursive;
	padding-right: 5rem;
	padding-left: 10rem;
}

h3 {
	font-family: 'Kaushan Script', cursive;
}

#halign {
	margin-left: 5rem;
	color: black;
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

.input-group {
	padding-top: 2rem;
	padding-left: 20rem;
}

#abt {
	text-align: center;
}

.column {
	float: left;
	width: 50%;
	padding: 10px;
	height: 300px; /* Should be removed. Only for demonstration */
}

/* Clear floats after the columns */
.row:after {
	content: "";
	display: table;
	clear: both;
}
</style>
</head>
<body>
	<nav class="mb-1 navbar navbar-expand-lg navbar-dark info-color">
	<h2>Joodle jobs</h2>
	<div class="collapse navbar-collapse" id="navbar">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item active"><a class="nav-link" href="#">Jobs
					<span class="sr-only">(current)</span>
			</a></li>
			<!-- <li1 class="nav-item"> <a class="nav-link" href="#">Recruiters</a></li1> -->
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
					<li class="nav-item dropdown show"><a
						class="nav-link dropdown-toggle" id="navbarDropdownMenuLink-4"
						data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
							<i class="fa fa-user"></i> Profile
					</a>
						<div class="dropdown-menu dropdown-menu-right dropdown-info"
							aria-labelledby="navbarDropdownMenuLink-4">
							<a class="dropdown-item" href="myprofile.jsp" id="Pnav">My
								profile</a> <a class="dropdown-item" href="myprofile.jsp" id="Fnav">Functional
								area</a> <a class="dropdown-item" href="myprofile.jsp" id="Lnav">Language
								known</a> <a class="dropdown-item" href="myprofile.jsp" id="Prnav">Project
								details</a>
						</div></li>
				</ul>
			</div>
			<li3 class="nav-item"> <a class="nav-link" href="index.jsp"><i
				class="fa fa-sign-out"></i> Logout</a></li3>
		</ul>
	</div>
	</nav>

	<form action="SearchServlet" method="post">
		<div class="row">
			<div class="col-xs-8 col-md-8">
				<div class="input-group">
					<input type="text" class="form-control"
						placeholder="Search by Company, Position, Skills" id="txtSearch"
						name="search" />
					<div class="input-group-btn">
						<button class="btn btn-primary waves-effect btn-sm " type="submit"
							id="searchbtn">Search</button>
					</div>
				</div>
			</div>
		</div>
	</form>

	<main class="pt-5 mx-lg-5"> <!--Grid row-->
	<div class="row">
		<div class="column">
			<c:forEach var="vaccancyList" items="${VACCANCYLIST}">
				<div class="row wow fadeIn" id="Vacancy">
					<!--Grid column-->
					<div class="col-md-7 mb-4">
						<!--Card-->
						<div class="card">
							<!--Card content-->
							<div class="card-body">
								<form method="post" action="ViewCompany">
									<table>
										<tbody>
											<tr>
												<td><h3 id="halign">${vaccancyList.company_name}</h3></td>
											</tr>
											<tr>
												<th>Recruiters Name</th>
												<td>${vaccancyList.recruiters_name}</td>
											<tr>
												<th>Position</th>
												<td>${vaccancyList.position}</td>
											<tr>
												<th>Location</th>
												<td>${vaccancyList.location}</td>
											<tr>
												<th>Vacancy Position</th>
												<td>${vaccancyList.vaccancy_position}</td>
											<tr>
												<th>Skills Required</th>
												<td>${vaccancyList.skill_required}</td>
											<tr>
												<th>Vacancy</th>
												<td>${vaccancyList.vaccancy}</td>
											<tr>
												<td><button type="submit" name="companyname"
														id="viewbtn" value="${vaccancyList.company_name}"
														class="btn btn-primary waves-effect btn-sm">View</button></td>
											</tr>
										</tbody>
									</table>
								</form>
							</div>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
		<div class="column">
			<div class="row wow fadeIn" id="about">
				<!--Grid column-->
				<div class="col-md-7 mb-4">
					<!--Card-->
					<div class="card">
						<!--Card content-->
						<div class="card-body">
							<h3 id="abt">About</h3>
							<br />
							<p>"Choose a job you love, and you will never have to work a
								day in your life." ...</p>
							<p>"The greatest thing in this world is not so much where we
								stand, as in what direction we are moving."</p>
							<p>"When one door is closed, don't you know that many more
								are open."</p>
							<div class="container my-6">
								<div id="carouselExample1" class="carousel slide z-depth-1-half"
									data-ride="carousel">
									<div class="carousel-inner">
										<div class="carousel-item active">
											<img class="d-block w-100" src="infosys1.jpg"
												alt="First slide">
										</div>
										<div class="carousel-item">
											<img class="d-block w-100" src="wiprooo.jpg"
												alt="Second slide">
										</div>
										<div class="carousel-item">
											<img class="d-block w-100" src="chainsys.jpg"
												alt="Third slide">
										</div>
										<div class="carousel-item">
											<img class="d-block w-100" src="aspire.png"
												alt="Fourth slide">
										</div>
										<div class="carousel-item">
											<img class="d-block w-100" src="infotech.jpg"
												alt="Fifth slide">
										</div>
									</div>
								</div>
							</div>
							<br />
							<h3 id="abt">To improve skills</h3>
							<br />
							<p>Build Top Resumes here ...</p>
							<p>
								<a href="https://buildfreeresume.com">https://buildfreeresume.com</a>
							<p>
							<p>
								<a href="https://novoresume.com">https://novoresume.com</a>
							<p>
							<p>Check your Aptitude...</p>
							<p>
								<a href="https://indiabix.com">https://indiabix.com</a>
							<p>
							<p>
								<a href="https://enggwave.com">https://enggwave.com</a>
							<p>Interview Questions......</p>
							<p>
								<a href="https://www.interviewbit.com">https://www.interviewbit.com</a>
							<p>
							<p>
								<a href="https://www.interviewcake.com">https://www.interviewcake.com</a>
							<p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	</main>
</body>
</html>