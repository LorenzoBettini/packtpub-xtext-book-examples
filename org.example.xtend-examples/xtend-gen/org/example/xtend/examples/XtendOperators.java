package org.example.xtend.examples;

import com.google.common.collect.Iterables;
import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;

@SuppressWarnings("all")
public class XtendOperators {
  public static void main(final String[] args) {
    Object _object = new Object();
    final Object o = _object;
    if (o!=null) {
      o.toString();
    }
    String _string = null;
    if (o!=null) {
      _string=o.toString();
    }
    String result = _string;
    InputOutput.<String>println(result);
    String _elvis = null;
    String _string_1 = null;
    if (o!=null) {
      _string_1=o.toString();
    }
    if (_string_1 != null) {
      _elvis = _string_1;
    } else {
      _elvis = ObjectExtensions.<String>operator_elvis(_string_1, "default");
    }
    result = _elvis;
    int _minus = (3 - 2);
    int _minus_1 = (_minus - 1);
    InputOutput.<Integer>println(Integer.valueOf(_minus_1));
    int _minus_2 = (2 - 1);
    int _minus_3 = (3 - _minus_2);
    InputOutput.<Integer>println(Integer.valueOf(_minus_3));
    boolean _not = (!true);
    InputOutput.<Boolean>println(Boolean.valueOf(_not));
    final ArrayList<String> l1 = CollectionLiterals.<String>newArrayList("a");
    l1.add("b");
    final ArrayList<String> l2 = CollectionLiterals.<String>newArrayList("c");
    final Iterable<String> l3 = Iterables.<String>concat(l1, l2);
    InputOutput.<Iterable<String>>println(l3);
  }
}
