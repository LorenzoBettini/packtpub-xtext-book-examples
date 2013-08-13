package org.example.xtend.examples

class InnerTypes {
	def static void main(String[] args) {
		
		println(MyJavaClass$MyInnerInterface::s)
		
		// since Xtend 2.4.2
		println(MyJavaClass.MyInnerInterface::s)
	}
}
