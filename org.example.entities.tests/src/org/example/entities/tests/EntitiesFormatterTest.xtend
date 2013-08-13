package org.example.entities.tests

import com.google.inject.Inject
import org.eclipse.xtext.formatting.INodeModelFormatter
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.resource.XtextResource
import org.example.entities.EntitiesInjectorProvider
import org.example.entities.entities.Model
import org.junit.Test
import org.junit.runner.RunWith

import static extension org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EntitiesInjectorProvider))
class EntitiesFormatterTest {
	
	@Inject extension ParseHelper<Model>
	
	@Inject extension INodeModelFormatter;

	@Test
	def void testEntities() {
		'''
		entity E1 { } entity E2 {}
		'''.assertFormattedAs(
		'''
		entity E1 {
		}
		
		entity E2 {
		}'''
		)
		
	}

    @Test
    def void testAttributes() {
        '''
        entity E1 { int i ; string s; boolean b   ;}
        '''.assertFormattedAs(
        '''
		entity E1 {
			int i;
			string s;
			boolean b;
		}'''
        )
        
    }
	
	def void assertFormattedAs(CharSequence input, CharSequence expected) {
	    expected.toString.assertEquals(
	        (input.parse.eResource as XtextResource).parseResult.
	           rootNode.format(0, input.length).formattedText)
	}

}