/**
 */
package fr.univcotedazur.l3ia.Tp_03_02_2022;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.VariableRef#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package#getVariableRef()
 * @model
 * @generated
 */
public interface VariableRef extends Reference {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package#getVariableRef_Variable()
	 * @model required="true"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.VariableRef#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

} // VariableRef
