/**
 */
package targets.powergrid.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import targets.powergrid.PowergridPackage;
import targets.powergrid.SuperElectricalGridType;

import ucof.common.enums.booleanType;

import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.SuperTrackingType;

import ucof.common.etypes.impl.SuperIdentifierTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Super Electrical Grid Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.powergrid.impl.SuperElectricalGridTypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link targets.powergrid.impl.SuperElectricalGridTypeImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link targets.powergrid.impl.SuperElectricalGridTypeImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link targets.powergrid.impl.SuperElectricalGridTypeImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link targets.powergrid.impl.SuperElectricalGridTypeImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link targets.powergrid.impl.SuperElectricalGridTypeImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link targets.powergrid.impl.SuperElectricalGridTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link targets.powergrid.impl.SuperElectricalGridTypeImpl#getDefinedVoltage <em>Defined Voltage</em>}</li>
 *   <li>{@link targets.powergrid.impl.SuperElectricalGridTypeImpl#getNominalVoltage <em>Nominal Voltage</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SuperElectricalGridTypeImpl extends SuperIdentifierTypeImpl implements SuperElectricalGridType {
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
	 * The default value of the '{@link #getDefinedVoltage() <em>Defined Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinedVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final booleanType DEFINED_VOLTAGE_EDEFAULT = booleanType.NOT_SET;

	/**
	 * The cached value of the '{@link #getDefinedVoltage() <em>Defined Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinedVoltage()
	 * @generated
	 * @ordered
	 */
	protected booleanType definedVoltage = DEFINED_VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNominalVoltage() <em>Nominal Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final double NOMINAL_VOLTAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNominalVoltage() <em>Nominal Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalVoltage()
	 * @generated
	 * @ordered
	 */
	protected double nominalVoltage = NOMINAL_VOLTAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperElectricalGridTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PowergridPackage.Literals.SUPER_ELECTRICAL_GRID_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__TRACE_LINK, oldTraceLink, traceLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__CREATOR, oldCreator, creator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public booleanType getDefinedVoltage() {
		return definedVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinedVoltage(booleanType newDefinedVoltage) {
		booleanType oldDefinedVoltage = definedVoltage;
		definedVoltage = newDefinedVoltage == null ? DEFINED_VOLTAGE_EDEFAULT : newDefinedVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__DEFINED_VOLTAGE, oldDefinedVoltage, definedVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNominalVoltage() {
		return nominalVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalVoltage(double newNominalVoltage) {
		double oldNominalVoltage = nominalVoltage;
		nominalVoltage = newNominalVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__NOMINAL_VOLTAGE, oldNominalVoltage, nominalVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__DOCUMENTATION:
				return getDocumentation();
			case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__MODIFIED:
				return getModified();
			case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__MODIFIER:
				return getModifier();
			case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__TRACE_LINK:
				return getTraceLink();
			case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__CREATED:
				return getCreated();
			case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__CREATOR:
				return getCreator();
			case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__VERSION:
				return getVersion();
			case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__DEFINED_VOLTAGE:
				return getDefinedVoltage();
			case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__NOMINAL_VOLTAGE:
				return getNominalVoltage();
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
			case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__MODIFIED:
				setModified((Date)newValue);
				return;
			case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__MODIFIER:
				setModifier((String)newValue);
				return;
			case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__CREATED:
				setCreated((Date)newValue);
				return;
			case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__CREATOR:
				setCreator((String)newValue);
				return;
			case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__VERSION:
				setVersion((Float)newValue);
				return;
			case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__DEFINED_VOLTAGE:
				setDefinedVoltage((booleanType)newValue);
				return;
			case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__NOMINAL_VOLTAGE:
				setNominalVoltage((Double)newValue);
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
			case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__DEFINED_VOLTAGE:
				setDefinedVoltage(DEFINED_VOLTAGE_EDEFAULT);
				return;
			case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__NOMINAL_VOLTAGE:
				setNominalVoltage(NOMINAL_VOLTAGE_EDEFAULT);
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
			case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__VERSION:
				return version != VERSION_EDEFAULT;
			case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__DEFINED_VOLTAGE:
				return definedVoltage != DEFINED_VOLTAGE_EDEFAULT;
			case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__NOMINAL_VOLTAGE:
				return nominalVoltage != NOMINAL_VOLTAGE_EDEFAULT;
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
				case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__DOCUMENTATION: return EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;
				case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__MODIFIED: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;
				case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__MODIFIER: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;
				case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__TRACE_LINK: return EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;
				case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__CREATED: return EtypesPackage.SUPER_TRACKING_TYPE__CREATED;
				case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__CREATOR: return EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;
				case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__VERSION: return EtypesPackage.SUPER_TRACKING_TYPE__VERSION;
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
				case EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION: return PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__DOCUMENTATION;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED: return PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__MODIFIED;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER: return PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__MODIFIER;
				case EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK: return PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__TRACE_LINK;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATED: return PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__CREATED;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATOR: return PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__CREATOR;
				case EtypesPackage.SUPER_TRACKING_TYPE__VERSION: return PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__VERSION;
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
		result.append(", definedVoltage: ");
		result.append(definedVoltage);
		result.append(", nominalVoltage: ");
		result.append(nominalVoltage);
		result.append(')');
		return result.toString();
	}

} //SuperElectricalGridTypeImpl
