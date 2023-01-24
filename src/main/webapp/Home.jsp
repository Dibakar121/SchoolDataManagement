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
	background: url('imgs/school3.jpg');
	background-size: cover;
}


p{

margin: 80px;
text-align: auto;
font-size: 25px;
text-shadow: white;
font-style: oblique;
	

}

h1 {
	margin-top: 50px;
	color: dodgerblue;
	text-align: center;
	font-size: 60px;
	font-family: Lucida Calligraphy;
	background-color: lightblue;
}

nav {
	background-color: skyblue;
	height: 80px;
}

nav div {
	display: inline-block;
	margin-top: 30px;
}

#menuBlock {
	float: right;
	margin-right: 70px;
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
	color: black;
	font-size: 16px;
}

#menuBlock ul li a:hover {
	color: red;
	
}

#dropDown {
	position: absolute;
	width: 130px;
	background-color: aqua;
	height: 70px;
	margin-top: 5px;
	margin-right: 50px;
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
				<li><a href="#">about</a></li>
				<li><a href="#">Login <i class="fa-solid fa-caret-down"></i></a>

					<ul id="dropDown">
						<li><a data-target="#adminlogin" data-toggle="modal">Admin
								Login</a></li>
						<li><a data-target="#teacherlogin" data-toggle="modal">Teachers
								Login</a></li>
						<li><a data-target="#studentlogin" data-toggle="modal">Student
								Login</a></li>
					</ul></li>
			</ul>

		</div>
		<h1>Welcome to DSK Public School</h1>
	</nav>
	
	<br><br><br><br><br><br><br>
	
	<p> Welcome to our School. I hope our School offers you an insight into our positive ethos, programmes and subjects, extra curricular activities and partnership links. Beaufort College has evolved over the last one hundred years, serving the changing and diverse needs of the community of Navan. We are multi-denominational welcoming students of all faiths and none, in an atmosphere of understanding, tolerance and respect under the patronage of Louth Meath Education & Training Board (LMETB).  </p>




	<!--mobel ,code   Student Login-->


	<div class="modal" id="studentlogin">
		<div class="modal-dialog">
			<div class="modal-content animated swing">
				<div class="modal-header bg-primary text-black">
					<h2>Student Portal</h2>
					<button class="close" data-dismiss="modal">
						<i class="fa fa-times-circle"></i>
					</button>
				</div>




				<form action="studentLogin" method="post">



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





	<!--modal code admin Login-->
	<div class="modal" id="adminlogin">
		<div class="modal-dialog">
			<div class="modal-content animated swing">
				<div class="modal-header bg-primary text-black">
					<h2 >Admin Portal</h2>
					<button class="close" data-dismiss="modal">
						<i class="fa fa-times-circle"></i>
					</button>
				</div>




				<form action="adminLogin" method="post">



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





	<!--modal     code teacherlogin-->
	<div class="modal" id="teacherlogin">
		<div class="modal-dialog">
			<div class="modal-content animated swing">
				<div class="modal-header bg-primary text-black">
					<h2>Teacher Portal</h2>
					<button class="close" data-dismiss="modal">
						<i class="fa fa-times-circle"></i>
					</button>
				</div>




				<form action="teacherLogin" method="post">



					<div class="modal-body">

						<div class="form-group">
							Name <input type="text" placeholder="Enter Username" name="name"
								class="form-control ">
						</div>
						<div class="form-group">
							Password  <input type="password" placeholder="Enter password"
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