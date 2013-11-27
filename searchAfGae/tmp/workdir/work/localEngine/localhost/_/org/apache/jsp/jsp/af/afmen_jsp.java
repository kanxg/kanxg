package org.apache.jsp.jsp.af;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class afmen_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" /> \r\n");
      out.write("        <title></title>\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width\">\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap -->\r\n");
      out.write("    <link href=\"/css/bootstrap.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write(" \r\n");
      out.write("  \t <script src=\"/js/jquery-1.10.2.min.js\"></script>\r\n");
      out.write("     <script src=\"/js/bootstrap.min.js\"></script>\r\n");
      out.write(" </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("     \r\n");
      out.write("<div class=\"navbar\">\r\n");
      out.write("  <div class=\"navbar-inner\">\r\n");
      out.write("    <a class=\"brand\" href=\"/index.html\">首页</a>\r\n");
      out.write("    <a class=\"brand\">Abercrombie.com</a>\r\n");
      out.write("    <ul class=\"nav\">\r\n");
      out.write("      <li><a href=\"afmen.jsp\">男士</a></li>\r\n");
      out.write("      <li><a href=\"afwomen.jsp\">女士</a></li>\r\n");
      out.write("       <li><a href=\"updatemaillist.jsp\">注册用户配置</a></li>\r\n");
      out.write("       <li><a href=\"addmaillist.jsp\">我要试用</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>     \r\n");
      out.write("       \t<table  style=\"margin:auto;margin-top:0%;\">\r\n");
      out.write("   <tr>\r\n");
      out.write("  \t\t<td>男士 折扣区</td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("   \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"searchafmen.jsp\">Sale区+清仓区+Secret区</a></td>\r\n");
      out.write(" \t</tr>\r\n");
      out.write(" \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?catalogId=10901&storeId=10051&langId=-1&topCategoryId=12202&categoryId=68948&parentCategoryId=68948')\">全部  Sale区 </a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?catalogId=10901&storeId=10051&langId=-1&topCategoryId=12202&categoryId=12204&parentCategoryId=12204')\">全部  清仓区</a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?catalogId=10901&storeId=10051&langId=-1&topCategoryId=12202&categoryId=86655&parentCategoryId=86655')\">全部  Secret区</a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t <tr>\r\n");
      out.write("  \t <td> </td>\r\n");
      out.write("  \t </tr>\r\n");
      out.write(" \t <tr>\r\n");
      out.write("  \t\t<td>男士 全价区</td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=13050&catalogId=10901&categoryId=13050&langId=-1&storeId=10051&topCategoryId=12202',1)\">FLAGSHIP EXCLUSIVES 旗舰</a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("   \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?catalogId=10901&storeId=10051&langId=-1&topCategoryId=12202&categoryId=12837&parentCategoryId=12837',1)\"> TEES</a></td>\r\n");
      out.write("  \t</tr> \r\n");
      out.write("  \t<tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=87661&catalogId=10901&categoryId=87661&langId=-1&storeId=10051&topCategoryId=12202',1)\"> POLOS</a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=87658&catalogId=10901&categoryId=87658&langId=-1&storeId=10051&topCategoryId=12202',1)\"> SHIRTS</a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=12351&catalogId=10901&categoryId=12351&langId=-1&storeId=10051&topCategoryId=12202',1)\">  HOODIES & SWEATSHIRTS</a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=12206&catalogId=10901&categoryId=12206&langId=-1&storeId=10051&topCategoryId=12202',1)\">  SWEATERS</a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=12221&catalogId=10901&categoryId=12221&langId=-1&storeId=10051&topCategoryId=12202',1)\">  OUTERWEAR</a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=60501&catalogId=10901&categoryId=60501&langId=-1&storeId=10051&topCategoryId=12202',1)\">  SHORTS</a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=12236&catalogId=10901&categoryId=12236&langId=-1&storeId=10051&topCategoryId=12202',1)\">  JEANS</a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=12224&catalogId=10901&categoryId=12224&langId=-1&storeId=10051&topCategoryId=12202',1)\">  SWEATPANTS</a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=12227&catalogId=10901&categoryId=12227&langId=-1&storeId=10051&topCategoryId=12202',1)\">  PANTS</a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=12230&catalogId=10901&categoryId=12230&langId=-1&storeId=10051&topCategoryId=12202',1)\">  SWIM</a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=60499&catalogId=10901&categoryId=60499&langId=-1&storeId=10051&topCategoryId=12202',1)\"> FLIP FLOPS </a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=13053&catalogId=10901&categoryId=13053&langId=-1&storeId=10051&topCategoryId=12202',1)\">  ACCESSORIES</a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=13196&catalogId=10901&categoryId=13196&langId=-1&storeId=10051&topCategoryId=12202',1)\">UNDERWEAR</a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=13048&catalogId=10901&categoryId=13048&langId=-1&storeId=10051&topCategoryId=12202',1)\">BODY CARE</a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("   <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=12232&catalogId=10901&categoryId=12232&langId=-1&storeId=10051&topCategoryId=12202',1)\">COLOGNE</a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('',1)\"></a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t  \t <tr>\r\n");
      out.write("  \t\t<td>男士 Sale区</td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=68948&catalogId=10901&categoryId=76062&langId=-1&storeId=10051&topCategoryId=12202')\">TEES & TANKS</a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=68948&catalogId=10901&categoryId=76058&langId=-1&storeId=10051&topCategoryId=12202')\">POLOS</a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=68948&catalogId=10901&categoryId=122897&langId=-1&storeId=10051&topCategoryId=12202')\">SHIRTS</a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=68948&catalogId=10901&categoryId=60493&langId=-1&storeId=10051&topCategoryId=12202')\">HOODIES & SWEATSHIRTS</a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=68948&catalogId=10901&categoryId=13054&langId=-1&storeId=10051&topCategoryId=12202')\">SHORTS</a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=68948&catalogId=10901&categoryId=68954&langId=-1&storeId=10051&topCategoryId=12202')\">JEANS</a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=68948&catalogId=10901&categoryId=68951&langId=-1&storeId=10051&topCategoryId=12202')\">PANTS</a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=68948&catalogId=10901&categoryId=68952&langId=-1&storeId=10051&topCategoryId=12202')\">FLIP FLOPS</a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('')\">  </a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('')\">  </a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('')\">  </a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('')\">  </a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t <tr>\r\n");
      out.write("  \t <td> </td>\r\n");
      out.write("  \t </tr>\r\n");
      out.write("  \t  <tr>\r\n");
      out.write("  \t\t<td>男士 清仓区</td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("   <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=12204&catalogId=10901&categoryId=12245&langId=-1&storeId=10051&topCategoryId=12202')\">GRAPHIC TEES</a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=12204&catalogId=10901&categoryId=12693&langId=-1&storeId=10051&topCategoryId=12202')\">SHORT SLEEVE TEES</a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=12204&catalogId=10901&categoryId=76075&langId=-1&storeId=10051&topCategoryId=12202')\">LONG SLEEVE TEES</a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=12204&catalogId=10901&categoryId=76074&langId=-1&storeId=10051&topCategoryId=12202')\">POLOS</a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=12204&catalogId=10901&categoryId=122898&langId=-1&storeId=10051&topCategoryId=12202')\">SHIRTS</a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=12204&catalogId=10901&categoryId=12242&langId=-1&storeId=10051&topCategoryId=12202')\"> HOODIES & SWEATSHIRTS </a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=12204&catalogId=10901&categoryId=12689&langId=-1&storeId=10051&topCategoryId=12202')\"> SWEATERS</a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=12204&catalogId=10901&categoryId=12243&langId=-1&storeId=10051&topCategoryId=12202')\">OUTERWEAR</a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=12204&catalogId=10901&categoryId=12685&langId=-1&storeId=10051&topCategoryId=12202')\"> CLASSIC SHORTS </a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=12204&catalogId=10901&categoryId=12247&langId=-1&storeId=10051&topCategoryId=12202')\">ATHLETIC SHORTS</a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=12204&catalogId=10901&categoryId=12691&langId=-1&storeId=10051&topCategoryId=12202')\"> JEANS </a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=12204&catalogId=10901&categoryId=12244&langId=-1&storeId=10051&topCategoryId=12202')\">PANTS </a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=12204&catalogId=10901&categoryId=12240&langId=-1&storeId=10051&topCategoryId=12202')\">SWIM </a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=12204&catalogId=10901&categoryId=12684&langId=-1&storeId=10051&topCategoryId=12202')\">ACCESSORIES</a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=12204&catalogId=10901&categoryId=12692&langId=-1&storeId=10051&topCategoryId=12202')\"> SLEEP</a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('http://www.abercrombie.com/webapp/wcs/stores/servlet/CategoryDisplay?parentCategoryId=12204&catalogId=10901&categoryId=12241&langId=-1&storeId=10051&topCategoryId=12202')\"> UNDERWEAR </a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("  \t <tr>\r\n");
      out.write("  \t\t<td><a href=\"javascript:goToPage('')\">  </a></td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write(" \r\n");
      out.write("  \t\r\n");
      out.write("  \t</table>\r\n");
      out.write("  \t\t<table style=\"margin:auto;margin-top:0%;\">\r\n");
      out.write("  \t\t<tr>\r\n");
      out.write("    \t<td><a href=\"af.html\"><img src=\"/image/Home.png\"  ></a></td>\r\n");
      out.write("   \t\t\t</tr>\r\n");
      out.write("  \t\t</table>\r\n");
      out.write("   </body>\r\n");
      out.write("</html>\r\n");
      out.write("     \r\n");
      out.write("\t<script language=\"javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\t   function goToPage(searchtype, discount){\r\n");
      out.write("\t    var searchurl=\"customersearch.jsp?firstload=1&searchurl=\"+encodeURIComponent(searchtype);\r\n");
      out.write("\t    if(discount!=undefined){\r\n");
      out.write("\t    \tsearchurl=searchurl+\"&showdiscount=\"+discount;\t\r\n");
      out.write("\t    }\r\n");
      out.write("    \t//window.open(searchurl);\r\n");
      out.write("    \twindow.location.href=searchurl;\r\n");
      out.write("      }\r\n");
      out.write("     </script>");
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
