/**
 */
package fr.univcotedazur.l3ia.Tp_03_02_2022;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Program#getStatement <em>Statement</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Program#getRobot <em>Robot</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Program#getReferencetocolor <em>Referencetocolor</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.Program#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package#getProgram()
 * @model
 * @generated
 */
public interface Program extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link fr.univcotedazur.l3ia.Tp_03_02_2022.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package#getProgram_Variable()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariable();

	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference list.
	 * The list contents are of type {@link fr.univcotedazur.l3ia.Tp_03_02_2022.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference list.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package#getProgram_Statement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatement();

	/**
	 * Returns the value of the '<em><b>Robot</b></em>' containment reference list.
	 * The list contents are of type {@link fr.univcotedazur.l3ia.Tp_03_02_2022.Robot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Robot</em>' containment reference list.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package#getProgram_Robot()
	 * @model containment="true"
	 * @generated
	 */
	EList<Robot> getRobot();

	/**
	 * Returns the value of the '<em><b>Referencetocolor</b></em>' containment reference list.
	 * The list contents are of type {@link fr.univcotedazur.l3ia.Tp_03_02_2022.ReferenceToColor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referencetocolor</em>' containment reference list.
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package#getProgram_Referencetocolor()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReferenceToColor> getReferencetocolor();

} // Program
