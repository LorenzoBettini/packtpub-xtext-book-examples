package org.example.xtend.examples;

public class MyClass {

	public static interface Result {
		public String getFoo(String s);
	}
	
	private int i;
	
	public void m(MyClass c) {
		c.i = 0;
	}
	
	public int getI() { return i; }
}
