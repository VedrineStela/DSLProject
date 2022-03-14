/**
 */
package fr.univcotedazur.l3ia.projetLegoLanguage.impl;

import fr.univcotedazur.l3ia.projetLegoLanguage.Action;
import fr.univcotedazur.l3ia.projetLegoLanguage.Actor;
import fr.univcotedazur.l3ia.projetLegoLanguage.Back;
import fr.univcotedazur.l3ia.projetLegoLanguage.ColorSensor;
import fr.univcotedazur.l3ia.projetLegoLanguage.Continue;
import fr.univcotedazur.l3ia.projetLegoLanguage.Down;
import fr.univcotedazur.l3ia.projetLegoLanguage.Go;
import fr.univcotedazur.l3ia.projetLegoLanguage.Left;
import fr.univcotedazur.l3ia.projetLegoLanguage.LeftMotor;
import fr.univcotedazur.l3ia.projetLegoLanguage.Lego;
import fr.univcotedazur.l3ia.projetLegoLanguage.Motor;
import fr.univcotedazur.l3ia.projetLegoLanguage.NamedElement;
import fr.univcotedazur.l3ia.projetLegoLanguage.Port;
import fr.univcotedazur.l3ia.projetLegoLanguage.PositionSensor;
import fr.univcotedazur.l3ia.projetLegoLanguage.ProjetLegoLanguageFactory;
import fr.univcotedazur.l3ia.projetLegoLanguage.ProjetLegoLanguagePackage;
import fr.univcotedazur.l3ia.projetLegoLanguage.Right;
import fr.univcotedazur.l3ia.projetLegoLanguage.RightMotor;
import fr.univcotedazur.l3ia.projetLegoLanguage.Robot;
import fr.univcotedazur.l3ia.projetLegoLanguage.Rotate;
import fr.univcotedazur.l3ia.projetLegoLanguage.Sensor;
import fr.univcotedazur.l3ia.projetLegoLanguage.ShutDown;

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
public class ProjetLegoLanguagePackageImpl extends EPackageImpl implements ProjetLegoLanguagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legoEClass = null;

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
	private EClass motorEClass = null;

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
	private EClass namedElementEClass = null;

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
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shutDownEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass downEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rotateEClass = null;

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
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.ProjetLegoLanguagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProjetLegoLanguagePackageImpl() {
		super(eNS_URI, ProjetLegoLanguageFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ProjetLegoLanguagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProjetLegoLanguagePackage init() {
		if (isInited)
			return (ProjetLegoLanguagePackage) EPackage.Registry.INSTANCE
					.getEPackage(ProjetLegoLanguagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredProjetLegoLanguagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ProjetLegoLanguagePackageImpl theProjetLegoLanguagePackage = registeredProjetLegoLanguagePackage instanceof ProjetLegoLanguagePackageImpl
				? (ProjetLegoLanguagePackageImpl) registeredProjetLegoLanguagePackage
				: new ProjetLegoLanguagePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theProjetLegoLanguagePackage.createPackageContents();

		// Initialize created meta-data
		theProjetLegoLanguagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProjetLegoLanguagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProjetLegoLanguagePackage.eNS_URI, theProjetLegoLanguagePackage);
		return theProjetLegoLanguagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLego() {
		return legoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLego_Robot() {
		return (EReference) legoEClass.getEStructuralFeatures().get(0);
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
	public EReference getRobot_Leftmotor() {
		return (EReference) robotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobot_Rightmotor() {
		return (EReference) robotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobot_Sensor() {
		return (EReference) robotEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobot_Port() {
		return (EReference) robotEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobot_Actor() {
		return (EReference) robotEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobot_Action() {
		return (EReference) robotEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMotor() {
		return motorEClass;
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
	public EClass getSensor() {
		return sensorEClass;
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
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGo() {
		return goEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRight() {
		return rightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeft() {
		return leftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinue() {
		return continueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBack() {
		return backEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShutDown() {
		return shutDownEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDown() {
		return downEClass;
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
	public ProjetLegoLanguageFactory getProjetLegoLanguageFactory() {
		return (ProjetLegoLanguageFactory) getEFactoryInstance();
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
		legoEClass = createEClass(LEGO);
		createEReference(legoEClass, LEGO__ROBOT);

		robotEClass = createEClass(ROBOT);
		createEReference(robotEClass, ROBOT__MOTEUR);
		createEReference(robotEClass, ROBOT__LEFTMOTOR);
		createEReference(robotEClass, ROBOT__RIGHTMOTOR);
		createEReference(robotEClass, ROBOT__SENSOR);
		createEReference(robotEClass, ROBOT__PORT);
		createEReference(robotEClass, ROBOT__ACTOR);
		createEReference(robotEClass, ROBOT__ACTION);

		motorEClass = createEClass(MOTOR);

		leftMotorEClass = createEClass(LEFT_MOTOR);

		rightMotorEClass = createEClass(RIGHT_MOTOR);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		sensorEClass = createEClass(SENSOR);

		colorSensorEClass = createEClass(COLOR_SENSOR);

		positionSensorEClass = createEClass(POSITION_SENSOR);

		portEClass = createEClass(PORT);

		actorEClass = createEClass(ACTOR);

		actionEClass = createEClass(ACTION);

		goEClass = createEClass(GO);

		rightEClass = createEClass(RIGHT);

		leftEClass = createEClass(LEFT);

		continueEClass = createEClass(CONTINUE);

		backEClass = createEClass(BACK);

		shutDownEClass = createEClass(SHUT_DOWN);

		downEClass = createEClass(DOWN);

		rotateEClass = createEClass(ROTATE);
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
		legoEClass.getESuperTypes().add(this.getNamedElement());
		robotEClass.getESuperTypes().add(this.getNamedElement());
		motorEClass.getESuperTypes().add(this.getActor());
		leftMotorEClass.getESuperTypes().add(this.getMotor());
		rightMotorEClass.getESuperTypes().add(this.getMotor());
		colorSensorEClass.getESuperTypes().add(this.getSensor());
		positionSensorEClass.getESuperTypes().add(this.getSensor());
		portEClass.getESuperTypes().add(this.getNamedElement());
		goEClass.getESuperTypes().add(this.getAction());
		rightEClass.getESuperTypes().add(this.getAction());
		leftEClass.getESuperTypes().add(this.getAction());
		continueEClass.getESuperTypes().add(this.getAction());
		backEClass.getESuperTypes().add(this.getAction());
		shutDownEClass.getESuperTypes().add(this.getAction());
		downEClass.getESuperTypes().add(this.getAction());
		rotateEClass.getESuperTypes().add(this.getAction());

		// Initialize classes, features, and operations; add parameters
		initEClass(legoEClass, Lego.class, "Lego", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLego_Robot(), this.getRobot(), null, "robot", null, 0, 1, Lego.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(robotEClass, Robot.class, "Robot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRobot_Moteur(), this.getMotor(), null, "moteur", null, 1, -1, Robot.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getRobot_Leftmotor(), this.getLeftMotor(), null, "leftmotor", null, 1, 1, Robot.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRobot_Rightmotor(), this.getRightMotor(), null, "rightmotor", null, 1, 1, Robot.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRobot_Sensor(), this.getSensor(), null, "sensor", null, 0, -1, Robot.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getRobot_Port(), this.getPort(), null, "port", null, 0, -1, Robot.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getRobot_Actor(), this.getActor(), null, "actor", null, 0, -1, Robot.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getRobot_Action(), this.getAction(), null, "action", null, 0, -1, Robot.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(motorEClass, Motor.class, "Motor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(leftMotorEClass, LeftMotor.class, "LeftMotor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(rightMotorEClass, RightMotor.class, "RightMotor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(colorSensorEClass, ColorSensor.class, "ColorSensor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(positionSensorEClass, PositionSensor.class, "PositionSensor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actorEClass, Actor.class, "Actor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(goEClass, Go.class, "Go", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rightEClass, Right.class, "Right", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(leftEClass, Left.class, "Left", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(continueEClass, Continue.class, "Continue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(backEClass, Back.class, "Back", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shutDownEClass, ShutDown.class, "ShutDown", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(downEClass, Down.class, "Down", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rotateEClass, Rotate.class, "Rotate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ProjetLegoLanguagePackageImpl
