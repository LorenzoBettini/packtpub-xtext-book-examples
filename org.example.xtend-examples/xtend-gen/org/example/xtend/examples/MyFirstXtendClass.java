package org.example.xtend.examples;

import com.google.common.base.Objects;
import java.util.LinkedList;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class MyFirstXtendClass {
  private final String s = "my field";
  
  private LinkedList<Integer> myList = new Function0<LinkedList<Integer>>() {
    public LinkedList<Integer> apply() {
      LinkedList<Integer> _linkedList = new LinkedList<Integer>();
      return _linkedList;
    }
  }.apply();
  
  public boolean bar(final String input) {
    boolean _xblockexpression = false;
    {
      String buffer = input;
      boolean _or = false;
      boolean _equals = Objects.equal(buffer, this.s);
      if (_equals) {
        _or = true;
      } else {
        int _size = this.myList.size();
        boolean _greaterThan = (_size > 0);
        _or = (_equals || _greaterThan);
      }
      _xblockexpression = (_or);
    }
    return _xblockexpression;
  }
}
