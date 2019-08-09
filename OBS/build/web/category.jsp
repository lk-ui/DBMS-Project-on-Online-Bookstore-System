<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="javax.servlet.http.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset ="utf-8">
		<title>Display Categories</title>
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
			border-bottom: 6px solid #4caf50;
			margin-bottom: 40px;
			padding: 18px 0;
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
			padding: 5px 0;
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
		}
		.btn
		{
			width: 100%;
			background: #4caf50;
			border: 5px solid #4caf50;
			color: white;
			font-size: 15px;
			cursor: pointer;
			margin: 15px 0;
		}
		p
		{
			font-size: 15px;
			color: black;
		}
		a
		{
			font-size: 18px;
			color: black;
		}
                table
                {
                        font-size: 12px;
                        color: black;
                        table-layout: fixed;
                        width: 100%;
                        border: 1px solid white;
                        background: grey;
                }
                
                .td
                {
                    font-size: 12px;
                    width:100%;
                    color: black;
                }
                
		</style>
	</head>
<body>
     <form  action="displaybooks.jsp" method="get">
	<div class="login-box">
		<h1 align="center">CATEGORIES<br></h1>
	<div class="textbox">
		<input type="text" placeholder="Search by category id" name="categoryid" id="categoryid">
	</div>
<p><br></p>
<input class="btn" type="submit" name="search" value="Search For Available Books">
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
            String query = "select * from category";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            if (rs.next() == false )
            {
                response.sendRedirect("adminmenu.jsp");
            }
            else
            {
      %>
       <br><br>
      <% 
            do
            {
      %>
     
      <center><table>
     <col width="50">
  <col width="140">
  <tr><td style="font-size:15px;"><%= rs.getString(1)%></td>
      <td style="font-size:15px;"><%= rs.getString(2)%></td></tr>
          </table></center>
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
<p align="center"><a href="wishlist.jsp"</a><br>View Wishlist</p>
<p align="center"><a href="cart.jsp"</a>View Purchase</p>
</form>
</body>
</html>
