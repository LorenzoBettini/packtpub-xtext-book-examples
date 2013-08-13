package org.example.xbase.entities.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions
import org.example.xbase.entities.EntitiesInjectorProvider
import org.junit.Test
import org.junit.runner.RunWith
import static extension org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EntitiesInjectorProvider))
class EntitiesCompilerTest {
	
	@Inject extension CompilationTestHelper
	@Inject extension ReflectExtensions

	@Test
	def void testAttributeGeneratedCode() {
		'''
		/* my entity */
		entity MyEntity {
			/* my attribute */
			attr e = new MyEntity; // type is inferred
		}
		'''.assertCompilesTo(
		'''
package entities;

import org.eclipse.xtext.xbase.lib.Functions.Function0;

/**
 * my entity
 */
@SuppressWarnings("all")
public class MyEntity {
  /**
   * my attribute
   */
  private MyEntity e = new Function0<MyEntity>() {
    public MyEntity apply() {
      MyEntity _myEntity = new MyEntity();
      return _myEntity;
    }
  }.apply();
  
  public MyEntity getE() {
    return this.e;
  }
  
  public void setE(final MyEntity e) {
    this.e = e;
  }
  
  public String toString() {
    return
    "entity MyEntity {\n" +
    	"\te = " + e.toString() + "\n" +
    "}";
  }
}
		''')
	}

	@Test
	def void testGenericSuperType() {
		'''
		entity MyList extends java.util.LinkedList<Iterable<String>>  {
		}
		'''.assertCompilesTo(
		'''
package entities;

import java.util.LinkedList;

@SuppressWarnings("all")
public class MyList extends LinkedList<Iterable<String>> {
  public String toString() {
    return
    "entity MyList {\n" +
    "}";
  }
}
		''')
	}

	@Test
	def void testValidGeneratedJavaCode() {
		'''
		entity MyEntity {
			attr e = new MyEntity;
		}
		'''.compile[compiledClass]
	}

	@Test
	def void testOperationGeneratedCode() {
		'''
		import java.util.LinkedList
		
		entity MyList extends LinkedList<String> {
			op insert(String s) {
				add(s)
			}
		}'''.assertCompilesTo(
		'''
package entities;

import java.util.LinkedList;

@SuppressWarnings("all")
public class MyList extends LinkedList<String> {
  public boolean insert(final String s) {
    boolean _add = this.add(s);
    return _add;
  }
  
  public String toString() {
    return
    "entity MyList {\n" +
    "}";
  }
}
		''')
	}
	
	@Test
	def void testGeneratedToString() {
		'''
		entity C {
			attr l = newArrayList(1, 2, 3);
			attr s = "test";
		}'''.assertCompilesTo(
		'''
		package entities;

		import java.util.ArrayList;
		import org.eclipse.xtext.xbase.lib.CollectionLiterals;
		import org.eclipse.xtext.xbase.lib.Functions.Function0;
		
		@SuppressWarnings("all")
		public class C {
		  private ArrayList<Integer> l = new Function0<ArrayList<Integer>>() {
		    public ArrayList<Integer> apply() {
		      ArrayList<Integer> _newArrayList = CollectionLiterals.<Integer>newArrayList(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3));
		      return _newArrayList;
		    }
		  }.apply();
		  
		  public ArrayList<Integer> getL() {
		    return this.l;
		  }
		  
		  public void setL(final ArrayList<Integer> l) {
		    this.l = l;
		  }
		  
		  private String s = "test";
		  
		  public String getS() {
		    return this.s;
		  }
		  
		  public void setS(final String s) {
		    this.s = s;
		  }
		  
		  public String toString() {
		    return
		    "entity C {\n" +
		    	"\tl = " + l.toString() + "\n" +
		    	"\ts = " + s.toString() + "\n" +
		    "}";
		  }
		}
		'''
		)
	}

	@Test
	def void testGeneratedToStringExecution() {
		'''
		entity C {
			attr l = newArrayList(1, 2, 3);
			attr s = "test";
		}'''.compile[
			val obj = it.compiledClass.newInstance
			'''
			entity C {
				l = [1, 2, 3]
				s = test
			}'''.toString.assertEquals(obj.invoke("toString"))
		]
	}

}