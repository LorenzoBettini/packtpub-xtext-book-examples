package org.example.xtend.examples;

import org.eclipse.xtext.xbase.lib.InputOutput;
import org.example.entities.entities.Entity;

@SuppressWarnings("all")
public class XtendTypeof {
  public static void main(final String[] args) {
    final Class<Entity> entityClass1 = Entity.class;
    final Class<Entity> entityClass2 = Entity.class;
    InputOutput.<Class<Entity>>println(entityClass1);
    InputOutput.<Class<Entity>>println(entityClass2);
  }
}
