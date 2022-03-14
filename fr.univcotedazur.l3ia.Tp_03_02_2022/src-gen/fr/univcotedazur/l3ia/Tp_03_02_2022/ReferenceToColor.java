/**
 */
package fr.univcotedazur.l3ia.Tp_03_02_2022;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference To Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.ReferenceToColor#getColorsensor <em>Colorsensor</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package#getReferenceToColor()
 * @model
 * @generated
 */
public interface ReferenceToColor extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Colorsensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colorsensor</em>' reference.
	 * @see #setColorsensor(ColorSensor)
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package#getReferenceToColor_Colorsensor()
	 * @model required="true"
	 * @generated
	 */
	ColorSensor getColorsensor();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.ReferenceToColor#getColorsensor <em>Colorsensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colorsensor</em>' reference.
	 * @see #getColorsensor()
	 * @generated
	 */
	void setColorsensor(ColorSensor value);

} // ReferenceToColor
