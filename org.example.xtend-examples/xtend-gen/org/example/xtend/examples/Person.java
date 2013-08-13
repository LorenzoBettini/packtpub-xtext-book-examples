package org.example.xtend.examples;

import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@Data
@SuppressWarnings("all")
public class Person {
  private final String _firstname;
  
  public String getFirstname() {
    return this._firstname;
  }
  
  private final String _surname;
  
  public String getSurname() {
    return this._surname;
  }
  
  private final int _age;
  
  public int getAge() {
    return this._age;
  }
  
  public Person(final String firstname, final String surname, final int age) {
    super();
    this._firstname = firstname;
    this._surname = surname;
    this._age = age;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_firstname== null) ? 0 : _firstname.hashCode());
    result = prime * result + ((_surname== null) ? 0 : _surname.hashCode());
    result = prime * result + _age;
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Person other = (Person) obj;
    if (_firstname == null) {
      if (other._firstname != null)
        return false;
    } else if (!_firstname.equals(other._firstname))
      return false;
    if (_surname == null) {
      if (other._surname != null)
        return false;
    } else if (!_surname.equals(other._surname))
      return false;
    if (other._age != _age)
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
