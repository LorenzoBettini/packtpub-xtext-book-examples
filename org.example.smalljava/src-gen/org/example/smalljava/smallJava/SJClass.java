/**
 */
package org.example.smalljava.smallJava;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SJ Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.example.smalljava.smallJava.SJClass#getName <em>Name</em>}</li>
 *   <li>{@link org.example.smalljava.smallJava.SJClass#getSuperclass <em>Superclass</em>}</li>
 *   <li>{@link org.example.smalljava.smallJava.SJClass#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.example.smalljava.smallJava.SmallJavaPackage#getSJClass()
 * @model
 * @generated
 */
public interface SJClass extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.example.smalljava.smallJava.SmallJavaPackage#getSJClass_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.example.smalljava.smallJava.SJClass#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Superclass</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Superclass</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Superclass</em>' reference.
   * @see #setSuperclass(SJClass)
   * @see org.example.smalljava.smallJava.SmallJavaPackage#getSJClass_Superclass()
   * @model
   * @generated
   */
  SJClass getSuperclass();

  /**
   * Sets the value of the '{@link org.example.smalljava.smallJava.SJClass#getSuperclass <em>Superclass</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Superclass</em>' reference.
   * @see #getSuperclass()
   * @generated
   */
  void setSuperclass(SJClass value);

  /**
   * Returns the value of the '<em><b>Members</b></em>' containment reference list.
   * The list contents are of type {@link org.example.smalljava.smallJava.SJMember}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' containment reference list.
   * @see org.example.smalljava.smallJava.SmallJavaPackage#getSJClass_Members()
   * @model containment="true"
   * @generated
   */
  EList<SJMember> getMembers();

} // SJClass
