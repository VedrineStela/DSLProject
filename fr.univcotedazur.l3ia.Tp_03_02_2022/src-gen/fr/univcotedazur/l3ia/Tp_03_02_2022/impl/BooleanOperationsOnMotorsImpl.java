/**
 */
package fr.univcotedazur.l3ia.Tp_03_02_2022.impl;

import fr.univcotedazur.l3ia.Tp_03_02_2022.BooleanOperationsOnMotors;
import fr.univcotedazur.l3ia.Tp_03_02_2022.ColorRef;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package;
import fr.univcotedazur.l3ia.Tp_03_02_2022.VariableRef;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Operations On Motors</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.BooleanOperationsOnMotorsImpl#getLeftC <em>Left C</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.BooleanOperationsOnMotorsImpl#getRightC <em>Right C</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BooleanOperationsOnMotorsImpl extends MinimalEObjectImpl.Container
		implements BooleanOperationsOnMotors {
	/**
	 * The cached value of the '{@link #getLeftC() <em>Left C</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftC()
	 * @generated
	 * @ordered
	 */
	protected ColorRef leftC;

	/**
	 * The cached value of the '{@link #getRightC() <em>Right C</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightC()
	 * @generated
	 * @ordered
	 */
	protected VariableRef rightC;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanOperationsOnMotorsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tp_03_02_2022Package.Literals.BOOLEAN_OPERATIONS_ON_MOTORS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorRef getLeftC() {
		return leftC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftC(ColorRef newLeftC, NotificationChain msgs) {
		ColorRef oldLeftC = leftC;
		leftC = newLeftC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Tp_03_02_2022Package.BOOLEAN_OPERATIONS_ON_MOTORS__LEFT_C, oldLeftC, newLeftC);
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
	public void setLeftC(ColorRef newLeftC) {
		if (newLeftC != leftC) {
			NotificationChain msgs = null;
			if (leftC != null)
				msgs = ((InternalEObject) leftC).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Tp_03_02_2022Package.BOOLEAN_OPERATIONS_ON_MOTORS__LEFT_C, null, msgs);
			if (newLeftC != null)
				msgs = ((InternalEObject) newLeftC).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Tp_03_02_2022Package.BOOLEAN_OPERATIONS_ON_MOTORS__LEFT_C, null, msgs);
			msgs = basicSetLeftC(newLeftC, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Tp_03_02_2022Package.BOOLEAN_OPERATIONS_ON_MOTORS__LEFT_C, newLeftC, newLeftC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableRef getRightC() {
		return rightC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightC(VariableRef newRightC, NotificationChain msgs) {
		VariableRef oldRightC = rightC;
		rightC = newRightC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Tp_03_02_2022Package.BOOLEAN_OPERATIONS_ON_MOTORS__RIGHT_C, oldRightC, newRightC);
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
	public void setRightC(VariableRef newRightC) {
		if (newRightC != rightC) {
			NotificationChain msgs = null;
			if (rightC != null)
				msgs = ((InternalEObject) rightC).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Tp_03_02_2022Package.BOOLEAN_OPERATIONS_ON_MOTORS__RIGHT_C, null,
						msgs);
			if (newRightC != null)
				msgs = ((InternalEObject) newRightC).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Tp_03_02_2022Package.BOOLEAN_OPERATIONS_ON_MOTORS__RIGHT_C, null,
						msgs);
			msgs = basicSetRightC(newRightC, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Tp_03_02_2022Package.BOOLEAN_OPERATIONS_ON_MOTORS__RIGHT_C, newRightC, newRightC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Tp_03_02_2022Package.BOOLEAN_OPERATIONS_ON_MOTORS__LEFT_C:
			return basicSetLeftC(null, msgs);
		case Tp_03_02_2022Package.BOOLEAN_OPERATIONS_ON_MOTORS__RIGHT_C:
			return basicSetRightC(null, msgs);
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
		case Tp_03_02_2022Package.BOOLEAN_OPERATIONS_ON_MOTORS__LEFT_C:
			return getLeftC();
		case Tp_03_02_2022Package.BOOLEAN_OPERATIONS_ON_MOTORS__RIGHT_C:
			return getRightC();
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
		case Tp_03_02_2022Package.BOOLEAN_OPERATIONS_ON_MOTORS__LEFT_C:
			setLeftC((ColorRef) newValue);
			return;
		case Tp_03_02_2022Package.BOOLEAN_OPERATIONS_ON_MOTORS__RIGHT_C:
			setRightC((VariableRef) newValue);
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
		case Tp_03_02_2022Package.BOOLEAN_OPERATIONS_ON_MOTORS__LEFT_C:
			setLeftC((ColorRef) null);
			return;
		case Tp_03_02_2022Package.BOOLEAN_OPERATIONS_ON_MOTORS__RIGHT_C:
			setRightC((VariableRef) null);
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
		case Tp_03_02_2022Package.BOOLEAN_OPERATIONS_ON_MOTORS__LEFT_C:
			return leftC != null;
		case Tp_03_02_2022Package.BOOLEAN_OPERATIONS_ON_MOTORS__RIGHT_C:
			return rightC != null;
		}
		return super.eIsSet(featureID);
	}

} //BooleanOperationsOnMotorsImpl
