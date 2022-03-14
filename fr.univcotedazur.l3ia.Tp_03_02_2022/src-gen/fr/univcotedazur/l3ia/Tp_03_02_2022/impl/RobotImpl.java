/**
 */
package fr.univcotedazur.l3ia.Tp_03_02_2022.impl;

import fr.univcotedazur.l3ia.Tp_03_02_2022.Moteur;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Robot;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Sensor;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.RobotImpl#getMoteur <em>Moteur</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.RobotImpl#getSensor <em>Sensor</em>}</li>
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
	protected EList<Moteur> moteur;

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
		return Tp_03_02_2022Package.Literals.ROBOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Moteur> getMoteur() {
		if (moteur == null) {
			moteur = new EObjectContainmentEList<Moteur>(Moteur.class, this, Tp_03_02_2022Package.ROBOT__MOTEUR);
		}
		return moteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sensor> getSensor() {
		if (sensor == null) {
			sensor = new EObjectContainmentEList<Sensor>(Sensor.class, this, Tp_03_02_2022Package.ROBOT__SENSOR);
		}
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Tp_03_02_2022Package.ROBOT__MOTEUR:
			return ((InternalEList<?>) getMoteur()).basicRemove(otherEnd, msgs);
		case Tp_03_02_2022Package.ROBOT__SENSOR:
			return ((InternalEList<?>) getSensor()).basicRemove(otherEnd, msgs);
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
		case Tp_03_02_2022Package.ROBOT__MOTEUR:
			return getMoteur();
		case Tp_03_02_2022Package.ROBOT__SENSOR:
			return getSensor();
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
		case Tp_03_02_2022Package.ROBOT__MOTEUR:
			getMoteur().clear();
			getMoteur().addAll((Collection<? extends Moteur>) newValue);
			return;
		case Tp_03_02_2022Package.ROBOT__SENSOR:
			getSensor().clear();
			getSensor().addAll((Collection<? extends Sensor>) newValue);
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
		case Tp_03_02_2022Package.ROBOT__MOTEUR:
			getMoteur().clear();
			return;
		case Tp_03_02_2022Package.ROBOT__SENSOR:
			getSensor().clear();
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
		case Tp_03_02_2022Package.ROBOT__MOTEUR:
			return moteur != null && !moteur.isEmpty();
		case Tp_03_02_2022Package.ROBOT__SENSOR:
			return sensor != null && !sensor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RobotImpl
