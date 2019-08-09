<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset ="utf-8">
		<title>Error</title>
		<style>
		@import "https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css";
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
                        color: white;
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
			margin-bottom: 8px;
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
			background: none;
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
<h1 align="center"><br><br><br><br><br><br>Enter login name and password correctly!!</h1>
<p align="center"><a href="login.jsp"</a>Click to go back to login page</p>
</body>
</html>
