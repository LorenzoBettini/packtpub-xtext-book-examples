package org.example.xtend.examples;

import org.eclipse.xtext.xbase.lib.Extension;
import org.example.xtend.examples.MyClass.Result;

@SuppressWarnings("all")
public class XtendMethods {
  public String getBar(final String s) {
    return "bar";
  }
  
  public String m() {
    String _xblockexpression = null;
    {
      @Extension
      final Result r = null;
      r.getFoo("a");
      r.getFoo("a");
      String _bar = this.getBar("a");
      _xblockexpression = (_bar);
    }
    return _xblockexpression;
  }
}
