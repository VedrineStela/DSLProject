/**
 */
package fr.univcotedazur.l3ia.Tp_03_02_2022;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Variable#isIsConst <em>Is Const</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Variable#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package#getVariable()
 * @model
 * @generated
 */
public interface Variable extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Const</em>' attribute.
	 * @see #setIsConst(boolean)
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package#getVariable_IsConst()
	 * @model
	 * @generated
	 */
	boolean isIsConst();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Variable#isIsConst <em>Is Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Const</em>' attribute.
	 * @see #isIsConst()
	 * @generated
	 */
	void setIsConst(boolean value);

	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see #setInitialValue(int)
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package#getVariable_InitialValue()
	 * @model
	 * @generated
	 */
	int getInitialValue();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Variable#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(int value);

} // Variable
