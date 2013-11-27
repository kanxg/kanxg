<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<%@ page import="kxg.searchaf.url.hollisterco.SearchHollistercoJSP" %>
<%@ page import="kxg.searchaf.url.hollisterco.HollistercoProduct" %>
<%@ page import="kxg.searchaf.url.hollisterco.HollistercoConstant" %>


<html>
<head>
		 
			<link rel="stylesheet" href="/searchaf/js/site.css" />


</head>


  <body onload="init()">

<%
      
    String firstload=request.getParameter("firstload");;
	
    String showdiscount = request.getParameter("showdiscount");
    if(showdiscount==null){
		showdiscount=String.valueOf(HollistercoConstant.warningdiscount);
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
	
	
	String searchurl = request.getParameter("searchurl");
	if(searchurl==null){
		searchurl="";
	}
	
	SearchHollistercoJSP hollisterco=new SearchHollistercoJSP();
	List<HollistercoProduct> matchprolist = null;
	if("0".equals(firstload) ){
		matchprolist=hollisterco.getcustomerdiscountproductforJsp(searchurl,showdiscount,email,searchtext);
	}; 
%>

    <form name="frm" action="<%=request.getContextPath()%>/hco/customersearch" method="post" onsubmit="return checkinput()">
      <table>
      <tr>
      		<td>搜索URL:(输入A&F网站任意链接)</td>
      </tr>
        <tr>
      		<td>搜索URL:<input type="text" name="searchurl" value="<%=searchurl%>" size="220"/></td>
      </tr>
      <tr>
      		<td>显示折扣:<input type="text" name="showdiscount" value="<%=showdiscount%>"/></td>
      		<td><input type="hidden" name="firstload" value="0"/> </td>
      </tr>
 		<tr>
      		<td>搜索名称:<input type="text" name="searchtext" value="<%=searchtext%>"/></td>
      		<td> </td>
      </tr>
      <tr>
      		<td>购买邮箱:<input type="text" name="email" size=30 value="<%=email%>"/> </td>
       </tr>  
       <tr>
      		<td>购买了监视系统软件的,请输入你的邮箱,否则无法显示库存</td>
	 </tr>
      <tr>
		<td> 产品10元/每月, <a href="http://item.taobao.com/item.htm?id=25941644664" target="_blank"> 购买请点击 </a></td>
	 </tr>
	 </table>
	 <table>
      <tr>
      		<td><input type="submit"   value="查询" style="width:100px;"/></td>
       </tr>
      </table>
     </form>
     
     <table width='100%'>  
     <%
     if(matchprolist!=null){
      for (int i = 0; i < matchprolist.size(); i++) {
    	  HollistercoProduct product= matchprolist.get(i);
    	  int mod=i % 4 ;
     	  if(mod==0){
       %>
       	  <tr width='100%'>  
       <% }%>
       	
        <td width='25%'><div><%=product.toJspString()%><%=product.tagcontext%><br/></div></td>
       <%
         if(mod==3){
         %>
          </tr>
         <%
         }
        }
     }
      %>
       </table>
     
  </body>
</html>

<script language="javascript">
function back(){
	document.frm.action="hollisterco.html";
	document.frm.submit();
}
function checkinput(){
	showdiscount= document.frm.showdiscount.value;
	if(!isNumber(showdiscount)){
		$.globalMessenger().post("请输入0至1之间的一个数值");
		return false;
	}
	if(Number(showdiscount)<0.01 || Number(showdiscount)>1){
		$.globalMessenger().post("请输入0至1之间的一个数值");
		return false;
	}
}
function isNumber(oNum) 
{ 
	if(!oNum) return false; 
	var strP=/^\d+(\.\d+)?$/; 
	if(!strP.test(oNum)) return false; 
	try{ 
		if(parseFloat(oNum)!=oNum) return false; 
	} 
	catch(ex) 
	{ 
		return false; 
	} 
	return true; 
}
</script>