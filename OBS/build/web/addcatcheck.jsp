<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Book Category Check</title>
    </head>
    <body>
        <%
            String A = request.getParameter("categoryid");
            String B = request.getParameter("categoryname");
        %>
        <%
            Connection conn = null;
            Statement st = null;
        %>
        <%
            try {

                Class.forName("oracle.jdbc.driver.OracleDriver");
                conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:sqlplus", "utkarshini", "utkarshini");
                String SQL = "INSERT INTO CATEGORY VALUES('" + A + "','" + B + "')";
                st = conn.createStatement();
                st.executeUpdate(SQL);

                response.sendRedirect("insertionsuccess.jsp");
                conn.commit();
                conn.close();

            } catch (SQLException e) {
                out.println("SQLException : " + e);

            }
        %>  
    </body>
</html>