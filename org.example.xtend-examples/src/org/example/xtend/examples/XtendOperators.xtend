package org.example.xtend.examples

class XtendOperators {
	def static void main(String[] args) {
		val o = new Object
		o?.toString
		var result = o?.toString
		println(result)
		
		// equivalent to: if (o != null) o.toString else 'default'
		result = o?.toString ?: 'default'
		
		//val comp = 1 < 5 < 1
		println(3 - 2 - 1)
		println(3 - (2 - 1))
		println(!true)
		
		val l1 = newArrayList("a")
		l1 += "b"
		val l2 = newArrayList("c")
		val l3 = l1 + l2
		println(l3)
	}
	
}