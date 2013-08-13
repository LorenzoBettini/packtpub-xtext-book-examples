/**
 */
package org.example.smalljava.smallJava;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SJ If Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.example.smalljava.smallJava.SJIfStatement#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.example.smalljava.smallJava.SJIfStatement#getThenBlock <em>Then Block</em>}</li>
 *   <li>{@link org.example.smalljava.smallJava.SJIfStatement#getElseBlock <em>Else Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.example.smalljava.smallJava.SmallJavaPackage#getSJIfStatement()
 * @model
 * @generated
 */
public interface SJIfStatement extends SJStatement
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
   * @see org.example.smalljava.smallJava.SmallJavaPackage#getSJIfStatement_Expression()
   * @model containment="true"
   * @generated
   */
  SJExpression getExpression();

  /**
   * Sets the value of the '{@link org.example.smalljava.smallJava.SJIfStatement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(SJExpression value);

  /**
   * Returns the value of the '<em><b>Then Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then Block</em>' containment reference.
   * @see #setThenBlock(SJIfBlock)
   * @see org.example.smalljava.smallJava.SmallJavaPackage#getSJIfStatement_ThenBlock()
   * @model containment="true"
   * @generated
   */
  SJIfBlock getThenBlock();

  /**
   * Sets the value of the '{@link org.example.smalljava.smallJava.SJIfStatement#getThenBlock <em>Then Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then Block</em>' containment reference.
   * @see #getThenBlock()
   * @generated
   */
  void setThenBlock(SJIfBlock value);

  /**
   * Returns the value of the '<em><b>Else Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Block</em>' containment reference.
   * @see #setElseBlock(SJIfBlock)
   * @see org.example.smalljava.smallJava.SmallJavaPackage#getSJIfStatement_ElseBlock()
   * @model containment="true"
   * @generated
   */
  SJIfBlock getElseBlock();

  /**
   * Sets the value of the '{@link org.example.smalljava.smallJava.SJIfStatement#getElseBlock <em>Else Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else Block</em>' containment reference.
   * @see #getElseBlock()
   * @generated
   */
  void setElseBlock(SJIfBlock value);

} // SJIfStatement
