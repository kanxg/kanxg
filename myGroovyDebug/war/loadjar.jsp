<%@ page import="java.util.*" %>
<%@ page import="java.lang.reflect.*" %>
<%@ page import="java.net.*" %>
<%@ page import="java.io.*" %>

<%	
  	    ClassLoader urlLoader = this.getClass().getClassLoader().getParent();
 	
 	 String path=application.getRealPath(request.getRequestURI());  
	  String dir=new File(path).getParent();
	  //dir=dir.replaceAll("\\", "\\\\");
	  out.println("current path:"+dir);  
	  
	  //String url = "file:\\\\"+ dir+ "\\\\WEB-INF\\\\lib\\\\"; // 包路径定义  
	  String url = "file:\\\\";
 	  String code = request.getParameter("code");
	  String output="";
      String exception="";
      if(code!=null&&code.endsWith(".jar")){
	 	 try { 
		 	 URL urls = new URL(code);
  
			Class<URLClassLoader> sysclass = URLClassLoader.class;
			Method method = sysclass.getDeclaredMethod("addURL",
					new Class[] { URL.class });
			method.setAccessible(true);
			method.invoke(urlLoader, urls);
			
			output="load success with jar:"+ code;
	 	  } catch (Exception e) {  
           	exception = e.getMessage();
          }  
	 	   
	 	   
 	 }else{
	 		code=url;
	 }
	 
%>


<!DOCTYPE html>
<html lang="en">

<head>
   <script src="jquery-1.10.2.min.js"></script> 
</head>
 
  <body>
    
				 <form id="form1" class="form-horizontal" action="loadjar.jsp" method="post">
				  <div class="control-group">
				    <label class="control-label" for="code">code</label>
				    <div class="controls">
      					<input type="text" name="code"  size="180"/>	
				    </div>
				  </div>
				  
				    
				
				    <div class="control-group">
				    <div class="controls">
				      <button type="submit" id="addbutton" class="btn">load jar</button>
				    </div>
				  </div>
				  
 				<div class="control-group">
				    <label class="control-label" for="output">output</label>
				    <div class="controls">
				      <textarea type="text" name="output" id="output"  rows="8" style="width: 80%"></textarea>
				    </div>
				  </div>
				  
				  	  <div class="control-group">
				    <label class="control-label" for="exception">exception</label>
				    <div class="controls">
				      <textarea type="text" name="exception" id="exception"  rows="8" style="width: 80%"></textarea>
				    </div>
				  </div>
				  
				 </form>	
 
 
   </body>
</html>

<script language="javascript">
$( document ).ready(function(){
 	$("#code").append("<%=code%>");
 	
 	<%
	 	if(!"".equals(output)){
	 %>
 		$("#output").append("<%=output%>");
	 <%}%>
	 
	<%
	 	if(!"".equals(exception)&&exception!=null){
	 %>
 		 $("#exception").append("<%=exception%>");
	 <%}%>
	 
	  $("#form1").submit(function(){
 		if($("#code").val()==""){
			alert("must input code!");
			return false;
		} 
         return true;
 	  }); 
	 	
});
</script>

 