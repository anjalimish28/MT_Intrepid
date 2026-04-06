/**
 */
package ucof.devices.devicetypes.a653components.healthmanagement.impl;

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

import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.SuperTrackingType;

import ucof.common.etypes.impl.SuperIdentifierTypeImpl;

import ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoMultiPartition;
import ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage;
import ucof.devices.devicetypes.a653components.healthmanagement.MultiPartitionTable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Partition Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.MultiPartitionTableImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.MultiPartitionTableImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.MultiPartitionTableImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.MultiPartitionTableImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.MultiPartitionTableImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.MultiPartitionTableImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.MultiPartitionTableImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.MultiPartitionTableImpl#getTableID <em>Table ID</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.MultiPartitionTableImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.MultiPartitionTableImpl#getErrorInfo <em>Error Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiPartitionTableImpl extends SuperIdentifierTypeImpl implements MultiPartitionTable {
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
	 * The default value of the '{@link #getTableID() <em>Table ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableID()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTableID() <em>Table ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableID()
	 * @generated
	 * @ordered
	 */
	protected String tableID = TABLE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName()
	 * @generated
	 * @ordered
	 */
	protected String tableName = TABLE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getErrorInfo() <em>Error Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<ErrorInfoMultiPartition> errorInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiPartitionTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HealthmanagementPackage.Literals.MULTI_PARTITION_TABLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.MULTI_PARTITION_TABLE__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.MULTI_PARTITION_TABLE__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.MULTI_PARTITION_TABLE__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.MULTI_PARTITION_TABLE__TRACE_LINK, oldTraceLink, traceLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.MULTI_PARTITION_TABLE__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.MULTI_PARTITION_TABLE__CREATOR, oldCreator, creator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.MULTI_PARTITION_TABLE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTableID() {
		return tableID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableID(String newTableID) {
		String oldTableID = tableID;
		tableID = newTableID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.MULTI_PARTITION_TABLE__TABLE_ID, oldTableID, tableID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTableName() {
		return tableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableName(String newTableName) {
		String oldTableName = tableName;
		tableName = newTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.MULTI_PARTITION_TABLE__TABLE_NAME, oldTableName, tableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErrorInfoMultiPartition> getErrorInfo() {
		if (errorInfo == null) {
			errorInfo = new EObjectContainmentEList<ErrorInfoMultiPartition>(ErrorInfoMultiPartition.class, this, HealthmanagementPackage.MULTI_PARTITION_TABLE__ERROR_INFO);
		}
		return errorInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__ERROR_INFO:
				return ((InternalEList<?>)getErrorInfo()).basicRemove(otherEnd, msgs);
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
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__DOCUMENTATION:
				return getDocumentation();
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__MODIFIED:
				return getModified();
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__MODIFIER:
				return getModifier();
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__TRACE_LINK:
				return getTraceLink();
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__CREATED:
				return getCreated();
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__CREATOR:
				return getCreator();
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__VERSION:
				return getVersion();
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__TABLE_ID:
				return getTableID();
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__TABLE_NAME:
				return getTableName();
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__ERROR_INFO:
				return getErrorInfo();
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
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__MODIFIED:
				setModified((Date)newValue);
				return;
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__MODIFIER:
				setModifier((String)newValue);
				return;
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__CREATED:
				setCreated((Date)newValue);
				return;
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__CREATOR:
				setCreator((String)newValue);
				return;
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__VERSION:
				setVersion((Float)newValue);
				return;
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__TABLE_ID:
				setTableID((String)newValue);
				return;
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__TABLE_NAME:
				setTableName((String)newValue);
				return;
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__ERROR_INFO:
				getErrorInfo().clear();
				getErrorInfo().addAll((Collection<? extends ErrorInfoMultiPartition>)newValue);
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
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__TABLE_ID:
				setTableID(TABLE_ID_EDEFAULT);
				return;
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__TABLE_NAME:
				setTableName(TABLE_NAME_EDEFAULT);
				return;
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__ERROR_INFO:
				getErrorInfo().clear();
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
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__VERSION:
				return version != VERSION_EDEFAULT;
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__TABLE_ID:
				return TABLE_ID_EDEFAULT == null ? tableID != null : !TABLE_ID_EDEFAULT.equals(tableID);
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__TABLE_NAME:
				return TABLE_NAME_EDEFAULT == null ? tableName != null : !TABLE_NAME_EDEFAULT.equals(tableName);
			case HealthmanagementPackage.MULTI_PARTITION_TABLE__ERROR_INFO:
				return errorInfo != null && !errorInfo.isEmpty();
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
				case HealthmanagementPackage.MULTI_PARTITION_TABLE__DOCUMENTATION: return EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;
				case HealthmanagementPackage.MULTI_PARTITION_TABLE__MODIFIED: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;
				case HealthmanagementPackage.MULTI_PARTITION_TABLE__MODIFIER: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;
				case HealthmanagementPackage.MULTI_PARTITION_TABLE__TRACE_LINK: return EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;
				case HealthmanagementPackage.MULTI_PARTITION_TABLE__CREATED: return EtypesPackage.SUPER_TRACKING_TYPE__CREATED;
				case HealthmanagementPackage.MULTI_PARTITION_TABLE__CREATOR: return EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;
				case HealthmanagementPackage.MULTI_PARTITION_TABLE__VERSION: return EtypesPackage.SUPER_TRACKING_TYPE__VERSION;
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
				case EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION: return HealthmanagementPackage.MULTI_PARTITION_TABLE__DOCUMENTATION;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED: return HealthmanagementPackage.MULTI_PARTITION_TABLE__MODIFIED;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER: return HealthmanagementPackage.MULTI_PARTITION_TABLE__MODIFIER;
				case EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK: return HealthmanagementPackage.MULTI_PARTITION_TABLE__TRACE_LINK;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATED: return HealthmanagementPackage.MULTI_PARTITION_TABLE__CREATED;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATOR: return HealthmanagementPackage.MULTI_PARTITION_TABLE__CREATOR;
				case EtypesPackage.SUPER_TRACKING_TYPE__VERSION: return HealthmanagementPackage.MULTI_PARTITION_TABLE__VERSION;
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
		result.append(", tableID: ");
		result.append(tableID);
		result.append(", tableName: ");
		result.append(tableName);
		result.append(')');
		return result.toString();
	}

} //MultiPartitionTableImpl
