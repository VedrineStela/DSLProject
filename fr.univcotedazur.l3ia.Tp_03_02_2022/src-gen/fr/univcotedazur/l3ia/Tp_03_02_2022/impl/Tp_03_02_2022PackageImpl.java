/**
 */
package fr.univcotedazur.l3ia.Tp_03_02_2022.impl;

import fr.univcotedazur.l3ia.Tp_03_02_2022.Accelerate;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Actions;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Addition;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Assignment;
import fr.univcotedazur.l3ia.Tp_03_02_2022.BinaryOperation;
import fr.univcotedazur.l3ia.Tp_03_02_2022.BooleanOperationsOnMotors;
import fr.univcotedazur.l3ia.Tp_03_02_2022.ColorRef;
import fr.univcotedazur.l3ia.Tp_03_02_2022.ColorSensor;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Comparison;
import fr.univcotedazur.l3ia.Tp_03_02_2022.ConditionMotor;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Conditionnal;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Division;
import fr.univcotedazur.l3ia.Tp_03_02_2022.ElseMotor;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Equal;
import fr.univcotedazur.l3ia.Tp_03_02_2022.EqualM;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Expression;
import fr.univcotedazur.l3ia.Tp_03_02_2022.ForLoop;
import fr.univcotedazur.l3ia.Tp_03_02_2022.GPSSensor;
import fr.univcotedazur.l3ia.Tp_03_02_2022.GreaterThan;
import fr.univcotedazur.l3ia.Tp_03_02_2022.GreatherThanM;
import fr.univcotedazur.l3ia.Tp_03_02_2022.GyroSensor;
import fr.univcotedazur.l3ia.Tp_03_02_2022.IfCondition;
import fr.univcotedazur.l3ia.Tp_03_02_2022.IfMotor;
import fr.univcotedazur.l3ia.Tp_03_02_2022.InfraredSensor;
import fr.univcotedazur.l3ia.Tp_03_02_2022.IntensitySensor;
import fr.univcotedazur.l3ia.Tp_03_02_2022.LeftMotor;
import fr.univcotedazur.l3ia.Tp_03_02_2022.LeftRotation;
import fr.univcotedazur.l3ia.Tp_03_02_2022.LightSensor;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Loop;
import fr.univcotedazur.l3ia.Tp_03_02_2022.LowerThan;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Moteur;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Move;
import fr.univcotedazur.l3ia.Tp_03_02_2022.MoveLeft;
import fr.univcotedazur.l3ia.Tp_03_02_2022.MultipleMotorActions;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Multiplication;
import fr.univcotedazur.l3ia.Tp_03_02_2022.NamedElement;
import fr.univcotedazur.l3ia.Tp_03_02_2022.OnForRotation;
import fr.univcotedazur.l3ia.Tp_03_02_2022.PositionSensor;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Program;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Reference;
import fr.univcotedazur.l3ia.Tp_03_02_2022.ReferenceToColor;
import fr.univcotedazur.l3ia.Tp_03_02_2022.RightMotor;
import fr.univcotedazur.l3ia.Tp_03_02_2022.RightRotation;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Robot;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Rotate;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Sensor;
import fr.univcotedazur.l3ia.Tp_03_02_2022.SetThank;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Statement;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Stop;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Substraction;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Factory;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package;
import fr.univcotedazur.l3ia.Tp_03_02_2022.TurnOn;
import fr.univcotedazur.l3ia.Tp_03_02_2022.UltrasonicSensor;
import fr.univcotedazur.l3ia.Tp_03_02_2022.VarInt;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Variable;
import fr.univcotedazur.l3ia.Tp_03_02_2022.VariableRef;
import fr.univcotedazur.l3ia.Tp_03_02_2022.VarrString;
import fr.univcotedazur.l3ia.Tp_03_02_2022.WhileLoop;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Tp_03_02_2022PackageImpl extends EPackageImpl implements Tp_03_02_2022Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileLoopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterThanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lowerThanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forLoopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass robotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moteurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leftMotorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rightMotorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accelerateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intensitySensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rotateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnOnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infraredSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gyroSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpsSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ultrasonicSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleMotorActionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leftRotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rightRotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionnalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varIntEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varrStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceToColorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionMotorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifMotorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanOperationsOnMotorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greatherThanMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elseMotorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setThankEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveLeftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onForRotationEClass = null;

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
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Tp_03_02_2022PackageImpl() {
		super(eNS_URI, Tp_03_02_2022Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Tp_03_02_2022Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Tp_03_02_2022Package init() {
		if (isInited)
			return (Tp_03_02_2022Package) EPackage.Registry.INSTANCE.getEPackage(Tp_03_02_2022Package.eNS_URI);

		// Obtain or create and register package
		Object registeredTp_03_02_2022Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Tp_03_02_2022PackageImpl theTp_03_02_2022Package = registeredTp_03_02_2022Package instanceof Tp_03_02_2022PackageImpl
				? (Tp_03_02_2022PackageImpl) registeredTp_03_02_2022Package
				: new Tp_03_02_2022PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theTp_03_02_2022Package.createPackageContents();

		// Initialize created meta-data
		theTp_03_02_2022Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTp_03_02_2022Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Tp_03_02_2022Package.eNS_URI, theTp_03_02_2022Package);
		return theTp_03_02_2022Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgram() {
		return programEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgram_Variable() {
		return (EReference) programEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgram_Statement() {
		return (EReference) programEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgram_Robot() {
		return (EReference) programEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgram_Referencetocolor() {
		return (EReference) programEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_IsConst() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_InitialValue() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoop() {
		return loopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhileLoop() {
		return whileLoopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhileLoop_Expression() {
		return (EReference) whileLoopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhileLoop_Statement() {
		return (EReference) whileLoopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryOperation() {
		return binaryOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryOperation_Left() {
		return (EReference) binaryOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryOperation_Right() {
		return (EReference) binaryOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableRef() {
		return variableRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableRef_Variable() {
		return (EReference) variableRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignment() {
		return assignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparison() {
		return comparisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstraction() {
		return substractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGreaterThan() {
		return greaterThanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLowerThan() {
		return lowerThanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqual() {
		return equalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForLoop() {
		return forLoopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForLoop_Expression() {
		return (EReference) forLoopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForLoop_Statement() {
		return (EReference) forLoopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddition() {
		return additionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplication() {
		return multiplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDivision() {
		return divisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRobot() {
		return robotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobot_Moteur() {
		return (EReference) robotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobot_Sensor() {
		return (EReference) robotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoteur() {
		return moteurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoteur_InitialSpeed() {
		return (EAttribute) moteurEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoteur_Port() {
		return (EAttribute) moteurEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeftMotor() {
		return leftMotorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRightMotor() {
		return rightMotorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_SensorPort() {
		return (EAttribute) sensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorSensor() {
		return colorSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositionSensor() {
		return positionSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActions() {
		return actionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActions_Moteur() {
		return (EReference) actionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActions_Angle() {
		return (EAttribute) actionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActions_Speed() {
		return (EAttribute) actionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActions_Duration() {
		return (EAttribute) actionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccelerate() {
		return accelerateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntensitySensor() {
		return intensitySensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStop() {
		return stopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRotate() {
		return rotateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurnOn() {
		return turnOnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightSensor() {
		return lightSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfraredSensor() {
		return infraredSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGyroSensor() {
		return gyroSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGPSSensor() {
		return gpsSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUltrasonicSensor() {
		return ultrasonicSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultipleMotorActions() {
		return multipleMotorActionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultipleMotorActions_Leftmotor() {
		return (EReference) multipleMotorActionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultipleMotorActions_Rightmotor() {
		return (EReference) multipleMotorActionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultipleMotorActions_Angle() {
		return (EAttribute) multipleMotorActionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultipleMotorActions_Speed() {
		return (EAttribute) multipleMotorActionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultipleMotorActions_Duration() {
		return (EAttribute) multipleMotorActionsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMove() {
		return moveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeftRotation() {
		return leftRotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRightRotation() {
		return rightRotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionnal() {
		return conditionnalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfCondition() {
		return ifConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfCondition_Statement() {
		return (EReference) ifConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfCondition_Expression() {
		return (EReference) ifConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVarInt() {
		return varIntEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVarInt_InitialValue() {
		return (EAttribute) varIntEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVarrString() {
		return varrStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceToColor() {
		return referenceToColorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceToColor_Colorsensor() {
		return (EReference) referenceToColorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorRef() {
		return colorRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColorRef_Referencetocolor() {
		return (EReference) colorRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionMotor() {
		return conditionMotorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfMotor() {
		return ifMotorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfMotor_Statement() {
		return (EReference) ifMotorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfMotor_BoolM() {
		return (EReference) ifMotorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfMotor_Elsemotor() {
		return (EReference) ifMotorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanOperationsOnMotors() {
		return booleanOperationsOnMotorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanOperationsOnMotors_LeftC() {
		return (EReference) booleanOperationsOnMotorsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanOperationsOnMotors_RightC() {
		return (EReference) booleanOperationsOnMotorsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqualM() {
		return equalMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGreatherThanM() {
		return greatherThanMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElseMotor() {
		return elseMotorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElseMotor_Statement() {
		return (EReference) elseMotorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetThank() {
		return setThankEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoveLeft() {
		return moveLeftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnForRotation() {
		return onForRotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tp_03_02_2022Factory getTp_03_02_2022Factory() {
		return (Tp_03_02_2022Factory) getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		programEClass = createEClass(PROGRAM);
		createEReference(programEClass, PROGRAM__STATEMENT);
		createEReference(programEClass, PROGRAM__ROBOT);
		createEReference(programEClass, PROGRAM__REFERENCETOCOLOR);
		createEReference(programEClass, PROGRAM__VARIABLE);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__IS_CONST);
		createEAttribute(variableEClass, VARIABLE__INITIAL_VALUE);

		statementEClass = createEClass(STATEMENT);

		loopEClass = createEClass(LOOP);

		whileLoopEClass = createEClass(WHILE_LOOP);
		createEReference(whileLoopEClass, WHILE_LOOP__EXPRESSION);
		createEReference(whileLoopEClass, WHILE_LOOP__STATEMENT);

		expressionEClass = createEClass(EXPRESSION);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		binaryOperationEClass = createEClass(BINARY_OPERATION);
		createEReference(binaryOperationEClass, BINARY_OPERATION__LEFT);
		createEReference(binaryOperationEClass, BINARY_OPERATION__RIGHT);

		variableRefEClass = createEClass(VARIABLE_REF);
		createEReference(variableRefEClass, VARIABLE_REF__VARIABLE);

		assignmentEClass = createEClass(ASSIGNMENT);

		comparisonEClass = createEClass(COMPARISON);

		substractionEClass = createEClass(SUBSTRACTION);

		greaterThanEClass = createEClass(GREATER_THAN);

		lowerThanEClass = createEClass(LOWER_THAN);

		equalEClass = createEClass(EQUAL);

		forLoopEClass = createEClass(FOR_LOOP);
		createEReference(forLoopEClass, FOR_LOOP__EXPRESSION);
		createEReference(forLoopEClass, FOR_LOOP__STATEMENT);

		additionEClass = createEClass(ADDITION);

		multiplicationEClass = createEClass(MULTIPLICATION);

		divisionEClass = createEClass(DIVISION);

		robotEClass = createEClass(ROBOT);
		createEReference(robotEClass, ROBOT__MOTEUR);
		createEReference(robotEClass, ROBOT__SENSOR);

		moteurEClass = createEClass(MOTEUR);
		createEAttribute(moteurEClass, MOTEUR__INITIAL_SPEED);
		createEAttribute(moteurEClass, MOTEUR__PORT);

		leftMotorEClass = createEClass(LEFT_MOTOR);

		rightMotorEClass = createEClass(RIGHT_MOTOR);

		sensorEClass = createEClass(SENSOR);
		createEAttribute(sensorEClass, SENSOR__SENSOR_PORT);

		colorSensorEClass = createEClass(COLOR_SENSOR);

		positionSensorEClass = createEClass(POSITION_SENSOR);

		actionsEClass = createEClass(ACTIONS);
		createEReference(actionsEClass, ACTIONS__MOTEUR);
		createEAttribute(actionsEClass, ACTIONS__ANGLE);
		createEAttribute(actionsEClass, ACTIONS__SPEED);
		createEAttribute(actionsEClass, ACTIONS__DURATION);

		accelerateEClass = createEClass(ACCELERATE);

		intensitySensorEClass = createEClass(INTENSITY_SENSOR);

		stopEClass = createEClass(STOP);

		rotateEClass = createEClass(ROTATE);

		turnOnEClass = createEClass(TURN_ON);

		lightSensorEClass = createEClass(LIGHT_SENSOR);

		infraredSensorEClass = createEClass(INFRARED_SENSOR);

		gyroSensorEClass = createEClass(GYRO_SENSOR);

		gpsSensorEClass = createEClass(GPS_SENSOR);

		ultrasonicSensorEClass = createEClass(ULTRASONIC_SENSOR);

		multipleMotorActionsEClass = createEClass(MULTIPLE_MOTOR_ACTIONS);
		createEReference(multipleMotorActionsEClass, MULTIPLE_MOTOR_ACTIONS__LEFTMOTOR);
		createEReference(multipleMotorActionsEClass, MULTIPLE_MOTOR_ACTIONS__RIGHTMOTOR);
		createEAttribute(multipleMotorActionsEClass, MULTIPLE_MOTOR_ACTIONS__ANGLE);
		createEAttribute(multipleMotorActionsEClass, MULTIPLE_MOTOR_ACTIONS__SPEED);
		createEAttribute(multipleMotorActionsEClass, MULTIPLE_MOTOR_ACTIONS__DURATION);

		moveEClass = createEClass(MOVE);

		leftRotationEClass = createEClass(LEFT_ROTATION);

		rightRotationEClass = createEClass(RIGHT_ROTATION);

		conditionnalEClass = createEClass(CONDITIONNAL);

		ifConditionEClass = createEClass(IF_CONDITION);
		createEReference(ifConditionEClass, IF_CONDITION__STATEMENT);
		createEReference(ifConditionEClass, IF_CONDITION__EXPRESSION);

		varIntEClass = createEClass(VAR_INT);
		createEAttribute(varIntEClass, VAR_INT__INITIAL_VALUE);

		varrStringEClass = createEClass(VARR_STRING);

		referenceToColorEClass = createEClass(REFERENCE_TO_COLOR);
		createEReference(referenceToColorEClass, REFERENCE_TO_COLOR__COLORSENSOR);

		colorRefEClass = createEClass(COLOR_REF);
		createEReference(colorRefEClass, COLOR_REF__REFERENCETOCOLOR);

		referenceEClass = createEClass(REFERENCE);

		conditionMotorEClass = createEClass(CONDITION_MOTOR);

		ifMotorEClass = createEClass(IF_MOTOR);
		createEReference(ifMotorEClass, IF_MOTOR__STATEMENT);
		createEReference(ifMotorEClass, IF_MOTOR__BOOL_M);
		createEReference(ifMotorEClass, IF_MOTOR__ELSEMOTOR);

		booleanOperationsOnMotorsEClass = createEClass(BOOLEAN_OPERATIONS_ON_MOTORS);
		createEReference(booleanOperationsOnMotorsEClass, BOOLEAN_OPERATIONS_ON_MOTORS__LEFT_C);
		createEReference(booleanOperationsOnMotorsEClass, BOOLEAN_OPERATIONS_ON_MOTORS__RIGHT_C);

		equalMEClass = createEClass(EQUAL_M);

		greatherThanMEClass = createEClass(GREATHER_THAN_M);

		elseMotorEClass = createEClass(ELSE_MOTOR);
		createEReference(elseMotorEClass, ELSE_MOTOR__STATEMENT);

		setThankEClass = createEClass(SET_THANK);

		moveLeftEClass = createEClass(MOVE_LEFT);

		onForRotationEClass = createEClass(ON_FOR_ROTATION);
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
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		programEClass.getESuperTypes().add(this.getNamedElement());
		variableEClass.getESuperTypes().add(this.getNamedElement());
		loopEClass.getESuperTypes().add(this.getStatement());
		whileLoopEClass.getESuperTypes().add(this.getLoop());
		expressionEClass.getESuperTypes().add(this.getStatement());
		binaryOperationEClass.getESuperTypes().add(this.getExpression());
		variableRefEClass.getESuperTypes().add(this.getReference());
		assignmentEClass.getESuperTypes().add(this.getBinaryOperation());
		comparisonEClass.getESuperTypes().add(this.getBinaryOperation());
		substractionEClass.getESuperTypes().add(this.getBinaryOperation());
		greaterThanEClass.getESuperTypes().add(this.getComparison());
		lowerThanEClass.getESuperTypes().add(this.getComparison());
		equalEClass.getESuperTypes().add(this.getComparison());
		forLoopEClass.getESuperTypes().add(this.getLoop());
		additionEClass.getESuperTypes().add(this.getBinaryOperation());
		multiplicationEClass.getESuperTypes().add(this.getBinaryOperation());
		divisionEClass.getESuperTypes().add(this.getBinaryOperation());
		robotEClass.getESuperTypes().add(this.getNamedElement());
		moteurEClass.getESuperTypes().add(this.getNamedElement());
		leftMotorEClass.getESuperTypes().add(this.getMoteur());
		rightMotorEClass.getESuperTypes().add(this.getMoteur());
		sensorEClass.getESuperTypes().add(this.getNamedElement());
		colorSensorEClass.getESuperTypes().add(this.getSensor());
		positionSensorEClass.getESuperTypes().add(this.getSensor());
		actionsEClass.getESuperTypes().add(this.getStatement());
		accelerateEClass.getESuperTypes().add(this.getActions());
		intensitySensorEClass.getESuperTypes().add(this.getSensor());
		stopEClass.getESuperTypes().add(this.getActions());
		rotateEClass.getESuperTypes().add(this.getMultipleMotorActions());
		turnOnEClass.getESuperTypes().add(this.getActions());
		lightSensorEClass.getESuperTypes().add(this.getSensor());
		infraredSensorEClass.getESuperTypes().add(this.getSensor());
		gyroSensorEClass.getESuperTypes().add(this.getSensor());
		gpsSensorEClass.getESuperTypes().add(this.getSensor());
		ultrasonicSensorEClass.getESuperTypes().add(this.getSensor());
		multipleMotorActionsEClass.getESuperTypes().add(this.getStatement());
		moveEClass.getESuperTypes().add(this.getMultipleMotorActions());
		leftRotationEClass.getESuperTypes().add(this.getRotate());
		rightRotationEClass.getESuperTypes().add(this.getRotate());
		conditionnalEClass.getESuperTypes().add(this.getStatement());
		ifConditionEClass.getESuperTypes().add(this.getConditionnal());
		referenceToColorEClass.getESuperTypes().add(this.getNamedElement());
		referenceEClass.getESuperTypes().add(this.getExpression());
		conditionMotorEClass.getESuperTypes().add(this.getStatement());
		ifMotorEClass.getESuperTypes().add(this.getConditionMotor());
		equalMEClass.getESuperTypes().add(this.getBooleanOperationsOnMotors());
		greatherThanMEClass.getESuperTypes().add(this.getBooleanOperationsOnMotors());
		elseMotorEClass.getESuperTypes().add(this.getConditionMotor());
		setThankEClass.getESuperTypes().add(this.getMultipleMotorActions());
		moveLeftEClass.getESuperTypes().add(this.getMultipleMotorActions());
		onForRotationEClass.getESuperTypes().add(this.getActions());

		// Initialize classes, features, and operations; add parameters
		initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgram_Statement(), this.getStatement(), null, "statement", null, 0, -1, Program.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_Robot(), this.getRobot(), null, "robot", null, 0, -1, Program.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getProgram_Referencetocolor(), this.getReferenceToColor(), null, "referencetocolor", null, 0, -1,
				Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_Variable(), this.getVariable(), null, "variable", null, 0, -1, Program.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_IsConst(), ecorePackage.getEBoolean(), "isConst", null, 0, 1, Variable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_InitialValue(), ecorePackage.getEInt(), "initialValue", null, 0, 1, Variable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(loopEClass, Loop.class, "Loop", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(whileLoopEClass, WhileLoop.class, "WhileLoop", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhileLoop_Expression(), this.getExpression(), null, "expression", null, 1, 1, WhileLoop.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWhileLoop_Statement(), this.getStatement(), null, "statement", null, 0, -1, WhileLoop.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryOperationEClass, BinaryOperation.class, "BinaryOperation", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryOperation_Left(), this.getExpression(), null, "left", null, 1, 1, BinaryOperation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryOperation_Right(), this.getExpression(), null, "right", null, 1, 1,
				BinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableRefEClass, VariableRef.class, "VariableRef", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableRef_Variable(), this.getVariable(), null, "variable", null, 1, 1, VariableRef.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(comparisonEClass, Comparison.class, "Comparison", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(substractionEClass, Substraction.class, "Substraction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(greaterThanEClass, GreaterThan.class, "GreaterThan", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(lowerThanEClass, LowerThan.class, "LowerThan", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(equalEClass, Equal.class, "Equal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forLoopEClass, ForLoop.class, "ForLoop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForLoop_Expression(), this.getExpression(), null, "expression", null, 1, 1, ForLoop.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForLoop_Statement(), this.getStatement(), null, "statement", null, 0, -1, ForLoop.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(additionEClass, Addition.class, "Addition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiplicationEClass, Multiplication.class, "Multiplication", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(divisionEClass, Division.class, "Division", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(robotEClass, Robot.class, "Robot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRobot_Moteur(), this.getMoteur(), null, "moteur", null, 0, -1, Robot.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getRobot_Sensor(), this.getSensor(), null, "sensor", null, 0, -1, Robot.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(moteurEClass, Moteur.class, "Moteur", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMoteur_InitialSpeed(), ecorePackage.getEInt(), "initialSpeed", null, 0, 1, Moteur.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoteur_Port(), ecorePackage.getEString(), "port", null, 0, 1, Moteur.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(leftMotorEClass, LeftMotor.class, "LeftMotor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(rightMotorEClass, RightMotor.class, "RightMotor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(sensorEClass, Sensor.class, "Sensor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensor_SensorPort(), ecorePackage.getEInt(), "sensorPort", null, 0, 1, Sensor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colorSensorEClass, ColorSensor.class, "ColorSensor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(positionSensorEClass, PositionSensor.class, "PositionSensor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionsEClass, Actions.class, "Actions", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActions_Moteur(), this.getMoteur(), null, "moteur", null, 1, 1, Actions.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getActions_Angle(), ecorePackage.getEInt(), "angle", null, 0, 1, Actions.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActions_Speed(), ecorePackage.getEInt(), "speed", null, 0, 1, Actions.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActions_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, Actions.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accelerateEClass, Accelerate.class, "Accelerate", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(intensitySensorEClass, IntensitySensor.class, "IntensitySensor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(stopEClass, Stop.class, "Stop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rotateEClass, Rotate.class, "Rotate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(turnOnEClass, TurnOn.class, "TurnOn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lightSensorEClass, LightSensor.class, "LightSensor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(infraredSensorEClass, InfraredSensor.class, "InfraredSensor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(gyroSensorEClass, GyroSensor.class, "GyroSensor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(gpsSensorEClass, GPSSensor.class, "GPSSensor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(ultrasonicSensorEClass, UltrasonicSensor.class, "UltrasonicSensor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(multipleMotorActionsEClass, MultipleMotorActions.class, "MultipleMotorActions", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultipleMotorActions_Leftmotor(), this.getLeftMotor(), null, "leftmotor", null, 1, 1,
				MultipleMotorActions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultipleMotorActions_Rightmotor(), this.getRightMotor(), null, "rightmotor", null, 1, 1,
				MultipleMotorActions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultipleMotorActions_Angle(), ecorePackage.getEInt(), "angle", null, 0, 1,
				MultipleMotorActions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultipleMotorActions_Speed(), ecorePackage.getEInt(), "speed", null, 0, 1,
				MultipleMotorActions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultipleMotorActions_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1,
				MultipleMotorActions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moveEClass, Move.class, "Move", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(leftRotationEClass, LeftRotation.class, "LeftRotation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(rightRotationEClass, RightRotation.class, "RightRotation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionnalEClass, Conditionnal.class, "Conditionnal", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(ifConditionEClass, IfCondition.class, "IfCondition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfCondition_Statement(), this.getStatement(), null, "statement", null, 0, -1,
				IfCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfCondition_Expression(), this.getExpression(), null, "expression", null, 1, 1,
				IfCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(varIntEClass, VarInt.class, "VarInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVarInt_InitialValue(), ecorePackage.getEInt(), "initialValue", null, 0, 1, VarInt.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(varrStringEClass, VarrString.class, "VarrString", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(referenceToColorEClass, ReferenceToColor.class, "ReferenceToColor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceToColor_Colorsensor(), this.getColorSensor(), null, "colorsensor", null, 1, 1,
				ReferenceToColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colorRefEClass, ColorRef.class, "ColorRef", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColorRef_Referencetocolor(), this.getReferenceToColor(), null, "referencetocolor", null, 1, 1,
				ColorRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionMotorEClass, ConditionMotor.class, "ConditionMotor", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(ifMotorEClass, IfMotor.class, "IfMotor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfMotor_Statement(), this.getStatement(), null, "statement", null, 0, -1, IfMotor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfMotor_BoolM(), this.getBooleanOperationsOnMotors(), null, "boolM", null, 1, 1,
				IfMotor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfMotor_Elsemotor(), this.getElseMotor(), null, "elsemotor", null, 0, -1, IfMotor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanOperationsOnMotorsEClass, BooleanOperationsOnMotors.class, "BooleanOperationsOnMotors",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanOperationsOnMotors_LeftC(), this.getColorRef(), null, "leftC", null, 1, 1,
				BooleanOperationsOnMotors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanOperationsOnMotors_RightC(), this.getVariableRef(), null, "rightC", null, 1, 1,
				BooleanOperationsOnMotors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equalMEClass, EqualM.class, "EqualM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(greatherThanMEClass, GreatherThanM.class, "GreatherThanM", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(elseMotorEClass, ElseMotor.class, "ElseMotor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElseMotor_Statement(), this.getStatement(), null, "statement", null, 0, -1, ElseMotor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setThankEClass, SetThank.class, "SetThank", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(moveLeftEClass, MoveLeft.class, "MoveLeft", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(onForRotationEClass, OnForRotation.class, "OnForRotation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Tp_03_02_2022PackageImpl
