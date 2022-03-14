/**
 */
package fr.univcotedazur.l3ia.Tp_03_02_2022.impl;

import fr.univcotedazur.l3ia.Tp_03_02_2022.Actions;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Moteur;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ActionsImpl#getMoteur <em>Moteur</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ActionsImpl#getAngle <em>Angle</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ActionsImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ActionsImpl#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActionsImpl extends StatementImpl implements Actions {
	/**
	 * The cached value of the '{@link #getMoteur() <em>Moteur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoteur()
	 * @generated
	 * @ordered
	 */
	protected Moteur moteur;

	/**
	 * The default value of the '{@link #getAngle() <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected static final int ANGLE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAngle() <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected int angle = ANGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final int SPEED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected int speed = SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tp_03_02_2022Package.Literals.ACTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Moteur getMoteur() {
		if (moteur != null && moteur.eIsProxy()) {
			InternalEObject oldMoteur = (InternalEObject) moteur;
			moteur = (Moteur) eResolveProxy(oldMoteur);
			if (moteur != oldMoteur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Tp_03_02_2022Package.ACTIONS__MOTEUR,
							oldMoteur, moteur));
			}
		}
		return moteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Moteur basicGetMoteur() {
		return moteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoteur(Moteur newMoteur) {
		Moteur oldMoteur = moteur;
		moteur = newMoteur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp_03_02_2022Package.ACTIONS__MOTEUR, oldMoteur,
					moteur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAngle() {
		return angle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngle(int newAngle) {
		int oldAngle = angle;
		angle = newAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp_03_02_2022Package.ACTIONS__ANGLE, oldAngle,
					angle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeed(int newSpeed) {
		int oldSpeed = speed;
		speed = newSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp_03_02_2022Package.ACTIONS__SPEED, oldSpeed,
					speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp_03_02_2022Package.ACTIONS__DURATION, oldDuration,
					duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Tp_03_02_2022Package.ACTIONS__MOTEUR:
			if (resolve)
				return getMoteur();
			return basicGetMoteur();
		case Tp_03_02_2022Package.ACTIONS__ANGLE:
			return getAngle();
		case Tp_03_02_2022Package.ACTIONS__SPEED:
			return getSpeed();
		case Tp_03_02_2022Package.ACTIONS__DURATION:
			return getDuration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Tp_03_02_2022Package.ACTIONS__MOTEUR:
			setMoteur((Moteur) newValue);
			return;
		case Tp_03_02_2022Package.ACTIONS__ANGLE:
			setAngle((Integer) newValue);
			return;
		case Tp_03_02_2022Package.ACTIONS__SPEED:
			setSpeed((Integer) newValue);
			return;
		case Tp_03_02_2022Package.ACTIONS__DURATION:
			setDuration((Integer) newValue);
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
		case Tp_03_02_2022Package.ACTIONS__MOTEUR:
			setMoteur((Moteur) null);
			return;
		case Tp_03_02_2022Package.ACTIONS__ANGLE:
			setAngle(ANGLE_EDEFAULT);
			return;
		case Tp_03_02_2022Package.ACTIONS__SPEED:
			setSpeed(SPEED_EDEFAULT);
			return;
		case Tp_03_02_2022Package.ACTIONS__DURATION:
			setDuration(DURATION_EDEFAULT);
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
		case Tp_03_02_2022Package.ACTIONS__MOTEUR:
			return moteur != null;
		case Tp_03_02_2022Package.ACTIONS__ANGLE:
			return angle != ANGLE_EDEFAULT;
		case Tp_03_02_2022Package.ACTIONS__SPEED:
			return speed != SPEED_EDEFAULT;
		case Tp_03_02_2022Package.ACTIONS__DURATION:
			return duration != DURATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (angle: ");
		result.append(angle);
		result.append(", speed: ");
		result.append(speed);
		result.append(", duration: ");
		result.append(duration);
		result.append(')');
		return result.toString();
	}

} //ActionsImpl
