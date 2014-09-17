package org.example.xtend.examples;

import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class XtendHelloWorld {
  public static void main(final String[] args) {
    InputOutput.<String>println("Hello World");
    int i = 0;
    int k = 0;
    i = (k = 1);
  }
}
