<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DSK School</title>
<link rel="shortcut icon" href='imgs/DSK.png'>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css"
	integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<link rel="stylesheet" href="css/bootstrap.css" />
<link rel="stylesheet" href="css/mdb.css" />
<link rel="stylesheet" href="fa/css/all.css" />


<style>
* {
	margin: 0;
	padding: 0;
}

body {
	background-color: aqua;
}

p {
	margin: 50px;
	text-align: auto;
	font-size: 25px;
	text-shadow: white;
	font-style: oblique;
}

h1 {
	margin-top: 20px;
	color: white;
	text-align: center;
	font-size: 60px;
	font-family: Lucida Calligraphy;
	background-color: black;
}

nav {
	background-color: darkblue;
	height: 80px;
}

nav div {
	display: inline-block;
	margin-top: 30px;
}

#menuBlock {
	float: right;
	margin-right: 50px;
}

#menuBlock ul li {
	display: inline-block;
}

#logoBlock {
	color: white;
	margin-left: 50px;
	font-size: 20px;
	letter-spacing: 3px;
}

#logoBlock:first-letter {
	font-size: 30px;
	color: red;
	border: 3px solid yellow;
	padding: 5px;
	border-radius: 11px 0 11px 0;
}

#menuBlock ul li {
	margin-right: 8px;
}

#menuBlock ul li a {
	text-decoration: none;
	color: white;
	font-size: 16px;
}

#menuBlock ul li a:hover {
	color: blueviolet;
	border-bottom: 2px solid green;
}

#dropDown {
	position: absolute;
	width: 130px;
	background-color: black;
	height: 60px;
	margin-top: 10px;
	margin-right: 5 0px;
	display: none;
	border-radius: 10px;
	z-index: 100;
}

#menuBlock ul li:hover #dropDown {
	display: block;
}

#menuBlock>ul li {
	display: inline-block;
	margin-right: 2px;
	position: relative;
}

#menuBlock ul li a {
	text-decoration: none;
	padding: 6px;
}
</style>

</head>
<body>

	<nav>
		<div id="logoBlock">DSKS</div>

		<div id="menuBlock">
			<ul>
				<li><a href="./Home.jsp">Home <i
						class="fa-solid fa-house-user"></i></a></li>
				<li><a href="./Table.html">Contect <i
						class="fa-regular fa-address-book"></i>
				</a></li>
				<li><a href="Home.jsp">LogOut</a></li>
			</ul>

		</div>
		<h1>ADMIN PORTAL</h1>
	</nav>

	<br><br><br><br><br>
	
	
	
	<button class="btn btn-primary" data-target="#addAdmin" data-toggle="modal">REGISTER ADMIN</button>
    <button class="btn btn-primary" data-target="#addStdent" data-toggle="modal">REGISTER STUDENT</button>
	 <button class="btn btn-primary" data-target="#addtTeacher" data-toggle="modal">REGISTER TEACHER</button>
	
	
<!-- Add Admin -->	

	<div class="modal" id="addAdmin">
		<div class="modal-dialog">
			<div class="modal-content animated swing">
				<div class="modal-header bg-primary text-black">
					<h2>ADMIN REGISTRATION</h2>
					<button class="close" data-dismiss="modal">
						<i class="fa fa-times-circle"></i>
					</button>
				</div>

				<form action="saveAdmin" method="post">

					<div class="modal-body">

						<div class="form-group">
							Name <input type="text" placeholder="Enter Username" name="name"
								class="form-control ">
						</div>
						<div class="form-group">
							Password <input type="password" placeholder="Enter password"
								name="password" class="form-control">
						</div>


					</div>
					<div class="modal-footer bg-primary">
						<input type="submit"
							class="btn btn-success btn-md btn-outline-white">

					</div>
				</form>

			</div>
		</div>
	</div>
	
	<!-- ------------------------- Add Student ---------------------------------- -->
	
	<div class="modal" id="addStdent">
		<div class="modal-dialog">
			<div class="modal-content animated swing">
				<div class="modal-header bg-primary text-black">
					<h2>STUDENT REGISTRATION </h2>
					<button class="close" data-dismiss="modal">
						<i class="fa fa-times-circle"></i>
					</button>
				</div>

				<form action="saveStudent" method="post">



					<div class="modal-body">

						<div class="form-group">
							Name <input type="text" placeholder="Enter Username" name="name"
								class="form-control ">
						</div>
						
						<div class="form-group">
							Email <input type="text" placeholder="Enter E-mail Id" name="email"
								class="form-control ">
						</div>
						
						<div class="form-group">
							Phone Number <input type="text" placeholder="Enter Phone Number" name="phno"
								class="form-control ">
						</div>
						
						<div class="form-group">
							Adderss <input type="text" placeholder="Enter Address" name="address"
								class="form-control ">
						</div>
						
						<div class="form-group">
							Grades <input type="text" placeholder="Enter Grades" name="grades"
								class="form-control ">
						</div>
						
						<div class="form-group">
							Standard <input type="text" placeholder="Enter Standard" name="standard"
								class="form-control ">
						</div>
						
						<div class="form-group">
							Parent Phone Number <input type="text" placeholder="Enter Parent Phone Number" name="parent_cno"
								class="form-control ">
						</div>
						
						<div class="form-group">
							Password <input type="password" placeholder="Enter password"
								name="password" class="form-control">
						</div>


					</div>
					<div class="modal-footer bg-primary">
						<input type="submit"
							class="btn btn-success btn-md btn-outline-white">

					</div>
				</form>

			</div>
		</div>
	</div>


<!-- --------------------- Add Teacher ----------------------------------- -->

<div class="modal" id="addtTeacher">
		<div class="modal-dialog">
			<div class="modal-content animated swing">
				<div class="modal-header bg-primary text-black">
					<h2>TEACHER REGISTRATION</h2>
					<button class="close" data-dismiss="modal">
						<i class="fa fa-times-circle"></i>
					</button>
				</div>

				<form action="saveTeacher" method="post">



					<div class="modal-body">

						<div class="form-group">
							Name <input type="text" placeholder="Enter Username" name="name"
								class="form-control ">
						</div>
						
						<div class="form-group">
							Phone Number <input type="text" placeholder="Enter Phone Number" name="phno"
								class="form-control ">
						</div>
						
						<div class="form-group">
							Subject <input type="text" placeholder="Enter Subject" name="subject"
								class="form-control ">
						</div>
						
						
						
						<div class="form-group">
							Salary <input type="text" placeholder="Enter Salary" name="salary"
								class="form-control ">
						</div>
						
						<div class="form-group">
							Highest Experience <input type="text" placeholder="Enter Highest Experience" name="experince"
								class="form-control ">
						</div>
						
						<div class="form-group">
							Highest Qualification <input type="text" placeholder="Enter Highest Qualification" name="qualification"
								class="form-control ">
						</div>
						
						<div class="form-group">
							Email <input type="text" placeholder="Enter E-mail Id" name="email"
								class="form-control ">
						</div>
						
						<div class="form-group">
							ClassTeacher <input type="text" placeholder="Enter ClassTeacher" name="classTeacher"
								class="form-control ">
						</div>
						
						<div class="form-group">
							Adderss <input type="text" placeholder="Enter Address" name="address"
								class="form-control ">
						</div>
						
						<div class="form-group">
							Password <input type="password" placeholder="Enter password"
								name="password" class="form-control">
						</div>


					</div>
					<div class="modal-footer bg-primary">
						<input type="submit"
							class="btn btn-success btn-md btn-outline-white">

					</div>
				</form>

			</div>
		</div>
	</div>

	<script src="js/jquery.js"></script>
	<script src="js/popper.js"></script>
	<script src="js/bootstrap.js"></script>
	<script src="js/mdb.js"></script>

</body>
</html>