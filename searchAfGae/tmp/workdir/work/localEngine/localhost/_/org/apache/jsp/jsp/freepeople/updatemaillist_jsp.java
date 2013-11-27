package org.apache.jsp.jsp.freepeople;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import kxg.searchaf.url.freepeople.FreepeopleMailListJSP;
import kxg.searchaf.url.freepeople.FreepeopleMailList;
import kxg.searchaf.util.TimeUtli;

public final class updatemaillist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
     FreepeopleMailList afMailList=new FreepeopleMailList();
     String  valideTime="";
     String userType="";
     String mailaddress = request.getParameter("mailaddress");
	 if(mailaddress!=null){
	      String action = request.getParameter("action");
	 	if("update".equals(action)){
			 
	 		 boolean warningWomen=false;
	 		 if(request.getParameterValues("warningWomen")!=null){
	 		 	 warningWomen=true; 		 
	 		 }

	 		 String womencheckingSaleDiscount = request.getParameter("womencheckingSaleDiscount");
	 		
	 		 FreepeopleMailListJSP jsp=new FreepeopleMailListJSP();
	 		 ErrMsg=jsp.updateMail(mailaddress,warningWomen,womencheckingSaleDiscount);
	 		 if("success".equals(ErrMsg)){
	 		 	ErrMsg="更新成功.";
	 		 }
	 	}
			FreepeopleMailListJSP jsp=new FreepeopleMailListJSP();
			FreepeopleMailList afMailList1=jsp.loadMail(mailaddress);
			if(afMailList1!=null){
				afMailList=afMailList1;
				valideTime=TimeUtli.dateToString(afMailList.valideTime);
				userType=afMailList.userType;
			}else{
				ErrMsg="email不存在，请购买软件，或在试用页面自行添加！";
			}
	 	
	 }else{
	 	mailaddress="";
	 }
	 

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "head.jsp", out, false);
      out.write(" \r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write(" ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "top.jsp", out, false);
      out.write(" \r\n");
      out.write("  \r\n");
      out.write("   <div class=\"container\">\r\n");
      out.write("      <div class=\"hero-unit\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <form id=\"form1\" class=\"form-horizontal\" action=\"updatemaillist.jsp\" method=\"post\">\r\n");
      out.write("  <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"mailaddress\">Email</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("      <input type=\"text\" name=\"mailaddress\" id=\"mailaddress\" value=\"\">\r\n");
      out.write("      <button type=\"submit\"  id=\"loadbutton\" class=\"btn\">加载配置</button>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("       <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"userType\">用户类型</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("      <input type=\"text\" name=\"userType\" id=\"userType\"  readonly=\"true\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("     <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"valideTime\">到期时间</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("      <input type=\"text\" name=\"valideTime\" id=\"valideTime\"  readonly=\"true\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write(" \r\n");
      out.write("  \r\n");
      out.write("   <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"warningWomen\">是否邮件提醒</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("\t  <input type=\"checkbox\" id=\"warningWomen\" name=\"warningWomen\" value=\"warningWomen\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div> \r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"womencheckingSaleDiscount\">告警折扣</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("      <input type=\"text\" id=\"womencheckingSaleDiscount\" name=\"womencheckingSaleDiscount\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write(" \r\n");
      out.write("    <div class=\"control-group\">\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("      <button type=\"submit\" id=\"updatebutton\" class=\"btn\">更新</button>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("       \r\n");
      out.write(" </form>\r\n");
      out.write(" </div>\r\n");
      out.write("  </div>\r\n");
      out.write("       \r\n");
      out.write("   </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("$( document ).ready(function(){\r\n");
      out.write("\t $(\"#mailaddress\").val(\"");
      out.print(mailaddress);
      out.write("\");\r\n");
      out.write("\t $(\"#userType\").val(\"");
      out.print(userType);
      out.write("\");\r\n");
      out.write("\t $(\"#valideTime\").val(\"");
      out.print(valideTime);
      out.write("\");\r\n");
      out.write("\t $(\"#warningWomen\").attr(\"checked\", ");
      out.print(afMailList.warningWomen);
      out.write(");\r\n");
      out.write("\t \r\n");
      out.write("\t \r\n");
      out.write("\t $(\"#womencheckingSaleDiscount\").val(\"");
      out.print(afMailList.womencheckingSaleDiscount);
      out.write("\");\r\n");
      out.write("\t \r\n");
      out.write("\t  \r\n");
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
      out.write("\t $(\"#form1\").submit(function(){\r\n");
      out.write("\t\tif($(\"#mailaddress\").val()==\"\"){\r\n");
      out.write("\t\t\talert(\"must input email!\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t} \r\n");
      out.write("         return true;\r\n");
      out.write("  });\r\n");
      out.write("  \r\n");
      out.write("   $(\"#loadbutton\").click(function() {\r\n");
      out.write("  \t  $(\"#form1\").attr(\"action\", \"updatemaillist.jsp?action=load\");\r\n");
      out.write("   });\r\n");
      out.write("  \r\n");
      out.write("   $(\"#updatebutton\").click(function() {\r\n");
      out.write("  \r\n");
      out.write("\tvar tem2=$(\"#womencheckingSaleDiscount\").val();\r\n");
      out.write("  \tif(!isNumber(tem2)){\r\n");
      out.write("\t\talert(\"S区折扣，请输入0至1之间的一个数值\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(Number(tem2)<0.01 || Number(tem2)>1){\r\n");
      out.write("\t\talert(\"S区折扣，请输入0至1之间的一个数值\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("   \t\t$(\"#form1\").attr(\"action\", \"updatemaillist.jsp?action=update\");\r\n");
      out.write("   });\r\n");
      out.write("\t \t\r\n");
      out.write("});\t\t<!-- end ready-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function isNumber(oNum) \r\n");
      out.write("{ \r\n");
      out.write("\tif(!oNum) return false; \r\n");
      out.write("\tvar strP=/^\\d+(\\.\\d+)?$/; \r\n");
      out.write("\tif(!strP.test(oNum)) return false; \r\n");
      out.write("\ttry{ \r\n");
      out.write("\t\tif(parseFloat(oNum)!=oNum) return false; \r\n");
      out.write("\t} \r\n");
      out.write("\tcatch(ex) \r\n");
      out.write("\t{ \r\n");
      out.write("\t\treturn false; \r\n");
      out.write("\t} \r\n");
      out.write("\treturn true; \r\n");
      out.write("}\r\n");
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
