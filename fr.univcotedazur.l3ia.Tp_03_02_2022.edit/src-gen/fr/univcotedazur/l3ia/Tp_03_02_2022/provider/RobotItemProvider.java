/**
 */
package fr.univcotedazur.l3ia.Tp_03_02_2022.provider;

import fr.univcotedazur.l3ia.Tp_03_02_2022.Robot;
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
 * This is the item provider adapter for a {@link fr.univcotedazur.l3ia.Tp_03_02_2022.Robot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RobotItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Tp_03_02_2022Package.Literals.ROBOT__MOTEUR);
			childrenFeatures.add(Tp_03_02_2022Package.Literals.ROBOT__SENSOR);
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
	 * This returns Robot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Robot"));
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
		String label = ((Robot) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Robot_type")
				: getString("_UI_Robot_type") + " " + label;
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

		switch (notification.getFeatureID(Robot.class)) {
		case Tp_03_02_2022Package.ROBOT__MOTEUR:
		case Tp_03_02_2022Package.ROBOT__SENSOR:
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

		newChildDescriptors.add(createChildParameter(Tp_03_02_2022Package.Literals.ROBOT__MOTEUR,
				Tp_03_02_2022Factory.eINSTANCE.createLeftMotor()));

		newChildDescriptors.add(createChildParameter(Tp_03_02_2022Package.Literals.ROBOT__MOTEUR,
				Tp_03_02_2022Factory.eINSTANCE.createRightMotor()));

		newChildDescriptors.add(createChildParameter(Tp_03_02_2022Package.Literals.ROBOT__SENSOR,
				Tp_03_02_2022Factory.eINSTANCE.createColorSensor()));

		newChildDescriptors.add(createChildParameter(Tp_03_02_2022Package.Literals.ROBOT__SENSOR,
				Tp_03_02_2022Factory.eINSTANCE.createPositionSensor()));

		newChildDescriptors.add(createChildParameter(Tp_03_02_2022Package.Literals.ROBOT__SENSOR,
				Tp_03_02_2022Factory.eINSTANCE.createIntensitySensor()));

		newChildDescriptors.add(createChildParameter(Tp_03_02_2022Package.Literals.ROBOT__SENSOR,
				Tp_03_02_2022Factory.eINSTANCE.createLightSensor()));

		newChildDescriptors.add(createChildParameter(Tp_03_02_2022Package.Literals.ROBOT__SENSOR,
				Tp_03_02_2022Factory.eINSTANCE.createInfraredSensor()));

		newChildDescriptors.add(createChildParameter(Tp_03_02_2022Package.Literals.ROBOT__SENSOR,
				Tp_03_02_2022Factory.eINSTANCE.createGyroSensor()));

		newChildDescriptors.add(createChildParameter(Tp_03_02_2022Package.Literals.ROBOT__SENSOR,
				Tp_03_02_2022Factory.eINSTANCE.createGPSSensor()));

		newChildDescriptors.add(createChildParameter(Tp_03_02_2022Package.Literals.ROBOT__SENSOR,
				Tp_03_02_2022Factory.eINSTANCE.createUltrasonicSensor()));
	}

}
