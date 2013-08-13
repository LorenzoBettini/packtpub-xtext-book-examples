package org.example.entities.tests;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.example.entities.EntitiesInjectorProvider;
import org.example.entities.entities.EntitiesPackage;
import org.example.entities.entities.Model;
import org.example.entities.validation.EntitiesValidator;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(EntitiesInjectorProvider.class)
@SuppressWarnings("all")
public class EntitiesValidatorTest {
  @Inject
  @Extension
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testDuplicateAttributesInDifferentEntitiesOK() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity MyEntity {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("MyEntity attribute;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("entity MyEntity2 {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("MyEntity attribute;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Model model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDuplicateEntities() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity MyEntity {}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("entity MyEntity {}");
      _builder.newLine();
      final Model model = this._parseHelper.parse(_builder);
      EClass _entity = EntitiesPackage.eINSTANCE.getEntity();
      this._validationTestHelper.assertError(model, _entity, null, 
        "Duplicate Entity \'MyEntity\'");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDuplicateAttributes() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity MyEntity {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("MyEntity attribute;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("MyEntity attribute2;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("MyEntity attribute;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Model model = this._parseHelper.parse(_builder);
      EClass _attribute = EntitiesPackage.eINSTANCE.getAttribute();
      this._validationTestHelper.assertError(model, _attribute, null, 
        "Duplicate Attribute \'attribute\'");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAttributeWithTheSameNameOfAnEntityOK() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity MyEntity {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("MyEntity MyEntity;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Model model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testEntityExtendsItself() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity MyEntity extends MyEntity {");
      _builder.newLine();
      _builder.append("    ");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _entity = EntitiesPackage.eINSTANCE.getEntity();
      this._validationTestHelper.assertError(_parse, _entity, 
        EntitiesValidator.HIERARCHY_CYCLE, 
        "cycle in hierarchy of entity \'MyEntity\'");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCycleInEntityHierarchy() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity A extends B {}");
      _builder.newLine();
      _builder.append("entity B extends C {}");
      _builder.newLine();
      _builder.append("entity C extends A {}");
      _builder.newLine();
      final Model model = this._parseHelper.parse(_builder);
      EClass _entity = EntitiesPackage.eINSTANCE.getEntity();
      this._validationTestHelper.assertError(model, _entity, 
        EntitiesValidator.HIERARCHY_CYCLE, 
        "cycle in hierarchy of entity \'A\'");
      EClass _entity_1 = EntitiesPackage.eINSTANCE.getEntity();
      this._validationTestHelper.assertError(model, _entity_1, 
        EntitiesValidator.HIERARCHY_CYCLE, 
        "cycle in hierarchy of entity \'B\'");
      EClass _entity_2 = EntitiesPackage.eINSTANCE.getEntity();
      this._validationTestHelper.assertError(model, _entity_2, 
        EntitiesValidator.HIERARCHY_CYCLE, 
        "cycle in hierarchy of entity \'C\'");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testEntityName() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity myEntity {} ");
      Model _parse = this._parseHelper.parse(_builder);
      EClass _entity = EntitiesPackage.eINSTANCE.getEntity();
      this._validationTestHelper.assertWarning(_parse, _entity, 
        EntitiesValidator.INVALID_ENTITY_NAME, 
        "Entity name should start with a capital");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAttributeName() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity MyEntity { string S; } ");
      Model _parse = this._parseHelper.parse(_builder);
      EClass _attribute = EntitiesPackage.eINSTANCE.getAttribute();
      this._validationTestHelper.assertWarning(_parse, _attribute, 
        EntitiesValidator.INVALID_ATTRIBUTE_NAME, 
        "Attribute name should start with a lowercase");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
