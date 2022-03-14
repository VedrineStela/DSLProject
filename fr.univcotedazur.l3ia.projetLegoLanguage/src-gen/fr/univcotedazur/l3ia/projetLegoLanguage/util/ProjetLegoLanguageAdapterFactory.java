/**
 */
package fr.univcotedazur.l3ia.projetLegoLanguage.util;

import fr.univcotedazur.l3ia.projetLegoLanguage.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.univcotedazur.l3ia.projetLegoLanguage.ProjetLegoLanguagePackage
 * @generated
 */
public class ProjetLegoLanguageAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProjetLegoLanguagePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjetLegoLanguageAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ProjetLegoLanguagePackage.eINSTANCE;
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
	protected ProjetLegoLanguageSwitch<Adapter> modelSwitch = new ProjetLegoLanguageSwitch<Adapter>() {
		@Override
		public Adapter caseLego(Lego object) {
			return createLegoAdapter();
		}

		@Override
		public Adapter caseRobot(Robot object) {
			return createRobotAdapter();
		}

		@Override
		public Adapter caseMotor(Motor object) {
			return createMotorAdapter();
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
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
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
		public Adapter casePort(Port object) {
			return createPortAdapter();
		}

		@Override
		public Adapter caseActor(Actor object) {
			return createActorAdapter();
		}

		@Override
		public Adapter caseAction(Action object) {
			return createActionAdapter();
		}

		@Override
		public Adapter caseGo(Go object) {
			return createGoAdapter();
		}

		@Override
		public Adapter caseRight(Right object) {
			return createRightAdapter();
		}

		@Override
		public Adapter caseLeft(Left object) {
			return createLeftAdapter();
		}

		@Override
		public Adapter caseContinue(Continue object) {
			return createContinueAdapter();
		}

		@Override
		public Adapter caseBack(Back object) {
			return createBackAdapter();
		}

		@Override
		public Adapter caseShutDown(ShutDown object) {
			return createShutDownAdapter();
		}

		@Override
		public Adapter caseDown(Down object) {
			return createDownAdapter();
		}

		@Override
		public Adapter caseRotate(Rotate object) {
			return createRotateAdapter();
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
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.Lego <em>Lego</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.Lego
	 * @generated
	 */
	public Adapter createLegoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.Robot
	 * @generated
	 */
	public Adapter createRobotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.Motor <em>Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.Motor
	 * @generated
	 */
	public Adapter createMotorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.LeftMotor <em>Left Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.LeftMotor
	 * @generated
	 */
	public Adapter createLeftMotorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.RightMotor <em>Right Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.RightMotor
	 * @generated
	 */
	public Adapter createRightMotorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.ColorSensor <em>Color Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.ColorSensor
	 * @generated
	 */
	public Adapter createColorSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.PositionSensor <em>Position Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.PositionSensor
	 * @generated
	 */
	public Adapter createPositionSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.Go <em>Go</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.Go
	 * @generated
	 */
	public Adapter createGoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.Right <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.Right
	 * @generated
	 */
	public Adapter createRightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.Left <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.Left
	 * @generated
	 */
	public Adapter createLeftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.Continue <em>Continue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.Continue
	 * @generated
	 */
	public Adapter createContinueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.Back <em>Back</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.Back
	 * @generated
	 */
	public Adapter createBackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.ShutDown <em>Shut Down</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.ShutDown
	 * @generated
	 */
	public Adapter createShutDownAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.Down <em>Down</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.Down
	 * @generated
	 */
	public Adapter createDownAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.l3ia.projetLegoLanguage.Rotate <em>Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.Rotate
	 * @generated
	 */
	public Adapter createRotateAdapter() {
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

} //ProjetLegoLanguageAdapterFactory
