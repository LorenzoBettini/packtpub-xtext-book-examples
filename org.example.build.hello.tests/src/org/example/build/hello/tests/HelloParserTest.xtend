package org.example.build.hello.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.example.build.hello.hello.Model
import org.junit.runner.RunWith
import org.example.build.hello.HelloInjectorProvider
import org.junit.Test

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(HelloInjectorProvider))
class HelloParserTest {
	
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper
	
	@Test def void testOneHello() {
		'''
		Hello test!
		'''.parse.assertNoErrors
	}
	
	@Test def void testTwoHellos() {
		'''
		Hello first!
		Hello second!
		'''.parse.assertNoErrors
	}
}