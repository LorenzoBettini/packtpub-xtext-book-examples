/**
 */
package org.example.smalljava.smallJava.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.example.smalljava.smallJava.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.example.smalljava.smallJava.SmallJavaPackage
 * @generated
 */
public class SmallJavaSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SmallJavaPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmallJavaSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SmallJavaPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SmallJavaPackage.SJ_PROGRAM:
      {
        SJProgram sjProgram = (SJProgram)theEObject;
        T result = caseSJProgram(sjProgram);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmallJavaPackage.SJ_IMPORT:
      {
        SJImport sjImport = (SJImport)theEObject;
        T result = caseSJImport(sjImport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmallJavaPackage.SJ_CLASS:
      {
        SJClass sjClass = (SJClass)theEObject;
        T result = caseSJClass(sjClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmallJavaPackage.SJ_MEMBER:
      {
        SJMember sjMember = (SJMember)theEObject;
        T result = caseSJMember(sjMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmallJavaPackage.SJ_FIELD:
      {
        SJField sjField = (SJField)theEObject;
        T result = caseSJField(sjField);
        if (result == null) result = caseSJMember(sjField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmallJavaPackage.SJ_METHOD:
      {
        SJMethod sjMethod = (SJMethod)theEObject;
        T result = caseSJMethod(sjMethod);
        if (result == null) result = caseSJMember(sjMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmallJavaPackage.SJ_PARAMETER:
      {
        SJParameter sjParameter = (SJParameter)theEObject;
        T result = caseSJParameter(sjParameter);
        if (result == null) result = caseSJSymbol(sjParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmallJavaPackage.SJ_METHOD_BODY:
      {
        SJMethodBody sjMethodBody = (SJMethodBody)theEObject;
        T result = caseSJMethodBody(sjMethodBody);
        if (result == null) result = caseSJBlock(sjMethodBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmallJavaPackage.SJ_STATEMENT:
      {
        SJStatement sjStatement = (SJStatement)theEObject;
        T result = caseSJStatement(sjStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmallJavaPackage.SJ_RETURN:
      {
        SJReturn sjReturn = (SJReturn)theEObject;
        T result = caseSJReturn(sjReturn);
        if (result == null) result = caseSJStatement(sjReturn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmallJavaPackage.SJ_VARIABLE_DECLARATION:
      {
        SJVariableDeclaration sjVariableDeclaration = (SJVariableDeclaration)theEObject;
        T result = caseSJVariableDeclaration(sjVariableDeclaration);
        if (result == null) result = caseSJStatement(sjVariableDeclaration);
        if (result == null) result = caseSJSymbol(sjVariableDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmallJavaPackage.SJ_IF_STATEMENT:
      {
        SJIfStatement sjIfStatement = (SJIfStatement)theEObject;
        T result = caseSJIfStatement(sjIfStatement);
        if (result == null) result = caseSJStatement(sjIfStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmallJavaPackage.SJ_IF_BLOCK:
      {
        SJIfBlock sjIfBlock = (SJIfBlock)theEObject;
        T result = caseSJIfBlock(sjIfBlock);
        if (result == null) result = caseSJBlock(sjIfBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmallJavaPackage.SJ_BLOCK:
      {
        SJBlock sjBlock = (SJBlock)theEObject;
        T result = caseSJBlock(sjBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmallJavaPackage.SJ_SYMBOL:
      {
        SJSymbol sjSymbol = (SJSymbol)theEObject;
        T result = caseSJSymbol(sjSymbol);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmallJavaPackage.SJ_EXPRESSION:
      {
        SJExpression sjExpression = (SJExpression)theEObject;
        T result = caseSJExpression(sjExpression);
        if (result == null) result = caseSJStatement(sjExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmallJavaPackage.SJ_ASSIGNMENT:
      {
        SJAssignment sjAssignment = (SJAssignment)theEObject;
        T result = caseSJAssignment(sjAssignment);
        if (result == null) result = caseSJExpression(sjAssignment);
        if (result == null) result = caseSJStatement(sjAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmallJavaPackage.SJ_MEMBER_SELECTION:
      {
        SJMemberSelection sjMemberSelection = (SJMemberSelection)theEObject;
        T result = caseSJMemberSelection(sjMemberSelection);
        if (result == null) result = caseSJExpression(sjMemberSelection);
        if (result == null) result = caseSJStatement(sjMemberSelection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmallJavaPackage.SJ_STRING_CONSTANT:
      {
        SJStringConstant sjStringConstant = (SJStringConstant)theEObject;
        T result = caseSJStringConstant(sjStringConstant);
        if (result == null) result = caseSJExpression(sjStringConstant);
        if (result == null) result = caseSJStatement(sjStringConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmallJavaPackage.SJ_INT_CONSTANT:
      {
        SJIntConstant sjIntConstant = (SJIntConstant)theEObject;
        T result = caseSJIntConstant(sjIntConstant);
        if (result == null) result = caseSJExpression(sjIntConstant);
        if (result == null) result = caseSJStatement(sjIntConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmallJavaPackage.SJ_BOOL_CONSTANT:
      {
        SJBoolConstant sjBoolConstant = (SJBoolConstant)theEObject;
        T result = caseSJBoolConstant(sjBoolConstant);
        if (result == null) result = caseSJExpression(sjBoolConstant);
        if (result == null) result = caseSJStatement(sjBoolConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmallJavaPackage.SJ_THIS:
      {
        SJThis sjThis = (SJThis)theEObject;
        T result = caseSJThis(sjThis);
        if (result == null) result = caseSJExpression(sjThis);
        if (result == null) result = caseSJStatement(sjThis);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmallJavaPackage.SJ_SUPER:
      {
        SJSuper sjSuper = (SJSuper)theEObject;
        T result = caseSJSuper(sjSuper);
        if (result == null) result = caseSJExpression(sjSuper);
        if (result == null) result = caseSJStatement(sjSuper);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmallJavaPackage.SJ_NULL:
      {
        SJNull sjNull = (SJNull)theEObject;
        T result = caseSJNull(sjNull);
        if (result == null) result = caseSJExpression(sjNull);
        if (result == null) result = caseSJStatement(sjNull);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmallJavaPackage.SJ_SYMBOL_REF:
      {
        SJSymbolRef sjSymbolRef = (SJSymbolRef)theEObject;
        T result = caseSJSymbolRef(sjSymbolRef);
        if (result == null) result = caseSJExpression(sjSymbolRef);
        if (result == null) result = caseSJStatement(sjSymbolRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmallJavaPackage.SJ_NEW:
      {
        SJNew sjNew = (SJNew)theEObject;
        T result = caseSJNew(sjNew);
        if (result == null) result = caseSJExpression(sjNew);
        if (result == null) result = caseSJStatement(sjNew);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SJ Program</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SJ Program</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSJProgram(SJProgram object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SJ Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SJ Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSJImport(SJImport object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SJ Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SJ Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSJClass(SJClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SJ Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SJ Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSJMember(SJMember object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SJ Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SJ Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSJField(SJField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SJ Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SJ Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSJMethod(SJMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SJ Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SJ Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSJParameter(SJParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SJ Method Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SJ Method Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSJMethodBody(SJMethodBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SJ Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SJ Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSJStatement(SJStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SJ Return</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SJ Return</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSJReturn(SJReturn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SJ Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SJ Variable Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSJVariableDeclaration(SJVariableDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SJ If Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SJ If Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSJIfStatement(SJIfStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SJ If Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SJ If Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSJIfBlock(SJIfBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SJ Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SJ Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSJBlock(SJBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SJ Symbol</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SJ Symbol</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSJSymbol(SJSymbol object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SJ Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SJ Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSJExpression(SJExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SJ Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SJ Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSJAssignment(SJAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SJ Member Selection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SJ Member Selection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSJMemberSelection(SJMemberSelection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SJ String Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SJ String Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSJStringConstant(SJStringConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SJ Int Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SJ Int Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSJIntConstant(SJIntConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SJ Bool Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SJ Bool Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSJBoolConstant(SJBoolConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SJ This</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SJ This</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSJThis(SJThis object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SJ Super</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SJ Super</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSJSuper(SJSuper object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SJ Null</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SJ Null</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSJNull(SJNull object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SJ Symbol Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SJ Symbol Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSJSymbolRef(SJSymbolRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SJ New</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SJ New</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSJNew(SJNew object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SmallJavaSwitch
