/**
 */
package org.example.smalljava.smallJava.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.example.smalljava.smallJava.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.example.smalljava.smallJava.SmallJavaPackage
 * @generated
 */
public class SmallJavaAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SmallJavaPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmallJavaAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SmallJavaPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SmallJavaSwitch<Adapter> modelSwitch =
    new SmallJavaSwitch<Adapter>()
    {
      @Override
      public Adapter caseSJProgram(SJProgram object)
      {
        return createSJProgramAdapter();
      }
      @Override
      public Adapter caseSJImport(SJImport object)
      {
        return createSJImportAdapter();
      }
      @Override
      public Adapter caseSJClass(SJClass object)
      {
        return createSJClassAdapter();
      }
      @Override
      public Adapter caseSJMember(SJMember object)
      {
        return createSJMemberAdapter();
      }
      @Override
      public Adapter caseSJField(SJField object)
      {
        return createSJFieldAdapter();
      }
      @Override
      public Adapter caseSJMethod(SJMethod object)
      {
        return createSJMethodAdapter();
      }
      @Override
      public Adapter caseSJParameter(SJParameter object)
      {
        return createSJParameterAdapter();
      }
      @Override
      public Adapter caseSJMethodBody(SJMethodBody object)
      {
        return createSJMethodBodyAdapter();
      }
      @Override
      public Adapter caseSJStatement(SJStatement object)
      {
        return createSJStatementAdapter();
      }
      @Override
      public Adapter caseSJReturn(SJReturn object)
      {
        return createSJReturnAdapter();
      }
      @Override
      public Adapter caseSJVariableDeclaration(SJVariableDeclaration object)
      {
        return createSJVariableDeclarationAdapter();
      }
      @Override
      public Adapter caseSJIfStatement(SJIfStatement object)
      {
        return createSJIfStatementAdapter();
      }
      @Override
      public Adapter caseSJIfBlock(SJIfBlock object)
      {
        return createSJIfBlockAdapter();
      }
      @Override
      public Adapter caseSJBlock(SJBlock object)
      {
        return createSJBlockAdapter();
      }
      @Override
      public Adapter caseSJSymbol(SJSymbol object)
      {
        return createSJSymbolAdapter();
      }
      @Override
      public Adapter caseSJExpression(SJExpression object)
      {
        return createSJExpressionAdapter();
      }
      @Override
      public Adapter caseSJAssignment(SJAssignment object)
      {
        return createSJAssignmentAdapter();
      }
      @Override
      public Adapter caseSJMemberSelection(SJMemberSelection object)
      {
        return createSJMemberSelectionAdapter();
      }
      @Override
      public Adapter caseSJStringConstant(SJStringConstant object)
      {
        return createSJStringConstantAdapter();
      }
      @Override
      public Adapter caseSJIntConstant(SJIntConstant object)
      {
        return createSJIntConstantAdapter();
      }
      @Override
      public Adapter caseSJBoolConstant(SJBoolConstant object)
      {
        return createSJBoolConstantAdapter();
      }
      @Override
      public Adapter caseSJThis(SJThis object)
      {
        return createSJThisAdapter();
      }
      @Override
      public Adapter caseSJSuper(SJSuper object)
      {
        return createSJSuperAdapter();
      }
      @Override
      public Adapter caseSJNull(SJNull object)
      {
        return createSJNullAdapter();
      }
      @Override
      public Adapter caseSJSymbolRef(SJSymbolRef object)
      {
        return createSJSymbolRefAdapter();
      }
      @Override
      public Adapter caseSJNew(SJNew object)
      {
        return createSJNewAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.example.smalljava.smallJava.SJProgram <em>SJ Program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.smalljava.smallJava.SJProgram
   * @generated
   */
  public Adapter createSJProgramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.smalljava.smallJava.SJImport <em>SJ Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.smalljava.smallJava.SJImport
   * @generated
   */
  public Adapter createSJImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.smalljava.smallJava.SJClass <em>SJ Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.smalljava.smallJava.SJClass
   * @generated
   */
  public Adapter createSJClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.smalljava.smallJava.SJMember <em>SJ Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.smalljava.smallJava.SJMember
   * @generated
   */
  public Adapter createSJMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.smalljava.smallJava.SJField <em>SJ Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.smalljava.smallJava.SJField
   * @generated
   */
  public Adapter createSJFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.smalljava.smallJava.SJMethod <em>SJ Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.smalljava.smallJava.SJMethod
   * @generated
   */
  public Adapter createSJMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.smalljava.smallJava.SJParameter <em>SJ Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.smalljava.smallJava.SJParameter
   * @generated
   */
  public Adapter createSJParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.smalljava.smallJava.SJMethodBody <em>SJ Method Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.smalljava.smallJava.SJMethodBody
   * @generated
   */
  public Adapter createSJMethodBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.smalljava.smallJava.SJStatement <em>SJ Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.smalljava.smallJava.SJStatement
   * @generated
   */
  public Adapter createSJStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.smalljava.smallJava.SJReturn <em>SJ Return</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.smalljava.smallJava.SJReturn
   * @generated
   */
  public Adapter createSJReturnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.smalljava.smallJava.SJVariableDeclaration <em>SJ Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.smalljava.smallJava.SJVariableDeclaration
   * @generated
   */
  public Adapter createSJVariableDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.smalljava.smallJava.SJIfStatement <em>SJ If Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.smalljava.smallJava.SJIfStatement
   * @generated
   */
  public Adapter createSJIfStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.smalljava.smallJava.SJIfBlock <em>SJ If Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.smalljava.smallJava.SJIfBlock
   * @generated
   */
  public Adapter createSJIfBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.smalljava.smallJava.SJBlock <em>SJ Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.smalljava.smallJava.SJBlock
   * @generated
   */
  public Adapter createSJBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.smalljava.smallJava.SJSymbol <em>SJ Symbol</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.smalljava.smallJava.SJSymbol
   * @generated
   */
  public Adapter createSJSymbolAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.smalljava.smallJava.SJExpression <em>SJ Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.smalljava.smallJava.SJExpression
   * @generated
   */
  public Adapter createSJExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.smalljava.smallJava.SJAssignment <em>SJ Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.smalljava.smallJava.SJAssignment
   * @generated
   */
  public Adapter createSJAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.smalljava.smallJava.SJMemberSelection <em>SJ Member Selection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.smalljava.smallJava.SJMemberSelection
   * @generated
   */
  public Adapter createSJMemberSelectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.smalljava.smallJava.SJStringConstant <em>SJ String Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.smalljava.smallJava.SJStringConstant
   * @generated
   */
  public Adapter createSJStringConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.smalljava.smallJava.SJIntConstant <em>SJ Int Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.smalljava.smallJava.SJIntConstant
   * @generated
   */
  public Adapter createSJIntConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.smalljava.smallJava.SJBoolConstant <em>SJ Bool Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.smalljava.smallJava.SJBoolConstant
   * @generated
   */
  public Adapter createSJBoolConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.smalljava.smallJava.SJThis <em>SJ This</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.smalljava.smallJava.SJThis
   * @generated
   */
  public Adapter createSJThisAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.smalljava.smallJava.SJSuper <em>SJ Super</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.smalljava.smallJava.SJSuper
   * @generated
   */
  public Adapter createSJSuperAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.smalljava.smallJava.SJNull <em>SJ Null</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.smalljava.smallJava.SJNull
   * @generated
   */
  public Adapter createSJNullAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.smalljava.smallJava.SJSymbolRef <em>SJ Symbol Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.smalljava.smallJava.SJSymbolRef
   * @generated
   */
  public Adapter createSJSymbolRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.smalljava.smallJava.SJNew <em>SJ New</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.smalljava.smallJava.SJNew
   * @generated
   */
  public Adapter createSJNewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SmallJavaAdapterFactory
