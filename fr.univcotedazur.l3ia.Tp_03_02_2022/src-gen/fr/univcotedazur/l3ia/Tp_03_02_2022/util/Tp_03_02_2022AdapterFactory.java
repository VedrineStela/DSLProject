/**
 */
package fr.univcotedazur.l3ia.Tp_03_02_2022.util;

import fr.univcotedazur.l3ia.Tp_03_02_2022.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package
 * @generated
 */
public class Tp_03_02_2022AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Tp_03_02_2022Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tp_03_02_2022AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Tp_03_02_2022Package.eINSTANCE;
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
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tp_03_02_2022Switch<Adapter> modelSwitch = new Tp_03_02_2022Switch<Adapter>() {
		@Override
		public Adapter caseProgram(Program object) {
			return createProgramAdapter();
		}

		@Override
		public Adapter caseVariable(Variable object) {
			return createVariableAdapter();
		}

		@Override
		public Adapter caseStatement(Statement object) {
			return createStatementAdapter();
		}

		@Override
		public Adapter caseLoop(Loop object) {
			return createLoopAdapter();
		}

		@Override
		public Adapter caseWhileLoop(WhileLoop object) {
			return createWhileLoopAdapter();
		}

		@Override
		public Adapter caseExpression(Expression object) {
			return createExpressionAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseBinaryOperation(BinaryOperation object) {
			return createBinaryOperationAdapter();
		}

		@Override
		public Adapter caseVariableRef(VariableRef object) {
			return createVariableRefAdapter();
		}

		@Override
		public Adapter caseAssignment(Assignment object) {
			return createAssignmentAdapter();
		}

		@Override
		public Adapter caseComparison(Comparison object) {
			return createComparisonAdapter();
		}

		@Override
		public Adapter caseSubstraction(Substraction object) {
			return createSubstractionAdapter();
		}

		@Override
		public Adapter caseGreaterThan(GreaterThan object) {
			return createGreaterThanAdapter();
		}

		@Override
		public Adapter caseLowerThan(LowerThan object) {
			return createLowerThanAdapter();
		}

		@Override
		public Adapter caseEqual(Equal object) {
			return createEqualAdapter();
		}

		@Override
		public Adapter caseForLoop(ForLoop object) {
			return createForLoopAdapter();
		}

		@Override
		public Adapter caseAddition(Addition object) {
			return createAdditionAdapter();
		}

		@Override
		public Adapter caseMultiplication(Multiplication object) {
			return createMultiplicationAdapter();
		}

		@Override
		public Adapter caseDivision(Division object) {
			return createDivisionAdapter();
		}

		@Override
		public Adapter caseRobot(Robot object) {
			return createRobotAdapter();
		}

		@Override
		public Adapter caseMoteur(Moteur object) {
			return createMoteurAdapter();
		}

		@Override
		public Adapter caseLeftMotor(LeftMotor object) {
			return createLeftMotorAdapter();
		}

		@Override
		public Adapter caseRightMotor(RightMotor object) {
			return createRightMotorAdapter();
		}

		@Override
		public Adapter caseSensor(Sensor object) {
			return createSensorAdapter();
		}

		@Override
		public Adapter caseColorSensor(ColorSensor object) {
			return createColorSensorAdapter();
		}

		@Override
		public Adapter casePositionSensor(PositionSensor object) {
			return createPositionSensorAdapter();
		}

		@Override
		public Adapter caseActions(Actions object) {
			return createActionsAdapter();
		}

		@Override
		public Adapter caseAccelerate(Accelerate object) {
			return createAccelerateAdapter();
		}

		@Override
		public Adapter caseIntensitySensor(IntensitySensor object) {
			return createIntensitySensorAdapter();
		}

		@Override
		public Adapter caseStop(Stop object) {
			return createStopAdapter();
		}

		@Override
		public Adapter caseRotate(Rotate object) {
			return createRotateAdapter();
		}

		@Override
		public Adapter caseTurnOn(TurnOn object) {
			return createTurnOnAdapter();
		}

		@Override
		public Adapter caseLightSensor(LightSensor object) {
			return createLightSensorAdapter();
		}

		@Override
		public Adapter caseInfraredSensor(InfraredSensor object) {
			return createInfraredSensorAdapter();
		}

		@Override
		public Adapter caseGyroSensor(GyroSensor object) {
			return createGyroSensorAdapter();
		}

		@Override
		public Adapter caseGPSSensor(GPSSensor object) {
			return createGPSSensorAdapter();
		}

		@Override
		public Adapter caseUltrasonicSensor(UltrasonicSensor object) {
			return createUltrasonicSensorAdapter();
		}

		@Override
		public Adapter caseMultipleMotorActions(MultipleMotorActions object) {
			return createMultipleMotorActionsAdapter();
		}

		@Override
		public Adapter caseMove(Move object) {
			return createMoveAdapter();
		}

		@Override
		public Adapter caseLeftRotation(LeftRotation object) {
			return createLeftRotationAdapter();
		}

		@Override
		public Adapter caseRightRotation(RightRotation object) {
			return createRightRotationAdapter();
		}

		@Override
		public Adapter caseConditionnal(Conditionnal object) {
			return createConditionnalAdapter();
		}

		@Override
		public Adapter caseIfCondition(IfCondition object) {
			return createIfConditionAdapter();
		}

		@Override
		public Adapter caseVarInt(VarInt object) {
			return createVarIntAdapter();
		}

		@Override
		public Adapter caseVarrString(VarrString object) {
			return createVarrStringAdapter();
		}

		@Override
		public Adapter caseReferenceToColor(ReferenceToColor object) {
			return createReferenceToColorAdapter();
		}

		@Override
		public Adapter caseColorRef(ColorRef object) {
			return createColorRefAdapter();
		}

		@Override
		public Adapter caseReference(Reference object) {
			return createReferenceAdapter();
		}

		@Override
		public Adapter caseConditionMotor(ConditionMotor object) {
			return createConditionMotorAdapter();
		}

		@Override
		public Adapter caseIfMotor(IfMotor object) {
			return createIfMotorAdapter();
		}

		@Override
		public Adapter caseBooleanOperationsOnMotors(BooleanOperationsOnMotors object) {
			return createBooleanOperationsOnMotorsAdapter();
		}

		@Override
		public Adapter caseEqualM(EqualM object) {
			return createEqualMAdapter();
		}

		@Override
		public Adapter caseGreatherThanM(GreatherThanM object) {
			return createGreatherThanMAdapter();
		}

		@Override
		public Adapter caseElseMotor(ElseMotor object) {
			return createElseMotorAdapter();
		}

		@Override
		public Adapter caseSetThank(SetThank object) {
			return createSetThankAdapter();
		}

		@Override
		public Adapter caseMoveLeft(MoveLeft object) {
			return createMoveLeftAdapter();
		}

		@Override
		public Adapter caseOnForRotation(OnForRotation object) {
			return createOnForRotationAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
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
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Program
	 * @generated
	 */
	public Adapter createProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Loop
	 * @generated
	 */
	public Adapter createLoopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.WhileLoop <em>While Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.WhileLoop
	 * @generated
	 */
	public Adapter createWhileLoopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.BinaryOperation <em>Binary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.BinaryOperation
	 * @generated
	 */
	public Adapter createBinaryOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.VariableRef <em>Variable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.VariableRef
	 * @generated
	 */
	public Adapter createVariableRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Assignment
	 * @generated
	 */
	public Adapter createAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Comparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Comparison
	 * @generated
	 */
	public Adapter createComparisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Substraction <em>Substraction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Substraction
	 * @generated
	 */
	public Adapter createSubstractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.GreaterThan <em>Greater Than</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.GreaterThan
	 * @generated
	 */
	public Adapter createGreaterThanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.LowerThan <em>Lower Than</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.LowerThan
	 * @generated
	 */
	public Adapter createLowerThanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Equal <em>Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Equal
	 * @generated
	 */
	public Adapter createEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.ForLoop <em>For Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.ForLoop
	 * @generated
	 */
	public Adapter createForLoopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Addition <em>Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Addition
	 * @generated
	 */
	public Adapter createAdditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Multiplication <em>Multiplication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Multiplication
	 * @generated
	 */
	public Adapter createMultiplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Division
	 * @generated
	 */
	public Adapter createDivisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Robot
	 * @generated
	 */
	public Adapter createRobotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Moteur <em>Moteur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Moteur
	 * @generated
	 */
	public Adapter createMoteurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.LeftMotor <em>Left Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.LeftMotor
	 * @generated
	 */
	public Adapter createLeftMotorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.RightMotor <em>Right Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.RightMotor
	 * @generated
	 */
	public Adapter createRightMotorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.ColorSensor <em>Color Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.ColorSensor
	 * @generated
	 */
	public Adapter createColorSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.PositionSensor <em>Position Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.PositionSensor
	 * @generated
	 */
	public Adapter createPositionSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Actions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Actions
	 * @generated
	 */
	public Adapter createActionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Accelerate <em>Accelerate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Accelerate
	 * @generated
	 */
	public Adapter createAccelerateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.IntensitySensor <em>Intensity Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.IntensitySensor
	 * @generated
	 */
	public Adapter createIntensitySensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Stop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Stop
	 * @generated
	 */
	public Adapter createStopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Rotate <em>Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Rotate
	 * @generated
	 */
	public Adapter createRotateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.TurnOn <em>Turn On</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.TurnOn
	 * @generated
	 */
	public Adapter createTurnOnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.LightSensor <em>Light Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.LightSensor
	 * @generated
	 */
	public Adapter createLightSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.InfraredSensor <em>Infrared Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.InfraredSensor
	 * @generated
	 */
	public Adapter createInfraredSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.GyroSensor <em>Gyro Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.GyroSensor
	 * @generated
	 */
	public Adapter createGyroSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.GPSSensor <em>GPS Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.GPSSensor
	 * @generated
	 */
	public Adapter createGPSSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.UltrasonicSensor <em>Ultrasonic Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.UltrasonicSensor
	 * @generated
	 */
	public Adapter createUltrasonicSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.MultipleMotorActions <em>Multiple Motor Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.MultipleMotorActions
	 * @generated
	 */
	public Adapter createMultipleMotorActionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Move
	 * @generated
	 */
	public Adapter createMoveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.LeftRotation <em>Left Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.LeftRotation
	 * @generated
	 */
	public Adapter createLeftRotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.RightRotation <em>Right Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.RightRotation
	 * @generated
	 */
	public Adapter createRightRotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Conditionnal <em>Conditionnal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Conditionnal
	 * @generated
	 */
	public Adapter createConditionnalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.IfCondition <em>If Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.IfCondition
	 * @generated
	 */
	public Adapter createIfConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.VarInt <em>Var Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.VarInt
	 * @generated
	 */
	public Adapter createVarIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.VarrString <em>Varr String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.VarrString
	 * @generated
	 */
	public Adapter createVarrStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.ReferenceToColor <em>Reference To Color</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.ReferenceToColor
	 * @generated
	 */
	public Adapter createReferenceToColorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.ColorRef <em>Color Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.ColorRef
	 * @generated
	 */
	public Adapter createColorRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.ConditionMotor <em>Condition Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.ConditionMotor
	 * @generated
	 */
	public Adapter createConditionMotorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.IfMotor <em>If Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.IfMotor
	 * @generated
	 */
	public Adapter createIfMotorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.BooleanOperationsOnMotors <em>Boolean Operations On Motors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.BooleanOperationsOnMotors
	 * @generated
	 */
	public Adapter createBooleanOperationsOnMotorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.EqualM <em>Equal M</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.EqualM
	 * @generated
	 */
	public Adapter createEqualMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.GreatherThanM <em>Greather Than M</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.GreatherThanM
	 * @generated
	 */
	public Adapter createGreatherThanMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.ElseMotor <em>Else Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.ElseMotor
	 * @generated
	 */
	public Adapter createElseMotorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.SetThank <em>Set Thank</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.SetThank
	 * @generated
	 */
	public Adapter createSetThankAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.MoveLeft <em>Move Left</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.MoveLeft
	 * @generated
	 */
	public Adapter createMoveLeftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.OnForRotation <em>On For Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.OnForRotation
	 * @generated
	 */
	public Adapter createOnForRotationAdapter() {
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
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Tp_03_02_2022AdapterFactory
