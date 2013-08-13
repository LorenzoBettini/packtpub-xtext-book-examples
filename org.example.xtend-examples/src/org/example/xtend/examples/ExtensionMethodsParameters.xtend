package org.example.xtend.examples

import java.util.ArrayList

class ExtensionMethodsParameters {
	
	def m(extension MyListExtensions e) {
		val list = new ArrayList<String>
		list.aListMethod
		list.anotherListMethod
	}
	
}