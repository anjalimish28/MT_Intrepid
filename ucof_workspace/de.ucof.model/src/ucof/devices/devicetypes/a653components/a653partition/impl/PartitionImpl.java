/**
 */
package ucof.devices.devicetypes.a653components.a653partition.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.Memory;
import ucof.common.etypes.SuperTrackingType;

import ucof.common.etypes.impl.SuperIdentifierTypeImpl;

import ucof.devices.devicetypes.a653components.a653partition.A653partitionPackage;
import ucof.devices.devicetypes.a653components.a653partition.Criticality;
import ucof.devices.devicetypes.a653components.a653partition.Partition;
import ucof.devices.devicetypes.a653components.a653partition.Processes;

import ucof.devices.devicetypes.a653components.healthmanagement.HMTable;
import ucof.devices.ports.PartitionPorts;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.impl.PartitionImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.impl.PartitionImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.impl.PartitionImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.impl.PartitionImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.impl.PartitionImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.impl.PartitionImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.impl.PartitionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.impl.PartitionImpl#getCriticality <em>Criticality</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.impl.PartitionImpl#getEntryPoint <em>Entry Point</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.impl.PartitionImpl#getPartitionPeriod <em>Partition Period</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.impl.PartitionImpl#getMemory <em>Memory</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.impl.PartitionImpl#getHmTable <em>Hm Table</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.impl.PartitionImpl#getPartitionPorts <em>Partition Ports</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.impl.PartitionImpl#getProcesses <em>Processes</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.impl.PartitionImpl#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartitionImpl extends SuperIdentifierTypeImpl implements Partition {
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
	 * The default value of the '{@link #getCriticality() <em>Criticality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticality()
	 * @generated
	 * @ordered
	 */
	protected static final Criticality CRITICALITY_EDEFAULT = Criticality.NOT_SET;

	/**
	 * The cached value of the '{@link #getCriticality() <em>Criticality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticality()
	 * @generated
	 * @ordered
	 */
	protected Criticality criticality = CRITICALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntryPoint() <em>Entry Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryPoint()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTRY_POINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntryPoint() <em>Entry Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryPoint()
	 * @generated
	 * @ordered
	 */
	protected String entryPoint = ENTRY_POINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartitionPeriod() <em>Partition Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTITION_PERIOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartitionPeriod() <em>Partition Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionPeriod()
	 * @generated
	 * @ordered
	 */
	protected String partitionPeriod = PARTITION_PERIOD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMemory() <em>Memory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected Memory memory;

	/**
	 * The cached value of the '{@link #getHmTable() <em>Hm Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHmTable()
	 * @generated
	 * @ordered
	 */
	protected HMTable hmTable;

	/**
	 * The cached value of the '{@link #getPartitionPorts() <em>Partition Ports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionPorts()
	 * @generated
	 * @ordered
	 */
	protected PartitionPorts partitionPorts;

	/**
	 * The cached value of the '{@link #getProcesses() <em>Processes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcesses()
	 * @generated
	 * @ordered
	 */
	protected Processes processes;

	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final String OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected String offset = OFFSET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A653partitionPackage.Literals.PARTITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, A653partitionPackage.PARTITION__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, A653partitionPackage.PARTITION__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, A653partitionPackage.PARTITION__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, A653partitionPackage.PARTITION__TRACE_LINK, oldTraceLink, traceLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, A653partitionPackage.PARTITION__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, A653partitionPackage.PARTITION__CREATOR, oldCreator, creator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, A653partitionPackage.PARTITION__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Criticality getCriticality() {
		return criticality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriticality(Criticality newCriticality) {
		Criticality oldCriticality = criticality;
		criticality = newCriticality == null ? CRITICALITY_EDEFAULT : newCriticality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A653partitionPackage.PARTITION__CRITICALITY, oldCriticality, criticality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntryPoint() {
		return entryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryPoint(String newEntryPoint) {
		String oldEntryPoint = entryPoint;
		entryPoint = newEntryPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A653partitionPackage.PARTITION__ENTRY_POINT, oldEntryPoint, entryPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPartitionPeriod() {
		return partitionPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartitionPeriod(String newPartitionPeriod) {
		String oldPartitionPeriod = partitionPeriod;
		partitionPeriod = newPartitionPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A653partitionPackage.PARTITION__PARTITION_PERIOD, oldPartitionPeriod, partitionPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Memory getMemory() {
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemory(Memory newMemory, NotificationChain msgs) {
		Memory oldMemory = memory;
		memory = newMemory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, A653partitionPackage.PARTITION__MEMORY, oldMemory, newMemory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemory(Memory newMemory) {
		if (newMemory != memory) {
			NotificationChain msgs = null;
			if (memory != null)
				msgs = ((InternalEObject)memory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - A653partitionPackage.PARTITION__MEMORY, null, msgs);
			if (newMemory != null)
				msgs = ((InternalEObject)newMemory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - A653partitionPackage.PARTITION__MEMORY, null, msgs);
			msgs = basicSetMemory(newMemory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A653partitionPackage.PARTITION__MEMORY, newMemory, newMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMTable getHmTable() {
		return hmTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHmTable(HMTable newHmTable, NotificationChain msgs) {
		HMTable oldHmTable = hmTable;
		hmTable = newHmTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, A653partitionPackage.PARTITION__HM_TABLE, oldHmTable, newHmTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHmTable(HMTable newHmTable) {
		if (newHmTable != hmTable) {
			NotificationChain msgs = null;
			if (hmTable != null)
				msgs = ((InternalEObject)hmTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - A653partitionPackage.PARTITION__HM_TABLE, null, msgs);
			if (newHmTable != null)
				msgs = ((InternalEObject)newHmTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - A653partitionPackage.PARTITION__HM_TABLE, null, msgs);
			msgs = basicSetHmTable(newHmTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A653partitionPackage.PARTITION__HM_TABLE, newHmTable, newHmTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionPorts getPartitionPorts() {
		return partitionPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartitionPorts(PartitionPorts newPartitionPorts, NotificationChain msgs) {
		PartitionPorts oldPartitionPorts = partitionPorts;
		partitionPorts = newPartitionPorts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, A653partitionPackage.PARTITION__PARTITION_PORTS, oldPartitionPorts, newPartitionPorts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartitionPorts(PartitionPorts newPartitionPorts) {
		if (newPartitionPorts != partitionPorts) {
			NotificationChain msgs = null;
			if (partitionPorts != null)
				msgs = ((InternalEObject)partitionPorts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - A653partitionPackage.PARTITION__PARTITION_PORTS, null, msgs);
			if (newPartitionPorts != null)
				msgs = ((InternalEObject)newPartitionPorts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - A653partitionPackage.PARTITION__PARTITION_PORTS, null, msgs);
			msgs = basicSetPartitionPorts(newPartitionPorts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A653partitionPackage.PARTITION__PARTITION_PORTS, newPartitionPorts, newPartitionPorts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processes getProcesses() {
		return processes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcesses(Processes newProcesses, NotificationChain msgs) {
		Processes oldProcesses = processes;
		processes = newProcesses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, A653partitionPackage.PARTITION__PROCESSES, oldProcesses, newProcesses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcesses(Processes newProcesses) {
		if (newProcesses != processes) {
			NotificationChain msgs = null;
			if (processes != null)
				msgs = ((InternalEObject)processes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - A653partitionPackage.PARTITION__PROCESSES, null, msgs);
			if (newProcesses != null)
				msgs = ((InternalEObject)newProcesses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - A653partitionPackage.PARTITION__PROCESSES, null, msgs);
			msgs = basicSetProcesses(newProcesses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A653partitionPackage.PARTITION__PROCESSES, newProcesses, newProcesses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(String newOffset) {
		String oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A653partitionPackage.PARTITION__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case A653partitionPackage.PARTITION__MEMORY:
				return basicSetMemory(null, msgs);
			case A653partitionPackage.PARTITION__HM_TABLE:
				return basicSetHmTable(null, msgs);
			case A653partitionPackage.PARTITION__PARTITION_PORTS:
				return basicSetPartitionPorts(null, msgs);
			case A653partitionPackage.PARTITION__PROCESSES:
				return basicSetProcesses(null, msgs);
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
			case A653partitionPackage.PARTITION__DOCUMENTATION:
				return getDocumentation();
			case A653partitionPackage.PARTITION__MODIFIED:
				return getModified();
			case A653partitionPackage.PARTITION__MODIFIER:
				return getModifier();
			case A653partitionPackage.PARTITION__TRACE_LINK:
				return getTraceLink();
			case A653partitionPackage.PARTITION__CREATED:
				return getCreated();
			case A653partitionPackage.PARTITION__CREATOR:
				return getCreator();
			case A653partitionPackage.PARTITION__VERSION:
				return getVersion();
			case A653partitionPackage.PARTITION__CRITICALITY:
				return getCriticality();
			case A653partitionPackage.PARTITION__ENTRY_POINT:
				return getEntryPoint();
			case A653partitionPackage.PARTITION__PARTITION_PERIOD:
				return getPartitionPeriod();
			case A653partitionPackage.PARTITION__MEMORY:
				return getMemory();
			case A653partitionPackage.PARTITION__HM_TABLE:
				return getHmTable();
			case A653partitionPackage.PARTITION__PARTITION_PORTS:
				return getPartitionPorts();
			case A653partitionPackage.PARTITION__PROCESSES:
				return getProcesses();
			case A653partitionPackage.PARTITION__OFFSET:
				return getOffset();
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
			case A653partitionPackage.PARTITION__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case A653partitionPackage.PARTITION__MODIFIED:
				setModified((Date)newValue);
				return;
			case A653partitionPackage.PARTITION__MODIFIER:
				setModifier((String)newValue);
				return;
			case A653partitionPackage.PARTITION__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case A653partitionPackage.PARTITION__CREATED:
				setCreated((Date)newValue);
				return;
			case A653partitionPackage.PARTITION__CREATOR:
				setCreator((String)newValue);
				return;
			case A653partitionPackage.PARTITION__VERSION:
				setVersion((Float)newValue);
				return;
			case A653partitionPackage.PARTITION__CRITICALITY:
				setCriticality((Criticality)newValue);
				return;
			case A653partitionPackage.PARTITION__ENTRY_POINT:
				setEntryPoint((String)newValue);
				return;
			case A653partitionPackage.PARTITION__PARTITION_PERIOD:
				setPartitionPeriod((String)newValue);
				return;
			case A653partitionPackage.PARTITION__MEMORY:
				setMemory((Memory)newValue);
				return;
			case A653partitionPackage.PARTITION__HM_TABLE:
				setHmTable((HMTable)newValue);
				return;
			case A653partitionPackage.PARTITION__PARTITION_PORTS:
				setPartitionPorts((PartitionPorts)newValue);
				return;
			case A653partitionPackage.PARTITION__PROCESSES:
				setProcesses((Processes)newValue);
				return;
			case A653partitionPackage.PARTITION__OFFSET:
				setOffset((String)newValue);
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
			case A653partitionPackage.PARTITION__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case A653partitionPackage.PARTITION__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case A653partitionPackage.PARTITION__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case A653partitionPackage.PARTITION__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case A653partitionPackage.PARTITION__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case A653partitionPackage.PARTITION__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case A653partitionPackage.PARTITION__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case A653partitionPackage.PARTITION__CRITICALITY:
				setCriticality(CRITICALITY_EDEFAULT);
				return;
			case A653partitionPackage.PARTITION__ENTRY_POINT:
				setEntryPoint(ENTRY_POINT_EDEFAULT);
				return;
			case A653partitionPackage.PARTITION__PARTITION_PERIOD:
				setPartitionPeriod(PARTITION_PERIOD_EDEFAULT);
				return;
			case A653partitionPackage.PARTITION__MEMORY:
				setMemory((Memory)null);
				return;
			case A653partitionPackage.PARTITION__HM_TABLE:
				setHmTable((HMTable)null);
				return;
			case A653partitionPackage.PARTITION__PARTITION_PORTS:
				setPartitionPorts((PartitionPorts)null);
				return;
			case A653partitionPackage.PARTITION__PROCESSES:
				setProcesses((Processes)null);
				return;
			case A653partitionPackage.PARTITION__OFFSET:
				setOffset(OFFSET_EDEFAULT);
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
			case A653partitionPackage.PARTITION__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case A653partitionPackage.PARTITION__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case A653partitionPackage.PARTITION__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case A653partitionPackage.PARTITION__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case A653partitionPackage.PARTITION__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case A653partitionPackage.PARTITION__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case A653partitionPackage.PARTITION__VERSION:
				return version != VERSION_EDEFAULT;
			case A653partitionPackage.PARTITION__CRITICALITY:
				return criticality != CRITICALITY_EDEFAULT;
			case A653partitionPackage.PARTITION__ENTRY_POINT:
				return ENTRY_POINT_EDEFAULT == null ? entryPoint != null : !ENTRY_POINT_EDEFAULT.equals(entryPoint);
			case A653partitionPackage.PARTITION__PARTITION_PERIOD:
				return PARTITION_PERIOD_EDEFAULT == null ? partitionPeriod != null : !PARTITION_PERIOD_EDEFAULT.equals(partitionPeriod);
			case A653partitionPackage.PARTITION__MEMORY:
				return memory != null;
			case A653partitionPackage.PARTITION__HM_TABLE:
				return hmTable != null;
			case A653partitionPackage.PARTITION__PARTITION_PORTS:
				return partitionPorts != null;
			case A653partitionPackage.PARTITION__PROCESSES:
				return processes != null;
			case A653partitionPackage.PARTITION__OFFSET:
				return OFFSET_EDEFAULT == null ? offset != null : !OFFSET_EDEFAULT.equals(offset);
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
				case A653partitionPackage.PARTITION__DOCUMENTATION: return EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;
				case A653partitionPackage.PARTITION__MODIFIED: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;
				case A653partitionPackage.PARTITION__MODIFIER: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;
				case A653partitionPackage.PARTITION__TRACE_LINK: return EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;
				case A653partitionPackage.PARTITION__CREATED: return EtypesPackage.SUPER_TRACKING_TYPE__CREATED;
				case A653partitionPackage.PARTITION__CREATOR: return EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;
				case A653partitionPackage.PARTITION__VERSION: return EtypesPackage.SUPER_TRACKING_TYPE__VERSION;
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
				case EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION: return A653partitionPackage.PARTITION__DOCUMENTATION;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED: return A653partitionPackage.PARTITION__MODIFIED;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER: return A653partitionPackage.PARTITION__MODIFIER;
				case EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK: return A653partitionPackage.PARTITION__TRACE_LINK;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATED: return A653partitionPackage.PARTITION__CREATED;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATOR: return A653partitionPackage.PARTITION__CREATOR;
				case EtypesPackage.SUPER_TRACKING_TYPE__VERSION: return A653partitionPackage.PARTITION__VERSION;
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
		result.append(", criticality: ");
		result.append(criticality);
		result.append(", entryPoint: ");
		result.append(entryPoint);
		result.append(", partitionPeriod: ");
		result.append(partitionPeriod);
		result.append(", offset: ");
		result.append(offset);
		result.append(')');
		return result.toString();
	}

} //PartitionImpl
