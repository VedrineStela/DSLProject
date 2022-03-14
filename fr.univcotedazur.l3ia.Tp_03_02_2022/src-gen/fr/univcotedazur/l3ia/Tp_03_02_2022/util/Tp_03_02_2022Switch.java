/**
 */
package fr.univcotedazur.l3ia.Tp_03_02_2022.util;

import fr.univcotedazur.l3ia.Tp_03_02_2022.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package
 * @generated
 */
public class Tp_03_02_2022Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Tp_03_02_2022Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tp_03_02_2022Switch() {
		if (modelPackage == null) {
			modelPackage = Tp_03_02_2022Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
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
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Tp_03_02_2022Package.PROGRAM: {
			Program program = (Program) theEObject;
			T result = caseProgram(program);
			if (result == null)
				result = caseNamedElement(program);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.VARIABLE: {
			Variable variable = (Variable) theEObject;
			T result = caseVariable(variable);
			if (result == null)
				result = caseNamedElement(variable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.STATEMENT: {
			Statement statement = (Statement) theEObject;
			T result = caseStatement(statement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.LOOP: {
			Loop loop = (Loop) theEObject;
			T result = caseLoop(loop);
			if (result == null)
				result = caseStatement(loop);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.WHILE_LOOP: {
			WhileLoop whileLoop = (WhileLoop) theEObject;
			T result = caseWhileLoop(whileLoop);
			if (result == null)
				result = caseLoop(whileLoop);
			if (result == null)
				result = caseStatement(whileLoop);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.EXPRESSION: {
			Expression expression = (Expression) theEObject;
			T result = caseExpression(expression);
			if (result == null)
				result = caseStatement(expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.NAMED_ELEMENT: {
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.BINARY_OPERATION: {
			BinaryOperation binaryOperation = (BinaryOperation) theEObject;
			T result = caseBinaryOperation(binaryOperation);
			if (result == null)
				result = caseExpression(binaryOperation);
			if (result == null)
				result = caseStatement(binaryOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.VARIABLE_REF: {
			VariableRef variableRef = (VariableRef) theEObject;
			T result = caseVariableRef(variableRef);
			if (result == null)
				result = caseReference(variableRef);
			if (result == null)
				result = caseExpression(variableRef);
			if (result == null)
				result = caseStatement(variableRef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.ASSIGNMENT: {
			Assignment assignment = (Assignment) theEObject;
			T result = caseAssignment(assignment);
			if (result == null)
				result = caseBinaryOperation(assignment);
			if (result == null)
				result = caseExpression(assignment);
			if (result == null)
				result = caseStatement(assignment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.COMPARISON: {
			Comparison comparison = (Comparison) theEObject;
			T result = caseComparison(comparison);
			if (result == null)
				result = caseBinaryOperation(comparison);
			if (result == null)
				result = caseExpression(comparison);
			if (result == null)
				result = caseStatement(comparison);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.SUBSTRACTION: {
			Substraction substraction = (Substraction) theEObject;
			T result = caseSubstraction(substraction);
			if (result == null)
				result = caseBinaryOperation(substraction);
			if (result == null)
				result = caseExpression(substraction);
			if (result == null)
				result = caseStatement(substraction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.GREATER_THAN: {
			GreaterThan greaterThan = (GreaterThan) theEObject;
			T result = caseGreaterThan(greaterThan);
			if (result == null)
				result = caseComparison(greaterThan);
			if (result == null)
				result = caseBinaryOperation(greaterThan);
			if (result == null)
				result = caseExpression(greaterThan);
			if (result == null)
				result = caseStatement(greaterThan);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.LOWER_THAN: {
			LowerThan lowerThan = (LowerThan) theEObject;
			T result = caseLowerThan(lowerThan);
			if (result == null)
				result = caseComparison(lowerThan);
			if (result == null)
				result = caseBinaryOperation(lowerThan);
			if (result == null)
				result = caseExpression(lowerThan);
			if (result == null)
				result = caseStatement(lowerThan);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.EQUAL: {
			Equal equal = (Equal) theEObject;
			T result = caseEqual(equal);
			if (result == null)
				result = caseComparison(equal);
			if (result == null)
				result = caseBinaryOperation(equal);
			if (result == null)
				result = caseExpression(equal);
			if (result == null)
				result = caseStatement(equal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.FOR_LOOP: {
			ForLoop forLoop = (ForLoop) theEObject;
			T result = caseForLoop(forLoop);
			if (result == null)
				result = caseLoop(forLoop);
			if (result == null)
				result = caseStatement(forLoop);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.ADDITION: {
			Addition addition = (Addition) theEObject;
			T result = caseAddition(addition);
			if (result == null)
				result = caseBinaryOperation(addition);
			if (result == null)
				result = caseExpression(addition);
			if (result == null)
				result = caseStatement(addition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.MULTIPLICATION: {
			Multiplication multiplication = (Multiplication) theEObject;
			T result = caseMultiplication(multiplication);
			if (result == null)
				result = caseBinaryOperation(multiplication);
			if (result == null)
				result = caseExpression(multiplication);
			if (result == null)
				result = caseStatement(multiplication);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.DIVISION: {
			Division division = (Division) theEObject;
			T result = caseDivision(division);
			if (result == null)
				result = caseBinaryOperation(division);
			if (result == null)
				result = caseExpression(division);
			if (result == null)
				result = caseStatement(division);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.ROBOT: {
			Robot robot = (Robot) theEObject;
			T result = caseRobot(robot);
			if (result == null)
				result = caseNamedElement(robot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.MOTEUR: {
			Moteur moteur = (Moteur) theEObject;
			T result = caseMoteur(moteur);
			if (result == null)
				result = caseNamedElement(moteur);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.LEFT_MOTOR: {
			LeftMotor leftMotor = (LeftMotor) theEObject;
			T result = caseLeftMotor(leftMotor);
			if (result == null)
				result = caseMoteur(leftMotor);
			if (result == null)
				result = caseNamedElement(leftMotor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.RIGHT_MOTOR: {
			RightMotor rightMotor = (RightMotor) theEObject;
			T result = caseRightMotor(rightMotor);
			if (result == null)
				result = caseMoteur(rightMotor);
			if (result == null)
				result = caseNamedElement(rightMotor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.SENSOR: {
			Sensor sensor = (Sensor) theEObject;
			T result = caseSensor(sensor);
			if (result == null)
				result = caseNamedElement(sensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.COLOR_SENSOR: {
			ColorSensor colorSensor = (ColorSensor) theEObject;
			T result = caseColorSensor(colorSensor);
			if (result == null)
				result = caseSensor(colorSensor);
			if (result == null)
				result = caseNamedElement(colorSensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.POSITION_SENSOR: {
			PositionSensor positionSensor = (PositionSensor) theEObject;
			T result = casePositionSensor(positionSensor);
			if (result == null)
				result = caseSensor(positionSensor);
			if (result == null)
				result = caseNamedElement(positionSensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.ACTIONS: {
			Actions actions = (Actions) theEObject;
			T result = caseActions(actions);
			if (result == null)
				result = caseStatement(actions);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.ACCELERATE: {
			Accelerate accelerate = (Accelerate) theEObject;
			T result = caseAccelerate(accelerate);
			if (result == null)
				result = caseActions(accelerate);
			if (result == null)
				result = caseStatement(accelerate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.INTENSITY_SENSOR: {
			IntensitySensor intensitySensor = (IntensitySensor) theEObject;
			T result = caseIntensitySensor(intensitySensor);
			if (result == null)
				result = caseSensor(intensitySensor);
			if (result == null)
				result = caseNamedElement(intensitySensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.STOP: {
			Stop stop = (Stop) theEObject;
			T result = caseStop(stop);
			if (result == null)
				result = caseActions(stop);
			if (result == null)
				result = caseStatement(stop);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.ROTATE: {
			Rotate rotate = (Rotate) theEObject;
			T result = caseRotate(rotate);
			if (result == null)
				result = caseMultipleMotorActions(rotate);
			if (result == null)
				result = caseStatement(rotate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.TURN_ON: {
			TurnOn turnOn = (TurnOn) theEObject;
			T result = caseTurnOn(turnOn);
			if (result == null)
				result = caseActions(turnOn);
			if (result == null)
				result = caseStatement(turnOn);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.LIGHT_SENSOR: {
			LightSensor lightSensor = (LightSensor) theEObject;
			T result = caseLightSensor(lightSensor);
			if (result == null)
				result = caseSensor(lightSensor);
			if (result == null)
				result = caseNamedElement(lightSensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.INFRARED_SENSOR: {
			InfraredSensor infraredSensor = (InfraredSensor) theEObject;
			T result = caseInfraredSensor(infraredSensor);
			if (result == null)
				result = caseSensor(infraredSensor);
			if (result == null)
				result = caseNamedElement(infraredSensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.GYRO_SENSOR: {
			GyroSensor gyroSensor = (GyroSensor) theEObject;
			T result = caseGyroSensor(gyroSensor);
			if (result == null)
				result = caseSensor(gyroSensor);
			if (result == null)
				result = caseNamedElement(gyroSensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.GPS_SENSOR: {
			GPSSensor gpsSensor = (GPSSensor) theEObject;
			T result = caseGPSSensor(gpsSensor);
			if (result == null)
				result = caseSensor(gpsSensor);
			if (result == null)
				result = caseNamedElement(gpsSensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.ULTRASONIC_SENSOR: {
			UltrasonicSensor ultrasonicSensor = (UltrasonicSensor) theEObject;
			T result = caseUltrasonicSensor(ultrasonicSensor);
			if (result == null)
				result = caseSensor(ultrasonicSensor);
			if (result == null)
				result = caseNamedElement(ultrasonicSensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.MULTIPLE_MOTOR_ACTIONS: {
			MultipleMotorActions multipleMotorActions = (MultipleMotorActions) theEObject;
			T result = caseMultipleMotorActions(multipleMotorActions);
			if (result == null)
				result = caseStatement(multipleMotorActions);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.MOVE: {
			Move move = (Move) theEObject;
			T result = caseMove(move);
			if (result == null)
				result = caseMultipleMotorActions(move);
			if (result == null)
				result = caseStatement(move);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.LEFT_ROTATION: {
			LeftRotation leftRotation = (LeftRotation) theEObject;
			T result = caseLeftRotation(leftRotation);
			if (result == null)
				result = caseRotate(leftRotation);
			if (result == null)
				result = caseMultipleMotorActions(leftRotation);
			if (result == null)
				result = caseStatement(leftRotation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.RIGHT_ROTATION: {
			RightRotation rightRotation = (RightRotation) theEObject;
			T result = caseRightRotation(rightRotation);
			if (result == null)
				result = caseRotate(rightRotation);
			if (result == null)
				result = caseMultipleMotorActions(rightRotation);
			if (result == null)
				result = caseStatement(rightRotation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.CONDITIONNAL: {
			Conditionnal conditionnal = (Conditionnal) theEObject;
			T result = caseConditionnal(conditionnal);
			if (result == null)
				result = caseStatement(conditionnal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.IF_CONDITION: {
			IfCondition ifCondition = (IfCondition) theEObject;
			T result = caseIfCondition(ifCondition);
			if (result == null)
				result = caseConditionnal(ifCondition);
			if (result == null)
				result = caseStatement(ifCondition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.VAR_INT: {
			VarInt varInt = (VarInt) theEObject;
			T result = caseVarInt(varInt);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.VARR_STRING: {
			VarrString varrString = (VarrString) theEObject;
			T result = caseVarrString(varrString);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.REFERENCE_TO_COLOR: {
			ReferenceToColor referenceToColor = (ReferenceToColor) theEObject;
			T result = caseReferenceToColor(referenceToColor);
			if (result == null)
				result = caseNamedElement(referenceToColor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.COLOR_REF: {
			ColorRef colorRef = (ColorRef) theEObject;
			T result = caseColorRef(colorRef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.REFERENCE: {
			Reference reference = (Reference) theEObject;
			T result = caseReference(reference);
			if (result == null)
				result = caseExpression(reference);
			if (result == null)
				result = caseStatement(reference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.CONDITION_MOTOR: {
			ConditionMotor conditionMotor = (ConditionMotor) theEObject;
			T result = caseConditionMotor(conditionMotor);
			if (result == null)
				result = caseStatement(conditionMotor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.IF_MOTOR: {
			IfMotor ifMotor = (IfMotor) theEObject;
			T result = caseIfMotor(ifMotor);
			if (result == null)
				result = caseConditionMotor(ifMotor);
			if (result == null)
				result = caseStatement(ifMotor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.BOOLEAN_OPERATIONS_ON_MOTORS: {
			BooleanOperationsOnMotors booleanOperationsOnMotors = (BooleanOperationsOnMotors) theEObject;
			T result = caseBooleanOperationsOnMotors(booleanOperationsOnMotors);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.EQUAL_M: {
			EqualM equalM = (EqualM) theEObject;
			T result = caseEqualM(equalM);
			if (result == null)
				result = caseBooleanOperationsOnMotors(equalM);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.GREATHER_THAN_M: {
			GreatherThanM greatherThanM = (GreatherThanM) theEObject;
			T result = caseGreatherThanM(greatherThanM);
			if (result == null)
				result = caseBooleanOperationsOnMotors(greatherThanM);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.ELSE_MOTOR: {
			ElseMotor elseMotor = (ElseMotor) theEObject;
			T result = caseElseMotor(elseMotor);
			if (result == null)
				result = caseConditionMotor(elseMotor);
			if (result == null)
				result = caseStatement(elseMotor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.SET_THANK: {
			SetThank setThank = (SetThank) theEObject;
			T result = caseSetThank(setThank);
			if (result == null)
				result = caseMultipleMotorActions(setThank);
			if (result == null)
				result = caseStatement(setThank);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.MOVE_LEFT: {
			MoveLeft moveLeft = (MoveLeft) theEObject;
			T result = caseMoveLeft(moveLeft);
			if (result == null)
				result = caseMultipleMotorActions(moveLeft);
			if (result == null)
				result = caseStatement(moveLeft);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Tp_03_02_2022Package.ON_FOR_ROTATION: {
			OnForRotation onForRotation = (OnForRotation) theEObject;
			T result = caseOnForRotation(onForRotation);
			if (result == null)
				result = caseActions(onForRotation);
			if (result == null)
				result = caseStatement(onForRotation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgram(Program object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoop(Loop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhileLoop(WhileLoop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryOperation(BinaryOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableRef(VariableRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignment(Assignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparison(Comparison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substraction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substraction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstraction(Substraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterThan(GreaterThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lower Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lower Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLowerThan(LowerThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqual(Equal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForLoop(ForLoop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddition(Addition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplication(Multiplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Division</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Division</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivision(Division object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Robot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Robot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRobot(Robot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Moteur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Moteur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoteur(Moteur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Left Motor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Left Motor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeftMotor(LeftMotor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right Motor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right Motor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRightMotor(RightMotor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorSensor(ColorSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositionSensor(PositionSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActions(Actions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accelerate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accelerate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccelerate(Accelerate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intensity Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intensity Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntensitySensor(IntensitySensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStop(Stop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotate(Rotate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn On</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn On</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnOn(TurnOn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Light Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Light Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLightSensor(LightSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infrared Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infrared Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfraredSensor(InfraredSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gyro Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gyro Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGyroSensor(GyroSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GPS Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GPS Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGPSSensor(GPSSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ultrasonic Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ultrasonic Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUltrasonicSensor(UltrasonicSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiple Motor Actions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiple Motor Actions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultipleMotorActions(MultipleMotorActions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMove(Move object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Left Rotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Left Rotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeftRotation(LeftRotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right Rotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right Rotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRightRotation(RightRotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditionnal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditionnal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionnal(Conditionnal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfCondition(IfCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarInt(VarInt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Varr String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Varr String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarrString(VarrString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference To Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference To Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceToColor(ReferenceToColor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorRef(ColorRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Motor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Motor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionMotor(ConditionMotor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Motor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Motor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfMotor(IfMotor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Operations On Motors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Operations On Motors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanOperationsOnMotors(BooleanOperationsOnMotors object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equal M</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equal M</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqualM(EqualM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greather Than M</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greather Than M</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreatherThanM(GreatherThanM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Else Motor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Else Motor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElseMotor(ElseMotor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Thank</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Thank</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetThank(SetThank object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Left</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Left</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveLeft(MoveLeft object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On For Rotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On For Rotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnForRotation(OnForRotation object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //Tp_03_02_2022Switch
