/**
 */
package targets.avip.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import targets.avip.AvipPackage;
import targets.avip.PortUserConfiguration;

import ucof.common.etypes.EtypesPackage;

import ucof.common.etypes.provider.SuperIdentifierTypeItemProvider;

import ucof.provider.UcofEditPlugin;

/**
 * This is the item provider adapter for a {@link targets.avip.PortUserConfiguration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PortUserConfigurationItemProvider extends SuperIdentifierTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortUserConfigurationItemProvider(AdapterFactory adapterFactory) {
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
			addLine_functionPropertyDescriptor(object);
			addSpecial_param_1PropertyDescriptor(object);
			addSpecial_param_2PropertyDescriptor(object);
			addSpecial_param_3PropertyDescriptor(object);
			addSpecial_param_4PropertyDescriptor(object);
			addSpecial_param_5PropertyDescriptor(object);
			addInit_defaultPropertyDescriptor(object);
			addLoss_of_commandPropertyDescriptor(object);
			addNb_allowed_resetsPropertyDescriptor(object);
			addReset_wait_timePropertyDescriptor(object);
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
	 * This adds a property descriptor for the Line function feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLine_functionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PortUserConfiguration_line_function_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PortUserConfiguration_line_function_feature", "_UI_PortUserConfiguration_type"),
				 AvipPackage.Literals.PORT_USER_CONFIGURATION__LINE_FUNCTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Special param 1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpecial_param_1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PortUserConfiguration_special_param_1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PortUserConfiguration_special_param_1_feature", "_UI_PortUserConfiguration_type"),
				 AvipPackage.Literals.PORT_USER_CONFIGURATION__SPECIAL_PARAM_1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Special param 2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpecial_param_2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PortUserConfiguration_special_param_2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PortUserConfiguration_special_param_2_feature", "_UI_PortUserConfiguration_type"),
				 AvipPackage.Literals.PORT_USER_CONFIGURATION__SPECIAL_PARAM_2,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Special param 3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpecial_param_3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PortUserConfiguration_special_param_3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PortUserConfiguration_special_param_3_feature", "_UI_PortUserConfiguration_type"),
				 AvipPackage.Literals.PORT_USER_CONFIGURATION__SPECIAL_PARAM_3,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Special param 4 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpecial_param_4PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PortUserConfiguration_special_param_4_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PortUserConfiguration_special_param_4_feature", "_UI_PortUserConfiguration_type"),
				 AvipPackage.Literals.PORT_USER_CONFIGURATION__SPECIAL_PARAM_4,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Special param 5 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpecial_param_5PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PortUserConfiguration_special_param_5_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PortUserConfiguration_special_param_5_feature", "_UI_PortUserConfiguration_type"),
				 AvipPackage.Literals.PORT_USER_CONFIGURATION__SPECIAL_PARAM_5,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Init default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInit_defaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PortUserConfiguration_init_default_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PortUserConfiguration_init_default_feature", "_UI_PortUserConfiguration_type"),
				 AvipPackage.Literals.PORT_USER_CONFIGURATION__INIT_DEFAULT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Loss of command feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoss_of_commandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PortUserConfiguration_loss_of_command_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PortUserConfiguration_loss_of_command_feature", "_UI_PortUserConfiguration_type"),
				 AvipPackage.Literals.PORT_USER_CONFIGURATION__LOSS_OF_COMMAND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nb allowed resets feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNb_allowed_resetsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PortUserConfiguration_nb_allowed_resets_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PortUserConfiguration_nb_allowed_resets_feature", "_UI_PortUserConfiguration_type"),
				 AvipPackage.Literals.PORT_USER_CONFIGURATION__NB_ALLOWED_RESETS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reset wait time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReset_wait_timePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PortUserConfiguration_reset_wait_time_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PortUserConfiguration_reset_wait_time_feature", "_UI_PortUserConfiguration_type"),
				 AvipPackage.Literals.PORT_USER_CONFIGURATION__RESET_WAIT_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns PortUserConfiguration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PortUserConfiguration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PortUserConfiguration)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_PortUserConfiguration_type") :
			getString("_UI_PortUserConfiguration_type") + " " + label;
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

		switch (notification.getFeatureID(PortUserConfiguration.class)) {
			case AvipPackage.PORT_USER_CONFIGURATION__DOCUMENTATION:
			case AvipPackage.PORT_USER_CONFIGURATION__MODIFIED:
			case AvipPackage.PORT_USER_CONFIGURATION__MODIFIER:
			case AvipPackage.PORT_USER_CONFIGURATION__TRACE_LINK:
			case AvipPackage.PORT_USER_CONFIGURATION__CREATED:
			case AvipPackage.PORT_USER_CONFIGURATION__CREATOR:
			case AvipPackage.PORT_USER_CONFIGURATION__VERSION:
			case AvipPackage.PORT_USER_CONFIGURATION__LINE_FUNCTION:
			case AvipPackage.PORT_USER_CONFIGURATION__SPECIAL_PARAM_1:
			case AvipPackage.PORT_USER_CONFIGURATION__SPECIAL_PARAM_2:
			case AvipPackage.PORT_USER_CONFIGURATION__SPECIAL_PARAM_3:
			case AvipPackage.PORT_USER_CONFIGURATION__SPECIAL_PARAM_4:
			case AvipPackage.PORT_USER_CONFIGURATION__SPECIAL_PARAM_5:
			case AvipPackage.PORT_USER_CONFIGURATION__INIT_DEFAULT:
			case AvipPackage.PORT_USER_CONFIGURATION__LOSS_OF_COMMAND:
			case AvipPackage.PORT_USER_CONFIGURATION__NB_ALLOWED_RESETS:
			case AvipPackage.PORT_USER_CONFIGURATION__RESET_WAIT_TIME:
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
