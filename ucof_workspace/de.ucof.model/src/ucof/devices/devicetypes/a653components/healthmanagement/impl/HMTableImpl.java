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

import ucof.devices.devicetypes.a653components.healthmanagement.ErroInfoPartition;
import ucof.devices.devicetypes.a653components.healthmanagement.HMTable;
import ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage;
import ucof.devices.devicetypes.a653components.healthmanagement.MultiPartitionTable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HM Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.HMTableImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.HMTableImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.HMTableImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.HMTableImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.HMTableImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.HMTableImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.HMTableImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.HMTableImpl#getTableIdentifier <em>Table Identifier</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.HMTableImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.HMTableImpl#getMultiPartitionHMTableNameRef <em>Multi Partition HM Table Name Ref</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.HMTableImpl#getErrorInfo <em>Error Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HMTableImpl extends SuperIdentifierTypeImpl implements HMTable {
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
	 * The default value of the '{@link #getTableIdentifier() <em>Table Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTableIdentifier() <em>Table Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String tableIdentifier = TABLE_IDENTIFIER_EDEFAULT;

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
	 * The cached value of the '{@link #getMultiPartitionHMTableNameRef() <em>Multi Partition HM Table Name Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiPartitionHMTableNameRef()
	 * @generated
	 * @ordered
	 */
	protected MultiPartitionTable multiPartitionHMTableNameRef;

	/**
	 * The cached value of the '{@link #getErrorInfo() <em>Error Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<ErroInfoPartition> errorInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HMTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HealthmanagementPackage.Literals.HM_TABLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.HM_TABLE__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.HM_TABLE__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.HM_TABLE__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.HM_TABLE__TRACE_LINK, oldTraceLink, traceLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.HM_TABLE__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.HM_TABLE__CREATOR, oldCreator, creator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.HM_TABLE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTableIdentifier() {
		return tableIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableIdentifier(String newTableIdentifier) {
		String oldTableIdentifier = tableIdentifier;
		tableIdentifier = newTableIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.HM_TABLE__TABLE_IDENTIFIER, oldTableIdentifier, tableIdentifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.HM_TABLE__TABLE_NAME, oldTableName, tableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiPartitionTable getMultiPartitionHMTableNameRef() {
		if (multiPartitionHMTableNameRef != null && multiPartitionHMTableNameRef.eIsProxy()) {
			InternalEObject oldMultiPartitionHMTableNameRef = (InternalEObject)multiPartitionHMTableNameRef;
			multiPartitionHMTableNameRef = (MultiPartitionTable)eResolveProxy(oldMultiPartitionHMTableNameRef);
			if (multiPartitionHMTableNameRef != oldMultiPartitionHMTableNameRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HealthmanagementPackage.HM_TABLE__MULTI_PARTITION_HM_TABLE_NAME_REF, oldMultiPartitionHMTableNameRef, multiPartitionHMTableNameRef));
			}
		}
		return multiPartitionHMTableNameRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiPartitionTable basicGetMultiPartitionHMTableNameRef() {
		return multiPartitionHMTableNameRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiPartitionHMTableNameRef(MultiPartitionTable newMultiPartitionHMTableNameRef) {
		MultiPartitionTable oldMultiPartitionHMTableNameRef = multiPartitionHMTableNameRef;
		multiPartitionHMTableNameRef = newMultiPartitionHMTableNameRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.HM_TABLE__MULTI_PARTITION_HM_TABLE_NAME_REF, oldMultiPartitionHMTableNameRef, multiPartitionHMTableNameRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErroInfoPartition> getErrorInfo() {
		if (errorInfo == null) {
			errorInfo = new EObjectContainmentEList<ErroInfoPartition>(ErroInfoPartition.class, this, HealthmanagementPackage.HM_TABLE__ERROR_INFO);
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
			case HealthmanagementPackage.HM_TABLE__ERROR_INFO:
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
			case HealthmanagementPackage.HM_TABLE__DOCUMENTATION:
				return getDocumentation();
			case HealthmanagementPackage.HM_TABLE__MODIFIED:
				return getModified();
			case HealthmanagementPackage.HM_TABLE__MODIFIER:
				return getModifier();
			case HealthmanagementPackage.HM_TABLE__TRACE_LINK:
				return getTraceLink();
			case HealthmanagementPackage.HM_TABLE__CREATED:
				return getCreated();
			case HealthmanagementPackage.HM_TABLE__CREATOR:
				return getCreator();
			case HealthmanagementPackage.HM_TABLE__VERSION:
				return getVersion();
			case HealthmanagementPackage.HM_TABLE__TABLE_IDENTIFIER:
				return getTableIdentifier();
			case HealthmanagementPackage.HM_TABLE__TABLE_NAME:
				return getTableName();
			case HealthmanagementPackage.HM_TABLE__MULTI_PARTITION_HM_TABLE_NAME_REF:
				if (resolve) return getMultiPartitionHMTableNameRef();
				return basicGetMultiPartitionHMTableNameRef();
			case HealthmanagementPackage.HM_TABLE__ERROR_INFO:
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
			case HealthmanagementPackage.HM_TABLE__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case HealthmanagementPackage.HM_TABLE__MODIFIED:
				setModified((Date)newValue);
				return;
			case HealthmanagementPackage.HM_TABLE__MODIFIER:
				setModifier((String)newValue);
				return;
			case HealthmanagementPackage.HM_TABLE__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case HealthmanagementPackage.HM_TABLE__CREATED:
				setCreated((Date)newValue);
				return;
			case HealthmanagementPackage.HM_TABLE__CREATOR:
				setCreator((String)newValue);
				return;
			case HealthmanagementPackage.HM_TABLE__VERSION:
				setVersion((Float)newValue);
				return;
			case HealthmanagementPackage.HM_TABLE__TABLE_IDENTIFIER:
				setTableIdentifier((String)newValue);
				return;
			case HealthmanagementPackage.HM_TABLE__TABLE_NAME:
				setTableName((String)newValue);
				return;
			case HealthmanagementPackage.HM_TABLE__MULTI_PARTITION_HM_TABLE_NAME_REF:
				setMultiPartitionHMTableNameRef((MultiPartitionTable)newValue);
				return;
			case HealthmanagementPackage.HM_TABLE__ERROR_INFO:
				getErrorInfo().clear();
				getErrorInfo().addAll((Collection<? extends ErroInfoPartition>)newValue);
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
			case HealthmanagementPackage.HM_TABLE__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case HealthmanagementPackage.HM_TABLE__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case HealthmanagementPackage.HM_TABLE__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case HealthmanagementPackage.HM_TABLE__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case HealthmanagementPackage.HM_TABLE__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case HealthmanagementPackage.HM_TABLE__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case HealthmanagementPackage.HM_TABLE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case HealthmanagementPackage.HM_TABLE__TABLE_IDENTIFIER:
				setTableIdentifier(TABLE_IDENTIFIER_EDEFAULT);
				return;
			case HealthmanagementPackage.HM_TABLE__TABLE_NAME:
				setTableName(TABLE_NAME_EDEFAULT);
				return;
			case HealthmanagementPackage.HM_TABLE__MULTI_PARTITION_HM_TABLE_NAME_REF:
				setMultiPartitionHMTableNameRef((MultiPartitionTable)null);
				return;
			case HealthmanagementPackage.HM_TABLE__ERROR_INFO:
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
			case HealthmanagementPackage.HM_TABLE__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case HealthmanagementPackage.HM_TABLE__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case HealthmanagementPackage.HM_TABLE__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case HealthmanagementPackage.HM_TABLE__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case HealthmanagementPackage.HM_TABLE__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case HealthmanagementPackage.HM_TABLE__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case HealthmanagementPackage.HM_TABLE__VERSION:
				return version != VERSION_EDEFAULT;
			case HealthmanagementPackage.HM_TABLE__TABLE_IDENTIFIER:
				return TABLE_IDENTIFIER_EDEFAULT == null ? tableIdentifier != null : !TABLE_IDENTIFIER_EDEFAULT.equals(tableIdentifier);
			case HealthmanagementPackage.HM_TABLE__TABLE_NAME:
				return TABLE_NAME_EDEFAULT == null ? tableName != null : !TABLE_NAME_EDEFAULT.equals(tableName);
			case HealthmanagementPackage.HM_TABLE__MULTI_PARTITION_HM_TABLE_NAME_REF:
				return multiPartitionHMTableNameRef != null;
			case HealthmanagementPackage.HM_TABLE__ERROR_INFO:
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
				case HealthmanagementPackage.HM_TABLE__DOCUMENTATION: return EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;
				case HealthmanagementPackage.HM_TABLE__MODIFIED: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;
				case HealthmanagementPackage.HM_TABLE__MODIFIER: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;
				case HealthmanagementPackage.HM_TABLE__TRACE_LINK: return EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;
				case HealthmanagementPackage.HM_TABLE__CREATED: return EtypesPackage.SUPER_TRACKING_TYPE__CREATED;
				case HealthmanagementPackage.HM_TABLE__CREATOR: return EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;
				case HealthmanagementPackage.HM_TABLE__VERSION: return EtypesPackage.SUPER_TRACKING_TYPE__VERSION;
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
				case EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION: return HealthmanagementPackage.HM_TABLE__DOCUMENTATION;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED: return HealthmanagementPackage.HM_TABLE__MODIFIED;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER: return HealthmanagementPackage.HM_TABLE__MODIFIER;
				case EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK: return HealthmanagementPackage.HM_TABLE__TRACE_LINK;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATED: return HealthmanagementPackage.HM_TABLE__CREATED;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATOR: return HealthmanagementPackage.HM_TABLE__CREATOR;
				case EtypesPackage.SUPER_TRACKING_TYPE__VERSION: return HealthmanagementPackage.HM_TABLE__VERSION;
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
		result.append(", tableIdentifier: ");
		result.append(tableIdentifier);
		result.append(", tableName: ");
		result.append(tableName);
		result.append(')');
		return result.toString();
	}

} //HMTableImpl
