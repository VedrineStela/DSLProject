/**
 */
package fr.univcotedazur.l3ia.Tp_03_02_2022.impl;

import fr.univcotedazur.l3ia.Tp_03_02_2022.Sensor;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.SensorImpl#getSensorPort <em>Sensor Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SensorImpl extends NamedElementImpl implements Sensor {
	/**
	 * The default value of the '{@link #getSensorPort() <em>Sensor Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorPort()
	 * @generated
	 * @ordered
	 */
	protected static final int SENSOR_PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSensorPort() <em>Sensor Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorPort()
	 * @generated
	 * @ordered
	 */
	protected int sensorPort = SENSOR_PORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tp_03_02_2022Package.Literals.SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSensorPort() {
		return sensorPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensorPort(int newSensorPort) {
		int oldSensorPort = sensorPort;
		sensorPort = newSensorPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp_03_02_2022Package.SENSOR__SENSOR_PORT,
					oldSensorPort, sensorPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Tp_03_02_2022Package.SENSOR__SENSOR_PORT:
			return getSensorPort();
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
		case Tp_03_02_2022Package.SENSOR__SENSOR_PORT:
			setSensorPort((Integer) newValue);
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
		case Tp_03_02_2022Package.SENSOR__SENSOR_PORT:
			setSensorPort(SENSOR_PORT_EDEFAULT);
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
		case Tp_03_02_2022Package.SENSOR__SENSOR_PORT:
			return sensorPort != SENSOR_PORT_EDEFAULT;
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
		result.append(" (sensorPort: ");
		result.append(sensorPort);
		result.append(')');
		return result.toString();
	}

} //SensorImpl
