/**
 */
package fr.univcotedazur.l3ia.Tp_03_02_2022.impl;

import fr.univcotedazur.l3ia.Tp_03_02_2022.Program;
import fr.univcotedazur.l3ia.Tp_03_02_2022.ReferenceToColor;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Robot;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Statement;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ProgramImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ProgramImpl#getRobot <em>Robot</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ProgramImpl#getReferencetocolor <em>Referencetocolor</em>}</li>
 *   <li>{@link fr.univcotedazur.l3ia.Tp_03_02_2022.impl.ProgramImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends NamedElementImpl implements Program {
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
	 * The cached value of the '{@link #getRobot() <em>Robot</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRobot()
	 * @generated
	 * @ordered
	 */
	protected EList<Robot> robot;

	/**
	 * The cached value of the '{@link #getReferencetocolor() <em>Referencetocolor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencetocolor()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferenceToColor> referencetocolor;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tp_03_02_2022Package.Literals.PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariable() {
		if (variable == null) {
			variable = new EObjectContainmentEList<Variable>(Variable.class, this,
					Tp_03_02_2022Package.PROGRAM__VARIABLE);
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getStatement() {
		if (statement == null) {
			statement = new EObjectContainmentEList<Statement>(Statement.class, this,
					Tp_03_02_2022Package.PROGRAM__STATEMENT);
		}
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Robot> getRobot() {
		if (robot == null) {
			robot = new EObjectContainmentEList<Robot>(Robot.class, this, Tp_03_02_2022Package.PROGRAM__ROBOT);
		}
		return robot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceToColor> getReferencetocolor() {
		if (referencetocolor == null) {
			referencetocolor = new EObjectContainmentEList<ReferenceToColor>(ReferenceToColor.class, this,
					Tp_03_02_2022Package.PROGRAM__REFERENCETOCOLOR);
		}
		return referencetocolor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Tp_03_02_2022Package.PROGRAM__STATEMENT:
			return ((InternalEList<?>) getStatement()).basicRemove(otherEnd, msgs);
		case Tp_03_02_2022Package.PROGRAM__ROBOT:
			return ((InternalEList<?>) getRobot()).basicRemove(otherEnd, msgs);
		case Tp_03_02_2022Package.PROGRAM__REFERENCETOCOLOR:
			return ((InternalEList<?>) getReferencetocolor()).basicRemove(otherEnd, msgs);
		case Tp_03_02_2022Package.PROGRAM__VARIABLE:
			return ((InternalEList<?>) getVariable()).basicRemove(otherEnd, msgs);
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
		case Tp_03_02_2022Package.PROGRAM__STATEMENT:
			return getStatement();
		case Tp_03_02_2022Package.PROGRAM__ROBOT:
			return getRobot();
		case Tp_03_02_2022Package.PROGRAM__REFERENCETOCOLOR:
			return getReferencetocolor();
		case Tp_03_02_2022Package.PROGRAM__VARIABLE:
			return getVariable();
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
		case Tp_03_02_2022Package.PROGRAM__STATEMENT:
			getStatement().clear();
			getStatement().addAll((Collection<? extends Statement>) newValue);
			return;
		case Tp_03_02_2022Package.PROGRAM__ROBOT:
			getRobot().clear();
			getRobot().addAll((Collection<? extends Robot>) newValue);
			return;
		case Tp_03_02_2022Package.PROGRAM__REFERENCETOCOLOR:
			getReferencetocolor().clear();
			getReferencetocolor().addAll((Collection<? extends ReferenceToColor>) newValue);
			return;
		case Tp_03_02_2022Package.PROGRAM__VARIABLE:
			getVariable().clear();
			getVariable().addAll((Collection<? extends Variable>) newValue);
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
		case Tp_03_02_2022Package.PROGRAM__STATEMENT:
			getStatement().clear();
			return;
		case Tp_03_02_2022Package.PROGRAM__ROBOT:
			getRobot().clear();
			return;
		case Tp_03_02_2022Package.PROGRAM__REFERENCETOCOLOR:
			getReferencetocolor().clear();
			return;
		case Tp_03_02_2022Package.PROGRAM__VARIABLE:
			getVariable().clear();
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
		case Tp_03_02_2022Package.PROGRAM__STATEMENT:
			return statement != null && !statement.isEmpty();
		case Tp_03_02_2022Package.PROGRAM__ROBOT:
			return robot != null && !robot.isEmpty();
		case Tp_03_02_2022Package.PROGRAM__REFERENCETOCOLOR:
			return referencetocolor != null && !referencetocolor.isEmpty();
		case Tp_03_02_2022Package.PROGRAM__VARIABLE:
			return variable != null && !variable.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProgramImpl
