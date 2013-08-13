package org.example.xtend.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class LambdaExamples {
  public static String execute(final Function2<? super String,? super Integer,? extends String> f) {
    String _apply = f.apply("s", Integer.valueOf(10));
    return _apply;
  }
  
  public static void main(final String[] args) {
    final String c = "aaa";
    final Function2<String,Integer,String> _function = new Function2<String,Integer,String>() {
        public String apply(final String s, final Integer i) {
          String _plus = (s + i);
          String _plus_1 = (_plus + c);
          return _plus_1;
        }
      };
    String _execute = LambdaExamples.execute(_function);
    InputOutput.<String>println(_execute);
    final ArrayList<String> list = CollectionLiterals.<String>newArrayList("Second", "First", "Third");
    final Comparator<String> _function_1 = new Comparator<String>() {
        public int compare(final String arg0, final String arg1) {
          int _compareToIgnoreCase = arg0.compareToIgnoreCase(arg1);
          return _compareToIgnoreCase;
        }
      };
    Collections.<String>sort(list, _function_1);
    for (final String s : list) {
    }
    final ArrayList<String> strings = CollectionLiterals.<String>newArrayList("Second", "First", "Third");
    final Function1<String,Boolean> _function_2 = new Function1<String,Boolean>() {
        public Boolean apply(final String it) {
          boolean _startsWith = it.startsWith("F");
          return Boolean.valueOf(_startsWith);
        }
      };
    String _findFirst = IterableExtensions.<String>findFirst(strings, _function_2);
    InputOutput.<String>println(_findFirst);
    final Function0<String> _function_3 = new Function0<String>() {
        public String apply() {
          String _println = InputOutput.<String>println("Hello");
          return _println;
        }
      };
    final Function0<String> l = _function_3;
    l.apply();
  }
}
