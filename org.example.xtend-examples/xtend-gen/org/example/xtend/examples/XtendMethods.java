package org.example.xtend.examples;

import org.eclipse.xtext.xbase.lib.Extension;
import org.example.xtend.examples.MyClass;

@SuppressWarnings("all")
public class XtendMethods {
  public String getBar(final String s) {
    return "bar";
  }
  
  public String m() {
    String _xblockexpression = null;
    {
      @Extension
      final MyClass.Result r = null;
      r.getFoo("a");
      r.getFoo("a");
      _xblockexpression = (this.getBar("a"));
    }
    return _xblockexpression;
  }
}
