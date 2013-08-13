package org.example.entities.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.example.entities.EntitiesInjectorProvider;
import org.example.entities.entities.Attribute;
import org.example.entities.entities.AttributeType;
import org.example.entities.entities.BasicType;
import org.example.entities.entities.ElementType;
import org.example.entities.entities.Entity;
import org.example.entities.entities.EntityType;
import org.example.entities.entities.Model;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(EntitiesInjectorProvider.class)
@SuppressWarnings("all")
public class EntitiesParserTest {
  @Inject
  @Extension
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testCorrectParsing() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity MyEntity {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("MyEntity attribute;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParsing() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity MyEntity {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("MyEntity attribute;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Model model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(model);
      EList<Entity> _entities = model.getEntities();
      final Entity entity = _entities.get(0);
      String _name = entity.getName();
      Assert.assertEquals("MyEntity", _name);
      EList<Attribute> _attributes = entity.getAttributes();
      final Attribute property = _attributes.get(0);
      String _name_1 = property.getName();
      Assert.assertEquals("attribute", _name_1);
      AttributeType _type = property.getType();
      ElementType _elementType = _type.getElementType();
      Entity _entity = ((EntityType) _elementType).getEntity();
      String _name_2 = _entity.getName();
      Assert.assertEquals("MyEntity", _name_2);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testArray() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity MyEntity {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("MyEntity[] arrayAttr;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("MyEntity[10] arrayAttrWithDimension;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("MyEntity notArrayAttr;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("string stringAttr;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("int[] intArrayAttr;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Model model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(model);
      EList<Entity> _entities = model.getEntities();
      final Entity entity = _entities.get(0);
      String _name = entity.getName();
      Assert.assertEquals("MyEntity", _name);
      EList<Attribute> _attributes = entity.getAttributes();
      Attribute property = _attributes.get(0);
      String _name_1 = property.getName();
      Assert.assertEquals("arrayAttr", _name_1);
      AttributeType _type = property.getType();
      boolean _isArray = _type.isArray();
      Assert.assertTrue(_isArray);
      AttributeType _type_1 = property.getType();
      int _length = _type_1.getLength();
      Assert.assertEquals(0, _length);
      EList<Attribute> _attributes_1 = entity.getAttributes();
      Attribute _get = _attributes_1.get(1);
      property = _get;
      String _name_2 = property.getName();
      Assert.assertEquals("arrayAttrWithDimension", _name_2);
      AttributeType _type_2 = property.getType();
      boolean _isArray_1 = _type_2.isArray();
      Assert.assertTrue(_isArray_1);
      AttributeType _type_3 = property.getType();
      int _length_1 = _type_3.getLength();
      Assert.assertEquals(10, _length_1);
      EList<Attribute> _attributes_2 = entity.getAttributes();
      Attribute _get_1 = _attributes_2.get(2);
      property = _get_1;
      String _name_3 = property.getName();
      Assert.assertEquals("notArrayAttr", _name_3);
      AttributeType _type_4 = property.getType();
      boolean _isArray_2 = _type_4.isArray();
      Assert.assertFalse(_isArray_2);
      EList<Attribute> _attributes_3 = entity.getAttributes();
      Attribute _get_2 = _attributes_3.get(3);
      property = _get_2;
      String _name_4 = property.getName();
      Assert.assertEquals("stringAttr", _name_4);
      AttributeType _type_5 = property.getType();
      boolean _isArray_3 = _type_5.isArray();
      Assert.assertFalse(_isArray_3);
      AttributeType _type_6 = property.getType();
      ElementType _elementType = _type_6.getElementType();
      String _typeName = ((BasicType) _elementType).getTypeName();
      Assert.assertEquals("string", _typeName);
      EList<Attribute> _attributes_4 = entity.getAttributes();
      Attribute _get_3 = _attributes_4.get(4);
      property = _get_3;
      String _name_5 = property.getName();
      Assert.assertEquals("intArrayAttr", _name_5);
      AttributeType _type_7 = property.getType();
      boolean _isArray_4 = _type_7.isArray();
      Assert.assertTrue(_isArray_4);
      AttributeType _type_8 = property.getType();
      ElementType _elementType_1 = _type_8.getElementType();
      String _typeName_1 = ((BasicType) _elementType_1).getTypeName();
      Assert.assertEquals("int", _typeName_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParsingAndLinking() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity MyEntity {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("MyEntity2 attribute;");
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
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
