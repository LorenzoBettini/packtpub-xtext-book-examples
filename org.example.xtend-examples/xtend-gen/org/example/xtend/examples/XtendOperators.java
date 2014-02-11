package org.example.xtend.examples;

import com.google.common.collect.Iterables;
import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class XtendOperators {
  public static void main(final String[] args) {
    final Object o = new Object();
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
      _elvis = "default";
    }
    result = _elvis;
    InputOutput.<Integer>println(Integer.valueOf(((3 - 2) - 1)));
    InputOutput.<Integer>println(Integer.valueOf((3 - (2 - 1))));
    InputOutput.<Boolean>println(Boolean.valueOf((!true)));
    final ArrayList<String> l1 = CollectionLiterals.<String>newArrayList("a");
    l1.add("b");
    final ArrayList<String> l2 = CollectionLiterals.<String>newArrayList("c");
    final Iterable<String> l3 = Iterables.<String>concat(l1, l2);
    InputOutput.<Iterable<String>>println(l3);
  }
}
