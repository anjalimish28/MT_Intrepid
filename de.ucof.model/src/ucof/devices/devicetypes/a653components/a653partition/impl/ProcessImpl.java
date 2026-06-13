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
import ucof.common.etypes.SuperTrackingType;

import ucof.common.etypes.impl.SuperIdentifierTypeImpl;

import ucof.devices.devicetypes.a653components.a653partition.A653partitionPackage;
import ucof.devices.devicetypes.a653components.a653partition.ProcessDeadlineDefinition;
import ucof.devices.devicetypes.a653components.a653partition.ProcessSynchronicity;
import ucof.devices.ports.ProcessPorts;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.impl.ProcessImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.impl.ProcessImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.impl.ProcessImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.impl.ProcessImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.impl.ProcessImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.impl.ProcessImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.impl.ProcessImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.impl.ProcessImpl#getEntryPoint <em>Entry Point</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.impl.ProcessImpl#getStackSize <em>Stack Size</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.impl.ProcessImpl#getBasePriority <em>Base Priority</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.impl.ProcessImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.impl.ProcessImpl#getTimeCapacity <em>Time Capacity</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.impl.ProcessImpl#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.impl.ProcessImpl#getSynchronicity <em>Synchronicity</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.impl.ProcessImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.impl.ProcessImpl#getProcessPorts <em>Process Ports</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.impl.ProcessImpl#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessImpl extends SuperIdentifierTypeImpl implements ucof.devices.devicetypes.a653components.a653partition.Process {
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
	 * The default value of the '{@link #getStackSize() <em>Stack Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackSize()
	 * @generated
	 * @ordered
	 */
	protected static final String STACK_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStackSize() <em>Stack Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackSize()
	 * @generated
	 * @ordered
	 */
	protected String stackSize = STACK_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBasePriority() <em>Base Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePriority()
	 * @generated
	 * @ordered
	 */
	protected static final int BASE_PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBasePriority() <em>Base Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePriority()
	 * @generated
	 * @ordered
	 */
	protected int basePriority = BASE_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final String PERIOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected String period = PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeCapacity() <em>Time Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimeCapacity() <em>Time Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeCapacity()
	 * @generated
	 * @ordered
	 */
	protected int timeCapacity = TIME_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessDeadlineDefinition DEADLINE_EDEFAULT = ProcessDeadlineDefinition.NOT_SET;

	/**
	 * The cached value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected ProcessDeadlineDefinition deadline = DEADLINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSynchronicity() <em>Synchronicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronicity()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessSynchronicity SYNCHRONICITY_EDEFAULT = ProcessSynchronicity.NOT_SET;

	/**
	 * The cached value of the '{@link #getSynchronicity() <em>Synchronicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronicity()
	 * @generated
	 * @ordered
	 */
	protected ProcessSynchronicity synchronicity = SYNCHRONICITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final String DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected String duration = DURATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProcessPorts() <em>Process Ports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessPorts()
	 * @generated
	 * @ordered
	 */
	protected ProcessPorts processPorts;

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
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A653partitionPackage.Literals.PROCESS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, A653partitionPackage.PROCESS__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, A653partitionPackage.PROCESS__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, A653partitionPackage.PROCESS__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, A653partitionPackage.PROCESS__TRACE_LINK, oldTraceLink, traceLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, A653partitionPackage.PROCESS__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, A653partitionPackage.PROCESS__CREATOR, oldCreator, creator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, A653partitionPackage.PROCESS__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, A653partitionPackage.PROCESS__ENTRY_POINT, oldEntryPoint, entryPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStackSize() {
		return stackSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStackSize(String newStackSize) {
		String oldStackSize = stackSize;
		stackSize = newStackSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A653partitionPackage.PROCESS__STACK_SIZE, oldStackSize, stackSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBasePriority() {
		return basePriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasePriority(int newBasePriority) {
		int oldBasePriority = basePriority;
		basePriority = newBasePriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A653partitionPackage.PROCESS__BASE_PRIORITY, oldBasePriority, basePriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(String newPeriod) {
		String oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A653partitionPackage.PROCESS__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimeCapacity() {
		return timeCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeCapacity(int newTimeCapacity) {
		int oldTimeCapacity = timeCapacity;
		timeCapacity = newTimeCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A653partitionPackage.PROCESS__TIME_CAPACITY, oldTimeCapacity, timeCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessDeadlineDefinition getDeadline() {
		return deadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadline(ProcessDeadlineDefinition newDeadline) {
		ProcessDeadlineDefinition oldDeadline = deadline;
		deadline = newDeadline == null ? DEADLINE_EDEFAULT : newDeadline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A653partitionPackage.PROCESS__DEADLINE, oldDeadline, deadline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessSynchronicity getSynchronicity() {
		return synchronicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchronicity(ProcessSynchronicity newSynchronicity) {
		ProcessSynchronicity oldSynchronicity = synchronicity;
		synchronicity = newSynchronicity == null ? SYNCHRONICITY_EDEFAULT : newSynchronicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A653partitionPackage.PROCESS__SYNCHRONICITY, oldSynchronicity, synchronicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(String newDuration) {
		String oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A653partitionPackage.PROCESS__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessPorts getProcessPorts() {
		return processPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessPorts(ProcessPorts newProcessPorts, NotificationChain msgs) {
		ProcessPorts oldProcessPorts = processPorts;
		processPorts = newProcessPorts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, A653partitionPackage.PROCESS__PROCESS_PORTS, oldProcessPorts, newProcessPorts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessPorts(ProcessPorts newProcessPorts) {
		if (newProcessPorts != processPorts) {
			NotificationChain msgs = null;
			if (processPorts != null)
				msgs = ((InternalEObject)processPorts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - A653partitionPackage.PROCESS__PROCESS_PORTS, null, msgs);
			if (newProcessPorts != null)
				msgs = ((InternalEObject)newProcessPorts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - A653partitionPackage.PROCESS__PROCESS_PORTS, null, msgs);
			msgs = basicSetProcessPorts(newProcessPorts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A653partitionPackage.PROCESS__PROCESS_PORTS, newProcessPorts, newProcessPorts));
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
			eNotify(new ENotificationImpl(this, Notification.SET, A653partitionPackage.PROCESS__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case A653partitionPackage.PROCESS__PROCESS_PORTS:
				return basicSetProcessPorts(null, msgs);
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
			case A653partitionPackage.PROCESS__DOCUMENTATION:
				return getDocumentation();
			case A653partitionPackage.PROCESS__MODIFIED:
				return getModified();
			case A653partitionPackage.PROCESS__MODIFIER:
				return getModifier();
			case A653partitionPackage.PROCESS__TRACE_LINK:
				return getTraceLink();
			case A653partitionPackage.PROCESS__CREATED:
				return getCreated();
			case A653partitionPackage.PROCESS__CREATOR:
				return getCreator();
			case A653partitionPackage.PROCESS__VERSION:
				return getVersion();
			case A653partitionPackage.PROCESS__ENTRY_POINT:
				return getEntryPoint();
			case A653partitionPackage.PROCESS__STACK_SIZE:
				return getStackSize();
			case A653partitionPackage.PROCESS__BASE_PRIORITY:
				return getBasePriority();
			case A653partitionPackage.PROCESS__PERIOD:
				return getPeriod();
			case A653partitionPackage.PROCESS__TIME_CAPACITY:
				return getTimeCapacity();
			case A653partitionPackage.PROCESS__DEADLINE:
				return getDeadline();
			case A653partitionPackage.PROCESS__SYNCHRONICITY:
				return getSynchronicity();
			case A653partitionPackage.PROCESS__DURATION:
				return getDuration();
			case A653partitionPackage.PROCESS__PROCESS_PORTS:
				return getProcessPorts();
			case A653partitionPackage.PROCESS__OFFSET:
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
			case A653partitionPackage.PROCESS__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case A653partitionPackage.PROCESS__MODIFIED:
				setModified((Date)newValue);
				return;
			case A653partitionPackage.PROCESS__MODIFIER:
				setModifier((String)newValue);
				return;
			case A653partitionPackage.PROCESS__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case A653partitionPackage.PROCESS__CREATED:
				setCreated((Date)newValue);
				return;
			case A653partitionPackage.PROCESS__CREATOR:
				setCreator((String)newValue);
				return;
			case A653partitionPackage.PROCESS__VERSION:
				setVersion((Float)newValue);
				return;
			case A653partitionPackage.PROCESS__ENTRY_POINT:
				setEntryPoint((String)newValue);
				return;
			case A653partitionPackage.PROCESS__STACK_SIZE:
				setStackSize((String)newValue);
				return;
			case A653partitionPackage.PROCESS__BASE_PRIORITY:
				setBasePriority((Integer)newValue);
				return;
			case A653partitionPackage.PROCESS__PERIOD:
				setPeriod((String)newValue);
				return;
			case A653partitionPackage.PROCESS__TIME_CAPACITY:
				setTimeCapacity((Integer)newValue);
				return;
			case A653partitionPackage.PROCESS__DEADLINE:
				setDeadline((ProcessDeadlineDefinition)newValue);
				return;
			case A653partitionPackage.PROCESS__SYNCHRONICITY:
				setSynchronicity((ProcessSynchronicity)newValue);
				return;
			case A653partitionPackage.PROCESS__DURATION:
				setDuration((String)newValue);
				return;
			case A653partitionPackage.PROCESS__PROCESS_PORTS:
				setProcessPorts((ProcessPorts)newValue);
				return;
			case A653partitionPackage.PROCESS__OFFSET:
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
			case A653partitionPackage.PROCESS__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case A653partitionPackage.PROCESS__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case A653partitionPackage.PROCESS__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case A653partitionPackage.PROCESS__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case A653partitionPackage.PROCESS__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case A653partitionPackage.PROCESS__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case A653partitionPackage.PROCESS__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case A653partitionPackage.PROCESS__ENTRY_POINT:
				setEntryPoint(ENTRY_POINT_EDEFAULT);
				return;
			case A653partitionPackage.PROCESS__STACK_SIZE:
				setStackSize(STACK_SIZE_EDEFAULT);
				return;
			case A653partitionPackage.PROCESS__BASE_PRIORITY:
				setBasePriority(BASE_PRIORITY_EDEFAULT);
				return;
			case A653partitionPackage.PROCESS__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case A653partitionPackage.PROCESS__TIME_CAPACITY:
				setTimeCapacity(TIME_CAPACITY_EDEFAULT);
				return;
			case A653partitionPackage.PROCESS__DEADLINE:
				setDeadline(DEADLINE_EDEFAULT);
				return;
			case A653partitionPackage.PROCESS__SYNCHRONICITY:
				setSynchronicity(SYNCHRONICITY_EDEFAULT);
				return;
			case A653partitionPackage.PROCESS__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case A653partitionPackage.PROCESS__PROCESS_PORTS:
				setProcessPorts((ProcessPorts)null);
				return;
			case A653partitionPackage.PROCESS__OFFSET:
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
			case A653partitionPackage.PROCESS__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case A653partitionPackage.PROCESS__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case A653partitionPackage.PROCESS__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case A653partitionPackage.PROCESS__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case A653partitionPackage.PROCESS__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case A653partitionPackage.PROCESS__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case A653partitionPackage.PROCESS__VERSION:
				return version != VERSION_EDEFAULT;
			case A653partitionPackage.PROCESS__ENTRY_POINT:
				return ENTRY_POINT_EDEFAULT == null ? entryPoint != null : !ENTRY_POINT_EDEFAULT.equals(entryPoint);
			case A653partitionPackage.PROCESS__STACK_SIZE:
				return STACK_SIZE_EDEFAULT == null ? stackSize != null : !STACK_SIZE_EDEFAULT.equals(stackSize);
			case A653partitionPackage.PROCESS__BASE_PRIORITY:
				return basePriority != BASE_PRIORITY_EDEFAULT;
			case A653partitionPackage.PROCESS__PERIOD:
				return PERIOD_EDEFAULT == null ? period != null : !PERIOD_EDEFAULT.equals(period);
			case A653partitionPackage.PROCESS__TIME_CAPACITY:
				return timeCapacity != TIME_CAPACITY_EDEFAULT;
			case A653partitionPackage.PROCESS__DEADLINE:
				return deadline != DEADLINE_EDEFAULT;
			case A653partitionPackage.PROCESS__SYNCHRONICITY:
				return synchronicity != SYNCHRONICITY_EDEFAULT;
			case A653partitionPackage.PROCESS__DURATION:
				return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
			case A653partitionPackage.PROCESS__PROCESS_PORTS:
				return processPorts != null;
			case A653partitionPackage.PROCESS__OFFSET:
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
				case A653partitionPackage.PROCESS__DOCUMENTATION: return EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;
				case A653partitionPackage.PROCESS__MODIFIED: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;
				case A653partitionPackage.PROCESS__MODIFIER: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;
				case A653partitionPackage.PROCESS__TRACE_LINK: return EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;
				case A653partitionPackage.PROCESS__CREATED: return EtypesPackage.SUPER_TRACKING_TYPE__CREATED;
				case A653partitionPackage.PROCESS__CREATOR: return EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;
				case A653partitionPackage.PROCESS__VERSION: return EtypesPackage.SUPER_TRACKING_TYPE__VERSION;
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
				case EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION: return A653partitionPackage.PROCESS__DOCUMENTATION;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED: return A653partitionPackage.PROCESS__MODIFIED;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER: return A653partitionPackage.PROCESS__MODIFIER;
				case EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK: return A653partitionPackage.PROCESS__TRACE_LINK;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATED: return A653partitionPackage.PROCESS__CREATED;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATOR: return A653partitionPackage.PROCESS__CREATOR;
				case EtypesPackage.SUPER_TRACKING_TYPE__VERSION: return A653partitionPackage.PROCESS__VERSION;
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
		result.append(", entryPoint: ");
		result.append(entryPoint);
		result.append(", stackSize: ");
		result.append(stackSize);
		result.append(", basePriority: ");
		result.append(basePriority);
		result.append(", period: ");
		result.append(period);
		result.append(", timeCapacity: ");
		result.append(timeCapacity);
		result.append(", deadline: ");
		result.append(deadline);
		result.append(", synchronicity: ");
		result.append(synchronicity);
		result.append(", duration: ");
		result.append(duration);
		result.append(", offset: ");
		result.append(offset);
		result.append(')');
		return result.toString();
	}

} //ProcessImpl
