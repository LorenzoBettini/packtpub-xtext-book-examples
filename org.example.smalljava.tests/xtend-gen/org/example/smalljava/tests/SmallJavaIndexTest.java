package org.example.smalljava.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.example.smalljava.SmallJavaInjectorProvider;
import org.example.smalljava.scoping.SmallJavaIndex;
import org.example.smalljava.smallJava.SJClass;
import org.example.smalljava.smallJava.SJMember;
import org.example.smalljava.smallJava.SJProgram;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(SmallJavaInjectorProvider.class)
@SuppressWarnings("all")
public class SmallJavaIndexTest {
  @Inject
  @Extension
  private ParseHelper<SJProgram> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  @Extension
  private SmallJavaIndex _smallJavaIndex;
  
  @Test
  public void testClass() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C { }");
      SJProgram _parse = this._parseHelper.parse(_builder);
      EList<SJClass> _classes = _parse.getClasses();
      SJClass _get = _classes.get(0);
      this.assertDescriptions(_get, "C");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testFieldsAndMethods() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C { ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C c;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C m() { return null; }");
      _builder.newLine();
      _builder.append("}");
      SJProgram _parse = this._parseHelper.parse(_builder);
      EList<SJClass> _classes = _parse.getClasses();
      SJClass _head = IterableExtensions.<SJClass>head(_classes);
      EList<SJMember> _members = _head.getMembers();
      final Procedure1<EList<SJMember>> _function = new Procedure1<EList<SJMember>>() {
          public void apply(final EList<SJMember> it) {
            SJMember _get = it.get(0);
            SmallJavaIndexTest.this.assertDescriptions(_get, "");
            SJMember _get_1 = it.get(1);
            SmallJavaIndexTest.this.assertDescriptions(_get_1, "");
          }
        };
      ObjectExtensions.<EList<SJMember>>operator_doubleArrow(_members, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testPackage() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package my.pack;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class C { ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C c;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C m() { return null; }");
      _builder.newLine();
      _builder.append("}");
      SJProgram _parse = this._parseHelper.parse(_builder);
      EList<SJClass> _classes = _parse.getClasses();
      SJClass _head = IterableExtensions.<SJClass>head(_classes);
      this.assertDescriptions(_head, "my.pack.C");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMultipleFiles() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package my.first.pack;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class C { ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C c;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C m() { return null; }");
      _builder.newLine();
      _builder.append("}");
      final SJProgram first = this._parseHelper.parse(_builder);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package my.second.pack;");
      _builder_1.newLine();
      _builder_1.append("class D { }");
      _builder_1.newLine();
      Resource _eResource = first.eResource();
      ResourceSet _resourceSet = _eResource.getResourceSet();
      SJProgram _parse = this._parseHelper.parse(_builder_1, _resourceSet);
      EList<SJClass> _classes = _parse.getClasses();
      SJClass _get = _classes.get(0);
      this.assertDescriptions(_get, "my.first.pack.C,my.second.pack.D");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testExportedEObjectDescriptions() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A f;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A m(A p) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("A v = null;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return null;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("class A {}");
      _builder.newLine();
      SJProgram _parse = this._parseHelper.parse(_builder);
      this.assertExportedEObjectDescriptions(_parse, "C, A");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAllDescriptionsInFiles() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package my.first.pack;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class C { ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C c;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C m() { return null; }");
      _builder.newLine();
      _builder.append("}");
      final SJProgram first = this._parseHelper.parse(_builder);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package my.second.pack;");
      _builder_1.newLine();
      _builder_1.append("class D { }");
      _builder_1.newLine();
      Resource _eResource = first.eResource();
      ResourceSet _resourceSet = _eResource.getResourceSet();
      SJProgram _parse = this._parseHelper.parse(_builder_1, _resourceSet);
      EList<SJClass> _classes = _parse.getClasses();
      SJClass _get = _classes.get(0);
      this.assertAllDescriptions(_get, "my.first.pack.C,my.second.pack.D");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testClassesInIndex() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package my.first.pack;");
      _builder.newLine();
      _builder.append("class C { }");
      final SJProgram first = this._parseHelper.parse(_builder);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package my.second.pack;");
      _builder_1.newLine();
      _builder_1.append("class D { }");
      _builder_1.newLine();
      Resource _eResource = first.eResource();
      ResourceSet _resourceSet = _eResource.getResourceSet();
      SJProgram _parse = this._parseHelper.parse(_builder_1, _resourceSet);
      EList<SJClass> _classes = _parse.getClasses();
      SJClass _get = _classes.get(0);
      this.assertClassesInIndex(_get, "my.first.pack.C,my.second.pack.D");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private void assertDescriptions(final EObject o, final CharSequence expected) {
    String _string = expected.toString();
    String _eObjectDescriptions = this.eObjectDescriptions(o);
    Assert.assertEquals(_string, _eObjectDescriptions);
  }
  
  private String eObjectDescriptions(final EObject o) {
    String _xblockexpression = null;
    {
      this._validationTestHelper.assertNoErrors(o);
      EClass _eClass = o.eClass();
      Iterable<IEObjectDescription> _visibleEObjectDescriptions = this._smallJavaIndex.getVisibleEObjectDescriptions(o, _eClass);
      final Function1<IEObjectDescription,QualifiedName> _function = new Function1<IEObjectDescription,QualifiedName>() {
          public QualifiedName apply(final IEObjectDescription it) {
            QualifiedName _qualifiedName = it.getQualifiedName();
            return _qualifiedName;
          }
        };
      Iterable<QualifiedName> _map = IterableExtensions.<IEObjectDescription, QualifiedName>map(_visibleEObjectDescriptions, _function);
      String _join = IterableExtensions.join(_map, ",");
      _xblockexpression = (_join);
    }
    return _xblockexpression;
  }
  
  private void assertAllDescriptions(final EObject o, final CharSequence expected) {
    String _string = expected.toString();
    String _eObjectAllDescriptions = this.eObjectAllDescriptions(o);
    Assert.assertEquals(_string, _eObjectAllDescriptions);
  }
  
  private void assertExportedEObjectDescriptions(final EObject o, final CharSequence expected) {
    String _string = expected.toString();
    Iterable<IEObjectDescription> _exportedEObjectDescriptions = this._smallJavaIndex.getExportedEObjectDescriptions(o);
    final Function1<IEObjectDescription,QualifiedName> _function = new Function1<IEObjectDescription,QualifiedName>() {
        public QualifiedName apply(final IEObjectDescription it) {
          QualifiedName _qualifiedName = it.getQualifiedName();
          return _qualifiedName;
        }
      };
    Iterable<QualifiedName> _map = IterableExtensions.<IEObjectDescription, QualifiedName>map(_exportedEObjectDescriptions, _function);
    String _join = IterableExtensions.join(_map, ", ");
    Assert.assertEquals(_string, _join);
  }
  
  private String eObjectAllDescriptions(final EObject o) {
    String _xblockexpression = null;
    {
      this._validationTestHelper.assertNoErrors(o);
      Iterable<IEObjectDescription> _visibleEObjectDescriptions = this._smallJavaIndex.getVisibleEObjectDescriptions(o);
      final Function1<IEObjectDescription,QualifiedName> _function = new Function1<IEObjectDescription,QualifiedName>() {
          public QualifiedName apply(final IEObjectDescription it) {
            QualifiedName _qualifiedName = it.getQualifiedName();
            return _qualifiedName;
          }
        };
      Iterable<QualifiedName> _map = IterableExtensions.<IEObjectDescription, QualifiedName>map(_visibleEObjectDescriptions, _function);
      String _join = IterableExtensions.join(_map, ",");
      _xblockexpression = (_join);
    }
    return _xblockexpression;
  }
  
  private void assertClassesInIndex(final EObject o, final String expected) {
    this._validationTestHelper.assertNoErrors(o);
    Iterable<IEObjectDescription> _visibleClassesDescriptions = this._smallJavaIndex.getVisibleClassesDescriptions(o);
    final Function1<IEObjectDescription,QualifiedName> _function = new Function1<IEObjectDescription,QualifiedName>() {
        public QualifiedName apply(final IEObjectDescription it) {
          QualifiedName _qualifiedName = it.getQualifiedName();
          return _qualifiedName;
        }
      };
    Iterable<QualifiedName> _map = IterableExtensions.<IEObjectDescription, QualifiedName>map(_visibleClassesDescriptions, _function);
    String _join = IterableExtensions.join(_map, ",");
    Assert.assertEquals(expected, _join);
  }
}
