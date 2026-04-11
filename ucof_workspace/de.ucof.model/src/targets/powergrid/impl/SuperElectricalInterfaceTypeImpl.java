/**
 */
package targets.powergrid.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import targets.powergrid.PowergridPackage;
import targets.powergrid.SuperElectricalInterfaceType;
import targets.powergrid.interfaceType;

import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.SuperTrackingType;

import ucof.common.etypes.impl.SuperIdentifierTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Super Electrical Interface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.powergrid.impl.SuperElectricalInterfaceTypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link targets.powergrid.impl.SuperElectricalInterfaceTypeImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link targets.powergrid.impl.SuperElectricalInterfaceTypeImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link targets.powergrid.impl.SuperElectricalInterfaceTypeImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link targets.powergrid.impl.SuperElectricalInterfaceTypeImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link targets.powergrid.impl.SuperElectricalInterfaceTypeImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link targets.powergrid.impl.SuperElectricalInterfaceTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link targets.powergrid.impl.SuperElectricalInterfaceTypeImpl#getMinVoltage <em>Min Voltage</em>}</li>
 *   <li>{@link targets.powergrid.impl.SuperElectricalInterfaceTypeImpl#getMaxVoltage <em>Max Voltage</em>}</li>
 *   <li>{@link targets.powergrid.impl.SuperElectricalInterfaceTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SuperElectricalInterfaceTypeImpl extends SuperIdentifierTypeImpl implements SuperElectricalInterfaceType {
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
	 * The default value of the '{@link #getMinVoltage() <em>Min Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_VOLTAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinVoltage() <em>Min Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinVoltage()
	 * @generated
	 * @ordered
	 */
	protected double minVoltage = MIN_VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxVoltage() <em>Max Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_VOLTAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxVoltage() <em>Max Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxVoltage()
	 * @generated
	 * @ordered
	 */
	protected double maxVoltage = MAX_VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final interfaceType TYPE_EDEFAULT = interfaceType.NOT_SET;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected interfaceType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperElectricalInterfaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PowergridPackage.Literals.SUPER_ELECTRICAL_INTERFACE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__TRACE_LINK, oldTraceLink, traceLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__CREATOR, oldCreator, creator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinVoltage() {
		return minVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinVoltage(double newMinVoltage) {
		double oldMinVoltage = minVoltage;
		minVoltage = newMinVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__MIN_VOLTAGE, oldMinVoltage, minVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxVoltage() {
		return maxVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxVoltage(double newMaxVoltage) {
		double oldMaxVoltage = maxVoltage;
		maxVoltage = newMaxVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__MAX_VOLTAGE, oldMaxVoltage, maxVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interfaceType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(interfaceType newType) {
		interfaceType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__DOCUMENTATION:
				return getDocumentation();
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__MODIFIED:
				return getModified();
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__MODIFIER:
				return getModifier();
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__TRACE_LINK:
				return getTraceLink();
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__CREATED:
				return getCreated();
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__CREATOR:
				return getCreator();
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__VERSION:
				return getVersion();
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__MIN_VOLTAGE:
				return getMinVoltage();
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__MAX_VOLTAGE:
				return getMaxVoltage();
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__TYPE:
				return getType();
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
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__MODIFIED:
				setModified((Date)newValue);
				return;
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__MODIFIER:
				setModifier((String)newValue);
				return;
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__CREATED:
				setCreated((Date)newValue);
				return;
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__CREATOR:
				setCreator((String)newValue);
				return;
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__VERSION:
				setVersion((Float)newValue);
				return;
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__MIN_VOLTAGE:
				setMinVoltage((Double)newValue);
				return;
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__MAX_VOLTAGE:
				setMaxVoltage((Double)newValue);
				return;
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__TYPE:
				setType((interfaceType)newValue);
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
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__MIN_VOLTAGE:
				setMinVoltage(MIN_VOLTAGE_EDEFAULT);
				return;
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__MAX_VOLTAGE:
				setMaxVoltage(MAX_VOLTAGE_EDEFAULT);
				return;
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__VERSION:
				return version != VERSION_EDEFAULT;
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__MIN_VOLTAGE:
				return minVoltage != MIN_VOLTAGE_EDEFAULT;
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__MAX_VOLTAGE:
				return maxVoltage != MAX_VOLTAGE_EDEFAULT;
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__TYPE:
				return type != TYPE_EDEFAULT;
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
				case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__DOCUMENTATION: return EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;
				case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__MODIFIED: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;
				case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__MODIFIER: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;
				case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__TRACE_LINK: return EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;
				case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__CREATED: return EtypesPackage.SUPER_TRACKING_TYPE__CREATED;
				case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__CREATOR: return EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;
				case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__VERSION: return EtypesPackage.SUPER_TRACKING_TYPE__VERSION;
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
				case EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION: return PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__DOCUMENTATION;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED: return PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__MODIFIED;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER: return PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__MODIFIER;
				case EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK: return PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__TRACE_LINK;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATED: return PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__CREATED;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATOR: return PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__CREATOR;
				case EtypesPackage.SUPER_TRACKING_TYPE__VERSION: return PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__VERSION;
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
		result.append(", minVoltage: ");
		result.append(minVoltage);
		result.append(", maxVoltage: ");
		result.append(maxVoltage);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //SuperElectricalInterfaceTypeImpl
