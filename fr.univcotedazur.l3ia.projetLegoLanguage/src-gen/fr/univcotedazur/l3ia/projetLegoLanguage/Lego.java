/**
 */
package fr.univcotedazur.l3ia.projetLegoLanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lego</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.projetLegoLanguage.Lego#getRobot <em>Robot</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.l3ia.projetLegoLanguage.ProjetLegoLanguagePackage#getLego()
 * @model
 * @generated
 */
public interface Lego extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Robot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Robot</em>' containment reference.
	 * @see #setRobot(Robot)
	 * @see fr.univcotedazur.l3ia.projetLegoLanguage.ProjetLegoLanguagePackage#getLego_Robot()
	 * @model containment="true"
	 * @generated
	 */
	Robot getRobot();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.projetLegoLanguage.Lego#getRobot <em>Robot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Robot</em>' containment reference.
	 * @see #getRobot()
	 * @generated
	 */
	void setRobot(Robot value);

} // Lego
