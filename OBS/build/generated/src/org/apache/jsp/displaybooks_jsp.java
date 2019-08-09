package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.servlet.http.*;

public final class displaybooks_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset =\"utf-8\">\n");
      out.write("\t\t<title>Display Books</title>\n");
      out.write("\t\t<style>\n");
      out.write("\t\t@import \"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\";\n");
      out.write("                ::placeholder\n");
      out.write("                {\n");
      out.write("                        color: white;\n");
      out.write("                        opacity: 1; /* Firefox */\n");
      out.write("                }\n");
      out.write("\t\tbody\n");
      out.write("\t\t{\n");
      out.write("\t\t\tmargin: 0;\n");
      out.write("\t\t\tpadding: 0;\n");
      out.write("\t\t\tfont-family: sans-serif;\n");
      out.write("\t\t\tbackground: url(bg4.jpg) no-repeat;\n");
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
      out.write("\t\t\tfont-size: 18px;\n");
      out.write("\t\t\tborder-bottom: 4px solid #4caf50;\n");
      out.write("\t\t\tmargin-bottom: 20px;\n");
      out.write("\t\t\tpadding: 8px 0;\n");
      out.write("\t\t}\n");
      out.write("\t\t.login-box h2\n");
      out.write("\t\t{\n");
      out.write("\n");
      out.write("\t\t\tfont-size: 25px;\n");
      out.write("\t\t\tborder-bottom: 4px solid #4caf50;\n");
      out.write("\t\t\tmargin-bottom: 15px;\n");
      out.write("\t\t\tpadding: 8px 0;\n");
      out.write("\t\t}\n");
      out.write("\t\t.textbox\n");
      out.write("\t\t{\n");
      out.write("\t\t\twidth: 100%;\n");
      out.write("\t\t\toverflow: hidden;\n");
      out.write("\t\t\tfont-size: 13px;\n");
      out.write("\t\t\tpadding: 8px 0;\n");
      out.write("\t\t\tmargin-bottom: 5px;\n");
      out.write("\t\t\tborder-bottom:1px solid #4caf50;\n");
      out.write("\t\t}\n");
      out.write("\t\t.textbox input\n");
      out.write("\t\t{\n");
      out.write("\t\t\tborder: none;\n");
      out.write("\t\t\toutline: none;\n");
      out.write("\t\t\tbackground: none;\n");
      out.write("\t\t\tcolor: white;\n");
      out.write("\t\t\tfont-size: 13px;\n");
      out.write("\t\t\twidth: 80%;\n");
      out.write("\t\t\tfloat: left;\n");
      out.write("\t\t\tmargin: 0 10px;\n");
      out.write("\t\t}\n");
      out.write("\t\t.btn\n");
      out.write("\t\t{\n");
      out.write("\t\t\twidth: 100%;\n");
      out.write("\t\t\tbackground: #4caf50;\n");
      out.write("\t\t\tborder: 2px solid #4caf50;\n");
      out.write("\t\t\tcolor: white;\n");
      out.write("\t\t\tfont-size: 13px;\n");
      out.write("\t\t\tcursor: pointer;\n");
      out.write("\t\t\tmargin: 12px 0;\n");
      out.write("\t\t}\n");
      out.write("\t\tp\n");
      out.write("\t\t{\n");
      out.write("\t\t\tfont-size: 15px;\n");
      out.write("\t\t\tcolor: #4caf50;\n");
      out.write("\t\t}\n");
      out.write("\t\ta\n");
      out.write("\t\t{\n");
      out.write("\t\t\tfont-size: 18px;\n");
      out.write("\t\t\tcolor: black;\n");
      out.write("\t\t}\n");
      out.write("                table\n");
      out.write("                {\n");
      out.write("                        font-size: 12px;\n");
      out.write("                        color: white;\n");
      out.write("                        table-layout: fixed;\n");
      out.write("                        width: 100%;\n");
      out.write("                        border: 1px solid white;\n");
      out.write("                \n");
      out.write("                .td\n");
      out.write("                {\n");
      out.write("                    font-size: 12px;\n");
      out.write("                    width:100%;\n");
      out.write("                    color: white;\n");
      out.write("                }\n");
      out.write("\t\t</style>\n");
      out.write("\t</head>\n");
      out.write("<body>\n");
      out.write("   \n");
      out.write("  <div class=\"login-box\">\n");
      out.write("        ");

        try 
        {
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:sqlplus","utkarshini","utkarshini");
            String query="select * from bookdetails B,book BB,category C where BB.bookid=B.bookid and BB.categoryid=C.categoryid and C.categoryid='"+request.getParameter("categoryid")+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            if (rs.next() == false )
            {
                response.sendRedirect("category.jsp");
            }
            else
            {
      
      out.write("\n");
      out.write("        <h1 align=\"center\">BOOKS AVAILABLE IN THE GIVEN CATEGORY</h1>\n");
      out.write("        <table border=\"0\">\n");
      out.write("  <col width=\"70\">\n");
      out.write("  <col width=\"230\">\n");
      out.write("  <col width=\"120\">\n");
      out.write("  <col width=\"50\">\n");
      out.write("  <col width=\"50\">\n");
      out.write("        <tr>\n");
      out.write("        <th>BOOK ID</th>\n");
      out.write("        <th>TITLE</th>\n");
      out.write("        <th>AUTHOR NAME</th>\n");
      out.write("        <th>PRICE</th>\n");
      out.write("        <th>RATING</th>\n");
      out.write("        </tr>\n");
      out.write("        </table>\n");
      out.write("      ");
 
            do
            {
      
      out.write("\n");
      out.write("      <table border=\"0\">\n");
      out.write("  <col width=\"70\">\n");
      out.write("  <col width=\"230\">\n");
      out.write("  <col width=\"120\">\n");
      out.write("  <col width=\"50\">\n");
      out.write("  <col width=\"50\">\n");
      out.write("          <tr><td>");
      out.print( rs.getString(1));
      out.write("</td> \n");
      out.write("        <td>");
      out.print( rs.getString(2));
      out.write("</td>\n");
      out.write("        <td>");
      out.print( rs.getString(3));
      out.write("</td>\n");
      out.write("        <td>");
      out.print( rs.getInt(4));
      out.write("</td>\n");
      out.write("        <td>");
      out.print( rs.getFloat(5));
      out.write("</td></tr>\n");
      out.write("      </table>\n");
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

      
      out.write("\n");
      out.write("      <br><br>\n");
      out.write("      <div class=\"textbox\">\n");
      out.write("\t<input type=\"text\" placeholder=\"cartid\" name=\"cartid\" id=\"cartid\">\n");
      out.write("      </div>\n");
      out.write("<input class=\"btn\" type=\"submit\" name=\"AddToCart\" value=\"Add To Cart\">\n");
      out.write("<p align=\"center\"><a href=\"category.jsp\">Go Back To Search Categories</a></p>\n");
      out.write("<p align=\"center\"><a href=\"cart.jsp\"</a>View Cart</p>\n");
      out.write("<p align=\"center\"><a href=\"login.jsp\"</a>Logout</p>\n");
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
