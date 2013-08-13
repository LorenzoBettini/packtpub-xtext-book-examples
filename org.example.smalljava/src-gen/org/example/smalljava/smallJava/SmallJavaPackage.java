/**
 */
package org.example.smalljava.smallJava;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.example.smalljava.smallJava.SmallJavaFactory
 * @model kind="package"
 * @generated
 */
public interface SmallJavaPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "smallJava";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.example.org/smalljava/SmallJava";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "smallJava";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SmallJavaPackage eINSTANCE = org.example.smalljava.smallJava.impl.SmallJavaPackageImpl.init();

  /**
   * The meta object id for the '{@link org.example.smalljava.smallJava.impl.SJProgramImpl <em>SJ Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.smalljava.smallJava.impl.SJProgramImpl
   * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJProgram()
   * @generated
   */
  int SJ_PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_PROGRAM__NAME = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_PROGRAM__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Classes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_PROGRAM__CLASSES = 2;

  /**
   * The number of structural features of the '<em>SJ Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_PROGRAM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.example.smalljava.smallJava.impl.SJImportImpl <em>SJ Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.smalljava.smallJava.impl.SJImportImpl
   * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJImport()
   * @generated
   */
  int SJ_IMPORT = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>SJ Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.example.smalljava.smallJava.impl.SJClassImpl <em>SJ Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.smalljava.smallJava.impl.SJClassImpl
   * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJClass()
   * @generated
   */
  int SJ_CLASS = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_CLASS__NAME = 0;

  /**
   * The feature id for the '<em><b>Superclass</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_CLASS__SUPERCLASS = 1;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_CLASS__MEMBERS = 2;

  /**
   * The number of structural features of the '<em>SJ Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_CLASS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.example.smalljava.smallJava.impl.SJMemberImpl <em>SJ Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.smalljava.smallJava.impl.SJMemberImpl
   * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJMember()
   * @generated
   */
  int SJ_MEMBER = 3;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_MEMBER__ACCESS = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_MEMBER__TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_MEMBER__NAME = 2;

  /**
   * The number of structural features of the '<em>SJ Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_MEMBER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.example.smalljava.smallJava.impl.SJFieldImpl <em>SJ Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.smalljava.smallJava.impl.SJFieldImpl
   * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJField()
   * @generated
   */
  int SJ_FIELD = 4;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_FIELD__ACCESS = SJ_MEMBER__ACCESS;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_FIELD__TYPE = SJ_MEMBER__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_FIELD__NAME = SJ_MEMBER__NAME;

  /**
   * The number of structural features of the '<em>SJ Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_FIELD_FEATURE_COUNT = SJ_MEMBER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.example.smalljava.smallJava.impl.SJMethodImpl <em>SJ Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.smalljava.smallJava.impl.SJMethodImpl
   * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJMethod()
   * @generated
   */
  int SJ_METHOD = 5;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_METHOD__ACCESS = SJ_MEMBER__ACCESS;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_METHOD__TYPE = SJ_MEMBER__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_METHOD__NAME = SJ_MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_METHOD__PARAMS = SJ_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_METHOD__BODY = SJ_MEMBER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>SJ Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_METHOD_FEATURE_COUNT = SJ_MEMBER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.example.smalljava.smallJava.impl.SJSymbolImpl <em>SJ Symbol</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.smalljava.smallJava.impl.SJSymbolImpl
   * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJSymbol()
   * @generated
   */
  int SJ_SYMBOL = 14;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_SYMBOL__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_SYMBOL__NAME = 1;

  /**
   * The number of structural features of the '<em>SJ Symbol</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_SYMBOL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.example.smalljava.smallJava.impl.SJParameterImpl <em>SJ Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.smalljava.smallJava.impl.SJParameterImpl
   * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJParameter()
   * @generated
   */
  int SJ_PARAMETER = 6;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_PARAMETER__TYPE = SJ_SYMBOL__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_PARAMETER__NAME = SJ_SYMBOL__NAME;

  /**
   * The number of structural features of the '<em>SJ Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_PARAMETER_FEATURE_COUNT = SJ_SYMBOL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.example.smalljava.smallJava.impl.SJBlockImpl <em>SJ Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.smalljava.smallJava.impl.SJBlockImpl
   * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJBlock()
   * @generated
   */
  int SJ_BLOCK = 13;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_BLOCK__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>SJ Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_BLOCK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.example.smalljava.smallJava.impl.SJMethodBodyImpl <em>SJ Method Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.smalljava.smallJava.impl.SJMethodBodyImpl
   * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJMethodBody()
   * @generated
   */
  int SJ_METHOD_BODY = 7;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_METHOD_BODY__STATEMENTS = SJ_BLOCK__STATEMENTS;

  /**
   * The number of structural features of the '<em>SJ Method Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_METHOD_BODY_FEATURE_COUNT = SJ_BLOCK_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.example.smalljava.smallJava.impl.SJStatementImpl <em>SJ Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.smalljava.smallJava.impl.SJStatementImpl
   * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJStatement()
   * @generated
   */
  int SJ_STATEMENT = 8;

  /**
   * The number of structural features of the '<em>SJ Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.example.smalljava.smallJava.impl.SJReturnImpl <em>SJ Return</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.smalljava.smallJava.impl.SJReturnImpl
   * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJReturn()
   * @generated
   */
  int SJ_RETURN = 9;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_RETURN__EXPRESSION = SJ_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SJ Return</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_RETURN_FEATURE_COUNT = SJ_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.example.smalljava.smallJava.impl.SJVariableDeclarationImpl <em>SJ Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.smalljava.smallJava.impl.SJVariableDeclarationImpl
   * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJVariableDeclaration()
   * @generated
   */
  int SJ_VARIABLE_DECLARATION = 10;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_VARIABLE_DECLARATION__TYPE = SJ_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_VARIABLE_DECLARATION__NAME = SJ_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_VARIABLE_DECLARATION__EXPRESSION = SJ_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>SJ Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_VARIABLE_DECLARATION_FEATURE_COUNT = SJ_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.example.smalljava.smallJava.impl.SJIfStatementImpl <em>SJ If Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.smalljava.smallJava.impl.SJIfStatementImpl
   * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJIfStatement()
   * @generated
   */
  int SJ_IF_STATEMENT = 11;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_IF_STATEMENT__EXPRESSION = SJ_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_IF_STATEMENT__THEN_BLOCK = SJ_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_IF_STATEMENT__ELSE_BLOCK = SJ_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>SJ If Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_IF_STATEMENT_FEATURE_COUNT = SJ_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.example.smalljava.smallJava.impl.SJIfBlockImpl <em>SJ If Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.smalljava.smallJava.impl.SJIfBlockImpl
   * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJIfBlock()
   * @generated
   */
  int SJ_IF_BLOCK = 12;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_IF_BLOCK__STATEMENTS = SJ_BLOCK__STATEMENTS;

  /**
   * The number of structural features of the '<em>SJ If Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_IF_BLOCK_FEATURE_COUNT = SJ_BLOCK_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.example.smalljava.smallJava.impl.SJExpressionImpl <em>SJ Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.smalljava.smallJava.impl.SJExpressionImpl
   * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJExpression()
   * @generated
   */
  int SJ_EXPRESSION = 15;

  /**
   * The number of structural features of the '<em>SJ Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_EXPRESSION_FEATURE_COUNT = SJ_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.example.smalljava.smallJava.impl.SJAssignmentImpl <em>SJ Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.smalljava.smallJava.impl.SJAssignmentImpl
   * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJAssignment()
   * @generated
   */
  int SJ_ASSIGNMENT = 16;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_ASSIGNMENT__LEFT = SJ_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_ASSIGNMENT__RIGHT = SJ_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>SJ Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_ASSIGNMENT_FEATURE_COUNT = SJ_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.example.smalljava.smallJava.impl.SJMemberSelectionImpl <em>SJ Member Selection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.smalljava.smallJava.impl.SJMemberSelectionImpl
   * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJMemberSelection()
   * @generated
   */
  int SJ_MEMBER_SELECTION = 17;

  /**
   * The feature id for the '<em><b>Receiver</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_MEMBER_SELECTION__RECEIVER = SJ_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Member</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_MEMBER_SELECTION__MEMBER = SJ_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Methodinvocation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_MEMBER_SELECTION__METHODINVOCATION = SJ_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_MEMBER_SELECTION__ARGS = SJ_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>SJ Member Selection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_MEMBER_SELECTION_FEATURE_COUNT = SJ_EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.example.smalljava.smallJava.impl.SJStringConstantImpl <em>SJ String Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.smalljava.smallJava.impl.SJStringConstantImpl
   * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJStringConstant()
   * @generated
   */
  int SJ_STRING_CONSTANT = 18;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_STRING_CONSTANT__VALUE = SJ_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SJ String Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_STRING_CONSTANT_FEATURE_COUNT = SJ_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.example.smalljava.smallJava.impl.SJIntConstantImpl <em>SJ Int Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.smalljava.smallJava.impl.SJIntConstantImpl
   * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJIntConstant()
   * @generated
   */
  int SJ_INT_CONSTANT = 19;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_INT_CONSTANT__VALUE = SJ_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SJ Int Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_INT_CONSTANT_FEATURE_COUNT = SJ_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.example.smalljava.smallJava.impl.SJBoolConstantImpl <em>SJ Bool Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.smalljava.smallJava.impl.SJBoolConstantImpl
   * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJBoolConstant()
   * @generated
   */
  int SJ_BOOL_CONSTANT = 20;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_BOOL_CONSTANT__VALUE = SJ_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SJ Bool Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_BOOL_CONSTANT_FEATURE_COUNT = SJ_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.example.smalljava.smallJava.impl.SJThisImpl <em>SJ This</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.smalljava.smallJava.impl.SJThisImpl
   * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJThis()
   * @generated
   */
  int SJ_THIS = 21;

  /**
   * The number of structural features of the '<em>SJ This</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_THIS_FEATURE_COUNT = SJ_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.example.smalljava.smallJava.impl.SJSuperImpl <em>SJ Super</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.smalljava.smallJava.impl.SJSuperImpl
   * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJSuper()
   * @generated
   */
  int SJ_SUPER = 22;

  /**
   * The number of structural features of the '<em>SJ Super</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_SUPER_FEATURE_COUNT = SJ_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.example.smalljava.smallJava.impl.SJNullImpl <em>SJ Null</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.smalljava.smallJava.impl.SJNullImpl
   * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJNull()
   * @generated
   */
  int SJ_NULL = 23;

  /**
   * The number of structural features of the '<em>SJ Null</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_NULL_FEATURE_COUNT = SJ_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.example.smalljava.smallJava.impl.SJSymbolRefImpl <em>SJ Symbol Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.smalljava.smallJava.impl.SJSymbolRefImpl
   * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJSymbolRef()
   * @generated
   */
  int SJ_SYMBOL_REF = 24;

  /**
   * The feature id for the '<em><b>Symbol</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_SYMBOL_REF__SYMBOL = SJ_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SJ Symbol Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_SYMBOL_REF_FEATURE_COUNT = SJ_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.example.smalljava.smallJava.impl.SJNewImpl <em>SJ New</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.smalljava.smallJava.impl.SJNewImpl
   * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJNew()
   * @generated
   */
  int SJ_NEW = 25;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_NEW__TYPE = SJ_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SJ New</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJ_NEW_FEATURE_COUNT = SJ_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.example.smalljava.smallJava.SJAccessLevel <em>SJ Access Level</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.smalljava.smallJava.SJAccessLevel
   * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJAccessLevel()
   * @generated
   */
  int SJ_ACCESS_LEVEL = 26;


  /**
   * Returns the meta object for class '{@link org.example.smalljava.smallJava.SJProgram <em>SJ Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SJ Program</em>'.
   * @see org.example.smalljava.smallJava.SJProgram
   * @generated
   */
  EClass getSJProgram();

  /**
   * Returns the meta object for the attribute '{@link org.example.smalljava.smallJava.SJProgram#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.example.smalljava.smallJava.SJProgram#getName()
   * @see #getSJProgram()
   * @generated
   */
  EAttribute getSJProgram_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.smalljava.smallJava.SJProgram#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.example.smalljava.smallJava.SJProgram#getImports()
   * @see #getSJProgram()
   * @generated
   */
  EReference getSJProgram_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.smalljava.smallJava.SJProgram#getClasses <em>Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Classes</em>'.
   * @see org.example.smalljava.smallJava.SJProgram#getClasses()
   * @see #getSJProgram()
   * @generated
   */
  EReference getSJProgram_Classes();

  /**
   * Returns the meta object for class '{@link org.example.smalljava.smallJava.SJImport <em>SJ Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SJ Import</em>'.
   * @see org.example.smalljava.smallJava.SJImport
   * @generated
   */
  EClass getSJImport();

  /**
   * Returns the meta object for the attribute '{@link org.example.smalljava.smallJava.SJImport#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.example.smalljava.smallJava.SJImport#getImportedNamespace()
   * @see #getSJImport()
   * @generated
   */
  EAttribute getSJImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.example.smalljava.smallJava.SJClass <em>SJ Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SJ Class</em>'.
   * @see org.example.smalljava.smallJava.SJClass
   * @generated
   */
  EClass getSJClass();

  /**
   * Returns the meta object for the attribute '{@link org.example.smalljava.smallJava.SJClass#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.example.smalljava.smallJava.SJClass#getName()
   * @see #getSJClass()
   * @generated
   */
  EAttribute getSJClass_Name();

  /**
   * Returns the meta object for the reference '{@link org.example.smalljava.smallJava.SJClass#getSuperclass <em>Superclass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Superclass</em>'.
   * @see org.example.smalljava.smallJava.SJClass#getSuperclass()
   * @see #getSJClass()
   * @generated
   */
  EReference getSJClass_Superclass();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.smalljava.smallJava.SJClass#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see org.example.smalljava.smallJava.SJClass#getMembers()
   * @see #getSJClass()
   * @generated
   */
  EReference getSJClass_Members();

  /**
   * Returns the meta object for class '{@link org.example.smalljava.smallJava.SJMember <em>SJ Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SJ Member</em>'.
   * @see org.example.smalljava.smallJava.SJMember
   * @generated
   */
  EClass getSJMember();

  /**
   * Returns the meta object for the attribute '{@link org.example.smalljava.smallJava.SJMember#getAccess <em>Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Access</em>'.
   * @see org.example.smalljava.smallJava.SJMember#getAccess()
   * @see #getSJMember()
   * @generated
   */
  EAttribute getSJMember_Access();

  /**
   * Returns the meta object for the reference '{@link org.example.smalljava.smallJava.SJMember#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.example.smalljava.smallJava.SJMember#getType()
   * @see #getSJMember()
   * @generated
   */
  EReference getSJMember_Type();

  /**
   * Returns the meta object for the attribute '{@link org.example.smalljava.smallJava.SJMember#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.example.smalljava.smallJava.SJMember#getName()
   * @see #getSJMember()
   * @generated
   */
  EAttribute getSJMember_Name();

  /**
   * Returns the meta object for class '{@link org.example.smalljava.smallJava.SJField <em>SJ Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SJ Field</em>'.
   * @see org.example.smalljava.smallJava.SJField
   * @generated
   */
  EClass getSJField();

  /**
   * Returns the meta object for class '{@link org.example.smalljava.smallJava.SJMethod <em>SJ Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SJ Method</em>'.
   * @see org.example.smalljava.smallJava.SJMethod
   * @generated
   */
  EClass getSJMethod();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.smalljava.smallJava.SJMethod#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.example.smalljava.smallJava.SJMethod#getParams()
   * @see #getSJMethod()
   * @generated
   */
  EReference getSJMethod_Params();

  /**
   * Returns the meta object for the containment reference '{@link org.example.smalljava.smallJava.SJMethod#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.example.smalljava.smallJava.SJMethod#getBody()
   * @see #getSJMethod()
   * @generated
   */
  EReference getSJMethod_Body();

  /**
   * Returns the meta object for class '{@link org.example.smalljava.smallJava.SJParameter <em>SJ Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SJ Parameter</em>'.
   * @see org.example.smalljava.smallJava.SJParameter
   * @generated
   */
  EClass getSJParameter();

  /**
   * Returns the meta object for class '{@link org.example.smalljava.smallJava.SJMethodBody <em>SJ Method Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SJ Method Body</em>'.
   * @see org.example.smalljava.smallJava.SJMethodBody
   * @generated
   */
  EClass getSJMethodBody();

  /**
   * Returns the meta object for class '{@link org.example.smalljava.smallJava.SJStatement <em>SJ Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SJ Statement</em>'.
   * @see org.example.smalljava.smallJava.SJStatement
   * @generated
   */
  EClass getSJStatement();

  /**
   * Returns the meta object for class '{@link org.example.smalljava.smallJava.SJReturn <em>SJ Return</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SJ Return</em>'.
   * @see org.example.smalljava.smallJava.SJReturn
   * @generated
   */
  EClass getSJReturn();

  /**
   * Returns the meta object for the containment reference '{@link org.example.smalljava.smallJava.SJReturn#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.example.smalljava.smallJava.SJReturn#getExpression()
   * @see #getSJReturn()
   * @generated
   */
  EReference getSJReturn_Expression();

  /**
   * Returns the meta object for class '{@link org.example.smalljava.smallJava.SJVariableDeclaration <em>SJ Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SJ Variable Declaration</em>'.
   * @see org.example.smalljava.smallJava.SJVariableDeclaration
   * @generated
   */
  EClass getSJVariableDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.example.smalljava.smallJava.SJVariableDeclaration#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.example.smalljava.smallJava.SJVariableDeclaration#getExpression()
   * @see #getSJVariableDeclaration()
   * @generated
   */
  EReference getSJVariableDeclaration_Expression();

  /**
   * Returns the meta object for class '{@link org.example.smalljava.smallJava.SJIfStatement <em>SJ If Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SJ If Statement</em>'.
   * @see org.example.smalljava.smallJava.SJIfStatement
   * @generated
   */
  EClass getSJIfStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.example.smalljava.smallJava.SJIfStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.example.smalljava.smallJava.SJIfStatement#getExpression()
   * @see #getSJIfStatement()
   * @generated
   */
  EReference getSJIfStatement_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.example.smalljava.smallJava.SJIfStatement#getThenBlock <em>Then Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then Block</em>'.
   * @see org.example.smalljava.smallJava.SJIfStatement#getThenBlock()
   * @see #getSJIfStatement()
   * @generated
   */
  EReference getSJIfStatement_ThenBlock();

  /**
   * Returns the meta object for the containment reference '{@link org.example.smalljava.smallJava.SJIfStatement#getElseBlock <em>Else Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Block</em>'.
   * @see org.example.smalljava.smallJava.SJIfStatement#getElseBlock()
   * @see #getSJIfStatement()
   * @generated
   */
  EReference getSJIfStatement_ElseBlock();

  /**
   * Returns the meta object for class '{@link org.example.smalljava.smallJava.SJIfBlock <em>SJ If Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SJ If Block</em>'.
   * @see org.example.smalljava.smallJava.SJIfBlock
   * @generated
   */
  EClass getSJIfBlock();

  /**
   * Returns the meta object for class '{@link org.example.smalljava.smallJava.SJBlock <em>SJ Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SJ Block</em>'.
   * @see org.example.smalljava.smallJava.SJBlock
   * @generated
   */
  EClass getSJBlock();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.smalljava.smallJava.SJBlock#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.example.smalljava.smallJava.SJBlock#getStatements()
   * @see #getSJBlock()
   * @generated
   */
  EReference getSJBlock_Statements();

  /**
   * Returns the meta object for class '{@link org.example.smalljava.smallJava.SJSymbol <em>SJ Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SJ Symbol</em>'.
   * @see org.example.smalljava.smallJava.SJSymbol
   * @generated
   */
  EClass getSJSymbol();

  /**
   * Returns the meta object for the reference '{@link org.example.smalljava.smallJava.SJSymbol#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.example.smalljava.smallJava.SJSymbol#getType()
   * @see #getSJSymbol()
   * @generated
   */
  EReference getSJSymbol_Type();

  /**
   * Returns the meta object for the attribute '{@link org.example.smalljava.smallJava.SJSymbol#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.example.smalljava.smallJava.SJSymbol#getName()
   * @see #getSJSymbol()
   * @generated
   */
  EAttribute getSJSymbol_Name();

  /**
   * Returns the meta object for class '{@link org.example.smalljava.smallJava.SJExpression <em>SJ Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SJ Expression</em>'.
   * @see org.example.smalljava.smallJava.SJExpression
   * @generated
   */
  EClass getSJExpression();

  /**
   * Returns the meta object for class '{@link org.example.smalljava.smallJava.SJAssignment <em>SJ Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SJ Assignment</em>'.
   * @see org.example.smalljava.smallJava.SJAssignment
   * @generated
   */
  EClass getSJAssignment();

  /**
   * Returns the meta object for the containment reference '{@link org.example.smalljava.smallJava.SJAssignment#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.example.smalljava.smallJava.SJAssignment#getLeft()
   * @see #getSJAssignment()
   * @generated
   */
  EReference getSJAssignment_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.example.smalljava.smallJava.SJAssignment#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.example.smalljava.smallJava.SJAssignment#getRight()
   * @see #getSJAssignment()
   * @generated
   */
  EReference getSJAssignment_Right();

  /**
   * Returns the meta object for class '{@link org.example.smalljava.smallJava.SJMemberSelection <em>SJ Member Selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SJ Member Selection</em>'.
   * @see org.example.smalljava.smallJava.SJMemberSelection
   * @generated
   */
  EClass getSJMemberSelection();

  /**
   * Returns the meta object for the containment reference '{@link org.example.smalljava.smallJava.SJMemberSelection#getReceiver <em>Receiver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Receiver</em>'.
   * @see org.example.smalljava.smallJava.SJMemberSelection#getReceiver()
   * @see #getSJMemberSelection()
   * @generated
   */
  EReference getSJMemberSelection_Receiver();

  /**
   * Returns the meta object for the reference '{@link org.example.smalljava.smallJava.SJMemberSelection#getMember <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Member</em>'.
   * @see org.example.smalljava.smallJava.SJMemberSelection#getMember()
   * @see #getSJMemberSelection()
   * @generated
   */
  EReference getSJMemberSelection_Member();

  /**
   * Returns the meta object for the attribute '{@link org.example.smalljava.smallJava.SJMemberSelection#isMethodinvocation <em>Methodinvocation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Methodinvocation</em>'.
   * @see org.example.smalljava.smallJava.SJMemberSelection#isMethodinvocation()
   * @see #getSJMemberSelection()
   * @generated
   */
  EAttribute getSJMemberSelection_Methodinvocation();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.smalljava.smallJava.SJMemberSelection#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see org.example.smalljava.smallJava.SJMemberSelection#getArgs()
   * @see #getSJMemberSelection()
   * @generated
   */
  EReference getSJMemberSelection_Args();

  /**
   * Returns the meta object for class '{@link org.example.smalljava.smallJava.SJStringConstant <em>SJ String Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SJ String Constant</em>'.
   * @see org.example.smalljava.smallJava.SJStringConstant
   * @generated
   */
  EClass getSJStringConstant();

  /**
   * Returns the meta object for the attribute '{@link org.example.smalljava.smallJava.SJStringConstant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.example.smalljava.smallJava.SJStringConstant#getValue()
   * @see #getSJStringConstant()
   * @generated
   */
  EAttribute getSJStringConstant_Value();

  /**
   * Returns the meta object for class '{@link org.example.smalljava.smallJava.SJIntConstant <em>SJ Int Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SJ Int Constant</em>'.
   * @see org.example.smalljava.smallJava.SJIntConstant
   * @generated
   */
  EClass getSJIntConstant();

  /**
   * Returns the meta object for the attribute '{@link org.example.smalljava.smallJava.SJIntConstant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.example.smalljava.smallJava.SJIntConstant#getValue()
   * @see #getSJIntConstant()
   * @generated
   */
  EAttribute getSJIntConstant_Value();

  /**
   * Returns the meta object for class '{@link org.example.smalljava.smallJava.SJBoolConstant <em>SJ Bool Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SJ Bool Constant</em>'.
   * @see org.example.smalljava.smallJava.SJBoolConstant
   * @generated
   */
  EClass getSJBoolConstant();

  /**
   * Returns the meta object for the attribute '{@link org.example.smalljava.smallJava.SJBoolConstant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.example.smalljava.smallJava.SJBoolConstant#getValue()
   * @see #getSJBoolConstant()
   * @generated
   */
  EAttribute getSJBoolConstant_Value();

  /**
   * Returns the meta object for class '{@link org.example.smalljava.smallJava.SJThis <em>SJ This</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SJ This</em>'.
   * @see org.example.smalljava.smallJava.SJThis
   * @generated
   */
  EClass getSJThis();

  /**
   * Returns the meta object for class '{@link org.example.smalljava.smallJava.SJSuper <em>SJ Super</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SJ Super</em>'.
   * @see org.example.smalljava.smallJava.SJSuper
   * @generated
   */
  EClass getSJSuper();

  /**
   * Returns the meta object for class '{@link org.example.smalljava.smallJava.SJNull <em>SJ Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SJ Null</em>'.
   * @see org.example.smalljava.smallJava.SJNull
   * @generated
   */
  EClass getSJNull();

  /**
   * Returns the meta object for class '{@link org.example.smalljava.smallJava.SJSymbolRef <em>SJ Symbol Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SJ Symbol Ref</em>'.
   * @see org.example.smalljava.smallJava.SJSymbolRef
   * @generated
   */
  EClass getSJSymbolRef();

  /**
   * Returns the meta object for the reference '{@link org.example.smalljava.smallJava.SJSymbolRef#getSymbol <em>Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Symbol</em>'.
   * @see org.example.smalljava.smallJava.SJSymbolRef#getSymbol()
   * @see #getSJSymbolRef()
   * @generated
   */
  EReference getSJSymbolRef_Symbol();

  /**
   * Returns the meta object for class '{@link org.example.smalljava.smallJava.SJNew <em>SJ New</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SJ New</em>'.
   * @see org.example.smalljava.smallJava.SJNew
   * @generated
   */
  EClass getSJNew();

  /**
   * Returns the meta object for the reference '{@link org.example.smalljava.smallJava.SJNew#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.example.smalljava.smallJava.SJNew#getType()
   * @see #getSJNew()
   * @generated
   */
  EReference getSJNew_Type();

  /**
   * Returns the meta object for enum '{@link org.example.smalljava.smallJava.SJAccessLevel <em>SJ Access Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>SJ Access Level</em>'.
   * @see org.example.smalljava.smallJava.SJAccessLevel
   * @generated
   */
  EEnum getSJAccessLevel();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SmallJavaFactory getSmallJavaFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.example.smalljava.smallJava.impl.SJProgramImpl <em>SJ Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.smalljava.smallJava.impl.SJProgramImpl
     * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJProgram()
     * @generated
     */
    EClass SJ_PROGRAM = eINSTANCE.getSJProgram();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SJ_PROGRAM__NAME = eINSTANCE.getSJProgram_Name();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SJ_PROGRAM__IMPORTS = eINSTANCE.getSJProgram_Imports();

    /**
     * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SJ_PROGRAM__CLASSES = eINSTANCE.getSJProgram_Classes();

    /**
     * The meta object literal for the '{@link org.example.smalljava.smallJava.impl.SJImportImpl <em>SJ Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.smalljava.smallJava.impl.SJImportImpl
     * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJImport()
     * @generated
     */
    EClass SJ_IMPORT = eINSTANCE.getSJImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SJ_IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getSJImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.example.smalljava.smallJava.impl.SJClassImpl <em>SJ Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.smalljava.smallJava.impl.SJClassImpl
     * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJClass()
     * @generated
     */
    EClass SJ_CLASS = eINSTANCE.getSJClass();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SJ_CLASS__NAME = eINSTANCE.getSJClass_Name();

    /**
     * The meta object literal for the '<em><b>Superclass</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SJ_CLASS__SUPERCLASS = eINSTANCE.getSJClass_Superclass();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SJ_CLASS__MEMBERS = eINSTANCE.getSJClass_Members();

    /**
     * The meta object literal for the '{@link org.example.smalljava.smallJava.impl.SJMemberImpl <em>SJ Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.smalljava.smallJava.impl.SJMemberImpl
     * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJMember()
     * @generated
     */
    EClass SJ_MEMBER = eINSTANCE.getSJMember();

    /**
     * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SJ_MEMBER__ACCESS = eINSTANCE.getSJMember_Access();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SJ_MEMBER__TYPE = eINSTANCE.getSJMember_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SJ_MEMBER__NAME = eINSTANCE.getSJMember_Name();

    /**
     * The meta object literal for the '{@link org.example.smalljava.smallJava.impl.SJFieldImpl <em>SJ Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.smalljava.smallJava.impl.SJFieldImpl
     * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJField()
     * @generated
     */
    EClass SJ_FIELD = eINSTANCE.getSJField();

    /**
     * The meta object literal for the '{@link org.example.smalljava.smallJava.impl.SJMethodImpl <em>SJ Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.smalljava.smallJava.impl.SJMethodImpl
     * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJMethod()
     * @generated
     */
    EClass SJ_METHOD = eINSTANCE.getSJMethod();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SJ_METHOD__PARAMS = eINSTANCE.getSJMethod_Params();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SJ_METHOD__BODY = eINSTANCE.getSJMethod_Body();

    /**
     * The meta object literal for the '{@link org.example.smalljava.smallJava.impl.SJParameterImpl <em>SJ Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.smalljava.smallJava.impl.SJParameterImpl
     * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJParameter()
     * @generated
     */
    EClass SJ_PARAMETER = eINSTANCE.getSJParameter();

    /**
     * The meta object literal for the '{@link org.example.smalljava.smallJava.impl.SJMethodBodyImpl <em>SJ Method Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.smalljava.smallJava.impl.SJMethodBodyImpl
     * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJMethodBody()
     * @generated
     */
    EClass SJ_METHOD_BODY = eINSTANCE.getSJMethodBody();

    /**
     * The meta object literal for the '{@link org.example.smalljava.smallJava.impl.SJStatementImpl <em>SJ Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.smalljava.smallJava.impl.SJStatementImpl
     * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJStatement()
     * @generated
     */
    EClass SJ_STATEMENT = eINSTANCE.getSJStatement();

    /**
     * The meta object literal for the '{@link org.example.smalljava.smallJava.impl.SJReturnImpl <em>SJ Return</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.smalljava.smallJava.impl.SJReturnImpl
     * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJReturn()
     * @generated
     */
    EClass SJ_RETURN = eINSTANCE.getSJReturn();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SJ_RETURN__EXPRESSION = eINSTANCE.getSJReturn_Expression();

    /**
     * The meta object literal for the '{@link org.example.smalljava.smallJava.impl.SJVariableDeclarationImpl <em>SJ Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.smalljava.smallJava.impl.SJVariableDeclarationImpl
     * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJVariableDeclaration()
     * @generated
     */
    EClass SJ_VARIABLE_DECLARATION = eINSTANCE.getSJVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SJ_VARIABLE_DECLARATION__EXPRESSION = eINSTANCE.getSJVariableDeclaration_Expression();

    /**
     * The meta object literal for the '{@link org.example.smalljava.smallJava.impl.SJIfStatementImpl <em>SJ If Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.smalljava.smallJava.impl.SJIfStatementImpl
     * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJIfStatement()
     * @generated
     */
    EClass SJ_IF_STATEMENT = eINSTANCE.getSJIfStatement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SJ_IF_STATEMENT__EXPRESSION = eINSTANCE.getSJIfStatement_Expression();

    /**
     * The meta object literal for the '<em><b>Then Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SJ_IF_STATEMENT__THEN_BLOCK = eINSTANCE.getSJIfStatement_ThenBlock();

    /**
     * The meta object literal for the '<em><b>Else Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SJ_IF_STATEMENT__ELSE_BLOCK = eINSTANCE.getSJIfStatement_ElseBlock();

    /**
     * The meta object literal for the '{@link org.example.smalljava.smallJava.impl.SJIfBlockImpl <em>SJ If Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.smalljava.smallJava.impl.SJIfBlockImpl
     * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJIfBlock()
     * @generated
     */
    EClass SJ_IF_BLOCK = eINSTANCE.getSJIfBlock();

    /**
     * The meta object literal for the '{@link org.example.smalljava.smallJava.impl.SJBlockImpl <em>SJ Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.smalljava.smallJava.impl.SJBlockImpl
     * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJBlock()
     * @generated
     */
    EClass SJ_BLOCK = eINSTANCE.getSJBlock();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SJ_BLOCK__STATEMENTS = eINSTANCE.getSJBlock_Statements();

    /**
     * The meta object literal for the '{@link org.example.smalljava.smallJava.impl.SJSymbolImpl <em>SJ Symbol</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.smalljava.smallJava.impl.SJSymbolImpl
     * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJSymbol()
     * @generated
     */
    EClass SJ_SYMBOL = eINSTANCE.getSJSymbol();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SJ_SYMBOL__TYPE = eINSTANCE.getSJSymbol_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SJ_SYMBOL__NAME = eINSTANCE.getSJSymbol_Name();

    /**
     * The meta object literal for the '{@link org.example.smalljava.smallJava.impl.SJExpressionImpl <em>SJ Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.smalljava.smallJava.impl.SJExpressionImpl
     * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJExpression()
     * @generated
     */
    EClass SJ_EXPRESSION = eINSTANCE.getSJExpression();

    /**
     * The meta object literal for the '{@link org.example.smalljava.smallJava.impl.SJAssignmentImpl <em>SJ Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.smalljava.smallJava.impl.SJAssignmentImpl
     * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJAssignment()
     * @generated
     */
    EClass SJ_ASSIGNMENT = eINSTANCE.getSJAssignment();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SJ_ASSIGNMENT__LEFT = eINSTANCE.getSJAssignment_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SJ_ASSIGNMENT__RIGHT = eINSTANCE.getSJAssignment_Right();

    /**
     * The meta object literal for the '{@link org.example.smalljava.smallJava.impl.SJMemberSelectionImpl <em>SJ Member Selection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.smalljava.smallJava.impl.SJMemberSelectionImpl
     * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJMemberSelection()
     * @generated
     */
    EClass SJ_MEMBER_SELECTION = eINSTANCE.getSJMemberSelection();

    /**
     * The meta object literal for the '<em><b>Receiver</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SJ_MEMBER_SELECTION__RECEIVER = eINSTANCE.getSJMemberSelection_Receiver();

    /**
     * The meta object literal for the '<em><b>Member</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SJ_MEMBER_SELECTION__MEMBER = eINSTANCE.getSJMemberSelection_Member();

    /**
     * The meta object literal for the '<em><b>Methodinvocation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SJ_MEMBER_SELECTION__METHODINVOCATION = eINSTANCE.getSJMemberSelection_Methodinvocation();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SJ_MEMBER_SELECTION__ARGS = eINSTANCE.getSJMemberSelection_Args();

    /**
     * The meta object literal for the '{@link org.example.smalljava.smallJava.impl.SJStringConstantImpl <em>SJ String Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.smalljava.smallJava.impl.SJStringConstantImpl
     * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJStringConstant()
     * @generated
     */
    EClass SJ_STRING_CONSTANT = eINSTANCE.getSJStringConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SJ_STRING_CONSTANT__VALUE = eINSTANCE.getSJStringConstant_Value();

    /**
     * The meta object literal for the '{@link org.example.smalljava.smallJava.impl.SJIntConstantImpl <em>SJ Int Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.smalljava.smallJava.impl.SJIntConstantImpl
     * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJIntConstant()
     * @generated
     */
    EClass SJ_INT_CONSTANT = eINSTANCE.getSJIntConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SJ_INT_CONSTANT__VALUE = eINSTANCE.getSJIntConstant_Value();

    /**
     * The meta object literal for the '{@link org.example.smalljava.smallJava.impl.SJBoolConstantImpl <em>SJ Bool Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.smalljava.smallJava.impl.SJBoolConstantImpl
     * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJBoolConstant()
     * @generated
     */
    EClass SJ_BOOL_CONSTANT = eINSTANCE.getSJBoolConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SJ_BOOL_CONSTANT__VALUE = eINSTANCE.getSJBoolConstant_Value();

    /**
     * The meta object literal for the '{@link org.example.smalljava.smallJava.impl.SJThisImpl <em>SJ This</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.smalljava.smallJava.impl.SJThisImpl
     * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJThis()
     * @generated
     */
    EClass SJ_THIS = eINSTANCE.getSJThis();

    /**
     * The meta object literal for the '{@link org.example.smalljava.smallJava.impl.SJSuperImpl <em>SJ Super</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.smalljava.smallJava.impl.SJSuperImpl
     * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJSuper()
     * @generated
     */
    EClass SJ_SUPER = eINSTANCE.getSJSuper();

    /**
     * The meta object literal for the '{@link org.example.smalljava.smallJava.impl.SJNullImpl <em>SJ Null</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.smalljava.smallJava.impl.SJNullImpl
     * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJNull()
     * @generated
     */
    EClass SJ_NULL = eINSTANCE.getSJNull();

    /**
     * The meta object literal for the '{@link org.example.smalljava.smallJava.impl.SJSymbolRefImpl <em>SJ Symbol Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.smalljava.smallJava.impl.SJSymbolRefImpl
     * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJSymbolRef()
     * @generated
     */
    EClass SJ_SYMBOL_REF = eINSTANCE.getSJSymbolRef();

    /**
     * The meta object literal for the '<em><b>Symbol</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SJ_SYMBOL_REF__SYMBOL = eINSTANCE.getSJSymbolRef_Symbol();

    /**
     * The meta object literal for the '{@link org.example.smalljava.smallJava.impl.SJNewImpl <em>SJ New</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.smalljava.smallJava.impl.SJNewImpl
     * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJNew()
     * @generated
     */
    EClass SJ_NEW = eINSTANCE.getSJNew();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SJ_NEW__TYPE = eINSTANCE.getSJNew_Type();

    /**
     * The meta object literal for the '{@link org.example.smalljava.smallJava.SJAccessLevel <em>SJ Access Level</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.smalljava.smallJava.SJAccessLevel
     * @see org.example.smalljava.smallJava.impl.SmallJavaPackageImpl#getSJAccessLevel()
     * @generated
     */
    EEnum SJ_ACCESS_LEVEL = eINSTANCE.getSJAccessLevel();

  }

} //SmallJavaPackage
