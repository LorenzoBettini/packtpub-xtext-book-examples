package org.example.xtend.examples;

@SuppressWarnings("all")
public class ItExamples {
  public String trans1(final String it) {
    String _lowerCase = it.toLowerCase();
    return _lowerCase;
  }
  
  public String trans2(final String s) {
    String _xblockexpression = null;
    {
      String it = s;
      String _lowerCase = it.toLowerCase();
      _xblockexpression = (_lowerCase);
    }
    return _xblockexpression;
  }
}
