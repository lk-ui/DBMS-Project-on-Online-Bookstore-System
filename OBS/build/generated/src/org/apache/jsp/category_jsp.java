package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.servlet.http.*;

public final class category_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset =\"utf-8\">\n");
      out.write("\t\t<title>Display Categories</title>\n");
      out.write("\t\t<style>\n");
      out.write("\t\t@import \"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\";\n");
      out.write("\t\t::placeholder\n");
      out.write("                {\n");
      out.write("                        color: black;\n");
      out.write("                        opacity: 1; /* Firefox */\n");
      out.write("                }\n");
      out.write("                body\n");
      out.write("\t\t{\n");
      out.write("\t\t\tmargin: 0;\n");
      out.write("\t\t\tpadding: 0;\n");
      out.write("\t\t\tfont-family: sans-serif;\n");
      out.write("\t\t\tbackground: url(bg2.jpg) no-repeat;\n");
      out.write("\t\t\tbackground-size: cover;\n");
      out.write("\t\t}\n");
      out.write("\t\t.login-box\n");
      out.write("\t\t{\n");
      out.write("\t\t\twidth: 360px;\n");
      out.write("\t\t\tposition: absolute;\n");
      out.write("\t\t\ttop: 50%;\n");
      out.write("\t\t\tleft: 50%;\n");
      out.write("\t\t\ttransform: translate(-50%,-50%);\n");
      out.write("\t\t\tcolor: white;\n");
      out.write("\t\t}\n");
      out.write("\t\t.login-box h1\n");
      out.write("\t\t{\n");
      out.write("\t\t\tfont-size: 30px;\n");
      out.write("\t\t\tborder-bottom: 6px solid #4caf50;\n");
      out.write("\t\t\tmargin-bottom: 40px;\n");
      out.write("\t\t\tpadding: 18px 0;\n");
      out.write("\t\t}\n");
      out.write("\t\t.login-box h2\n");
      out.write("\t\t{\n");
      out.write("\t\t\tfloat: left;\n");
      out.write("\t\t\tfont-size: 30px;\n");
      out.write("\t\t\tborder-bottom: 6px solid #4caf50;\n");
      out.write("\t\t\tmargin-bottom: 50px;\n");
      out.write("\t\t\tpadding: 13px 0;\n");
      out.write("\t\t}\n");
      out.write("\t\t.textbox\n");
      out.write("\t\t{\n");
      out.write("\t\t\twidth: 100%;\n");
      out.write("\t\t\toverflow: hidden;\n");
      out.write("\t\t\tfont-size: 20px;\n");
      out.write("\t\t\tpadding: 5px 0;\n");
      out.write("\t\t\tmargin-bottom: 5px;\n");
      out.write("\t\t\tborder-bottom:1px solid #4caf50;\n");
      out.write("\t\t}\n");
      out.write("\t\t.textbox input\n");
      out.write("\t\t{\n");
      out.write("\t\t\tborder: none;\n");
      out.write("\t\t\toutline: none;\n");
      out.write("\t\t\tbackground: none;\n");
      out.write("\t\t\tcolor: black;\n");
      out.write("\t\t\tfont-size: 15px;\n");
      out.write("\t\t\twidth: 80%;\n");
      out.write("\t\t\tfloat: left;\n");
      out.write("\t\t}\n");
      out.write("\t\t.btn\n");
      out.write("\t\t{\n");
      out.write("\t\t\twidth: 100%;\n");
      out.write("\t\t\tbackground: #4caf50;\n");
      out.write("\t\t\tborder: 5px solid #4caf50;\n");
      out.write("\t\t\tcolor: white;\n");
      out.write("\t\t\tfont-size: 15px;\n");
      out.write("\t\t\tcursor: pointer;\n");
      out.write("\t\t\tmargin: 15px 0;\n");
      out.write("\t\t}\n");
      out.write("\t\tp\n");
      out.write("\t\t{\n");
      out.write("\t\t\tfont-size: 15px;\n");
      out.write("\t\t\tcolor: black;\n");
      out.write("\t\t}\n");
      out.write("\t\ta\n");
      out.write("\t\t{\n");
      out.write("\t\t\tfont-size: 18px;\n");
      out.write("\t\t\tcolor: black;\n");
      out.write("\t\t}\n");
      out.write("                table\n");
      out.write("                {\n");
      out.write("                        font-size: 12px;\n");
      out.write("                        color: black;\n");
      out.write("                        table-layout: fixed;\n");
      out.write("                        width: 100%;\n");
      out.write("                        border: 1px solid white;\n");
      out.write("                        background: grey;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                .td\n");
      out.write("                {\n");
      out.write("                    font-size: 12px;\n");
      out.write("                    width:100%;\n");
      out.write("                    color: black;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("\t\t</style>\n");
      out.write("\t</head>\n");
      out.write("<body>\n");
      out.write("     <form  action=\"displaybooks.jsp\" method=\"get\">\n");
      out.write("\t<div class=\"login-box\">\n");
      out.write("\t\t<h1 align=\"center\">CATEGORIES<br></h1>\n");
      out.write("\t<div class=\"textbox\">\n");
      out.write("\t\t<input type=\"text\" placeholder=\"Search by category id\" name=\"categoryid\" id=\"categoryid\">\n");
      out.write("\t</div>\n");
      out.write("<p><br></p>\n");
      out.write("<input class=\"btn\" type=\"submit\" name=\"search\" value=\"Search For Available Books\">\n");
      out.write(" ");
    
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
      
      out.write("\n");
      out.write("       <br><br>\n");
      out.write("      ");
 
            do
            {
      
      out.write("\n");
      out.write("     \n");
      out.write("      <center><table>\n");
      out.write("     <col width=\"50\">\n");
      out.write("  <col width=\"140\">\n");
      out.write("  <tr><td style=\"font-size:15px;\">");
      out.print( rs.getString(1));
      out.write("</td>\n");
      out.write("      <td style=\"font-size:15px;\">");
      out.print( rs.getString(2));
      out.write("</td></tr>\n");
      out.write("          </table></center>\n");
      out.write("      ");
 
            }
            while (rs.next());
            conn.close();
            }

        } 
       catch (SQLException e)
       {
            out.println("SQLException : " + e);
       }

      
      out.write("  \n");
      out.write("<p align=\"center\"><a href=\"wishlist.jsp\"</a><br>View Wishlist</p>\n");
      out.write("<p align=\"center\"><a href=\"cart.jsp\"</a>View Purchase</p>\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
