package org.example.smalljava.ui.tests

import org.eclipse.core.resources.IResource
import org.eclipse.emf.ecore.EValidator
import org.eclipse.xtext.junit4.ui.AbstractWorkbenchTest
import org.eclipse.xtext.ui.XtextProjectHelper
import org.junit.Before
import org.junit.Test

import static org.eclipse.xtext.junit4.ui.util.JavaProjectSetupUtil.*

import static extension org.eclipse.xtext.junit4.ui.util.IResourcesSetupUtil.*

class SmallJavaWorkbenchTest extends AbstractWorkbenchTest {
	
	val TEST_PROJECT = "mytestproject"
	
	@Before
	override void setUp() {
		super.setUp
		createJavaProjectWithXtextNature
	}
	
	def void createJavaProjectWithXtextNature() {
		createJavaProject(TEST_PROJECT) => [
			getProject().addNature(XtextProjectHelper::NATURE_ID)
		]
	}
	
	def void checkSmallJavaPrograms(String program1, String program2, int expectedErrors) {
		val file1 = createFile(TEST_PROJECT + "/src/test1.smalljava", program1)
		val file2 = createFile(TEST_PROJECT + "/src/test2.smalljava", program2)
		waitForAutoBuild();
		assertEquals(expectedErrors, file1.findMarkers(EValidator::MARKER, true,
				IResource::DEPTH_INFINITE).size);
		assertEquals(expectedErrors, file2.findMarkers(EValidator::MARKER, true,
				IResource::DEPTH_INFINITE).size);
	}

	@Test
	def void testValidPrograms() {
		checkSmallJavaPrograms(
		'''
		package my.pack;
		class C {}
		''',
		'''
		package my.pack;
		class D {}
		'''
		, 0)
	}

	@Test
	def void testNotValidPrograms() {
		checkSmallJavaPrograms(
		'''
		package my.pack;
		class D {}
		''',
		'''
		package my.pack;
		class D {}
		'''
		, 1) // each file will have an error
		// due to duplicate class name
	}
}