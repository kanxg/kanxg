package org.apache.jsp.jsp.af;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import kxg.searchaf.url.af.SearchAfJSP;
import kxg.searchaf.url.af.AfProduct;
import kxg.searchaf.url.af.AfConstant;

public final class searchafmen_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

int num = 0;
    synchronized void add() {
        num++;
    }
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/count.jsp");
  }

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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("        <title></title>\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width\">\r\n");
      out.write("        \r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://www.abercrombie.com/anf/56942/css/global/site.css\" />\r\n");
      out.write("\t\t\t<!--\r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://www.abercrombie.com/anf/56942/css/global/global-min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://www.abercrombie.com/anf/56942/css/accountsection/accountsection-min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://www.abercrombie.com/anf/56942/css/include/print.css\" media=\"print\" />\r\n");
      out.write("\t-->\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap -->\r\n");
      out.write("    <link href=\"/css/bootstrap.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("    <link href=\"/css/af/include.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("    \r\n");
      out.write("  \t <script src=\"/js/jquery-1.10.2.min.js\"></script>\r\n");
      out.write("     <script src=\"/js/bootstrap.min.js\"></script>\r\n");
      out.write(" </head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <body onload=\"init()\">\r\n");
      out.write("\r\n");
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
      out.write("</div>\r\n");
      out.write("\r\n");

    boolean firstload=false;
	
    String showdiscount = request.getParameter("showdiscount");
    if(showdiscount==null){
		showdiscount=String.valueOf(AfConstant.warningdiscount);
		firstload=true;
	}
	
	String searchtext = request.getParameter("searchtext");
    if(searchtext==null){
		searchtext="";
	}
	
	String userdiscount = request.getParameter("userdiscount");
	if(userdiscount==null){
		userdiscount="1";
	}
	
	String email = request.getParameter("email");
	String emailinSession = (String)session.getAttribute("email");
	if(email==null){
		if(emailinSession==null){
			email="";
		}else{
			email=emailinSession;
		}
	}else{
		if(emailinSession==null||!emailinSession.equals(email)){
			session.setAttribute("email",email);
		}
	}
	
	SearchAfJSP af=new SearchAfJSP();
	List<AfProduct> matchprolist = null;
	if(!firstload ){
		matchprolist=af.getmendiscountproductforJsp(showdiscount,email,searchtext);
	};
	 

      out.write("\r\n");
      out.write("\r\n");
      out.write("    <form name=\"frm\" class=\"form-horizontal\" action=\"searchafmen.jsp\" method=\"post\" onsubmit=\"return checkinput()\">\r\n");
      out.write("      <table>\r\n");
      out.write("      <tr>\r\n");
      out.write("      \t\t<td>显示折扣:<input type=\"text\" name=\"showdiscount\" value=\"");
      out.print(showdiscount);
      out.write("\"/>只显示在当前折扣以下的产品</td>\r\n");
      out.write("      </tr>\r\n");
      out.write(" \t <tr>\r\n");
      out.write("      \t\t<td>搜索名称:<input type=\"text\" name=\"searchtext\" value=\"");
      out.print(searchtext);
      out.write("\"/>根据产品名称搜索，比如：只显示衬衫， 输入 \"SHIRTS\"</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("      \t\t<td>购买邮箱:<input type=\"text\" name=\"email\" size=30 value=\"");
      out.print(email);
      out.write("\"/>购买了监视系统软件的,请输入你的邮箱,否则无法显示库存, 点击库存即可加入购物车  </td>\r\n");
      out.write("      \t</tr>\r\n");
      out.write("  \r\n");
      out.write("      <tr>\r\n");
      out.write("\t\t<td> 产品10元/每月, <a href=\"http://item.taobao.com/item.htm?id=25941644664\" target=\"_blank\"> 购买请点击 </a></td>\r\n");
      out.write("\t </tr>\r\n");
      out.write("\t </table>\r\n");
      out.write("\t <table>\r\n");
      out.write("      <tr>\r\n");
      out.write("      \t\t<td><input type=\"submit\"   value=\"查询\" style=\"width:100px;\"/></td>\r\n");
      out.write("      \t\t<td align=\"right\"><input type=\"button\"  value=\"查看购物车\" style=\"width:100px;\" onclick=\"addToCart('https://www.abercrombie.com/webapp/wcs/stores/servlet/OrderItemDisplayView?orderStatus=P&catalogId=10901&langId=-1&storeId=10051');\" /></td>\r\n");
      out.write("            <td align=\"right\"><input type=\"button\"  value=\"结帐\" style=\"width:100px;\" onclick=\"addToCart('https://www.abercrombie.com/webapp/wcs/stores/servlet/ANFCheckOrderItems?doInventory=N&errpage=OrderItemDisplayView&URL=OrderShippingSectionDisplayView&storeId=10051&catalogId=10901&langId=-1');\" /></td>\r\n");
      out.write("        \r\n");
      out.write("       </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("     </form>\r\n");
      out.write("           \r\n");
      out.write("\r\n");
      out.write("      <table width='100%'>  \r\n");
      out.write("     ");

     if(matchprolist!=null){
      for (int i = 0; i < matchprolist.size(); i++) {
    	  AfProduct product= matchprolist.get(i);
    	  int mod=i % 4 ;
     	  if(mod==0){
       
      out.write("\r\n");
      out.write("       \t  <tr width='100%'>  \r\n");
      out.write("       ");
 }
      out.write("\r\n");
      out.write("       \t\r\n");
      out.write("        <td width='25%'><div>");
      out.print(product.toJspString());
      out.print(product.tagcontext);
      out.write("<br/></div></td>\r\n");
      out.write("       ");

         if(mod==3){
         
      out.write("\r\n");
      out.write("          </tr>\r\n");
      out.write("         ");

         }
        }
     }
      
      out.write("\r\n");
      out.write("       </table>\r\n");
      out.write("     \r\n");
      out.write("      ");
      out.write(' ');
      out.write(' ');
  String showcount=request.getParameter("showcount");        
      out.write("\r\n");
      out.write("     ");
      out.write("\r\n");
      out.write("\t ");

	   if(showcount==null){
	    add();
	    }else{
	 
      out.write("\r\n");
      out.write("\t  <div>visit count: ");
      out.print(num);
      out.write("  </div>\r\n");
      out.write("      ");
 }  
      out.write(" \r\n");
      out.write("      \r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("function back(){\r\n");
      out.write("\tdocument.frm.action=\"af.html\";\r\n");
      out.write("\tdocument.frm.submit();\r\n");
      out.write("}\r\n");
      out.write("function checkinput(){\r\n");
      out.write("\tshowdiscount= document.frm.showdiscount.value;\r\n");
      out.write("\tif(!isNumber(showdiscount)){\r\n");
      out.write("\t\talert(\"请输入0至1之间的一个数值\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(Number(showdiscount)<0.01 || Number(showdiscount)>1){\r\n");
      out.write("\t\talert(\"请输入0至1之间的一个数值\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
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
      out.write("\t   function addToCart(url){\r\n");
      out.write("\t   //alert(url);\r\n");
      out.write("    \twindow.open(url);\r\n");
      out.write("    \t}\r\n");
      out.write("</script>");
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
