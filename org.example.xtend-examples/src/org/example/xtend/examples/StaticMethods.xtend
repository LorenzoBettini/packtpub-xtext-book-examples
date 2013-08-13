package org.example.xtend.examples

import java.util.Collections

class StaticMethods {
	def static void main(String[] args) {
		val list = Collections::emptyList
		System::out.println(list)
		System.out.println(list) // since Xtend 2.4.2
	}
}
