package org.example.expressions.ui.tests;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.ui.ContentAssistProcessorTestBuilder;
import org.eclipse.xtext.xbase.junit.ui.AbstractContentAssistTest;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.example.expressions.ExpressionsUiInjectorProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(ExpressionsUiInjectorProvider.class)
@SuppressWarnings("all")
public class ExpressionsContentAssistTest extends AbstractContentAssistTest {
  @Test
  public void testVariableReference() {
    try {
      ContentAssistProcessorTestBuilder _newBuilder = this.newBuilder();
      ContentAssistProcessorTestBuilder _append = _newBuilder.append("i = 10 1+");
      _append.assertText("!", "\"Value\"", "(", "+", "1", "false", "i", "true");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testForwardVariableReference() {
    try {
      ContentAssistProcessorTestBuilder _newBuilder = this.newBuilder();
      ContentAssistProcessorTestBuilder _append = _newBuilder.append(" i = 10 ");
      _append.assertTextAtCursorPosition(" ", 
        "!", "\"Value\"", "(", "1", "Name", "false", "true");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testForwardVariableReference2() {
    try {
      ContentAssistProcessorTestBuilder _newBuilder = this.newBuilder();
      ContentAssistProcessorTestBuilder _append = _newBuilder.append("k= 0 j=1 1+  i = 10 ");
      _append.assertTextAtCursorPosition("+", 1, 
        "!", "\"Value\"", "(", "+", "1", "false", "j", "k", "true");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
