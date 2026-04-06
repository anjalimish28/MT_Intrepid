/**
 */
package ucof.devices.devicetypes.a653components.healthmanagement.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.SuperTrackingType;

import ucof.common.etypes.impl.SuperIdentifierTypeImpl;

import ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoSuper;
import ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Info Super</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.ErrorInfoSuperImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.ErrorInfoSuperImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.ErrorInfoSuperImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.ErrorInfoSuperImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.ErrorInfoSuperImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.ErrorInfoSuperImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.ErrorInfoSuperImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.ErrorInfoSuperImpl#getErrorIdentifier <em>Error Identifier</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.ErrorInfoSuperImpl#getErrorDescription <em>Error Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErrorInfoSuperImpl extends SuperIdentifierTypeImpl implements ErrorInfoSuper {
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
	 * The default value of the '{@link #getErrorIdentifier() <em>Error Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorIdentifier() <em>Error Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String errorIdentifier = ERROR_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorDescription() <em>Error Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorDescription() <em>Error Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorDescription()
	 * @generated
	 * @ordered
	 */
	protected String errorDescription = ERROR_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorInfoSuperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HealthmanagementPackage.Literals.ERROR_INFO_SUPER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.ERROR_INFO_SUPER__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.ERROR_INFO_SUPER__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.ERROR_INFO_SUPER__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.ERROR_INFO_SUPER__TRACE_LINK, oldTraceLink, traceLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.ERROR_INFO_SUPER__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.ERROR_INFO_SUPER__CREATOR, oldCreator, creator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.ERROR_INFO_SUPER__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getErrorIdentifier() {
		return errorIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorIdentifier(String newErrorIdentifier) {
		String oldErrorIdentifier = errorIdentifier;
		errorIdentifier = newErrorIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.ERROR_INFO_SUPER__ERROR_IDENTIFIER, oldErrorIdentifier, errorIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getErrorDescription() {
		return errorDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorDescription(String newErrorDescription) {
		String oldErrorDescription = errorDescription;
		errorDescription = newErrorDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.ERROR_INFO_SUPER__ERROR_DESCRIPTION, oldErrorDescription, errorDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HealthmanagementPackage.ERROR_INFO_SUPER__DOCUMENTATION:
				return getDocumentation();
			case HealthmanagementPackage.ERROR_INFO_SUPER__MODIFIED:
				return getModified();
			case HealthmanagementPackage.ERROR_INFO_SUPER__MODIFIER:
				return getModifier();
			case HealthmanagementPackage.ERROR_INFO_SUPER__TRACE_LINK:
				return getTraceLink();
			case HealthmanagementPackage.ERROR_INFO_SUPER__CREATED:
				return getCreated();
			case HealthmanagementPackage.ERROR_INFO_SUPER__CREATOR:
				return getCreator();
			case HealthmanagementPackage.ERROR_INFO_SUPER__VERSION:
				return getVersion();
			case HealthmanagementPackage.ERROR_INFO_SUPER__ERROR_IDENTIFIER:
				return getErrorIdentifier();
			case HealthmanagementPackage.ERROR_INFO_SUPER__ERROR_DESCRIPTION:
				return getErrorDescription();
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
			case HealthmanagementPackage.ERROR_INFO_SUPER__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case HealthmanagementPackage.ERROR_INFO_SUPER__MODIFIED:
				setModified((Date)newValue);
				return;
			case HealthmanagementPackage.ERROR_INFO_SUPER__MODIFIER:
				setModifier((String)newValue);
				return;
			case HealthmanagementPackage.ERROR_INFO_SUPER__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case HealthmanagementPackage.ERROR_INFO_SUPER__CREATED:
				setCreated((Date)newValue);
				return;
			case HealthmanagementPackage.ERROR_INFO_SUPER__CREATOR:
				setCreator((String)newValue);
				return;
			case HealthmanagementPackage.ERROR_INFO_SUPER__VERSION:
				setVersion((Float)newValue);
				return;
			case HealthmanagementPackage.ERROR_INFO_SUPER__ERROR_IDENTIFIER:
				setErrorIdentifier((String)newValue);
				return;
			case HealthmanagementPackage.ERROR_INFO_SUPER__ERROR_DESCRIPTION:
				setErrorDescription((String)newValue);
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
			case HealthmanagementPackage.ERROR_INFO_SUPER__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case HealthmanagementPackage.ERROR_INFO_SUPER__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case HealthmanagementPackage.ERROR_INFO_SUPER__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case HealthmanagementPackage.ERROR_INFO_SUPER__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case HealthmanagementPackage.ERROR_INFO_SUPER__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case HealthmanagementPackage.ERROR_INFO_SUPER__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case HealthmanagementPackage.ERROR_INFO_SUPER__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case HealthmanagementPackage.ERROR_INFO_SUPER__ERROR_IDENTIFIER:
				setErrorIdentifier(ERROR_IDENTIFIER_EDEFAULT);
				return;
			case HealthmanagementPackage.ERROR_INFO_SUPER__ERROR_DESCRIPTION:
				setErrorDescription(ERROR_DESCRIPTION_EDEFAULT);
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
			case HealthmanagementPackage.ERROR_INFO_SUPER__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case HealthmanagementPackage.ERROR_INFO_SUPER__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case HealthmanagementPackage.ERROR_INFO_SUPER__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case HealthmanagementPackage.ERROR_INFO_SUPER__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case HealthmanagementPackage.ERROR_INFO_SUPER__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case HealthmanagementPackage.ERROR_INFO_SUPER__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case HealthmanagementPackage.ERROR_INFO_SUPER__VERSION:
				return version != VERSION_EDEFAULT;
			case HealthmanagementPackage.ERROR_INFO_SUPER__ERROR_IDENTIFIER:
				return ERROR_IDENTIFIER_EDEFAULT == null ? errorIdentifier != null : !ERROR_IDENTIFIER_EDEFAULT.equals(errorIdentifier);
			case HealthmanagementPackage.ERROR_INFO_SUPER__ERROR_DESCRIPTION:
				return ERROR_DESCRIPTION_EDEFAULT == null ? errorDescription != null : !ERROR_DESCRIPTION_EDEFAULT.equals(errorDescription);
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
				case HealthmanagementPackage.ERROR_INFO_SUPER__DOCUMENTATION: return EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;
				case HealthmanagementPackage.ERROR_INFO_SUPER__MODIFIED: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;
				case HealthmanagementPackage.ERROR_INFO_SUPER__MODIFIER: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;
				case HealthmanagementPackage.ERROR_INFO_SUPER__TRACE_LINK: return EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;
				case HealthmanagementPackage.ERROR_INFO_SUPER__CREATED: return EtypesPackage.SUPER_TRACKING_TYPE__CREATED;
				case HealthmanagementPackage.ERROR_INFO_SUPER__CREATOR: return EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;
				case HealthmanagementPackage.ERROR_INFO_SUPER__VERSION: return EtypesPackage.SUPER_TRACKING_TYPE__VERSION;
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
				case EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION: return HealthmanagementPackage.ERROR_INFO_SUPER__DOCUMENTATION;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED: return HealthmanagementPackage.ERROR_INFO_SUPER__MODIFIED;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER: return HealthmanagementPackage.ERROR_INFO_SUPER__MODIFIER;
				case EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK: return HealthmanagementPackage.ERROR_INFO_SUPER__TRACE_LINK;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATED: return HealthmanagementPackage.ERROR_INFO_SUPER__CREATED;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATOR: return HealthmanagementPackage.ERROR_INFO_SUPER__CREATOR;
				case EtypesPackage.SUPER_TRACKING_TYPE__VERSION: return HealthmanagementPackage.ERROR_INFO_SUPER__VERSION;
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
		result.append(", errorIdentifier: ");
		result.append(errorIdentifier);
		result.append(", errorDescription: ");
		result.append(errorDescription);
		result.append(')');
		return result.toString();
	}

} //ErrorInfoSuperImpl
