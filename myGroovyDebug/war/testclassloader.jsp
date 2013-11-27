<%@ page contentType="text/html;charset=utf-8" language="java" %>
<%@ page import="java.util.*" %>
<%request.setCharacterEncoding("utf-8");%>  

<%	
 	 ClassLoader classLoader = this.getClass().getClassLoader();
 	 out.println(classLoader.getClass()+"</br>");
      	 	 
	while(classLoader.getParent()!=null){
			classLoader=classLoader.getParent();
 		    out.println(classLoader.getClass()+"</br>");
	}
%>

 