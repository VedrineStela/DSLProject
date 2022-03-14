/**
 */
package fr.univcotedazur.l3ia.Tp_03_02_2022;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiple Motor Actions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.MultipleMotorActions#getLeftmotor <em>Leftmotor</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.MultipleMotorActions#getRightmotor <em>Rightmotor</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.MultipleMotorActions#getAngle <em>Angle</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.MultipleMotorActions#getSpeed <em>Speed</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.MultipleMotorActions#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package#getMultipleMotorActions()
 * @model abstract="true"
 * @generated
 */
public interface MultipleMotorActions extends Statement {
	/**
	 * Returns the value of the '<em><b>Leftmotor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leftmotor</em>' reference.
	 * @see #setLeftmotor(LeftMotor)
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package#getMultipleMotorActions_Leftmotor()
	 * @model required="true"
	 * @generated
	 */
	LeftMotor getLeftmotor();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.MultipleMotorActions#getLeftmotor <em>Leftmotor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leftmotor</em>' reference.
	 * @see #getLeftmotor()
	 * @generated
	 */
	void setLeftmotor(LeftMotor value);

	/**
	 * Returns the value of the '<em><b>Rightmotor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rightmotor</em>' reference.
	 * @see #setRightmotor(RightMotor)
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package#getMultipleMotorActions_Rightmotor()
	 * @model required="true"
	 * @generated
	 */
	RightMotor getRightmotor();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.MultipleMotorActions#getRightmotor <em>Rightmotor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rightmotor</em>' reference.
	 * @see #getRightmotor()
	 * @generated
	 */
	void setRightmotor(RightMotor value);

	/**
	 * Returns the value of the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' attribute.
	 * @see #setAngle(int)
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package#getMultipleMotorActions_Angle()
	 * @model
	 * @generated
	 */
	int getAngle();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.MultipleMotorActions#getAngle <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' attribute.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(int value);

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(int)
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package#getMultipleMotorActions_Speed()
	 * @model
	 * @generated
	 */
	int getSpeed();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.MultipleMotorActions#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(int value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package#getMultipleMotorActions_Duration()
	 * @model
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.l3ia.Tp_03_02_2022.MultipleMotorActions#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

} // MultipleMotorActions
