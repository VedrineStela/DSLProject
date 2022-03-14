/**
 */
package fr.univcotedazur.l3ia.Tp_03_02_2022;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Operations On Motors</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.BooleanOperationsOnMotors#getLeftC <em>Left C</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.BooleanOperationsOnMotors#getRightC <em>Right C</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package#getBooleanOperationsOnMotors()
 * @model abstract="true"
 * @generated
 */
public interface BooleanOperationsOnMotors extends EObject {
	/**
	 * Returns the value of the '<em><b>Left C</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left C</em>' containment reference.
	 * @see #setLeftC(ColorRef)
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package#getBooleanOperationsOnMotors_LeftC()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ColorRef getLeftC();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.BooleanOperationsOnMotors#getLeftC <em>Left C</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left C</em>' containment reference.
	 * @see #getLeftC()
	 * @generated
	 */
	void setLeftC(ColorRef value);

	/**
	 * Returns the value of the '<em><b>Right C</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right C</em>' containment reference.
	 * @see #setRightC(VariableRef)
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package#getBooleanOperationsOnMotors_RightC()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VariableRef getRightC();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.BooleanOperationsOnMotors#getRightC <em>Right C</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right C</em>' containment reference.
	 * @see #getRightC()
	 * @generated
	 */
	void setRightC(VariableRef value);

} // BooleanOperationsOnMotors
