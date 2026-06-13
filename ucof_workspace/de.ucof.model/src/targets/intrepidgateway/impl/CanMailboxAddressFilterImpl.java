/**
 */
package targets.intrepidgateway.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import targets.intrepidgateway.CanMailboxAddressFilter;
import targets.intrepidgateway.IntrepidgatewayPackage;

import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.SuperTrackingType;

import ucof.common.etypes.impl.SuperIdentifierTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Can Mailbox Address Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.intrepidgateway.impl.CanMailboxAddressFilterImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link targets.intrepidgateway.impl.CanMailboxAddressFilterImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link targets.intrepidgateway.impl.CanMailboxAddressFilterImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link targets.intrepidgateway.impl.CanMailboxAddressFilterImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link targets.intrepidgateway.impl.CanMailboxAddressFilterImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link targets.intrepidgateway.impl.CanMailboxAddressFilterImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link targets.intrepidgateway.impl.CanMailboxAddressFilterImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link targets.intrepidgateway.impl.CanMailboxAddressFilterImpl#getAddressSymbol <em>Address Symbol</em>}</li>
 *   <li>{@link targets.intrepidgateway.impl.CanMailboxAddressFilterImpl#getAddressValue <em>Address Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CanMailboxAddressFilterImpl extends SuperIdentifierTypeImpl implements CanMailboxAddressFilter {
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
	 * The default value of the '{@link #getAddressSymbol() <em>Address Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddressSymbol() <em>Address Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressSymbol()
	 * @generated
	 * @ordered
	 */
	protected String addressSymbol = ADDRESS_SYMBOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddressValue() <em>Address Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressValue()
	 * @generated
	 * @ordered
	 */
	protected static final int ADDRESS_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAddressValue() <em>Address Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressValue()
	 * @generated
	 * @ordered
	 */
	protected int addressValue = ADDRESS_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CanMailboxAddressFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntrepidgatewayPackage.Literals.CAN_MAILBOX_ADDRESS_FILTER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__TRACE_LINK, oldTraceLink, traceLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__CREATOR, oldCreator, creator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddressSymbol() {
		return addressSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressSymbol(String newAddressSymbol) {
		String oldAddressSymbol = addressSymbol;
		addressSymbol = newAddressSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__ADDRESS_SYMBOL, oldAddressSymbol, addressSymbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAddressValue() {
		return addressValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressValue(int newAddressValue) {
		int oldAddressValue = addressValue;
		addressValue = newAddressValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__ADDRESS_VALUE, oldAddressValue, addressValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__DOCUMENTATION:
				return getDocumentation();
			case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__MODIFIED:
				return getModified();
			case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__MODIFIER:
				return getModifier();
			case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__TRACE_LINK:
				return getTraceLink();
			case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__CREATED:
				return getCreated();
			case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__CREATOR:
				return getCreator();
			case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__VERSION:
				return getVersion();
			case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__ADDRESS_SYMBOL:
				return getAddressSymbol();
			case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__ADDRESS_VALUE:
				return getAddressValue();
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
			case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__MODIFIED:
				setModified((Date)newValue);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__MODIFIER:
				setModifier((String)newValue);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__CREATED:
				setCreated((Date)newValue);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__CREATOR:
				setCreator((String)newValue);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__VERSION:
				setVersion((Float)newValue);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__ADDRESS_SYMBOL:
				setAddressSymbol((String)newValue);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__ADDRESS_VALUE:
				setAddressValue((Integer)newValue);
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
			case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__ADDRESS_SYMBOL:
				setAddressSymbol(ADDRESS_SYMBOL_EDEFAULT);
				return;
			case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__ADDRESS_VALUE:
				setAddressValue(ADDRESS_VALUE_EDEFAULT);
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
			case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__VERSION:
				return version != VERSION_EDEFAULT;
			case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__ADDRESS_SYMBOL:
				return ADDRESS_SYMBOL_EDEFAULT == null ? addressSymbol != null : !ADDRESS_SYMBOL_EDEFAULT.equals(addressSymbol);
			case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__ADDRESS_VALUE:
				return addressValue != ADDRESS_VALUE_EDEFAULT;
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
				case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__DOCUMENTATION: return EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;
				case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__MODIFIED: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;
				case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__MODIFIER: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;
				case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__TRACE_LINK: return EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;
				case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__CREATED: return EtypesPackage.SUPER_TRACKING_TYPE__CREATED;
				case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__CREATOR: return EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;
				case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__VERSION: return EtypesPackage.SUPER_TRACKING_TYPE__VERSION;
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
				case EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION: return IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__DOCUMENTATION;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED: return IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__MODIFIED;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER: return IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__MODIFIER;
				case EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK: return IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__TRACE_LINK;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATED: return IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__CREATED;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATOR: return IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__CREATOR;
				case EtypesPackage.SUPER_TRACKING_TYPE__VERSION: return IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER__VERSION;
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
		result.append(", addressSymbol: ");
		result.append(addressSymbol);
		result.append(", addressValue: ");
		result.append(addressValue);
		result.append(')');
		return result.toString();
	}

} //CanMailboxAddressFilterImpl
