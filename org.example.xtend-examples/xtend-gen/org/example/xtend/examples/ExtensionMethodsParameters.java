package org.example.xtend.examples;

import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.Extension;
import org.example.xtend.examples.MyListExtensions;

@SuppressWarnings("all")
public class ExtensionMethodsParameters {
  public Object m(@Extension final MyListExtensions e) {
    Object _xblockexpression = null;
    {
      final ArrayList<String> list = new ArrayList<String>();
      e.aListMethod(list);
      _xblockexpression = e.anotherListMethod(list);
    }
    return _xblockexpression;
  }
}
