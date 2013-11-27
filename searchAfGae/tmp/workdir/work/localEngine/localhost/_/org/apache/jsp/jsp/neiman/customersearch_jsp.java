package org.apache.jsp.jsp.neiman;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import kxg.searchaf.url.neiman_cat.SearchNeimanJSP;
import kxg.searchaf.url.neiman_cat.NeimanProduct;
import kxg.searchaf.url.neiman_cat.NeimanConstant;

public final class customersearch_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("  var vglnk = { api_url: '//api.viglink.com/api',\r\n");
      out.write("                key: '1fd42f1d7997ed7abc43c8b7486548c4' };\r\n");
      out.write("\r\n");
      out.write("  (function(d, t) {\r\n");
      out.write("    var s = d.createElement(t); s.type = 'text/javascript'; s.async = true;\r\n");
      out.write("    s.src = ('https:' == document.location.protocol ? vglnk.api_url :\r\n");
      out.write("             '//cdn.viglink.com/api') + '/vglnk.js';\r\n");
      out.write("    var r = d.getElementsByTagName(t)[0]; r.parentNode.insertBefore(s, r);\r\n");
      out.write("  }(document, 'script'));\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "head.jsp", out, false);
      out.write(" \r\n");
      out.write("\r\n");
      out.write("   <body onload=\"init()\">\r\n");
      out.write("\r\n");
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "top.jsp", out, false);
      out.write(' ');
      out.write('\r');
      out.write('\n');


	boolean firstload=false;
	
    String showdiscount = request.getParameter("showdiscount");
    if(showdiscount==null){
		showdiscount=String.valueOf(NeimanConstant.warningdiscount);
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
	if(email==null){
		email="";
	}
	
	String searchurl = request.getParameter("searchurl");
	if(searchurl==null){
		searchurl="";
	}
	
	SearchNeimanJSP af=new SearchNeimanJSP();
	List<NeimanProduct> matchprolist = null;
	if(!firstload ){
		matchprolist=af.getcustomerdiscountproductforJsp(searchurl,showdiscount,email,searchtext);
	};
	
	 

      out.write("\r\n");
      out.write("\r\n");
      out.write("    <form name=\"frm\" action=\"customersearch.jsp\" method=\"post\" onsubmit=\"return checkinput()\">\r\n");
      out.write("      <table>\r\n");
      out.write("             <tr>\r\n");
      out.write("      \t\t<td>搜索URL:<input type=\"text\" name=\"searchurl\" value=\"");
      out.print(searchurl);
      out.write("\" size=\"160\"/></td>\r\n");
      out.write("      \t\t<td>输入Neiman 网站任意链接</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      \r\n");
      out.write("      <tr>\r\n");
      out.write("      \t\t<td>显示折扣:<input type=\"text\" name=\"showdiscount\" value=\"");
      out.print(showdiscount);
      out.write("\"/></td>\r\n");
      out.write("      \t\t<td> </td>\r\n");
      out.write("      </tr>\r\n");
      out.write(" \t <tr>\r\n");
      out.write("      \t\t<td>搜索名称:<input type=\"text\" name=\"searchtext\" value=\"");
      out.print(searchtext);
      out.write("\"/></td>\r\n");
      out.write("      \t\t<td> </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("  \r\n");
      out.write("\t </table>\r\n");
      out.write("\t <table>\r\n");
      out.write("\t <tr>\r\n");
      out.write("      \t\t<td><input type=\"submit\" value=\"刷新\"/></td>\r\n");
      out.write("      \t\t<td><input type=\"submit\" value=\"返回\" onclick=\"back();\"/></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("     </form>\r\n");
      out.write("     \r\n");
      out.write("      <table width='100%'>  \r\n");
      out.write("     ");

     if(matchprolist!=null){
      for (int i = 0; i < matchprolist.size(); i++) {
    	  NeimanProduct product= matchprolist.get(i);
    	  int mod=i % 4 ;
     	  if(mod==0){
       
      out.write("\r\n");
      out.write("       \t <tr width='100%'>  \r\n");
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
      out.write("       \t ");
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
      out.write("       \r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("function back(){\r\n");
      out.write("\tdocument.frm.action=\"rl.html\";\r\n");
      out.write("\tdocument.frm.submit();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
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
