/**
 */
package ucof.communication.i2c.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ucof.common.etypes.EtypesPackage;

import ucof.common.etypes.provider.SuperIdentifierTypeItemProvider;

import ucof.communication.i2c.I2CRegisterSpecification;
import ucof.communication.i2c.I2cPackage;

import ucof.provider.UcofEditPlugin;

/**
 * This is the item provider adapter for a {@link ucof.communication.i2c.I2CRegisterSpecification} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class I2CRegisterSpecificationItemProvider extends SuperIdentifierTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I2CRegisterSpecificationItemProvider(AdapterFactory adapterFactory) {
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
			addRegisterNamePropertyDescriptor(object);
			addRegisterPointerAddressPropertyDescriptor(object);
			addRegisterWidthBitsPropertyDescriptor(object);
			addDefaultValuePropertyDescriptor(object);
			addReadOnlyPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Register Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRegisterNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_I2CRegisterSpecification_registerName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_I2CRegisterSpecification_registerName_feature", "_UI_I2CRegisterSpecification_type"),
				 I2cPackage.Literals.I2C_REGISTER_SPECIFICATION__REGISTER_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Register Pointer Address feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRegisterPointerAddressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_I2CRegisterSpecification_registerPointerAddress_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_I2CRegisterSpecification_registerPointerAddress_feature", "_UI_I2CRegisterSpecification_type"),
				 I2cPackage.Literals.I2C_REGISTER_SPECIFICATION__REGISTER_POINTER_ADDRESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Register Width Bits feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRegisterWidthBitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_I2CRegisterSpecification_registerWidthBits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_I2CRegisterSpecification_registerWidthBits_feature", "_UI_I2CRegisterSpecification_type"),
				 I2cPackage.Literals.I2C_REGISTER_SPECIFICATION__REGISTER_WIDTH_BITS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_I2CRegisterSpecification_defaultValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_I2CRegisterSpecification_defaultValue_feature", "_UI_I2CRegisterSpecification_type"),
				 I2cPackage.Literals.I2C_REGISTER_SPECIFICATION__DEFAULT_VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Read Only feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReadOnlyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_I2CRegisterSpecification_readOnly_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_I2CRegisterSpecification_readOnly_feature", "_UI_I2CRegisterSpecification_type"),
				 I2cPackage.Literals.I2C_REGISTER_SPECIFICATION__READ_ONLY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns I2CRegisterSpecification.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/I2CRegisterSpecification"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((I2CRegisterSpecification)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_I2CRegisterSpecification_type") :
			getString("_UI_I2CRegisterSpecification_type") + " " + label;
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

		switch (notification.getFeatureID(I2CRegisterSpecification.class)) {
			case I2cPackage.I2C_REGISTER_SPECIFICATION__DOCUMENTATION:
			case I2cPackage.I2C_REGISTER_SPECIFICATION__MODIFIED:
			case I2cPackage.I2C_REGISTER_SPECIFICATION__MODIFIER:
			case I2cPackage.I2C_REGISTER_SPECIFICATION__TRACE_LINK:
			case I2cPackage.I2C_REGISTER_SPECIFICATION__CREATED:
			case I2cPackage.I2C_REGISTER_SPECIFICATION__CREATOR:
			case I2cPackage.I2C_REGISTER_SPECIFICATION__VERSION:
			case I2cPackage.I2C_REGISTER_SPECIFICATION__REGISTER_NAME:
			case I2cPackage.I2C_REGISTER_SPECIFICATION__REGISTER_POINTER_ADDRESS:
			case I2cPackage.I2C_REGISTER_SPECIFICATION__REGISTER_WIDTH_BITS:
			case I2cPackage.I2C_REGISTER_SPECIFICATION__DEFAULT_VALUE:
			case I2cPackage.I2C_REGISTER_SPECIFICATION__READ_ONLY:
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
