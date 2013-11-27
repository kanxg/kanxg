package kxg.debug

class GroovydebugTest {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Groovydebug debug=new Groovydebug();
		Map result= debug.eval("def int i=0; println i+1;");
		println result.output
		println result.exception
	}
}
