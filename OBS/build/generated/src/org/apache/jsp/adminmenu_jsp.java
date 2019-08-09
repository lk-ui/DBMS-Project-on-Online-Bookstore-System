package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminmenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset =\"utf-8\">\n");
      out.write("\t\t<title>Admin Menu</title>\n");
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
      out.write("\t\t\tbackground: url(bg1.jpg) no-repeat;\n");
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
      out.write("\t\t\tborder-bottom: 4px solid #4caf50;\n");
      out.write("\t\t\tmargin-bottom: 30px;\n");
      out.write("\t\t\tpadding: 10px 0;\n");
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
      out.write("\t\t\tmargin-bottom: 5px 0;\n");
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
      out.write("\t\t\tbackground: none;\n");
      out.write("\t\t\tborder: 2px solid #4caf50;\n");
      out.write("\t\t\tcolor: white;\n");
      out.write("\t\t\tfont-size: 13px;\n");
      out.write("\t\t\tcursor: pointer;\n");
      out.write("\t\t\tmargin: 12px 0;\n");
      out.write("\t\t}\n");
      out.write("\t\tp\n");
      out.write("\t\t{\n");
      out.write("\t\t\tfont-size: 18px;\n");
      out.write("\t\t\tcolor: white;\n");
      out.write("\t\t}\n");
      out.write("\t\ta\n");
      out.write("\t\t{\n");
      out.write("\t\t\tfont-size: 18px;\n");
      out.write("\t\t\tcolor: white;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t</style>\n");
      out.write("\t</head>\n");
      out.write("<body>\n");
      out.write("   \n");
      out.write("  <div class=\"login-box\">\n");
      out.write("    <h1 align=\"center\">Administrative Privileges</h1>\n");
      out.write("    <h2 align=\"center\">Select one of the options given below</h2>\n");
      out.write("    <p align=\"center\"><a href=\"inventory1.jsp\"</a><br>View All Books</p>\n");
      out.write("    <p align=\"center\"><a href=\"addbook.jsp\"</a><br>Add New Book Record</p>\n");
      out.write("    <p align=\"center\"><a href=\"categories.jsp\"</a><br>View All Book Categories</p>\n");
      out.write("    <p align=\"center\"><a href=\"addcategory.jsp\"</a><br>Add New Book Category</p>\n");
      out.write("    <p align=\"center\"><a href=\"customers.jsp\"</a><br>View All Customers</p>\n");
      out.write("    <p align=\"center\"><a href=\"login.jsp\"</a><br>Logout</p>\n");
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
