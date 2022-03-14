/**
 */
package fr.univcotedazur.l3ia.Tp_03_02_2022.impl;

import fr.univcotedazur.l3ia.Tp_03_02_2022.LeftMotor;
import fr.univcotedazur.l3ia.Tp_03_02_2022.MultipleMotorActions;
import fr.univcotedazur.l3ia.Tp_03_02_2022.RightMotor;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiple Motor Actions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.MultipleMotorActionsImpl#getLeftmotor <em>Leftmotor</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.MultipleMotorActionsImpl#getRightmotor <em>Rightmotor</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.MultipleMotorActionsImpl#getAngle <em>Angle</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.MultipleMotorActionsImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.MultipleMotorActionsImpl#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MultipleMotorActionsImpl extends StatementImpl implements MultipleMotorActions {
	/**
	 * The cached value of the '{@link #getLeftmotor() <em>Leftmotor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftmotor()
	 * @generated
	 * @ordered
	 */
	protected LeftMotor leftmotor;
	/**
	 * The cached value of the '{@link #getRightmotor() <em>Rightmotor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightmotor()
	 * @generated
	 * @ordered
	 */
	protected RightMotor rightmotor;
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
	protected MultipleMotorActionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tp_03_02_2022Package.Literals.MULTIPLE_MOTOR_ACTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftMotor getLeftmotor() {
		if (leftmotor != null && leftmotor.eIsProxy()) {
			InternalEObject oldLeftmotor = (InternalEObject) leftmotor;
			leftmotor = (LeftMotor) eResolveProxy(oldLeftmotor);
			if (leftmotor != oldLeftmotor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Tp_03_02_2022Package.MULTIPLE_MOTOR_ACTIONS__LEFTMOTOR, oldLeftmotor, leftmotor));
			}
		}
		return leftmotor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftMotor basicGetLeftmotor() {
		return leftmotor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftmotor(LeftMotor newLeftmotor) {
		LeftMotor oldLeftmotor = leftmotor;
		leftmotor = newLeftmotor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Tp_03_02_2022Package.MULTIPLE_MOTOR_ACTIONS__LEFTMOTOR, oldLeftmotor, leftmotor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightMotor getRightmotor() {
		if (rightmotor != null && rightmotor.eIsProxy()) {
			InternalEObject oldRightmotor = (InternalEObject) rightmotor;
			rightmotor = (RightMotor) eResolveProxy(oldRightmotor);
			if (rightmotor != oldRightmotor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Tp_03_02_2022Package.MULTIPLE_MOTOR_ACTIONS__RIGHTMOTOR, oldRightmotor, rightmotor));
			}
		}
		return rightmotor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightMotor basicGetRightmotor() {
		return rightmotor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightmotor(RightMotor newRightmotor) {
		RightMotor oldRightmotor = rightmotor;
		rightmotor = newRightmotor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Tp_03_02_2022Package.MULTIPLE_MOTOR_ACTIONS__RIGHTMOTOR, oldRightmotor, rightmotor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Tp_03_02_2022Package.MULTIPLE_MOTOR_ACTIONS__ANGLE,
					oldAngle, angle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Tp_03_02_2022Package.MULTIPLE_MOTOR_ACTIONS__SPEED,
					oldSpeed, speed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Tp_03_02_2022Package.MULTIPLE_MOTOR_ACTIONS__DURATION,
					oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Tp_03_02_2022Package.MULTIPLE_MOTOR_ACTIONS__LEFTMOTOR:
			if (resolve)
				return getLeftmotor();
			return basicGetLeftmotor();
		case Tp_03_02_2022Package.MULTIPLE_MOTOR_ACTIONS__RIGHTMOTOR:
			if (resolve)
				return getRightmotor();
			return basicGetRightmotor();
		case Tp_03_02_2022Package.MULTIPLE_MOTOR_ACTIONS__ANGLE:
			return getAngle();
		case Tp_03_02_2022Package.MULTIPLE_MOTOR_ACTIONS__SPEED:
			return getSpeed();
		case Tp_03_02_2022Package.MULTIPLE_MOTOR_ACTIONS__DURATION:
			return getDuration();
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
		case Tp_03_02_2022Package.MULTIPLE_MOTOR_ACTIONS__LEFTMOTOR:
			setLeftmotor((LeftMotor) newValue);
			return;
		case Tp_03_02_2022Package.MULTIPLE_MOTOR_ACTIONS__RIGHTMOTOR:
			setRightmotor((RightMotor) newValue);
			return;
		case Tp_03_02_2022Package.MULTIPLE_MOTOR_ACTIONS__ANGLE:
			setAngle((Integer) newValue);
			return;
		case Tp_03_02_2022Package.MULTIPLE_MOTOR_ACTIONS__SPEED:
			setSpeed((Integer) newValue);
			return;
		case Tp_03_02_2022Package.MULTIPLE_MOTOR_ACTIONS__DURATION:
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
		case Tp_03_02_2022Package.MULTIPLE_MOTOR_ACTIONS__LEFTMOTOR:
			setLeftmotor((LeftMotor) null);
			return;
		case Tp_03_02_2022Package.MULTIPLE_MOTOR_ACTIONS__RIGHTMOTOR:
			setRightmotor((RightMotor) null);
			return;
		case Tp_03_02_2022Package.MULTIPLE_MOTOR_ACTIONS__ANGLE:
			setAngle(ANGLE_EDEFAULT);
			return;
		case Tp_03_02_2022Package.MULTIPLE_MOTOR_ACTIONS__SPEED:
			setSpeed(SPEED_EDEFAULT);
			return;
		case Tp_03_02_2022Package.MULTIPLE_MOTOR_ACTIONS__DURATION:
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
		case Tp_03_02_2022Package.MULTIPLE_MOTOR_ACTIONS__LEFTMOTOR:
			return leftmotor != null;
		case Tp_03_02_2022Package.MULTIPLE_MOTOR_ACTIONS__RIGHTMOTOR:
			return rightmotor != null;
		case Tp_03_02_2022Package.MULTIPLE_MOTOR_ACTIONS__ANGLE:
			return angle != ANGLE_EDEFAULT;
		case Tp_03_02_2022Package.MULTIPLE_MOTOR_ACTIONS__SPEED:
			return speed != SPEED_EDEFAULT;
		case Tp_03_02_2022Package.MULTIPLE_MOTOR_ACTIONS__DURATION:
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

} //MultipleMotorActionsImpl
