package kxg.debug;

import java.util.*;
import java.io.File;
import java.lang.reflect.*;
import java.net.*;

public class loaddefaultjarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	 
		String code = "";
		String output = "";
		String exception = "";
 
		try {
 
			File classFile = new File(System.getProperty("user.dir")+"/war/WEB-INF/lib/groovy-all-2.1.6.jar");      

			
			if(!classFile.exists()){
            	System.out.println("jar:"+ classFile +" doesn't exist!"+"</br>");
            } else{
        		URL urls = classFile.toURI().toURL();
				URLClassLoader urlLoader = (URLClassLoader) ClassLoader
						.getSystemClassLoader();
				Class<URLClassLoader> sysclass = URLClassLoader.class;
				Method method = sysclass.getDeclaredMethod("addURL",
						new Class[] { URL.class });
				method.setAccessible(true);
				method.invoke(urlLoader, urls);
				
				//test for load class
				   //test for load class
           		String className = "groovy.lang.GroovyObject";  
           		Class<?> testClass = urlLoader.loadClass(className);  
           		//Object obj = testClass.newInstance();  
                testClass = urlLoader.loadClass("kxg.debug.Groovydebug");  
                Object obj = testClass.newInstance();
                System.out.println("load class:"+ obj +"</br>");
                System.out.println("load jar:"+ classFile+" success!"+"</br>");
            }
			
		} catch (Exception e) {
			exception = e.getMessage();
		}

	}

}
