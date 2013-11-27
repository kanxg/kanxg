package org.apache.jsp.jsp.juicycouture;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class howto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \r\n");
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
      out.write(" <form id=\"form1\" class=\"form-horizontal\" >\r\n");
      out.write("  <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"mailaddress\">Email</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("      <input type=\"text\" name=\"mailaddress\" id=\"mailaddress\" value=\"123456@qq.com\">\r\n");
      out.write("         <p class=\"text-info\">* 你需要提醒的邮件地址</p>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("       <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"userType\">用户类型</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("      <input type=\"text\" name=\"userType\" id=\"userType\"  readonly=\"true\">\r\n");
      out.write("       <p class=\"text-info\">* 分购买用户,试用用户</p>\r\n");
      out.write("       <p class=\"text-info\">试用用户部分产品无法监视</p>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("     <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"valideTime\">到期时间</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("      <input type=\"text\" name=\"valideTime\" id=\"valideTime\"  readonly=\"true\" value=\"2013-12-25\">\r\n");
      out.write("   <p class=\"text-info\">* 用户license到期日</p>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("   <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"warningWomen\">是否邮件提醒</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("\t  <input type=\"checkbox\" id=\"warningWomen\" name=\"warningWomen\" value=\"warningWomen\" readonly=\"true\">\r\n");
      out.write("\t     <p class=\"text-info\">* 不勾选将不接收提醒邮件</p>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div> \r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"womencheckingSaleDiscount\">告警折扣</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("      <input type=\"text\" id=\"womencheckingSaleDiscount\" name=\"womencheckingSaleDiscount\"  value=\"0.4\" readonly=\"true\">\r\n");
      out.write("      \t     <p class=\"text-info\">* 低于当前折扣的产品才会发邮件</p>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>  \r\n");
      out.write("   \r\n");
      out.write("  \r\n");
      out.write("     <div>\r\n");
      out.write("  <h1 class=\"text-error\">说明</h1>\r\n");
      out.write("  <p class=\"text-info\">1， 当产品上架，或者价格降低，就会发邮件； </p>\r\n");
      out.write("  <p class=\"text-info\">2， 请将发件人加入邮件列表，以防被当为垃圾邮件！ </p>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write(" \r\n");
      out.write("       \r\n");
      out.write(" </form>\r\n");
      out.write(" </div>\r\n");
      out.write("  </div>\r\n");
      out.write("       \r\n");
      out.write("   </body>\r\n");
      out.write("</html>");
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
