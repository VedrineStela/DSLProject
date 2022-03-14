/**
 */
package fr.univcotedazur.l3ia.Tp_03_02_2022;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Sensor#getSensorPort <em>Sensor Port</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package#getSensor()
 * @model abstract="true"
 * @generated
 */
public interface Sensor extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sensor Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Port</em>' attribute.
	 * @see #setSensorPort(int)
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package#getSensor_SensorPort()
	 * @model
	 * @generated
	 */
	int getSensorPort();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Sensor#getSensorPort <em>Sensor Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor Port</em>' attribute.
	 * @see #getSensorPort()
	 * @generated
	 */
	void setSensorPort(int value);

} // Sensor
