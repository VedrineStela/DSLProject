/**
 */
package fr.univcotedazur.l3ia.Tp_03_02_2022.provider;

import fr.univcotedazur.l3ia.Tp_03_02_2022.ElseMotor;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Factory;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.univcotedazur.l3ia.Tp_03_02_2022.ElseMotor} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ElseMotorItemProvider extends ConditionMotorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElseMotorItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Tp_03_02_2022Package.Literals.ELSE_MOTOR__STATEMENT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ElseMotor.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ElseMotor"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ElseMotor_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ElseMotor.class)) {
		case Tp_03_02_2022Package.ELSE_MOTOR__STATEMENT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(Tp_03_02_2022Package.Literals.ELSE_MOTOR__STATEMENT,
				Tp_03_02_2022Factory.eINSTANCE.createStatement()));

		newChildDescriptors.add(createChildParameter(Tp_03_02_2022Package.Literals.ELSE_MOTOR__STATEMENT,
				Tp_03_02_2022Factory.eINSTANCE.createWhileLoop()));

		newChildDescriptors.add(createChildParameter(Tp_03_02_2022Package.Literals.ELSE_MOTOR__STATEMENT,
				Tp_03_02_2022Factory.eINSTANCE.createReference()));

		newChildDescriptors.add(createChildParameter(Tp_03_02_2022Package.Literals.ELSE_MOTOR__STATEMENT,
				Tp_03_02_2022Factory.eINSTANCE.createVariableRef()));

		newChildDescriptors.add(createChildParameter(Tp_03_02_2022Package.Literals.ELSE_MOTOR__STATEMENT,
				Tp_03_02_2022Factory.eINSTANCE.createAssignment()));

		newChildDescriptors.add(createChildParameter(Tp_03_02_2022Package.Literals.ELSE_MOTOR__STATEMENT,
				Tp_03_02_2022Factory.eINSTANCE.createComparison()));

		newChildDescriptors.add(createChildParameter(Tp_03_02_2022Package.Literals.ELSE_MOTOR__STATEMENT,
				Tp_03_02_2022Factory.eINSTANCE.createSubstraction()));

		newChildDescriptors.add(createChildParameter(Tp_03_02_2022Package.Literals.ELSE_MOTOR__STATEMENT,
				Tp_03_02_2022Factory.eINSTANCE.createGreaterThan()));

		newChildDescriptors.add(createChildParameter(Tp_03_02_2022Package.Literals.ELSE_MOTOR__STATEMENT,
				Tp_03_02_2022Factory.eINSTANCE.createLowerThan()));

		newChildDescriptors.add(createChildParameter(Tp_03_02_2022Package.Literals.ELSE_MOTOR__STATEMENT,
				Tp_03_02_2022Factory.eINSTANCE.createEqual()));

		newChildDescriptors.add(createChildParameter(Tp_03_02_2022Package.Literals.ELSE_MOTOR__STATEMENT,
				Tp_03_02_2022Factory.eINSTANCE.createForLoop()));

		newChildDescriptors.add(createChildParameter(Tp_03_02_2022Package.Literals.ELSE_MOTOR__STATEMENT,
				Tp_03_02_2022Factory.eINSTANCE.createAddition()));

		newChildDescriptors.add(createChildParameter(Tp_03_02_2022Package.Literals.ELSE_MOTOR__STATEMENT,
				Tp_03_02_2022Factory.eINSTANCE.createMultiplication()));

		newChildDescriptors.add(createChildParameter(Tp_03_02_2022Package.Literals.ELSE_MOTOR__STATEMENT,
				Tp_03_02_2022Factory.eINSTANCE.createDivision()));

		newChildDescriptors.add(createChildParameter(Tp_03_02_2022Package.Literals.ELSE_MOTOR__STATEMENT,
				Tp_03_02_2022Factory.eINSTANCE.createAccelerate()));

		newChildDescriptors.add(createChildParameter(Tp_03_02_2022Package.Literals.ELSE_MOTOR__STATEMENT,
				Tp_03_02_2022Factory.eINSTANCE.createStop()));

		newChildDescriptors.add(createChildParameter(Tp_03_02_2022Package.Literals.ELSE_MOTOR__STATEMENT,
				Tp_03_02_2022Factory.eINSTANCE.createTurnOn()));

		newChildDescriptors.add(createChildParameter(Tp_03_02_2022Package.Literals.ELSE_MOTOR__STATEMENT,
				Tp_03_02_2022Factory.eINSTANCE.createMove()));

		newChildDescriptors.add(createChildParameter(Tp_03_02_2022Package.Literals.ELSE_MOTOR__STATEMENT,
				Tp_03_02_2022Factory.eINSTANCE.createLeftRotation()));

		newChildDescriptors.add(createChildParameter(Tp_03_02_2022Package.Literals.ELSE_MOTOR__STATEMENT,
				Tp_03_02_2022Factory.eINSTANCE.createRightRotation()));

		newChildDescriptors.add(createChildParameter(Tp_03_02_2022Package.Literals.ELSE_MOTOR__STATEMENT,
				Tp_03_02_2022Factory.eINSTANCE.createIfCondition()));

		newChildDescriptors.add(createChildParameter(Tp_03_02_2022Package.Literals.ELSE_MOTOR__STATEMENT,
				Tp_03_02_2022Factory.eINSTANCE.createIfMotor()));

		newChildDescriptors.add(createChildParameter(Tp_03_02_2022Package.Literals.ELSE_MOTOR__STATEMENT,
				Tp_03_02_2022Factory.eINSTANCE.createElseMotor()));

		newChildDescriptors.add(createChildParameter(Tp_03_02_2022Package.Literals.ELSE_MOTOR__STATEMENT,
				Tp_03_02_2022Factory.eINSTANCE.createSetThank()));

		newChildDescriptors.add(createChildParameter(Tp_03_02_2022Package.Literals.ELSE_MOTOR__STATEMENT,
				Tp_03_02_2022Factory.eINSTANCE.createMoveLeft()));

		newChildDescriptors.add(createChildParameter(Tp_03_02_2022Package.Literals.ELSE_MOTOR__STATEMENT,
				Tp_03_02_2022Factory.eINSTANCE.createOnForRotation()));
	}

}
