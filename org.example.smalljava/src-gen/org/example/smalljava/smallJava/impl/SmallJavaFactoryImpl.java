/**
 */
package org.example.smalljava.smallJava.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.example.smalljava.smallJava.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmallJavaFactoryImpl extends EFactoryImpl implements SmallJavaFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SmallJavaFactory init()
  {
    try
    {
      SmallJavaFactory theSmallJavaFactory = (SmallJavaFactory)EPackage.Registry.INSTANCE.getEFactory(SmallJavaPackage.eNS_URI);
      if (theSmallJavaFactory != null)
      {
        return theSmallJavaFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SmallJavaFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmallJavaFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SmallJavaPackage.SJ_PROGRAM: return createSJProgram();
      case SmallJavaPackage.SJ_IMPORT: return createSJImport();
      case SmallJavaPackage.SJ_CLASS: return createSJClass();
      case SmallJavaPackage.SJ_MEMBER: return createSJMember();
      case SmallJavaPackage.SJ_FIELD: return createSJField();
      case SmallJavaPackage.SJ_METHOD: return createSJMethod();
      case SmallJavaPackage.SJ_PARAMETER: return createSJParameter();
      case SmallJavaPackage.SJ_METHOD_BODY: return createSJMethodBody();
      case SmallJavaPackage.SJ_STATEMENT: return createSJStatement();
      case SmallJavaPackage.SJ_RETURN: return createSJReturn();
      case SmallJavaPackage.SJ_VARIABLE_DECLARATION: return createSJVariableDeclaration();
      case SmallJavaPackage.SJ_IF_STATEMENT: return createSJIfStatement();
      case SmallJavaPackage.SJ_IF_BLOCK: return createSJIfBlock();
      case SmallJavaPackage.SJ_BLOCK: return createSJBlock();
      case SmallJavaPackage.SJ_SYMBOL: return createSJSymbol();
      case SmallJavaPackage.SJ_EXPRESSION: return createSJExpression();
      case SmallJavaPackage.SJ_ASSIGNMENT: return createSJAssignment();
      case SmallJavaPackage.SJ_MEMBER_SELECTION: return createSJMemberSelection();
      case SmallJavaPackage.SJ_STRING_CONSTANT: return createSJStringConstant();
      case SmallJavaPackage.SJ_INT_CONSTANT: return createSJIntConstant();
      case SmallJavaPackage.SJ_BOOL_CONSTANT: return createSJBoolConstant();
      case SmallJavaPackage.SJ_THIS: return createSJThis();
      case SmallJavaPackage.SJ_SUPER: return createSJSuper();
      case SmallJavaPackage.SJ_NULL: return createSJNull();
      case SmallJavaPackage.SJ_SYMBOL_REF: return createSJSymbolRef();
      case SmallJavaPackage.SJ_NEW: return createSJNew();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SmallJavaPackage.SJ_ACCESS_LEVEL:
        return createSJAccessLevelFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SmallJavaPackage.SJ_ACCESS_LEVEL:
        return convertSJAccessLevelToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJProgram createSJProgram()
  {
    SJProgramImpl sjProgram = new SJProgramImpl();
    return sjProgram;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJImport createSJImport()
  {
    SJImportImpl sjImport = new SJImportImpl();
    return sjImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJClass createSJClass()
  {
    SJClassImpl sjClass = new SJClassImpl();
    return sjClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJMember createSJMember()
  {
    SJMemberImpl sjMember = new SJMemberImpl();
    return sjMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJField createSJField()
  {
    SJFieldImpl sjField = new SJFieldImpl();
    return sjField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJMethod createSJMethod()
  {
    SJMethodImpl sjMethod = new SJMethodImpl();
    return sjMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJParameter createSJParameter()
  {
    SJParameterImpl sjParameter = new SJParameterImpl();
    return sjParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJMethodBody createSJMethodBody()
  {
    SJMethodBodyImpl sjMethodBody = new SJMethodBodyImpl();
    return sjMethodBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJStatement createSJStatement()
  {
    SJStatementImpl sjStatement = new SJStatementImpl();
    return sjStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJReturn createSJReturn()
  {
    SJReturnImpl sjReturn = new SJReturnImpl();
    return sjReturn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJVariableDeclaration createSJVariableDeclaration()
  {
    SJVariableDeclarationImpl sjVariableDeclaration = new SJVariableDeclarationImpl();
    return sjVariableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJIfStatement createSJIfStatement()
  {
    SJIfStatementImpl sjIfStatement = new SJIfStatementImpl();
    return sjIfStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJIfBlock createSJIfBlock()
  {
    SJIfBlockImpl sjIfBlock = new SJIfBlockImpl();
    return sjIfBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJBlock createSJBlock()
  {
    SJBlockImpl sjBlock = new SJBlockImpl();
    return sjBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJSymbol createSJSymbol()
  {
    SJSymbolImpl sjSymbol = new SJSymbolImpl();
    return sjSymbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJExpression createSJExpression()
  {
    SJExpressionImpl sjExpression = new SJExpressionImpl();
    return sjExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJAssignment createSJAssignment()
  {
    SJAssignmentImpl sjAssignment = new SJAssignmentImpl();
    return sjAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJMemberSelection createSJMemberSelection()
  {
    SJMemberSelectionImpl sjMemberSelection = new SJMemberSelectionImpl();
    return sjMemberSelection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJStringConstant createSJStringConstant()
  {
    SJStringConstantImpl sjStringConstant = new SJStringConstantImpl();
    return sjStringConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJIntConstant createSJIntConstant()
  {
    SJIntConstantImpl sjIntConstant = new SJIntConstantImpl();
    return sjIntConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJBoolConstant createSJBoolConstant()
  {
    SJBoolConstantImpl sjBoolConstant = new SJBoolConstantImpl();
    return sjBoolConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJThis createSJThis()
  {
    SJThisImpl sjThis = new SJThisImpl();
    return sjThis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJSuper createSJSuper()
  {
    SJSuperImpl sjSuper = new SJSuperImpl();
    return sjSuper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJNull createSJNull()
  {
    SJNullImpl sjNull = new SJNullImpl();
    return sjNull;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJSymbolRef createSJSymbolRef()
  {
    SJSymbolRefImpl sjSymbolRef = new SJSymbolRefImpl();
    return sjSymbolRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJNew createSJNew()
  {
    SJNewImpl sjNew = new SJNewImpl();
    return sjNew;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJAccessLevel createSJAccessLevelFromString(EDataType eDataType, String initialValue)
  {
    SJAccessLevel result = SJAccessLevel.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSJAccessLevelToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmallJavaPackage getSmallJavaPackage()
  {
    return (SmallJavaPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SmallJavaPackage getPackage()
  {
    return SmallJavaPackage.eINSTANCE;
  }

} //SmallJavaFactoryImpl
