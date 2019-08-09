<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Check</title>
    </head>
    <body>
        <%     
            
         try{
              Class.forName("oracle.jdbc.driver.OracleDriver");
          }
          catch(ClassNotFoundException e)
          {
              out.print("Driver not found");
               e.printStackTrace();
          } 
          try {
               String user=request.getParameter("adminname");
               String pass=request.getParameter("adminpassword");
               out.println(user+pass);
               Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:sqlplus","utkarshini","utkarshini");
               Statement stmt=cn.createStatement();
               String s1="select adminname,adminpassword from admin where adminname='"+user+"'";
               ResultSet rs=stmt.executeQuery(s1);
               boolean entry=false;
               while(rs.next())
               {   
                  if( user.equals(rs.getString("adminname")) && pass.equals(rs.getString("adminpassword")))
                  {
                      response.sendRedirect("adminmenu.jsp");
                      entry=true;
                  }
               }
                  if(entry==false)
                 {   
                   response.sendRedirect("adminlogin.jsp");
                  out.println("<center><p>Please enter correct admin name and admin password</p></center>");
               }              
               rs.close();
               stmt.close();
               cn.close(); 
           } catch(Exception e)
             { out.println("ERROR OCCURED"+e);
              e.printStackTrace();
              }
           %>  
    </body>
</html>