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

import targets.avip.AvipPackage;
import targets.avip.DiscreteOutput;

/**
 * This is the item provider adapter for a {@link targets.avip.DiscreteOutput} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DiscreteOutputItemProvider extends SuperWiredPortTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteOutputItemProvider(AdapterFactory adapterFactory) {
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

			addClose_volt_marginPropertyDescriptor(object);
			addInternal_pull_up_voltagePropertyDescriptor(object);
			addMax_v_case_gnd_connPropertyDescriptor(object);
			addNormal_load_resistancePropertyDescriptor(object);
			addNormal_load_voltagePropertyDescriptor(object);
			addOver_current_fault_maturation_durationPropertyDescriptor(object);
			addOverload_current_thresholdPropertyDescriptor(object);
			addShort_circuit_current_thresholdPropertyDescriptor(object);
			addSoft_over_current_fault_maturation_durationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Close volt margin feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClose_volt_marginPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscreteOutput_close_volt_margin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscreteOutput_close_volt_margin_feature", "_UI_DiscreteOutput_type"),
				 AvipPackage.Literals.DISCRETE_OUTPUT__CLOSE_VOLT_MARGIN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Internal pull up voltage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInternal_pull_up_voltagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscreteOutput_internal_pull_up_voltage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscreteOutput_internal_pull_up_voltage_feature", "_UI_DiscreteOutput_type"),
				 AvipPackage.Literals.DISCRETE_OUTPUT__INTERNAL_PULL_UP_VOLTAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max vcase gnd conn feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMax_v_case_gnd_connPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscreteOutput_max_v_case_gnd_conn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscreteOutput_max_v_case_gnd_conn_feature", "_UI_DiscreteOutput_type"),
				 AvipPackage.Literals.DISCRETE_OUTPUT__MAX_VCASE_GND_CONN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Normal load resistance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNormal_load_resistancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscreteOutput_normal_load_resistance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscreteOutput_normal_load_resistance_feature", "_UI_DiscreteOutput_type"),
				 AvipPackage.Literals.DISCRETE_OUTPUT__NORMAL_LOAD_RESISTANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Normal load voltage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNormal_load_voltagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscreteOutput_normal_load_voltage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscreteOutput_normal_load_voltage_feature", "_UI_DiscreteOutput_type"),
				 AvipPackage.Literals.DISCRETE_OUTPUT__NORMAL_LOAD_VOLTAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Over current fault maturation duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOver_current_fault_maturation_durationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscreteOutput_over_current_fault_maturation_duration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscreteOutput_over_current_fault_maturation_duration_feature", "_UI_DiscreteOutput_type"),
				 AvipPackage.Literals.DISCRETE_OUTPUT__OVER_CURRENT_FAULT_MATURATION_DURATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Overload current threshold feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverload_current_thresholdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscreteOutput_overload_current_threshold_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscreteOutput_overload_current_threshold_feature", "_UI_DiscreteOutput_type"),
				 AvipPackage.Literals.DISCRETE_OUTPUT__OVERLOAD_CURRENT_THRESHOLD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Short circuit current threshold feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShort_circuit_current_thresholdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscreteOutput_short_circuit_current_threshold_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscreteOutput_short_circuit_current_threshold_feature", "_UI_DiscreteOutput_type"),
				 AvipPackage.Literals.DISCRETE_OUTPUT__SHORT_CIRCUIT_CURRENT_THRESHOLD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Soft over current fault maturation duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSoft_over_current_fault_maturation_durationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscreteOutput_soft_over_current_fault_maturation_duration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscreteOutput_soft_over_current_fault_maturation_duration_feature", "_UI_DiscreteOutput_type"),
				 AvipPackage.Literals.DISCRETE_OUTPUT__SOFT_OVER_CURRENT_FAULT_MATURATION_DURATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns DiscreteOutput.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DiscreteOutput"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DiscreteOutput)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DiscreteOutput_type") :
			getString("_UI_DiscreteOutput_type") + " " + label;
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

		switch (notification.getFeatureID(DiscreteOutput.class)) {
			case AvipPackage.DISCRETE_OUTPUT__CLOSE_VOLT_MARGIN:
			case AvipPackage.DISCRETE_OUTPUT__INTERNAL_PULL_UP_VOLTAGE:
			case AvipPackage.DISCRETE_OUTPUT__MAX_VCASE_GND_CONN:
			case AvipPackage.DISCRETE_OUTPUT__NORMAL_LOAD_RESISTANCE:
			case AvipPackage.DISCRETE_OUTPUT__NORMAL_LOAD_VOLTAGE:
			case AvipPackage.DISCRETE_OUTPUT__OVER_CURRENT_FAULT_MATURATION_DURATION:
			case AvipPackage.DISCRETE_OUTPUT__OVERLOAD_CURRENT_THRESHOLD:
			case AvipPackage.DISCRETE_OUTPUT__SHORT_CIRCUIT_CURRENT_THRESHOLD:
			case AvipPackage.DISCRETE_OUTPUT__SOFT_OVER_CURRENT_FAULT_MATURATION_DURATION:
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
