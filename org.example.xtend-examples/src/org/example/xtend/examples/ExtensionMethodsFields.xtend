package org.example.xtend.examples

import java.util.ArrayList
import java.util.List

class ExtensionMethodsFields {
	
	extension MyListExtensions = new MyListExtensions
	
	def n() {
		val list = new ArrayList<String>
		list.aListMethod
		list.anotherListMethod
	}
	
	def n(extension MyListExtensions extensions) {
		val list = new ArrayList<String>
		list.aListMethod
		list.anotherListMethod
	}
	
	def myStringMeth(List<?> list) {
		// some implementation
	}
	
	def m() {
		val list = new ArrayList<String>
		list.myStringMeth
	}
		
	def static void main(String[] args) {
		println("my string".toFirstUpper)
		val list = newArrayList("a", "b", "c")
		list.toString
	}
	
}