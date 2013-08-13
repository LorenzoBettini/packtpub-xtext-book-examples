/**
 */
package org.example.smalljava.smallJava;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SJ Member Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.example.smalljava.smallJava.SJMemberSelection#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.example.smalljava.smallJava.SJMemberSelection#getMember <em>Member</em>}</li>
 *   <li>{@link org.example.smalljava.smallJava.SJMemberSelection#isMethodinvocation <em>Methodinvocation</em>}</li>
 *   <li>{@link org.example.smalljava.smallJava.SJMemberSelection#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.example.smalljava.smallJava.SmallJavaPackage#getSJMemberSelection()
 * @model
 * @generated
 */
public interface SJMemberSelection extends SJExpression
{
  /**
   * Returns the value of the '<em><b>Receiver</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Receiver</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Receiver</em>' containment reference.
   * @see #setReceiver(SJExpression)
   * @see org.example.smalljava.smallJava.SmallJavaPackage#getSJMemberSelection_Receiver()
   * @model containment="true"
   * @generated
   */
  SJExpression getReceiver();

  /**
   * Sets the value of the '{@link org.example.smalljava.smallJava.SJMemberSelection#getReceiver <em>Receiver</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Receiver</em>' containment reference.
   * @see #getReceiver()
   * @generated
   */
  void setReceiver(SJExpression value);

  /**
   * Returns the value of the '<em><b>Member</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Member</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Member</em>' reference.
   * @see #setMember(SJMember)
   * @see org.example.smalljava.smallJava.SmallJavaPackage#getSJMemberSelection_Member()
   * @model
   * @generated
   */
  SJMember getMember();

  /**
   * Sets the value of the '{@link org.example.smalljava.smallJava.SJMemberSelection#getMember <em>Member</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Member</em>' reference.
   * @see #getMember()
   * @generated
   */
  void setMember(SJMember value);

  /**
   * Returns the value of the '<em><b>Methodinvocation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methodinvocation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methodinvocation</em>' attribute.
   * @see #setMethodinvocation(boolean)
   * @see org.example.smalljava.smallJava.SmallJavaPackage#getSJMemberSelection_Methodinvocation()
   * @model
   * @generated
   */
  boolean isMethodinvocation();

  /**
   * Sets the value of the '{@link org.example.smalljava.smallJava.SJMemberSelection#isMethodinvocation <em>Methodinvocation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Methodinvocation</em>' attribute.
   * @see #isMethodinvocation()
   * @generated
   */
  void setMethodinvocation(boolean value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link org.example.smalljava.smallJava.SJExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see org.example.smalljava.smallJava.SmallJavaPackage#getSJMemberSelection_Args()
   * @model containment="true"
   * @generated
   */
  EList<SJExpression> getArgs();

} // SJMemberSelection
