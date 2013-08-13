/**
 */
package org.example.xbase.entities.entities;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmTypeReference;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.example.xbase.entities.entities.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link org.example.xbase.entities.entities.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link org.example.xbase.entities.entities.Attribute#getInitexpression <em>Initexpression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.example.xbase.entities.entities.EntitiesPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(JvmTypeReference)
   * @see org.example.xbase.entities.entities.EntitiesPackage#getAttribute_Type()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getType();

  /**
   * Sets the value of the '{@link org.example.xbase.entities.entities.Attribute#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(JvmTypeReference value);

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
   * @see org.example.xbase.entities.entities.EntitiesPackage#getAttribute_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.example.xbase.entities.entities.Attribute#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Initexpression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initexpression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initexpression</em>' containment reference.
   * @see #setInitexpression(XExpression)
   * @see org.example.xbase.entities.entities.EntitiesPackage#getAttribute_Initexpression()
   * @model containment="true"
   * @generated
   */
  XExpression getInitexpression();

  /**
   * Sets the value of the '{@link org.example.xbase.entities.entities.Attribute#getInitexpression <em>Initexpression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initexpression</em>' containment reference.
   * @see #getInitexpression()
   * @generated
   */
  void setInitexpression(XExpression value);

} // Attribute
