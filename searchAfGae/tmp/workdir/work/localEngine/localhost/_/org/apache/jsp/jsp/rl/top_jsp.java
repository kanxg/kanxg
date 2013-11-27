package org.apache.jsp.jsp.rl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class top_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write(" <div class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("      <div class=\"navbar-inner\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <button type=\"button\" class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".nav-collapse\">\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("          </button>\n");
      out.write("    \t  <a class=\"brand\" href=\"/index.html\">首页</a>\n");
      out.write("           <a class=\"brand\">Ralph Lauren</a>\n");
      out.write("          <div class=\"nav-collapse collapse\">\n");
      out.write("            <ul class=\"nav\">\n");
      out.write("     \t\t\t <li><a href=\"searchmen.jsp\">男装查询</a></li>\n");
      out.write("      \t\t\t <li><a href=\"searchwomen.jsp\">女装查询</a></li>\n");
      out.write("      \t\t\t <li><a href=\"searchboy.jsp\">男童查询</a></li>\n");
      out.write("      \t\t\t <li><a href=\"searchgirl.jsp\">女童查询</a></li>\n");
      out.write("      \t\t\t <li><a href=\"customersearch.jsp\">自定义查询</a></li>\n");
      out.write("      \t\t\t <li><a href=\"updatemaillist.jsp\">注册用户配置</a></li>\n");
      out.write("        \t\t <li><a href=\"addmaillist.jsp\">我要试用</a></li>\n");
      out.write("        \t\t <li><a href=\"howto.jsp\">设置说明</a></li>\n");
      out.write("            </ul>\n");
      out.write("            <!--\n");
      out.write("            <form class=\"navbar-form pull-right\">\n");
      out.write("              <input class=\"span2\" type=\"text\" placeholder=\"Email\">\n");
      out.write("              <input class=\"span2\" type=\"password\" placeholder=\"Password\">\n");
      out.write("              <button type=\"submit\" class=\"btn\">Sign in</button>\n");
      out.write("            </form>\n");
      out.write("             -->\n");
      out.write("          </div><!--/.nav-collapse -->\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>");
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
