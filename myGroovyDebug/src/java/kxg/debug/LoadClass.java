package kxg.debug;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

class LoadClass {

	public Class<?> loadoneclass(String className)
			throws ClassNotFoundException {
		ClassLoader classLoader = ClassLoader.getSystemClassLoader();
		return Class.forName(className);
		/*
		 * Class.forName("xx.xx")等同于Class.forName("xx.xx",true,CALLClass.class.
		 * getClassLoader())，
		 * 第二个参数(boolean)表示装载类的时候是否初始化该类，即调用类的静态块的语句及初始化静态成员变量。 ClassLoader
		 * loader = Thread.currentThread.getContextClassLoader();
		 * 也可以用(ClassLoader.getSystemClassLoader())
		 */
	}

	public Class<?> loadoneclass(ClassLoader classLoader, String className)
			throws ClassNotFoundException {
		return Class.forName(className);
	}

	public Class<?> loadoneclass(String classpath, String className)
			throws ClassNotFoundException {
		MyClassLoader loader = new MyClassLoader(classpath);
		return loader.loadClassCust(className);
	}

	public void loadjar(String jarname) throws SecurityException,
			NoSuchMethodException, IllegalArgumentException,
			IllegalAccessException, InvocationTargetException,
			MalformedURLException {
		URL urls = new URL(jarname);
		// GetPI.class
		URLClassLoader urlLoader = (URLClassLoader) ClassLoader
				.getSystemClassLoader();
		Class<URLClassLoader> sysclass = URLClassLoader.class;
		Method method = sysclass.getDeclaredMethod("addURL",
				new Class[] { URL.class });
		method.setAccessible(true);
		method.invoke(urlLoader, urls);
	}

	public void loadjar(ClassLoader classLoader, String jarname)
			throws SecurityException, NoSuchMethodException,
			IllegalArgumentException, IllegalAccessException,
			InvocationTargetException, MalformedURLException {
		URL urls = new URL(jarname);

		Class<URLClassLoader> sysclass = URLClassLoader.class;
		Method method = sysclass.getDeclaredMethod("addURL",
				new Class[] { URL.class });
		method.setAccessible(true);
		method.invoke(classLoader, urls);
	}
}