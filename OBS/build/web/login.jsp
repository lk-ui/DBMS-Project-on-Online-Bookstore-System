
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset ="utf-8">
		<title>Login form</title>
		<style>
		@import "https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css";
		::placeholder
                {
                        color: white;
                        opacity: 1; /* Firefox */
                }
                body
		{
			margin: 0;
			padding: 0;
			font-family: sans-serif;
			background: url(bg1.jpg) no-repeat;
			background-size: cover;
		}
		.login-box
		{
			width: 360px;
			position: absolute;
			top: 50%;
			left: 50%;
			transform: translate(-50%,-50%);
			color: white;
		}
		.login-box h1
		{
			float: left;
			font-size: 30px;
			border-bottom: 6px solid #4caf50;
			margin-bottom: 50px;
			padding: 13px 0;
		}
		.login-box h2
		{
			float: left;
			font-size: 30px;
			border-bottom: 6px solid #4caf50;
			margin-bottom: 50px;
			padding: 13px 0;
		}
		.textbox
		{
			width: 100%;
			overflow: hidden;
			font-size: 20px;
			padding: 8px 0;
			margin-bottom: 8px ;
			border-bottom:1px solid #4caf50;
		}
		.textbox input
		{
			border: none;
			outline: none;
			background: none;
			color: white;
			font-size: 18px;
			width: 80%;
			float: left;
			margin: 0 10px;
		}
		.btn
		{
			width: 100%;
			background: #4caf50;
			border: 2px solid #4caf50;
			color: white;
			padding: 5px;
			font-size: 18px;
			cursor: pointer;
			margin: 12px 0;
		}
		p
		{
			font-size: 18px;
			color: grey;
		}
		a
		{
			font-size: 18px;
			color: white;
		}

		</style>
	</head>
<body>
 <form  action="logincheck.jsp" method="post">
	<div class="login-box">
		<h1 align="center">Welcome To The Book Shop</h1>
		<h2 align="center">Login</h2>
		<div class="textbox">
			<input type="text" placeholder="Login Name" name="loginname" id="loginname">
		</div>
	<div class="textbox">
		<input type="password" placeholder="Password" name="password" id="password">
	</div>
<input class="btn" type="submit" name="Login" value="LOGIN">
<p align="center"><a href="signin.jsp">New User?Click here to register</a></p>
<p align="center"><a href="adminlogin.jsp">System Administrator?Login here</a></p>
 </form>
</body>
</html>
