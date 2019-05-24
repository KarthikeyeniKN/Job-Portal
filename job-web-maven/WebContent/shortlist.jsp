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
#Recruiters {
	margin-left: 10em;
}

h2 {
	font-family: 'Kaushan Script', cursive;
	padding-right: 5rem;
	padding-left: 10rem;
}

/* h1 {
	font-family: 'Kaushan Script', cursive;
	text-align: center;
} */
h3 {
	font-family: 'Kaushan Script', cursive;
	text-align: center;
}

/* li1 {
	padding-right: 2rem;
} */
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
			<li class="nav-item "><a class="nav-link" href="recruitersform.jsp">Post
					Vacancy </a></li>
			<li1 class="nav-item"> <a class="nav-link"
				href="AppliedServlet">Applied list</a></li1>
				<li2 class="nav-item active"> <a class="nav-link" href="ShortListedServlet">Shortlisted</a></li2>
			<li3 class="nav-item"> <a class="nav-link" href="index.jsp"><i
				class="fa fa-sign-out"></i> Logout</a></li3>
		</ul>
	</div>
	</nav>
	<main class="pt-5 mx-lg-5">
	<div class="card" id="Applied">
		<!--Card content-->
		<div class="card-body">
			<table class="table table-hover">
				<h3>Applied Jobs List</h3>
				<thead class="blue-grey lighten-4">
					<tr>
						<!-- <th scope="col">Id</th> -->
						<th scope="col">Username</th>
						<th scope="col">Email</th>
						<th scope="col">Company Name</th>
						<th scope="col">Vacancy position</th>
						<th scope="col">Skill Required</th>
						<th scope="col">Location</th>
					</tr>
				</thead>
				<tbody>
				<tr>
				<td>
				<h4>${NOTFOUND}</h4></td></tr>
					<c:forEach var="shortlist" items="${SHORTLIST}">
						<tr>
							<td>${shortlist.username}</td>
							<td>${shortlist.email}</td>
							<td>${shortlist.company_name}</td>
							<td>${shortlist.vaccancy_position}</td>
							<td>${shortlist.skill_required}</td>
							<td>${shortlist.location}</td>
						</tr>

					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>