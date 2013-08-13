package org.example.xtend.examples

import java.util.LinkedList

class MyFirstXtendClass {
	val s = 'my field' // final field
	var myList = new LinkedList<Integer> // non final field
	
	def bar(String input) {
		var buffer = input
		buffer == s || myList.size > 0
			// the last expression is the return expression
	}
}

class MyDerivedXtendClass extends MyFirstXtendClass {
	override bar(String input) {
		true
	}
}