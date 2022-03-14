/**
 */
package fr.univcotedazur.l3ia.Tp_03_02_2022.impl;

import fr.univcotedazur.l3ia.Tp_03_02_2022.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Tp_03_02_2022FactoryImpl extends EFactoryImpl implements Tp_03_02_2022Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Tp_03_02_2022Factory init() {
		try {
			Tp_03_02_2022Factory theTp_03_02_2022Factory = (Tp_03_02_2022Factory) EPackage.Registry.INSTANCE
					.getEFactory(Tp_03_02_2022Package.eNS_URI);
			if (theTp_03_02_2022Factory != null) {
				return theTp_03_02_2022Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Tp_03_02_2022FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tp_03_02_2022FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Tp_03_02_2022Package.PROGRAM:
			return createProgram();
		case Tp_03_02_2022Package.VARIABLE:
			return createVariable();
		case Tp_03_02_2022Package.STATEMENT:
			return createStatement();
		case Tp_03_02_2022Package.WHILE_LOOP:
			return createWhileLoop();
		case Tp_03_02_2022Package.VARIABLE_REF:
			return createVariableRef();
		case Tp_03_02_2022Package.ASSIGNMENT:
			return createAssignment();
		case Tp_03_02_2022Package.COMPARISON:
			return createComparison();
		case Tp_03_02_2022Package.SUBSTRACTION:
			return createSubstraction();
		case Tp_03_02_2022Package.GREATER_THAN:
			return createGreaterThan();
		case Tp_03_02_2022Package.LOWER_THAN:
			return createLowerThan();
		case Tp_03_02_2022Package.EQUAL:
			return createEqual();
		case Tp_03_02_2022Package.FOR_LOOP:
			return createForLoop();
		case Tp_03_02_2022Package.ADDITION:
			return createAddition();
		case Tp_03_02_2022Package.MULTIPLICATION:
			return createMultiplication();
		case Tp_03_02_2022Package.DIVISION:
			return createDivision();
		case Tp_03_02_2022Package.ROBOT:
			return createRobot();
		case Tp_03_02_2022Package.LEFT_MOTOR:
			return createLeftMotor();
		case Tp_03_02_2022Package.RIGHT_MOTOR:
			return createRightMotor();
		case Tp_03_02_2022Package.COLOR_SENSOR:
			return createColorSensor();
		case Tp_03_02_2022Package.POSITION_SENSOR:
			return createPositionSensor();
		case Tp_03_02_2022Package.ACCELERATE:
			return createAccelerate();
		case Tp_03_02_2022Package.INTENSITY_SENSOR:
			return createIntensitySensor();
		case Tp_03_02_2022Package.STOP:
			return createStop();
		case Tp_03_02_2022Package.TURN_ON:
			return createTurnOn();
		case Tp_03_02_2022Package.LIGHT_SENSOR:
			return createLightSensor();
		case Tp_03_02_2022Package.INFRARED_SENSOR:
			return createInfraredSensor();
		case Tp_03_02_2022Package.GYRO_SENSOR:
			return createGyroSensor();
		case Tp_03_02_2022Package.GPS_SENSOR:
			return createGPSSensor();
		case Tp_03_02_2022Package.ULTRASONIC_SENSOR:
			return createUltrasonicSensor();
		case Tp_03_02_2022Package.MOVE:
			return createMove();
		case Tp_03_02_2022Package.LEFT_ROTATION:
			return createLeftRotation();
		case Tp_03_02_2022Package.RIGHT_ROTATION:
			return createRightRotation();
		case Tp_03_02_2022Package.IF_CONDITION:
			return createIfCondition();
		case Tp_03_02_2022Package.VAR_INT:
			return createVarInt();
		case Tp_03_02_2022Package.VARR_STRING:
			return createVarrString();
		case Tp_03_02_2022Package.REFERENCE_TO_COLOR:
			return createReferenceToColor();
		case Tp_03_02_2022Package.COLOR_REF:
			return createColorRef();
		case Tp_03_02_2022Package.REFERENCE:
			return createReference();
		case Tp_03_02_2022Package.IF_MOTOR:
			return createIfMotor();
		case Tp_03_02_2022Package.EQUAL_M:
			return createEqualM();
		case Tp_03_02_2022Package.GREATHER_THAN_M:
			return createGreatherThanM();
		case Tp_03_02_2022Package.ELSE_MOTOR:
			return createElseMotor();
		case Tp_03_02_2022Package.SET_THANK:
			return createSetThank();
		case Tp_03_02_2022Package.MOVE_LEFT:
			return createMoveLeft();
		case Tp_03_02_2022Package.ON_FOR_ROTATION:
			return createOnForRotation();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement createStatement() {
		StatementImpl statement = new StatementImpl();
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileLoop createWhileLoop() {
		WhileLoopImpl whileLoop = new WhileLoopImpl();
		return whileLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableRef createVariableRef() {
		VariableRefImpl variableRef = new VariableRefImpl();
		return variableRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comparison createComparison() {
		ComparisonImpl comparison = new ComparisonImpl();
		return comparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substraction createSubstraction() {
		SubstractionImpl substraction = new SubstractionImpl();
		return substraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreaterThan createGreaterThan() {
		GreaterThanImpl greaterThan = new GreaterThanImpl();
		return greaterThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LowerThan createLowerThan() {
		LowerThanImpl lowerThan = new LowerThanImpl();
		return lowerThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equal createEqual() {
		EqualImpl equal = new EqualImpl();
		return equal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForLoop createForLoop() {
		ForLoopImpl forLoop = new ForLoopImpl();
		return forLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Addition createAddition() {
		AdditionImpl addition = new AdditionImpl();
		return addition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplication createMultiplication() {
		MultiplicationImpl multiplication = new MultiplicationImpl();
		return multiplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Division createDivision() {
		DivisionImpl division = new DivisionImpl();
		return division;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Robot createRobot() {
		RobotImpl robot = new RobotImpl();
		return robot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftMotor createLeftMotor() {
		LeftMotorImpl leftMotor = new LeftMotorImpl();
		return leftMotor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightMotor createRightMotor() {
		RightMotorImpl rightMotor = new RightMotorImpl();
		return rightMotor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorSensor createColorSensor() {
		ColorSensorImpl colorSensor = new ColorSensorImpl();
		return colorSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionSensor createPositionSensor() {
		PositionSensorImpl positionSensor = new PositionSensorImpl();
		return positionSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accelerate createAccelerate() {
		AccelerateImpl accelerate = new AccelerateImpl();
		return accelerate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntensitySensor createIntensitySensor() {
		IntensitySensorImpl intensitySensor = new IntensitySensorImpl();
		return intensitySensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stop createStop() {
		StopImpl stop = new StopImpl();
		return stop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnOn createTurnOn() {
		TurnOnImpl turnOn = new TurnOnImpl();
		return turnOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightSensor createLightSensor() {
		LightSensorImpl lightSensor = new LightSensorImpl();
		return lightSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfraredSensor createInfraredSensor() {
		InfraredSensorImpl infraredSensor = new InfraredSensorImpl();
		return infraredSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GyroSensor createGyroSensor() {
		GyroSensorImpl gyroSensor = new GyroSensorImpl();
		return gyroSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GPSSensor createGPSSensor() {
		GPSSensorImpl gpsSensor = new GPSSensorImpl();
		return gpsSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UltrasonicSensor createUltrasonicSensor() {
		UltrasonicSensorImpl ultrasonicSensor = new UltrasonicSensorImpl();
		return ultrasonicSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Move createMove() {
		MoveImpl move = new MoveImpl();
		return move;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftRotation createLeftRotation() {
		LeftRotationImpl leftRotation = new LeftRotationImpl();
		return leftRotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightRotation createRightRotation() {
		RightRotationImpl rightRotation = new RightRotationImpl();
		return rightRotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfCondition createIfCondition() {
		IfConditionImpl ifCondition = new IfConditionImpl();
		return ifCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarInt createVarInt() {
		VarIntImpl varInt = new VarIntImpl();
		return varInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarrString createVarrString() {
		VarrStringImpl varrString = new VarrStringImpl();
		return varrString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceToColor createReferenceToColor() {
		ReferenceToColorImpl referenceToColor = new ReferenceToColorImpl();
		return referenceToColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorRef createColorRef() {
		ColorRefImpl colorRef = new ColorRefImpl();
		return colorRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfMotor createIfMotor() {
		IfMotorImpl ifMotor = new IfMotorImpl();
		return ifMotor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqualM createEqualM() {
		EqualMImpl equalM = new EqualMImpl();
		return equalM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreatherThanM createGreatherThanM() {
		GreatherThanMImpl greatherThanM = new GreatherThanMImpl();
		return greatherThanM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElseMotor createElseMotor() {
		ElseMotorImpl elseMotor = new ElseMotorImpl();
		return elseMotor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetThank createSetThank() {
		SetThankImpl setThank = new SetThankImpl();
		return setThank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveLeft createMoveLeft() {
		MoveLeftImpl moveLeft = new MoveLeftImpl();
		return moveLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnForRotation createOnForRotation() {
		OnForRotationImpl onForRotation = new OnForRotationImpl();
		return onForRotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tp_03_02_2022Package getTp_03_02_2022Package() {
		return (Tp_03_02_2022Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Tp_03_02_2022Package getPackage() {
		return Tp_03_02_2022Package.eINSTANCE;
	}

} //Tp_03_02_2022FactoryImpl
