/**
 */
package fr.univcotedazur.l3ia.Tp_03_02_2022.impl;

import fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Variable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.VariableImpl#isIsConst <em>Is Const</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.VariableImpl#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableImpl extends NamedElementImpl implements Variable {
	/**
	 * The default value of the '{@link #isIsConst() <em>Is Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConst()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsConst() <em>Is Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConst()
	 * @generated
	 * @ordered
	 */
	protected boolean isConst = IS_CONST_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected static final int INITIAL_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected int initialValue = INITIAL_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tp_03_02_2022Package.Literals.VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsConst() {
		return isConst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConst(boolean newIsConst) {
		boolean oldIsConst = isConst;
		isConst = newIsConst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp_03_02_2022Package.VARIABLE__IS_CONST, oldIsConst,
					isConst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInitialValue() {
		return initialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialValue(int newInitialValue) {
		int oldInitialValue = initialValue;
		initialValue = newInitialValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp_03_02_2022Package.VARIABLE__INITIAL_VALUE,
					oldInitialValue, initialValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Tp_03_02_2022Package.VARIABLE__IS_CONST:
			return isIsConst();
		case Tp_03_02_2022Package.VARIABLE__INITIAL_VALUE:
			return getInitialValue();
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
		case Tp_03_02_2022Package.VARIABLE__IS_CONST:
			setIsConst((Boolean) newValue);
			return;
		case Tp_03_02_2022Package.VARIABLE__INITIAL_VALUE:
			setInitialValue((Integer) newValue);
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
		case Tp_03_02_2022Package.VARIABLE__IS_CONST:
			setIsConst(IS_CONST_EDEFAULT);
			return;
		case Tp_03_02_2022Package.VARIABLE__INITIAL_VALUE:
			setInitialValue(INITIAL_VALUE_EDEFAULT);
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
		case Tp_03_02_2022Package.VARIABLE__IS_CONST:
			return isConst != IS_CONST_EDEFAULT;
		case Tp_03_02_2022Package.VARIABLE__INITIAL_VALUE:
			return initialValue != INITIAL_VALUE_EDEFAULT;
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
		result.append(" (isConst: ");
		result.append(isConst);
		result.append(", initialValue: ");
		result.append(initialValue);
		result.append(')');
		return result.toString();
	}

} //VariableImpl
