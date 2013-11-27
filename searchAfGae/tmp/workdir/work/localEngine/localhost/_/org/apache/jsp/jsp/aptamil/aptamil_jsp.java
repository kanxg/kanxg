package org.apache.jsp.jsp.aptamil;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import kxg.searchaf.url.aptamil.AptamilProduct;
import kxg.searchaf.url.aptamil.SearchAptamilJSP;

public final class aptamil_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t \r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <body onload=\"init()\">\r\n");
      out.write("\r\n");

   SearchAptamilJSP searchAptamilJSP=new SearchAptamilJSP();
   searchAptamilJSP.chechInventory();
   ArrayList<AptamilProduct> matchprolist=searchAptamilJSP.matchprolist;

      out.write("\r\n");
      out.write("\r\n");
      out.write("    <form name=\"frm\" action=\"aptamil.jsp\" method=\"post\" \">\r\n");
      out.write("       \r\n");
      out.write("\t <table>\r\n");
      out.write("\t <tr>\r\n");
      out.write("      \t\t<td><input type=\"submit\"  value=\"查询\" style=\"width:100px;\"/></td>\r\n");
      out.write("      \t\t<td><input type=\"submit\"  value=\"返回\"  onclick=\"back();\" style=\"width:100px;\"/></td>\r\n");
      out.write("       </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("     </form>\r\n");
      out.write("      <table>  \r\n");
      out.write("     ");

     if(matchprolist!=null){
      for (int i = 0; i < matchprolist.size(); i++) {
    	  AptamilProduct product= matchprolist.get(i);
    	
      out.write("  \r\n");
      out.write("       \t <tr>  \r\n");
      out.write("         <td>");
      out.print(product.toString());
      out.write("<br/></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("         ");

        }
      }
      
      out.write("\r\n");
      out.write("        \r\n");
      out.write("       </table>\r\n");
      out.write("       \r\n");
      out.write("           <p><a href=\"/jsp/aptamil/aptamilReadme.html\">使用说明</a></p>\r\n");
      out.write(" \r\n");
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
      out.write("\tdocument.frm.action=\"/index.html\";\r\n");
      out.write("\tdocument.frm.submit();\r\n");
      out.write("}\r\n");
      out.write("  function openUrl(url){\r\n");
      out.write("\t   //alert(url);\r\n");
      out.write("    \twindow.open(url);\r\n");
      out.write("     }\r\n");
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
