/**
 */
package ucof.communication.basedonethernet.arinc664.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ucof.communication.basedonethernet.arinc664.A664Message;
import ucof.communication.basedonethernet.arinc664.Arinc664Package;

import ucof.communication.provider.SuperMessageTypeItemProvider;

import ucof.provider.UcofEditPlugin;

/**
 * This is the item provider adapter for a {@link ucof.communication.basedonethernet.arinc664.A664Message} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class A664MessageItemProvider extends SuperMessageTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A664MessageItemProvider(AdapterFactory adapterFactory) {
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

			addDestinationMACPropertyDescriptor(object);
			addSourceMACPropertyDescriptor(object);
			addEtherTypePropertyDescriptor(object);
			addSourceIPPropertyDescriptor(object);
			addDestinationIPPropertyDescriptor(object);
			addDestinationPortPropertyDescriptor(object);
			addSourcePortPropertyDescriptor(object);
			addTTLPropertyDescriptor(object);
			addProtocolPropertyDescriptor(object);
			addEthernetIdentificationPropertyDescriptor(object);
			addFlagsAndFragmentOffsetPropertyDescriptor(object);
			addVersionAndIHLPropertyDescriptor(object);
			addTypeOfServicePropertyDescriptor(object);
			addVirtualLinkPropertyDescriptor(object);
			addVirtualLinkOffsetPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Destination MAC feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDestinationMACPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_A664Message_destinationMAC_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_A664Message_destinationMAC_feature", "_UI_A664Message_type"),
				 Arinc664Package.Literals.A664_MESSAGE__DESTINATION_MAC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source MAC feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceMACPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_A664Message_sourceMAC_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_A664Message_sourceMAC_feature", "_UI_A664Message_type"),
				 Arinc664Package.Literals.A664_MESSAGE__SOURCE_MAC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ether Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEtherTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_A664Message_etherType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_A664Message_etherType_feature", "_UI_A664Message_type"),
				 Arinc664Package.Literals.A664_MESSAGE__ETHER_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source IP feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceIPPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_A664Message_sourceIP_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_A664Message_sourceIP_feature", "_UI_A664Message_type"),
				 Arinc664Package.Literals.A664_MESSAGE__SOURCE_IP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Destination IP feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDestinationIPPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_A664Message_destinationIP_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_A664Message_destinationIP_feature", "_UI_A664Message_type"),
				 Arinc664Package.Literals.A664_MESSAGE__DESTINATION_IP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Destination Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDestinationPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_A664Message_destinationPort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_A664Message_destinationPort_feature", "_UI_A664Message_type"),
				 Arinc664Package.Literals.A664_MESSAGE__DESTINATION_PORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourcePortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_A664Message_sourcePort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_A664Message_sourcePort_feature", "_UI_A664Message_type"),
				 Arinc664Package.Literals.A664_MESSAGE__SOURCE_PORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the TTL feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTTLPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_A664Message_TTL_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_A664Message_TTL_feature", "_UI_A664Message_type"),
				 Arinc664Package.Literals.A664_MESSAGE__TTL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Protocol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProtocolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_A664Message_Protocol_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_A664Message_Protocol_feature", "_UI_A664Message_type"),
				 Arinc664Package.Literals.A664_MESSAGE__PROTOCOL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ethernet Identification feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEthernetIdentificationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_A664Message_ethernetIdentification_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_A664Message_ethernetIdentification_feature", "_UI_A664Message_type"),
				 Arinc664Package.Literals.A664_MESSAGE__ETHERNET_IDENTIFICATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Flags And Fragment Offset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlagsAndFragmentOffsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_A664Message_flagsAndFragmentOffset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_A664Message_flagsAndFragmentOffset_feature", "_UI_A664Message_type"),
				 Arinc664Package.Literals.A664_MESSAGE__FLAGS_AND_FRAGMENT_OFFSET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version And IHL feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionAndIHLPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_A664Message_versionAndIHL_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_A664Message_versionAndIHL_feature", "_UI_A664Message_type"),
				 Arinc664Package.Literals.A664_MESSAGE__VERSION_AND_IHL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type Of Service feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypeOfServicePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_A664Message_typeOfService_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_A664Message_typeOfService_feature", "_UI_A664Message_type"),
				 Arinc664Package.Literals.A664_MESSAGE__TYPE_OF_SERVICE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Virtual Link feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVirtualLinkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_A664Message_virtualLink_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_A664Message_virtualLink_feature", "_UI_A664Message_type"),
				 Arinc664Package.Literals.A664_MESSAGE__VIRTUAL_LINK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Virtual Link Offset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVirtualLinkOffsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_A664Message_virtualLinkOffset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_A664Message_virtualLinkOffset_feature", "_UI_A664Message_type"),
				 Arinc664Package.Literals.A664_MESSAGE__VIRTUAL_LINK_OFFSET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns A664Message.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/A664Message"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((A664Message)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_A664Message_type") :
			getString("_UI_A664Message_type") + " " + label;
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

		switch (notification.getFeatureID(A664Message.class)) {
			case Arinc664Package.A664_MESSAGE__DESTINATION_MAC:
			case Arinc664Package.A664_MESSAGE__SOURCE_MAC:
			case Arinc664Package.A664_MESSAGE__ETHER_TYPE:
			case Arinc664Package.A664_MESSAGE__SOURCE_IP:
			case Arinc664Package.A664_MESSAGE__DESTINATION_IP:
			case Arinc664Package.A664_MESSAGE__DESTINATION_PORT:
			case Arinc664Package.A664_MESSAGE__SOURCE_PORT:
			case Arinc664Package.A664_MESSAGE__TTL:
			case Arinc664Package.A664_MESSAGE__PROTOCOL:
			case Arinc664Package.A664_MESSAGE__ETHERNET_IDENTIFICATION:
			case Arinc664Package.A664_MESSAGE__FLAGS_AND_FRAGMENT_OFFSET:
			case Arinc664Package.A664_MESSAGE__VERSION_AND_IHL:
			case Arinc664Package.A664_MESSAGE__TYPE_OF_SERVICE:
			case Arinc664Package.A664_MESSAGE__VIRTUAL_LINK:
			case Arinc664Package.A664_MESSAGE__VIRTUAL_LINK_OFFSET:
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
