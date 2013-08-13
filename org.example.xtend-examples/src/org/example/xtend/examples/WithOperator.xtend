package org.example.xtend.examples

import static org.example.entities.entities.EntitiesFactory.*

class WithOperator {
	def m() {
		return eINSTANCE.createEntity => [ name = "MyEntity"]
	}
	
	def n() {
		val entity = eINSTANCE.createEntity
		entity.name = "MyEntity"
		return entity
	}
	
	def static void main(String[] args) {
		
	}
	
}