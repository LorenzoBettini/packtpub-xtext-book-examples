package org.example.xtend.examples;

import com.google.common.base.Objects;
import java.util.LinkedList;

@SuppressWarnings("all")
public class MyFirstXtendClass {
  private final String s = "my field";
  
  private LinkedList<Integer> myList = new LinkedList<Integer>();
  
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
        _or = _greaterThan;
      }
      _xblockexpression = _or;
    }
    return _xblockexpression;
  }
}
