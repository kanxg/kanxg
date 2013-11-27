package org.apache.jsp.jsp.amazon;

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
      out.write(" <form id=\"form1\" class=\"form-horizontal\">\r\n");
      out.write("  <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"mailaddress\">Email</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("      <input type=\"text\" name=\"mailaddress\" id=\"mailaddress\" value=\"123456@qq.com\">\r\n");
      out.write("         <p class=\"text-info\">* 你需要提醒的邮件地址</p>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"prodname\">产品名称</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("      <input type=\"text\" name=\"prodname\" id=\"prodname\" value=\"剃须刀1100\">\r\n");
      out.write("      \t <p class=\"text-info\">*   方便你辨识添加的记录内容 </p>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("      <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"url\">产品URL</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("      <input type=\"text\" name=\"url\" id=\"url\" style=\"width: 100%\" value=\"http://www.amazon.com/Panasonic-ES-LV61-A-Electric-Multiflex-Pivoting/dp/B005GNL5G4/ref=lh_ni_t?ie=UTF8&psc=1&smid=ATVPDKIKX0DER\">\r\n");
      out.write("      \t<p class=\"text-info\">*  必须是Amazon网站的产品，打开你的产品页面，拷贝URL到这里 </p>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"checksalerisAmazon\">只看Amazon自营产品</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("\t  <input type=\"checkbox\" id=\"checksalerisAmazon\" name=\"checksalerisAmazon\" value=\"checksalerisAmazon\">\r\n");
      out.write("\t   <p class=\"text-info\">*  勾选这个，将只监视Amazon自营产品，当自营产品缺货时，不提醒 </p>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("        <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"expectPirce\">期望价格</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("      <input type=\"text\" id=\"expectPirce\" name=\"expectPirce\" value=\"280\">\r\n");
      out.write("      <p class=\"text-info\">*  当产品实际价格低于期望价格时，才触发邮件提醒 </p>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write(" \r\n");
      out.write("  <div>\r\n");
      out.write("  <h1 class=\"text-error\">规则说明</h1>\r\n");
      out.write("  <p class=\"text-info\">1, 当产品从缺货状态，更新到到货状态，且实际价格低于预期价格，就会发邮件； </p>\r\n");
      out.write("  <p class=\"text-info\"> 2, 当产品有货， 价格降低， 且实际价格低于预期价格，就会发邮件； </p>\r\n");
      out.write("\t<p> </p>\r\n");
      out.write("  </div>\r\n");
      out.write("   \r\n");
      out.write("  <div>\r\n");
      out.write("  <h2 class=\"text-error\">需要选择尺码的产品怎么办？</h2>\r\n");
      out.write("   <p class=\"text-info\"> 1,选择好你要的尺码，颜色，加入购物车</p>\r\n");
      out.write("  <p><img src=\"/image/amazon/amazon_chima.jpg\"  width=\"600\"   ></p>\r\n");
      out.write("     <p class=\"text-info\">2 , 在确认页面，右键产品链接,\"复制链接地址\",拷贝这个地址到监测页面URL</p>\r\n");
      out.write("  <p><img src=\"/image/amazon/addcart.jpg\"  width=\"600\"   ></p>\r\n");
      out.write("   <p class=\"text-info\"> 2, 或者进入购物车,右键产品链接,\"复制链接地址\",拷贝这个地址到监测页面URL</p>\r\n");
      out.write("  <p><img src=\"/image/amazon/incart.jpg\"  width=\"600\"   ></p>\r\n");
      out.write("  <p class=\"text-info\">3,怎么样验证我加入的对不对？</p>\r\n");
      out.write("  <p class=\"text-info\">在添加产品操作里，点\"在线试查询\"，确认结果和Amazon页面一致</p>\r\n");
      out.write("  <p><img src=\"/image/amazon/verify.jpg\"  width=\"400\"   ><img src=\"/image/amazon/verify1.jpg\"  width=\"400\"   ></p>\r\n");
      out.write("   <p class=\"text-info\">如果结果不一致, 提醒将失效，请联系客服！</p>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write(" </form>\r\n");
      out.write(" \t  </div>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("   </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write(" \r\n");
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
