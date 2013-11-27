package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import kxg.searchaf.util.StringUtli;
import kxg.debug.Groovydebug;

public final class debug_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
request.setCharacterEncoding("utf-8");
      out.write("  \r\n");
      out.write("\r\n");
	
 
     String code = request.getParameter("code");
     String output="";
     String exception="";
	 if(code!=null){
	 	  code=StringUtli.HtmlEncode(code);
	 	  // System.out.println(code);
	 	   Groovydebug debug=new Groovydebug();
	 	   Map map=debug.eval(code);
	 	   output=(String)map.get("output");
	 	   //System.out.println(output);
	 	   exception=(String)map.get("exception");
	 	   //System.out.println(exception);
	 	   
	 	   
 	 }else{
	 		code="";
	 }
	 

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("   <script src=\"jquery-1.10.2.min.js\"></script> \r\n");
      out.write("</head>\r\n");
      out.write(" \r\n");
      out.write("  <body>\r\n");
      out.write("    \r\n");
      out.write("\t\t\t\t <form id=\"form1\" class=\"form-horizontal\" action=\"debug.jsp\" method=\"post\">\r\n");
      out.write("\t\t\t\t  <div class=\"control-group\">\r\n");
      out.write("\t\t\t\t    <label class=\"control-label\" for=\"code\">code</label>\r\n");
      out.write("\t\t\t\t    <div class=\"controls\">\r\n");
      out.write("\t\t\t\t      <textarea type=\"text\" name=\"code\" id=\"code\"  rows=\"8\" style=\"width: 80%\"></textarea>\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t    \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t    <div class=\"control-group\">\r\n");
      out.write("\t\t\t\t    <div class=\"controls\">\r\n");
      out.write("\t\t\t\t      <button type=\"submit\" id=\"addbutton\" class=\"btn\">调试</button>\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  \t  <div class=\"control-group\">\r\n");
      out.write("\t\t\t\t    <label class=\"control-label\" for=\"output\">output</label>\r\n");
      out.write("\t\t\t\t    <div class=\"controls\">\r\n");
      out.write("\t\t\t\t      <textarea type=\"text\" name=\"output\" id=\"output\"  rows=\"8\" style=\"width: 80%\"></textarea>\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  \t  <div class=\"control-group\">\r\n");
      out.write("\t\t\t\t    <label class=\"control-label\" for=\"exception\">exception</label>\r\n");
      out.write("\t\t\t\t    <div class=\"controls\">\r\n");
      out.write("\t\t\t\t      <textarea type=\"text\" name=\"exception\" id=\"exception\"  rows=\"8\" style=\"width: 80%\"></textarea>\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t </form>\t\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("   </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("$( document ).ready(function(){\r\n");
      out.write(" \t$(\"#code\").append(\"");
      out.print(code);
      out.write("\");\r\n");
      out.write(" \r\n");
      out.write("\t \r\n");
      out.write("\t");

	 	if(!"".equals(output)){
	 
      out.write("\r\n");
      out.write(" \t\t$(\"#output\").append(\"");
      out.print(output);
      out.write("\");\r\n");
      out.write("\t ");
}
      out.write("\r\n");
      out.write("\t \r\n");
      out.write("\t");

	 	if(!"".equals(exception)&&exception!=null){
	 
      out.write("\r\n");
      out.write(" \t\t $(\"#exception\").append(\"");
      out.print(exception);
      out.write("\");\r\n");
      out.write("\t ");
}
      out.write("\r\n");
      out.write("\t \r\n");
      out.write("\t  $(\"#form1\").submit(function(){\r\n");
      out.write(" \t\tif($(\"#code\").val()==\"\"){\r\n");
      out.write("\t\t\talert(\"must input code!\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t} \r\n");
      out.write("         return true;\r\n");
      out.write(" \t  }); \r\n");
      out.write("\t \t\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
