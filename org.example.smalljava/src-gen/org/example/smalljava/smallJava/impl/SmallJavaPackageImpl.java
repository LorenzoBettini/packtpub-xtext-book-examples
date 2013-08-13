/**
 */
package org.example.smalljava.smallJava.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.example.smalljava.smallJava.SJAccessLevel;
import org.example.smalljava.smallJava.SJAssignment;
import org.example.smalljava.smallJava.SJBlock;
import org.example.smalljava.smallJava.SJBoolConstant;
import org.example.smalljava.smallJava.SJClass;
import org.example.smalljava.smallJava.SJExpression;
import org.example.smalljava.smallJava.SJField;
import org.example.smalljava.smallJava.SJIfBlock;
import org.example.smalljava.smallJava.SJIfStatement;
import org.example.smalljava.smallJava.SJImport;
import org.example.smalljava.smallJava.SJIntConstant;
import org.example.smalljava.smallJava.SJMember;
import org.example.smalljava.smallJava.SJMemberSelection;
import org.example.smalljava.smallJava.SJMethod;
import org.example.smalljava.smallJava.SJMethodBody;
import org.example.smalljava.smallJava.SJNew;
import org.example.smalljava.smallJava.SJNull;
import org.example.smalljava.smallJava.SJParameter;
import org.example.smalljava.smallJava.SJProgram;
import org.example.smalljava.smallJava.SJReturn;
import org.example.smalljava.smallJava.SJStatement;
import org.example.smalljava.smallJava.SJStringConstant;
import org.example.smalljava.smallJava.SJSuper;
import org.example.smalljava.smallJava.SJSymbol;
import org.example.smalljava.smallJava.SJSymbolRef;
import org.example.smalljava.smallJava.SJThis;
import org.example.smalljava.smallJava.SJVariableDeclaration;
import org.example.smalljava.smallJava.SmallJavaFactory;
import org.example.smalljava.smallJava.SmallJavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmallJavaPackageImpl extends EPackageImpl implements SmallJavaPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sjProgramEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sjImportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sjClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sjMemberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sjFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sjMethodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sjParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sjMethodBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sjStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sjReturnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sjVariableDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sjIfStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sjIfBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sjBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sjSymbolEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sjExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sjAssignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sjMemberSelectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sjStringConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sjIntConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sjBoolConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sjThisEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sjSuperEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sjNullEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sjSymbolRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sjNewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum sjAccessLevelEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.example.smalljava.smallJava.SmallJavaPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SmallJavaPackageImpl()
  {
    super(eNS_URI, SmallJavaFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SmallJavaPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SmallJavaPackage init()
  {
    if (isInited) return (SmallJavaPackage)EPackage.Registry.INSTANCE.getEPackage(SmallJavaPackage.eNS_URI);

    // Obtain or create and register package
    SmallJavaPackageImpl theSmallJavaPackage = (SmallJavaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SmallJavaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SmallJavaPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSmallJavaPackage.createPackageContents();

    // Initialize created meta-data
    theSmallJavaPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSmallJavaPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SmallJavaPackage.eNS_URI, theSmallJavaPackage);
    return theSmallJavaPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSJProgram()
  {
    return sjProgramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSJProgram_Name()
  {
    return (EAttribute)sjProgramEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSJProgram_Imports()
  {
    return (EReference)sjProgramEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSJProgram_Classes()
  {
    return (EReference)sjProgramEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSJImport()
  {
    return sjImportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSJImport_ImportedNamespace()
  {
    return (EAttribute)sjImportEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSJClass()
  {
    return sjClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSJClass_Name()
  {
    return (EAttribute)sjClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSJClass_Superclass()
  {
    return (EReference)sjClassEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSJClass_Members()
  {
    return (EReference)sjClassEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSJMember()
  {
    return sjMemberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSJMember_Access()
  {
    return (EAttribute)sjMemberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSJMember_Type()
  {
    return (EReference)sjMemberEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSJMember_Name()
  {
    return (EAttribute)sjMemberEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSJField()
  {
    return sjFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSJMethod()
  {
    return sjMethodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSJMethod_Params()
  {
    return (EReference)sjMethodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSJMethod_Body()
  {
    return (EReference)sjMethodEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSJParameter()
  {
    return sjParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSJMethodBody()
  {
    return sjMethodBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSJStatement()
  {
    return sjStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSJReturn()
  {
    return sjReturnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSJReturn_Expression()
  {
    return (EReference)sjReturnEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSJVariableDeclaration()
  {
    return sjVariableDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSJVariableDeclaration_Expression()
  {
    return (EReference)sjVariableDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSJIfStatement()
  {
    return sjIfStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSJIfStatement_Expression()
  {
    return (EReference)sjIfStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSJIfStatement_ThenBlock()
  {
    return (EReference)sjIfStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSJIfStatement_ElseBlock()
  {
    return (EReference)sjIfStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSJIfBlock()
  {
    return sjIfBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSJBlock()
  {
    return sjBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSJBlock_Statements()
  {
    return (EReference)sjBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSJSymbol()
  {
    return sjSymbolEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSJSymbol_Type()
  {
    return (EReference)sjSymbolEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSJSymbol_Name()
  {
    return (EAttribute)sjSymbolEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSJExpression()
  {
    return sjExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSJAssignment()
  {
    return sjAssignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSJAssignment_Left()
  {
    return (EReference)sjAssignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSJAssignment_Right()
  {
    return (EReference)sjAssignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSJMemberSelection()
  {
    return sjMemberSelectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSJMemberSelection_Receiver()
  {
    return (EReference)sjMemberSelectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSJMemberSelection_Member()
  {
    return (EReference)sjMemberSelectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSJMemberSelection_Methodinvocation()
  {
    return (EAttribute)sjMemberSelectionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSJMemberSelection_Args()
  {
    return (EReference)sjMemberSelectionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSJStringConstant()
  {
    return sjStringConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSJStringConstant_Value()
  {
    return (EAttribute)sjStringConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSJIntConstant()
  {
    return sjIntConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSJIntConstant_Value()
  {
    return (EAttribute)sjIntConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSJBoolConstant()
  {
    return sjBoolConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSJBoolConstant_Value()
  {
    return (EAttribute)sjBoolConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSJThis()
  {
    return sjThisEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSJSuper()
  {
    return sjSuperEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSJNull()
  {
    return sjNullEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSJSymbolRef()
  {
    return sjSymbolRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSJSymbolRef_Symbol()
  {
    return (EReference)sjSymbolRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSJNew()
  {
    return sjNewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSJNew_Type()
  {
    return (EReference)sjNewEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSJAccessLevel()
  {
    return sjAccessLevelEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmallJavaFactory getSmallJavaFactory()
  {
    return (SmallJavaFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    sjProgramEClass = createEClass(SJ_PROGRAM);
    createEAttribute(sjProgramEClass, SJ_PROGRAM__NAME);
    createEReference(sjProgramEClass, SJ_PROGRAM__IMPORTS);
    createEReference(sjProgramEClass, SJ_PROGRAM__CLASSES);

    sjImportEClass = createEClass(SJ_IMPORT);
    createEAttribute(sjImportEClass, SJ_IMPORT__IMPORTED_NAMESPACE);

    sjClassEClass = createEClass(SJ_CLASS);
    createEAttribute(sjClassEClass, SJ_CLASS__NAME);
    createEReference(sjClassEClass, SJ_CLASS__SUPERCLASS);
    createEReference(sjClassEClass, SJ_CLASS__MEMBERS);

    sjMemberEClass = createEClass(SJ_MEMBER);
    createEAttribute(sjMemberEClass, SJ_MEMBER__ACCESS);
    createEReference(sjMemberEClass, SJ_MEMBER__TYPE);
    createEAttribute(sjMemberEClass, SJ_MEMBER__NAME);

    sjFieldEClass = createEClass(SJ_FIELD);

    sjMethodEClass = createEClass(SJ_METHOD);
    createEReference(sjMethodEClass, SJ_METHOD__PARAMS);
    createEReference(sjMethodEClass, SJ_METHOD__BODY);

    sjParameterEClass = createEClass(SJ_PARAMETER);

    sjMethodBodyEClass = createEClass(SJ_METHOD_BODY);

    sjStatementEClass = createEClass(SJ_STATEMENT);

    sjReturnEClass = createEClass(SJ_RETURN);
    createEReference(sjReturnEClass, SJ_RETURN__EXPRESSION);

    sjVariableDeclarationEClass = createEClass(SJ_VARIABLE_DECLARATION);
    createEReference(sjVariableDeclarationEClass, SJ_VARIABLE_DECLARATION__EXPRESSION);

    sjIfStatementEClass = createEClass(SJ_IF_STATEMENT);
    createEReference(sjIfStatementEClass, SJ_IF_STATEMENT__EXPRESSION);
    createEReference(sjIfStatementEClass, SJ_IF_STATEMENT__THEN_BLOCK);
    createEReference(sjIfStatementEClass, SJ_IF_STATEMENT__ELSE_BLOCK);

    sjIfBlockEClass = createEClass(SJ_IF_BLOCK);

    sjBlockEClass = createEClass(SJ_BLOCK);
    createEReference(sjBlockEClass, SJ_BLOCK__STATEMENTS);

    sjSymbolEClass = createEClass(SJ_SYMBOL);
    createEReference(sjSymbolEClass, SJ_SYMBOL__TYPE);
    createEAttribute(sjSymbolEClass, SJ_SYMBOL__NAME);

    sjExpressionEClass = createEClass(SJ_EXPRESSION);

    sjAssignmentEClass = createEClass(SJ_ASSIGNMENT);
    createEReference(sjAssignmentEClass, SJ_ASSIGNMENT__LEFT);
    createEReference(sjAssignmentEClass, SJ_ASSIGNMENT__RIGHT);

    sjMemberSelectionEClass = createEClass(SJ_MEMBER_SELECTION);
    createEReference(sjMemberSelectionEClass, SJ_MEMBER_SELECTION__RECEIVER);
    createEReference(sjMemberSelectionEClass, SJ_MEMBER_SELECTION__MEMBER);
    createEAttribute(sjMemberSelectionEClass, SJ_MEMBER_SELECTION__METHODINVOCATION);
    createEReference(sjMemberSelectionEClass, SJ_MEMBER_SELECTION__ARGS);

    sjStringConstantEClass = createEClass(SJ_STRING_CONSTANT);
    createEAttribute(sjStringConstantEClass, SJ_STRING_CONSTANT__VALUE);

    sjIntConstantEClass = createEClass(SJ_INT_CONSTANT);
    createEAttribute(sjIntConstantEClass, SJ_INT_CONSTANT__VALUE);

    sjBoolConstantEClass = createEClass(SJ_BOOL_CONSTANT);
    createEAttribute(sjBoolConstantEClass, SJ_BOOL_CONSTANT__VALUE);

    sjThisEClass = createEClass(SJ_THIS);

    sjSuperEClass = createEClass(SJ_SUPER);

    sjNullEClass = createEClass(SJ_NULL);

    sjSymbolRefEClass = createEClass(SJ_SYMBOL_REF);
    createEReference(sjSymbolRefEClass, SJ_SYMBOL_REF__SYMBOL);

    sjNewEClass = createEClass(SJ_NEW);
    createEReference(sjNewEClass, SJ_NEW__TYPE);

    // Create enums
    sjAccessLevelEEnum = createEEnum(SJ_ACCESS_LEVEL);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    sjFieldEClass.getESuperTypes().add(this.getSJMember());
    sjMethodEClass.getESuperTypes().add(this.getSJMember());
    sjParameterEClass.getESuperTypes().add(this.getSJSymbol());
    sjMethodBodyEClass.getESuperTypes().add(this.getSJBlock());
    sjReturnEClass.getESuperTypes().add(this.getSJStatement());
    sjVariableDeclarationEClass.getESuperTypes().add(this.getSJStatement());
    sjVariableDeclarationEClass.getESuperTypes().add(this.getSJSymbol());
    sjIfStatementEClass.getESuperTypes().add(this.getSJStatement());
    sjIfBlockEClass.getESuperTypes().add(this.getSJBlock());
    sjExpressionEClass.getESuperTypes().add(this.getSJStatement());
    sjAssignmentEClass.getESuperTypes().add(this.getSJExpression());
    sjMemberSelectionEClass.getESuperTypes().add(this.getSJExpression());
    sjStringConstantEClass.getESuperTypes().add(this.getSJExpression());
    sjIntConstantEClass.getESuperTypes().add(this.getSJExpression());
    sjBoolConstantEClass.getESuperTypes().add(this.getSJExpression());
    sjThisEClass.getESuperTypes().add(this.getSJExpression());
    sjSuperEClass.getESuperTypes().add(this.getSJExpression());
    sjNullEClass.getESuperTypes().add(this.getSJExpression());
    sjSymbolRefEClass.getESuperTypes().add(this.getSJExpression());
    sjNewEClass.getESuperTypes().add(this.getSJExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(sjProgramEClass, SJProgram.class, "SJProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSJProgram_Name(), ecorePackage.getEString(), "name", null, 0, 1, SJProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSJProgram_Imports(), this.getSJImport(), null, "imports", null, 0, -1, SJProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSJProgram_Classes(), this.getSJClass(), null, "classes", null, 0, -1, SJProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sjImportEClass, SJImport.class, "SJImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSJImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, SJImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sjClassEClass, SJClass.class, "SJClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSJClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, SJClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSJClass_Superclass(), this.getSJClass(), null, "superclass", null, 0, 1, SJClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSJClass_Members(), this.getSJMember(), null, "members", null, 0, -1, SJClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sjMemberEClass, SJMember.class, "SJMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSJMember_Access(), this.getSJAccessLevel(), "access", null, 0, 1, SJMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSJMember_Type(), this.getSJClass(), null, "type", null, 0, 1, SJMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSJMember_Name(), ecorePackage.getEString(), "name", null, 0, 1, SJMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sjFieldEClass, SJField.class, "SJField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sjMethodEClass, SJMethod.class, "SJMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSJMethod_Params(), this.getSJParameter(), null, "params", null, 0, -1, SJMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSJMethod_Body(), this.getSJMethodBody(), null, "body", null, 0, 1, SJMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sjParameterEClass, SJParameter.class, "SJParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sjMethodBodyEClass, SJMethodBody.class, "SJMethodBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sjStatementEClass, SJStatement.class, "SJStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sjReturnEClass, SJReturn.class, "SJReturn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSJReturn_Expression(), this.getSJExpression(), null, "expression", null, 0, 1, SJReturn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sjVariableDeclarationEClass, SJVariableDeclaration.class, "SJVariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSJVariableDeclaration_Expression(), this.getSJExpression(), null, "expression", null, 0, 1, SJVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sjIfStatementEClass, SJIfStatement.class, "SJIfStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSJIfStatement_Expression(), this.getSJExpression(), null, "expression", null, 0, 1, SJIfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSJIfStatement_ThenBlock(), this.getSJIfBlock(), null, "thenBlock", null, 0, 1, SJIfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSJIfStatement_ElseBlock(), this.getSJIfBlock(), null, "elseBlock", null, 0, 1, SJIfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sjIfBlockEClass, SJIfBlock.class, "SJIfBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sjBlockEClass, SJBlock.class, "SJBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSJBlock_Statements(), this.getSJStatement(), null, "statements", null, 0, -1, SJBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sjSymbolEClass, SJSymbol.class, "SJSymbol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSJSymbol_Type(), this.getSJClass(), null, "type", null, 0, 1, SJSymbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSJSymbol_Name(), ecorePackage.getEString(), "name", null, 0, 1, SJSymbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sjExpressionEClass, SJExpression.class, "SJExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sjAssignmentEClass, SJAssignment.class, "SJAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSJAssignment_Left(), this.getSJExpression(), null, "left", null, 0, 1, SJAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSJAssignment_Right(), this.getSJExpression(), null, "right", null, 0, 1, SJAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sjMemberSelectionEClass, SJMemberSelection.class, "SJMemberSelection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSJMemberSelection_Receiver(), this.getSJExpression(), null, "receiver", null, 0, 1, SJMemberSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSJMemberSelection_Member(), this.getSJMember(), null, "member", null, 0, 1, SJMemberSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSJMemberSelection_Methodinvocation(), ecorePackage.getEBoolean(), "methodinvocation", null, 0, 1, SJMemberSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSJMemberSelection_Args(), this.getSJExpression(), null, "args", null, 0, -1, SJMemberSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sjStringConstantEClass, SJStringConstant.class, "SJStringConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSJStringConstant_Value(), ecorePackage.getEString(), "value", null, 0, 1, SJStringConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sjIntConstantEClass, SJIntConstant.class, "SJIntConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSJIntConstant_Value(), ecorePackage.getEInt(), "value", null, 0, 1, SJIntConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sjBoolConstantEClass, SJBoolConstant.class, "SJBoolConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSJBoolConstant_Value(), ecorePackage.getEString(), "value", null, 0, 1, SJBoolConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sjThisEClass, SJThis.class, "SJThis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sjSuperEClass, SJSuper.class, "SJSuper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sjNullEClass, SJNull.class, "SJNull", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sjSymbolRefEClass, SJSymbolRef.class, "SJSymbolRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSJSymbolRef_Symbol(), this.getSJSymbol(), null, "symbol", null, 0, 1, SJSymbolRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sjNewEClass, SJNew.class, "SJNew", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSJNew_Type(), this.getSJClass(), null, "type", null, 0, 1, SJNew.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(sjAccessLevelEEnum, SJAccessLevel.class, "SJAccessLevel");
    addEEnumLiteral(sjAccessLevelEEnum, SJAccessLevel.PRIVATE);
    addEEnumLiteral(sjAccessLevelEEnum, SJAccessLevel.PUBLIC);
    addEEnumLiteral(sjAccessLevelEEnum, SJAccessLevel.PROTECTED);

    // Create resource
    createResource(eNS_URI);
  }

} //SmallJavaPackageImpl
