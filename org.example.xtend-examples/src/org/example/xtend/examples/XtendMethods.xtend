package org.example.xtend.examples

class XtendMethods {
	
	def getBar(String s) { 'bar' }
	
	def m() {
		extension val MyClass$Result r = null
		r.getFoo('a')
		'a'.foo
		
		getBar('a')
	}
}