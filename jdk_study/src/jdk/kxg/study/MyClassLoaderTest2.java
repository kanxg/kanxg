package jdk.kxg.study;

import java.lang.reflect.Method;

public class MyClassLoaderTest2 {
	public static void main(String[] args) throws Exception {

		String classpath = "E:\\Google Drive\\mysourcecode\\jdk_study2\\bin";
		MyClassLoader loader = new MyClassLoader(classpath);
		ClassLoader parent = loader.getParent();
		System.out.println("parent is " + parent.getClass());
		System.out.println("parent is " + parent.getParent().getClass());
		System.out.println("parent is " + parent.getParent().getParent());

		Class<?> clazz = loader.loadClassCust("jdk.kxg.study.Hello");
		Method method = clazz.getMethod("sayHello", String.class);
		System.out.println(method.invoke(clazz.newInstance(), "Ken"));
		loader = null;

		while (true) {
			MyClassLoader loader1 = new MyClassLoader(classpath, loader);
			Class<?> clazz1 = loader1.loadClassCust("jdk.kxg.study.Hello");
			Method method1 = clazz1.getMethod("sayHello", String.class);
			System.out.println("new:"
					+ method1.invoke(clazz1.newInstance(), "Ken2"));
			System.out.println("old"
					+ method.invoke(clazz.newInstance(), "Ken"));

			// 每隔3秒钟重新加载
			Thread.sleep(3000);
		}
	}
}
