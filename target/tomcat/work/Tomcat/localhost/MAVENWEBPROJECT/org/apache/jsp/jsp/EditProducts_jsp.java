/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-08-02 10:44:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.sample.hibernate.controller.UserDAO;
import java.util.*;
import com.sample.hibernate.model.Categories;
import com.sample.hibernate.model.Products;

public final class EditProducts_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert product</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/styles.css\"/>\r\n");
      out.write("<script src=\"../js/checkForm.js\" type=\"text/javascript\">\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"prod\">\r\n");
      out.write("<div id=\"prod_container\">\r\n");
      out.write("<h1 id=\"prod_head\">Edit Products </h1>\r\n");
int i=Integer.parseInt(request.getParameter("eid1")); System.out.println(i);
      out.write("\r\n");
      out.write("<form name=\"product\" id=\"product\" action=\"");
      out.print(request.getContextPath());
      out.write("/com.sample.hibernate.controller.EditServlet?eeid1=");
      out.print(request.getParameter("eid1") );
      out.write("&id1=");
      out.print(request.getParameter("id1"));
      out.write("\" method=\"post\" onSubmit=\"return validate()\">\r\n");
int id=Integer.parseInt(request.getParameter("id1"));
UserDAO dao=new UserDAO();
Products p=dao.findProductById(id);
Categories c=p.getCategory();

      out.write("\r\n");
      out.write("<table id=\"prod_table\" cellpadding=\"7\" cellspacing=\"7\">\r\n");
      out.write("<tr>\r\n");
      out.write("<th  colspan=\"2\"><div align=\"center\">\r\n");
      out.write("</div></th>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("\r\n");
      out.write("<th>Name </th>\r\n");
      out.write("<td><input name=\"product_name\" type=\"text\" id=\"txt\" value=\"");
      out.print(p.getName() );
      out.write("\" /></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<th>Category </th>\r\n");
      out.write("<td>\r\n");
      out.write("<select  name=\"category\" id=\"sel\">\r\n");
      out.write("<option value=\"0\">Select</option>\r\n");

List category=new UserDAO().getCategoryDetails();
for (Iterator iterator1 = category.iterator(); iterator1.hasNext();){
    Categories cat = (Categories) iterator1.next(); 
    if(cat.getCid()==c.getCid()) {
 
      out.write(" \r\n");
      out.write(" <option value=\"");
      out.print(c.getCid() );
      out.write("\" selected>");
      out.print(c.getCname() );
      out.write("</option>\r\n");
      out.write(" ");
} else { 
      out.write("\r\n");
      out.write(" <option value=\"");
      out.print( cat.getCid());
      out.write('"');
      out.write('>');
      out.print( cat.getCname() );
      out.write("</option>\r\n");
      out.write(" ");
}} 
      out.write("  \r\n");
      out.write("</select>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<th>Price</th>\r\n");
      out.write("<td><input name=\"product_price\" type=\"text\" id=\"txt\" value=\"");
      out.print( p.getPrice() );
      out.write("\" /></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<th>Quantity</th>\r\n");
      out.write("<td><input name=\"quantity\" type=\"text\" id=\"txt\" value=\"");
      out.print(p.getQuantity() );
      out.write("\" /></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td colspan=\"2\"><div align=\"center\">\r\n");
      out.write("<input type=\"submit\" id=\"btn\" value=\"EDIT\" />\r\n");
      out.write("\r\n");
      out.write("</div></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
