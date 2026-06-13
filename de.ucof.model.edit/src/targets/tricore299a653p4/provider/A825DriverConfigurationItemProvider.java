/**
 */
package targets.tricore299a653p4.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import targets.tricore299a653p4.A825DriverConfiguration;
import targets.tricore299a653p4.Tricore299a653p4Package;

/**
 * This is the item provider adapter for a {@link targets.tricore299a653p4.A825DriverConfiguration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class A825DriverConfigurationItemProvider extends SuperTriCore299IOHardwareTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A825DriverConfigurationItemProvider(AdapterFactory adapterFactory) {
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

			addFirstMsgBoxPropertyDescriptor(object);
			addNodePropertyDescriptor(object);
			addRJWPropertyDescriptor(object);
			addRXSELPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the First Msg Box feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFirstMsgBoxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_A825DriverConfiguration_firstMsgBox_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_A825DriverConfiguration_firstMsgBox_feature", "_UI_A825DriverConfiguration_type"),
				 Tricore299a653p4Package.Literals.A825_DRIVER_CONFIGURATION__FIRST_MSG_BOX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_A825DriverConfiguration_node_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_A825DriverConfiguration_node_feature", "_UI_A825DriverConfiguration_type"),
				 Tricore299a653p4Package.Literals.A825_DRIVER_CONFIGURATION__NODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the RJW feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRJWPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_A825DriverConfiguration_rJW_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_A825DriverConfiguration_rJW_feature", "_UI_A825DriverConfiguration_type"),
				 Tricore299a653p4Package.Literals.A825_DRIVER_CONFIGURATION__RJW,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the RXSEL feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRXSELPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_A825DriverConfiguration_rXSEL_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_A825DriverConfiguration_rXSEL_feature", "_UI_A825DriverConfiguration_type"),
				 Tricore299a653p4Package.Literals.A825_DRIVER_CONFIGURATION__RXSEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns A825DriverConfiguration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/A825DriverConfiguration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((A825DriverConfiguration)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_A825DriverConfiguration_type") :
			getString("_UI_A825DriverConfiguration_type") + " " + label;
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

		switch (notification.getFeatureID(A825DriverConfiguration.class)) {
			case Tricore299a653p4Package.A825_DRIVER_CONFIGURATION__FIRST_MSG_BOX:
			case Tricore299a653p4Package.A825_DRIVER_CONFIGURATION__NODE:
			case Tricore299a653p4Package.A825_DRIVER_CONFIGURATION__RJW:
			case Tricore299a653p4Package.A825_DRIVER_CONFIGURATION__RXSEL:
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
