<%@ page import="java.util.*" %>
<%@ page import="java.lang.reflect.*" %>
<%@ page import="java.net.*" %>

<%	
 
 	  // ClassLoader  
        Class c1;  
  	 	ClassLoader classLoader = this.getClass().getClassLoader().getParent();

        try {  
			String className = "kxg.debug.MyClassLoader";  
             c1 = Class.forName(className);  
			out.println(c1+" load success! </br>");
			
			 className = "kxg.debug.LoadClass";  
             c1 = Class.forName(className);  
			out.println(c1+" load success! </br>");
			
			
			className = "kxg.debug.StringUtli";  
             c1 = Class.forName(className);  
			out.println(c1+" load success! </br>");
			  
			//load jar

            className = "kxg.debug.Groovydebug";  
             c1 = Class.forName(className);  
			out.println(c1+" load success! </br>");
			
			 className = "kxg.debug.DebugOutput";  
             c1 = Class.forName(className);  
			out.println(c1+" load success! </br>");
			  
         } catch (Exception e) {  
  
            // TODO Auto-generated catch block  
  
           out.println(e);  
  
        }  
	 
%>

 