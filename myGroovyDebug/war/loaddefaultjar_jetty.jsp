<%@ page import="java.util.*" %>
<%@ page import="java.lang.reflect.*" %>
<%@ page import="java.net.*" %>
<%@ page import="java.io.*" %>

<%	
 	String pathsplit=System.getProperty("file.separator") ;
 	ClassLoader urlLoader = this.getClass().getClassLoader().getParent();
 	
 	 try { 
		 	String path=application.getRealPath(request.getRequestURI());  
			String dir=new File(path).getParentFile().getParent();
			
			String url = dir+ pathsplit +"WEB-INF"+pathsplit+ "lib" + pathsplit+ "commons-lang-2.6.jar"; // 包路径定义  
			File classFile = new File(url);      

			
			if(!classFile.exists()){
            	out.println("jar:"+ url+" doesn't exist!"+"</br>");
            } else{
        		URL urls = classFile.toURI().toURL();
				//URLClassLoader urlLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();
				Class<URLClassLoader> sysclass = URLClassLoader.class;
				Method method = sysclass.getDeclaredMethod("addURL",
						new Class[] { URL.class });
				method.setAccessible(true);
				method.invoke(urlLoader, urls);
				
				//test for load class
           		String className = "org.apache.commons.lang.StringEscapeUtils";  
           		Class<?> testClass = urlLoader.loadClass(className);  
           		//Object obj = testClass.newInstance();  
           		
                out.println("load jar:"+ url+" success!"+"</br>");
            }
			
			url = dir+ pathsplit +"WEB-INF"+pathsplit+ "lib" + pathsplit+ "groovy-all-2.1.6.jar"; // 包路径定义  
			
 			classFile = new File(url);  
			
			if(!classFile.exists()){
            	out.println("jar:"+ url+" doesn't exist!"+"</br>");
            } else{
        		URL urls = classFile.toURI().toURL();
				//URLClassLoader urlLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();
				Class<URLClassLoader> sysclass = URLClassLoader.class;
				Method method = sysclass.getDeclaredMethod("addURL",
						new Class[] { URL.class });
				method.setAccessible(true);
				method.invoke(urlLoader, urls);
			
			   //test for load class
           		String className = "groovy.lang.GroovyObject";  
           		Class<?> testClass = urlLoader.loadClass(className);  
           		//Object obj = testClass.newInstance();  
            
                out.println("load jar:"+ url+" success!"+"</br>");
            }

         
			
	 	  } catch (Exception e) {  
            out.println(e);  
          }  
	 
%>

 