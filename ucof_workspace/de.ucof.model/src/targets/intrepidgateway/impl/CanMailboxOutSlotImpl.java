/**
 */
package targets.intrepidgateway.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import targets.intrepidgateway.CanMailboxOutSlot;
import targets.intrepidgateway.IntrepidgatewayPackage;

import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.SuperTrackingType;

import ucof.common.etypes.impl.SuperIdentifierTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Can Mailbox Out Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.intrepidgateway.impl.CanMailboxOutSlotImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link targets.intrepidgateway.impl.CanMailboxOutSlotImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link targets.intrepidgateway.impl.CanMailboxOutSlotImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link targets.intrepidgateway.impl.CanMailboxOutSlotImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link targets.intrepidgateway.impl.CanMailboxOutSlotImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link targets.intrepidgateway.impl.CanMailboxOutSlotImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link targets.intrepidgateway.impl.CanMailboxOutSlotImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link targets.intrepidgateway.impl.CanMailboxOutSlotImpl#getPortId <em>Port Id</em>}</li>
 *   <li>{@link targets.intrepidgateway.impl.CanMailboxOutSlotImpl#getSourceAddressSymbol <em>Source Address Symbol</em>}</li>
 *   <li>{@link targets.intrepidgateway.impl.CanMailboxOutSlotImpl#getSourceAddressValue <em>Source Address Value</em>}</li>
 *   <li>{@link targets.intrepidgateway.impl.CanMailboxOutSlotImpl#getDestinationAddressSymbol <em>Destination Address Symbol</em>}</li>
 *   <li>{@link targets.intrepidgateway.impl.CanMailboxOutSlotImpl#getDestinationAddressValue <em>Destination Address Value</em>}</li>
 *   <li>{@link targets.intrepidgateway.impl.CanMailboxOutSlotImpl#isMulticast <em>Multicast</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CanMailboxOutSlotImpl extends SuperIdentifierTypeImpl implements CanMailboxOutSlot {
	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected static final Date MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected Date modified = MODIFIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected static final String MODIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected String modifier = MODIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTraceLink() <em>Trace Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceLink()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACE_LINK_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTraceLink() <em>Trace Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceLink()
	 * @generated
	 * @ordered
	 */
	protected String traceLink = TRACE_LINK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected Date created = CREATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreator() <em>Creator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreator()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreator() <em>Creator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreator()
	 * @generated
	 * @ordered
	 */
	protected String creator = CREATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final float VERSION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected float version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortId() <em>Port Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortId()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortId() <em>Port Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortId()
	 * @generated
	 * @ordered
	 */
	protected String portId = PORT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceAddressSymbol() <em>Source Address Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAddressSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_ADDRESS_SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceAddressSymbol() <em>Source Address Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAddressSymbol()
	 * @generated
	 * @ordered
	 */
	protected String sourceAddressSymbol = SOURCE_ADDRESS_SYMBOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceAddressValue() <em>Source Address Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAddressValue()
	 * @generated
	 * @ordered
	 */
	protected static final int SOURCE_ADDRESS_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSourceAddressValue() <em>Source Address Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAddressValue()
	 * @generated
	 * @ordered
	 */
	protected int sourceAddressValue = SOURCE_ADDRESS_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestinationAddressSymbol() <em>Destination Address Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationAddressSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_ADDRESS_SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinationAddressSymbol() <em>Destination Address Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationAddressSymbol()
	 * @generated
	 * @ordered
	 */
	protected String destinationAddressSymbol = DESTINATION_ADDRESS_SYMBOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestinationAddressValue() <em>Destination Address Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationAddressValue()
	 * @generated
	 * @ordered
	 */
	protected static final int DESTINATION_ADDRESS_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDestinationAddressValue() <em>Destination Address Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationAddressValue()
	 * @generated
	 * @ordered
	 */
	protected int destinationAddressValue = DESTINATION_ADDRESS_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMulticast() <em>Multicast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMulticast()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTICAST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMulticast() <em>Multicast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMulticast()
	 * @generated
	 * @ordered
	 */
	protected boolean multicast = MULTICAST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CanMailboxOutSlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntrepidgatewayPackage.Literals.CAN_MAILBOX_OUT_SLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getModified() {
		return modified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModified(Date newModified) {
		Date oldModified = modified;
		modified = newModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__MODIFIED, oldModified, modified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModifier() {
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifier(String newModifier) {
		String oldModifier = modifier;
		modifier = newModifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__MODIFIER, oldModifier, modifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTraceLink() {
		return traceLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceLink(String newTraceLink) {
		String oldTraceLink = traceLink;
		traceLink = newTraceLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__TRACE_LINK, oldTraceLink, traceLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(Date newCreated) {
		Date oldCreated = created;
		created = newCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__CREATED, oldCreated, created));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreator() {
		return creator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreator(String newCreator) {
		String oldCreator = creator;
		creator = newCreator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__CREATOR, oldCreator, creator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(float newVersion) {
		float oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPortId() {
		return portId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortId(String newPortId) {
		String oldPortId = portId;
		portId = newPortId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__PORT_ID, oldPortId, portId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceAddressSymbol() {
		return sourceAddressSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceAddressSymbol(String newSourceAddressSymbol) {
		String oldSourceAddressSymbol = sourceAddressSymbol;
		sourceAddressSymbol = newSourceAddressSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__SOURCE_ADDRESS_SYMBOL, oldSourceAddressSymbol, sourceAddressSymbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSourceAddressValue() {
		return sourceAddressValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceAddressValue(int newSourceAddressValue) {
		int oldSourceAddressValue = sourceAddressValue;
		sourceAddressValue = newSourceAddressValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__SOURCE_ADDRESS_VALUE, oldSourceAddressValue, sourceAddressValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestinationAddressSymbol() {
		return destinationAddressSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationAddressSymbol(String newDestinationAddressSymbol) {
		String oldDestinationAddressSymbol = destinationAddressSymbol;
		destinationAddressSymbol = newDestinationAddressSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__DESTINATION_ADDRESS_SYMBOL, oldDestinationAddressSymbol, destinationAddressSymbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDestinationAddressValue() {
		return destinationAddressValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationAddressValue(int newDestinationAddressValue) {
		int oldDestinationAddressValue = destinationAddressValue;
		destinationAddressValue = newDestinationAddressValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__DESTINATION_ADDRESS_VALUE, oldDestinationAddressValue, destinationAddressValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMulticast() {
		return multicast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMulticast(boolean newMulticast) {
		boolean oldMulticast = multicast;
		multicast = newMulticast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__MULTICAST, oldMulticast, multicast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__DOCUMENTATION:
				return getDocumentation();
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__MODIFIED:
				return getModified();
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__MODIFIER:
				return getModifier();
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__TRACE_LINK:
				return getTraceLink();
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__CREATED:
				return getCreated();
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__CREATOR:
				return getCreator();
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__VERSION:
				return getVersion();
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__PORT_ID:
				return getPortId();
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__SOURCE_ADDRESS_SYMBOL:
				return getSourceAddressSymbol();
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__SOURCE_ADDRESS_VALUE:
				return getSourceAddressValue();
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__DESTINATION_ADDRESS_SYMBOL:
				return getDestinationAddressSymbol();
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__DESTINATION_ADDRESS_VALUE:
				return getDestinationAddressValue();
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__MULTICAST:
				return isMulticast();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__MODIFIED:
				setModified((Date)newValue);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__MODIFIER:
				setModifier((String)newValue);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__CREATED:
				setCreated((Date)newValue);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__CREATOR:
				setCreator((String)newValue);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__VERSION:
				setVersion((Float)newValue);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__PORT_ID:
				setPortId((String)newValue);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__SOURCE_ADDRESS_SYMBOL:
				setSourceAddressSymbol((String)newValue);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__SOURCE_ADDRESS_VALUE:
				setSourceAddressValue((Integer)newValue);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__DESTINATION_ADDRESS_SYMBOL:
				setDestinationAddressSymbol((String)newValue);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__DESTINATION_ADDRESS_VALUE:
				setDestinationAddressValue((Integer)newValue);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__MULTICAST:
				setMulticast((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__PORT_ID:
				setPortId(PORT_ID_EDEFAULT);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__SOURCE_ADDRESS_SYMBOL:
				setSourceAddressSymbol(SOURCE_ADDRESS_SYMBOL_EDEFAULT);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__SOURCE_ADDRESS_VALUE:
				setSourceAddressValue(SOURCE_ADDRESS_VALUE_EDEFAULT);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__DESTINATION_ADDRESS_SYMBOL:
				setDestinationAddressSymbol(DESTINATION_ADDRESS_SYMBOL_EDEFAULT);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__DESTINATION_ADDRESS_VALUE:
				setDestinationAddressValue(DESTINATION_ADDRESS_VALUE_EDEFAULT);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__MULTICAST:
				setMulticast(MULTICAST_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__VERSION:
				return version != VERSION_EDEFAULT;
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__PORT_ID:
				return PORT_ID_EDEFAULT == null ? portId != null : !PORT_ID_EDEFAULT.equals(portId);
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__SOURCE_ADDRESS_SYMBOL:
				return SOURCE_ADDRESS_SYMBOL_EDEFAULT == null ? sourceAddressSymbol != null : !SOURCE_ADDRESS_SYMBOL_EDEFAULT.equals(sourceAddressSymbol);
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__SOURCE_ADDRESS_VALUE:
				return sourceAddressValue != SOURCE_ADDRESS_VALUE_EDEFAULT;
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__DESTINATION_ADDRESS_SYMBOL:
				return DESTINATION_ADDRESS_SYMBOL_EDEFAULT == null ? destinationAddressSymbol != null : !DESTINATION_ADDRESS_SYMBOL_EDEFAULT.equals(destinationAddressSymbol);
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__DESTINATION_ADDRESS_VALUE:
				return destinationAddressValue != DESTINATION_ADDRESS_VALUE_EDEFAULT;
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__MULTICAST:
				return multicast != MULTICAST_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SuperTrackingType.class) {
			switch (derivedFeatureID) {
				case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__DOCUMENTATION: return EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;
				case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__MODIFIED: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;
				case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__MODIFIER: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;
				case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__TRACE_LINK: return EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;
				case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__CREATED: return EtypesPackage.SUPER_TRACKING_TYPE__CREATED;
				case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__CREATOR: return EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;
				case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__VERSION: return EtypesPackage.SUPER_TRACKING_TYPE__VERSION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SuperTrackingType.class) {
			switch (baseFeatureID) {
				case EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION: return IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__DOCUMENTATION;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED: return IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__MODIFIED;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER: return IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__MODIFIER;
				case EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK: return IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__TRACE_LINK;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATED: return IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__CREATED;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATOR: return IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__CREATOR;
				case EtypesPackage.SUPER_TRACKING_TYPE__VERSION: return IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT__VERSION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (documentation: ");
		result.append(documentation);
		result.append(", modified: ");
		result.append(modified);
		result.append(", modifier: ");
		result.append(modifier);
		result.append(", traceLink: ");
		result.append(traceLink);
		result.append(", created: ");
		result.append(created);
		result.append(", creator: ");
		result.append(creator);
		result.append(", version: ");
		result.append(version);
		result.append(", portId: ");
		result.append(portId);
		result.append(", sourceAddressSymbol: ");
		result.append(sourceAddressSymbol);
		result.append(", sourceAddressValue: ");
		result.append(sourceAddressValue);
		result.append(", destinationAddressSymbol: ");
		result.append(destinationAddressSymbol);
		result.append(", destinationAddressValue: ");
		result.append(destinationAddressValue);
		result.append(", multicast: ");
		result.append(multicast);
		result.append(')');
		return result.toString();
	}

} //CanMailboxOutSlotImpl
