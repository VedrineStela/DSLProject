/**
 */
package fr.univcotedazur.l3ia.projetLegoLanguage;

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
 * @see fr.univcotedazur.l3ia.projetLegoLanguage.ProjetLegoLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface ProjetLegoLanguagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "projetLegoLanguage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/projetLegoLanguage";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "projetLegoLanguage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProjetLegoLanguagePackage eINSTANCE = fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl
			.init();

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.NamedElementImpl
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 5;

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
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.LegoImpl <em>Lego</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.LegoImpl
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getLego()
	 * @generated
	 */
	int LEGO = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGO__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Robot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGO__ROBOT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lego</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGO_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Lego</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGO_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.RobotImpl <em>Robot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.RobotImpl
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getRobot()
	 * @generated
	 */
	int ROBOT = 1;

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
	 * The feature id for the '<em><b>Leftmotor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__LEFTMOTOR = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rightmotor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__RIGHTMOTOR = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__SENSOR = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__PORT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__ACTOR = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__ACTION = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ActorImpl
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 10;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.MotorImpl <em>Motor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.MotorImpl
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getMotor()
	 * @generated
	 */
	int MOTOR = 2;

	/**
	 * The number of structural features of the '<em>Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_OPERATION_COUNT = ACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.LeftMotorImpl <em>Left Motor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.LeftMotorImpl
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getLeftMotor()
	 * @generated
	 */
	int LEFT_MOTOR = 3;

	/**
	 * The number of structural features of the '<em>Left Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_MOTOR_FEATURE_COUNT = MOTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Left Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_MOTOR_OPERATION_COUNT = MOTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.RightMotorImpl <em>Right Motor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.RightMotorImpl
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getRightMotor()
	 * @generated
	 */
	int RIGHT_MOTOR = 4;

	/**
	 * The number of structural features of the '<em>Right Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_MOTOR_FEATURE_COUNT = MOTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Right Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_MOTOR_OPERATION_COUNT = MOTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.SensorImpl
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 6;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.ColorSensorImpl <em>Color Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ColorSensorImpl
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getColorSensor()
	 * @generated
	 */
	int COLOR_SENSOR = 7;

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
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.PositionSensorImpl <em>Position Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.PositionSensorImpl
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getPositionSensor()
	 * @generated
	 */
	int POSITION_SENSOR = 8;

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
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.PortImpl
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getPort()
	 * @generated
	 */
	int PORT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ActionImpl
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 11;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.GoImpl <em>Go</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.GoImpl
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getGo()
	 * @generated
	 */
	int GO = 12;

	/**
	 * The number of structural features of the '<em>Go</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Go</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.RightImpl <em>Right</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.RightImpl
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getRight()
	 * @generated
	 */
	int RIGHT = 13;

	/**
	 * The number of structural features of the '<em>Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.LeftImpl <em>Left</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.LeftImpl
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getLeft()
	 * @generated
	 */
	int LEFT = 14;

	/**
	 * The number of structural features of the '<em>Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.ContinueImpl <em>Continue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ContinueImpl
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getContinue()
	 * @generated
	 */
	int CONTINUE = 15;

	/**
	 * The number of structural features of the '<em>Continue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Continue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.BackImpl <em>Back</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.BackImpl
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getBack()
	 * @generated
	 */
	int BACK = 16;

	/**
	 * The number of structural features of the '<em>Back</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Back</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.ShutDownImpl <em>Shut Down</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ShutDownImpl
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getShutDown()
	 * @generated
	 */
	int SHUT_DOWN = 17;

	/**
	 * The number of structural features of the '<em>Shut Down</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUT_DOWN_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Shut Down</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUT_DOWN_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.DownImpl <em>Down</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.DownImpl
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getDown()
	 * @generated
	 */
	int DOWN = 18;

	/**
	 * The number of structural features of the '<em>Down</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWN_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Down</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWN_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.RotateImpl <em>Rotate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.RotateImpl
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getRotate()
	 * @generated
	 */
	int ROTATE = 19;

	/**
	 * The number of structural features of the '<em>Rotate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rotate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.Lego <em>Lego</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lego</em>'.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.Lego
	 * @generated
	 */
	EClass getLego();

	/**
	 * Returns the meta object for the containment reference '{@link fr.univcotedazur.l3ia.projetLegoLanguage.Lego#getRobot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Robot</em>'.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.Lego#getRobot()
	 * @see #getLego()
	 * @generated
	 */
	EReference getLego_Robot();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot</em>'.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.Robot
	 * @generated
	 */
	EClass getRobot();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.univcotedazur.l3ia.projetLegoLanguage.Robot#getMoteur <em>Moteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Moteur</em>'.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.Robot#getMoteur()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_Moteur();

	/**
	 * Returns the meta object for the containment reference '{@link fr.univcotedazur.l3ia.projetLegoLanguage.Robot#getLeftmotor <em>Leftmotor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Leftmotor</em>'.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.Robot#getLeftmotor()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_Leftmotor();

	/**
	 * Returns the meta object for the containment reference '{@link fr.univcotedazur.l3ia.projetLegoLanguage.Robot#getRightmotor <em>Rightmotor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rightmotor</em>'.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.Robot#getRightmotor()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_Rightmotor();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.univcotedazur.l3ia.projetLegoLanguage.Robot#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensor</em>'.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.Robot#getSensor()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_Sensor();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.univcotedazur.l3ia.projetLegoLanguage.Robot#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.Robot#getPort()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_Port();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.univcotedazur.l3ia.projetLegoLanguage.Robot#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actor</em>'.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.Robot#getActor()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_Actor();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.univcotedazur.l3ia.projetLegoLanguage.Robot#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.Robot#getAction()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_Action();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.Motor <em>Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motor</em>'.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.Motor
	 * @generated
	 */
	EClass getMotor();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.LeftMotor <em>Left Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left Motor</em>'.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.LeftMotor
	 * @generated
	 */
	EClass getLeftMotor();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.RightMotor <em>Right Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right Motor</em>'.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.RightMotor
	 * @generated
	 */
	EClass getRightMotor();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazur.l3ia.projetLegoLanguage.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.ColorSensor <em>Color Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Sensor</em>'.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.ColorSensor
	 * @generated
	 */
	EClass getColorSensor();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.PositionSensor <em>Position Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position Sensor</em>'.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.PositionSensor
	 * @generated
	 */
	EClass getPositionSensor();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.Go <em>Go</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Go</em>'.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.Go
	 * @generated
	 */
	EClass getGo();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.Right <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right</em>'.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.Right
	 * @generated
	 */
	EClass getRight();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.Left <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left</em>'.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.Left
	 * @generated
	 */
	EClass getLeft();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.Continue <em>Continue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continue</em>'.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.Continue
	 * @generated
	 */
	EClass getContinue();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.Back <em>Back</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Back</em>'.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.Back
	 * @generated
	 */
	EClass getBack();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.ShutDown <em>Shut Down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shut Down</em>'.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.ShutDown
	 * @generated
	 */
	EClass getShutDown();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.Down <em>Down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Down</em>'.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.Down
	 * @generated
	 */
	EClass getDown();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.Rotate <em>Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotate</em>'.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.Rotate
	 * @generated
	 */
	EClass getRotate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProjetLegoLanguageFactory getProjetLegoLanguageFactory();

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
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.LegoImpl <em>Lego</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.LegoImpl
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getLego()
		 * @generated
		 */
		EClass LEGO = eINSTANCE.getLego();

		/**
		 * The meta object literal for the '<em><b>Robot</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGO__ROBOT = eINSTANCE.getLego_Robot();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.RobotImpl <em>Robot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.RobotImpl
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getRobot()
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
		 * The meta object literal for the '<em><b>Leftmotor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__LEFTMOTOR = eINSTANCE.getRobot_Leftmotor();

		/**
		 * The meta object literal for the '<em><b>Rightmotor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__RIGHTMOTOR = eINSTANCE.getRobot_Rightmotor();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__SENSOR = eINSTANCE.getRobot_Sensor();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__PORT = eINSTANCE.getRobot_Port();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__ACTOR = eINSTANCE.getRobot_Actor();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__ACTION = eINSTANCE.getRobot_Action();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.MotorImpl <em>Motor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.MotorImpl
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getMotor()
		 * @generated
		 */
		EClass MOTOR = eINSTANCE.getMotor();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.LeftMotorImpl <em>Left Motor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.LeftMotorImpl
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getLeftMotor()
		 * @generated
		 */
		EClass LEFT_MOTOR = eINSTANCE.getLeftMotor();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.RightMotorImpl <em>Right Motor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.RightMotorImpl
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getRightMotor()
		 * @generated
		 */
		EClass RIGHT_MOTOR = eINSTANCE.getRightMotor();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.NamedElementImpl
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getNamedElement()
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
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.SensorImpl
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.ColorSensorImpl <em>Color Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ColorSensorImpl
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getColorSensor()
		 * @generated
		 */
		EClass COLOR_SENSOR = eINSTANCE.getColorSensor();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.PositionSensorImpl <em>Position Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.PositionSensorImpl
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getPositionSensor()
		 * @generated
		 */
		EClass POSITION_SENSOR = eINSTANCE.getPositionSensor();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.PortImpl
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ActorImpl
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ActionImpl
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.GoImpl <em>Go</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.GoImpl
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getGo()
		 * @generated
		 */
		EClass GO = eINSTANCE.getGo();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.RightImpl <em>Right</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.RightImpl
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getRight()
		 * @generated
		 */
		EClass RIGHT = eINSTANCE.getRight();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.LeftImpl <em>Left</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.LeftImpl
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getLeft()
		 * @generated
		 */
		EClass LEFT = eINSTANCE.getLeft();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.ContinueImpl <em>Continue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ContinueImpl
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getContinue()
		 * @generated
		 */
		EClass CONTINUE = eINSTANCE.getContinue();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.BackImpl <em>Back</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.BackImpl
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getBack()
		 * @generated
		 */
		EClass BACK = eINSTANCE.getBack();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.ShutDownImpl <em>Shut Down</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ShutDownImpl
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getShutDown()
		 * @generated
		 */
		EClass SHUT_DOWN = eINSTANCE.getShutDown();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.DownImpl <em>Down</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.DownImpl
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getDown()
		 * @generated
		 */
		EClass DOWN = eINSTANCE.getDown();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.RotateImpl <em>Rotate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.RotateImpl
		 * @see fr.univcotedazur.l3ia.projetLegoLanguage.impl.ProjetLegoLanguagePackageImpl#getRotate()
		 * @generated
		 */
		EClass ROTATE = eINSTANCE.getRotate();

	}

} //ProjetLegoLanguagePackage
