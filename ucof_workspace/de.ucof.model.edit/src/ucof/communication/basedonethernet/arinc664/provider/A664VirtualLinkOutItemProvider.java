/**
 */
package ucof.communication.basedonethernet.arinc664.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ucof.communication.basedonethernet.arinc664.A664VirtualLinkOut;
import ucof.communication.basedonethernet.arinc664.Arinc664Package;

/**
 * This is the item provider adapter for a {@link ucof.communication.basedonethernet.arinc664.A664VirtualLinkOut} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class A664VirtualLinkOutItemProvider extends A664VirtualLinkSuperItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A664VirtualLinkOutItemProvider(AdapterFactory adapterFactory) {
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

			addBAGPropertyDescriptor(object);
			addMaxFrameSizePropertyDescriptor(object);
			addOverSamplingPropertyDescriptor(object);
			addPhasePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the BAG feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBAGPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_A664VirtualLinkOut_bAG_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_A664VirtualLinkOut_bAG_feature", "_UI_A664VirtualLinkOut_type"),
				 Arinc664Package.Literals.A664_VIRTUAL_LINK_OUT__BAG,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Frame Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxFrameSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_A664VirtualLinkOut_maxFrameSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_A664VirtualLinkOut_maxFrameSize_feature", "_UI_A664VirtualLinkOut_type"),
				 Arinc664Package.Literals.A664_VIRTUAL_LINK_OUT__MAX_FRAME_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Over Sampling feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverSamplingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_A664VirtualLinkOut_overSampling_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_A664VirtualLinkOut_overSampling_feature", "_UI_A664VirtualLinkOut_type"),
				 Arinc664Package.Literals.A664_VIRTUAL_LINK_OUT__OVER_SAMPLING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Phase feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhasePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_A664VirtualLinkOut_phase_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_A664VirtualLinkOut_phase_feature", "_UI_A664VirtualLinkOut_type"),
				 Arinc664Package.Literals.A664_VIRTUAL_LINK_OUT__PHASE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns A664VirtualLinkOut.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/A664VirtualLinkOut"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((A664VirtualLinkOut)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_A664VirtualLinkOut_type") :
			getString("_UI_A664VirtualLinkOut_type") + " " + label;
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

		switch (notification.getFeatureID(A664VirtualLinkOut.class)) {
			case Arinc664Package.A664_VIRTUAL_LINK_OUT__BAG:
			case Arinc664Package.A664_VIRTUAL_LINK_OUT__MAX_FRAME_SIZE:
			case Arinc664Package.A664_VIRTUAL_LINK_OUT__OVER_SAMPLING:
			case Arinc664Package.A664_VIRTUAL_LINK_OUT__PHASE:
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
