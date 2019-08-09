<!DOCTYPE html>
<html>
<html>
	<head>
		<meta charset ="utf-8">
		<title>Adding book</title>
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
			background: url(bg4.jpg) no-repeat;
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
			color: black;
		}

		</style>
	</head>
<body>
 <form action="addbookcheck.jsp" method="post">
	<div class="login-box">
		<h1 align="center">Adding New Book To The Inventory</h1> 
		<div class="textbox">
			<input type="text" placeholder="bookid" name="bookid" id="bookid">
		</div>
                <div class="textbox">
			<input type="text" placeholder="title" name="title" id="title">
		</div>
                <div class="textbox">
			<input type="text" placeholder="authorname" name="authorname" id="authorname">
		</div>
                <div class="textbox">
			<input type="text" placeholder="price" name="price" id="price">
		</div>
                <div class="textbox">
			<input type="text" placeholder="rating" name="rating" id="rating">
		</div>
<input class="btn" type="submit" name="AddBook" value="Add Book ">
<p align="center"><a href="adminmenu.jsp"</a><br>Go Back to Admin Page</p>
 </form>
</body>
</html> 