package org.example.xtend.examples;

import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.Extension;
import org.example.xtend.examples.MyListExtensions;

@SuppressWarnings("all")
public class ExtensionMethodsVariables {
  public Object m() {
    Object _xblockexpression = null;
    {
      MyListExtensions _myListExtensions = new MyListExtensions();
      @Extension
      final MyListExtensions e = _myListExtensions;
      ArrayList<String> _arrayList = new ArrayList<String>();
      final ArrayList<String> list = _arrayList;
      e.aListMethod(list);
      Object _anotherListMethod = e.anotherListMethod(list);
      _xblockexpression = (_anotherListMethod);
    }
    return _xblockexpression;
  }
}
