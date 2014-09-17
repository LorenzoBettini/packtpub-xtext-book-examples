package org.example.xtend.examples;

import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@Data
@SuppressWarnings("all")
public class Person {
  private final String _firstname;
  
  private final String _surname;
  
  private final int _age;
  
  public Person(final String firstname, final String surname, final int age) {
    super();
    this._firstname = firstname;
    this._surname = surname;
    this._age = age;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this._firstname== null) ? 0 : this._firstname.hashCode());
    result = prime * result + ((this._surname== null) ? 0 : this._surname.hashCode());
    result = prime * result + this._age;
    return result;
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Person other = (Person) obj;
    if (this._firstname == null) {
      if (other._firstname != null)
        return false;
    } else if (!this._firstname.equals(other._firstname))
      return false;
    if (this._surname == null) {
      if (other._surname != null)
        return false;
    } else if (!this._surname.equals(other._surname))
      return false;
    if (other._age != this._age)
      return false;
    return true;
  }
  
  @Override
  @Pure
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
  
  @Pure
  public String getFirstname() {
    return this._firstname;
  }
  
  @Pure
  public String getSurname() {
    return this._surname;
  }
  
  @Pure
  public int getAge() {
    return this._age;
  }
}
