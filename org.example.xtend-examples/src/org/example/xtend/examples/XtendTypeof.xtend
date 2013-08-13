package org.example.xtend.examples

import org.example.entities.entities.Entity

class XtendTypeof {
	def static void main(String[] args) {
		val entityClass1 = typeof(Entity)
		
		// since Xtend 2.4.2
		val entityClass2 = Entity
			
		println(entityClass1)
		println(entityClass2)
	}
	
}