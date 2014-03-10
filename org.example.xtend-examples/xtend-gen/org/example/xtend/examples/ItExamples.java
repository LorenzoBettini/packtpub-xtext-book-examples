package org.example.xtend.examples;

@SuppressWarnings("all")
public class ItExamples {
  public String trans1(final String it) {
    return it.toLowerCase();
  }
  
  public String trans2(final String s) {
    String _xblockexpression = null;
    {
      String it = s;
      _xblockexpression = it.toLowerCase();
    }
    return _xblockexpression;
  }
}
