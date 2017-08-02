/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-08-02 10:42:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.sample.hibernate.model.Employees;
import com.sample.hibernate.model.Products;
import com.sample.hibernate.model.Categories;
import java.util.*;

public final class Products_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.5.1/jquery.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"http://ajax.microsoft.com/ajax/jquery.ui/1.8.6/jquery-ui.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t\r\n");
      out.write("    $(\"#a1\").live('click', function (e) {\r\n");
      out.write("        e.preventDefault();\r\n");
      out.write("        var page = $(this).attr(\"href\")\r\n");
      out.write("        var pagetitle = $(this).attr(\"title\")\r\n");
      out.write("        var $dialog = $('<div></div>')\r\n");
      out.write("        .html('<iframe style=\"border: 0px; \" src=\"' + page + '\" width=\"100%\" height=\"100%\"></iframe>')\r\n");
      out.write("        .dialog({\r\n");
      out.write("            autoOpen: false,\r\n");
      out.write("            modal: true,\r\n");
      out.write("            title: pagetitle,\r\n");
      out.write("            height: 720,\r\n");
      out.write("            width: 920\r\n");
      out.write("        });\r\n");
      out.write("        $dialog.dialog('open');\r\n");
      out.write("        \r\n");
      out.write("    })\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function loadAdd() {\r\n");
      out.write(" alert(\"added Successfully!\");\t\r\n");
      out.write("}\r\n");
      out.write("function loadDelete() {\r\n");
      out.write("\t alert(\"deleted Successfully!\");\t\r\n");
      out.write("\t}\r\n");
      out.write("function loadEdit() {\r\n");
      out.write("\t alert(\"updated Successfully!\");\t\r\n");
      out.write("\t}\r\n");
      out.write("function confirmGo(m,u) {\r\n");
      out.write("    if ( confirm(m) ) {\r\n");
      out.write("        window.location = u;\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("    <link type=\"text/css\" rel=\"Stylesheet\" href=\"http://ajax.microsoft.com/ajax/jquery.ui/1.8.6/themes/smoothness/jquery-ui.css\">\r\n");
      out.write("   \r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Products Page</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/styles.css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"display\">\r\n");
Employees e=(Employees)session.getAttribute("currentemployee");
      out.write("\r\n");
      out.write("<p style=\"text-align:right; font-size: 15px;\">Welcome ");
      out.print(e.getFirstname()+" "+e.getLastname());
      out.write("</p>\r\n");
      out.write("<center>\r\n");
      out.write("<table border=\"2\" cellspacing=\"7\" cellpadding=\"7\" id=\"disp_table\">\r\n");
      out.write("<tr>\r\n");
      out.write("<th>Product ID</th>\r\n");
      out.write("<th>Product Name</th>\r\n");
      out.write("<th>View</th>\r\n");
      out.write("<th>Delete</th>\r\n");
      out.write("<th>Edit</th>\r\n");
      out.write("</tr>\r\n");
List products=(List)session.getAttribute("products");
if(session.getAttribute("newproducts")!=null) {
	Products newproduct=(Products)session.getAttribute("newproducts");
	products.add(newproduct);

      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tloadAdd();\r\n");
      out.write("</script>\r\n");
}
 session.setAttribute("newproducts", null);
if(session.getAttribute("editproducts")!=null) {
	Products editproduct=(Products)session.getAttribute("editproducts");
	System.out.print(editproduct.getId()+" "+editproduct.getName()+" "+editproduct.getPrice()+" "+editproduct.getQuantity());

      out.write('\r');
      out.write('\n');
for (int i=0;i<products.size();i++){
    Products prod = (Products)products.get(i);
    if(prod.getId()==editproduct.getId()){
    	prod=editproduct;
    	products.set(i,editproduct);
    	System.out.println("upadate check.."+prod.getId()+" "+prod.getName());
    	System.out.println("updated successfully");
    }
    }
for (Iterator iterator1 = products.iterator(); iterator1.hasNext();){
    Products prod = (Products) iterator1.next(); 
    System.out.print("edit results");
    System.out.println(prod.getId()+" "+prod.getName());
}

      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tloadEdit();\r\n");
      out.write("</script>\r\n");
      out.write("\t");
 session.setAttribute("editproducts", null);}
      out.write('\r');
      out.write('\n');
if(session.getAttribute("removeproducts")!=null) {
	Products removeproduct=(Products)session.getAttribute("removeproducts");
	for (Iterator iterator1 = products.iterator(); iterator1.hasNext();){
        Products prod = (Products) iterator1.next();
        if(prod.getId()==removeproduct.getId()) {
	   iterator1.remove();
	   
	}}
	
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tloadDelete();\r\n");
      out.write("</script>\r\n");
      out.write("\t");
 session.setAttribute("removeproducts", null);}
      out.write('\r');
      out.write('\n');

for (Iterator iterator1 = products.iterator(); iterator1.hasNext();){
	           Products prod = (Products) iterator1.next(); 	       

      out.write("\r\n");
      out.write("<tr class=\"products\">\r\n");
      out.write("<td>");
      out.print(prod.getId() );
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(prod.getName() );
      out.write("</td>\r\n");
System.out.print("hai"+request.getContextPath()); 
      out.write("\r\n");
      out.write("<td><a id=\"a1\" title=\"Product Details\" target=\"i_f\" href=\"");
      out.print(request.getContextPath());
      out.write("/com.sample.hibernate.controller.ViewServlet?id1=");
      out.print(prod.getId() );
      out.write("&emp=");
      out.print(e.getId());
      out.write("\" ><button id=\"but\">view details</button></a></td>\r\n");
      out.write("<td><a href=\"javascript:confirmGo('Sure to delete this record?','");
      out.print(request.getContextPath());
      out.write("/com.sample.hibernate.controller.DeleteServlet?eid1=");
      out.print( e.getId());
      out.write("&id1=");
      out.print(prod.getId() );
      out.write("')\"><button id=\"but\">delete product</button></a></td>\r\n");
      out.write("<td><a href=\"jsp/EditProducts.jsp?eid1=");
      out.print(e.getId());
      out.write("&id1=");
      out.print(prod.getId() );
      out.write("\"><button id=\"but\">edit product</button></a></td>\r\n");
      out.write("</tr>\r\n");
} 
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("</center>\r\n");
      out.write("<iframe src=\"\" id=\"someFrame\" name=\"i_f\" style=\"visibility: hidden;\" ></iframe>\r\n");
      out.write("<form action=\"jsp/addProducts.jsp?eid1=");
      out.print(e.getId());
      out.write("\" method=\"post\"><input type=\"submit\" value=\"Add Product\" id=\"add\"/></form>\r\n");
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
