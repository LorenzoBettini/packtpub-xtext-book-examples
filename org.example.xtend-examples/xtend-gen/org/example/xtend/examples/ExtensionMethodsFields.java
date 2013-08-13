package org.example.xtend.examples;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.example.xtend.examples.MyListExtensions;

@SuppressWarnings("all")
public class ExtensionMethodsFields {
  @Extension
  private MyListExtensions _myListExtensions = new Function0<MyListExtensions>() {
    public MyListExtensions apply() {
      MyListExtensions _myListExtensions = new MyListExtensions();
      return _myListExtensions;
    }
  }.apply();
  
  public Object n() {
    Object _xblockexpression = null;
    {
      ArrayList<String> _arrayList = new ArrayList<String>();
      final ArrayList<String> list = _arrayList;
      this._myListExtensions.aListMethod(list);
      Object _anotherListMethod = this._myListExtensions.anotherListMethod(list);
      _xblockexpression = (_anotherListMethod);
    }
    return _xblockexpression;
  }
  
  public Object n(@Extension final MyListExtensions extensions) {
    Object _xblockexpression = null;
    {
      ArrayList<String> _arrayList = new ArrayList<String>();
      final ArrayList<String> list = _arrayList;
      extensions.aListMethod(list);
      Object _anotherListMethod = extensions.anotherListMethod(list);
      _xblockexpression = (_anotherListMethod);
    }
    return _xblockexpression;
  }
  
  public Object myStringMeth(final List<? extends Object> list) {
    return null;
  }
  
  public Object m() {
    Object _xblockexpression = null;
    {
      ArrayList<String> _arrayList = new ArrayList<String>();
      final ArrayList<String> list = _arrayList;
      Object _myStringMeth = this.myStringMeth(list);
      _xblockexpression = (_myStringMeth);
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
