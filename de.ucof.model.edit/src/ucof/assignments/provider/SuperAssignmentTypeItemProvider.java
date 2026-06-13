/**
 */
package ucof.assignments.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ucof.assignments.AssignmentsPackage;
import ucof.assignments.SuperAssignmentType;

import ucof.common.etypes.EtypesPackage;

import ucof.common.etypes.provider.SuperIdentifierTypeItemProvider;

import ucof.provider.UcofEditPlugin;

/**
 * This is the item provider adapter for a {@link ucof.assignments.SuperAssignmentType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SuperAssignmentTypeItemProvider extends SuperIdentifierTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperAssignmentTypeItemProvider(AdapterFactory adapterFactory) {
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
			addSourceIDPropertyDescriptor(object);
			addTargetIDPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Source ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SuperAssignmentType_sourceID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SuperAssignmentType_sourceID_feature", "_UI_SuperAssignmentType_type"),
				 AssignmentsPackage.Literals.SUPER_ASSIGNMENT_TYPE__SOURCE_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SuperAssignmentType_targetID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SuperAssignmentType_targetID_feature", "_UI_SuperAssignmentType_type"),
				 AssignmentsPackage.Literals.SUPER_ASSIGNMENT_TYPE__TARGET_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SuperAssignmentType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SuperAssignmentType_type") :
			getString("_UI_SuperAssignmentType_type") + " " + label;
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

		switch (notification.getFeatureID(SuperAssignmentType.class)) {
			case AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__DOCUMENTATION:
			case AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__MODIFIED:
			case AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__MODIFIER:
			case AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__TRACE_LINK:
			case AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__CREATED:
			case AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__CREATOR:
			case AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__VERSION:
			case AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__SOURCE_ID:
			case AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__TARGET_ID:
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
