<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="javax.servlet.http.*" %>
<%!
       public Connection get_connection()
    {
    try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "utkarshini", "utkarshini");
        return conn;
    }
    catch(Exception e)
    {
        System.out.println("Database Connection error");
    }
return null;
    }
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset ="utf-8">
		<title>Signin form</title>
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
			background: url(bg.jpg) no-repeat;
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
			font-size: 25px;
			border-bottom: 6px solid white;
			margin-bottom: 50px;
			padding: 13px 0;
		}
		.textbox
		{
			width: 100%;
			overflow: hidden;
			font-size: 20px;
			padding: 8px 0;
			margin-bottom: 8px 0;
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
    <form  action="signincheck.jsp" method="post">
	<div class="login-box">
		<h1 align="center">New Customer Registration</h1>
	<div class="textbox">
		<input type="text" placeholder="Customer Name" name="customername" id="customername">
	</div>
       	<div class="textbox">
	    <input type="text" placeholder="Address" name="address" id="address">
	</div>
	<div class="textbox">
		<input type="text" placeholder="Email" name="email" id="email">
        </div>
	<div class="textbox">
		<input type="text" placeholder="Phone" name="phone" id="phone">
	</div>
<input class="btn" type="submit" name="Sign In" value="Submit Details">
<p align="center"><a href="login.jsp">Click to go back to login page</a></p>
    </form>
</body>
</html>
