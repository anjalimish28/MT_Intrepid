/**
 */
package ucof.devices.functions.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.SuperTrackingType;

import ucof.common.etypes.impl.SuperIdentifierTypeImpl;

import ucof.devices.functions.FunctionLink;
import ucof.devices.functions.FunctionsPackage;
import ucof.devices.functions.SuperFunctionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Super Function Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.functions.impl.SuperFunctionTypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link ucof.devices.functions.impl.SuperFunctionTypeImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link ucof.devices.functions.impl.SuperFunctionTypeImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link ucof.devices.functions.impl.SuperFunctionTypeImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link ucof.devices.functions.impl.SuperFunctionTypeImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link ucof.devices.functions.impl.SuperFunctionTypeImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link ucof.devices.functions.impl.SuperFunctionTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link ucof.devices.functions.impl.SuperFunctionTypeImpl#getFunctionLink <em>Function Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SuperFunctionTypeImpl extends SuperIdentifierTypeImpl implements SuperFunctionType {
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
	 * The cached value of the '{@link #getFunctionLink() <em>Function Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionLink()
	 * @generated
	 * @ordered
	 */
	protected FunctionLink functionLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperFunctionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.SUPER_FUNCTION_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.SUPER_FUNCTION_TYPE__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.SUPER_FUNCTION_TYPE__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.SUPER_FUNCTION_TYPE__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.SUPER_FUNCTION_TYPE__TRACE_LINK, oldTraceLink, traceLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.SUPER_FUNCTION_TYPE__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.SUPER_FUNCTION_TYPE__CREATOR, oldCreator, creator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.SUPER_FUNCTION_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionLink getFunctionLink() {
		return functionLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunctionLink(FunctionLink newFunctionLink, NotificationChain msgs) {
		FunctionLink oldFunctionLink = functionLink;
		functionLink = newFunctionLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionsPackage.SUPER_FUNCTION_TYPE__FUNCTION_LINK, oldFunctionLink, newFunctionLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionLink(FunctionLink newFunctionLink) {
		if (newFunctionLink != functionLink) {
			NotificationChain msgs = null;
			if (functionLink != null)
				msgs = ((InternalEObject)functionLink).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionsPackage.SUPER_FUNCTION_TYPE__FUNCTION_LINK, null, msgs);
			if (newFunctionLink != null)
				msgs = ((InternalEObject)newFunctionLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionsPackage.SUPER_FUNCTION_TYPE__FUNCTION_LINK, null, msgs);
			msgs = basicSetFunctionLink(newFunctionLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.SUPER_FUNCTION_TYPE__FUNCTION_LINK, newFunctionLink, newFunctionLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionsPackage.SUPER_FUNCTION_TYPE__FUNCTION_LINK:
				return basicSetFunctionLink(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FunctionsPackage.SUPER_FUNCTION_TYPE__DOCUMENTATION:
				return getDocumentation();
			case FunctionsPackage.SUPER_FUNCTION_TYPE__MODIFIED:
				return getModified();
			case FunctionsPackage.SUPER_FUNCTION_TYPE__MODIFIER:
				return getModifier();
			case FunctionsPackage.SUPER_FUNCTION_TYPE__TRACE_LINK:
				return getTraceLink();
			case FunctionsPackage.SUPER_FUNCTION_TYPE__CREATED:
				return getCreated();
			case FunctionsPackage.SUPER_FUNCTION_TYPE__CREATOR:
				return getCreator();
			case FunctionsPackage.SUPER_FUNCTION_TYPE__VERSION:
				return getVersion();
			case FunctionsPackage.SUPER_FUNCTION_TYPE__FUNCTION_LINK:
				return getFunctionLink();
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
			case FunctionsPackage.SUPER_FUNCTION_TYPE__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case FunctionsPackage.SUPER_FUNCTION_TYPE__MODIFIED:
				setModified((Date)newValue);
				return;
			case FunctionsPackage.SUPER_FUNCTION_TYPE__MODIFIER:
				setModifier((String)newValue);
				return;
			case FunctionsPackage.SUPER_FUNCTION_TYPE__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case FunctionsPackage.SUPER_FUNCTION_TYPE__CREATED:
				setCreated((Date)newValue);
				return;
			case FunctionsPackage.SUPER_FUNCTION_TYPE__CREATOR:
				setCreator((String)newValue);
				return;
			case FunctionsPackage.SUPER_FUNCTION_TYPE__VERSION:
				setVersion((Float)newValue);
				return;
			case FunctionsPackage.SUPER_FUNCTION_TYPE__FUNCTION_LINK:
				setFunctionLink((FunctionLink)newValue);
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
			case FunctionsPackage.SUPER_FUNCTION_TYPE__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case FunctionsPackage.SUPER_FUNCTION_TYPE__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case FunctionsPackage.SUPER_FUNCTION_TYPE__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case FunctionsPackage.SUPER_FUNCTION_TYPE__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case FunctionsPackage.SUPER_FUNCTION_TYPE__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case FunctionsPackage.SUPER_FUNCTION_TYPE__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case FunctionsPackage.SUPER_FUNCTION_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case FunctionsPackage.SUPER_FUNCTION_TYPE__FUNCTION_LINK:
				setFunctionLink((FunctionLink)null);
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
			case FunctionsPackage.SUPER_FUNCTION_TYPE__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case FunctionsPackage.SUPER_FUNCTION_TYPE__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case FunctionsPackage.SUPER_FUNCTION_TYPE__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case FunctionsPackage.SUPER_FUNCTION_TYPE__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case FunctionsPackage.SUPER_FUNCTION_TYPE__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case FunctionsPackage.SUPER_FUNCTION_TYPE__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case FunctionsPackage.SUPER_FUNCTION_TYPE__VERSION:
				return version != VERSION_EDEFAULT;
			case FunctionsPackage.SUPER_FUNCTION_TYPE__FUNCTION_LINK:
				return functionLink != null;
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
				case FunctionsPackage.SUPER_FUNCTION_TYPE__DOCUMENTATION: return EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;
				case FunctionsPackage.SUPER_FUNCTION_TYPE__MODIFIED: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;
				case FunctionsPackage.SUPER_FUNCTION_TYPE__MODIFIER: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;
				case FunctionsPackage.SUPER_FUNCTION_TYPE__TRACE_LINK: return EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;
				case FunctionsPackage.SUPER_FUNCTION_TYPE__CREATED: return EtypesPackage.SUPER_TRACKING_TYPE__CREATED;
				case FunctionsPackage.SUPER_FUNCTION_TYPE__CREATOR: return EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;
				case FunctionsPackage.SUPER_FUNCTION_TYPE__VERSION: return EtypesPackage.SUPER_TRACKING_TYPE__VERSION;
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
				case EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION: return FunctionsPackage.SUPER_FUNCTION_TYPE__DOCUMENTATION;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED: return FunctionsPackage.SUPER_FUNCTION_TYPE__MODIFIED;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER: return FunctionsPackage.SUPER_FUNCTION_TYPE__MODIFIER;
				case EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK: return FunctionsPackage.SUPER_FUNCTION_TYPE__TRACE_LINK;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATED: return FunctionsPackage.SUPER_FUNCTION_TYPE__CREATED;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATOR: return FunctionsPackage.SUPER_FUNCTION_TYPE__CREATOR;
				case EtypesPackage.SUPER_TRACKING_TYPE__VERSION: return FunctionsPackage.SUPER_FUNCTION_TYPE__VERSION;
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

} //SuperFunctionTypeImpl
