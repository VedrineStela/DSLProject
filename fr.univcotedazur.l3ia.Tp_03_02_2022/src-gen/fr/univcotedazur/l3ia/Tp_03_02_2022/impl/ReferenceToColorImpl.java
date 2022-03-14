/**
 */
package fr.univcotedazur.l3ia.Tp_03_02_2022.impl;

import fr.univcotedazur.l3ia.Tp_03_02_2022.ColorSensor;
import fr.univcotedazur.l3ia.Tp_03_02_2022.ReferenceToColor;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference To Color</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ReferenceToColorImpl#getColorsensor <em>Colorsensor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceToColorImpl extends NamedElementImpl implements ReferenceToColor {
	/**
	 * The cached value of the '{@link #getColorsensor() <em>Colorsensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorsensor()
	 * @generated
	 * @ordered
	 */
	protected ColorSensor colorsensor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceToColorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tp_03_02_2022Package.Literals.REFERENCE_TO_COLOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorSensor getColorsensor() {
		if (colorsensor != null && colorsensor.eIsProxy()) {
			InternalEObject oldColorsensor = (InternalEObject) colorsensor;
			colorsensor = (ColorSensor) eResolveProxy(oldColorsensor);
			if (colorsensor != oldColorsensor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Tp_03_02_2022Package.REFERENCE_TO_COLOR__COLORSENSOR, oldColorsensor, colorsensor));
			}
		}
		return colorsensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorSensor basicGetColorsensor() {
		return colorsensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColorsensor(ColorSensor newColorsensor) {
		ColorSensor oldColorsensor = colorsensor;
		colorsensor = newColorsensor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp_03_02_2022Package.REFERENCE_TO_COLOR__COLORSENSOR,
					oldColorsensor, colorsensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Tp_03_02_2022Package.REFERENCE_TO_COLOR__COLORSENSOR:
			if (resolve)
				return getColorsensor();
			return basicGetColorsensor();
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
		case Tp_03_02_2022Package.REFERENCE_TO_COLOR__COLORSENSOR:
			setColorsensor((ColorSensor) newValue);
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
		case Tp_03_02_2022Package.REFERENCE_TO_COLOR__COLORSENSOR:
			setColorsensor((ColorSensor) null);
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
		case Tp_03_02_2022Package.REFERENCE_TO_COLOR__COLORSENSOR:
			return colorsensor != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferenceToColorImpl
