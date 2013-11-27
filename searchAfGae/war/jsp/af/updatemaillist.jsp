<%@ page contentType="text/html;charset=utf-8" language="java" %>
<%@ page import="java.util.*" %>
<%@ page import="kxg.searchaf.url.af.AfMailListJSP" %>
<%@ page import="kxg.searchaf.url.af.AfMailList" %>
<%@ page import="kxg.searchaf.util.TimeUtli" %>
<%request.setCharacterEncoding("utf-8");%>  

<%	
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
    <label class="control-label" for="warningCode">新折扣码提醒</label>
    <div class="controls">
	  <input type="checkbox" id="warningCode" name="warningCode" value="warningCode">
    </div>
  </div> 
  
   <hr>
   
   <div class="control-group">
    <label class="control-label" for="warningMen">男士区</label>
    <div class="controls">
	  <input type="checkbox" id="warningMen" name="warningMen" value="warningMen">
    </div>
  </div> 
  
  <div class="control-group">
    <label class="control-label" for="mencheckingRegular">正价区</label>
    <div class="controls">
	  <input type="checkbox" id="mencheckingRegular" name="mencheckingRegular" value="mencheckingRegular">
    </div>
  </div>   
  
    <div class="control-group">
    <label class="control-label" for="mencheckingSale">S区</label>
    <div class="controls">
	  <input type="checkbox" id="mencheckingSale" name="mencheckingSale" value="mencheckingSale">
    </div>
    
  </div>   
  <div class="control-group">
    <label class="control-label" for="mencheckingSaleDiscount">S区告警折扣</label>
    <div class="controls">
      <input type="text" id="mencheckingSaleDiscount" name="mencheckingSaleDiscount">
    </div>
  </div>
  
  
  <div class="control-group">
    <label class="control-label" for="mencheckingClearance">C区</label>
    <div class="controls">
	  <input type="checkbox" id="mencheckingClearance" name="mencheckingClearance" value="mencheckingClearance">
    </div>
  </div>   
  
    <div class="control-group">
    <label class="control-label" for="mencheckingClearanceDiscount">C区告警折扣</label>
    <div class="controls">
      <input type="text" id="mencheckingClearanceDiscount" name="mencheckingClearanceDiscount">
    </div>
  </div>
  
  <div class="control-group">
    <label class="control-label" for="mencheckingSecretSale">Secret Sale区</label>
    <div class="controls">
	  <input type="checkbox" id="mencheckingSecretSale" name="mencheckingSecretSale" value="mencheckingSecretSale">
    </div>
  </div>   
  
    <div class="control-group">
    <label class="control-label" for="mencheckingCategory">选择分类</label>
    <div class="controls">
     <select id="mencheckingCategory" name="mencheckingCategory" multiple="multiple" size=15>
		  <option value="TEES">TEES</option>
		  <option value="POLOS">POLOS</option>
		  <option value="SHIRTS">SHIRTS</option>
		  <option value="HOODIES & SWEATSHIRTS">HOODIES & SWEATSHIRTS</option>
		  <option value="SWEATERS">SWEATERS</option>
		  <option value="OUTERWEAR">OUTERWEAR</option>
		  <option value="SHORTS">SHORTS</option>
		  <option value="JEANS">JEANS</option>
		  <option value="SWEATPANTS">SWEATPANTS</option>
		  <option value="PANTS">PANTS</option>
		  <option value="SWIM">SWIM</option>
		  <option value="SLEEP">SLEEP</option>
		  <option value="FLIP FLOPS">FLIP FLOPS</option>
		  <option value="ACCESSORIES">ACCESSORIES</option>
		  <option value="UNDERWEAR">UNDERWEAR</option>
		</select>
    </div>
  </div>
  
    <div class="control-group">
    <label class="control-label" for="mencheckingSize">选择尺码</label>
    <div class="controls">
     <select id="mencheckingSize" name="mencheckingSize"  multiple="multiple" size=34>
		  <option value="XS">XS</option>
		  <option value="S">S</option>
		  <option value="M">M</option>
		  <option value="L">L</option>
		  <option value="XL">XL</option>
		  <option value="XXL">XXL</option>
		  <option value="28 X 30">28 X 30</option>
		  <option value="28 X 32">28 X 32</option>
		  <option value="30 X 30">30 X 30</option>
		  <option value="30 X 32">30 X 32</option>
		  <option value="30 X 34">30 X 34</option>
		  <option value="31 X 30">31 X 30</option>
		  <option value="31 X 32">31 X 32</option>
		  <option value="31 X 34">31 X 34</option>
		  <option value="32 X 30">32 X 30</option>
		  <option value="32 X 32">32 X 32</option>
		  <option value="32 X 34">32 X 34</option>
		  <option value="33 X 32">33 X 32</option>
		  <option value="33 X 34">33 X 34</option>
		  <option value="34 X 32">34 X 32</option>
		  <option value="34 X 34">34 X 34</option>
		  <option value="36 X 32">36 X 32</option>
		  <option value="36 X 34">36 X 34</option>
		  <option value="28">28</option>
		  <option value="30">30</option>
		  <option value="31">31</option>
		  <option value="32">32</option>
		  <option value="33">33</option>
		  <option value="34">34</option>
		  <option value="36">36</option>
		  <option value="38">38</option>
		  <option value="1 SIZE">1 SIZE</option>
		  <option value="S/M">S/M</option>
		  <option value="L/XL">L/XL</option>
		</select>
    </div>
  </div>
  
   <hr> 
   
   <div class="control-group">
    <label class="control-label" for="warningWomen">女士区</label>
    <div class="controls">
	  <input type="checkbox" id="warningWomen" name="warningWomen" value="warningWomen">
    </div>
  </div> 
  
 <div class="control-group">
    <label class="control-label" for="womencheckingRegular">正价区</label>
    <div class="controls">
	  <input type="checkbox" id="womencheckingRegular" name="womencheckingRegular" value="womencheckingRegular">
    </div>
  </div>   
  
    <div class="control-group">
    <label class="control-label" for="womencheckingSale">S区</label>
    <div class="controls">
	  <input type="checkbox" id="womencheckingSale" name="womencheckingSale" value="womencheckingSale">
    </div>
    
  </div>   
  <div class="control-group">
    <label class="control-label" for="womencheckingSaleDiscount">S区告警折扣</label>
    <div class="controls">
      <input type="text" id="womencheckingSaleDiscount" name="womencheckingSaleDiscount">
    </div>
  </div>
  
  
  <div class="control-group">
    <label class="control-label" for="womencheckingClearance">C区</label>
    <div class="controls">
	  <input type="checkbox" id="womencheckingClearance" name="womencheckingClearance" value="womencheckingClearance">
    </div>
  </div>   
  
    <div class="control-group">
    <label class="control-label" for="womencheckingClearanceDiscount">C区告警折扣</label>
    <div class="controls">
      <input type="text" id="womencheckingClearanceDiscount" name="womencheckingClearanceDiscount">
    </div>
  </div>
  
  <div class="control-group">
    <label class="control-label" for="womencheckingSecretSale">Secret Sale区</label>
    <div class="controls">
	  <input type="checkbox" id="womencheckingSecretSale" name="womencheckingSecretSale" value="womencheckingSecretSale">
    </div>
  </div>   
  
    <div class="control-group">
    <label class="control-label" for="womencheckingCategory">选择分类</label>
    <div class="controls">
     <select id="womencheckingCategory" name="womencheckingCategory" multiple="multiple" size=21>
		  <option value="FASHION TOPS">FASHION TOPS</option>
		  <option value="LAYERING TEES & TANKS">LAYERING TEES & TANKS</option>
		  <option value="GRAPHIC TEES">GRAPHIC TEES</option>
		  <option value="SHIRTS">SHIRTS</option>
		  <option value="POLOS">POLOS</option>
		  <option value="HOODIES & SWEATSHIRTS">HOODIES & SWEATSHIRTS</option>
		  <option value="SWEATERS">SWEATERS</option>
		  <option value="OUTERWEAR">OUTERWEAR</option>		  
		  <option value="SHORTS">SHORTS</option>
		  <option value="JEANS">JEANS</option>
		  <option value="SWEATPANTS">SWEATPANTS</option>
		  <option value="LEGGINGS">LEGGINGS</option>
		  <option value="PANTS">PANTS</option>		  
		  <option value="YOGA">YOGA</option>
		  <option value="SKIRTS">SKIRTS</option>
		  <option value="DRESSES & ROMPERS">DRESSES & ROMPERS</option>
		  <option value="SWIM">SWIM</option>
		  <option value="SLEEP">SLEEP</option>
		  <option value="FLIP FLOPS">FLIP FLOPS</option>
		  <option value="ACCESSORIES">ACCESSORIES</option>
		  <option value="BRAS & UNDIES">BRAS & UNDIES</option>
		</select>
    </div>
  </div>
  
    <div class="control-group">
    <label class="control-label" for="womencheckingSize">选择尺码</label>
    <div class="controls">
     <select id="womencheckingSize" name="womencheckingSize"  multiple="multiple" size=16>
		  <option value="XS">XS</option>
		  <option value="S">S</option>
		  <option value="M">M</option>
		  <option value="L">L</option>
		  <option value="000">000</option>
		  <option value="00">00</option>
		  <option value="0">0</option>
		  <option value="2">2</option>
		  <option value="4">4</option>
		  <option value="6">6</option>
		  <option value="8">8</option>
		  <option value="10">10</option>
		  <option value="12">12</option>
		  <option value="1 SIZE">1 SIZE</option>
		  <option value="XS/S">XS/S</option>
		  <option value="M/L">M/L</option>

		</select>
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
	 $("#warningMen").attr("checked", <%=afMailList.warningMen%>);
	 $("#warningWomen").attr("checked", <%=afMailList.warningWomen%>);
	 $("#warningCode").attr("checked", <%=afMailList.warningCode%>);
	 
	 $("#mencheckingRegular").attr("checked", <%=afMailList.mencheckingRegular%>);
	 $("#mencheckingSecretSale").attr("checked", <%=afMailList.mencheckingSecretSale%>);
	 $("#mencheckingClearance").attr("checked", <%=afMailList.mencheckingClearance%>);
	 $("#mencheckingSale").attr("checked", <%=afMailList.mencheckingSale%>);
	 $("#mencheckingClearanceDiscount").val("<%=afMailList.mencheckingClearanceDiscount%>");
	 $("#mencheckingSaleDiscount").val("<%=afMailList.mencheckingSaleDiscount%>");
	 <%
	 	if(afMailList.mencheckingCategory!=null)
	 	for (int i = 0; i < afMailList.mencheckingCategory.size(); i++) {
	  %>
	      $("#mencheckingCategory").find("option[value='<%=afMailList.mencheckingCategory.get(i)%>']").attr("selected",true);
	  <%
		}
	 %>
	 	 <%
	 	if(afMailList.mencheckingSize!=null)
	 	for (int i = 0; i < afMailList.mencheckingSize.size(); i++) {
	  %>
	      $("#mencheckingSize").find("option[value='<%=afMailList.mencheckingSize.get(i)%>']").attr("selected",true);
	  <%
		}
	 %>
	
	
	 $("#womencheckingRegular").attr("checked", <%=afMailList.womencheckingRegular%>);
	 $("#womencheckingSecretSale").attr("checked", <%=afMailList.womencheckingSecretSale%>);
	 $("#womencheckingClearance").attr("checked", <%=afMailList.womencheckingClearance%>);
	 $("#womencheckingSale").attr("checked", <%=afMailList.womencheckingSale%>);
	 $("#womencheckingClearanceDiscount").val("<%=afMailList.womencheckingClearanceDiscount%>");
	 $("#womencheckingSaleDiscount").val("<%=afMailList.womencheckingSaleDiscount%>");
	 <%
	 	if(afMailList.womencheckingCategory!=null)
	 	for (int i = 0; i < afMailList.womencheckingCategory.size(); i++) {
	  %>
	      $("#womencheckingCategory").find("option[value='<%=afMailList.womencheckingCategory.get(i)%>']").attr("selected",true);
	  <%
		}
	 %>
	 	 <%
	 	if(afMailList.womencheckingSize!=null)
	 	for (int i = 0; i < afMailList.womencheckingSize.size(); i++) {
	  %>
	      $("#womencheckingSize").find("option[value='<%=afMailList.womencheckingSize.get(i)%>']").attr("selected",true);
	  <%
		}
	 %>
	  
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
  		var tem1=$("#mencheckingClearanceDiscount").val();
  	if(!isNumber(tem1)){
		alert("C区折扣，请输入0至1之间的一个数值");
		return false;
	}
	if(Number(tem1)<0.01 || Number(tem1)>1){
		alert("C区折扣，请输入0至1之间的一个数值");
		return false;
	}
		var tem2=$("#mencheckingSaleDiscount").val();
  	if(!isNumber(tem2)){
		alert("S区折扣，请输入0至1之间的一个数值");
		return false;
	}
	if(Number(tem2)<0.01 || Number(tem2)>1){
		alert("S区折扣，请输入0至1之间的一个数值");
		return false;
	}
	
	var tem1=$("#womencheckingClearanceDiscount").val();
  	if(!isNumber(tem1)){
		alert("C区折扣，请输入0至1之间的一个数值");
		return false;
	}
	if(Number(tem1)<0.01 || Number(tem1)>1){
		alert("C区折扣，请输入0至1之间的一个数值");
		return false;
	}
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
