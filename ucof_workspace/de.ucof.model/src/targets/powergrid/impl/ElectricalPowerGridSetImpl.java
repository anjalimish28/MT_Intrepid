/**
 */
package targets.powergrid.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import targets.powergrid.ElectricalPowerGridSet;
import targets.powergrid.PowergridPackage;
import targets.powergrid.SuperElectricalGridType;

import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.SuperTrackingType;

import ucof.common.etypes.impl.SuperIdentifierTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Electrical Power Grid Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.powergrid.impl.ElectricalPowerGridSetImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link targets.powergrid.impl.ElectricalPowerGridSetImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link targets.powergrid.impl.ElectricalPowerGridSetImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link targets.powergrid.impl.ElectricalPowerGridSetImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link targets.powergrid.impl.ElectricalPowerGridSetImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link targets.powergrid.impl.ElectricalPowerGridSetImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link targets.powergrid.impl.ElectricalPowerGridSetImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link targets.powergrid.impl.ElectricalPowerGridSetImpl#getElectricalGrid <em>Electrical Grid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElectricalPowerGridSetImpl extends SuperIdentifierTypeImpl implements ElectricalPowerGridSet {
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
	 * The cached value of the '{@link #getElectricalGrid() <em>Electrical Grid</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectricalGrid()
	 * @generated
	 * @ordered
	 */
	protected EList<SuperElectricalGridType> electricalGrid;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectricalPowerGridSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PowergridPackage.Literals.ELECTRICAL_POWER_GRID_SET;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PowergridPackage.ELECTRICAL_POWER_GRID_SET__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PowergridPackage.ELECTRICAL_POWER_GRID_SET__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PowergridPackage.ELECTRICAL_POWER_GRID_SET__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PowergridPackage.ELECTRICAL_POWER_GRID_SET__TRACE_LINK, oldTraceLink, traceLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PowergridPackage.ELECTRICAL_POWER_GRID_SET__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PowergridPackage.ELECTRICAL_POWER_GRID_SET__CREATOR, oldCreator, creator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PowergridPackage.ELECTRICAL_POWER_GRID_SET__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SuperElectricalGridType> getElectricalGrid() {
		if (electricalGrid == null) {
			electricalGrid = new EObjectContainmentEList<SuperElectricalGridType>(SuperElectricalGridType.class, this, PowergridPackage.ELECTRICAL_POWER_GRID_SET__ELECTRICAL_GRID);
		}
		return electricalGrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PowergridPackage.ELECTRICAL_POWER_GRID_SET__ELECTRICAL_GRID:
				return ((InternalEList<?>)getElectricalGrid()).basicRemove(otherEnd, msgs);
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
			case PowergridPackage.ELECTRICAL_POWER_GRID_SET__DOCUMENTATION:
				return getDocumentation();
			case PowergridPackage.ELECTRICAL_POWER_GRID_SET__MODIFIED:
				return getModified();
			case PowergridPackage.ELECTRICAL_POWER_GRID_SET__MODIFIER:
				return getModifier();
			case PowergridPackage.ELECTRICAL_POWER_GRID_SET__TRACE_LINK:
				return getTraceLink();
			case PowergridPackage.ELECTRICAL_POWER_GRID_SET__CREATED:
				return getCreated();
			case PowergridPackage.ELECTRICAL_POWER_GRID_SET__CREATOR:
				return getCreator();
			case PowergridPackage.ELECTRICAL_POWER_GRID_SET__VERSION:
				return getVersion();
			case PowergridPackage.ELECTRICAL_POWER_GRID_SET__ELECTRICAL_GRID:
				return getElectricalGrid();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PowergridPackage.ELECTRICAL_POWER_GRID_SET__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case PowergridPackage.ELECTRICAL_POWER_GRID_SET__MODIFIED:
				setModified((Date)newValue);
				return;
			case PowergridPackage.ELECTRICAL_POWER_GRID_SET__MODIFIER:
				setModifier((String)newValue);
				return;
			case PowergridPackage.ELECTRICAL_POWER_GRID_SET__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case PowergridPackage.ELECTRICAL_POWER_GRID_SET__CREATED:
				setCreated((Date)newValue);
				return;
			case PowergridPackage.ELECTRICAL_POWER_GRID_SET__CREATOR:
				setCreator((String)newValue);
				return;
			case PowergridPackage.ELECTRICAL_POWER_GRID_SET__VERSION:
				setVersion((Float)newValue);
				return;
			case PowergridPackage.ELECTRICAL_POWER_GRID_SET__ELECTRICAL_GRID:
				getElectricalGrid().clear();
				getElectricalGrid().addAll((Collection<? extends SuperElectricalGridType>)newValue);
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
			case PowergridPackage.ELECTRICAL_POWER_GRID_SET__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case PowergridPackage.ELECTRICAL_POWER_GRID_SET__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case PowergridPackage.ELECTRICAL_POWER_GRID_SET__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case PowergridPackage.ELECTRICAL_POWER_GRID_SET__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case PowergridPackage.ELECTRICAL_POWER_GRID_SET__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case PowergridPackage.ELECTRICAL_POWER_GRID_SET__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case PowergridPackage.ELECTRICAL_POWER_GRID_SET__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case PowergridPackage.ELECTRICAL_POWER_GRID_SET__ELECTRICAL_GRID:
				getElectricalGrid().clear();
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
			case PowergridPackage.ELECTRICAL_POWER_GRID_SET__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case PowergridPackage.ELECTRICAL_POWER_GRID_SET__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case PowergridPackage.ELECTRICAL_POWER_GRID_SET__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case PowergridPackage.ELECTRICAL_POWER_GRID_SET__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case PowergridPackage.ELECTRICAL_POWER_GRID_SET__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case PowergridPackage.ELECTRICAL_POWER_GRID_SET__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case PowergridPackage.ELECTRICAL_POWER_GRID_SET__VERSION:
				return version != VERSION_EDEFAULT;
			case PowergridPackage.ELECTRICAL_POWER_GRID_SET__ELECTRICAL_GRID:
				return electricalGrid != null && !electricalGrid.isEmpty();
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
				case PowergridPackage.ELECTRICAL_POWER_GRID_SET__DOCUMENTATION: return EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;
				case PowergridPackage.ELECTRICAL_POWER_GRID_SET__MODIFIED: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;
				case PowergridPackage.ELECTRICAL_POWER_GRID_SET__MODIFIER: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;
				case PowergridPackage.ELECTRICAL_POWER_GRID_SET__TRACE_LINK: return EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;
				case PowergridPackage.ELECTRICAL_POWER_GRID_SET__CREATED: return EtypesPackage.SUPER_TRACKING_TYPE__CREATED;
				case PowergridPackage.ELECTRICAL_POWER_GRID_SET__CREATOR: return EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;
				case PowergridPackage.ELECTRICAL_POWER_GRID_SET__VERSION: return EtypesPackage.SUPER_TRACKING_TYPE__VERSION;
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
				case EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION: return PowergridPackage.ELECTRICAL_POWER_GRID_SET__DOCUMENTATION;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED: return PowergridPackage.ELECTRICAL_POWER_GRID_SET__MODIFIED;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER: return PowergridPackage.ELECTRICAL_POWER_GRID_SET__MODIFIER;
				case EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK: return PowergridPackage.ELECTRICAL_POWER_GRID_SET__TRACE_LINK;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATED: return PowergridPackage.ELECTRICAL_POWER_GRID_SET__CREATED;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATOR: return PowergridPackage.ELECTRICAL_POWER_GRID_SET__CREATOR;
				case EtypesPackage.SUPER_TRACKING_TYPE__VERSION: return PowergridPackage.ELECTRICAL_POWER_GRID_SET__VERSION;
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

} //ElectricalPowerGridSetImpl
