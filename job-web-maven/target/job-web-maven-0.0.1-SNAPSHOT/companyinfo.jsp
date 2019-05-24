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

<title>Company View</title>
<style>
#companyInfo {
	margin-left: 7em;
	margin-top: 7em;
}
#btn {
margin-left: 4em;
}

h2 {
	font-family: 'Kaushan Script', cursive;
	padding-right: 5rem;
	padding-left: 10rem;
}

/* h1 {
	font-family: 'Kaushan Script', cursive;
	text-align: center;
}
 */
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
						<span class="sr-only">(current)</span>Notification
					</a>
						<div class="dropdown-menu dropdown-menu-right dropdown-info"
							aria-labelledby="navbarDropdownMenuLink-4">
							<a class="dropdown-item" href="ViewSaveJobServlet">Saved Jobs</a>
							<a class="dropdown-item" href="ViewApplyJobServlet">Applied Jobs</a> 
						</div></li>
				</ul>
			</div>
			<div class="collapse navbar-collapse" id="navbarSupportedContent-4">
				<ul class="navbar-nav ml-auto">

					<li class="nav-item dropdown show"><a
						class="nav-link dropdown-toggle" id="navbarDropdownMenuLink-4"
						data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
							<i class="fa fa-user"></i><span class="sr-only">(current)</span>
							Profile
					</a>
						<div class="dropdown-menu dropdown-menu-right dropdown-info"
							aria-labelledby="navbarDropdownMenuLink-4">
							<a class="dropdown-item active" href="myprofile.jsp" id="Pnav">My profile</a>
							<a class="dropdown-item" href="#" id="Fnav">Functional area</a> <a
								class="dropdown-item" href="#">Language known</a> <a
								class="dropdown-item" href="#">Project details</a>
						</div></li>
				</ul>
			</div>
			<li3 class="nav-item"> <a class="nav-link" href="index.jsp"><i
				class="fa fa-sign-out"></i> Logout</a></li3>
		</ul>
	</div>
	</nav>
	<c:forEach var="viewcompany" items="${VIEWCOMPANY}">
		<div class="row wow fadeIn" id="companyInfo">
			<!--Grid column-->
			<div class="col-md-7 mb-4">
				<!--Card-->
				<div class="card">
					<!--Card content-->
					<div class="card-body">
						
							<table width:400px;>
								<h3>Company Info</h3>

								<tbody>
									<tr>
										<th>About</th>
										<td>${viewcompany.about}</td>
									</tr>
									<tr>
										<th>Company name</th>
										<td>${viewcompany.company_name}</td>
									<tr>
										<th>Location</th>
										<td>${viewcompany.location}</td>
									<tr>
										<th>Skills Required</th>
										<td>${viewcompany.skill_required}</td>
									<tr>
										<th>Vacancy Position</th>
										<td>${viewcompany.vaccancy_position}</td>
									<tr>
										<th>Vacancy</th>
										<td>${viewcompany.vaccancy}</td>
									<tr>
										<th>Criteria</th>
										<td>${viewcompany.criteria}</td>
									<tr>
										<th>Perks</th>
										<td>${viewcompany.perks}</td>
									<tr>
										
										
										<td>
										<form method="post" action="SaveJobInfoServlet" onSubmit="alert('Job has been saved sucessfully.');">
											<button type="submit" class="btn btn-primary waves-effect btn-sm" id="btn"
												name="companyId" value="${viewcompany.recruiters_id}">
												Save</button>
											</form>	
										</td>
										 <td>
										<form method="post" action="UserSendMailServlet" onSubmit="alert('Job has been applied sucessfully.');">
											<button type="submit" class="btn btn-primary waves-effect btn-sm" 
												name="companyId" value="${viewcompany.recruiters_id}">Apply</button></form>
										</td> 
										<td>
										<form method="post" action="JobServlet" >
											<button type="submit" class="btn btn-danger waves-effect btn-sm" 
												name="companyname" value="">Close</button></form>
										</td>

</tr>								</tbody>
							</table>
					
					</div>
				</div>
			</div>
		</div>
	</c:forEach>

</body>
</html>