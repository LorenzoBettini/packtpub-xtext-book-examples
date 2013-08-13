/**
 */
package org.example.smalljava.smallJava;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SJ Symbol Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.example.smalljava.smallJava.SJSymbolRef#getSymbol <em>Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.example.smalljava.smallJava.SmallJavaPackage#getSJSymbolRef()
 * @model
 * @generated
 */
public interface SJSymbolRef extends SJExpression
{
  /**
   * Returns the value of the '<em><b>Symbol</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Symbol</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Symbol</em>' reference.
   * @see #setSymbol(SJSymbol)
   * @see org.example.smalljava.smallJava.SmallJavaPackage#getSJSymbolRef_Symbol()
   * @model
   * @generated
   */
  SJSymbol getSymbol();

  /**
   * Sets the value of the '{@link org.example.smalljava.smallJava.SJSymbolRef#getSymbol <em>Symbol</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Symbol</em>' reference.
   * @see #getSymbol()
   * @generated
   */
  void setSymbol(SJSymbol value);

} // SJSymbolRef
