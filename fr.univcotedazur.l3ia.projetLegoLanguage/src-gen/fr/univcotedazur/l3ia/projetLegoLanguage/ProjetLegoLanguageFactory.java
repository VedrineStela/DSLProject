/**
 */
package fr.univcotedazur.l3ia.projetLegoLanguage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.univcotedazur.l3ia.projetLegoLanguage.ProjetLegoLanguagePackage
 * @generated
 */
public interface ProjetLegoLanguageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProjetLegoLanguageFactory eINSTANCE = fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguageFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Lego</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lego</em>'.
	 * @generated
	 */
	Lego createLego();

	/**
	 * Returns a new object of class '<em>Robot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robot</em>'.
	 * @generated
	 */
	Robot createRobot();

	/**
	 * Returns a new object of class '<em>Motor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Motor</em>'.
	 * @generated
	 */
	Motor createMotor();

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
	 * Returns a new object of class '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor</em>'.
	 * @generated
	 */
	Sensor createSensor();

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
	 * Returns a new object of class '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port</em>'.
	 * @generated
	 */
	Port createPort();

	/**
	 * Returns a new object of class '<em>Go</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Go</em>'.
	 * @generated
	 */
	Go createGo();

	/**
	 * Returns a new object of class '<em>Right</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Right</em>'.
	 * @generated
	 */
	Right createRight();

	/**
	 * Returns a new object of class '<em>Left</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Left</em>'.
	 * @generated
	 */
	Left createLeft();

	/**
	 * Returns a new object of class '<em>Continue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Continue</em>'.
	 * @generated
	 */
	Continue createContinue();

	/**
	 * Returns a new object of class '<em>Back</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Back</em>'.
	 * @generated
	 */
	Back createBack();

	/**
	 * Returns a new object of class '<em>Shut Down</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shut Down</em>'.
	 * @generated
	 */
	ShutDown createShutDown();

	/**
	 * Returns a new object of class '<em>Down</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Down</em>'.
	 * @generated
	 */
	Down createDown();

	/**
	 * Returns a new object of class '<em>Rotate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rotate</em>'.
	 * @generated
	 */
	Rotate createRotate();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProjetLegoLanguagePackage getProjetLegoLanguagePackage();

} //ProjetLegoLanguageFactory
