/**
 */
package fr.univcotedazur.l3ia.Tp_03_02_2022;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Factory
 * @model kind="package"
 * @generated
 */
public interface Tp_03_02_2022Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Tp_03_02_2022";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/Tp_03_02_2022";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Tp_03_02_2022";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Tp_03_02_2022Package eINSTANCE = fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.NamedElementImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ProgramImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__STATEMENT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Robot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__ROBOT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Referencetocolor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__REFERENCETOCOLOR = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__VARIABLE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.VariableImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__IS_CONST = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__INITIAL_VALUE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.StatementImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 2;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.LoopImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 3;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.WhileLoopImpl <em>While Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.WhileLoopImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getWhileLoop()
	 * @generated
	 */
	int WHILE_LOOP = 4;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_LOOP__EXPRESSION = LOOP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_LOOP__STATEMENT = LOOP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>While Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_LOOP_FEATURE_COUNT = LOOP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>While Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_LOOP_OPERATION_COUNT = LOOP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ExpressionImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 5;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.BinaryOperationImpl <em>Binary Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.BinaryOperationImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getBinaryOperation()
	 * @generated
	 */
	int BINARY_OPERATION = 7;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ReferenceImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 47;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.VariableRefImpl <em>Variable Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.VariableRefImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getVariableRef()
	 * @generated
	 */
	int VARIABLE_REF = 8;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF__VARIABLE = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.AssignmentImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 9;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__LEFT = BINARY_OPERATION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__RIGHT = BINARY_OPERATION__RIGHT;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATION_COUNT = BINARY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ComparisonImpl <em>Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ComparisonImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getComparison()
	 * @generated
	 */
	int COMPARISON = 10;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__LEFT = BINARY_OPERATION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__RIGHT = BINARY_OPERATION__RIGHT;

	/**
	 * The number of structural features of the '<em>Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_FEATURE_COUNT = BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATION_COUNT = BINARY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.SubstractionImpl <em>Substraction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.SubstractionImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getSubstraction()
	 * @generated
	 */
	int SUBSTRACTION = 11;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRACTION__LEFT = BINARY_OPERATION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRACTION__RIGHT = BINARY_OPERATION__RIGHT;

	/**
	 * The number of structural features of the '<em>Substraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRACTION_FEATURE_COUNT = BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Substraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRACTION_OPERATION_COUNT = BINARY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.GreaterThanImpl <em>Greater Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.GreaterThanImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getGreaterThan()
	 * @generated
	 */
	int GREATER_THAN = 12;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__LEFT = COMPARISON__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__RIGHT = COMPARISON__RIGHT;

	/**
	 * The number of structural features of the '<em>Greater Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_FEATURE_COUNT = COMPARISON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Greater Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OPERATION_COUNT = COMPARISON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.LowerThanImpl <em>Lower Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.LowerThanImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getLowerThan()
	 * @generated
	 */
	int LOWER_THAN = 13;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_THAN__LEFT = COMPARISON__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_THAN__RIGHT = COMPARISON__RIGHT;

	/**
	 * The number of structural features of the '<em>Lower Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_THAN_FEATURE_COUNT = COMPARISON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lower Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_THAN_OPERATION_COUNT = COMPARISON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.EqualImpl <em>Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.EqualImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getEqual()
	 * @generated
	 */
	int EQUAL = 14;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL__LEFT = COMPARISON__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL__RIGHT = COMPARISON__RIGHT;

	/**
	 * The number of structural features of the '<em>Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_FEATURE_COUNT = COMPARISON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_OPERATION_COUNT = COMPARISON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ForLoopImpl <em>For Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ForLoopImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getForLoop()
	 * @generated
	 */
	int FOR_LOOP = 15;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__EXPRESSION = LOOP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__STATEMENT = LOOP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>For Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP_FEATURE_COUNT = LOOP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>For Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP_OPERATION_COUNT = LOOP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.AdditionImpl <em>Addition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.AdditionImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getAddition()
	 * @generated
	 */
	int ADDITION = 16;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__LEFT = BINARY_OPERATION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__RIGHT = BINARY_OPERATION__RIGHT;

	/**
	 * The number of structural features of the '<em>Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_FEATURE_COUNT = BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_OPERATION_COUNT = BINARY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.MultiplicationImpl <em>Multiplication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.MultiplicationImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getMultiplication()
	 * @generated
	 */
	int MULTIPLICATION = 17;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__LEFT = BINARY_OPERATION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__RIGHT = BINARY_OPERATION__RIGHT;

	/**
	 * The number of structural features of the '<em>Multiplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION_FEATURE_COUNT = BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multiplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION_OPERATION_COUNT = BINARY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.DivisionImpl <em>Division</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.DivisionImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getDivision()
	 * @generated
	 */
	int DIVISION = 18;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__LEFT = BINARY_OPERATION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__RIGHT = BINARY_OPERATION__RIGHT;

	/**
	 * The number of structural features of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_FEATURE_COUNT = BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_OPERATION_COUNT = BINARY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.RobotImpl <em>Robot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.RobotImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getRobot()
	 * @generated
	 */
	int ROBOT = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Moteur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__MOTEUR = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__SENSOR = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.MoteurImpl <em>Moteur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.MoteurImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getMoteur()
	 * @generated
	 */
	int MOTEUR = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTEUR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Initial Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTEUR__INITIAL_SPEED = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTEUR__PORT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Moteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTEUR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Moteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTEUR_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.LeftMotorImpl <em>Left Motor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.LeftMotorImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getLeftMotor()
	 * @generated
	 */
	int LEFT_MOTOR = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_MOTOR__NAME = MOTEUR__NAME;

	/**
	 * The feature id for the '<em><b>Initial Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_MOTOR__INITIAL_SPEED = MOTEUR__INITIAL_SPEED;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_MOTOR__PORT = MOTEUR__PORT;

	/**
	 * The number of structural features of the '<em>Left Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_MOTOR_FEATURE_COUNT = MOTEUR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Left Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_MOTOR_OPERATION_COUNT = MOTEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.RightMotorImpl <em>Right Motor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.RightMotorImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getRightMotor()
	 * @generated
	 */
	int RIGHT_MOTOR = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_MOTOR__NAME = MOTEUR__NAME;

	/**
	 * The feature id for the '<em><b>Initial Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_MOTOR__INITIAL_SPEED = MOTEUR__INITIAL_SPEED;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_MOTOR__PORT = MOTEUR__PORT;

	/**
	 * The number of structural features of the '<em>Right Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_MOTOR_FEATURE_COUNT = MOTEUR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Right Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_MOTOR_OPERATION_COUNT = MOTEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.SensorImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sensor Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__SENSOR_PORT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ColorSensorImpl <em>Color Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ColorSensorImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getColorSensor()
	 * @generated
	 */
	int COLOR_SENSOR = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Sensor Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SENSOR__SENSOR_PORT = SENSOR__SENSOR_PORT;

	/**
	 * The number of structural features of the '<em>Color Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Color Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.PositionSensorImpl <em>Position Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.PositionSensorImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getPositionSensor()
	 * @generated
	 */
	int POSITION_SENSOR = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Sensor Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR__SENSOR_PORT = SENSOR__SENSOR_PORT;

	/**
	 * The number of structural features of the '<em>Position Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Position Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ActionsImpl <em>Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ActionsImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getActions()
	 * @generated
	 */
	int ACTIONS = 26;

	/**
	 * The feature id for the '<em><b>Moteur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS__MOTEUR = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS__ANGLE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS__SPEED = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS__DURATION = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.AccelerateImpl <em>Accelerate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.AccelerateImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getAccelerate()
	 * @generated
	 */
	int ACCELERATE = 27;

	/**
	 * The feature id for the '<em><b>Moteur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATE__MOTEUR = ACTIONS__MOTEUR;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATE__ANGLE = ACTIONS__ANGLE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATE__SPEED = ACTIONS__SPEED;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATE__DURATION = ACTIONS__DURATION;

	/**
	 * The number of structural features of the '<em>Accelerate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATE_FEATURE_COUNT = ACTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Accelerate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATE_OPERATION_COUNT = ACTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.IntensitySensorImpl <em>Intensity Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.IntensitySensorImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getIntensitySensor()
	 * @generated
	 */
	int INTENSITY_SENSOR = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENSITY_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Sensor Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENSITY_SENSOR__SENSOR_PORT = SENSOR__SENSOR_PORT;

	/**
	 * The number of structural features of the '<em>Intensity Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENSITY_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Intensity Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENSITY_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.StopImpl <em>Stop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.StopImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getStop()
	 * @generated
	 */
	int STOP = 29;

	/**
	 * The feature id for the '<em><b>Moteur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__MOTEUR = ACTIONS__MOTEUR;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__ANGLE = ACTIONS__ANGLE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__SPEED = ACTIONS__SPEED;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__DURATION = ACTIONS__DURATION;

	/**
	 * The number of structural features of the '<em>Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_FEATURE_COUNT = ACTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_OPERATION_COUNT = ACTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.RotateImpl <em>Rotate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.RotateImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getRotate()
	 * @generated
	 */
	int ROTATE = 30;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.TurnOnImpl <em>Turn On</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.TurnOnImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getTurnOn()
	 * @generated
	 */
	int TURN_ON = 31;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.LightSensorImpl <em>Light Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.LightSensorImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getLightSensor()
	 * @generated
	 */
	int LIGHT_SENSOR = 32;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.InfraredSensorImpl <em>Infrared Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.InfraredSensorImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getInfraredSensor()
	 * @generated
	 */
	int INFRARED_SENSOR = 33;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.GyroSensorImpl <em>Gyro Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.GyroSensorImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getGyroSensor()
	 * @generated
	 */
	int GYRO_SENSOR = 34;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.GPSSensorImpl <em>GPS Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.GPSSensorImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getGPSSensor()
	 * @generated
	 */
	int GPS_SENSOR = 35;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.UltrasonicSensorImpl <em>Ultrasonic Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.UltrasonicSensorImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getUltrasonicSensor()
	 * @generated
	 */
	int ULTRASONIC_SENSOR = 36;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.MultipleMotorActionsImpl <em>Multiple Motor Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.MultipleMotorActionsImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getMultipleMotorActions()
	 * @generated
	 */
	int MULTIPLE_MOTOR_ACTIONS = 37;

	/**
	 * The feature id for the '<em><b>Leftmotor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_MOTOR_ACTIONS__LEFTMOTOR = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rightmotor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_MOTOR_ACTIONS__RIGHTMOTOR = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_MOTOR_ACTIONS__ANGLE = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_MOTOR_ACTIONS__SPEED = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_MOTOR_ACTIONS__DURATION = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Multiple Motor Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_MOTOR_ACTIONS_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Multiple Motor Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_MOTOR_ACTIONS_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Leftmotor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__LEFTMOTOR = MULTIPLE_MOTOR_ACTIONS__LEFTMOTOR;

	/**
	 * The feature id for the '<em><b>Rightmotor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__RIGHTMOTOR = MULTIPLE_MOTOR_ACTIONS__RIGHTMOTOR;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__ANGLE = MULTIPLE_MOTOR_ACTIONS__ANGLE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__SPEED = MULTIPLE_MOTOR_ACTIONS__SPEED;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__DURATION = MULTIPLE_MOTOR_ACTIONS__DURATION;

	/**
	 * The number of structural features of the '<em>Rotate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_FEATURE_COUNT = MULTIPLE_MOTOR_ACTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rotate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_OPERATION_COUNT = MULTIPLE_MOTOR_ACTIONS_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Moteur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_ON__MOTEUR = ACTIONS__MOTEUR;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_ON__ANGLE = ACTIONS__ANGLE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_ON__SPEED = ACTIONS__SPEED;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_ON__DURATION = ACTIONS__DURATION;

	/**
	 * The number of structural features of the '<em>Turn On</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_ON_FEATURE_COUNT = ACTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Turn On</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_ON_OPERATION_COUNT = ACTIONS_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Sensor Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SENSOR__SENSOR_PORT = SENSOR__SENSOR_PORT;

	/**
	 * The number of structural features of the '<em>Light Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Light Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRARED_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Sensor Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRARED_SENSOR__SENSOR_PORT = SENSOR__SENSOR_PORT;

	/**
	 * The number of structural features of the '<em>Infrared Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRARED_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Infrared Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRARED_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GYRO_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Sensor Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GYRO_SENSOR__SENSOR_PORT = SENSOR__SENSOR_PORT;

	/**
	 * The number of structural features of the '<em>Gyro Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GYRO_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gyro Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GYRO_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Sensor Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_SENSOR__SENSOR_PORT = SENSOR__SENSOR_PORT;

	/**
	 * The number of structural features of the '<em>GPS Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GPS Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRASONIC_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Sensor Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRASONIC_SENSOR__SENSOR_PORT = SENSOR__SENSOR_PORT;

	/**
	 * The number of structural features of the '<em>Ultrasonic Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRASONIC_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ultrasonic Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRASONIC_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.MoveImpl <em>Move</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.MoveImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getMove()
	 * @generated
	 */
	int MOVE = 38;

	/**
	 * The feature id for the '<em><b>Leftmotor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__LEFTMOTOR = MULTIPLE_MOTOR_ACTIONS__LEFTMOTOR;

	/**
	 * The feature id for the '<em><b>Rightmotor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__RIGHTMOTOR = MULTIPLE_MOTOR_ACTIONS__RIGHTMOTOR;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__ANGLE = MULTIPLE_MOTOR_ACTIONS__ANGLE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__SPEED = MULTIPLE_MOTOR_ACTIONS__SPEED;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__DURATION = MULTIPLE_MOTOR_ACTIONS__DURATION;

	/**
	 * The number of structural features of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FEATURE_COUNT = MULTIPLE_MOTOR_ACTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_OPERATION_COUNT = MULTIPLE_MOTOR_ACTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.LeftRotationImpl <em>Left Rotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.LeftRotationImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getLeftRotation()
	 * @generated
	 */
	int LEFT_ROTATION = 39;

	/**
	 * The feature id for the '<em><b>Leftmotor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_ROTATION__LEFTMOTOR = ROTATE__LEFTMOTOR;

	/**
	 * The feature id for the '<em><b>Rightmotor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_ROTATION__RIGHTMOTOR = ROTATE__RIGHTMOTOR;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_ROTATION__ANGLE = ROTATE__ANGLE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_ROTATION__SPEED = ROTATE__SPEED;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_ROTATION__DURATION = ROTATE__DURATION;

	/**
	 * The number of structural features of the '<em>Left Rotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_ROTATION_FEATURE_COUNT = ROTATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Left Rotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_ROTATION_OPERATION_COUNT = ROTATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.RightRotationImpl <em>Right Rotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.RightRotationImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getRightRotation()
	 * @generated
	 */
	int RIGHT_ROTATION = 40;

	/**
	 * The feature id for the '<em><b>Leftmotor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_ROTATION__LEFTMOTOR = ROTATE__LEFTMOTOR;

	/**
	 * The feature id for the '<em><b>Rightmotor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_ROTATION__RIGHTMOTOR = ROTATE__RIGHTMOTOR;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_ROTATION__ANGLE = ROTATE__ANGLE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_ROTATION__SPEED = ROTATE__SPEED;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_ROTATION__DURATION = ROTATE__DURATION;

	/**
	 * The number of structural features of the '<em>Right Rotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_ROTATION_FEATURE_COUNT = ROTATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Right Rotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_ROTATION_OPERATION_COUNT = ROTATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ConditionnalImpl <em>Conditionnal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ConditionnalImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getConditionnal()
	 * @generated
	 */
	int CONDITIONNAL = 41;

	/**
	 * The number of structural features of the '<em>Conditionnal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONNAL_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Conditionnal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONNAL_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.IfConditionImpl <em>If Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.IfConditionImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getIfCondition()
	 * @generated
	 */
	int IF_CONDITION = 42;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_CONDITION__STATEMENT = CONDITIONNAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_CONDITION__EXPRESSION = CONDITIONNAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>If Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_CONDITION_FEATURE_COUNT = CONDITIONNAL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>If Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_CONDITION_OPERATION_COUNT = CONDITIONNAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.VarIntImpl <em>Var Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.VarIntImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getVarInt()
	 * @generated
	 */
	int VAR_INT = 43;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_INT__INITIAL_VALUE = 0;

	/**
	 * The number of structural features of the '<em>Var Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_INT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Var Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_INT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.VarrStringImpl <em>Varr String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.VarrStringImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getVarrString()
	 * @generated
	 */
	int VARR_STRING = 44;

	/**
	 * The number of structural features of the '<em>Varr String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARR_STRING_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Varr String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARR_STRING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ReferenceToColorImpl <em>Reference To Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ReferenceToColorImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getReferenceToColor()
	 * @generated
	 */
	int REFERENCE_TO_COLOR = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TO_COLOR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Colorsensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TO_COLOR__COLORSENSOR = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference To Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TO_COLOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reference To Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TO_COLOR_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ColorRefImpl <em>Color Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ColorRefImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getColorRef()
	 * @generated
	 */
	int COLOR_REF = 46;

	/**
	 * The feature id for the '<em><b>Referencetocolor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_REF__REFERENCETOCOLOR = 0;

	/**
	 * The number of structural features of the '<em>Color Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_REF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Color Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ConditionMotorImpl <em>Condition Motor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ConditionMotorImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getConditionMotor()
	 * @generated
	 */
	int CONDITION_MOTOR = 48;

	/**
	 * The number of structural features of the '<em>Condition Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_MOTOR_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Condition Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_MOTOR_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.IfMotorImpl <em>If Motor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.IfMotorImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getIfMotor()
	 * @generated
	 */
	int IF_MOTOR = 49;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_MOTOR__STATEMENT = CONDITION_MOTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bool M</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_MOTOR__BOOL_M = CONDITION_MOTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Elsemotor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_MOTOR__ELSEMOTOR = CONDITION_MOTOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_MOTOR_FEATURE_COUNT = CONDITION_MOTOR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>If Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_MOTOR_OPERATION_COUNT = CONDITION_MOTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.BooleanOperationsOnMotorsImpl <em>Boolean Operations On Motors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.BooleanOperationsOnMotorsImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getBooleanOperationsOnMotors()
	 * @generated
	 */
	int BOOLEAN_OPERATIONS_ON_MOTORS = 50;

	/**
	 * The feature id for the '<em><b>Left C</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATIONS_ON_MOTORS__LEFT_C = 0;

	/**
	 * The feature id for the '<em><b>Right C</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATIONS_ON_MOTORS__RIGHT_C = 1;

	/**
	 * The number of structural features of the '<em>Boolean Operations On Motors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATIONS_ON_MOTORS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Boolean Operations On Motors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATIONS_ON_MOTORS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.EqualMImpl <em>Equal M</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.EqualMImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getEqualM()
	 * @generated
	 */
	int EQUAL_M = 51;

	/**
	 * The feature id for the '<em><b>Left C</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_M__LEFT_C = BOOLEAN_OPERATIONS_ON_MOTORS__LEFT_C;

	/**
	 * The feature id for the '<em><b>Right C</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_M__RIGHT_C = BOOLEAN_OPERATIONS_ON_MOTORS__RIGHT_C;

	/**
	 * The number of structural features of the '<em>Equal M</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_M_FEATURE_COUNT = BOOLEAN_OPERATIONS_ON_MOTORS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Equal M</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_M_OPERATION_COUNT = BOOLEAN_OPERATIONS_ON_MOTORS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.GreatherThanMImpl <em>Greather Than M</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.GreatherThanMImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getGreatherThanM()
	 * @generated
	 */
	int GREATHER_THAN_M = 52;

	/**
	 * The feature id for the '<em><b>Left C</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATHER_THAN_M__LEFT_C = BOOLEAN_OPERATIONS_ON_MOTORS__LEFT_C;

	/**
	 * The feature id for the '<em><b>Right C</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATHER_THAN_M__RIGHT_C = BOOLEAN_OPERATIONS_ON_MOTORS__RIGHT_C;

	/**
	 * The number of structural features of the '<em>Greather Than M</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATHER_THAN_M_FEATURE_COUNT = BOOLEAN_OPERATIONS_ON_MOTORS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Greather Than M</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATHER_THAN_M_OPERATION_COUNT = BOOLEAN_OPERATIONS_ON_MOTORS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ElseMotorImpl <em>Else Motor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ElseMotorImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getElseMotor()
	 * @generated
	 */
	int ELSE_MOTOR = 53;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_MOTOR__STATEMENT = CONDITION_MOTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Else Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_MOTOR_FEATURE_COUNT = CONDITION_MOTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Else Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_MOTOR_OPERATION_COUNT = CONDITION_MOTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.SetThankImpl <em>Set Thank</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.SetThankImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getSetThank()
	 * @generated
	 */
	int SET_THANK = 54;

	/**
	 * The feature id for the '<em><b>Leftmotor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_THANK__LEFTMOTOR = MULTIPLE_MOTOR_ACTIONS__LEFTMOTOR;

	/**
	 * The feature id for the '<em><b>Rightmotor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_THANK__RIGHTMOTOR = MULTIPLE_MOTOR_ACTIONS__RIGHTMOTOR;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_THANK__ANGLE = MULTIPLE_MOTOR_ACTIONS__ANGLE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_THANK__SPEED = MULTIPLE_MOTOR_ACTIONS__SPEED;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_THANK__DURATION = MULTIPLE_MOTOR_ACTIONS__DURATION;

	/**
	 * The number of structural features of the '<em>Set Thank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_THANK_FEATURE_COUNT = MULTIPLE_MOTOR_ACTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Set Thank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_THANK_OPERATION_COUNT = MULTIPLE_MOTOR_ACTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.MoveLeftImpl <em>Move Left</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.MoveLeftImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getMoveLeft()
	 * @generated
	 */
	int MOVE_LEFT = 55;

	/**
	 * The feature id for the '<em><b>Leftmotor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_LEFT__LEFTMOTOR = MULTIPLE_MOTOR_ACTIONS__LEFTMOTOR;

	/**
	 * The feature id for the '<em><b>Rightmotor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_LEFT__RIGHTMOTOR = MULTIPLE_MOTOR_ACTIONS__RIGHTMOTOR;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_LEFT__ANGLE = MULTIPLE_MOTOR_ACTIONS__ANGLE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_LEFT__SPEED = MULTIPLE_MOTOR_ACTIONS__SPEED;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_LEFT__DURATION = MULTIPLE_MOTOR_ACTIONS__DURATION;

	/**
	 * The number of structural features of the '<em>Move Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_LEFT_FEATURE_COUNT = MULTIPLE_MOTOR_ACTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Move Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_LEFT_OPERATION_COUNT = MULTIPLE_MOTOR_ACTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.OnForRotationImpl <em>On For Rotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.OnForRotationImpl
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getOnForRotation()
	 * @generated
	 */
	int ON_FOR_ROTATION = 56;

	/**
	 * The feature id for the '<em><b>Moteur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_FOR_ROTATION__MOTEUR = ACTIONS__MOTEUR;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_FOR_ROTATION__ANGLE = ACTIONS__ANGLE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_FOR_ROTATION__SPEED = ACTIONS__SPEED;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_FOR_ROTATION__DURATION = ACTIONS__DURATION;

	/**
	 * The number of structural features of the '<em>On For Rotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_FOR_ROTATION_FEATURE_COUNT = ACTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>On For Rotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_FOR_ROTATION_OPERATION_COUNT = ACTIONS_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Program#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Program#getVariable()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Variable();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Program#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Program#getStatement()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Statement();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Program#getRobot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Robot</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Program#getRobot()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Robot();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Program#getReferencetocolor <em>Referencetocolor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Referencetocolor</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Program#getReferencetocolor()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Referencetocolor();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Variable#isIsConst <em>Is Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Const</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Variable#isIsConst()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_IsConst();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Variable#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Variable#getInitialValue()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_InitialValue();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.WhileLoop <em>While Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While Loop</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.WhileLoop
	 * @generated
	 */
	EClass getWhileLoop();

	/**
	 * Returns the meta object for the containment reference '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.WhileLoop#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.WhileLoop#getExpression()
	 * @see #getWhileLoop()
	 * @generated
	 */
	EReference getWhileLoop_Expression();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.WhileLoop#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.WhileLoop#getStatement()
	 * @see #getWhileLoop()
	 * @generated
	 */
	EReference getWhileLoop_Statement();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.BinaryOperation <em>Binary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Operation</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.BinaryOperation
	 * @generated
	 */
	EClass getBinaryOperation();

	/**
	 * Returns the meta object for the containment reference '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.BinaryOperation#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.BinaryOperation#getLeft()
	 * @see #getBinaryOperation()
	 * @generated
	 */
	EReference getBinaryOperation_Left();

	/**
	 * Returns the meta object for the containment reference '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.BinaryOperation#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.BinaryOperation#getRight()
	 * @see #getBinaryOperation()
	 * @generated
	 */
	EReference getBinaryOperation_Right();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.VariableRef <em>Variable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Ref</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.VariableRef
	 * @generated
	 */
	EClass getVariableRef();

	/**
	 * Returns the meta object for the reference '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.VariableRef#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.VariableRef#getVariable()
	 * @see #getVariableRef()
	 * @generated
	 */
	EReference getVariableRef_Variable();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Comparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Comparison
	 * @generated
	 */
	EClass getComparison();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Substraction <em>Substraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substraction</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Substraction
	 * @generated
	 */
	EClass getSubstraction();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.GreaterThan <em>Greater Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.GreaterThan
	 * @generated
	 */
	EClass getGreaterThan();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.LowerThan <em>Lower Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lower Than</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.LowerThan
	 * @generated
	 */
	EClass getLowerThan();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Equal <em>Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equal</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Equal
	 * @generated
	 */
	EClass getEqual();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.ForLoop <em>For Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Loop</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.ForLoop
	 * @generated
	 */
	EClass getForLoop();

	/**
	 * Returns the meta object for the containment reference '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.ForLoop#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.ForLoop#getExpression()
	 * @see #getForLoop()
	 * @generated
	 */
	EReference getForLoop_Expression();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.ForLoop#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.ForLoop#getStatement()
	 * @see #getForLoop()
	 * @generated
	 */
	EReference getForLoop_Statement();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Addition <em>Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addition</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Addition
	 * @generated
	 */
	EClass getAddition();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Multiplication <em>Multiplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplication</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Multiplication
	 * @generated
	 */
	EClass getMultiplication();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Division</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Division
	 * @generated
	 */
	EClass getDivision();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Robot
	 * @generated
	 */
	EClass getRobot();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Robot#getMoteur <em>Moteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Moteur</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Robot#getMoteur()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_Moteur();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Robot#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensor</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Robot#getSensor()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_Sensor();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Moteur <em>Moteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Moteur</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Moteur
	 * @generated
	 */
	EClass getMoteur();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Moteur#getInitialSpeed <em>Initial Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Speed</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Moteur#getInitialSpeed()
	 * @see #getMoteur()
	 * @generated
	 */
	EAttribute getMoteur_InitialSpeed();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Moteur#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Moteur#getPort()
	 * @see #getMoteur()
	 * @generated
	 */
	EAttribute getMoteur_Port();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.LeftMotor <em>Left Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left Motor</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.LeftMotor
	 * @generated
	 */
	EClass getLeftMotor();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.RightMotor <em>Right Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right Motor</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.RightMotor
	 * @generated
	 */
	EClass getRightMotor();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Sensor#getSensorPort <em>Sensor Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensor Port</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Sensor#getSensorPort()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_SensorPort();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.ColorSensor <em>Color Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Sensor</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.ColorSensor
	 * @generated
	 */
	EClass getColorSensor();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.PositionSensor <em>Position Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position Sensor</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.PositionSensor
	 * @generated
	 */
	EClass getPositionSensor();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Actions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actions</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Actions
	 * @generated
	 */
	EClass getActions();

	/**
	 * Returns the meta object for the reference '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Actions#getMoteur <em>Moteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Moteur</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Actions#getMoteur()
	 * @see #getActions()
	 * @generated
	 */
	EReference getActions_Moteur();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Actions#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Actions#getAngle()
	 * @see #getActions()
	 * @generated
	 */
	EAttribute getActions_Angle();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Actions#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Actions#getSpeed()
	 * @see #getActions()
	 * @generated
	 */
	EAttribute getActions_Speed();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Actions#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Actions#getDuration()
	 * @see #getActions()
	 * @generated
	 */
	EAttribute getActions_Duration();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Accelerate <em>Accelerate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accelerate</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Accelerate
	 * @generated
	 */
	EClass getAccelerate();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.IntensitySensor <em>Intensity Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intensity Sensor</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.IntensitySensor
	 * @generated
	 */
	EClass getIntensitySensor();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Stop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Stop
	 * @generated
	 */
	EClass getStop();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Rotate <em>Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotate</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Rotate
	 * @generated
	 */
	EClass getRotate();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.TurnOn <em>Turn On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn On</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.TurnOn
	 * @generated
	 */
	EClass getTurnOn();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.LightSensor <em>Light Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Light Sensor</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.LightSensor
	 * @generated
	 */
	EClass getLightSensor();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.InfraredSensor <em>Infrared Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrared Sensor</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.InfraredSensor
	 * @generated
	 */
	EClass getInfraredSensor();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.GyroSensor <em>Gyro Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gyro Sensor</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.GyroSensor
	 * @generated
	 */
	EClass getGyroSensor();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.GPSSensor <em>GPS Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPS Sensor</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.GPSSensor
	 * @generated
	 */
	EClass getGPSSensor();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.UltrasonicSensor <em>Ultrasonic Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ultrasonic Sensor</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.UltrasonicSensor
	 * @generated
	 */
	EClass getUltrasonicSensor();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.MultipleMotorActions <em>Multiple Motor Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Motor Actions</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.MultipleMotorActions
	 * @generated
	 */
	EClass getMultipleMotorActions();

	/**
	 * Returns the meta object for the reference '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.MultipleMotorActions#getLeftmotor <em>Leftmotor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Leftmotor</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.MultipleMotorActions#getLeftmotor()
	 * @see #getMultipleMotorActions()
	 * @generated
	 */
	EReference getMultipleMotorActions_Leftmotor();

	/**
	 * Returns the meta object for the reference '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.MultipleMotorActions#getRightmotor <em>Rightmotor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rightmotor</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.MultipleMotorActions#getRightmotor()
	 * @see #getMultipleMotorActions()
	 * @generated
	 */
	EReference getMultipleMotorActions_Rightmotor();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.MultipleMotorActions#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.MultipleMotorActions#getAngle()
	 * @see #getMultipleMotorActions()
	 * @generated
	 */
	EAttribute getMultipleMotorActions_Angle();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.MultipleMotorActions#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.MultipleMotorActions#getSpeed()
	 * @see #getMultipleMotorActions()
	 * @generated
	 */
	EAttribute getMultipleMotorActions_Speed();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.MultipleMotorActions#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.MultipleMotorActions#getDuration()
	 * @see #getMultipleMotorActions()
	 * @generated
	 */
	EAttribute getMultipleMotorActions_Duration();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Move
	 * @generated
	 */
	EClass getMove();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.LeftRotation <em>Left Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left Rotation</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.LeftRotation
	 * @generated
	 */
	EClass getLeftRotation();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.RightRotation <em>Right Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right Rotation</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.RightRotation
	 * @generated
	 */
	EClass getRightRotation();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Conditionnal <em>Conditionnal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditionnal</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Conditionnal
	 * @generated
	 */
	EClass getConditionnal();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.IfCondition <em>If Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Condition</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.IfCondition
	 * @generated
	 */
	EClass getIfCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.IfCondition#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.IfCondition#getStatement()
	 * @see #getIfCondition()
	 * @generated
	 */
	EReference getIfCondition_Statement();

	/**
	 * Returns the meta object for the containment reference '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.IfCondition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.IfCondition#getExpression()
	 * @see #getIfCondition()
	 * @generated
	 */
	EReference getIfCondition_Expression();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.VarInt <em>Var Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Int</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.VarInt
	 * @generated
	 */
	EClass getVarInt();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.VarInt#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.VarInt#getInitialValue()
	 * @see #getVarInt()
	 * @generated
	 */
	EAttribute getVarInt_InitialValue();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.VarrString <em>Varr String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Varr String</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.VarrString
	 * @generated
	 */
	EClass getVarrString();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.ReferenceToColor <em>Reference To Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference To Color</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.ReferenceToColor
	 * @generated
	 */
	EClass getReferenceToColor();

	/**
	 * Returns the meta object for the reference '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.ReferenceToColor#getColorsensor <em>Colorsensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Colorsensor</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.ReferenceToColor#getColorsensor()
	 * @see #getReferenceToColor()
	 * @generated
	 */
	EReference getReferenceToColor_Colorsensor();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.ColorRef <em>Color Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Ref</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.ColorRef
	 * @generated
	 */
	EClass getColorRef();

	/**
	 * Returns the meta object for the reference '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.ColorRef#getReferencetocolor <em>Referencetocolor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referencetocolor</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.ColorRef#getReferencetocolor()
	 * @see #getColorRef()
	 * @generated
	 */
	EReference getColorRef_Referencetocolor();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.ConditionMotor <em>Condition Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Motor</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.ConditionMotor
	 * @generated
	 */
	EClass getConditionMotor();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.IfMotor <em>If Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Motor</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.IfMotor
	 * @generated
	 */
	EClass getIfMotor();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.IfMotor#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.IfMotor#getStatement()
	 * @see #getIfMotor()
	 * @generated
	 */
	EReference getIfMotor_Statement();

	/**
	 * Returns the meta object for the containment reference '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.IfMotor#getBoolM <em>Bool M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bool M</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.IfMotor#getBoolM()
	 * @see #getIfMotor()
	 * @generated
	 */
	EReference getIfMotor_BoolM();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.IfMotor#getElsemotor <em>Elsemotor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elsemotor</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.IfMotor#getElsemotor()
	 * @see #getIfMotor()
	 * @generated
	 */
	EReference getIfMotor_Elsemotor();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.BooleanOperationsOnMotors <em>Boolean Operations On Motors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Operations On Motors</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.BooleanOperationsOnMotors
	 * @generated
	 */
	EClass getBooleanOperationsOnMotors();

	/**
	 * Returns the meta object for the containment reference '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.BooleanOperationsOnMotors#getLeftC <em>Left C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left C</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.BooleanOperationsOnMotors#getLeftC()
	 * @see #getBooleanOperationsOnMotors()
	 * @generated
	 */
	EReference getBooleanOperationsOnMotors_LeftC();

	/**
	 * Returns the meta object for the containment reference '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.BooleanOperationsOnMotors#getRightC <em>Right C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right C</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.BooleanOperationsOnMotors#getRightC()
	 * @see #getBooleanOperationsOnMotors()
	 * @generated
	 */
	EReference getBooleanOperationsOnMotors_RightC();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.EqualM <em>Equal M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equal M</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.EqualM
	 * @generated
	 */
	EClass getEqualM();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.GreatherThanM <em>Greather Than M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greather Than M</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.GreatherThanM
	 * @generated
	 */
	EClass getGreatherThanM();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.ElseMotor <em>Else Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Else Motor</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.ElseMotor
	 * @generated
	 */
	EClass getElseMotor();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.ElseMotor#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.ElseMotor#getStatement()
	 * @see #getElseMotor()
	 * @generated
	 */
	EReference getElseMotor_Statement();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.SetThank <em>Set Thank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Thank</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.SetThank
	 * @generated
	 */
	EClass getSetThank();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.MoveLeft <em>Move Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Left</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.MoveLeft
	 * @generated
	 */
	EClass getMoveLeft();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.OnForRotation <em>On For Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On For Rotation</em>'.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.OnForRotation
	 * @generated
	 */
	EClass getOnForRotation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Tp_03_02_2022Factory getTp_03_02_2022Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ProgramImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__VARIABLE = eINSTANCE.getProgram_Variable();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__STATEMENT = eINSTANCE.getProgram_Statement();

		/**
		 * The meta object literal for the '<em><b>Robot</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__ROBOT = eINSTANCE.getProgram_Robot();

		/**
		 * The meta object literal for the '<em><b>Referencetocolor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__REFERENCETOCOLOR = eINSTANCE.getProgram_Referencetocolor();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.VariableImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Is Const</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__IS_CONST = eINSTANCE.getVariable_IsConst();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__INITIAL_VALUE = eINSTANCE.getVariable_InitialValue();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.StatementImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.LoopImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.WhileLoopImpl <em>While Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.WhileLoopImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getWhileLoop()
		 * @generated
		 */
		EClass WHILE_LOOP = eINSTANCE.getWhileLoop();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_LOOP__EXPRESSION = eINSTANCE.getWhileLoop_Expression();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_LOOP__STATEMENT = eINSTANCE.getWhileLoop_Statement();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ExpressionImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.NamedElementImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.BinaryOperationImpl <em>Binary Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.BinaryOperationImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getBinaryOperation()
		 * @generated
		 */
		EClass BINARY_OPERATION = eINSTANCE.getBinaryOperation();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATION__LEFT = eINSTANCE.getBinaryOperation_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATION__RIGHT = eINSTANCE.getBinaryOperation_Right();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.VariableRefImpl <em>Variable Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.VariableRefImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getVariableRef()
		 * @generated
		 */
		EClass VARIABLE_REF = eINSTANCE.getVariableRef();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_REF__VARIABLE = eINSTANCE.getVariableRef_Variable();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.AssignmentImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ComparisonImpl <em>Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ComparisonImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getComparison()
		 * @generated
		 */
		EClass COMPARISON = eINSTANCE.getComparison();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.SubstractionImpl <em>Substraction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.SubstractionImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getSubstraction()
		 * @generated
		 */
		EClass SUBSTRACTION = eINSTANCE.getSubstraction();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.GreaterThanImpl <em>Greater Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.GreaterThanImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getGreaterThan()
		 * @generated
		 */
		EClass GREATER_THAN = eINSTANCE.getGreaterThan();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.LowerThanImpl <em>Lower Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.LowerThanImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getLowerThan()
		 * @generated
		 */
		EClass LOWER_THAN = eINSTANCE.getLowerThan();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.EqualImpl <em>Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.EqualImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getEqual()
		 * @generated
		 */
		EClass EQUAL = eINSTANCE.getEqual();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ForLoopImpl <em>For Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ForLoopImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getForLoop()
		 * @generated
		 */
		EClass FOR_LOOP = eINSTANCE.getForLoop();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_LOOP__EXPRESSION = eINSTANCE.getForLoop_Expression();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_LOOP__STATEMENT = eINSTANCE.getForLoop_Statement();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.AdditionImpl <em>Addition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.AdditionImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getAddition()
		 * @generated
		 */
		EClass ADDITION = eINSTANCE.getAddition();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.MultiplicationImpl <em>Multiplication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.MultiplicationImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getMultiplication()
		 * @generated
		 */
		EClass MULTIPLICATION = eINSTANCE.getMultiplication();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.DivisionImpl <em>Division</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.DivisionImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getDivision()
		 * @generated
		 */
		EClass DIVISION = eINSTANCE.getDivision();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.RobotImpl <em>Robot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.RobotImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getRobot()
		 * @generated
		 */
		EClass ROBOT = eINSTANCE.getRobot();

		/**
		 * The meta object literal for the '<em><b>Moteur</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__MOTEUR = eINSTANCE.getRobot_Moteur();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__SENSOR = eINSTANCE.getRobot_Sensor();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.MoteurImpl <em>Moteur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.MoteurImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getMoteur()
		 * @generated
		 */
		EClass MOTEUR = eINSTANCE.getMoteur();

		/**
		 * The meta object literal for the '<em><b>Initial Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTEUR__INITIAL_SPEED = eINSTANCE.getMoteur_InitialSpeed();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTEUR__PORT = eINSTANCE.getMoteur_Port();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.LeftMotorImpl <em>Left Motor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.LeftMotorImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getLeftMotor()
		 * @generated
		 */
		EClass LEFT_MOTOR = eINSTANCE.getLeftMotor();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.RightMotorImpl <em>Right Motor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.RightMotorImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getRightMotor()
		 * @generated
		 */
		EClass RIGHT_MOTOR = eINSTANCE.getRightMotor();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.SensorImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Sensor Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__SENSOR_PORT = eINSTANCE.getSensor_SensorPort();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ColorSensorImpl <em>Color Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ColorSensorImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getColorSensor()
		 * @generated
		 */
		EClass COLOR_SENSOR = eINSTANCE.getColorSensor();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.PositionSensorImpl <em>Position Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.PositionSensorImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getPositionSensor()
		 * @generated
		 */
		EClass POSITION_SENSOR = eINSTANCE.getPositionSensor();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ActionsImpl <em>Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ActionsImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getActions()
		 * @generated
		 */
		EClass ACTIONS = eINSTANCE.getActions();

		/**
		 * The meta object literal for the '<em><b>Moteur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIONS__MOTEUR = eINSTANCE.getActions_Moteur();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIONS__ANGLE = eINSTANCE.getActions_Angle();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIONS__SPEED = eINSTANCE.getActions_Speed();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIONS__DURATION = eINSTANCE.getActions_Duration();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.AccelerateImpl <em>Accelerate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.AccelerateImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getAccelerate()
		 * @generated
		 */
		EClass ACCELERATE = eINSTANCE.getAccelerate();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.IntensitySensorImpl <em>Intensity Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.IntensitySensorImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getIntensitySensor()
		 * @generated
		 */
		EClass INTENSITY_SENSOR = eINSTANCE.getIntensitySensor();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.StopImpl <em>Stop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.StopImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getStop()
		 * @generated
		 */
		EClass STOP = eINSTANCE.getStop();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.RotateImpl <em>Rotate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.RotateImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getRotate()
		 * @generated
		 */
		EClass ROTATE = eINSTANCE.getRotate();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.TurnOnImpl <em>Turn On</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.TurnOnImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getTurnOn()
		 * @generated
		 */
		EClass TURN_ON = eINSTANCE.getTurnOn();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.LightSensorImpl <em>Light Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.LightSensorImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getLightSensor()
		 * @generated
		 */
		EClass LIGHT_SENSOR = eINSTANCE.getLightSensor();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.InfraredSensorImpl <em>Infrared Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.InfraredSensorImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getInfraredSensor()
		 * @generated
		 */
		EClass INFRARED_SENSOR = eINSTANCE.getInfraredSensor();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.GyroSensorImpl <em>Gyro Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.GyroSensorImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getGyroSensor()
		 * @generated
		 */
		EClass GYRO_SENSOR = eINSTANCE.getGyroSensor();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.GPSSensorImpl <em>GPS Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.GPSSensorImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getGPSSensor()
		 * @generated
		 */
		EClass GPS_SENSOR = eINSTANCE.getGPSSensor();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.UltrasonicSensorImpl <em>Ultrasonic Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.UltrasonicSensorImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getUltrasonicSensor()
		 * @generated
		 */
		EClass ULTRASONIC_SENSOR = eINSTANCE.getUltrasonicSensor();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.MultipleMotorActionsImpl <em>Multiple Motor Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.MultipleMotorActionsImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getMultipleMotorActions()
		 * @generated
		 */
		EClass MULTIPLE_MOTOR_ACTIONS = eINSTANCE.getMultipleMotorActions();

		/**
		 * The meta object literal for the '<em><b>Leftmotor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_MOTOR_ACTIONS__LEFTMOTOR = eINSTANCE.getMultipleMotorActions_Leftmotor();

		/**
		 * The meta object literal for the '<em><b>Rightmotor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_MOTOR_ACTIONS__RIGHTMOTOR = eINSTANCE.getMultipleMotorActions_Rightmotor();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE_MOTOR_ACTIONS__ANGLE = eINSTANCE.getMultipleMotorActions_Angle();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE_MOTOR_ACTIONS__SPEED = eINSTANCE.getMultipleMotorActions_Speed();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE_MOTOR_ACTIONS__DURATION = eINSTANCE.getMultipleMotorActions_Duration();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.MoveImpl <em>Move</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.MoveImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getMove()
		 * @generated
		 */
		EClass MOVE = eINSTANCE.getMove();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.LeftRotationImpl <em>Left Rotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.LeftRotationImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getLeftRotation()
		 * @generated
		 */
		EClass LEFT_ROTATION = eINSTANCE.getLeftRotation();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.RightRotationImpl <em>Right Rotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.RightRotationImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getRightRotation()
		 * @generated
		 */
		EClass RIGHT_ROTATION = eINSTANCE.getRightRotation();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ConditionnalImpl <em>Conditionnal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ConditionnalImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getConditionnal()
		 * @generated
		 */
		EClass CONDITIONNAL = eINSTANCE.getConditionnal();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.IfConditionImpl <em>If Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.IfConditionImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getIfCondition()
		 * @generated
		 */
		EClass IF_CONDITION = eINSTANCE.getIfCondition();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_CONDITION__STATEMENT = eINSTANCE.getIfCondition_Statement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_CONDITION__EXPRESSION = eINSTANCE.getIfCondition_Expression();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.VarIntImpl <em>Var Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.VarIntImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getVarInt()
		 * @generated
		 */
		EClass VAR_INT = eINSTANCE.getVarInt();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_INT__INITIAL_VALUE = eINSTANCE.getVarInt_InitialValue();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.VarrStringImpl <em>Varr String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.VarrStringImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getVarrString()
		 * @generated
		 */
		EClass VARR_STRING = eINSTANCE.getVarrString();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ReferenceToColorImpl <em>Reference To Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ReferenceToColorImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getReferenceToColor()
		 * @generated
		 */
		EClass REFERENCE_TO_COLOR = eINSTANCE.getReferenceToColor();

		/**
		 * The meta object literal for the '<em><b>Colorsensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_TO_COLOR__COLORSENSOR = eINSTANCE.getReferenceToColor_Colorsensor();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ColorRefImpl <em>Color Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ColorRefImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getColorRef()
		 * @generated
		 */
		EClass COLOR_REF = eINSTANCE.getColorRef();

		/**
		 * The meta object literal for the '<em><b>Referencetocolor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLOR_REF__REFERENCETOCOLOR = eINSTANCE.getColorRef_Referencetocolor();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ReferenceImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ConditionMotorImpl <em>Condition Motor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ConditionMotorImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getConditionMotor()
		 * @generated
		 */
		EClass CONDITION_MOTOR = eINSTANCE.getConditionMotor();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.IfMotorImpl <em>If Motor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.IfMotorImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getIfMotor()
		 * @generated
		 */
		EClass IF_MOTOR = eINSTANCE.getIfMotor();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_MOTOR__STATEMENT = eINSTANCE.getIfMotor_Statement();

		/**
		 * The meta object literal for the '<em><b>Bool M</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_MOTOR__BOOL_M = eINSTANCE.getIfMotor_BoolM();

		/**
		 * The meta object literal for the '<em><b>Elsemotor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_MOTOR__ELSEMOTOR = eINSTANCE.getIfMotor_Elsemotor();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.BooleanOperationsOnMotorsImpl <em>Boolean Operations On Motors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.BooleanOperationsOnMotorsImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getBooleanOperationsOnMotors()
		 * @generated
		 */
		EClass BOOLEAN_OPERATIONS_ON_MOTORS = eINSTANCE.getBooleanOperationsOnMotors();

		/**
		 * The meta object literal for the '<em><b>Left C</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_OPERATIONS_ON_MOTORS__LEFT_C = eINSTANCE.getBooleanOperationsOnMotors_LeftC();

		/**
		 * The meta object literal for the '<em><b>Right C</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_OPERATIONS_ON_MOTORS__RIGHT_C = eINSTANCE.getBooleanOperationsOnMotors_RightC();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.EqualMImpl <em>Equal M</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.EqualMImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getEqualM()
		 * @generated
		 */
		EClass EQUAL_M = eINSTANCE.getEqualM();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.GreatherThanMImpl <em>Greather Than M</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.GreatherThanMImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getGreatherThanM()
		 * @generated
		 */
		EClass GREATHER_THAN_M = eINSTANCE.getGreatherThanM();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ElseMotorImpl <em>Else Motor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ElseMotorImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getElseMotor()
		 * @generated
		 */
		EClass ELSE_MOTOR = eINSTANCE.getElseMotor();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSE_MOTOR__STATEMENT = eINSTANCE.getElseMotor_Statement();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.SetThankImpl <em>Set Thank</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.SetThankImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getSetThank()
		 * @generated
		 */
		EClass SET_THANK = eINSTANCE.getSetThank();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.MoveLeftImpl <em>Move Left</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.MoveLeftImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getMoveLeft()
		 * @generated
		 */
		EClass MOVE_LEFT = eINSTANCE.getMoveLeft();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.OnForRotationImpl <em>On For Rotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.OnForRotationImpl
		 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022PackageImpl#getOnForRotation()
		 * @generated
		 */
		EClass ON_FOR_ROTATION = eINSTANCE.getOnForRotation();

	}

} //Tp_03_02_2022Package
