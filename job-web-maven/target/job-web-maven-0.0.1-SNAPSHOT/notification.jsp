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

h2 {
	font-family: 'Kaushan Script', cursive;
	text-align: center;
}

/* .search {
	padding-top: 5rem;
	padding-left: 11rem;
}
 */
/* .column {
	float: left;
	width: 50%;
	padding: 10px;
	height: 300px; /* Should be removed. Only for demonstration */
}
*
/

/* Clear floats after the columns */
/* .row:after {
	content: "";
	display: table;
	clear: both;
} */
</style>

</head>
<body>
	<nav class="mb-1 navbar navbar-expand-lg navbar-dark info-color">
	<h2>Joodle jobs</h2>
	<div class="collapse navbar-collapse" id="navbar">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item"><a class="nav-link" href="JobServlet">Jobs
			</a></li>
			<!-- <li1 class="nav-item"> <a class="nav-link" href="#">Recruiters</a></li1> -->
			<div class="collapse navbar-collapse" id="navbarSupportedContent-4">
				<ul class="navbar-nav ml-auto" id="Nnav">
					<li class="nav-item dropdown show active" id="Nanav"><a
						class="nav-link dropdown-toggle" id="navbarDropdownMenuLink-4"
						data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"
						id="navnav"> Notification </a>
						<div class="dropdown-menu dropdown-menu-right dropdown-info"
							aria-labelledby="navbarDropdownMenuLink-4" id="NavNav">

							<a class="dropdown-item" href="ViewSaveJobServlet" id="Snav">Saved
								Jobs</a> <a class="dropdown-item" href="ViewApplyJobServlet"
								id="Anav">Applied Jobs</a>
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
	<div class="card" id="Saved">
		<!--Card content-->
		<div class="card-body">
			<table class="table table-hover">
				<h2>Saved Jobs</h2>
				<thead class="blue-grey lighten-4">
					<tr>
						<!-- <th scope="col">Id</th> -->
						<th scope="col">Company Name</th>
						<th scope="col">Vacancy position</th>
						<th scope="col">Skill Required</th>
						<th scope="col">Location</th>
						<th scope="col">Criteria</th>
						<th scope="col">Perks</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="savedlist" items="${SAVEDLIST}">
						<tr>
							<td>${savedlist.company_name}</td>
							<td>${savedlist.vaccancy_position}</td>
							<td>${savedlist.skill_required}</td>
							<td>${savedlist.location}</td>
							<td>${savedlist.criteria}</td>
							<td>${savedlist.perks}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	<div class="card" id="Applied">
		<!--Card content-->
		<div class="card-body">
			<table class="table table-hover">
				<h2>Applied Jobs</h2>
				<thead class="blue-grey lighten-4">
					<tr>
						<!-- <th scope="col">Id</th> -->
						<th scope="col">Company Name</th>
						<th scope="col">Vacancy position</th>
						<th scope="col">Skill Required</th>
						<th scope="col">Location</th>
						<th scope="col">Criteria</th>
						<th scope="col">Perks</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="applylist" items="${APPLYLIST}">
						<tr>

							<td>${applylist.company_name}</td>
							<td>${applylist.vaccancy_position}</td>
							<td>${applylist.skill_required}</td>
							<td>${applylist.location}</td>
							<td>${applylist.criteria}</td>
							<td>${applylist.perks}</td>

						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

	<script>
		$(document).ready(function() {
			$("#Saved").hide();
			$("#Applied").hide();
			var x = "${show}";
			if (x == "SNAV") {
				$("#Saved").show();
				$("#Applied").hide();
			} else if (x == "ANAV") {
				$("#Saved").hide();
				$("#Applied").show();
			}
		})
	</script>
</body>
</html>