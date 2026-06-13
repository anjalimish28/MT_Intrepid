/**
 */
package targets.avip.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import targets.avip.AnalogueInput;
import targets.avip.AvipPackage;

/**
 * This is the item provider adapter for a {@link targets.avip.AnalogueInput} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AnalogueInputItemProvider extends SuperAnaloguePortTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueInputItemProvider(AdapterFactory adapterFactory) {
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

			addAi_voltage_maxPropertyDescriptor(object);
			addAi_voltage_max_vac_filteredPropertyDescriptor(object);
			addAi_voltage_max_vdc_filteredPropertyDescriptor(object);
			addAi_voltage_minPropertyDescriptor(object);
			addAi_voltage_min_vdc_filteredPropertyDescriptor(object);
			addMin_ai_frequencyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Ai voltage max feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAi_voltage_maxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AnalogueInput_ai_voltage_max_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AnalogueInput_ai_voltage_max_feature", "_UI_AnalogueInput_type"),
				 AvipPackage.Literals.ANALOGUE_INPUT__AI_VOLTAGE_MAX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ai voltage max vac filtered feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAi_voltage_max_vac_filteredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AnalogueInput_ai_voltage_max_vac_filtered_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AnalogueInput_ai_voltage_max_vac_filtered_feature", "_UI_AnalogueInput_type"),
				 AvipPackage.Literals.ANALOGUE_INPUT__AI_VOLTAGE_MAX_VAC_FILTERED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ai voltage max vdc filtered feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAi_voltage_max_vdc_filteredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AnalogueInput_ai_voltage_max_vdc_filtered_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AnalogueInput_ai_voltage_max_vdc_filtered_feature", "_UI_AnalogueInput_type"),
				 AvipPackage.Literals.ANALOGUE_INPUT__AI_VOLTAGE_MAX_VDC_FILTERED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ai voltage min feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAi_voltage_minPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AnalogueInput_ai_voltage_min_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AnalogueInput_ai_voltage_min_feature", "_UI_AnalogueInput_type"),
				 AvipPackage.Literals.ANALOGUE_INPUT__AI_VOLTAGE_MIN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ai voltage min vdc filtered feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAi_voltage_min_vdc_filteredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AnalogueInput_ai_voltage_min_vdc_filtered_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AnalogueInput_ai_voltage_min_vdc_filtered_feature", "_UI_AnalogueInput_type"),
				 AvipPackage.Literals.ANALOGUE_INPUT__AI_VOLTAGE_MIN_VDC_FILTERED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min ai frequency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMin_ai_frequencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AnalogueInput_min_ai_frequency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AnalogueInput_min_ai_frequency_feature", "_UI_AnalogueInput_type"),
				 AvipPackage.Literals.ANALOGUE_INPUT__MIN_AI_FREQUENCY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns AnalogueInput.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AnalogueInput"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AnalogueInput)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AnalogueInput_type") :
			getString("_UI_AnalogueInput_type") + " " + label;
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

		switch (notification.getFeatureID(AnalogueInput.class)) {
			case AvipPackage.ANALOGUE_INPUT__AI_VOLTAGE_MAX:
			case AvipPackage.ANALOGUE_INPUT__AI_VOLTAGE_MAX_VAC_FILTERED:
			case AvipPackage.ANALOGUE_INPUT__AI_VOLTAGE_MAX_VDC_FILTERED:
			case AvipPackage.ANALOGUE_INPUT__AI_VOLTAGE_MIN:
			case AvipPackage.ANALOGUE_INPUT__AI_VOLTAGE_MIN_VDC_FILTERED:
			case AvipPackage.ANALOGUE_INPUT__MIN_AI_FREQUENCY:
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
