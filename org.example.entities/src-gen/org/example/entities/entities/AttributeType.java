/**
 */
package org.example.entities.entities;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.example.entities.entities.AttributeType#getElementType <em>Element Type</em>}</li>
 *   <li>{@link org.example.entities.entities.AttributeType#isArray <em>Array</em>}</li>
 *   <li>{@link org.example.entities.entities.AttributeType#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.example.entities.entities.EntitiesPackage#getAttributeType()
 * @model
 * @generated
 */
public interface AttributeType extends EObject
{
  /**
   * Returns the value of the '<em><b>Element Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element Type</em>' containment reference.
   * @see #setElementType(ElementType)
   * @see org.example.entities.entities.EntitiesPackage#getAttributeType_ElementType()
   * @model containment="true"
   * @generated
   */
  ElementType getElementType();

  /**
   * Sets the value of the '{@link org.example.entities.entities.AttributeType#getElementType <em>Element Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element Type</em>' containment reference.
   * @see #getElementType()
   * @generated
   */
  void setElementType(ElementType value);

  /**
   * Returns the value of the '<em><b>Array</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array</em>' attribute.
   * @see #setArray(boolean)
   * @see org.example.entities.entities.EntitiesPackage#getAttributeType_Array()
   * @model
   * @generated
   */
  boolean isArray();

  /**
   * Sets the value of the '{@link org.example.entities.entities.AttributeType#isArray <em>Array</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array</em>' attribute.
   * @see #isArray()
   * @generated
   */
  void setArray(boolean value);

  /**
   * Returns the value of the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Length</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Length</em>' attribute.
   * @see #setLength(int)
   * @see org.example.entities.entities.EntitiesPackage#getAttributeType_Length()
   * @model
   * @generated
   */
  int getLength();

  /**
   * Sets the value of the '{@link org.example.entities.entities.AttributeType#getLength <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Length</em>' attribute.
   * @see #getLength()
   * @generated
   */
  void setLength(int value);

} // AttributeType
