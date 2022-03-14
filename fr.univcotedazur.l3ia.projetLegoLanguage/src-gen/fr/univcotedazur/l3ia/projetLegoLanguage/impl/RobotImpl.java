/**
 */
package fr.univcotedazur.l3ia.projetLegoLanguage.impl;

import fr.univcotedazur.l3ia.projetLegoLanguage.Action;
import fr.univcotedazur.l3ia.projetLegoLanguage.Actor;
import fr.univcotedazur.l3ia.projetLegoLanguage.LeftMotor;
import fr.univcotedazur.l3ia.projetLegoLanguage.Motor;
import fr.univcotedazur.l3ia.projetLegoLanguage.Port;
import fr.univcotedazur.l3ia.projetLegoLanguage.ProjetLegoLanguagePackage;
import fr.univcotedazur.l3ia.projetLegoLanguage.RightMotor;
import fr.univcotedazur.l3ia.projetLegoLanguage.Robot;
import fr.univcotedazur.l3ia.projetLegoLanguage.Sensor;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.RobotImpl#getMoteur <em>Moteur</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.RobotImpl#getLeftmotor <em>Leftmotor</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.RobotImpl#getRightmotor <em>Rightmotor</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.RobotImpl#getSensor <em>Sensor</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.RobotImpl#getPort <em>Port</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.RobotImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.RobotImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RobotImpl extends NamedElementImpl implements Robot {
	/**
	 * The cached value of the '{@link #getMoteur() <em>Moteur</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoteur()
	 * @generated
	 * @ordered
	 */
	protected EList<Motor> moteur;

	/**
	 * The cached value of the '{@link #getLeftmotor() <em>Leftmotor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftmotor()
	 * @generated
	 * @ordered
	 */
	protected LeftMotor leftmotor;

	/**
	 * The cached value of the '{@link #getRightmotor() <em>Rightmotor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightmotor()
	 * @generated
	 * @ordered
	 */
	protected RightMotor rightmotor;

	/**
	 * The cached value of the '{@link #getSensor() <em>Sensor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensor()
	 * @generated
	 * @ordered
	 */
	protected EList<Sensor> sensor;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> port;

	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> actor;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> action;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetLegoLanguagePackage.Literals.ROBOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Motor> getMoteur() {
		if (moteur == null) {
			moteur = new EObjectContainmentEList<Motor>(Motor.class, this, ProjetLegoLanguagePackage.ROBOT__MOTEUR);
		}
		return moteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftMotor getLeftmotor() {
		return leftmotor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftmotor(LeftMotor newLeftmotor, NotificationChain msgs) {
		LeftMotor oldLeftmotor = leftmotor;
		leftmotor = newLeftmotor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjetLegoLanguagePackage.ROBOT__LEFTMOTOR, oldLeftmotor, newLeftmotor);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftmotor(LeftMotor newLeftmotor) {
		if (newLeftmotor != leftmotor) {
			NotificationChain msgs = null;
			if (leftmotor != null)
				msgs = ((InternalEObject) leftmotor).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ProjetLegoLanguagePackage.ROBOT__LEFTMOTOR, null, msgs);
			if (newLeftmotor != null)
				msgs = ((InternalEObject) newLeftmotor).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ProjetLegoLanguagePackage.ROBOT__LEFTMOTOR, null, msgs);
			msgs = basicSetLeftmotor(newLeftmotor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetLegoLanguagePackage.ROBOT__LEFTMOTOR,
					newLeftmotor, newLeftmotor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightMotor getRightmotor() {
		return rightmotor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightmotor(RightMotor newRightmotor, NotificationChain msgs) {
		RightMotor oldRightmotor = rightmotor;
		rightmotor = newRightmotor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjetLegoLanguagePackage.ROBOT__RIGHTMOTOR, oldRightmotor, newRightmotor);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightmotor(RightMotor newRightmotor) {
		if (newRightmotor != rightmotor) {
			NotificationChain msgs = null;
			if (rightmotor != null)
				msgs = ((InternalEObject) rightmotor).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ProjetLegoLanguagePackage.ROBOT__RIGHTMOTOR, null, msgs);
			if (newRightmotor != null)
				msgs = ((InternalEObject) newRightmotor).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ProjetLegoLanguagePackage.ROBOT__RIGHTMOTOR, null, msgs);
			msgs = basicSetRightmotor(newRightmotor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetLegoLanguagePackage.ROBOT__RIGHTMOTOR,
					newRightmotor, newRightmotor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sensor> getSensor() {
		if (sensor == null) {
			sensor = new EObjectContainmentEList<Sensor>(Sensor.class, this, ProjetLegoLanguagePackage.ROBOT__SENSOR);
		}
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPort() {
		if (port == null) {
			port = new EObjectContainmentEList<Port>(Port.class, this, ProjetLegoLanguagePackage.ROBOT__PORT);
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getActor() {
		if (actor == null) {
			actor = new EObjectContainmentEList<Actor>(Actor.class, this, ProjetLegoLanguagePackage.ROBOT__ACTOR);
		}
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<Action>(Action.class, this, ProjetLegoLanguagePackage.ROBOT__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProjetLegoLanguagePackage.ROBOT__MOTEUR:
			return ((InternalEList<?>) getMoteur()).basicRemove(otherEnd, msgs);
		case ProjetLegoLanguagePackage.ROBOT__LEFTMOTOR:
			return basicSetLeftmotor(null, msgs);
		case ProjetLegoLanguagePackage.ROBOT__RIGHTMOTOR:
			return basicSetRightmotor(null, msgs);
		case ProjetLegoLanguagePackage.ROBOT__SENSOR:
			return ((InternalEList<?>) getSensor()).basicRemove(otherEnd, msgs);
		case ProjetLegoLanguagePackage.ROBOT__PORT:
			return ((InternalEList<?>) getPort()).basicRemove(otherEnd, msgs);
		case ProjetLegoLanguagePackage.ROBOT__ACTOR:
			return ((InternalEList<?>) getActor()).basicRemove(otherEnd, msgs);
		case ProjetLegoLanguagePackage.ROBOT__ACTION:
			return ((InternalEList<?>) getAction()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjetLegoLanguagePackage.ROBOT__MOTEUR:
			return getMoteur();
		case ProjetLegoLanguagePackage.ROBOT__LEFTMOTOR:
			return getLeftmotor();
		case ProjetLegoLanguagePackage.ROBOT__RIGHTMOTOR:
			return getRightmotor();
		case ProjetLegoLanguagePackage.ROBOT__SENSOR:
			return getSensor();
		case ProjetLegoLanguagePackage.ROBOT__PORT:
			return getPort();
		case ProjetLegoLanguagePackage.ROBOT__ACTOR:
			return getActor();
		case ProjetLegoLanguagePackage.ROBOT__ACTION:
			return getAction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ProjetLegoLanguagePackage.ROBOT__MOTEUR:
			getMoteur().clear();
			getMoteur().addAll((Collection<? extends Motor>) newValue);
			return;
		case ProjetLegoLanguagePackage.ROBOT__LEFTMOTOR:
			setLeftmotor((LeftMotor) newValue);
			return;
		case ProjetLegoLanguagePackage.ROBOT__RIGHTMOTOR:
			setRightmotor((RightMotor) newValue);
			return;
		case ProjetLegoLanguagePackage.ROBOT__SENSOR:
			getSensor().clear();
			getSensor().addAll((Collection<? extends Sensor>) newValue);
			return;
		case ProjetLegoLanguagePackage.ROBOT__PORT:
			getPort().clear();
			getPort().addAll((Collection<? extends Port>) newValue);
			return;
		case ProjetLegoLanguagePackage.ROBOT__ACTOR:
			getActor().clear();
			getActor().addAll((Collection<? extends Actor>) newValue);
			return;
		case ProjetLegoLanguagePackage.ROBOT__ACTION:
			getAction().clear();
			getAction().addAll((Collection<? extends Action>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ProjetLegoLanguagePackage.ROBOT__MOTEUR:
			getMoteur().clear();
			return;
		case ProjetLegoLanguagePackage.ROBOT__LEFTMOTOR:
			setLeftmotor((LeftMotor) null);
			return;
		case ProjetLegoLanguagePackage.ROBOT__RIGHTMOTOR:
			setRightmotor((RightMotor) null);
			return;
		case ProjetLegoLanguagePackage.ROBOT__SENSOR:
			getSensor().clear();
			return;
		case ProjetLegoLanguagePackage.ROBOT__PORT:
			getPort().clear();
			return;
		case ProjetLegoLanguagePackage.ROBOT__ACTOR:
			getActor().clear();
			return;
		case ProjetLegoLanguagePackage.ROBOT__ACTION:
			getAction().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ProjetLegoLanguagePackage.ROBOT__MOTEUR:
			return moteur != null && !moteur.isEmpty();
		case ProjetLegoLanguagePackage.ROBOT__LEFTMOTOR:
			return leftmotor != null;
		case ProjetLegoLanguagePackage.ROBOT__RIGHTMOTOR:
			return rightmotor != null;
		case ProjetLegoLanguagePackage.ROBOT__SENSOR:
			return sensor != null && !sensor.isEmpty();
		case ProjetLegoLanguagePackage.ROBOT__PORT:
			return port != null && !port.isEmpty();
		case ProjetLegoLanguagePackage.ROBOT__ACTOR:
			return actor != null && !actor.isEmpty();
		case ProjetLegoLanguagePackage.ROBOT__ACTION:
			return action != null && !action.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RobotImpl
