package org.apache.jsp.jsp.nordstrom;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import kxg.searchaf.url.nordstrom.NordstromPageJSP;
import kxg.searchaf.url.nordstrom.NordstromPage;
import java.util.*;

public final class testurl_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write(" \r\n");
	
	 String ErrMsg="";
	 NordstromPage apage=null;
	 
     String url = request.getParameter("url");
	 if(url!=null){
 	      NordstromPageJSP jsp=new NordstromPageJSP();
 		 try {
 		 	apage=jsp.testUrl(url);
	 	} catch (Exception e) {
	 		ErrMsg=e.getMessage();
	 	}
 	 	
	 }else{
	 	url="";
	 }
	 
 
	 

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "head.jsp", out, false);
      out.write(" \r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("\r\n");
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "top.jsp", out, false);
      out.write(" \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("  \t  <div class=\"container\">\r\n");
      out.write(" \r\n");
      out.write(" <form id=\"form1\" class=\"form-horizontal\" action=\"testurl.jsp\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("      <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"url\">产品URL</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("      <input type=\"text\" name=\"url\" id=\"url\" style=\"width: 80%\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("    <div class=\"control-group\">\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("      <button type=\"submit\" id=\"addbutton\" class=\"btn\">测试</button>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("       \r\n");
      out.write(" </form>\r\n");
      out.write(" \r\n");
      out.write("    <hr> \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    ");

    if(apage!=null){
   
      out.write("  \r\n");
      out.write("       <form class=\"form-horizontal\">\r\n");
      out.write("   \t<div class=\"control-group\">\r\n");
      out.write("   \t\t\t<label class=\"control-label\">产品名称：</label>\r\n");
      out.write("   \t\t\t<div class=\"controls\">");
      out.print(apage.title);
      out.write("</div>\r\n");
      out.write("   \t</div>\r\n");
      out.write("   \t   \t<div class=\"control-group\">\r\n");
      out.write("   \t\t\t<label class=\"control-label\">价格：</label>\r\n");
      out.write("   \t\t\t<div class=\"controls\">\r\n");
      out.write("   \t\t\t  ");
      out.print(apage.price);
      out.write(" \r\n");
      out.write("   \t\t\t </div>\r\n");
      out.write("   \t\t\t \r\n");
      out.write("   \t</div>\r\n");
      out.write("   \t\t<div class=\"control-group\">\r\n");
      out.write("   \t\t\t<label class=\"control-label\">在售：</label>\r\n");
      out.write("   \t\t\t<div class=\"controls\">\r\n");
      out.write("   \t\t\t   ");
      out.print(apage.instock);
      out.write(" \r\n");
      out.write("   \t\t\t </div>\r\n");
      out.write("   \t\t\t \r\n");
      out.write("   \t</div>\r\n");
      out.write(" \r\n");
      out.write("   \t \t<div class=\"control-group\">\r\n");
      out.write("   \t\t\t<label class=\"control-label\">链接：</label>\r\n");
      out.write("   \t\t\t<div class=\"controls\">\r\n");
      out.write("   \t \t\t\t<a target='_blank' href='");
      out.print(apage.getJspUrl());
      out.write('\'');
      out.write('>');
      out.print(apage.url);
      out.write(" <a>\r\n");
      out.write("   \t\t\t </div>\r\n");
      out.write("   \t\t\t \r\n");
      out.write("   \t</div>\r\n");
      out.write("  </form>\r\n");
      out.write("   ");

     }
   
      out.write("\r\n");
      out.write("   \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("  \t  </div>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("   </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("$( document ).ready(function(){\r\n");
      out.write(" \t $(\"#url\").val(\"");
      out.print(url);
      out.write("\");\r\n");
      out.write(" \t \r\n");
      out.write("\t ");

	 	if(!"".equals(ErrMsg)){
	 
      out.write("\r\n");
      out.write("\t \talert(\"");
      out.print(ErrMsg);
      out.write("\");\r\n");
      out.write("\t ");
}
      out.write("\r\n");
      out.write("\t \r\n");
      out.write("\t  $(\"#form1\").submit(function(){\r\n");
      out.write("\t\tif($(\"#url\").val()==\"\"){\r\n");
      out.write("\t\t\talert(\"must input url!\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t} \r\n");
      out.write("         return true;\r\n");
      out.write("  });\r\n");
      out.write("\t \t\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
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
