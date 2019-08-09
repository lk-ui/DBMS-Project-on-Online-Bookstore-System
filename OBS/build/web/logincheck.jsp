<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Check</title>
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
               String user=request.getParameter("loginname");
               String pass=request.getParameter("password");
               out.println(user+pass);
               Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:sqlplus","utkarshini","utkarshini");
               Statement stmt=cn.createStatement();
               String s1="select loginname,password from login where loginname='"+user+"'";
               ResultSet rs=stmt.executeQuery(s1);
               boolean entry=false;
               while(rs.next())
               {   
                  if( user.equals(rs.getString("loginname")) && pass.equals(rs.getString("password")))
                  {
                      response.sendRedirect("category.jsp");
                      entry=true;
                  }
               }
                  if(entry==false)
                 {   
                   response.sendRedirect("invalid.jsp");
                  
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