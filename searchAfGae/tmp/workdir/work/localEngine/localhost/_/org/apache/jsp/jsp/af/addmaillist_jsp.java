package org.apache.jsp.jsp.af;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import kxg.searchaf.url.af.AfMailListJSP;
import kxg.searchaf.url.af.AfMailList;
import kxg.searchaf.util.TimeUtli;

public final class addmaillist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
	
	 String ErrMsg="";
     AfMailList afMailList=new AfMailList();
     String  valideTime="";
     String userType="";
     String mailaddress = request.getParameter("mailaddress");
	 if(mailaddress!=null){
	      String action = request.getParameter("action");
	 	if("add".equals(action)){
	 		 AfMailListJSP jsp=new AfMailListJSP();
	 		 ErrMsg=jsp.addNewMail(mailaddress);
	 		 if("exist".equals(ErrMsg)){
	 		 	ErrMsg="当前邮箱已经在服务器列表中.";
	 		 }else if("success".equals(ErrMsg)){
	 		 	ErrMsg="添加成功.";
	 		 }
	 	 }
			AfMailListJSP jsp=new AfMailListJSP();
			AfMailList afMailList1=jsp.loadMail(mailaddress);
			if(afMailList1!=null){
				afMailList=afMailList1;
				valideTime=TimeUtli.dateToString(afMailList.valideTime);
				userType=afMailList.userType;
			}
	 	
	 }else{
	 	mailaddress="";
	 }
	 

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "head.jsp", out, false);
      out.write(" \r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("\r\n");
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "top.jsp", out, false);
      out.write(" \r\n");
      out.write("   \r\n");
      out.write("    \r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("       <div class=\"hero-unit\">\r\n");
      out.write(" \r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t <form id=\"form1\" class=\"form-horizontal\" action=\"addmaillist.jsp\" method=\"post\">\r\n");
      out.write("\t\t\t\t  <div class=\"control-group\">\r\n");
      out.write("\t\t\t\t    <label class=\"control-label\" for=\"mailaddress\">Email</label>\r\n");
      out.write("\t\t\t\t    <div class=\"controls\">\r\n");
      out.write("\t\t\t\t      <input type=\"text\" name=\"mailaddress\" id=\"mailaddress\" value=\"\">\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t      <div class=\"control-group\">\r\n");
      out.write("\t\t\t\t    <label class=\"control-label\" for=\"userType\">用户类型</label>\r\n");
      out.write("\t\t\t\t    <div class=\"controls\">\r\n");
      out.write("\t\t\t\t      <input type=\"text\" name=\"userType\" id=\"userType\"  readonly=\"true\">\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t    <div class=\"control-group\">\r\n");
      out.write("\t\t\t\t    <label class=\"control-label\" for=\"valideTime\">到期时间</label>\r\n");
      out.write("\t\t\t\t    <div class=\"controls\">\r\n");
      out.write("\t\t\t\t      <input type=\"text\" name=\"valideTime\" id=\"valideTime\"  readonly=\"true\">\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t    <div class=\"control-group\">\r\n");
      out.write("\t\t\t\t    <div class=\"controls\">\r\n");
      out.write("\t\t\t\t      <button type=\"submit\" id=\"addbutton\" class=\"btn\">添加</button>\r\n");
      out.write("\t\t\t\t      <button type=\"submit\" id=\"updatebutton\" class=\"btn\">配置添加的邮箱</button>\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t       \r\n");
      out.write("\t\t\t\t </form>\t\t  \r\n");
      out.write("\t\t </div>\r\n");
      out.write(" </div>\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("   </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("$( document ).ready(function(){\r\n");
      out.write("\t $(\"#mailaddress\").val(\"");
      out.print(mailaddress);
      out.write("\");\r\n");
      out.write("\t $(\"#valideTime\").val(\"");
      out.print(valideTime);
      out.write("\");\r\n");
      out.write("\t $(\"#userType\").val(\"");
      out.print(userType);
      out.write("\");\r\n");
      out.write("\t \r\n");
      out.write("\t \r\n");
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
      out.write("\t\tif($(\"#mailaddress\").val()==\"\"){\r\n");
      out.write("\t\t\talert(\"must input email!\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t} \r\n");
      out.write("         return true;\r\n");
      out.write("  });\r\n");
      out.write("  \r\n");
      out.write(" \r\n");
      out.write("   $(\"#addbutton\").click(function() {\r\n");
      out.write("   \t\t$(\"#form1\").attr(\"action\", \"addmaillist.jsp?action=add\");\r\n");
      out.write("   });\r\n");
      out.write("   \r\n");
      out.write("    $(\"#updatebutton\").click(function() {\r\n");
      out.write("   \t\t$(\"#form1\").attr(\"action\", \"updatemaillist.jsp?action=add\");\r\n");
      out.write("   });\r\n");
      out.write("\t \t\r\n");
      out.write("});\r\n");
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
