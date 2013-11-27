<%@ page contentType="text/html;charset=utf-8" language="java" %>
<%@ page import="java.util.*" %>
<%@ page import="kxg.searchaf.url.amazon.AmazonPageJSP" %>
<%@ page import="kxg.searchaf.url.amazon.AmazonPage" %>
<%@ page import="java.util.*" %>
 
<%	
	 String ErrMsg="";
	 AmazonPage apage=null;
	 boolean checksalerisAmazon=false;
	 
     String url = request.getParameter("url");
	 if(url!=null){
 	      AmazonPageJSP jsp=new AmazonPageJSP();
 		 if(request.getParameterValues("checksalerisAmazon")!=null){
 		 	 checksalerisAmazon=true; 		 
 		 }
 		 try {
 		 	apage=jsp.testUrl(url,checksalerisAmazon);
	 	} catch (Exception e) {
	 		ErrMsg=e.getMessage();
	 	}
 	 	
	 }else{
	 	url="";
	 }
	 
 
	 
%>


<!DOCTYPE html>
<html lang="en">
    <jsp:include page="head.jsp"/> 

  <body>

   <jsp:include page="top.jsp"/> 
   
   
  	  <div class="container">
 
 <form id="form1" class="form-horizontal" action="testurl.jsp" method="post">

      <div class="control-group">
    <label class="control-label" for="url">产品URL</label>
    <div class="controls">
      <input type="text" name="url" id="url" style="width: 80%">
    </div>
  </div>
  
        <div class="control-group">
    <label class="control-label" for="checksalerisAmazon">只看Amazon自营产品</label>
    <div class="controls">
	  <input type="checkbox" id="checksalerisAmazon" name="checksalerisAmazon" value="checksalerisAmazon">
    </div>
  </div>
  
    <div class="control-group">
    <div class="controls">
      <button type="submit" id="addbutton" class="btn">测试</button>
    </div>
  </div>
       
 </form>
 
    <hr> 
    
    
    
    <%
    if(apage!=null){
   %>  
       <form class="form-horizontal">
   	<div class="control-group">
   			<label class="control-label">产品名称：</label>
   			<div class="controls"><%=apage.title%></div>
   	</div>
   	   	<div class="control-group">
   			<label class="control-label">价格：</label>
   			<div class="controls">
   			  <%=apage.price%> 
   			 </div>
   			 
   	</div>
   		<div class="control-group">
   			<label class="control-label">在售：</label>
   			<div class="controls">
   			   <%=apage.instock%> 
   			 </div>
   			 
   	</div>
 	<div class="control-group">
   			<label class="control-label">自营产品：</label>
   			<div class="controls">
   			   <%=apage.salerisAmazon%> 
   			 </div>
   			 
   	</div>
   	 	<div class="control-group">
   			<label class="control-label">链接：</label>
   			<div class="controls">
   	 			<a target='_blank' href='<%=apage.getJspUrl()%>'><%=apage.url%> <a>
   			 </div>
   			 
   	</div>
  </form>
   <%
     }
   %>
   
 
 
  	  </div>
  

  
   </body>
</html>

<script language="javascript">
$( document ).ready(function(){
 	 $("#url").val("<%=url%>");
 	 $("#checksalerisAmazon").attr("checked", <%=checksalerisAmazon%>);
 	 
	 <%
	 	if(!"".equals(ErrMsg)){
	 %>
	 	alert("<%=ErrMsg%>");
	 <%}%>
	 
	  $("#form1").submit(function(){
		if($("#url").val()==""){
			alert("must input url!");
			return false;
		} 
         return true;
  });
	 	
});

 
 
</script>
