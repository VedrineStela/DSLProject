/**
 */
package fr.univcotedazur.l3ia.projetLegoLanguage.provider;

import fr.univcotedazur.l3ia.projetLegoLanguage.ProjetLegoLanguageFactory;
import fr.univcotedazur.l3ia.projetLegoLanguage.ProjetLegoLanguagePackage;
import fr.univcotedazur.l3ia.projetLegoLanguage.Robot;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.univcotedazur.l3ia.projetLegoLanguage.Robot} object.
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
			childrenFeatures.add(ProjetLegoLanguagePackage.Literals.ROBOT__MOTEUR);
			childrenFeatures.add(ProjetLegoLanguagePackage.Literals.ROBOT__LEFTMOTOR);
			childrenFeatures.add(ProjetLegoLanguagePackage.Literals.ROBOT__RIGHTMOTOR);
			childrenFeatures.add(ProjetLegoLanguagePackage.Literals.ROBOT__SENSOR);
			childrenFeatures.add(ProjetLegoLanguagePackage.Literals.ROBOT__PORT);
			childrenFeatures.add(ProjetLegoLanguagePackage.Literals.ROBOT__ACTOR);
			childrenFeatures.add(ProjetLegoLanguagePackage.Literals.ROBOT__ACTION);
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
		case ProjetLegoLanguagePackage.ROBOT__MOTEUR:
		case ProjetLegoLanguagePackage.ROBOT__LEFTMOTOR:
		case ProjetLegoLanguagePackage.ROBOT__RIGHTMOTOR:
		case ProjetLegoLanguagePackage.ROBOT__SENSOR:
		case ProjetLegoLanguagePackage.ROBOT__PORT:
		case ProjetLegoLanguagePackage.ROBOT__ACTOR:
		case ProjetLegoLanguagePackage.ROBOT__ACTION:
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

		newChildDescriptors.add(createChildParameter(ProjetLegoLanguagePackage.Literals.ROBOT__MOTEUR,
				ProjetLegoLanguageFactory.eINSTANCE.createMotor()));

		newChildDescriptors.add(createChildParameter(ProjetLegoLanguagePackage.Literals.ROBOT__MOTEUR,
				ProjetLegoLanguageFactory.eINSTANCE.createLeftMotor()));

		newChildDescriptors.add(createChildParameter(ProjetLegoLanguagePackage.Literals.ROBOT__MOTEUR,
				ProjetLegoLanguageFactory.eINSTANCE.createRightMotor()));

		newChildDescriptors.add(createChildParameter(ProjetLegoLanguagePackage.Literals.ROBOT__LEFTMOTOR,
				ProjetLegoLanguageFactory.eINSTANCE.createLeftMotor()));

		newChildDescriptors.add(createChildParameter(ProjetLegoLanguagePackage.Literals.ROBOT__RIGHTMOTOR,
				ProjetLegoLanguageFactory.eINSTANCE.createRightMotor()));

		newChildDescriptors.add(createChildParameter(ProjetLegoLanguagePackage.Literals.ROBOT__SENSOR,
				ProjetLegoLanguageFactory.eINSTANCE.createSensor()));

		newChildDescriptors.add(createChildParameter(ProjetLegoLanguagePackage.Literals.ROBOT__SENSOR,
				ProjetLegoLanguageFactory.eINSTANCE.createColorSensor()));

		newChildDescriptors.add(createChildParameter(ProjetLegoLanguagePackage.Literals.ROBOT__SENSOR,
				ProjetLegoLanguageFactory.eINSTANCE.createPositionSensor()));

		newChildDescriptors.add(createChildParameter(ProjetLegoLanguagePackage.Literals.ROBOT__PORT,
				ProjetLegoLanguageFactory.eINSTANCE.createPort()));

		newChildDescriptors.add(createChildParameter(ProjetLegoLanguagePackage.Literals.ROBOT__ACTOR,
				ProjetLegoLanguageFactory.eINSTANCE.createMotor()));

		newChildDescriptors.add(createChildParameter(ProjetLegoLanguagePackage.Literals.ROBOT__ACTOR,
				ProjetLegoLanguageFactory.eINSTANCE.createLeftMotor()));

		newChildDescriptors.add(createChildParameter(ProjetLegoLanguagePackage.Literals.ROBOT__ACTOR,
				ProjetLegoLanguageFactory.eINSTANCE.createRightMotor()));

		newChildDescriptors.add(createChildParameter(ProjetLegoLanguagePackage.Literals.ROBOT__ACTION,
				ProjetLegoLanguageFactory.eINSTANCE.createGo()));

		newChildDescriptors.add(createChildParameter(ProjetLegoLanguagePackage.Literals.ROBOT__ACTION,
				ProjetLegoLanguageFactory.eINSTANCE.createRight()));

		newChildDescriptors.add(createChildParameter(ProjetLegoLanguagePackage.Literals.ROBOT__ACTION,
				ProjetLegoLanguageFactory.eINSTANCE.createLeft()));

		newChildDescriptors.add(createChildParameter(ProjetLegoLanguagePackage.Literals.ROBOT__ACTION,
				ProjetLegoLanguageFactory.eINSTANCE.createContinue()));

		newChildDescriptors.add(createChildParameter(ProjetLegoLanguagePackage.Literals.ROBOT__ACTION,
				ProjetLegoLanguageFactory.eINSTANCE.createBack()));

		newChildDescriptors.add(createChildParameter(ProjetLegoLanguagePackage.Literals.ROBOT__ACTION,
				ProjetLegoLanguageFactory.eINSTANCE.createShutDown()));

		newChildDescriptors.add(createChildParameter(ProjetLegoLanguagePackage.Literals.ROBOT__ACTION,
				ProjetLegoLanguageFactory.eINSTANCE.createDown()));

		newChildDescriptors.add(createChildParameter(ProjetLegoLanguagePackage.Literals.ROBOT__ACTION,
				ProjetLegoLanguageFactory.eINSTANCE.createRotate()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == ProjetLegoLanguagePackage.Literals.ROBOT__MOTEUR
				|| childFeature == ProjetLegoLanguagePackage.Literals.ROBOT__ACTOR
				|| childFeature == ProjetLegoLanguagePackage.Literals.ROBOT__LEFTMOTOR
				|| childFeature == ProjetLegoLanguagePackage.Literals.ROBOT__RIGHTMOTOR;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
