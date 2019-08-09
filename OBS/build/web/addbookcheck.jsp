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
            String A = request.getParameter("bookid");
            String B = request.getParameter("title");
            String C = request.getParameter("authorname");
            String D = request.getParameter("price");
            String E = request.getParameter("rating");
        %>
        <%
            Connection conn = null;
            Statement st = null;
        %>
        <%
            try {

                Class.forName("oracle.jdbc.driver.OracleDriver");
                conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:sqlplus", "utkarshini", "utkarshini");
                String SQL = "INSERT INTO BOOKDETAILS VALUES('" + A + "','" + B + "','" + C + "','" + D + "','" + E + "')";
                st = conn.createStatement();
                st.executeUpdate(SQL);

                response.sendRedirect("addbookcategory.jsp");
                conn.commit();
                conn.close();

            } catch (SQLException e) {
                out.println("SQLException : " + e);

            }
        %>  
    </body>
</html>