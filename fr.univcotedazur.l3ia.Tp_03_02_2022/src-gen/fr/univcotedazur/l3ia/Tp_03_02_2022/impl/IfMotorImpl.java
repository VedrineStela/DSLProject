/**
 */
package fr.univcotedazur.l3ia.Tp_03_02_2022.impl;

import fr.univcotedazur.l3ia.Tp_03_02_2022.BooleanOperationsOnMotors;
import fr.univcotedazur.l3ia.Tp_03_02_2022.ElseMotor;
import fr.univcotedazur.l3ia.Tp_03_02_2022.IfMotor;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Statement;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Motor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.IfMotorImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.IfMotorImpl#getBoolM <em>Bool M</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.IfMotorImpl#getElsemotor <em>Elsemotor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfMotorImpl extends ConditionMotorImpl implements IfMotor {
	/**
	 * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> statement;

	/**
	 * The cached value of the '{@link #getBoolM() <em>Bool M</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoolM()
	 * @generated
	 * @ordered
	 */
	protected BooleanOperationsOnMotors boolM;

	/**
	 * The cached value of the '{@link #getElsemotor() <em>Elsemotor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElsemotor()
	 * @generated
	 * @ordered
	 */
	protected EList<ElseMotor> elsemotor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfMotorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tp_03_02_2022Package.Literals.IF_MOTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getStatement() {
		if (statement == null) {
			statement = new EObjectContainmentEList<Statement>(Statement.class, this,
					Tp_03_02_2022Package.IF_MOTOR__STATEMENT);
		}
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOperationsOnMotors getBoolM() {
		return boolM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoolM(BooleanOperationsOnMotors newBoolM, NotificationChain msgs) {
		BooleanOperationsOnMotors oldBoolM = boolM;
		boolM = newBoolM;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Tp_03_02_2022Package.IF_MOTOR__BOOL_M, oldBoolM, newBoolM);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoolM(BooleanOperationsOnMotors newBoolM) {
		if (newBoolM != boolM) {
			NotificationChain msgs = null;
			if (boolM != null)
				msgs = ((InternalEObject) boolM).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Tp_03_02_2022Package.IF_MOTOR__BOOL_M, null, msgs);
			if (newBoolM != null)
				msgs = ((InternalEObject) newBoolM).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Tp_03_02_2022Package.IF_MOTOR__BOOL_M, null, msgs);
			msgs = basicSetBoolM(newBoolM, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp_03_02_2022Package.IF_MOTOR__BOOL_M, newBoolM,
					newBoolM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElseMotor> getElsemotor() {
		if (elsemotor == null) {
			elsemotor = new EObjectContainmentEList<ElseMotor>(ElseMotor.class, this,
					Tp_03_02_2022Package.IF_MOTOR__ELSEMOTOR);
		}
		return elsemotor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Tp_03_02_2022Package.IF_MOTOR__STATEMENT:
			return ((InternalEList<?>) getStatement()).basicRemove(otherEnd, msgs);
		case Tp_03_02_2022Package.IF_MOTOR__BOOL_M:
			return basicSetBoolM(null, msgs);
		case Tp_03_02_2022Package.IF_MOTOR__ELSEMOTOR:
			return ((InternalEList<?>) getElsemotor()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Tp_03_02_2022Package.IF_MOTOR__STATEMENT:
			return getStatement();
		case Tp_03_02_2022Package.IF_MOTOR__BOOL_M:
			return getBoolM();
		case Tp_03_02_2022Package.IF_MOTOR__ELSEMOTOR:
			return getElsemotor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Tp_03_02_2022Package.IF_MOTOR__STATEMENT:
			getStatement().clear();
			getStatement().addAll((Collection<? extends Statement>) newValue);
			return;
		case Tp_03_02_2022Package.IF_MOTOR__BOOL_M:
			setBoolM((BooleanOperationsOnMotors) newValue);
			return;
		case Tp_03_02_2022Package.IF_MOTOR__ELSEMOTOR:
			getElsemotor().clear();
			getElsemotor().addAll((Collection<? extends ElseMotor>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Tp_03_02_2022Package.IF_MOTOR__STATEMENT:
			getStatement().clear();
			return;
		case Tp_03_02_2022Package.IF_MOTOR__BOOL_M:
			setBoolM((BooleanOperationsOnMotors) null);
			return;
		case Tp_03_02_2022Package.IF_MOTOR__ELSEMOTOR:
			getElsemotor().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Tp_03_02_2022Package.IF_MOTOR__STATEMENT:
			return statement != null && !statement.isEmpty();
		case Tp_03_02_2022Package.IF_MOTOR__BOOL_M:
			return boolM != null;
		case Tp_03_02_2022Package.IF_MOTOR__ELSEMOTOR:
			return elsemotor != null && !elsemotor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfMotorImpl
