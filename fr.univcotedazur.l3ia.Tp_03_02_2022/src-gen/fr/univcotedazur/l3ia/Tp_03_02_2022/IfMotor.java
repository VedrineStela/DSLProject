/**
 */
package fr.univcotedazur.l3ia.Tp_03_02_2022;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Motor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.IfMotor#getStatement <em>Statement</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.IfMotor#getBoolM <em>Bool M</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.IfMotor#getElsemotor <em>Elsemotor</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package#getIfMotor()
 * @model
 * @generated
 */
public interface IfMotor extends ConditionMotor {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference list.
	 * The list contents are of type {@link fr.univcotedazur.l3ia.Tp_03_02_2022.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference list.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package#getIfMotor_Statement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatement();

	/**
	 * Returns the value of the '<em><b>Bool M</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool M</em>' containment reference.
	 * @see #setBoolM(BooleanOperationsOnMotors)
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package#getIfMotor_BoolM()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BooleanOperationsOnMotors getBoolM();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.IfMotor#getBoolM <em>Bool M</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bool M</em>' containment reference.
	 * @see #getBoolM()
	 * @generated
	 */
	void setBoolM(BooleanOperationsOnMotors value);

	/**
	 * Returns the value of the '<em><b>Elsemotor</b></em>' containment reference list.
	 * The list contents are of type {@link fr.univcotedazur.l3ia.Tp_03_02_2022.ElseMotor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elsemotor</em>' containment reference list.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package#getIfMotor_Elsemotor()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElseMotor> getElsemotor();

} // IfMotor
