/**
 */
package targets.avip.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import targets.avip.AvipPackage;
import targets.avip.FunctionalData;

import ucof.common.enums.SingleDirectionType;

import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.SuperTrackingType;

import ucof.common.etypes.impl.SuperIdentifierTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.avip.impl.FunctionalDataImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link targets.avip.impl.FunctionalDataImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link targets.avip.impl.FunctionalDataImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link targets.avip.impl.FunctionalDataImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link targets.avip.impl.FunctionalDataImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link targets.avip.impl.FunctionalDataImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link targets.avip.impl.FunctionalDataImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link targets.avip.impl.FunctionalDataImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link targets.avip.impl.FunctionalDataImpl#getIf_signal <em>If signal</em>}</li>
 *   <li>{@link targets.avip.impl.FunctionalDataImpl#getParam_type <em>Param type</em>}</li>
 *   <li>{@link targets.avip.impl.FunctionalDataImpl#getParam_length <em>Param length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalDataImpl extends SuperIdentifierTypeImpl implements FunctionalData {
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
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final SingleDirectionType DIRECTION_EDEFAULT = SingleDirectionType.NOT_SET;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected SingleDirectionType direction = DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIf_signal() <em>If signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf_signal()
	 * @generated
	 * @ordered
	 */
	protected static final String IF_SIGNAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIf_signal() <em>If signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf_signal()
	 * @generated
	 * @ordered
	 */
	protected String if_signal = IF_SIGNAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getParam_type() <em>Param type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam_type()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAM_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParam_type() <em>Param type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam_type()
	 * @generated
	 * @ordered
	 */
	protected String param_type = PARAM_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getParam_length() <em>Param length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam_length()
	 * @generated
	 * @ordered
	 */
	protected static final int PARAM_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getParam_length() <em>Param length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam_length()
	 * @generated
	 * @ordered
	 */
	protected int param_length = PARAM_LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AvipPackage.Literals.FUNCTIONAL_DATA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.FUNCTIONAL_DATA__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.FUNCTIONAL_DATA__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.FUNCTIONAL_DATA__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.FUNCTIONAL_DATA__TRACE_LINK, oldTraceLink, traceLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.FUNCTIONAL_DATA__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.FUNCTIONAL_DATA__CREATOR, oldCreator, creator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.FUNCTIONAL_DATA__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleDirectionType getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(SingleDirectionType newDirection) {
		SingleDirectionType oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.FUNCTIONAL_DATA__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIf_signal() {
		return if_signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIf_signal(String newIf_signal) {
		String oldIf_signal = if_signal;
		if_signal = newIf_signal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.FUNCTIONAL_DATA__IF_SIGNAL, oldIf_signal, if_signal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParam_type() {
		return param_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParam_type(String newParam_type) {
		String oldParam_type = param_type;
		param_type = newParam_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.FUNCTIONAL_DATA__PARAM_TYPE, oldParam_type, param_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getParam_length() {
		return param_length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParam_length(int newParam_length) {
		int oldParam_length = param_length;
		param_length = newParam_length;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.FUNCTIONAL_DATA__PARAM_LENGTH, oldParam_length, param_length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AvipPackage.FUNCTIONAL_DATA__DOCUMENTATION:
				return getDocumentation();
			case AvipPackage.FUNCTIONAL_DATA__MODIFIED:
				return getModified();
			case AvipPackage.FUNCTIONAL_DATA__MODIFIER:
				return getModifier();
			case AvipPackage.FUNCTIONAL_DATA__TRACE_LINK:
				return getTraceLink();
			case AvipPackage.FUNCTIONAL_DATA__CREATED:
				return getCreated();
			case AvipPackage.FUNCTIONAL_DATA__CREATOR:
				return getCreator();
			case AvipPackage.FUNCTIONAL_DATA__VERSION:
				return getVersion();
			case AvipPackage.FUNCTIONAL_DATA__DIRECTION:
				return getDirection();
			case AvipPackage.FUNCTIONAL_DATA__IF_SIGNAL:
				return getIf_signal();
			case AvipPackage.FUNCTIONAL_DATA__PARAM_TYPE:
				return getParam_type();
			case AvipPackage.FUNCTIONAL_DATA__PARAM_LENGTH:
				return getParam_length();
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
			case AvipPackage.FUNCTIONAL_DATA__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case AvipPackage.FUNCTIONAL_DATA__MODIFIED:
				setModified((Date)newValue);
				return;
			case AvipPackage.FUNCTIONAL_DATA__MODIFIER:
				setModifier((String)newValue);
				return;
			case AvipPackage.FUNCTIONAL_DATA__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case AvipPackage.FUNCTIONAL_DATA__CREATED:
				setCreated((Date)newValue);
				return;
			case AvipPackage.FUNCTIONAL_DATA__CREATOR:
				setCreator((String)newValue);
				return;
			case AvipPackage.FUNCTIONAL_DATA__VERSION:
				setVersion((Float)newValue);
				return;
			case AvipPackage.FUNCTIONAL_DATA__DIRECTION:
				setDirection((SingleDirectionType)newValue);
				return;
			case AvipPackage.FUNCTIONAL_DATA__IF_SIGNAL:
				setIf_signal((String)newValue);
				return;
			case AvipPackage.FUNCTIONAL_DATA__PARAM_TYPE:
				setParam_type((String)newValue);
				return;
			case AvipPackage.FUNCTIONAL_DATA__PARAM_LENGTH:
				setParam_length((Integer)newValue);
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
			case AvipPackage.FUNCTIONAL_DATA__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case AvipPackage.FUNCTIONAL_DATA__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case AvipPackage.FUNCTIONAL_DATA__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case AvipPackage.FUNCTIONAL_DATA__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case AvipPackage.FUNCTIONAL_DATA__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case AvipPackage.FUNCTIONAL_DATA__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case AvipPackage.FUNCTIONAL_DATA__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case AvipPackage.FUNCTIONAL_DATA__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case AvipPackage.FUNCTIONAL_DATA__IF_SIGNAL:
				setIf_signal(IF_SIGNAL_EDEFAULT);
				return;
			case AvipPackage.FUNCTIONAL_DATA__PARAM_TYPE:
				setParam_type(PARAM_TYPE_EDEFAULT);
				return;
			case AvipPackage.FUNCTIONAL_DATA__PARAM_LENGTH:
				setParam_length(PARAM_LENGTH_EDEFAULT);
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
			case AvipPackage.FUNCTIONAL_DATA__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case AvipPackage.FUNCTIONAL_DATA__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case AvipPackage.FUNCTIONAL_DATA__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case AvipPackage.FUNCTIONAL_DATA__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case AvipPackage.FUNCTIONAL_DATA__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case AvipPackage.FUNCTIONAL_DATA__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case AvipPackage.FUNCTIONAL_DATA__VERSION:
				return version != VERSION_EDEFAULT;
			case AvipPackage.FUNCTIONAL_DATA__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case AvipPackage.FUNCTIONAL_DATA__IF_SIGNAL:
				return IF_SIGNAL_EDEFAULT == null ? if_signal != null : !IF_SIGNAL_EDEFAULT.equals(if_signal);
			case AvipPackage.FUNCTIONAL_DATA__PARAM_TYPE:
				return PARAM_TYPE_EDEFAULT == null ? param_type != null : !PARAM_TYPE_EDEFAULT.equals(param_type);
			case AvipPackage.FUNCTIONAL_DATA__PARAM_LENGTH:
				return param_length != PARAM_LENGTH_EDEFAULT;
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
				case AvipPackage.FUNCTIONAL_DATA__DOCUMENTATION: return EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;
				case AvipPackage.FUNCTIONAL_DATA__MODIFIED: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;
				case AvipPackage.FUNCTIONAL_DATA__MODIFIER: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;
				case AvipPackage.FUNCTIONAL_DATA__TRACE_LINK: return EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;
				case AvipPackage.FUNCTIONAL_DATA__CREATED: return EtypesPackage.SUPER_TRACKING_TYPE__CREATED;
				case AvipPackage.FUNCTIONAL_DATA__CREATOR: return EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;
				case AvipPackage.FUNCTIONAL_DATA__VERSION: return EtypesPackage.SUPER_TRACKING_TYPE__VERSION;
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
				case EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION: return AvipPackage.FUNCTIONAL_DATA__DOCUMENTATION;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED: return AvipPackage.FUNCTIONAL_DATA__MODIFIED;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER: return AvipPackage.FUNCTIONAL_DATA__MODIFIER;
				case EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK: return AvipPackage.FUNCTIONAL_DATA__TRACE_LINK;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATED: return AvipPackage.FUNCTIONAL_DATA__CREATED;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATOR: return AvipPackage.FUNCTIONAL_DATA__CREATOR;
				case EtypesPackage.SUPER_TRACKING_TYPE__VERSION: return AvipPackage.FUNCTIONAL_DATA__VERSION;
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
		result.append(", direction: ");
		result.append(direction);
		result.append(", if_signal: ");
		result.append(if_signal);
		result.append(", param_type: ");
		result.append(param_type);
		result.append(", param_length: ");
		result.append(param_length);
		result.append(')');
		return result.toString();
	}

} //FunctionalDataImpl
