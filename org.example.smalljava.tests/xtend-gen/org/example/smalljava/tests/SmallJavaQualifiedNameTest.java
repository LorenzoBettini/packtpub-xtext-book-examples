package org.example.smalljava.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.example.smalljava.SmallJavaInjectorProvider;
import org.example.smalljava.smallJava.SJClass;
import org.example.smalljava.smallJava.SJMember;
import org.example.smalljava.smallJava.SJProgram;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(SmallJavaInjectorProvider.class)
@SuppressWarnings("all")
public class SmallJavaQualifiedNameTest {
  @Inject
  @Extension
  private ParseHelper<SJProgram> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Test
  public void testClass() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C { }");
      SJProgram _parse = this._parseHelper.parse(_builder);
      EList<SJClass> _classes = _parse.getClasses();
      SJClass _head = IterableExtensions.<SJClass>head(_classes);
      this.assertQualifiedName(_head, "C");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testField() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class D {}");
      _builder.newLine();
      _builder.append("class C { D c; }");
      SJProgram _parse = this._parseHelper.parse(_builder);
      EList<SJClass> _classes = _parse.getClasses();
      SJClass _get = _classes.get(1);
      EList<SJMember> _members = _get.getMembers();
      SJMember _head = IterableExtensions.<SJMember>head(_members);
      this.assertQualifiedName(_head, "C.c");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMethod() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class D {}");
      _builder.newLine();
      _builder.append("class C { D m() {return null;} }");
      SJProgram _parse = this._parseHelper.parse(_builder);
      EList<SJClass> _classes = _parse.getClasses();
      SJClass _get = _classes.get(1);
      EList<SJMember> _members = _get.getMembers();
      SJMember _head = IterableExtensions.<SJMember>head(_members);
      this.assertQualifiedName(_head, "C.m");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testFieldWithPackage() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package my.pack;");
      _builder.newLine();
      _builder.append("class D {}");
      _builder.newLine();
      _builder.append("class C { D c; }");
      SJProgram _parse = this._parseHelper.parse(_builder);
      EList<SJClass> _classes = _parse.getClasses();
      SJClass _get = _classes.get(1);
      EList<SJMember> _members = _get.getMembers();
      SJMember _head = IterableExtensions.<SJMember>head(_members);
      this.assertQualifiedName(_head, "my.pack.C.c");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private void assertQualifiedName(final EObject o, final String expected) {
    this._validationTestHelper.assertNoErrors(o);
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(o);
    String _string = _fullyQualifiedName.toString();
    Assert.assertEquals(expected, _string);
  }
}
