package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t<title>Login form</title>\n");
      out.write("\t\t<style>\n");
      out.write("\t\t@import \"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\";\n");
      out.write("\t\t::placeholder\n");
      out.write("                {\n");
      out.write("                        color: white;\n");
      out.write("                        opacity: 1; /* Firefox */\n");
      out.write("                }\n");
      out.write("                body\n");
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
      out.write("\t\t\tfloat: left;\n");
      out.write("\t\t\tfont-size: 30px;\n");
      out.write("\t\t\tborder-bottom: 6px solid #4caf50;\n");
      out.write("\t\t\tmargin-bottom: 50px;\n");
      out.write("\t\t\tpadding: 13px 0;\n");
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
      out.write("\t\t\tpadding: 8px 0;\n");
      out.write("\t\t\tmargin-bottom: 8px ;\n");
      out.write("\t\t\tborder-bottom:1px solid #4caf50;\n");
      out.write("\t\t}\n");
      out.write("\t\t.textbox input\n");
      out.write("\t\t{\n");
      out.write("\t\t\tborder: none;\n");
      out.write("\t\t\toutline: none;\n");
      out.write("\t\t\tbackground: none;\n");
      out.write("\t\t\tcolor: white;\n");
      out.write("\t\t\tfont-size: 18px;\n");
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
      out.write("\t\t\tpadding: 5px;\n");
      out.write("\t\t\tfont-size: 18px;\n");
      out.write("\t\t\tcursor: pointer;\n");
      out.write("\t\t\tmargin: 12px 0;\n");
      out.write("\t\t}\n");
      out.write("\t\tp\n");
      out.write("\t\t{\n");
      out.write("\t\t\tfont-size: 18px;\n");
      out.write("\t\t\tcolor: grey;\n");
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
      out.write(" <form  action=\"logincheck.jsp\" method=\"post\">\n");
      out.write("\t<div class=\"login-box\">\n");
      out.write("\t\t<h1 align=\"center\">Welcome To The Book Shop</h1>\n");
      out.write("\t\t<h2 align=\"center\">Login</h2>\n");
      out.write("\t\t<div class=\"textbox\">\n");
      out.write("\t\t\t<input type=\"text\" placeholder=\"Login Name\" name=\"loginname\" id=\"loginname\">\n");
      out.write("\t\t</div>\n");
      out.write("\t<div class=\"textbox\">\n");
      out.write("\t\t<input type=\"password\" placeholder=\"Password\" name=\"password\" id=\"password\">\n");
      out.write("\t</div>\n");
      out.write("<input class=\"btn\" type=\"submit\" name=\"Login\" value=\"LOGIN\">\n");
      out.write("<p align=\"center\"><a href=\"signin.jsp\">New User?Click here to register</a></p>\n");
      out.write("<p align=\"center\"><a href=\"adminlogin.jsp\">System Administrator?Login here</a></p>\n");
      out.write(" </form>\n");
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