package org.example.xtend.examples;

import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.Extension;
import org.example.xtend.examples.MyListExtensions;

@SuppressWarnings("all")
public class ExtensionMethodsVariables {
  public Object m() {
    Object _xblockexpression = null;
    {
      @Extension
      final MyListExtensions e = new MyListExtensions();
      final ArrayList<String> list = new ArrayList<String>();
      e.aListMethod(list);
      _xblockexpression = e.anotherListMethod(list);
    }
    return _xblockexpression;
  }
}
