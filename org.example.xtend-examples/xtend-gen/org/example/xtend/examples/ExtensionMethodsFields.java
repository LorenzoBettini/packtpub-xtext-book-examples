package org.example.xtend.examples;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.example.xtend.examples.MyListExtensions;

@SuppressWarnings("all")
public class ExtensionMethodsFields {
  @Extension
  private MyListExtensions _myListExtensions = new MyListExtensions();
  
  public Object n() {
    Object _xblockexpression = null;
    {
      final ArrayList<String> list = new ArrayList<String>();
      this._myListExtensions.aListMethod(list);
      _xblockexpression = (this._myListExtensions.anotherListMethod(list));
    }
    return _xblockexpression;
  }
  
  public Object n(@Extension final MyListExtensions extensions) {
    Object _xblockexpression = null;
    {
      final ArrayList<String> list = new ArrayList<String>();
      extensions.aListMethod(list);
      _xblockexpression = (extensions.anotherListMethod(list));
    }
    return _xblockexpression;
  }
  
  public Object myStringMeth(final List<? extends Object> list) {
    return null;
  }
  
  public Object m() {
    Object _xblockexpression = null;
    {
      final ArrayList<String> list = new ArrayList<String>();
      _xblockexpression = (this.myStringMeth(list));
    }
    return _xblockexpression;
  }
  
  public static void main(final String[] args) {
    String _firstUpper = StringExtensions.toFirstUpper("my string");
    InputOutput.<String>println(_firstUpper);
    final ArrayList<String> list = CollectionLiterals.<String>newArrayList("a", "b", "c");
    list.toString();
  }
}
