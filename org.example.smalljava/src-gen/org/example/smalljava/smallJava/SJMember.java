/**
 */
package org.example.smalljava.smallJava;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SJ Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.example.smalljava.smallJava.SJMember#getAccess <em>Access</em>}</li>
 *   <li>{@link org.example.smalljava.smallJava.SJMember#getType <em>Type</em>}</li>
 *   <li>{@link org.example.smalljava.smallJava.SJMember#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.example.smalljava.smallJava.SmallJavaPackage#getSJMember()
 * @model
 * @generated
 */
public interface SJMember extends EObject
{
  /**
   * Returns the value of the '<em><b>Access</b></em>' attribute.
   * The literals are from the enumeration {@link org.example.smalljava.smallJava.SJAccessLevel}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Access</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Access</em>' attribute.
   * @see org.example.smalljava.smallJava.SJAccessLevel
   * @see #setAccess(SJAccessLevel)
   * @see org.example.smalljava.smallJava.SmallJavaPackage#getSJMember_Access()
   * @model
   * @generated
   */
  SJAccessLevel getAccess();

  /**
   * Sets the value of the '{@link org.example.smalljava.smallJava.SJMember#getAccess <em>Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Access</em>' attribute.
   * @see org.example.smalljava.smallJava.SJAccessLevel
   * @see #getAccess()
   * @generated
   */
  void setAccess(SJAccessLevel value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(SJClass)
   * @see org.example.smalljava.smallJava.SmallJavaPackage#getSJMember_Type()
   * @model
   * @generated
   */
  SJClass getType();

  /**
   * Sets the value of the '{@link org.example.smalljava.smallJava.SJMember#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(SJClass value);

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
   * @see org.example.smalljava.smallJava.SmallJavaPackage#getSJMember_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.example.smalljava.smallJava.SJMember#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // SJMember
