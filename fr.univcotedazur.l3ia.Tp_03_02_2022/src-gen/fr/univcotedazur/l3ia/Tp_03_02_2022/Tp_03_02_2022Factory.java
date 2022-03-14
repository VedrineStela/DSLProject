/**
 */
package fr.univcotedazur.l3ia.Tp_03_02_2022;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package
 * @generated
 */
public interface Tp_03_02_2022Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Tp_03_02_2022Factory eINSTANCE = fr.univcotedazur.l3ia.Tp_03_02_2022.impl.Tp_03_02_2022FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program</em>'.
	 * @generated
	 */
	Program createProgram();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement</em>'.
	 * @generated
	 */
	Statement createStatement();

	/**
	 * Returns a new object of class '<em>While Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>While Loop</em>'.
	 * @generated
	 */
	WhileLoop createWhileLoop();

	/**
	 * Returns a new object of class '<em>Variable Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Ref</em>'.
	 * @generated
	 */
	VariableRef createVariableRef();

	/**
	 * Returns a new object of class '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment</em>'.
	 * @generated
	 */
	Assignment createAssignment();

	/**
	 * Returns a new object of class '<em>Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comparison</em>'.
	 * @generated
	 */
	Comparison createComparison();

	/**
	 * Returns a new object of class '<em>Substraction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substraction</em>'.
	 * @generated
	 */
	Substraction createSubstraction();

	/**
	 * Returns a new object of class '<em>Greater Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Greater Than</em>'.
	 * @generated
	 */
	GreaterThan createGreaterThan();

	/**
	 * Returns a new object of class '<em>Lower Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lower Than</em>'.
	 * @generated
	 */
	LowerThan createLowerThan();

	/**
	 * Returns a new object of class '<em>Equal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equal</em>'.
	 * @generated
	 */
	Equal createEqual();

	/**
	 * Returns a new object of class '<em>For Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>For Loop</em>'.
	 * @generated
	 */
	ForLoop createForLoop();

	/**
	 * Returns a new object of class '<em>Addition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Addition</em>'.
	 * @generated
	 */
	Addition createAddition();

	/**
	 * Returns a new object of class '<em>Multiplication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiplication</em>'.
	 * @generated
	 */
	Multiplication createMultiplication();

	/**
	 * Returns a new object of class '<em>Division</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Division</em>'.
	 * @generated
	 */
	Division createDivision();

	/**
	 * Returns a new object of class '<em>Robot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robot</em>'.
	 * @generated
	 */
	Robot createRobot();

	/**
	 * Returns a new object of class '<em>Left Motor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Left Motor</em>'.
	 * @generated
	 */
	LeftMotor createLeftMotor();

	/**
	 * Returns a new object of class '<em>Right Motor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Right Motor</em>'.
	 * @generated
	 */
	RightMotor createRightMotor();

	/**
	 * Returns a new object of class '<em>Color Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Color Sensor</em>'.
	 * @generated
	 */
	ColorSensor createColorSensor();

	/**
	 * Returns a new object of class '<em>Position Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position Sensor</em>'.
	 * @generated
	 */
	PositionSensor createPositionSensor();

	/**
	 * Returns a new object of class '<em>Accelerate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accelerate</em>'.
	 * @generated
	 */
	Accelerate createAccelerate();

	/**
	 * Returns a new object of class '<em>Intensity Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intensity Sensor</em>'.
	 * @generated
	 */
	IntensitySensor createIntensitySensor();

	/**
	 * Returns a new object of class '<em>Stop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop</em>'.
	 * @generated
	 */
	Stop createStop();

	/**
	 * Returns a new object of class '<em>Turn On</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turn On</em>'.
	 * @generated
	 */
	TurnOn createTurnOn();

	/**
	 * Returns a new object of class '<em>Light Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Light Sensor</em>'.
	 * @generated
	 */
	LightSensor createLightSensor();

	/**
	 * Returns a new object of class '<em>Infrared Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infrared Sensor</em>'.
	 * @generated
	 */
	InfraredSensor createInfraredSensor();

	/**
	 * Returns a new object of class '<em>Gyro Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gyro Sensor</em>'.
	 * @generated
	 */
	GyroSensor createGyroSensor();

	/**
	 * Returns a new object of class '<em>GPS Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GPS Sensor</em>'.
	 * @generated
	 */
	GPSSensor createGPSSensor();

	/**
	 * Returns a new object of class '<em>Ultrasonic Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ultrasonic Sensor</em>'.
	 * @generated
	 */
	UltrasonicSensor createUltrasonicSensor();

	/**
	 * Returns a new object of class '<em>Move</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move</em>'.
	 * @generated
	 */
	Move createMove();

	/**
	 * Returns a new object of class '<em>Left Rotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Left Rotation</em>'.
	 * @generated
	 */
	LeftRotation createLeftRotation();

	/**
	 * Returns a new object of class '<em>Right Rotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Right Rotation</em>'.
	 * @generated
	 */
	RightRotation createRightRotation();

	/**
	 * Returns a new object of class '<em>If Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Condition</em>'.
	 * @generated
	 */
	IfCondition createIfCondition();

	/**
	 * Returns a new object of class '<em>Var Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Var Int</em>'.
	 * @generated
	 */
	VarInt createVarInt();

	/**
	 * Returns a new object of class '<em>Varr String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Varr String</em>'.
	 * @generated
	 */
	VarrString createVarrString();

	/**
	 * Returns a new object of class '<em>Reference To Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference To Color</em>'.
	 * @generated
	 */
	ReferenceToColor createReferenceToColor();

	/**
	 * Returns a new object of class '<em>Color Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Color Ref</em>'.
	 * @generated
	 */
	ColorRef createColorRef();

	/**
	 * Returns a new object of class '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference</em>'.
	 * @generated
	 */
	Reference createReference();

	/**
	 * Returns a new object of class '<em>If Motor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Motor</em>'.
	 * @generated
	 */
	IfMotor createIfMotor();

	/**
	 * Returns a new object of class '<em>Equal M</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equal M</em>'.
	 * @generated
	 */
	EqualM createEqualM();

	/**
	 * Returns a new object of class '<em>Greather Than M</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Greather Than M</em>'.
	 * @generated
	 */
	GreatherThanM createGreatherThanM();

	/**
	 * Returns a new object of class '<em>Else Motor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Else Motor</em>'.
	 * @generated
	 */
	ElseMotor createElseMotor();

	/**
	 * Returns a new object of class '<em>Set Thank</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Thank</em>'.
	 * @generated
	 */
	SetThank createSetThank();

	/**
	 * Returns a new object of class '<em>Move Left</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Left</em>'.
	 * @generated
	 */
	MoveLeft createMoveLeft();

	/**
	 * Returns a new object of class '<em>On For Rotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>On For Rotation</em>'.
	 * @generated
	 */
	OnForRotation createOnForRotation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Tp_03_02_2022Package getTp_03_02_2022Package();

} //Tp_03_02_2022Factory
