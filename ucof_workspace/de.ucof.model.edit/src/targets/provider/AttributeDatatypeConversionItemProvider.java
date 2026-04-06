/**
 */
package targets.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import targets.AttributeDatatypeConversion;
import targets.TargetsPackage;

/**
 * This is the item provider adapter for a {@link targets.AttributeDatatypeConversion} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributeDatatypeConversionItemProvider extends SuperAssignmentSpecificationTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDatatypeConversionItemProvider(AdapterFactory adapterFactory) {
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

			addAttributeNamePropertyDescriptor(object);
			addTargetDataTypePropertyDescriptor(object);
			addValuePrefixPropertyDescriptor(object);
			addValuePostfixPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Attribute Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttributeNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AttributeDatatypeConversion_attributeName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AttributeDatatypeConversion_attributeName_feature", "_UI_AttributeDatatypeConversion_type"),
				 TargetsPackage.Literals.ATTRIBUTE_DATATYPE_CONVERSION__ATTRIBUTE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Data Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetDataTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AttributeDatatypeConversion_targetDataType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AttributeDatatypeConversion_targetDataType_feature", "_UI_AttributeDatatypeConversion_type"),
				 TargetsPackage.Literals.ATTRIBUTE_DATATYPE_CONVERSION__TARGET_DATA_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value Prefix feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuePrefixPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AttributeDatatypeConversion_valuePrefix_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AttributeDatatypeConversion_valuePrefix_feature", "_UI_AttributeDatatypeConversion_type"),
				 TargetsPackage.Literals.ATTRIBUTE_DATATYPE_CONVERSION__VALUE_PREFIX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value Postfix feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuePostfixPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AttributeDatatypeConversion_valuePostfix_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AttributeDatatypeConversion_valuePostfix_feature", "_UI_AttributeDatatypeConversion_type"),
				 TargetsPackage.Literals.ATTRIBUTE_DATATYPE_CONVERSION__VALUE_POSTFIX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns AttributeDatatypeConversion.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AttributeDatatypeConversion"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AttributeDatatypeConversion)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AttributeDatatypeConversion_type") :
			getString("_UI_AttributeDatatypeConversion_type") + " " + label;
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

		switch (notification.getFeatureID(AttributeDatatypeConversion.class)) {
			case TargetsPackage.ATTRIBUTE_DATATYPE_CONVERSION__ATTRIBUTE_NAME:
			case TargetsPackage.ATTRIBUTE_DATATYPE_CONVERSION__TARGET_DATA_TYPE:
			case TargetsPackage.ATTRIBUTE_DATATYPE_CONVERSION__VALUE_PREFIX:
			case TargetsPackage.ATTRIBUTE_DATATYPE_CONVERSION__VALUE_POSTFIX:
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
