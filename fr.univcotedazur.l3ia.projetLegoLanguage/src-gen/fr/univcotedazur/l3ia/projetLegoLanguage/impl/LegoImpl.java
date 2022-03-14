/**
 */
package fr.univcotedazur.l3ia.projetLegoLanguage.impl;

import fr.univcotedazur.l3ia.projetLegoLanguage.Lego;
import fr.univcotedazur.l3ia.projetLegoLanguage.ProjetLegoLanguagePackage;
import fr.univcotedazur.l3ia.projetLegoLanguage.Robot;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lego</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.projetLegoLanguage.impl.LegoImpl#getRobot <em>Robot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LegoImpl extends NamedElementImpl implements Lego {
	/**
	 * The cached value of the '{@link #getRobot() <em>Robot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRobot()
	 * @generated
	 * @ordered
	 */
	protected Robot robot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetLegoLanguagePackage.Literals.LEGO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Robot getRobot() {
		return robot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRobot(Robot newRobot, NotificationChain msgs) {
		Robot oldRobot = robot;
		robot = newRobot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjetLegoLanguagePackage.LEGO__ROBOT, oldRobot, newRobot);
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
	public void setRobot(Robot newRobot) {
		if (newRobot != robot) {
			NotificationChain msgs = null;
			if (robot != null)
				msgs = ((InternalEObject) robot).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ProjetLegoLanguagePackage.LEGO__ROBOT, null, msgs);
			if (newRobot != null)
				msgs = ((InternalEObject) newRobot).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ProjetLegoLanguagePackage.LEGO__ROBOT, null, msgs);
			msgs = basicSetRobot(newRobot, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetLegoLanguagePackage.LEGO__ROBOT, newRobot,
					newRobot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProjetLegoLanguagePackage.LEGO__ROBOT:
			return basicSetRobot(null, msgs);
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
		case ProjetLegoLanguagePackage.LEGO__ROBOT:
			return getRobot();
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
		case ProjetLegoLanguagePackage.LEGO__ROBOT:
			setRobot((Robot) newValue);
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
		case ProjetLegoLanguagePackage.LEGO__ROBOT:
			setRobot((Robot) null);
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
		case ProjetLegoLanguagePackage.LEGO__ROBOT:
			return robot != null;
		}
		return super.eIsSet(featureID);
	}

} //LegoImpl
