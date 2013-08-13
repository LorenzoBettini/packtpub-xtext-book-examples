package org.example.xtend.examples;

import java.util.Collections;
import java.util.List;

@SuppressWarnings("all")
public class StaticMethods {
  public static void main(final String[] args) {
    final List<Object> list = Collections.<Object>emptyList();
    System.out.println(list);
    System.out.println(list);
  }
}
