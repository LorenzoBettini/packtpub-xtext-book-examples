package org.example.smalljava.tests;

import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.example.smalljava.SmallJavaInjectorProvider;
import org.example.smalljava.lib.SmallJavaLib;
import org.example.smalljava.smallJava.SJClass;
import org.example.smalljava.smallJava.SJProgram;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(SmallJavaInjectorProvider.class)
@SuppressWarnings("all")
public class SmallJavaLibTest {
  @Inject
  @Extension
  private ParseHelper<SJProgram> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  @Extension
  private SmallJavaLib _smallJavaLib;
  
  @Test
  public void testLib() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import smalljava.lang.*;");
    _builder.newLine();
    _builder.append("class C extends Object {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("String s;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    SJProgram _loadLibAndParse = this.loadLibAndParse(_builder);
    this._validationTestHelper.assertNoErrors(_loadLibAndParse);
  }
  
  @Test
  public void testImplicitImports() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class C extends Object {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("String s;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Object m(Object o) { return o.toString(); }");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    SJProgram _loadLibAndParse = this.loadLibAndParse(_builder);
    this._validationTestHelper.assertNoErrors(_loadLibAndParse);
  }
  
  @Test
  public void testSmallJavaObjectClass() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class C {}");
    final SJProgram C = this.loadLibAndParse(_builder);
    SJClass _smallJavaObjectClass = this._smallJavaLib.getSmallJavaObjectClass(C);
    Assert.assertNotNull(_smallJavaObjectClass);
  }
  
  @Test
  public void testImplicitExtendObject() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class C {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Object m(Object o) { return this.toString(); }");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    SJProgram _loadLibAndParse = this.loadLibAndParse(_builder);
    this._validationTestHelper.assertNoErrors(_loadLibAndParse);
  }
  
  @Test
  public void testClassHierarchyWithObject() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class A { }");
    _builder.newLine();
    _builder.append("class B extends A { }");
    _builder.newLine();
    _builder.append("class C extends Object { }");
    _builder.newLine();
    _builder.append("class D extends C { }");
    _builder.newLine();
    SJProgram _loadLibAndParse = this.loadLibAndParse(_builder);
    final Procedure1<SJProgram> _function = new Procedure1<SJProgram>() {
      public void apply(final SJProgram it) {
        SmallJavaLibTest.this._validationTestHelper.assertNoErrors(it);
        EList<SJClass> _classes = it.getClasses();
        final Procedure1<EList<SJClass>> _function = new Procedure1<EList<SJClass>>() {
          public void apply(final EList<SJClass> it) {
            SJClass _get = it.get(0);
            SmallJavaLibTest.this.assertHierarchyWithObject(_get, "Object");
            SJClass _get_1 = it.get(1);
            SmallJavaLibTest.this.assertHierarchyWithObject(_get_1, "A, Object");
            SJClass _get_2 = it.get(3);
            SmallJavaLibTest.this.assertHierarchyWithObject(_get_2, "C, Object");
          }
        };
        ObjectExtensions.<EList<SJClass>>operator_doubleArrow(_classes, _function);
      }
    };
    ObjectExtensions.<SJProgram>operator_doubleArrow(_loadLibAndParse, _function);
  }
  
  @Test
  public void testSuperclassOrObject() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class A { }");
    _builder.newLine();
    _builder.append("class B extends A { }");
    _builder.newLine();
    _builder.append("class C extends Object { }");
    _builder.newLine();
    _builder.append("class D extends C { }");
    _builder.newLine();
    SJProgram _loadLibAndParse = this.loadLibAndParse(_builder);
    final Procedure1<SJProgram> _function = new Procedure1<SJProgram>() {
      public void apply(final SJProgram it) {
        SmallJavaLibTest.this._validationTestHelper.assertNoErrors(it);
        EList<SJClass> _classes = it.getClasses();
        final Procedure1<EList<SJClass>> _function = new Procedure1<EList<SJClass>>() {
          public void apply(final EList<SJClass> it) {
            SJClass _head = IterableExtensions.<SJClass>head(it);
            final SJClass objClass = SmallJavaLibTest.this._smallJavaLib.getSmallJavaObjectClass(_head);
            Assert.assertNotNull(objClass);
            SJClass _get = it.get(0);
            SJClass _superclassOrObject = SmallJavaLibTest.this._smallJavaLib.getSuperclassOrObject(_get);
            Assert.assertSame(objClass, _superclassOrObject);
            SJClass _get_1 = it.get(0);
            SJClass _get_2 = it.get(1);
            SJClass _superclassOrObject_1 = SmallJavaLibTest.this._smallJavaLib.getSuperclassOrObject(_get_2);
            Assert.assertSame(_get_1, _superclassOrObject_1);
            SJClass _get_3 = it.get(2);
            SJClass _superclassOrObject_2 = SmallJavaLibTest.this._smallJavaLib.getSuperclassOrObject(_get_3);
            Assert.assertSame(objClass, _superclassOrObject_2);
          }
        };
        ObjectExtensions.<EList<SJClass>>operator_doubleArrow(_classes, _function);
      }
    };
    ObjectExtensions.<SJProgram>operator_doubleArrow(_loadLibAndParse, _function);
  }
  
  @Test
  public void testAccessToSuperWithImplicitExtendsObject() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class A {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("String toString() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return super.toString();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    SJProgram _loadLibAndParse = this.loadLibAndParse(_builder);
    this._validationTestHelper.assertNoErrors(_loadLibAndParse);
  }
  
  @Test
  public void testLibHasNoError() {
    this.loadLibrary();
  }
  
  private SJProgram loadLibAndParse(final CharSequence p) {
    try {
      ResourceSet _loadLibrary = this.loadLibrary();
      return this._parseHelper.parse(p, _loadLibrary);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private ResourceSet loadLibrary() {
    ResourceSet _loadLib = this._smallJavaLib.loadLib();
    final Procedure1<ResourceSet> _function = new Procedure1<ResourceSet>() {
      public void apply(final ResourceSet it) {
        EList<Resource> _resources = it.getResources();
        final Procedure1<Resource> _function = new Procedure1<Resource>() {
          public void apply(final Resource it) {
            EList<EObject> _contents = it.getContents();
            EObject _get = _contents.get(0);
            SmallJavaLibTest.this._validationTestHelper.assertNoErrors(_get);
          }
        };
        IterableExtensions.<Resource>forEach(_resources, _function);
      }
    };
    return ObjectExtensions.<ResourceSet>operator_doubleArrow(_loadLib, _function);
  }
  
  private void assertHierarchyWithObject(final SJClass c, final CharSequence expected) {
    String _string = expected.toString();
    ArrayList<SJClass> _classHierarchyWithObject = this._smallJavaLib.getClassHierarchyWithObject(c);
    final Function1<SJClass, String> _function = new Function1<SJClass, String>() {
      public String apply(final SJClass it) {
        return it.getName();
      }
    };
    List<String> _map = ListExtensions.<SJClass, String>map(_classHierarchyWithObject, _function);
    String _join = IterableExtensions.join(_map, ", ");
    Assert.assertEquals(_string, _join);
  }
}
