/**
 */
package org.example.smalljava.smallJava;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SJ Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.example.smalljava.smallJava.SJBlock#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.example.smalljava.smallJava.SmallJavaPackage#getSJBlock()
 * @model
 * @generated
 */
public interface SJBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.example.smalljava.smallJava.SJStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see org.example.smalljava.smallJava.SmallJavaPackage#getSJBlock_Statements()
   * @model containment="true"
   * @generated
   */
  EList<SJStatement> getStatements();

} // SJBlock
