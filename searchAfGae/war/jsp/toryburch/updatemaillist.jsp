<%@ page contentType="text/html;charset=utf-8" language="java" %>
<%@ page import="java.util.*" %>
<%@ page import="kxg.searchaf.url.toryburch.ToryburchMailListJSP" %>
<%@ page import="kxg.searchaf.url.toryburch.ToryburchMailList" %>
<%@ page import="kxg.searchaf.util.TimeUtli" %>
<%request.setCharacterEncoding("utf-8");%>  

<%	
	 String ErrMsg="";
     ToryburchMailList afMailList=new ToryburchMailList();
     String  valideTime="";
     String userType="";
     String mailaddress = request.getParameter("mailaddress");
	 if(mailaddress!=null){
	      String action = request.getParameter("action");
	 	if("update".equals(action)){
			 
	 		 boolean warningWomen=false;
	 		 if(request.getParameterValues("warningWomen")!=null){
	 		 	 warningWomen=true; 		 
	 		 }

	 		 String womencheckingSaleDiscount = request.getParameter("womencheckingSaleDiscount");
	 		
	 		 ToryburchMailListJSP jsp=new ToryburchMailListJSP();
	 		 ErrMsg=jsp.updateMail(mailaddress,warningWomen,womencheckingSaleDiscount);
	 		 if("success".equals(ErrMsg)){
	 		 	ErrMsg="更新成功.";
	 		 }
	 	}
			ToryburchMailListJSP jsp=new ToryburchMailListJSP();
			ToryburchMailList afMailList1=jsp.loadMail(mailaddress);
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
	 
%>

<!DOCTYPE html>
<html lang="en">
     <jsp:include page="head.jsp"/> 
  

  <body>
 <jsp:include page="top.jsp"/> 
  
   <div class="container">
      <div class="hero-unit">


 <form id="form1" class="form-horizontal" action="updatemaillist.jsp" method="post">
  <div class="control-group">
    <label class="control-label" for="mailaddress">Email</label>
    <div class="controls">
      <input type="text" name="mailaddress" id="mailaddress" value="">
      <button type="submit"  id="loadbutton" class="btn">加载配置</button>
    </div>
  </div>
  
       <div class="control-group">
    <label class="control-label" for="userType">用户类型</label>
    <div class="controls">
      <input type="text" name="userType" id="userType"  readonly="true">
    </div>
  </div>
  
     <div class="control-group">
    <label class="control-label" for="valideTime">到期时间</label>
    <div class="controls">
      <input type="text" name="valideTime" id="valideTime"  readonly="true">
    </div>
  </div>
 
  
   <div class="control-group">
    <label class="control-label" for="warningWomen">是否邮件提醒</label>
    <div class="controls">
	  <input type="checkbox" id="warningWomen" name="warningWomen" value="warningWomen">
    </div>
  </div> 
  

  <div class="control-group">
    <label class="control-label" for="womencheckingSaleDiscount">告警折扣</label>
    <div class="controls">
      <input type="text" id="womencheckingSaleDiscount" name="womencheckingSaleDiscount">
    </div>
  </div>
 
    <div class="control-group">
    <div class="controls">
      <button type="submit" id="updatebutton" class="btn">更新</button>
    </div>
  </div>
       
 </form>
 </div>
  </div>
       
   </body>
</html>

<script language="javascript">
$( document ).ready(function(){
	 $("#mailaddress").val("<%=mailaddress%>");
	 $("#userType").val("<%=userType%>");
	 $("#valideTime").val("<%=valideTime%>");
	 $("#warningWomen").attr("checked", <%=afMailList.warningWomen%>);
	 
	 
	 $("#womencheckingSaleDiscount").val("<%=afMailList.womencheckingSaleDiscount%>");
	 
	  
	 <%
	 	if(!"".equals(ErrMsg)){
	 %>
	 	alert("<%=ErrMsg%>");
	 <%}%>
	 
	 $("#form1").submit(function(){
		if($("#mailaddress").val()==""){
			alert("must input email!");
			return false;
		} 
         return true;
  });
  
   $("#loadbutton").click(function() {
  	  $("#form1").attr("action", "updatemaillist.jsp?action=load");
   });
  
   $("#updatebutton").click(function() {
  
	var tem2=$("#womencheckingSaleDiscount").val();
  	if(!isNumber(tem2)){
		alert("S区折扣，请输入0至1之间的一个数值");
		return false;
	}
	if(Number(tem2)<0.01 || Number(tem2)>1){
		alert("S区折扣，请输入0至1之间的一个数值");
		return false;
	}
	
	
   		$("#form1").attr("action", "updatemaillist.jsp?action=update");
   });
	 	
});		<!-- end ready-->


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
