/**
 */
package fr.univcotedazur.l3ia.projetLegoLanguage.util;

import fr.univcotedazur.l3ia.projetLegoLanguage.*;

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
 * @see fr.univcotedazur.l3ia.projetLegoLanguage.ProjetLegoLanguagePackage
 * @generated
 */
public class ProjetLegoLanguageSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProjetLegoLanguagePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjetLegoLanguageSwitch() {
		if (modelPackage == null) {
			modelPackage = ProjetLegoLanguagePackage.eINSTANCE;
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
		case ProjetLegoLanguagePackage.LEGO: {
			Lego lego = (Lego) theEObject;
			T result = caseLego(lego);
			if (result == null)
				result = caseNamedElement(lego);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetLegoLanguagePackage.ROBOT: {
			Robot robot = (Robot) theEObject;
			T result = caseRobot(robot);
			if (result == null)
				result = caseNamedElement(robot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetLegoLanguagePackage.MOTOR: {
			Motor motor = (Motor) theEObject;
			T result = caseMotor(motor);
			if (result == null)
				result = caseActor(motor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetLegoLanguagePackage.LEFT_MOTOR: {
			LeftMotor leftMotor = (LeftMotor) theEObject;
			T result = caseLeftMotor(leftMotor);
			if (result == null)
				result = caseMotor(leftMotor);
			if (result == null)
				result = caseActor(leftMotor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetLegoLanguagePackage.RIGHT_MOTOR: {
			RightMotor rightMotor = (RightMotor) theEObject;
			T result = caseRightMotor(rightMotor);
			if (result == null)
				result = caseMotor(rightMotor);
			if (result == null)
				result = caseActor(rightMotor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetLegoLanguagePackage.NAMED_ELEMENT: {
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetLegoLanguagePackage.SENSOR: {
			Sensor sensor = (Sensor) theEObject;
			T result = caseSensor(sensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetLegoLanguagePackage.COLOR_SENSOR: {
			ColorSensor colorSensor = (ColorSensor) theEObject;
			T result = caseColorSensor(colorSensor);
			if (result == null)
				result = caseSensor(colorSensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetLegoLanguagePackage.POSITION_SENSOR: {
			PositionSensor positionSensor = (PositionSensor) theEObject;
			T result = casePositionSensor(positionSensor);
			if (result == null)
				result = caseSensor(positionSensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetLegoLanguagePackage.PORT: {
			Port port = (Port) theEObject;
			T result = casePort(port);
			if (result == null)
				result = caseNamedElement(port);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetLegoLanguagePackage.ACTOR: {
			Actor actor = (Actor) theEObject;
			T result = caseActor(actor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetLegoLanguagePackage.ACTION: {
			Action action = (Action) theEObject;
			T result = caseAction(action);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetLegoLanguagePackage.GO: {
			Go go = (Go) theEObject;
			T result = caseGo(go);
			if (result == null)
				result = caseAction(go);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetLegoLanguagePackage.RIGHT: {
			Right right = (Right) theEObject;
			T result = caseRight(right);
			if (result == null)
				result = caseAction(right);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetLegoLanguagePackage.LEFT: {
			Left left = (Left) theEObject;
			T result = caseLeft(left);
			if (result == null)
				result = caseAction(left);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetLegoLanguagePackage.CONTINUE: {
			Continue continue_ = (Continue) theEObject;
			T result = caseContinue(continue_);
			if (result == null)
				result = caseAction(continue_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetLegoLanguagePackage.BACK: {
			Back back = (Back) theEObject;
			T result = caseBack(back);
			if (result == null)
				result = caseAction(back);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetLegoLanguagePackage.SHUT_DOWN: {
			ShutDown shutDown = (ShutDown) theEObject;
			T result = caseShutDown(shutDown);
			if (result == null)
				result = caseAction(shutDown);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetLegoLanguagePackage.DOWN: {
			Down down = (Down) theEObject;
			T result = caseDown(down);
			if (result == null)
				result = caseAction(down);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetLegoLanguagePackage.ROTATE: {
			Rotate rotate = (Rotate) theEObject;
			T result = caseRotate(rotate);
			if (result == null)
				result = caseAction(rotate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lego</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lego</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLego(Lego object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Motor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Motor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMotor(Motor object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Go</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Go</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGo(Go object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRight(Right object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Left</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Left</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeft(Left object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinue(Continue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Back</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Back</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBack(Back object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shut Down</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shut Down</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShutDown(ShutDown object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Down</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Down</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDown(Down object) {
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

} //ProjetLegoLanguageSwitch
