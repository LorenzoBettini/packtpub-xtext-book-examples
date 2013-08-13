package org.example.xtend.examples;

import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.Extension;
import org.example.xtend.examples.MyListExtensions;

@SuppressWarnings("all")
public class ExtensionMethodsParameters {
  public Object m(@Extension final MyListExtensions e) {
    Object _xblockexpression = null;
    {
      ArrayList<String> _arrayList = new ArrayList<String>();
      final ArrayList<String> list = _arrayList;
      e.aListMethod(list);
      Object _anotherListMethod = e.anotherListMethod(list);
      _xblockexpression = (_anotherListMethod);
    }
    return _xblockexpression;
  }
}
