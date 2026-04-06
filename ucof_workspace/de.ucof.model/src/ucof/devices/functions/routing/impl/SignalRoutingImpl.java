/**
 */
package ucof.devices.functions.routing.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.SuperTrackingType;

import ucof.common.etypes.impl.SuperIdentifierTypeImpl;

import ucof.communication.Signal;

import ucof.devices.functions.routing.RoutingPackage;
import ucof.devices.functions.routing.SignalRouting;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Routing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.functions.routing.impl.SignalRoutingImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link ucof.devices.functions.routing.impl.SignalRoutingImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link ucof.devices.functions.routing.impl.SignalRoutingImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link ucof.devices.functions.routing.impl.SignalRoutingImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link ucof.devices.functions.routing.impl.SignalRoutingImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link ucof.devices.functions.routing.impl.SignalRoutingImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link ucof.devices.functions.routing.impl.SignalRoutingImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link ucof.devices.functions.routing.impl.SignalRoutingImpl#getInSignal <em>In Signal</em>}</li>
 *   <li>{@link ucof.devices.functions.routing.impl.SignalRoutingImpl#getOutSignal <em>Out Signal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignalRoutingImpl extends SuperIdentifierTypeImpl implements SignalRouting {
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
	 * The cached value of the '{@link #getInSignal() <em>In Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInSignal()
	 * @generated
	 * @ordered
	 */
	protected Signal inSignal;

	/**
	 * The cached value of the '{@link #getOutSignal() <em>Out Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutSignal()
	 * @generated
	 * @ordered
	 */
	protected Signal outSignal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalRoutingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoutingPackage.Literals.SIGNAL_ROUTING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RoutingPackage.SIGNAL_ROUTING__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RoutingPackage.SIGNAL_ROUTING__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RoutingPackage.SIGNAL_ROUTING__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RoutingPackage.SIGNAL_ROUTING__TRACE_LINK, oldTraceLink, traceLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RoutingPackage.SIGNAL_ROUTING__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RoutingPackage.SIGNAL_ROUTING__CREATOR, oldCreator, creator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RoutingPackage.SIGNAL_ROUTING__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal getInSignal() {
		if (inSignal != null && inSignal.eIsProxy()) {
			InternalEObject oldInSignal = (InternalEObject)inSignal;
			inSignal = (Signal)eResolveProxy(oldInSignal);
			if (inSignal != oldInSignal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoutingPackage.SIGNAL_ROUTING__IN_SIGNAL, oldInSignal, inSignal));
			}
		}
		return inSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal basicGetInSignal() {
		return inSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInSignal(Signal newInSignal) {
		Signal oldInSignal = inSignal;
		inSignal = newInSignal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoutingPackage.SIGNAL_ROUTING__IN_SIGNAL, oldInSignal, inSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal getOutSignal() {
		if (outSignal != null && outSignal.eIsProxy()) {
			InternalEObject oldOutSignal = (InternalEObject)outSignal;
			outSignal = (Signal)eResolveProxy(oldOutSignal);
			if (outSignal != oldOutSignal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoutingPackage.SIGNAL_ROUTING__OUT_SIGNAL, oldOutSignal, outSignal));
			}
		}
		return outSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal basicGetOutSignal() {
		return outSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutSignal(Signal newOutSignal) {
		Signal oldOutSignal = outSignal;
		outSignal = newOutSignal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoutingPackage.SIGNAL_ROUTING__OUT_SIGNAL, oldOutSignal, outSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RoutingPackage.SIGNAL_ROUTING__DOCUMENTATION:
				return getDocumentation();
			case RoutingPackage.SIGNAL_ROUTING__MODIFIED:
				return getModified();
			case RoutingPackage.SIGNAL_ROUTING__MODIFIER:
				return getModifier();
			case RoutingPackage.SIGNAL_ROUTING__TRACE_LINK:
				return getTraceLink();
			case RoutingPackage.SIGNAL_ROUTING__CREATED:
				return getCreated();
			case RoutingPackage.SIGNAL_ROUTING__CREATOR:
				return getCreator();
			case RoutingPackage.SIGNAL_ROUTING__VERSION:
				return getVersion();
			case RoutingPackage.SIGNAL_ROUTING__IN_SIGNAL:
				if (resolve) return getInSignal();
				return basicGetInSignal();
			case RoutingPackage.SIGNAL_ROUTING__OUT_SIGNAL:
				if (resolve) return getOutSignal();
				return basicGetOutSignal();
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
			case RoutingPackage.SIGNAL_ROUTING__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case RoutingPackage.SIGNAL_ROUTING__MODIFIED:
				setModified((Date)newValue);
				return;
			case RoutingPackage.SIGNAL_ROUTING__MODIFIER:
				setModifier((String)newValue);
				return;
			case RoutingPackage.SIGNAL_ROUTING__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case RoutingPackage.SIGNAL_ROUTING__CREATED:
				setCreated((Date)newValue);
				return;
			case RoutingPackage.SIGNAL_ROUTING__CREATOR:
				setCreator((String)newValue);
				return;
			case RoutingPackage.SIGNAL_ROUTING__VERSION:
				setVersion((Float)newValue);
				return;
			case RoutingPackage.SIGNAL_ROUTING__IN_SIGNAL:
				setInSignal((Signal)newValue);
				return;
			case RoutingPackage.SIGNAL_ROUTING__OUT_SIGNAL:
				setOutSignal((Signal)newValue);
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
			case RoutingPackage.SIGNAL_ROUTING__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case RoutingPackage.SIGNAL_ROUTING__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case RoutingPackage.SIGNAL_ROUTING__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case RoutingPackage.SIGNAL_ROUTING__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case RoutingPackage.SIGNAL_ROUTING__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case RoutingPackage.SIGNAL_ROUTING__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case RoutingPackage.SIGNAL_ROUTING__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case RoutingPackage.SIGNAL_ROUTING__IN_SIGNAL:
				setInSignal((Signal)null);
				return;
			case RoutingPackage.SIGNAL_ROUTING__OUT_SIGNAL:
				setOutSignal((Signal)null);
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
			case RoutingPackage.SIGNAL_ROUTING__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case RoutingPackage.SIGNAL_ROUTING__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case RoutingPackage.SIGNAL_ROUTING__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case RoutingPackage.SIGNAL_ROUTING__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case RoutingPackage.SIGNAL_ROUTING__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case RoutingPackage.SIGNAL_ROUTING__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case RoutingPackage.SIGNAL_ROUTING__VERSION:
				return version != VERSION_EDEFAULT;
			case RoutingPackage.SIGNAL_ROUTING__IN_SIGNAL:
				return inSignal != null;
			case RoutingPackage.SIGNAL_ROUTING__OUT_SIGNAL:
				return outSignal != null;
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
				case RoutingPackage.SIGNAL_ROUTING__DOCUMENTATION: return EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;
				case RoutingPackage.SIGNAL_ROUTING__MODIFIED: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;
				case RoutingPackage.SIGNAL_ROUTING__MODIFIER: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;
				case RoutingPackage.SIGNAL_ROUTING__TRACE_LINK: return EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;
				case RoutingPackage.SIGNAL_ROUTING__CREATED: return EtypesPackage.SUPER_TRACKING_TYPE__CREATED;
				case RoutingPackage.SIGNAL_ROUTING__CREATOR: return EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;
				case RoutingPackage.SIGNAL_ROUTING__VERSION: return EtypesPackage.SUPER_TRACKING_TYPE__VERSION;
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
				case EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION: return RoutingPackage.SIGNAL_ROUTING__DOCUMENTATION;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED: return RoutingPackage.SIGNAL_ROUTING__MODIFIED;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER: return RoutingPackage.SIGNAL_ROUTING__MODIFIER;
				case EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK: return RoutingPackage.SIGNAL_ROUTING__TRACE_LINK;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATED: return RoutingPackage.SIGNAL_ROUTING__CREATED;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATOR: return RoutingPackage.SIGNAL_ROUTING__CREATOR;
				case EtypesPackage.SUPER_TRACKING_TYPE__VERSION: return RoutingPackage.SIGNAL_ROUTING__VERSION;
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
		result.append(')');
		return result.toString();
	}

} //SignalRoutingImpl
