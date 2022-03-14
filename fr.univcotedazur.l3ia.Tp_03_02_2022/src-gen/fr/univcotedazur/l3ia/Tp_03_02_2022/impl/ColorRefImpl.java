/**
 */
package fr.univcotedazur.l3ia.Tp_03_02_2022.impl;

import fr.univcotedazur.l3ia.Tp_03_02_2022.ColorRef;
import fr.univcotedazur.l3ia.Tp_03_02_2022.ReferenceToColor;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Color Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ColorRefImpl#getReferencetocolor <em>Referencetocolor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColorRefImpl extends MinimalEObjectImpl.Container implements ColorRef {
	/**
	 * The cached value of the '{@link #getReferencetocolor() <em>Referencetocolor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencetocolor()
	 * @generated
	 * @ordered
	 */
	protected ReferenceToColor referencetocolor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColorRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tp_03_02_2022Package.Literals.COLOR_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceToColor getReferencetocolor() {
		if (referencetocolor != null && referencetocolor.eIsProxy()) {
			InternalEObject oldReferencetocolor = (InternalEObject) referencetocolor;
			referencetocolor = (ReferenceToColor) eResolveProxy(oldReferencetocolor);
			if (referencetocolor != oldReferencetocolor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Tp_03_02_2022Package.COLOR_REF__REFERENCETOCOLOR, oldReferencetocolor, referencetocolor));
			}
		}
		return referencetocolor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceToColor basicGetReferencetocolor() {
		return referencetocolor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencetocolor(ReferenceToColor newReferencetocolor) {
		ReferenceToColor oldReferencetocolor = referencetocolor;
		referencetocolor = newReferencetocolor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp_03_02_2022Package.COLOR_REF__REFERENCETOCOLOR,
					oldReferencetocolor, referencetocolor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Tp_03_02_2022Package.COLOR_REF__REFERENCETOCOLOR:
			if (resolve)
				return getReferencetocolor();
			return basicGetReferencetocolor();
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
		case Tp_03_02_2022Package.COLOR_REF__REFERENCETOCOLOR:
			setReferencetocolor((ReferenceToColor) newValue);
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
		case Tp_03_02_2022Package.COLOR_REF__REFERENCETOCOLOR:
			setReferencetocolor((ReferenceToColor) null);
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
		case Tp_03_02_2022Package.COLOR_REF__REFERENCETOCOLOR:
			return referencetocolor != null;
		}
		return super.eIsSet(featureID);
	}

} //ColorRefImpl
