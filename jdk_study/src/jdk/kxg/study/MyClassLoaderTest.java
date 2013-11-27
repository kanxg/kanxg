package jdk.kxg.study;

import java.lang.reflect.Method;

public class MyClassLoaderTest {
	public static void main(String[] args) throws Exception {
		String classpath = "E:\\Google Drive\\mysourcecode\\jdk_study2\\bin";

		while (true) {
			MyClassLoader loader = new MyClassLoader(classpath);
			Class<?> clazz = loader.loadClassCust("jdk.kxg.study.Hello");
			Method method = clazz.getMethod("sayHello", String.class);
			System.out.println(method.invoke(clazz.newInstance(), "Ken"));
			// 每隔3秒钟重新加载
			Thread.sleep(3000);
		}
	}
}
