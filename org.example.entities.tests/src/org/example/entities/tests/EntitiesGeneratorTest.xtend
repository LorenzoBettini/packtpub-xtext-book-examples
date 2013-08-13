package org.example.entities.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper
import org.example.entities.EntitiesInjectorProvider
import org.junit.Test
import org.junit.runner.RunWith

import static extension org.junit.Assert.*
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EntitiesInjectorProvider))
class EntitiesGeneratorTest {
	
	@Inject extension CompilationTestHelper
	@Inject extension ReflectExtensions

	@Test
	def void testGeneratedCode() {
		'''
		entity MyEntity {
			string myAttribute;
		}
		'''.assertCompilesTo(
		'''
package entities;

public class MyEntity {
	private String myAttribute;

	public String getMyAttribute() {
		return myAttribute;
	}
	
	public void setMyAttribute(String _arg) {
		this.myAttribute = _arg;
	}
	
}
		''')
	}

	@Test
	def void testGeneratedCode2() {
		// uses compile and the closure to call generatedCode
		// it is equivalent to the above one
		'''
		entity MyEntity {
			string myAttribute;
		}
		'''.compile[
			assertEquals(
		'''
package entities;

public class MyEntity {
	private String myAttribute;

	public String getMyAttribute() {
		return myAttribute;
	}
	
	public void setMyAttribute(String _arg) {
		this.myAttribute = _arg;
	}
	
}
		'''.toString,
			getSingleGeneratedCode)
		]
	}

	@Test
	def void testGeneratedValidJavaCode() {
		'''
		entity MyEntity {
			string myAttribute;
		}
		'''.compile[compiledClass]
		// check that it is valid Java code
	}

	@Test
	def void testTwoCompiledClasses() {
		'''
		entity FirstEntity {
			SecondEntity myAttribute;
		}
		
		entity SecondEntity {
			
		}
		'''.compile[
			getCompiledClass("entities.FirstEntity").assertNotNull
			getCompiledClass("entities.SecondEntity").assertNotNull
		]
		// check that it is valid Java code
	}

	@Test
	def void testGeneratedJavaCode() {
		'''
		entity E {
			string myAttribute;
		}
		'''.compile[
			compiledClass.newInstance => [
				assertNull(it.invoke("getMyAttribute"))
				it.invoke("setMyAttribute", "testvalue")
				assertEquals("testvalue", it.invoke("getMyAttribute"))
			]
		]
	}

	@Test
	def void testGeneratedCodeWithTwoEntites() {
		'''
		entity FirstEntity {
			SecondEntity myAttribute;
		}
		
		entity SecondEntity { }
		'''.compile[
'''
package entities;

public class FirstEntity {
	private SecondEntity myAttribute;

	public SecondEntity getMyAttribute() {
		return myAttribute;
	}
	
	public void setMyAttribute(SecondEntity _arg) {
		this.myAttribute = _arg;
	}
	
}
'''.
toString.assertEquals(getGeneratedCode("entities.FirstEntity"))

'''
package entities;

public class SecondEntity {

}
'''.
toString.assertEquals(getGeneratedCode("entities.SecondEntity"))
		]
	}

	@Test
	def void testGeneratedJavaCodeWithTwoClasses() {
		'''
		entity FirstEntity {
			SecondEntity myAttribute;
		}
		
		entity SecondEntity {
			string s;
		}
		'''.compile[
			val FirstEntity = getCompiledClass("entities.FirstEntity").newInstance
			val SecondEntity = getCompiledClass("entities.SecondEntity").newInstance
			SecondEntity.invoke("setS", "testvalue")
			FirstEntity.invoke("setMyAttribute", SecondEntity)
			SecondEntity.assertSame(FirstEntity.invoke("getMyAttribute"))
			"testvalue".assertEquals
				(FirstEntity.invoke("getMyAttribute").invoke("getS"))
		]
	}

	@Test
	def void testGeneratedCodeComplex() {
		'''
			entity MyEntity {
			    MyEntity[] arrayAttr;
			    MyEntity[10] arrayAttrWithDimension;
			    MyEntity notArrayAttr;
			    string stringAttr;
			    boolean booleanAttr;
			    int[] intArrayAttr;
			}
		'''.compile[assertEquals('''
package entities;

public class MyEntity {
	private MyEntity[] arrayAttr;
	private MyEntity[] arrayAttrWithDimension;
	private MyEntity notArrayAttr;
	private String stringAttr;
	private boolean booleanAttr;
	private int[] intArrayAttr;

	public MyEntity[] getArrayAttr() {
		return arrayAttr;
	}
	
	public void setArrayAttr(MyEntity[] _arg) {
		this.arrayAttr = _arg;
	}
	
	public MyEntity[] getArrayAttrWithDimension() {
		return arrayAttrWithDimension;
	}
	
	public void setArrayAttrWithDimension(MyEntity[] _arg) {
		this.arrayAttrWithDimension = _arg;
	}
	
	public MyEntity getNotArrayAttr() {
		return notArrayAttr;
	}
	
	public void setNotArrayAttr(MyEntity _arg) {
		this.notArrayAttr = _arg;
	}
	
	public String getStringAttr() {
		return stringAttr;
	}
	
	public void setStringAttr(String _arg) {
		this.stringAttr = _arg;
	}
	
	public boolean getBooleanAttr() {
		return booleanAttr;
	}
	
	public void setBooleanAttr(boolean _arg) {
		this.booleanAttr = _arg;
	}
	
	public int[] getIntArrayAttr() {
		return intArrayAttr;
	}
	
	public void setIntArrayAttr(int[] _arg) {
		this.intArrayAttr = _arg;
	}
	
}
'''.toString, getSingleGeneratedCode)
	compiledClass // check that it is valid Java code
		]
	}

}