<!DOCTYPE html>
<html>
	<head>
		<meta charset ="utf-8">
		<title>Admin Menu</title>
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
			font-size: 30px;
			border-bottom: 4px solid #4caf50;
			margin-bottom: 30px;
			padding: 10px 0;
		}
		.login-box h2
		{

			font-size: 25px;
			border-bottom: 4px solid #4caf50;
			margin-bottom: 15px;
			padding: 8px 0;
		}
		.textbox
		{
			width: 100%;
			overflow: hidden;
			font-size: 13px;
			padding: 8px 0;
			margin-bottom: 5px 0;
			border-bottom:1px solid #4caf50;
		}
		.textbox input
		{
			border: none;
			outline: none;
			background: none;
			color: white;
			font-size: 13px;
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
			font-size: 13px;
			cursor: pointer;
			margin: 12px 0;
		}
		p
		{
			font-size: 18px;
			color: white;
		}
		a
		{
			font-size: 18px;
			color: white;
		}

		</style>
	</head>
<body>
   
  <div class="login-box">
    <h1 align="center">Administrative Privileges</h1>
    <h2 align="center">Select one of the options given below</h2>
    <p align="center"><a href="inventory1.jsp"</a><br>View All Books</p>
    <p align="center"><a href="addbook.jsp"</a><br>Add New Book Record</p>
    <p align="center"><a href="categories.jsp"</a><br>View All Book Categories</p>
    <p align="center"><a href="addcategory.jsp"</a><br>Add New Book Category</p>
    <p align="center"><a href="customers.jsp"</a><br>View All Customers</p>
    <p align="center"><a href="login.jsp"</a><br>Logout</p>
</body>
</html>
