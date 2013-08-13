/**
 */
package org.example.smalljava.smallJava;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SJ Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.example.smalljava.smallJava.SJMethod#getParams <em>Params</em>}</li>
 *   <li>{@link org.example.smalljava.smallJava.SJMethod#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.example.smalljava.smallJava.SmallJavaPackage#getSJMethod()
 * @model
 * @generated
 */
public interface SJMethod extends SJMember
{
  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.example.smalljava.smallJava.SJParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.example.smalljava.smallJava.SmallJavaPackage#getSJMethod_Params()
   * @model containment="true"
   * @generated
   */
  EList<SJParameter> getParams();

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(SJMethodBody)
   * @see org.example.smalljava.smallJava.SmallJavaPackage#getSJMethod_Body()
   * @model containment="true"
   * @generated
   */
  SJMethodBody getBody();

  /**
   * Sets the value of the '{@link org.example.smalljava.smallJava.SJMethod#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(SJMethodBody value);

} // SJMethod
