/**
 */
package org.example.smalljava.smallJava;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SJ Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.example.smalljava.smallJava.SJVariableDeclaration#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.example.smalljava.smallJava.SmallJavaPackage#getSJVariableDeclaration()
 * @model
 * @generated
 */
public interface SJVariableDeclaration extends SJStatement, SJSymbol
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
   * @see org.example.smalljava.smallJava.SmallJavaPackage#getSJVariableDeclaration_Expression()
   * @model containment="true"
   * @generated
   */
  SJExpression getExpression();

  /**
   * Sets the value of the '{@link org.example.smalljava.smallJava.SJVariableDeclaration#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(SJExpression value);

} // SJVariableDeclaration
