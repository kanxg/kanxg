package org.apache.jsp.jsp.af;

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
      out.write("       <p class=\"text-info\">试用用户部分产品无法监视，如无法监视Secret Sale区</p>\r\n");
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
      out.write("     <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"warningCode\">新折扣码提醒</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("\t  <input type=\"checkbox\" id=\"warningCode\" name=\"warningCode\" value=\"warningCode\">\r\n");
      out.write("\t     <p class=\"text-info\">* 勾选，AF网站的促销代码更新提醒</p>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div> \r\n");
      out.write("  \r\n");
      out.write("   <hr>\r\n");
      out.write("   \r\n");
      out.write("   <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"warningMen\">男士区</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("\t  <input type=\"checkbox\" id=\"warningMen\" name=\"warningMen\" value=\"warningMen\">\r\n");
      out.write("\t     <p class=\"text-info\">* 不勾选，所有男装都将不监视</p>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div> \r\n");
      out.write("  \r\n");
      out.write("  <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"mencheckingRegular\">正价区</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("\t  <input type=\"checkbox\" id=\"mencheckingRegular\" name=\"mencheckingRegular\" value=\"mencheckingRegular\">\r\n");
      out.write("       <p class=\"text-info\">* 勾选，监视正价区商品</p>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>   \r\n");
      out.write("  \r\n");
      out.write("    <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"mencheckingSale\">S区</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("\t  <input type=\"checkbox\" id=\"mencheckingSale\" name=\"mencheckingSale\" value=\"mencheckingSale\">\r\n");
      out.write("          <p class=\"text-info\">* 勾选，监视Sale区商品</p>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("  </div>   \r\n");
      out.write("  <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"mencheckingSaleDiscount\">S区告警折扣</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("      <input type=\"text\" id=\"mencheckingSaleDiscount\" name=\"mencheckingSaleDiscount\">              \r\n");
      out.write("         <p class=\"text-info\">* 低于输入的折扣,才会提醒</p>\r\n");
      out.write("      \r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"mencheckingClearance\">C区</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("\t  <input type=\"checkbox\" id=\"mencheckingClearance\" name=\"mencheckingClearance\" value=\"mencheckingClearance\">\r\n");
      out.write("             <p class=\"text-info\">* 勾选，监视清仓区商品</p>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>   \r\n");
      out.write("  \r\n");
      out.write("    <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"mencheckingClearanceDiscount\">C区告警折扣</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("      <input type=\"text\" id=\"mencheckingClearanceDiscount\" name=\"mencheckingClearanceDiscount\" value=\"0.4\">\r\n");
      out.write("                 <p class=\"text-info\">* 低于输入的折扣,才会提醒</p>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"mencheckingSecretSale\">Secret Sale区</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("\t  <input type=\"checkbox\" id=\"mencheckingSecretSale\" name=\"mencheckingSecretSale\" value=\"mencheckingSecretSale\" >\r\n");
      out.write("\t              <p class=\"text-info\">* 勾选，当有Secret Sale产品，提醒 </p>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>   \r\n");
      out.write("  \r\n");
      out.write("    <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"mencheckingCategory\">选择分类</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("     <select id=\"mencheckingCategory\" name=\"mencheckingCategory\" multiple=\"multiple\" size=15>\r\n");
      out.write("\t\t  <option value=\"TEES\" selected>TEES</option>\r\n");
      out.write("\t\t  <option value=\"POLOS\" selected>POLOS</option>\r\n");
      out.write("\t\t  <option value=\"SHIRTS\">SHIRTS</option>\r\n");
      out.write("\t\t  <option value=\"HOODIES & SWEATSHIRTS\">HOODIES & SWEATSHIRTS</option>\r\n");
      out.write("\t\t  <option value=\"SWEATERS\">SWEATERS</option>\r\n");
      out.write("\t\t  <option value=\"OUTERWEAR\" selected>OUTERWEAR</option>\r\n");
      out.write("\t\t  <option value=\"SHORTS\">SHORTS</option>\r\n");
      out.write("\t\t  <option value=\"JEANS\">JEANS</option>\r\n");
      out.write("\t\t  <option value=\"SWEATPANTS\">SWEATPANTS</option>\r\n");
      out.write("\t\t  <option value=\"PANTS\">PANTS</option>\r\n");
      out.write("\t\t  <option value=\"SWIM\">SWIM</option>\r\n");
      out.write("\t\t  <option value=\"SLEEP\">SLEEP</option>\r\n");
      out.write("\t\t  <option value=\"FLIP FLOPS\">FLIP FLOPS</option>\r\n");
      out.write("\t\t  <option value=\"ACCESSORIES\">ACCESSORIES</option>\r\n");
      out.write("\t\t  <option value=\"UNDERWEAR\">UNDERWEAR</option>\r\n");
      out.write("\t\t</select>\r\n");
      out.write("\t  <p class=\"text-info\">* 多选，只有选中的分类才提醒 </p>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("    <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"mencheckingSize\">选择尺码</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("     <select id=\"mencheckingSize\" name=\"mencheckingSize\"  multiple=\"multiple\" size=34>\r\n");
      out.write("\t\t  <option value=\"XS\" selected>XS</option>\r\n");
      out.write("\t\t  <option value=\"S\" selected>S</option>\r\n");
      out.write("\t\t  <option value=\"M\">M</option>\r\n");
      out.write("\t\t  <option value=\"L\">L</option>\r\n");
      out.write("\t\t  <option value=\"XL\">XL</option>\r\n");
      out.write("\t\t  <option value=\"XXL\">XXL</option>\r\n");
      out.write("\t\t  <option value=\"28 X 30\">28 X 30</option>\r\n");
      out.write("\t\t  <option value=\"28 X 32\">28 X 32</option>\r\n");
      out.write("\t\t  <option value=\"30 X 30\" selected>30 X 30</option>\r\n");
      out.write("\t\t  <option value=\"30 X 32\" selected>30 X 32</option>\r\n");
      out.write("\t\t  <option value=\"30 X 34\">30 X 34</option>\r\n");
      out.write("\t\t  <option value=\"31 X 30\">31 X 30</option>\r\n");
      out.write("\t\t  <option value=\"31 X 32\">31 X 32</option>\r\n");
      out.write("\t\t  <option value=\"31 X 34\">31 X 34</option>\r\n");
      out.write("\t\t  <option value=\"32 X 30\">32 X 30</option>\r\n");
      out.write("\t\t  <option value=\"32 X 32\">32 X 32</option>\r\n");
      out.write("\t\t  <option value=\"32 X 34\">32 X 34</option>\r\n");
      out.write("\t\t  <option value=\"33 X 32\">33 X 32</option>\r\n");
      out.write("\t\t  <option value=\"33 X 34\">33 X 34</option>\r\n");
      out.write("\t\t  <option value=\"34 X 32\">34 X 32</option>\r\n");
      out.write("\t\t  <option value=\"34 X 34\">34 X 34</option>\r\n");
      out.write("\t\t  <option value=\"36 X 32\">36 X 32</option>\r\n");
      out.write("\t\t  <option value=\"36 X 34\">36 X 34</option>\r\n");
      out.write("\t\t  <option value=\"28\">28</option>\r\n");
      out.write("\t\t  <option value=\"30\">30</option>\r\n");
      out.write("\t\t  <option value=\"31\">31</option>\r\n");
      out.write("\t\t  <option value=\"32\">32</option>\r\n");
      out.write("\t\t  <option value=\"33\">33</option>\r\n");
      out.write("\t\t  <option value=\"34\">34</option>\r\n");
      out.write("\t\t  <option value=\"36\">36</option>\r\n");
      out.write("\t\t  <option value=\"38\">38</option>\r\n");
      out.write("\t\t  <option value=\"1 SIZE\">1 SIZE</option>\r\n");
      out.write("\t\t  <option value=\"S/M\">S/M</option>\r\n");
      out.write("\t\t  <option value=\"L/XL\">L/XL</option>\r\n");
      out.write("\t\t</select>\r\n");
      out.write("   \t  <p class=\"text-info\">* 多选，只有选中的尺码才提醒 </p>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
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
