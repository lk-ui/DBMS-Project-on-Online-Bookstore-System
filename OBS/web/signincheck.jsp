<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Book Check</title>
    </head>
    <body>
        <%
            String A = request.getParameter("customername");
            String B = request.getParameter("address");
            String C = request.getParameter("email");
            String D = request.getParameter("phone");
        %>
        <%
            Connection conn = null;
            Statement st = null;
        %>
        <%
            try {

                Class.forName("oracle.jdbc.driver.OracleDriver");
                conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:sqlplus", "utkarshini", "utkarshini");
                String SQL = "INSERT INTO CUSTOMER VALUES('" + A + "','" + B + "','" + C + "','" + D + "')";
                st = conn.createStatement();
                st.executeUpdate(SQL);

                response.sendRedirect("setpassword.jsp");
                conn.commit();
                conn.close();

            } catch (SQLException e) {
                //out.println("SQLException : " + e);
                response.sendRedirect("signin.jsp");               
            }
        %>  
    </body>
</html>