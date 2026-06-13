/**
 */
package targets.cpn.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import targets.cpn.CanDriverConfig;
import targets.cpn.CanOperatingMode;
import targets.cpn.CpnPackage;

import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.SuperTrackingType;

import ucof.common.etypes.impl.SuperIdentifierTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Can Driver Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.cpn.impl.CanDriverConfigImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link targets.cpn.impl.CanDriverConfigImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link targets.cpn.impl.CanDriverConfigImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link targets.cpn.impl.CanDriverConfigImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link targets.cpn.impl.CanDriverConfigImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link targets.cpn.impl.CanDriverConfigImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link targets.cpn.impl.CanDriverConfigImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link targets.cpn.impl.CanDriverConfigImpl#getInterfaceID <em>Interface ID</em>}</li>
 *   <li>{@link targets.cpn.impl.CanDriverConfigImpl#getCanPeripheralInstance <em>Can Peripheral Instance</em>}</li>
 *   <li>{@link targets.cpn.impl.CanDriverConfigImpl#getOperatingMode <em>Operating Mode</em>}</li>
 *   <li>{@link targets.cpn.impl.CanDriverConfigImpl#isExtendedIdEnabled <em>Extended Id Enabled</em>}</li>
 *   <li>{@link targets.cpn.impl.CanDriverConfigImpl#getRingBufferSize <em>Ring Buffer Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CanDriverConfigImpl extends SuperIdentifierTypeImpl implements CanDriverConfig {
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
	 * The default value of the '{@link #getInterfaceID() <em>Interface ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceID()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERFACE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterfaceID() <em>Interface ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceID()
	 * @generated
	 * @ordered
	 */
	protected String interfaceID = INTERFACE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCanPeripheralInstance() <em>Can Peripheral Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanPeripheralInstance()
	 * @generated
	 * @ordered
	 */
	protected static final String CAN_PERIPHERAL_INSTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCanPeripheralInstance() <em>Can Peripheral Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanPeripheralInstance()
	 * @generated
	 * @ordered
	 */
	protected String canPeripheralInstance = CAN_PERIPHERAL_INSTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperatingMode() <em>Operating Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingMode()
	 * @generated
	 * @ordered
	 */
	protected static final CanOperatingMode OPERATING_MODE_EDEFAULT = CanOperatingMode.NORMAL;

	/**
	 * The cached value of the '{@link #getOperatingMode() <em>Operating Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingMode()
	 * @generated
	 * @ordered
	 */
	protected CanOperatingMode operatingMode = OPERATING_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #isExtendedIdEnabled() <em>Extended Id Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExtendedIdEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTENDED_ID_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExtendedIdEnabled() <em>Extended Id Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExtendedIdEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean extendedIdEnabled = EXTENDED_ID_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRingBufferSize() <em>Ring Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRingBufferSize()
	 * @generated
	 * @ordered
	 */
	protected static final int RING_BUFFER_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRingBufferSize() <em>Ring Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRingBufferSize()
	 * @generated
	 * @ordered
	 */
	protected int ringBufferSize = RING_BUFFER_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CanDriverConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpnPackage.Literals.CAN_DRIVER_CONFIG;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpnPackage.CAN_DRIVER_CONFIG__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpnPackage.CAN_DRIVER_CONFIG__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpnPackage.CAN_DRIVER_CONFIG__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpnPackage.CAN_DRIVER_CONFIG__TRACE_LINK, oldTraceLink, traceLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpnPackage.CAN_DRIVER_CONFIG__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpnPackage.CAN_DRIVER_CONFIG__CREATOR, oldCreator, creator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpnPackage.CAN_DRIVER_CONFIG__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterfaceID() {
		return interfaceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceID(String newInterfaceID) {
		String oldInterfaceID = interfaceID;
		interfaceID = newInterfaceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpnPackage.CAN_DRIVER_CONFIG__INTERFACE_ID, oldInterfaceID, interfaceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCanPeripheralInstance() {
		return canPeripheralInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanPeripheralInstance(String newCanPeripheralInstance) {
		String oldCanPeripheralInstance = canPeripheralInstance;
		canPeripheralInstance = newCanPeripheralInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpnPackage.CAN_DRIVER_CONFIG__CAN_PERIPHERAL_INSTANCE, oldCanPeripheralInstance, canPeripheralInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanOperatingMode getOperatingMode() {
		return operatingMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperatingMode(CanOperatingMode newOperatingMode) {
		CanOperatingMode oldOperatingMode = operatingMode;
		operatingMode = newOperatingMode == null ? OPERATING_MODE_EDEFAULT : newOperatingMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpnPackage.CAN_DRIVER_CONFIG__OPERATING_MODE, oldOperatingMode, operatingMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExtendedIdEnabled() {
		return extendedIdEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedIdEnabled(boolean newExtendedIdEnabled) {
		boolean oldExtendedIdEnabled = extendedIdEnabled;
		extendedIdEnabled = newExtendedIdEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpnPackage.CAN_DRIVER_CONFIG__EXTENDED_ID_ENABLED, oldExtendedIdEnabled, extendedIdEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRingBufferSize() {
		return ringBufferSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRingBufferSize(int newRingBufferSize) {
		int oldRingBufferSize = ringBufferSize;
		ringBufferSize = newRingBufferSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpnPackage.CAN_DRIVER_CONFIG__RING_BUFFER_SIZE, oldRingBufferSize, ringBufferSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CpnPackage.CAN_DRIVER_CONFIG__DOCUMENTATION:
				return getDocumentation();
			case CpnPackage.CAN_DRIVER_CONFIG__MODIFIED:
				return getModified();
			case CpnPackage.CAN_DRIVER_CONFIG__MODIFIER:
				return getModifier();
			case CpnPackage.CAN_DRIVER_CONFIG__TRACE_LINK:
				return getTraceLink();
			case CpnPackage.CAN_DRIVER_CONFIG__CREATED:
				return getCreated();
			case CpnPackage.CAN_DRIVER_CONFIG__CREATOR:
				return getCreator();
			case CpnPackage.CAN_DRIVER_CONFIG__VERSION:
				return getVersion();
			case CpnPackage.CAN_DRIVER_CONFIG__INTERFACE_ID:
				return getInterfaceID();
			case CpnPackage.CAN_DRIVER_CONFIG__CAN_PERIPHERAL_INSTANCE:
				return getCanPeripheralInstance();
			case CpnPackage.CAN_DRIVER_CONFIG__OPERATING_MODE:
				return getOperatingMode();
			case CpnPackage.CAN_DRIVER_CONFIG__EXTENDED_ID_ENABLED:
				return isExtendedIdEnabled();
			case CpnPackage.CAN_DRIVER_CONFIG__RING_BUFFER_SIZE:
				return getRingBufferSize();
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
			case CpnPackage.CAN_DRIVER_CONFIG__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case CpnPackage.CAN_DRIVER_CONFIG__MODIFIED:
				setModified((Date)newValue);
				return;
			case CpnPackage.CAN_DRIVER_CONFIG__MODIFIER:
				setModifier((String)newValue);
				return;
			case CpnPackage.CAN_DRIVER_CONFIG__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case CpnPackage.CAN_DRIVER_CONFIG__CREATED:
				setCreated((Date)newValue);
				return;
			case CpnPackage.CAN_DRIVER_CONFIG__CREATOR:
				setCreator((String)newValue);
				return;
			case CpnPackage.CAN_DRIVER_CONFIG__VERSION:
				setVersion((Float)newValue);
				return;
			case CpnPackage.CAN_DRIVER_CONFIG__INTERFACE_ID:
				setInterfaceID((String)newValue);
				return;
			case CpnPackage.CAN_DRIVER_CONFIG__CAN_PERIPHERAL_INSTANCE:
				setCanPeripheralInstance((String)newValue);
				return;
			case CpnPackage.CAN_DRIVER_CONFIG__OPERATING_MODE:
				setOperatingMode((CanOperatingMode)newValue);
				return;
			case CpnPackage.CAN_DRIVER_CONFIG__EXTENDED_ID_ENABLED:
				setExtendedIdEnabled((Boolean)newValue);
				return;
			case CpnPackage.CAN_DRIVER_CONFIG__RING_BUFFER_SIZE:
				setRingBufferSize((Integer)newValue);
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
			case CpnPackage.CAN_DRIVER_CONFIG__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case CpnPackage.CAN_DRIVER_CONFIG__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case CpnPackage.CAN_DRIVER_CONFIG__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case CpnPackage.CAN_DRIVER_CONFIG__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case CpnPackage.CAN_DRIVER_CONFIG__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case CpnPackage.CAN_DRIVER_CONFIG__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case CpnPackage.CAN_DRIVER_CONFIG__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case CpnPackage.CAN_DRIVER_CONFIG__INTERFACE_ID:
				setInterfaceID(INTERFACE_ID_EDEFAULT);
				return;
			case CpnPackage.CAN_DRIVER_CONFIG__CAN_PERIPHERAL_INSTANCE:
				setCanPeripheralInstance(CAN_PERIPHERAL_INSTANCE_EDEFAULT);
				return;
			case CpnPackage.CAN_DRIVER_CONFIG__OPERATING_MODE:
				setOperatingMode(OPERATING_MODE_EDEFAULT);
				return;
			case CpnPackage.CAN_DRIVER_CONFIG__EXTENDED_ID_ENABLED:
				setExtendedIdEnabled(EXTENDED_ID_ENABLED_EDEFAULT);
				return;
			case CpnPackage.CAN_DRIVER_CONFIG__RING_BUFFER_SIZE:
				setRingBufferSize(RING_BUFFER_SIZE_EDEFAULT);
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
			case CpnPackage.CAN_DRIVER_CONFIG__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case CpnPackage.CAN_DRIVER_CONFIG__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case CpnPackage.CAN_DRIVER_CONFIG__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case CpnPackage.CAN_DRIVER_CONFIG__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case CpnPackage.CAN_DRIVER_CONFIG__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case CpnPackage.CAN_DRIVER_CONFIG__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case CpnPackage.CAN_DRIVER_CONFIG__VERSION:
				return version != VERSION_EDEFAULT;
			case CpnPackage.CAN_DRIVER_CONFIG__INTERFACE_ID:
				return INTERFACE_ID_EDEFAULT == null ? interfaceID != null : !INTERFACE_ID_EDEFAULT.equals(interfaceID);
			case CpnPackage.CAN_DRIVER_CONFIG__CAN_PERIPHERAL_INSTANCE:
				return CAN_PERIPHERAL_INSTANCE_EDEFAULT == null ? canPeripheralInstance != null : !CAN_PERIPHERAL_INSTANCE_EDEFAULT.equals(canPeripheralInstance);
			case CpnPackage.CAN_DRIVER_CONFIG__OPERATING_MODE:
				return operatingMode != OPERATING_MODE_EDEFAULT;
			case CpnPackage.CAN_DRIVER_CONFIG__EXTENDED_ID_ENABLED:
				return extendedIdEnabled != EXTENDED_ID_ENABLED_EDEFAULT;
			case CpnPackage.CAN_DRIVER_CONFIG__RING_BUFFER_SIZE:
				return ringBufferSize != RING_BUFFER_SIZE_EDEFAULT;
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
				case CpnPackage.CAN_DRIVER_CONFIG__DOCUMENTATION: return EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;
				case CpnPackage.CAN_DRIVER_CONFIG__MODIFIED: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;
				case CpnPackage.CAN_DRIVER_CONFIG__MODIFIER: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;
				case CpnPackage.CAN_DRIVER_CONFIG__TRACE_LINK: return EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;
				case CpnPackage.CAN_DRIVER_CONFIG__CREATED: return EtypesPackage.SUPER_TRACKING_TYPE__CREATED;
				case CpnPackage.CAN_DRIVER_CONFIG__CREATOR: return EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;
				case CpnPackage.CAN_DRIVER_CONFIG__VERSION: return EtypesPackage.SUPER_TRACKING_TYPE__VERSION;
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
				case EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION: return CpnPackage.CAN_DRIVER_CONFIG__DOCUMENTATION;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED: return CpnPackage.CAN_DRIVER_CONFIG__MODIFIED;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER: return CpnPackage.CAN_DRIVER_CONFIG__MODIFIER;
				case EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK: return CpnPackage.CAN_DRIVER_CONFIG__TRACE_LINK;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATED: return CpnPackage.CAN_DRIVER_CONFIG__CREATED;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATOR: return CpnPackage.CAN_DRIVER_CONFIG__CREATOR;
				case EtypesPackage.SUPER_TRACKING_TYPE__VERSION: return CpnPackage.CAN_DRIVER_CONFIG__VERSION;
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
		result.append(", interfaceID: ");
		result.append(interfaceID);
		result.append(", canPeripheralInstance: ");
		result.append(canPeripheralInstance);
		result.append(", operatingMode: ");
		result.append(operatingMode);
		result.append(", extendedIdEnabled: ");
		result.append(extendedIdEnabled);
		result.append(", ringBufferSize: ");
		result.append(ringBufferSize);
		result.append(')');
		return result.toString();
	}

} //CanDriverConfigImpl
