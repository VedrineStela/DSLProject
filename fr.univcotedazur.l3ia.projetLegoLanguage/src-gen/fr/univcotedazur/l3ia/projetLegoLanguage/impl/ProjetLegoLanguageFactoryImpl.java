/**
 */
package fr.univcotedazur.l3ia.projetLegoLanguage.impl;

import fr.univcotedazur.l3ia.projetLegoLanguage.*;

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
public class ProjetLegoLanguageFactoryImpl extends EFactoryImpl implements ProjetLegoLanguageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProjetLegoLanguageFactory init() {
		try {
			ProjetLegoLanguageFactory theProjetLegoLanguageFactory = (ProjetLegoLanguageFactory) EPackage.Registry.INSTANCE
					.getEFactory(ProjetLegoLanguagePackage.eNS_URI);
			if (theProjetLegoLanguageFactory != null) {
				return theProjetLegoLanguageFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProjetLegoLanguageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjetLegoLanguageFactoryImpl() {
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
		case ProjetLegoLanguagePackage.LEGO:
			return createLego();
		case ProjetLegoLanguagePackage.ROBOT:
			return createRobot();
		case ProjetLegoLanguagePackage.MOTOR:
			return createMotor();
		case ProjetLegoLanguagePackage.LEFT_MOTOR:
			return createLeftMotor();
		case ProjetLegoLanguagePackage.RIGHT_MOTOR:
			return createRightMotor();
		case ProjetLegoLanguagePackage.SENSOR:
			return createSensor();
		case ProjetLegoLanguagePackage.COLOR_SENSOR:
			return createColorSensor();
		case ProjetLegoLanguagePackage.POSITION_SENSOR:
			return createPositionSensor();
		case ProjetLegoLanguagePackage.PORT:
			return createPort();
		case ProjetLegoLanguagePackage.GO:
			return createGo();
		case ProjetLegoLanguagePackage.RIGHT:
			return createRight();
		case ProjetLegoLanguagePackage.LEFT:
			return createLeft();
		case ProjetLegoLanguagePackage.CONTINUE:
			return createContinue();
		case ProjetLegoLanguagePackage.BACK:
			return createBack();
		case ProjetLegoLanguagePackage.SHUT_DOWN:
			return createShutDown();
		case ProjetLegoLanguagePackage.DOWN:
			return createDown();
		case ProjetLegoLanguagePackage.ROTATE:
			return createRotate();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lego createLego() {
		LegoImpl lego = new LegoImpl();
		return lego;
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
	public Motor createMotor() {
		MotorImpl motor = new MotorImpl();
		return motor;
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
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
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
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Go createGo() {
		GoImpl go = new GoImpl();
		return go;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Right createRight() {
		RightImpl right = new RightImpl();
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Left createLeft() {
		LeftImpl left = new LeftImpl();
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Continue createContinue() {
		ContinueImpl continue_ = new ContinueImpl();
		return continue_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Back createBack() {
		BackImpl back = new BackImpl();
		return back;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShutDown createShutDown() {
		ShutDownImpl shutDown = new ShutDownImpl();
		return shutDown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Down createDown() {
		DownImpl down = new DownImpl();
		return down;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rotate createRotate() {
		RotateImpl rotate = new RotateImpl();
		return rotate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjetLegoLanguagePackage getProjetLegoLanguagePackage() {
		return (ProjetLegoLanguagePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProjetLegoLanguagePackage getPackage() {
		return ProjetLegoLanguagePackage.eINSTANCE;
	}

} //ProjetLegoLanguageFactoryImpl
