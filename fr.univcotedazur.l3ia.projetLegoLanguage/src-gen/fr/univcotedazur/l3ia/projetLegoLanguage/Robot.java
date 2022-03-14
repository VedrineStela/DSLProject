/**
 */
package fr.univcotedazur.l3ia.projetLegoLanguage;

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
 *   <li>{@link fr.univcotedazur.l3ia.projetLegoLanguage.Robot#getMoteur <em>Moteur</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.projetLegoLanguage.Robot#getLeftmotor <em>Leftmotor</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.projetLegoLanguage.Robot#getRightmotor <em>Rightmotor</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.projetLegoLanguage.Robot#getSensor <em>Sensor</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.projetLegoLanguage.Robot#getPort <em>Port</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.projetLegoLanguage.Robot#getActor <em>Actor</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.projetLegoLanguage.Robot#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.l3ia.projetLegoLanguage.ProjetLegoLanguagePackage#getRobot()
 * @model
 * @generated
 */
public interface Robot extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Moteur</b></em>' containment reference list.
	 * The list contents are of type {@link fr.univcotedazur.l3ia.projetLegoLanguage.Motor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moteur</em>' containment reference list.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.ProjetLegoLanguagePackage#getRobot_Moteur()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Motor> getMoteur();

	/**
	 * Returns the value of the '<em><b>Leftmotor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leftmotor</em>' containment reference.
	 * @see #setLeftmotor(LeftMotor)
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.ProjetLegoLanguagePackage#getRobot_Leftmotor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LeftMotor getLeftmotor();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.Robot#getLeftmotor <em>Leftmotor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leftmotor</em>' containment reference.
	 * @see #getLeftmotor()
	 * @generated
	 */
	void setLeftmotor(LeftMotor value);

	/**
	 * Returns the value of the '<em><b>Rightmotor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rightmotor</em>' containment reference.
	 * @see #setRightmotor(RightMotor)
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.ProjetLegoLanguagePackage#getRobot_Rightmotor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RightMotor getRightmotor();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.Robot#getRightmotor <em>Rightmotor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rightmotor</em>' containment reference.
	 * @see #getRightmotor()
	 * @generated
	 */
	void setRightmotor(RightMotor value);

	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' containment reference list.
	 * The list contents are of type {@link fr.univcotedazur.l3ia.projetLegoLanguage.Sensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' containment reference list.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.ProjetLegoLanguagePackage#getRobot_Sensor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sensor> getSensor();

	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link fr.univcotedazur.l3ia.projetLegoLanguage.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.ProjetLegoLanguagePackage#getRobot_Port()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPort();

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' containment reference list.
	 * The list contents are of type {@link fr.univcotedazur.l3ia.projetLegoLanguage.Actor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' containment reference list.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.ProjetLegoLanguagePackage#getRobot_Actor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actor> getActor();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link fr.univcotedazur.l3ia.projetLegoLanguage.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.ProjetLegoLanguagePackage#getRobot_Action()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getAction();

} // Robot
