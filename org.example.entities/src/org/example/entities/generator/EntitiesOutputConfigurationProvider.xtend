package org.example.entities.generator

import org.eclipse.xtext.generator.OutputConfigurationProvider

class EntitiesOutputConfigurationProvider extends OutputConfigurationProvider {

	public val ENTITIES_GEN = "./entities-gen"

	override getOutputConfigurations() {
		super.getOutputConfigurations() => [
			head.outputDirectory = ENTITIES_GEN
		]
	}	
}