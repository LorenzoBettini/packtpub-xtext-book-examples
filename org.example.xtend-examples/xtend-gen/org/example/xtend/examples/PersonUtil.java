package org.example.xtend.examples;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.example.xtend.examples.Person;

@SuppressWarnings("all")
public class PersonUtil {
  public static List<Person> mysort(final List<Person> persons) {
    final Function1<Person,String> _function = new Function1<Person,String>() {
        public String apply(final Person it) {
          String _surname = it.getSurname();
          String _plus = (_surname + " ");
          String _firstname = it.getFirstname();
          String _plus_1 = (_plus + _firstname);
          String _plus_2 = (_plus_1 + " ");
          int _age = it.getAge();
          String _plus_3 = (_plus_2 + Integer.valueOf(_age));
          return _plus_3;
        }
      };
    List<Person> _sortBy = IterableExtensions.<Person, String>sortBy(persons, _function);
    return _sortBy;
  }
  
  public static String asString(final List<Person> persons) {
    final Function1<Person,String> _function = new Function1<Person,String>() {
        public String apply(final Person it) {
          String _firstname = it.getFirstname();
          String _plus = (_firstname + " ");
          String _surname = it.getSurname();
          String _plus_1 = (_plus + _surname);
          String _plus_2 = (_plus_1 + " (");
          int _age = it.getAge();
          String _plus_3 = (_plus_2 + Integer.valueOf(_age));
          String _plus_4 = (_plus_3 + ")");
          return _plus_4;
        }
      };
    List<String> _map = ListExtensions.<Person, String>map(persons, _function);
    String _join = IterableExtensions.join(_map, ", ");
    return _join;
  }
  
  public static Person findByName(final List<Person> persons, final String name) {
    final Function1<Person,Boolean> _function = new Function1<Person,Boolean>() {
        public Boolean apply(final Person it) {
          String _firstname = it.getFirstname();
          boolean _equals = Objects.equal(_firstname, name);
          return Boolean.valueOf(_equals);
        }
      };
    Person _findFirst = IterableExtensions.<Person>findFirst(persons, _function);
    return _findFirst;
  }
  
  public static void main(final String[] args) {
    Person _person = new Person("James", "Smith", 50);
    Person _person_1 = new Person("John", "Smith", 40);
    Person _person_2 = new Person("James", "Anderson", 40);
    Person _person_3 = new Person("John", "Anderson", 30);
    Person _person_4 = new Person("Paul", "Anderson", 30);
    final ArrayList<Person> personList = CollectionLiterals.<Person>newArrayList(_person, _person_1, _person_2, _person_3, _person_4);
    List<Person> _mysort = PersonUtil.mysort(personList);
    String _asString = PersonUtil.asString(_mysort);
    InputOutput.<String>println(_asString);
    final Function1<Person,Boolean> _function = new Function1<Person,Boolean>() {
        public Boolean apply(final Person it) {
          String _firstname = it.getFirstname();
          boolean _startsWith = _firstname.startsWith("J");
          return Boolean.valueOf(_startsWith);
        }
      };
    Iterable<Person> _filter = IterableExtensions.<Person>filter(personList, _function);
    final Function1<Person,Integer> _function_1 = new Function1<Person,Integer>() {
        public Integer apply(final Person it) {
          int _age = it.getAge();
          return Integer.valueOf(_age);
        }
      };
    List<Person> _sortBy = IterableExtensions.<Person, Integer>sortBy(_filter, _function_1);
    Iterable<Person> _take = IterableExtensions.<Person>take(_sortBy, 3);
    final Function1<Person,String> _function_2 = new Function1<Person,String>() {
        public String apply(final Person it) {
          String _surname = it.getSurname();
          String _plus = (_surname + ", ");
          String _firstname = it.getFirstname();
          String _plus_1 = (_plus + _firstname);
          return _plus_1;
        }
      };
    Iterable<String> _map = IterableExtensions.<Person, String>map(_take, _function_2);
    final String result = IterableExtensions.join(_map, "; ");
    InputOutput.<String>println(result);
  }
}
