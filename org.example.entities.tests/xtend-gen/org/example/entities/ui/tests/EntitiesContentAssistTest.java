package org.example.entities.ui.tests;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.ui.ContentAssistProcessorTestBuilder;
import org.eclipse.xtext.xbase.junit.ui.AbstractContentAssistTest;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.example.entities.EntitiesUiInjectorProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(EntitiesUiInjectorProvider.class)
@SuppressWarnings("all")
public class EntitiesContentAssistTest extends AbstractContentAssistTest {
  @Test
  public void testEmptyProgram() {
    try {
      ContentAssistProcessorTestBuilder _newBuilder = this.newBuilder();
      _newBuilder.assertText("entity");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSuperEntity() {
    try {
      ContentAssistProcessorTestBuilder _newBuilder = this.newBuilder();
      ContentAssistProcessorTestBuilder _append = _newBuilder.append("entity E extends ");
      _append.assertText("E");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSuperEntity2() {
    try {
      ContentAssistProcessorTestBuilder _newBuilder = this.newBuilder();
      ContentAssistProcessorTestBuilder _append = _newBuilder.append("entity A{} entity E extends ");
      _append.assertText("A", "E");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAttributeTypes() {
    try {
      ContentAssistProcessorTestBuilder _newBuilder = this.newBuilder();
      ContentAssistProcessorTestBuilder _append = _newBuilder.append("entity E { ");
      _append.assertText("E", "boolean", "int", "string", "}");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
