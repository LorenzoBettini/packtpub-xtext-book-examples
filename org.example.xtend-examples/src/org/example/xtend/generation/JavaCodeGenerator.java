package org.example.xtend.generation;

public class JavaCodeGenerator {

	public String generateBody(String name, String code) {
		return "/* body of " + name + " */\n" + code; 
	}
	
	public String generateMethod(String name, String code) {
		return "public void " + name + "() {" +
				"\t" + generateBody(name, code) + 
				"}";
	}
	
	public static void main(String[] args) {
		JavaCodeGenerator generator = new JavaCodeGenerator();
		System.out.println(generator.generateMethod("m", 
				"System.out.println(\"Hello\"));\nreturn;"));
	}
}
