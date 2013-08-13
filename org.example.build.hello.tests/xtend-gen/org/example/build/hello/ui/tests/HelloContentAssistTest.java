package org.example.build.hello.ui.tests;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.ui.ContentAssistProcessorTestBuilder;
import org.eclipse.xtext.xbase.junit.ui.AbstractContentAssistTest;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.example.build.hello.HelloUiInjectorProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(HelloUiInjectorProvider.class)
@SuppressWarnings("all")
public class HelloContentAssistTest extends AbstractContentAssistTest {
  @Test
  public void testEmptyProgram() {
    try {
      ContentAssistProcessorTestBuilder _newBuilder = this.newBuilder();
      ContentAssistProcessorTestBuilder _append = _newBuilder.append("");
      _append.assertText("Hello");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAfterName() {
    try {
      ContentAssistProcessorTestBuilder _newBuilder = this.newBuilder();
      ContentAssistProcessorTestBuilder _append = _newBuilder.append("Hello test ");
      _append.assertText("!");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
