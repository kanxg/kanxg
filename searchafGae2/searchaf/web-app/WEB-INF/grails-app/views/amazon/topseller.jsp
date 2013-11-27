<%@ page contentType="text/html;charset=utf-8" language="java" %>
<%@ page import="java.util.*" %>
<%@ page import="kxg.searchaf.url.keepa.SearchKeepaJSP" %>
<%@ page import="kxg.searchaf.url.keepa.AmazonProduct" %>
<%@ page import="java.util.*" %>
 
<%	
	 String ErrMsg="";
	 List<AmazonProduct> productlist=null;
 
     String url = request.getParameter("url");
	 if(url!=null){
 	      SearchKeepaJSP jsp=new SearchKeepaJSP();
 
 		 try {
 		 	//productlist=jsp.getUsAllBestSellersProduct(url);
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
 
 <form id="form1" class="form-horizontal" action="<%=request.getContextPath()%>/amazon/testurl" method="post">

      <div class="control-group">
    <label class="control-label" for="url">产品URL</label>
    <div class="controls">
      <input type="text" name="url" id="url" style="width: 80%">
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
    if(productlist!=null){
   %>  
       <form class="form-horizontal">
    
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
  	 
	 <%
	 	if(!"".equals(ErrMsg)){
	 %>
	 	$.globalMessenger().post("<%=ErrMsg%>");
	 <%}%>
	 
	  $("#form1").submit(function(){
		if($("#url").val()==""){
			$.globalMessenger().post("must input url!");
			return false;
		} 
         return true;
  });
	 	
});

 
 
</script>
