package org.example.xtend.examples

import java.util.ArrayList

class ExtensionMethodsVariables {
	
	def m() {
		val extension MyListExtensions e = new MyListExtensions
		val list = new ArrayList<String>
		list.aListMethod
		list.anotherListMethod
	}
	
}