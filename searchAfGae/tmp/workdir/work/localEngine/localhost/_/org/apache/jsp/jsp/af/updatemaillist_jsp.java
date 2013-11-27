package org.apache.jsp.jsp.af;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import kxg.searchaf.url.af.AfMailListJSP;
import kxg.searchaf.url.af.AfMailList;
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
     AfMailList afMailList=new AfMailList();
     String  valideTime="";
     String userType="";
     String mailaddress = request.getParameter("mailaddress");
	 if(mailaddress!=null){
	      String action = request.getParameter("action");
	 	if("update".equals(action)){
			 boolean warningMen=false;
	 		 if(request.getParameterValues("warningMen")!=null){
	 		 	 warningMen=true; 		 
	 		 }
	 		 boolean warningWomen=false;
	 		 if(request.getParameterValues("warningWomen")!=null){
	 		 	 warningWomen=true; 		 
	 		 }
	 		 boolean warningCode=false;
	 		 if(request.getParameterValues("warningCode")!=null){
	 		 	 warningCode=true; 		 
	 		 }
 	 		 boolean mencheckingClearance=false;
	 		 if(request.getParameterValues("mencheckingClearance")!=null){
	 		 	 mencheckingClearance=true; 		 
	 		 }
	 		 boolean womencheckingClearance=false;
	 		 if(request.getParameterValues("womencheckingClearance")!=null){
	 		 	 womencheckingClearance=true; 		 
	 		 }
	 		 boolean mencheckingSale=false;
	 		 if(request.getParameterValues("mencheckingSale")!=null){
	 		 	 mencheckingSale=true; 		 
	 		 }
	 		 boolean womencheckingSale=false;
	 		 if(request.getParameterValues("womencheckingSale")!=null){
	 		 	 womencheckingSale=true; 		 
	 		 }
	 		 boolean mencheckingRegular=false;
	 		 if(request.getParameterValues("mencheckingRegular")!=null){
	 		 	 mencheckingRegular=true; 		 
	 		 }
	 		 boolean womencheckingRegular=false;
	 		 if(request.getParameterValues("womencheckingRegular")!=null){
	 		 	 womencheckingRegular=true; 		 
	 		 }
	 		 boolean mencheckingSecretSale=false;
	 		 if(request.getParameterValues("mencheckingSecretSale")!=null){
	 		 	 mencheckingSecretSale=true; 		 
	 		 }
	 		 boolean womencheckingSecretSale=false;
	 		 if(request.getParameterValues("womencheckingSecretSale")!=null){
	 		 	 womencheckingSecretSale=true; 		 
	 		 }
	 		 String mencheckingClearanceDiscount = request.getParameter("mencheckingClearanceDiscount");
	 		 String womencheckingClearanceDiscount = request.getParameter("womencheckingClearanceDiscount");
	 		 String mencheckingSaleDiscount = request.getParameter("mencheckingSaleDiscount");
	 		 String womencheckingSaleDiscount = request.getParameter("womencheckingSaleDiscount");
	 		 String[] mencheckingCategory = request.getParameterValues("mencheckingCategory");
	 		 String[] womencheckingCategory = request.getParameterValues("womencheckingCategory");
	 		 String[] mencheckingSize = request.getParameterValues("mencheckingSize");
	 		 String[] womencheckingSize = request.getParameterValues("womencheckingSize");
	 		 
	 		 AfMailListJSP jsp=new AfMailListJSP();
	 		 ErrMsg=jsp.updateMail(mailaddress,warningMen,warningWomen,warningCode,
	 		 mencheckingRegular,mencheckingSecretSale,mencheckingClearance,
	 		 mencheckingSale,mencheckingClearanceDiscount,mencheckingSaleDiscount,
	 		 mencheckingCategory,mencheckingSize,
	 		 womencheckingRegular,womencheckingSecretSale,womencheckingClearance,
	 		 womencheckingSale,womencheckingClearanceDiscount,womencheckingSaleDiscount,
	 		 womencheckingCategory,womencheckingSize);
	 		 if("success".equals(ErrMsg)){
	 		 	ErrMsg="更新成功.";
	 		 }
	 	}
			AfMailListJSP jsp=new AfMailListJSP();
			AfMailList afMailList1=jsp.loadMail(mailaddress);
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
      out.write("  \r\n");
      out.write("     <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"warningCode\">新折扣码提醒</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("\t  <input type=\"checkbox\" id=\"warningCode\" name=\"warningCode\" value=\"warningCode\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div> \r\n");
      out.write("  \r\n");
      out.write("   <hr>\r\n");
      out.write("   \r\n");
      out.write("   <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"warningMen\">男士区</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("\t  <input type=\"checkbox\" id=\"warningMen\" name=\"warningMen\" value=\"warningMen\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div> \r\n");
      out.write("  \r\n");
      out.write("  <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"mencheckingRegular\">正价区</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("\t  <input type=\"checkbox\" id=\"mencheckingRegular\" name=\"mencheckingRegular\" value=\"mencheckingRegular\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>   \r\n");
      out.write("  \r\n");
      out.write("    <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"mencheckingSale\">S区</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("\t  <input type=\"checkbox\" id=\"mencheckingSale\" name=\"mencheckingSale\" value=\"mencheckingSale\">\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("  </div>   \r\n");
      out.write("  <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"mencheckingSaleDiscount\">S区告警折扣</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("      <input type=\"text\" id=\"mencheckingSaleDiscount\" name=\"mencheckingSaleDiscount\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"mencheckingClearance\">C区</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("\t  <input type=\"checkbox\" id=\"mencheckingClearance\" name=\"mencheckingClearance\" value=\"mencheckingClearance\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>   \r\n");
      out.write("  \r\n");
      out.write("    <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"mencheckingClearanceDiscount\">C区告警折扣</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("      <input type=\"text\" id=\"mencheckingClearanceDiscount\" name=\"mencheckingClearanceDiscount\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"mencheckingSecretSale\">Secret Sale区</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("\t  <input type=\"checkbox\" id=\"mencheckingSecretSale\" name=\"mencheckingSecretSale\" value=\"mencheckingSecretSale\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>   \r\n");
      out.write("  \r\n");
      out.write("    <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"mencheckingCategory\">选择分类</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("     <select id=\"mencheckingCategory\" name=\"mencheckingCategory\" multiple=\"multiple\" size=15>\r\n");
      out.write("\t\t  <option value=\"TEES\">TEES</option>\r\n");
      out.write("\t\t  <option value=\"POLOS\">POLOS</option>\r\n");
      out.write("\t\t  <option value=\"SHIRTS\">SHIRTS</option>\r\n");
      out.write("\t\t  <option value=\"HOODIES & SWEATSHIRTS\">HOODIES & SWEATSHIRTS</option>\r\n");
      out.write("\t\t  <option value=\"SWEATERS\">SWEATERS</option>\r\n");
      out.write("\t\t  <option value=\"OUTERWEAR\">OUTERWEAR</option>\r\n");
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
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("    <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"mencheckingSize\">选择尺码</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("     <select id=\"mencheckingSize\" name=\"mencheckingSize\"  multiple=\"multiple\" size=34>\r\n");
      out.write("\t\t  <option value=\"XS\">XS</option>\r\n");
      out.write("\t\t  <option value=\"S\">S</option>\r\n");
      out.write("\t\t  <option value=\"M\">M</option>\r\n");
      out.write("\t\t  <option value=\"L\">L</option>\r\n");
      out.write("\t\t  <option value=\"XL\">XL</option>\r\n");
      out.write("\t\t  <option value=\"XXL\">XXL</option>\r\n");
      out.write("\t\t  <option value=\"28 X 30\">28 X 30</option>\r\n");
      out.write("\t\t  <option value=\"28 X 32\">28 X 32</option>\r\n");
      out.write("\t\t  <option value=\"30 X 30\">30 X 30</option>\r\n");
      out.write("\t\t  <option value=\"30 X 32\">30 X 32</option>\r\n");
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
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("   <hr> \r\n");
      out.write("   \r\n");
      out.write("   <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"warningWomen\">女士区</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("\t  <input type=\"checkbox\" id=\"warningWomen\" name=\"warningWomen\" value=\"warningWomen\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div> \r\n");
      out.write("  \r\n");
      out.write(" <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"womencheckingRegular\">正价区</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("\t  <input type=\"checkbox\" id=\"womencheckingRegular\" name=\"womencheckingRegular\" value=\"womencheckingRegular\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>   \r\n");
      out.write("  \r\n");
      out.write("    <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"womencheckingSale\">S区</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("\t  <input type=\"checkbox\" id=\"womencheckingSale\" name=\"womencheckingSale\" value=\"womencheckingSale\">\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("  </div>   \r\n");
      out.write("  <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"womencheckingSaleDiscount\">S区告警折扣</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("      <input type=\"text\" id=\"womencheckingSaleDiscount\" name=\"womencheckingSaleDiscount\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"womencheckingClearance\">C区</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("\t  <input type=\"checkbox\" id=\"womencheckingClearance\" name=\"womencheckingClearance\" value=\"womencheckingClearance\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>   \r\n");
      out.write("  \r\n");
      out.write("    <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"womencheckingClearanceDiscount\">C区告警折扣</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("      <input type=\"text\" id=\"womencheckingClearanceDiscount\" name=\"womencheckingClearanceDiscount\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"womencheckingSecretSale\">Secret Sale区</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("\t  <input type=\"checkbox\" id=\"womencheckingSecretSale\" name=\"womencheckingSecretSale\" value=\"womencheckingSecretSale\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>   \r\n");
      out.write("  \r\n");
      out.write("    <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"womencheckingCategory\">选择分类</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("     <select id=\"womencheckingCategory\" name=\"womencheckingCategory\" multiple=\"multiple\" size=21>\r\n");
      out.write("\t\t  <option value=\"FASHION TOPS\">FASHION TOPS</option>\r\n");
      out.write("\t\t  <option value=\"LAYERING TEES & TANKS\">LAYERING TEES & TANKS</option>\r\n");
      out.write("\t\t  <option value=\"GRAPHIC TEES\">GRAPHIC TEES</option>\r\n");
      out.write("\t\t  <option value=\"SHIRTS\">SHIRTS</option>\r\n");
      out.write("\t\t  <option value=\"POLOS\">POLOS</option>\r\n");
      out.write("\t\t  <option value=\"HOODIES & SWEATSHIRTS\">HOODIES & SWEATSHIRTS</option>\r\n");
      out.write("\t\t  <option value=\"SWEATERS\">SWEATERS</option>\r\n");
      out.write("\t\t  <option value=\"OUTERWEAR\">OUTERWEAR</option>\t\t  \r\n");
      out.write("\t\t  <option value=\"SHORTS\">SHORTS</option>\r\n");
      out.write("\t\t  <option value=\"JEANS\">JEANS</option>\r\n");
      out.write("\t\t  <option value=\"SWEATPANTS\">SWEATPANTS</option>\r\n");
      out.write("\t\t  <option value=\"LEGGINGS\">LEGGINGS</option>\r\n");
      out.write("\t\t  <option value=\"PANTS\">PANTS</option>\t\t  \r\n");
      out.write("\t\t  <option value=\"YOGA\">YOGA</option>\r\n");
      out.write("\t\t  <option value=\"SKIRTS\">SKIRTS</option>\r\n");
      out.write("\t\t  <option value=\"DRESSES & ROMPERS\">DRESSES & ROMPERS</option>\r\n");
      out.write("\t\t  <option value=\"SWIM\">SWIM</option>\r\n");
      out.write("\t\t  <option value=\"SLEEP\">SLEEP</option>\r\n");
      out.write("\t\t  <option value=\"FLIP FLOPS\">FLIP FLOPS</option>\r\n");
      out.write("\t\t  <option value=\"ACCESSORIES\">ACCESSORIES</option>\r\n");
      out.write("\t\t  <option value=\"BRAS & UNDIES\">BRAS & UNDIES</option>\r\n");
      out.write("\t\t</select>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("    <div class=\"control-group\">\r\n");
      out.write("    <label class=\"control-label\" for=\"womencheckingSize\">选择尺码</label>\r\n");
      out.write("    <div class=\"controls\">\r\n");
      out.write("     <select id=\"womencheckingSize\" name=\"womencheckingSize\"  multiple=\"multiple\" size=16>\r\n");
      out.write("\t\t  <option value=\"XS\">XS</option>\r\n");
      out.write("\t\t  <option value=\"S\">S</option>\r\n");
      out.write("\t\t  <option value=\"M\">M</option>\r\n");
      out.write("\t\t  <option value=\"L\">L</option>\r\n");
      out.write("\t\t  <option value=\"000\">000</option>\r\n");
      out.write("\t\t  <option value=\"00\">00</option>\r\n");
      out.write("\t\t  <option value=\"0\">0</option>\r\n");
      out.write("\t\t  <option value=\"2\">2</option>\r\n");
      out.write("\t\t  <option value=\"4\">4</option>\r\n");
      out.write("\t\t  <option value=\"6\">6</option>\r\n");
      out.write("\t\t  <option value=\"8\">8</option>\r\n");
      out.write("\t\t  <option value=\"10\">10</option>\r\n");
      out.write("\t\t  <option value=\"12\">12</option>\r\n");
      out.write("\t\t  <option value=\"1 SIZE\">1 SIZE</option>\r\n");
      out.write("\t\t  <option value=\"XS/S\">XS/S</option>\r\n");
      out.write("\t\t  <option value=\"M/L\">M/L</option>\r\n");
      out.write("\r\n");
      out.write("\t\t</select>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
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
      out.write("\t $(\"#warningMen\").attr(\"checked\", ");
      out.print(afMailList.warningMen);
      out.write(");\r\n");
      out.write("\t $(\"#warningWomen\").attr(\"checked\", ");
      out.print(afMailList.warningWomen);
      out.write(");\r\n");
      out.write("\t $(\"#warningCode\").attr(\"checked\", ");
      out.print(afMailList.warningCode);
      out.write(");\r\n");
      out.write("\t \r\n");
      out.write("\t $(\"#mencheckingRegular\").attr(\"checked\", ");
      out.print(afMailList.mencheckingRegular);
      out.write(");\r\n");
      out.write("\t $(\"#mencheckingSecretSale\").attr(\"checked\", ");
      out.print(afMailList.mencheckingSecretSale);
      out.write(");\r\n");
      out.write("\t $(\"#mencheckingClearance\").attr(\"checked\", ");
      out.print(afMailList.mencheckingClearance);
      out.write(");\r\n");
      out.write("\t $(\"#mencheckingSale\").attr(\"checked\", ");
      out.print(afMailList.mencheckingSale);
      out.write(");\r\n");
      out.write("\t $(\"#mencheckingClearanceDiscount\").val(\"");
      out.print(afMailList.mencheckingClearanceDiscount);
      out.write("\");\r\n");
      out.write("\t $(\"#mencheckingSaleDiscount\").val(\"");
      out.print(afMailList.mencheckingSaleDiscount);
      out.write("\");\r\n");
      out.write("\t ");

	 	if(afMailList.mencheckingCategory!=null)
	 	for (int i = 0; i < afMailList.mencheckingCategory.size(); i++) {
	  
      out.write("\r\n");
      out.write("\t      $(\"#mencheckingCategory\").find(\"option[value='");
      out.print(afMailList.mencheckingCategory.get(i));
      out.write("']\").attr(\"selected\",true);\r\n");
      out.write("\t  ");

		}
	 
      out.write("\r\n");
      out.write("\t \t ");

	 	if(afMailList.mencheckingSize!=null)
	 	for (int i = 0; i < afMailList.mencheckingSize.size(); i++) {
	  
      out.write("\r\n");
      out.write("\t      $(\"#mencheckingSize\").find(\"option[value='");
      out.print(afMailList.mencheckingSize.get(i));
      out.write("']\").attr(\"selected\",true);\r\n");
      out.write("\t  ");

		}
	 
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t $(\"#womencheckingRegular\").attr(\"checked\", ");
      out.print(afMailList.womencheckingRegular);
      out.write(");\r\n");
      out.write("\t $(\"#womencheckingSecretSale\").attr(\"checked\", ");
      out.print(afMailList.womencheckingSecretSale);
      out.write(");\r\n");
      out.write("\t $(\"#womencheckingClearance\").attr(\"checked\", ");
      out.print(afMailList.womencheckingClearance);
      out.write(");\r\n");
      out.write("\t $(\"#womencheckingSale\").attr(\"checked\", ");
      out.print(afMailList.womencheckingSale);
      out.write(");\r\n");
      out.write("\t $(\"#womencheckingClearanceDiscount\").val(\"");
      out.print(afMailList.womencheckingClearanceDiscount);
      out.write("\");\r\n");
      out.write("\t $(\"#womencheckingSaleDiscount\").val(\"");
      out.print(afMailList.womencheckingSaleDiscount);
      out.write("\");\r\n");
      out.write("\t ");

	 	if(afMailList.womencheckingCategory!=null)
	 	for (int i = 0; i < afMailList.womencheckingCategory.size(); i++) {
	  
      out.write("\r\n");
      out.write("\t      $(\"#womencheckingCategory\").find(\"option[value='");
      out.print(afMailList.womencheckingCategory.get(i));
      out.write("']\").attr(\"selected\",true);\r\n");
      out.write("\t  ");

		}
	 
      out.write("\r\n");
      out.write("\t \t ");

	 	if(afMailList.womencheckingSize!=null)
	 	for (int i = 0; i < afMailList.womencheckingSize.size(); i++) {
	  
      out.write("\r\n");
      out.write("\t      $(\"#womencheckingSize\").find(\"option[value='");
      out.print(afMailList.womencheckingSize.get(i));
      out.write("']\").attr(\"selected\",true);\r\n");
      out.write("\t  ");

		}
	 
      out.write("\r\n");
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
      out.write("  \t\tvar tem1=$(\"#mencheckingClearanceDiscount\").val();\r\n");
      out.write("  \tif(!isNumber(tem1)){\r\n");
      out.write("\t\talert(\"C区折扣，请输入0至1之间的一个数值\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(Number(tem1)<0.01 || Number(tem1)>1){\r\n");
      out.write("\t\talert(\"C区折扣，请输入0至1之间的一个数值\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\tvar tem2=$(\"#mencheckingSaleDiscount\").val();\r\n");
      out.write("  \tif(!isNumber(tem2)){\r\n");
      out.write("\t\talert(\"S区折扣，请输入0至1之间的一个数值\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(Number(tem2)<0.01 || Number(tem2)>1){\r\n");
      out.write("\t\talert(\"S区折扣，请输入0至1之间的一个数值\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tvar tem1=$(\"#womencheckingClearanceDiscount\").val();\r\n");
      out.write("  \tif(!isNumber(tem1)){\r\n");
      out.write("\t\talert(\"C区折扣，请输入0至1之间的一个数值\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(Number(tem1)<0.01 || Number(tem1)>1){\r\n");
      out.write("\t\talert(\"C区折扣，请输入0至1之间的一个数值\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\tvar tem2=$(\"#womencheckingSaleDiscount\").val();\r\n");
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
