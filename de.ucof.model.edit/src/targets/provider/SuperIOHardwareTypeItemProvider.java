/**
 */
package targets.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import targets.SuperIOHardwareType;
import targets.TargetsFactory;
import targets.TargetsPackage;

import targets.avip.AvipFactory;
import targets.tricore299a653p4.Tricore299a653p4Factory;

import targets.vxworksa653.Vxworksa653Factory;

import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.provider.SuperIdentifierTypeItemProvider;
import ucof.provider.UcofEditPlugin;

/**
 * This is the item provider adapter for a {@link targets.SuperIOHardwareType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SuperIOHardwareTypeItemProvider 
	extends SuperIdentifierTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperIOHardwareTypeItemProvider(AdapterFactory adapterFactory) {
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

			addDocumentationPropertyDescriptor(object);
			addModifiedPropertyDescriptor(object);
			addModifierPropertyDescriptor(object);
			addTraceLinkPropertyDescriptor(object);
			addCreatedPropertyDescriptor(object);
			addCreatorPropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Documentation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDocumentationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SuperTrackingType_documentation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SuperTrackingType_documentation_feature", "_UI_SuperTrackingType_type"),
				 EtypesPackage.Literals.SUPER_TRACKING_TYPE__DOCUMENTATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_TracingPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Modified feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModifiedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SuperTrackingType_modified_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SuperTrackingType_modified_feature", "_UI_SuperTrackingType_type"),
				 EtypesPackage.Literals.SUPER_TRACKING_TYPE__MODIFIED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_TracingPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Modifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SuperTrackingType_modifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SuperTrackingType_modifier_feature", "_UI_SuperTrackingType_type"),
				 EtypesPackage.Literals.SUPER_TRACKING_TYPE__MODIFIER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_TracingPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Trace Link feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTraceLinkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SuperTrackingType_traceLink_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SuperTrackingType_traceLink_feature", "_UI_SuperTrackingType_type"),
				 EtypesPackage.Literals.SUPER_TRACKING_TYPE__TRACE_LINK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_TracingPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Created feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SuperTrackingType_created_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SuperTrackingType_created_feature", "_UI_SuperTrackingType_type"),
				 EtypesPackage.Literals.SUPER_TRACKING_TYPE__CREATED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_TracingPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Creator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SuperTrackingType_creator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SuperTrackingType_creator_feature", "_UI_SuperTrackingType_type"),
				 EtypesPackage.Literals.SUPER_TRACKING_TYPE__CREATOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_TracingPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SuperTrackingType_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SuperTrackingType_version_feature", "_UI_SuperTrackingType_type"),
				 EtypesPackage.Literals.SUPER_TRACKING_TYPE__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_TracingPropertyCategory"),
				 null));
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
			childrenFeatures.add(TargetsPackage.Literals.SUPER_IO_HARDWARE_TYPE__ASSIGNMENT_SPECIFICATION);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SuperIOHardwareType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SuperIOHardwareType_type") :
			getString("_UI_SuperIOHardwareType_type") + " " + label;
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

		switch (notification.getFeatureID(SuperIOHardwareType.class)) {
			case TargetsPackage.SUPER_IO_HARDWARE_TYPE__DOCUMENTATION:
			case TargetsPackage.SUPER_IO_HARDWARE_TYPE__MODIFIED:
			case TargetsPackage.SUPER_IO_HARDWARE_TYPE__MODIFIER:
			case TargetsPackage.SUPER_IO_HARDWARE_TYPE__TRACE_LINK:
			case TargetsPackage.SUPER_IO_HARDWARE_TYPE__CREATED:
			case TargetsPackage.SUPER_IO_HARDWARE_TYPE__CREATOR:
			case TargetsPackage.SUPER_IO_HARDWARE_TYPE__VERSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TargetsPackage.SUPER_IO_HARDWARE_TYPE__ASSIGNMENT_SPECIFICATION:
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

		newChildDescriptors.add
			(createChildParameter
				(TargetsPackage.Literals.SUPER_IO_HARDWARE_TYPE__ASSIGNMENT_SPECIFICATION,
				 TargetsFactory.eINSTANCE.createAttributeDatatypeConversion()));

		newChildDescriptors.add
			(createChildParameter
				(TargetsPackage.Literals.SUPER_IO_HARDWARE_TYPE__ASSIGNMENT_SPECIFICATION,
				 Tricore299a653p4Factory.eINSTANCE.createMessagePostBoxSpecifier()));

		newChildDescriptors.add
			(createChildParameter
				(TargetsPackage.Literals.SUPER_IO_HARDWARE_TYPE__ASSIGNMENT_SPECIFICATION,
				 Vxworksa653Factory.eINSTANCE.createSimulatedDevices()));

		newChildDescriptors.add
			(createChildParameter
				(TargetsPackage.Literals.SUPER_IO_HARDWARE_TYPE__ASSIGNMENT_SPECIFICATION,
				 AvipFactory.eINSTANCE.createMEMPortIDExtension()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return UcofEditPlugin.INSTANCE;
	}

}
