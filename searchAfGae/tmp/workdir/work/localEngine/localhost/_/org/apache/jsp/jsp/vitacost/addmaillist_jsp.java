package org.apache.jsp.jsp.vitacost;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import kxg.searchaf.url.vitacost.VitacostPageJSP;
import kxg.searchaf.url.vitacost.VitacostPage;
import java.util.*;

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
      out.write(" \r\n");
	
	 String ErrMsg="";
     List<VitacostPage> pagelist=null;

     String mailaddress = request.getParameter("mailaddress");
     String url = request.getParameter("url");
     String prodname = request.getParameter("prodname");
     
	 if(mailaddress!=null){
	      String action = request.getParameter("action");
	      VitacostPageJSP jsp=new VitacostPageJSP();
	      
	 	if("add".equals(action)){
	 		 String expectPirce = request.getParameter("expectPirce");
	 		 ErrMsg=jsp.addNewMail(mailaddress,prodname,url,expectPirce);
	 		 if("exist".equals(ErrMsg)){
	 		 	ErrMsg="当前产品已经在您的监视列表中.";
	 		 }else if("notvitacost".equals(ErrMsg)){
	 		 	ErrMsg="当前只支持vitacost.com,请输入正确的链接!";
	 		 }else if("success".equals(ErrMsg)){
	 		 	ErrMsg="添加成功!";
	 		 }
	 	 }
	 	 
	 	 if("delete".equals(action)){
	 		 ErrMsg=jsp.deleteMail(mailaddress,url);
	 		 if("notexist".equals(ErrMsg)){
	 		 	ErrMsg="你没有监视这个URL.";
	 		 }else if("success".equals(ErrMsg)){
	 		 	ErrMsg="删除成功!";
	 		 }
	 	 }
 			pagelist=jsp.loadMail(mailaddress);
 	 	
	 }else{
	 	mailaddress="";
	 }
	 
	 if(url==null){
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
      out.write(" <form id=\"form1\" class=\"form-horizontal\" action=\"addmaillist.jsp\" method=\"post\">\r\n");
      out.write("  <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"mailaddress\">Email</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("      <input type=\"text\" name=\"mailaddress\" id=\"mailaddress\" value=\"\">\r\n");
      out.write("            <button type=\"submit\" id=\"loadbutton\" class=\"btn\">查询我已经添加的</button>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"prodname\">产品名称</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("      <input type=\"text\" name=\"prodname\" id=\"prodname\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("      <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"url\">产品URL</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("      <input type=\"text\" name=\"url\" id=\"url\" style=\"width: 100%\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"expectPirce\">期望价格</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("      <input type=\"text\" id=\"expectPirce\" name=\"expectPirce\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("    <div class=\"control-group\">\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("      <button type=\"submit\" id=\"addbutton\" class=\"btn\">添加</button>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("       \r\n");
      out.write(" </form>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("     <div class=\"container\">\r\n");
      out.write("\t    <table class=\"table table-bordered\"  >\r\n");
      out.write("\t           <thead>\r\n");
      out.write("\t                <tr>\r\n");
      out.write("\t                  <th style=\"width: 10%\">产品名称</th>\r\n");
      out.write("\t                  <th style=\"width: 50%\">产品URL</th>\r\n");
      out.write("\t                  <th style=\"width: 10%\">期望价格</th>\r\n");
      out.write("\t                  <th style=\"width: 20%\">操作</th>\r\n");
      out.write("\t                </tr>\r\n");
      out.write("\t              </thead>\r\n");
      out.write("\t              <tbody id=\"table1\"></tbody>\r\n");
      out.write("\t    </table>\r\n");
      out.write(" \t</div>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("   </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("$( document ).ready(function(){\r\n");
      out.write("\t $(\"#mailaddress\").val(\"");
      out.print(mailaddress);
      out.write("\");\r\n");
      out.write("\t $(\"#url\").val(\"");
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
      out.write("   \t\tvar tem1=$(\"#expectPirce\").val();\r\n");
      out.write("  \t\tif(!isNumber(tem1)){\r\n");
      out.write("\t\t\talert(\"请输入一个数值!\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif($(\"#url\").val()==\"\"){\r\n");
      out.write("\t\t\talert(\"must input url!\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("   });\r\n");
      out.write("   \r\n");
      out.write("   $(\"#loadbutton\").click(function() {\r\n");
      out.write("   \t\t$(\"#form1\").attr(\"action\", \"addmaillist.jsp?action=load\");\r\n");
      out.write("   \t\t\r\n");
      out.write("   });\r\n");
      out.write("   \r\n");
      out.write("     ");

     if(pagelist!=null&&pagelist.size()!=0){
     for(int i=0;i<pagelist.size();i++){
       VitacostPage apage=pagelist.get(i);
   
      out.write("\r\n");
      out.write("   \r\n");
      out.write("   $(\"#table1\").append(\"<tr><td>");
      out.print(apage.prodname);
      out.write("</td><td><a target='_blank' href='");
      out.print(apage.getJspUrl());
      out.write('\'');
      out.write('>');
      out.print(apage.url);
      out.write("<a></td><td>");
      out.print(apage.expectPirce);
      out.write("</td><td><button type='submit' id='querybutton");
      out.print(i);
      out.write("' class='btn'>在线试查询</button><button type='submit' id='deletebutton");
      out.print(i);
      out.write("' class='btn'>删除</button></td></tr>\");\r\n");
      out.write("  \r\n");
      out.write("   $(\"#deletebutton");
      out.print(i);
      out.write("\").click(function() {\r\n");
      out.write("   \t\t$(\"#mailaddress\").val(\"");
      out.print(apage.mailaddress);
      out.write("\");\r\n");
      out.write("   \t\t$(\"#url\").val(\"");
      out.print(apage.url);
      out.write("\");\r\n");
      out.write("   \t\t$(\"#form1\").attr(\"action\", \"addmaillist.jsp?action=delete\");\r\n");
      out.write("   \t\t$(\"#form1\").submit();\r\n");
      out.write("   });\r\n");
      out.write("   \r\n");
      out.write("   $(\"#querybutton");
      out.print(i);
      out.write("\").click(function() {\r\n");
      out.write("   \t\t$(\"#url\").val(\"");
      out.print(apage.url);
      out.write("\");\r\n");
      out.write("   \t\t$(\"#form1\").attr(\"action\", \"testurl.jsp\");\r\n");
      out.write("   \t\t$(\"#form1\").submit();\r\n");
      out.write("    });\r\n");
      out.write("  \r\n");
      out.write("  ");

     }
   }
  
      out.write("\r\n");
      out.write("\t \t\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write(" \r\n");
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
