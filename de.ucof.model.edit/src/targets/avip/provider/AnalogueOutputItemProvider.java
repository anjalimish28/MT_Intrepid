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

import targets.avip.AnalogueOutput;
import targets.avip.AvipPackage;

/**
 * This is the item provider adapter for a {@link targets.avip.AnalogueOutput} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AnalogueOutputItemProvider extends SuperAnaloguePortTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueOutputItemProvider(AdapterFactory adapterFactory) {
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

			addAo_voltage_cmd_ac_maxPropertyDescriptor(object);
			addAo_voltage_cmd_ac_minPropertyDescriptor(object);
			addAo_voltage_cmd_dc_maxPropertyDescriptor(object);
			addAo_voltage_cmd_dc_minPropertyDescriptor(object);
			addAo_voltage_cmd_maxPropertyDescriptor(object);
			addAo_voltage_cmd_minPropertyDescriptor(object);
			addOver_current_thresholdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Ao voltage cmd ac max feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAo_voltage_cmd_ac_maxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AnalogueOutput_ao_voltage_cmd_ac_max_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AnalogueOutput_ao_voltage_cmd_ac_max_feature", "_UI_AnalogueOutput_type"),
				 AvipPackage.Literals.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_AC_MAX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ao voltage cmd ac min feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAo_voltage_cmd_ac_minPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AnalogueOutput_ao_voltage_cmd_ac_min_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AnalogueOutput_ao_voltage_cmd_ac_min_feature", "_UI_AnalogueOutput_type"),
				 AvipPackage.Literals.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_AC_MIN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ao voltage cmd dc max feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAo_voltage_cmd_dc_maxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AnalogueOutput_ao_voltage_cmd_dc_max_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AnalogueOutput_ao_voltage_cmd_dc_max_feature", "_UI_AnalogueOutput_type"),
				 AvipPackage.Literals.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_DC_MAX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ao voltage cmd dc min feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAo_voltage_cmd_dc_minPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AnalogueOutput_ao_voltage_cmd_dc_min_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AnalogueOutput_ao_voltage_cmd_dc_min_feature", "_UI_AnalogueOutput_type"),
				 AvipPackage.Literals.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_DC_MIN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ao voltage cmd max feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAo_voltage_cmd_maxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AnalogueOutput_ao_voltage_cmd_max_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AnalogueOutput_ao_voltage_cmd_max_feature", "_UI_AnalogueOutput_type"),
				 AvipPackage.Literals.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_MAX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ao voltage cmd min feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAo_voltage_cmd_minPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AnalogueOutput_ao_voltage_cmd_min_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AnalogueOutput_ao_voltage_cmd_min_feature", "_UI_AnalogueOutput_type"),
				 AvipPackage.Literals.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_MIN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Over current threshold feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOver_current_thresholdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AnalogueOutput_over_current_threshold_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AnalogueOutput_over_current_threshold_feature", "_UI_AnalogueOutput_type"),
				 AvipPackage.Literals.ANALOGUE_OUTPUT__OVER_CURRENT_THRESHOLD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns AnalogueOutput.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AnalogueOutput"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AnalogueOutput)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AnalogueOutput_type") :
			getString("_UI_AnalogueOutput_type") + " " + label;
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

		switch (notification.getFeatureID(AnalogueOutput.class)) {
			case AvipPackage.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_AC_MAX:
			case AvipPackage.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_AC_MIN:
			case AvipPackage.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_DC_MAX:
			case AvipPackage.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_DC_MIN:
			case AvipPackage.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_MAX:
			case AvipPackage.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_MIN:
			case AvipPackage.ANALOGUE_OUTPUT__OVER_CURRENT_THRESHOLD:
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
