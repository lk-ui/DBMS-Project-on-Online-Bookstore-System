
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="javax.servlet.http.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset ="utf-8">
		<title>Cart Contents</title>
		<style>
		@import "https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css";
                ::placeholder
                {
                        color: black;
                        opacity: 1; /* Firefox */
                }
		body
		{
			margin: 0;
			padding: 0;
			font-family: sans-serif;
			background: url(bg2.jpg) no-repeat;
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
			margin-bottom: 20px;
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
			font-size: 15px;
			padding: 8px 0;
			margin-bottom: 5px;
			border-bottom:1px solid #4caf50;
		}
		.textbox input
		{
			border: none;
			outline: none;
			background: none;
			color: black;
			font-size: 15px;
			width: 80%;
			float: left;
			margin: 10px;
		}
		.btn
		{
			width: 100%;
			background: #4caf50;
			border: 2px solid #4caf50;
			color: white;
			font-size: 18px;
			cursor: pointer;
			margin: 12px;
		}
		p
		{
			font-size: 12px;
			color: #4caf50;
		}
		a
		{
			font-size: 18px;
			color: black;
		}
                table
                {
                        font-size: 15px;
                        color: black;
                        table-layout: fixed;
                        width: 100%;
                        border: 1px solid white;
                        background: grey;
                }
                
                .td
                {
                    font-size: 15px;
                    width:100%;
                }
                

		</style>
	</head>
<body>
<form  action="buybook.jsp" method="post">    
  <div class="login-box">
      <%    
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }
        catch(ClassNotFoundException e)
        {
            out.print("Driver not found");
            e.printStackTrace();
        } 
        try 
        {
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:sqlplus","utkarshini","utkarshini");
            String query = "select * from bookdetails B,cart C where B.bookid=C.bookid";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            if (rs.next() == false )
            {
                response.sendRedirect("adminmenu.jsp");
            }
            else
            {
      %>
        <h1 align="center">Wishlist</h1>
        <br><br><br>
        <table border="0">
  <col width="100">
  <col width="250">
  <col width="120">
  <col width="70">
  <col width="70">
        <tr>
        <th>Book id</th>
        <th>Title</th>
        <th>Author Name</th>
        <th>Price</th>
        <th>Rating</th>
        </tr>
        </table>
      <% 
            do
            {
      %>
      <table border="0">
  <col width="100">
  <col width="250">
  <col width="120">
  <col width="70">
   <col width="70">
          <tr><td><%= rs.getString(1)%></td> 
        <td><%= rs.getString(2)%></td>
        <td><%= rs.getString(3)%></td>
        <td><%= rs.getInt(4)%></td>
          <td><%= rs.getFloat(5)%></td></tr>
      </table>
      <% 
            }
            while (rs.next());
            conn.close();
            }

        } 
       catch (SQLException e)
       {
            out.println("SQLException : " + e);
       }

      %>  
      <br><br><br>
      <div class="textbox">
	<input type="text" placeholder="bookid" name="bookid" id="bookid">
      </div>
<input class="btn" type="submit" name="Buy Book" value="Buy Book">
      <p align="center"><a href="cart.jsp"</a><br>View Shopping Cart</p>
      <p align="center"><a href="category.jsp"</a>Go Back To Categories</p>
</form>
</body>
</html>
