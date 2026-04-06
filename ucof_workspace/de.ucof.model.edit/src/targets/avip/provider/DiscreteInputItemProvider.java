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
import targets.avip.DiscreteInput;

/**
 * This is the item provider adapter for a {@link targets.avip.DiscreteInput} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DiscreteInputItemProvider extends SuperWiredPortTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteInputItemProvider(AdapterFactory adapterFactory) {
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

			addHppPropertyDescriptor(object);
			addHpp_portPropertyDescriptor(object);
			addMax_polarisation_voltagePropertyDescriptor(object);
			addMax_voltage_gndPropertyDescriptor(object);
			addMin_voltage_gndPropertyDescriptor(object);
			addMax_voltage_opnPropertyDescriptor(object);
			addMin_voltage_opnPropertyDescriptor(object);
			addPolarisation_failure_dematuration_durationPropertyDescriptor(object);
			addPolarisation_failure_maturation_durationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Hpp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHppPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscreteInput_hpp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscreteInput_hpp_feature", "_UI_DiscreteInput_type"),
				 AvipPackage.Literals.DISCRETE_INPUT__HPP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hpp port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHpp_portPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscreteInput_hpp_port_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscreteInput_hpp_port_feature", "_UI_DiscreteInput_type"),
				 AvipPackage.Literals.DISCRETE_INPUT__HPP_PORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max polarisation voltage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMax_polarisation_voltagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscreteInput_max_polarisation_voltage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscreteInput_max_polarisation_voltage_feature", "_UI_DiscreteInput_type"),
				 AvipPackage.Literals.DISCRETE_INPUT__MAX_POLARISATION_VOLTAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max voltage gnd feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMax_voltage_gndPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscreteInput_max_voltage_gnd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscreteInput_max_voltage_gnd_feature", "_UI_DiscreteInput_type"),
				 AvipPackage.Literals.DISCRETE_INPUT__MAX_VOLTAGE_GND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min voltage gnd feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMin_voltage_gndPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscreteInput_min_voltage_gnd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscreteInput_min_voltage_gnd_feature", "_UI_DiscreteInput_type"),
				 AvipPackage.Literals.DISCRETE_INPUT__MIN_VOLTAGE_GND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max voltage opn feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMax_voltage_opnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscreteInput_max_voltage_opn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscreteInput_max_voltage_opn_feature", "_UI_DiscreteInput_type"),
				 AvipPackage.Literals.DISCRETE_INPUT__MAX_VOLTAGE_OPN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min voltage opn feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMin_voltage_opnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscreteInput_min_voltage_opn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscreteInput_min_voltage_opn_feature", "_UI_DiscreteInput_type"),
				 AvipPackage.Literals.DISCRETE_INPUT__MIN_VOLTAGE_OPN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Polarisation failure dematuration duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPolarisation_failure_dematuration_durationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscreteInput_polarisation_failure_dematuration_duration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscreteInput_polarisation_failure_dematuration_duration_feature", "_UI_DiscreteInput_type"),
				 AvipPackage.Literals.DISCRETE_INPUT__POLARISATION_FAILURE_DEMATURATION_DURATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Polarisation failure maturation duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPolarisation_failure_maturation_durationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscreteInput_polarisation_failure_maturation_duration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscreteInput_polarisation_failure_maturation_duration_feature", "_UI_DiscreteInput_type"),
				 AvipPackage.Literals.DISCRETE_INPUT__POLARISATION_FAILURE_MATURATION_DURATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns DiscreteInput.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DiscreteInput"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DiscreteInput)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DiscreteInput_type") :
			getString("_UI_DiscreteInput_type") + " " + label;
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

		switch (notification.getFeatureID(DiscreteInput.class)) {
			case AvipPackage.DISCRETE_INPUT__HPP:
			case AvipPackage.DISCRETE_INPUT__HPP_PORT:
			case AvipPackage.DISCRETE_INPUT__MAX_POLARISATION_VOLTAGE:
			case AvipPackage.DISCRETE_INPUT__MAX_VOLTAGE_GND:
			case AvipPackage.DISCRETE_INPUT__MIN_VOLTAGE_GND:
			case AvipPackage.DISCRETE_INPUT__MAX_VOLTAGE_OPN:
			case AvipPackage.DISCRETE_INPUT__MIN_VOLTAGE_OPN:
			case AvipPackage.DISCRETE_INPUT__POLARISATION_FAILURE_DEMATURATION_DURATION:
			case AvipPackage.DISCRETE_INPUT__POLARISATION_FAILURE_MATURATION_DURATION:
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
