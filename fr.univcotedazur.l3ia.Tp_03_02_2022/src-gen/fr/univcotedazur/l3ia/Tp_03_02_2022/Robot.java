/**
 */
package fr.univcotedazur.l3ia.Tp_03_02_2022;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Robot#getMoteur <em>Moteur</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Robot#getSensor <em>Sensor</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package#getRobot()
 * @model
 * @generated
 */
public interface Robot extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Moteur</b></em>' containment reference list.
	 * The list contents are of type {@link fr.univcotedazur.l3ia.Tp_03_02_2022.Moteur}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moteur</em>' containment reference list.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package#getRobot_Moteur()
	 * @model containment="true"
	 * @generated
	 */
	EList<Moteur> getMoteur();

	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' containment reference list.
	 * The list contents are of type {@link fr.univcotedazur.l3ia.Tp_03_02_2022.Sensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' containment reference list.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package#getRobot_Sensor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sensor> getSensor();

} // Robot
