<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DSK School</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css"
	integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />



<style>
* {
	margin: 0;
	padding: 0;
}

body {
	background-color: aqua;
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
		<h1>Teacher Portal</h1>
	</nav>
</body>
</html>