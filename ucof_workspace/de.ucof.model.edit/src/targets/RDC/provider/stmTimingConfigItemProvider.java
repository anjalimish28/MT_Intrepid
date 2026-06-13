/**
 */
package targets.rdc.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import targets.rdc.RdcPackage;
import targets.rdc.stmTimingConfig;

import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.provider.SuperTrackingTypeItemProvider;
import ucof.provider.UcofEditPlugin;

/**
 * This is the item provider adapter for a {@link targets.rdc.stmTimingConfig} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class stmTimingConfigItemProvider extends SuperTrackingTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public stmTimingConfigItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addRateDriverFrequencyHzPropertyDescriptor(object);
			addRateGroupDivisor1PropertyDescriptor(object);
			addRateGroupDivisor2PropertyDescriptor(object);
			addRateGroupDivisor3PropertyDescriptor(object);
			addRateGroupDefaultOffsetPropertyDescriptor(object);
			addPwmResolutionBitsPropertyDescriptor(object);
			addRateDriverFrequencyHzSizePropertyDescriptor(object);
			addRateGroupDivisor1SizePropertyDescriptor(object);
			addRateGroupDivisor2SizePropertyDescriptor(object);
			addRateGroupDivisor3SizePropertyDescriptor(object);
			addRateGroupDefaultOffsetSizePropertyDescriptor(object);
			addPwmResolutionBitsSizePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SuperIdentifierType_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SuperIdentifierType_id_feature", "_UI_SuperIdentifierType_type"),
				 EtypesPackage.Literals.SUPER_IDENTIFIER_TYPE__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_IdentifiersPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SuperIdentifierType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SuperIdentifierType_name_feature", "_UI_SuperIdentifierType_type"),
				 EtypesPackage.Literals.SUPER_IDENTIFIER_TYPE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_IdentifiersPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Rate Driver Frequency Hz feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRateDriverFrequencyHzPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_stmTimingConfig_rateDriverFrequencyHz_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_stmTimingConfig_rateDriverFrequencyHz_feature", "_UI_stmTimingConfig_type"),
				 RdcPackage.Literals.STM_TIMING_CONFIG__RATE_DRIVER_FREQUENCY_HZ,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rate Group Divisor1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRateGroupDivisor1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_stmTimingConfig_rateGroupDivisor1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_stmTimingConfig_rateGroupDivisor1_feature", "_UI_stmTimingConfig_type"),
				 RdcPackage.Literals.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rate Group Divisor2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRateGroupDivisor2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_stmTimingConfig_rateGroupDivisor2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_stmTimingConfig_rateGroupDivisor2_feature", "_UI_stmTimingConfig_type"),
				 RdcPackage.Literals.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR2,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rate Group Divisor3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRateGroupDivisor3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_stmTimingConfig_rateGroupDivisor3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_stmTimingConfig_rateGroupDivisor3_feature", "_UI_stmTimingConfig_type"),
				 RdcPackage.Literals.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR3,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rate Group Default Offset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRateGroupDefaultOffsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_stmTimingConfig_rateGroupDefaultOffset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_stmTimingConfig_rateGroupDefaultOffset_feature", "_UI_stmTimingConfig_type"),
				 RdcPackage.Literals.STM_TIMING_CONFIG__RATE_GROUP_DEFAULT_OFFSET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pwm Resolution Bits feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPwmResolutionBitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_stmTimingConfig_pwmResolutionBits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_stmTimingConfig_pwmResolutionBits_feature", "_UI_stmTimingConfig_type"),
				 RdcPackage.Literals.STM_TIMING_CONFIG__PWM_RESOLUTION_BITS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rate Driver Frequency Hz Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRateDriverFrequencyHzSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_stmTimingConfig_rateDriverFrequencyHzSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_stmTimingConfig_rateDriverFrequencyHzSize_feature", "_UI_stmTimingConfig_type"),
				 RdcPackage.Literals.STM_TIMING_CONFIG__RATE_DRIVER_FREQUENCY_HZ_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rate Group Divisor1 Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRateGroupDivisor1SizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_stmTimingConfig_rateGroupDivisor1Size_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_stmTimingConfig_rateGroupDivisor1Size_feature", "_UI_stmTimingConfig_type"),
				 RdcPackage.Literals.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR1_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rate Group Divisor2 Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRateGroupDivisor2SizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_stmTimingConfig_rateGroupDivisor2Size_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_stmTimingConfig_rateGroupDivisor2Size_feature", "_UI_stmTimingConfig_type"),
				 RdcPackage.Literals.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR2_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rate Group Divisor3 Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRateGroupDivisor3SizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_stmTimingConfig_rateGroupDivisor3Size_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_stmTimingConfig_rateGroupDivisor3Size_feature", "_UI_stmTimingConfig_type"),
				 RdcPackage.Literals.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR3_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rate Group Default Offset Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRateGroupDefaultOffsetSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_stmTimingConfig_rateGroupDefaultOffsetSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_stmTimingConfig_rateGroupDefaultOffsetSize_feature", "_UI_stmTimingConfig_type"),
				 RdcPackage.Literals.STM_TIMING_CONFIG__RATE_GROUP_DEFAULT_OFFSET_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pwm Resolution Bits Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPwmResolutionBitsSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_stmTimingConfig_pwmResolutionBitsSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_stmTimingConfig_pwmResolutionBitsSize_feature", "_UI_stmTimingConfig_type"),
				 RdcPackage.Literals.STM_TIMING_CONFIG__PWM_RESOLUTION_BITS_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns stmTimingConfig.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/stmTimingConfig"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((stmTimingConfig)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_stmTimingConfig_type") :
			getString("_UI_stmTimingConfig_type") + " " + label;
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

		switch (notification.getFeatureID(stmTimingConfig.class)) {
			case RdcPackage.STM_TIMING_CONFIG__ID:
			case RdcPackage.STM_TIMING_CONFIG__NAME:
			case RdcPackage.STM_TIMING_CONFIG__RATE_DRIVER_FREQUENCY_HZ:
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR1:
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR2:
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR3:
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DEFAULT_OFFSET:
			case RdcPackage.STM_TIMING_CONFIG__PWM_RESOLUTION_BITS:
			case RdcPackage.STM_TIMING_CONFIG__RATE_DRIVER_FREQUENCY_HZ_SIZE:
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR1_SIZE:
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR2_SIZE:
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR3_SIZE:
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DEFAULT_OFFSET_SIZE:
			case RdcPackage.STM_TIMING_CONFIG__PWM_RESOLUTION_BITS_SIZE:
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
