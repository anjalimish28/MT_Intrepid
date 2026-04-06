/**
 */
package ucof.common.etypes.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.SuperPortType;

/**
 * This is the item provider adapter for a {@link ucof.common.etypes.SuperPortType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SuperPortTypeItemProvider extends SuperIdentifierTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperPortTypeItemProvider(AdapterFactory adapterFactory) {
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
			addMaxMessageSizePropertyDescriptor(object);
			addPortDirectionPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Max Message Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxMessageSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SuperPortType_maxMessageSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SuperPortType_maxMessageSize_feature", "_UI_SuperPortType_type"),
				 EtypesPackage.Literals.SUPER_PORT_TYPE__MAX_MESSAGE_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Port Direction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortDirectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SuperPortType_portDirection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SuperPortType_portDirection_feature", "_UI_SuperPortType_type"),
				 EtypesPackage.Literals.SUPER_PORT_TYPE__PORT_DIRECTION,
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
		String label = ((SuperPortType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SuperPortType_type") :
			getString("_UI_SuperPortType_type") + " " + label;
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

		switch (notification.getFeatureID(SuperPortType.class)) {
			case EtypesPackage.SUPER_PORT_TYPE__DOCUMENTATION:
			case EtypesPackage.SUPER_PORT_TYPE__MODIFIED:
			case EtypesPackage.SUPER_PORT_TYPE__MODIFIER:
			case EtypesPackage.SUPER_PORT_TYPE__TRACE_LINK:
			case EtypesPackage.SUPER_PORT_TYPE__CREATED:
			case EtypesPackage.SUPER_PORT_TYPE__CREATOR:
			case EtypesPackage.SUPER_PORT_TYPE__VERSION:
			case EtypesPackage.SUPER_PORT_TYPE__MAX_MESSAGE_SIZE:
			case EtypesPackage.SUPER_PORT_TYPE__PORT_DIRECTION:
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
