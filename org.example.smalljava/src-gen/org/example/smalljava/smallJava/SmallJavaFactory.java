/**
 */
package org.example.smalljava.smallJava;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.example.smalljava.smallJava.SmallJavaPackage
 * @generated
 */
public interface SmallJavaFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SmallJavaFactory eINSTANCE = org.example.smalljava.smallJava.impl.SmallJavaFactoryImpl.init();

  /**
   * Returns a new object of class '<em>SJ Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SJ Program</em>'.
   * @generated
   */
  SJProgram createSJProgram();

  /**
   * Returns a new object of class '<em>SJ Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SJ Import</em>'.
   * @generated
   */
  SJImport createSJImport();

  /**
   * Returns a new object of class '<em>SJ Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SJ Class</em>'.
   * @generated
   */
  SJClass createSJClass();

  /**
   * Returns a new object of class '<em>SJ Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SJ Member</em>'.
   * @generated
   */
  SJMember createSJMember();

  /**
   * Returns a new object of class '<em>SJ Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SJ Field</em>'.
   * @generated
   */
  SJField createSJField();

  /**
   * Returns a new object of class '<em>SJ Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SJ Method</em>'.
   * @generated
   */
  SJMethod createSJMethod();

  /**
   * Returns a new object of class '<em>SJ Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SJ Parameter</em>'.
   * @generated
   */
  SJParameter createSJParameter();

  /**
   * Returns a new object of class '<em>SJ Method Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SJ Method Body</em>'.
   * @generated
   */
  SJMethodBody createSJMethodBody();

  /**
   * Returns a new object of class '<em>SJ Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SJ Statement</em>'.
   * @generated
   */
  SJStatement createSJStatement();

  /**
   * Returns a new object of class '<em>SJ Return</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SJ Return</em>'.
   * @generated
   */
  SJReturn createSJReturn();

  /**
   * Returns a new object of class '<em>SJ Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SJ Variable Declaration</em>'.
   * @generated
   */
  SJVariableDeclaration createSJVariableDeclaration();

  /**
   * Returns a new object of class '<em>SJ If Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SJ If Statement</em>'.
   * @generated
   */
  SJIfStatement createSJIfStatement();

  /**
   * Returns a new object of class '<em>SJ If Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SJ If Block</em>'.
   * @generated
   */
  SJIfBlock createSJIfBlock();

  /**
   * Returns a new object of class '<em>SJ Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SJ Block</em>'.
   * @generated
   */
  SJBlock createSJBlock();

  /**
   * Returns a new object of class '<em>SJ Symbol</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SJ Symbol</em>'.
   * @generated
   */
  SJSymbol createSJSymbol();

  /**
   * Returns a new object of class '<em>SJ Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SJ Expression</em>'.
   * @generated
   */
  SJExpression createSJExpression();

  /**
   * Returns a new object of class '<em>SJ Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SJ Assignment</em>'.
   * @generated
   */
  SJAssignment createSJAssignment();

  /**
   * Returns a new object of class '<em>SJ Member Selection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SJ Member Selection</em>'.
   * @generated
   */
  SJMemberSelection createSJMemberSelection();

  /**
   * Returns a new object of class '<em>SJ String Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SJ String Constant</em>'.
   * @generated
   */
  SJStringConstant createSJStringConstant();

  /**
   * Returns a new object of class '<em>SJ Int Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SJ Int Constant</em>'.
   * @generated
   */
  SJIntConstant createSJIntConstant();

  /**
   * Returns a new object of class '<em>SJ Bool Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SJ Bool Constant</em>'.
   * @generated
   */
  SJBoolConstant createSJBoolConstant();

  /**
   * Returns a new object of class '<em>SJ This</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SJ This</em>'.
   * @generated
   */
  SJThis createSJThis();

  /**
   * Returns a new object of class '<em>SJ Super</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SJ Super</em>'.
   * @generated
   */
  SJSuper createSJSuper();

  /**
   * Returns a new object of class '<em>SJ Null</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SJ Null</em>'.
   * @generated
   */
  SJNull createSJNull();

  /**
   * Returns a new object of class '<em>SJ Symbol Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SJ Symbol Ref</em>'.
   * @generated
   */
  SJSymbolRef createSJSymbolRef();

  /**
   * Returns a new object of class '<em>SJ New</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SJ New</em>'.
   * @generated
   */
  SJNew createSJNew();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SmallJavaPackage getSmallJavaPackage();

} //SmallJavaFactory
