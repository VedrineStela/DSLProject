/**
 */
package fr.univcotedazur.l3ia.Tp_03_02_2022.provider;

import fr.univcotedazur.l3ia.Tp_03_02_2022.MultipleMotorActions;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Tp_03_02_2022Package;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.univcotedazur.l3ia.Tp_03_02_2022.MultipleMotorActions} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MultipleMotorActionsItemProvider extends StatementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleMotorActionsItemProvider(AdapterFactory adapterFactory) {
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

			addLeftmotorPropertyDescriptor(object);
			addRightmotorPropertyDescriptor(object);
			addAnglePropertyDescriptor(object);
			addSpeedPropertyDescriptor(object);
			addDurationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Leftmotor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLeftmotorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MultipleMotorActions_leftmotor_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_MultipleMotorActions_leftmotor_feature",
						"_UI_MultipleMotorActions_type"),
				Tp_03_02_2022Package.Literals.MULTIPLE_MOTOR_ACTIONS__LEFTMOTOR, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Rightmotor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRightmotorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MultipleMotorActions_rightmotor_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_MultipleMotorActions_rightmotor_feature",
						"_UI_MultipleMotorActions_type"),
				Tp_03_02_2022Package.Literals.MULTIPLE_MOTOR_ACTIONS__RIGHTMOTOR, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnglePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MultipleMotorActions_angle_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_MultipleMotorActions_angle_feature",
						"_UI_MultipleMotorActions_type"),
				Tp_03_02_2022Package.Literals.MULTIPLE_MOTOR_ACTIONS__ANGLE, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Speed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpeedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MultipleMotorActions_speed_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_MultipleMotorActions_speed_feature",
						"_UI_MultipleMotorActions_type"),
				Tp_03_02_2022Package.Literals.MULTIPLE_MOTOR_ACTIONS__SPEED, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_MultipleMotorActions_duration_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_MultipleMotorActions_duration_feature",
								"_UI_MultipleMotorActions_type"),
						Tp_03_02_2022Package.Literals.MULTIPLE_MOTOR_ACTIONS__DURATION, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns MultipleMotorActions.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MultipleMotorActions"));
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
		MultipleMotorActions multipleMotorActions = (MultipleMotorActions) object;
		return getString("_UI_MultipleMotorActions_type") + " " + multipleMotorActions.getAngle();
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

		switch (notification.getFeatureID(MultipleMotorActions.class)) {
		case Tp_03_02_2022Package.MULTIPLE_MOTOR_ACTIONS__ANGLE:
		case Tp_03_02_2022Package.MULTIPLE_MOTOR_ACTIONS__SPEED:
		case Tp_03_02_2022Package.MULTIPLE_MOTOR_ACTIONS__DURATION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
