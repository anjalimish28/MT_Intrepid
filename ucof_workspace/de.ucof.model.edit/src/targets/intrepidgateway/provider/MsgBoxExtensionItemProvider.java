/**
 */
package targets.intrepidgateway.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import targets.intrepidgateway.IntrepidgatewayFactory;
import targets.intrepidgateway.IntrepidgatewayPackage;
import targets.intrepidgateway.MsgBoxExtension;

import targets.provider.SuperClassExtensionTypeItemProvider;

import ucof.provider.UcofEditPlugin;

/**
 * This is the item provider adapter for a {@link targets.intrepidgateway.MsgBoxExtension} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MsgBoxExtensionItemProvider extends SuperClassExtensionTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MsgBoxExtensionItemProvider(AdapterFactory adapterFactory) {
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

			addNumOfOutgoingMailboxesPropertyDescriptor(object);
			addNumOfIncomingMailboxesPropertyDescriptor(object);
			addSmallBufferSizePropertyDescriptor(object);
			addSmallBufferCountPropertyDescriptor(object);
			addMediumBufferSizePropertyDescriptor(object);
			addMediumBufferCountPropertyDescriptor(object);
			addBigBufferSizePropertyDescriptor(object);
			addBigBufferCountPropertyDescriptor(object);
			addNodeAddrPropertyDescriptor(object);
			addNodeAddressSymbolPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Num Of Outgoing Mailboxes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumOfOutgoingMailboxesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MsgBoxExtension_numOfOutgoingMailboxes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MsgBoxExtension_numOfOutgoingMailboxes_feature", "_UI_MsgBoxExtension_type"),
				 IntrepidgatewayPackage.Literals.MSG_BOX_EXTENSION__NUM_OF_OUTGOING_MAILBOXES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Num Of Incoming Mailboxes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumOfIncomingMailboxesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MsgBoxExtension_numOfIncomingMailboxes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MsgBoxExtension_numOfIncomingMailboxes_feature", "_UI_MsgBoxExtension_type"),
				 IntrepidgatewayPackage.Literals.MSG_BOX_EXTENSION__NUM_OF_INCOMING_MAILBOXES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Small Buffer Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSmallBufferSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MsgBoxExtension_smallBufferSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MsgBoxExtension_smallBufferSize_feature", "_UI_MsgBoxExtension_type"),
				 IntrepidgatewayPackage.Literals.MSG_BOX_EXTENSION__SMALL_BUFFER_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Small Buffer Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSmallBufferCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MsgBoxExtension_smallBufferCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MsgBoxExtension_smallBufferCount_feature", "_UI_MsgBoxExtension_type"),
				 IntrepidgatewayPackage.Literals.MSG_BOX_EXTENSION__SMALL_BUFFER_COUNT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Medium Buffer Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMediumBufferSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MsgBoxExtension_mediumBufferSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MsgBoxExtension_mediumBufferSize_feature", "_UI_MsgBoxExtension_type"),
				 IntrepidgatewayPackage.Literals.MSG_BOX_EXTENSION__MEDIUM_BUFFER_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Medium Buffer Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMediumBufferCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MsgBoxExtension_mediumBufferCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MsgBoxExtension_mediumBufferCount_feature", "_UI_MsgBoxExtension_type"),
				 IntrepidgatewayPackage.Literals.MSG_BOX_EXTENSION__MEDIUM_BUFFER_COUNT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Big Buffer Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBigBufferSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MsgBoxExtension_bigBufferSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MsgBoxExtension_bigBufferSize_feature", "_UI_MsgBoxExtension_type"),
				 IntrepidgatewayPackage.Literals.MSG_BOX_EXTENSION__BIG_BUFFER_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Big Buffer Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBigBufferCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MsgBoxExtension_bigBufferCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MsgBoxExtension_bigBufferCount_feature", "_UI_MsgBoxExtension_type"),
				 IntrepidgatewayPackage.Literals.MSG_BOX_EXTENSION__BIG_BUFFER_COUNT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Node Addr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNodeAddrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MsgBoxExtension_nodeAddr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MsgBoxExtension_nodeAddr_feature", "_UI_MsgBoxExtension_type"),
				 IntrepidgatewayPackage.Literals.MSG_BOX_EXTENSION__NODE_ADDR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Node Address Symbol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNodeAddressSymbolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MsgBoxExtension_nodeAddressSymbol_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MsgBoxExtension_nodeAddressSymbol_feature", "_UI_MsgBoxExtension_type"),
				 IntrepidgatewayPackage.Literals.MSG_BOX_EXTENSION__NODE_ADDRESS_SYMBOL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(IntrepidgatewayPackage.Literals.MSG_BOX_EXTENSION__INCOMING_DESTINATION_FILTER);
			childrenFeatures.add(IntrepidgatewayPackage.Literals.MSG_BOX_EXTENSION__SENDER_SOURCE_FILTER);
			childrenFeatures.add(IntrepidgatewayPackage.Literals.MSG_BOX_EXTENSION__OUTGOING_MAILBOX_SLOT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns MsgBoxExtension.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MsgBoxExtension"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MsgBoxExtension)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MsgBoxExtension_type") :
			getString("_UI_MsgBoxExtension_type") + " " + label;
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

		switch (notification.getFeatureID(MsgBoxExtension.class)) {
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__NUM_OF_OUTGOING_MAILBOXES:
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__NUM_OF_INCOMING_MAILBOXES:
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__SMALL_BUFFER_SIZE:
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__SMALL_BUFFER_COUNT:
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__MEDIUM_BUFFER_SIZE:
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__MEDIUM_BUFFER_COUNT:
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__BIG_BUFFER_SIZE:
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__BIG_BUFFER_COUNT:
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__NODE_ADDR:
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__NODE_ADDRESS_SYMBOL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__INCOMING_DESTINATION_FILTER:
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__SENDER_SOURCE_FILTER:
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__OUTGOING_MAILBOX_SLOT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(IntrepidgatewayPackage.Literals.MSG_BOX_EXTENSION__INCOMING_DESTINATION_FILTER,
				 IntrepidgatewayFactory.eINSTANCE.createCanMailboxAddressFilter()));

		newChildDescriptors.add
			(createChildParameter
				(IntrepidgatewayPackage.Literals.MSG_BOX_EXTENSION__SENDER_SOURCE_FILTER,
				 IntrepidgatewayFactory.eINSTANCE.createCanMailboxAddressFilter()));

		newChildDescriptors.add
			(createChildParameter
				(IntrepidgatewayPackage.Literals.MSG_BOX_EXTENSION__OUTGOING_MAILBOX_SLOT,
				 IntrepidgatewayFactory.eINSTANCE.createCanMailboxOutSlot()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == IntrepidgatewayPackage.Literals.MSG_BOX_EXTENSION__INCOMING_DESTINATION_FILTER ||
			childFeature == IntrepidgatewayPackage.Literals.MSG_BOX_EXTENSION__SENDER_SOURCE_FILTER;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
