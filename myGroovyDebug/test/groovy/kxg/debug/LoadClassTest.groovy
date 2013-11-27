package kxg.debug

class LoadClassTest {
	public static void main(String[] args) {
		LoadClass load=new LoadClass();

		def dclass= load.loadoneclass("kxg.debug.Groovydebug")
		println dclass

		def outclass= load.loadoneclass("E:\\Dropbox\\mysourcecode\\jdk_study2\\bin","jdk.kxg.study.Hello")
		println outclass

		load.loadjar("file:\\E:\\kan\\programmes\\jetty-distribution-8.1.14.v20131031\\webapps\\test2.war\\WEB-INF\\lib\\jetty-client-8.1.14.v20131031.jar");
		
	}
}
