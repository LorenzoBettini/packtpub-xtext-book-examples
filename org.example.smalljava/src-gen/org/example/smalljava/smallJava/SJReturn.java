/**
 */
package org.example.smalljava.smallJava;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SJ Return</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.example.smalljava.smallJava.SJReturn#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.example.smalljava.smallJava.SmallJavaPackage#getSJReturn()
 * @model
 * @generated
 */
public interface SJReturn extends SJStatement
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(SJExpression)
   * @see org.example.smalljava.smallJava.SmallJavaPackage#getSJReturn_Expression()
   * @model containment="true"
   * @generated
   */
  SJExpression getExpression();

  /**
   * Sets the value of the '{@link org.example.smalljava.smallJava.SJReturn#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(SJExpression value);

} // SJReturn
