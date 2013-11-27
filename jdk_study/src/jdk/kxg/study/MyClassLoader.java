package jdk.kxg.study;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.MessageFormat;

public class MyClassLoader extends ClassLoader {

	// 加载class文件的classpath
	private String classPath;
	private MyClassLoader parent;

	MyClassLoader(String classPath, MyClassLoader parent) {
		this.classPath = classPath;
		this.parent = parent;
	}

	MyClassLoader(String classPath) {

		this.classPath = classPath;
	}

	public Class<?> loadClassCust(String name) throws ClassNotFoundException {
		Class c = findLoadedClass(name);
		if (c == null) {
			try {
				if (this.parent != null) {
					c = this.parent.loadClassCust(name);
					// System.out.println("parent c is:" + c);
				} else if (this.getParent() != null) {
					c = this.getParent().loadClass(name);

				}
			} catch (ClassNotFoundException e) {
				// If still not found, then invoke findClass in order
				// to find the class.
				System.out.println("load class by myself");
				c = findClass(name);
			}

		}

		return c;
	}

	public Class<?> loadClass(String name) throws ClassNotFoundException {
		return loadClass(name, false);
	}

	protected synchronized Class<?> loadClass(String name, boolean resolve)
			throws ClassNotFoundException {
		// First, check if the class has already been loaded
		Class c = findLoadedClass(name);
		if (c == null) {
			// System.out.println("not find class");
			try {
				if (this.getParent() != null) {
					c = this.getParent().loadClass(name);
					// System.out.println("parent c is:" + c);
				}
			} catch (ClassNotFoundException e) {
				// If still not found, then invoke findClass in order
				// to find the class.
				// System.out.println("load class by myself");
				c = findClass(name);
			}
		}
		// if (resolve) {
		// resolveClass(c);
		// }

		// Class c = findClass(name);
		return c;
	}

	/**
	 * 获取class文件的字节码
	 * 
	 * @param name
	 *            类的全名
	 * @return
	 */
	private byte[] getBytes(String name) {
		byte[] buffer = null;
		FileInputStream in = null;
		try {
			File file = getFile(name);
			in = new FileInputStream(file);
			buffer = new byte[in.available()];
			in.read(buffer);
			return buffer;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return buffer;
	}

	/**
	 * 获取class文件的真实路径
	 * 
	 * @param name
	 * @return
	 */
	private File getFile(String name) {
		// System.out.println(name);
		String[] tokens = name.split("\\.");
		String classFile = this.classPath;
		for (int i = 0; i < tokens.length; i++) {
			classFile = classFile + "\\" + tokens[i];
		}
		classFile = classFile + ".class";
		// System.out.println(classFile);
		File f = (new File(classFile));
		return f;
	}

	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		byte[] byteCode = getBytes(name);
		return defineClass(null, byteCode, 0, byteCode.length);
	}
}
