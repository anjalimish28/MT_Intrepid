/**
 */
package targets.configdesk.dSpaceArinc825.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import targets.configdesk.dSpaceArinc825.A825Configuration;
import targets.configdesk.dSpaceArinc825.DSpaceArinc825Package;
import targets.configdesk.dSpaceArinc825.ModelAccess;
import targets.configdesk.dSpaceArinc825.ModelPortBlockStructure;
import targets.configdesk.dSpaceArinc825.SuperConfigurationDeskA825StatusExtensionType;

import targets.configdesk.impl.SuperConfigurationDeskIOHardwareTypeImpl;

import ucof.common.enums.booleanType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>A825 Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.configdesk.dSpaceArinc825.impl.A825ConfigurationImpl#getChannelName <em>Channel Name</em>}</li>
 *   <li>{@link targets.configdesk.dSpaceArinc825.impl.A825ConfigurationImpl#getTerminated <em>Terminated</em>}</li>
 *   <li>{@link targets.configdesk.dSpaceArinc825.impl.A825ConfigurationImpl#getAssignedChannelSet <em>Assigned Channel Set</em>}</li>
 *   <li>{@link targets.configdesk.dSpaceArinc825.impl.A825ConfigurationImpl#getCanChannel <em>Can Channel</em>}</li>
 *   <li>{@link targets.configdesk.dSpaceArinc825.impl.A825ConfigurationImpl#getModelAccess <em>Model Access</em>}</li>
 *   <li>{@link targets.configdesk.dSpaceArinc825.impl.A825ConfigurationImpl#getModelPortBlockStructure <em>Model Port Block Structure</em>}</li>
 *   <li>{@link targets.configdesk.dSpaceArinc825.impl.A825ConfigurationImpl#getECU <em>ECU</em>}</li>
 *   <li>{@link targets.configdesk.dSpaceArinc825.impl.A825ConfigurationImpl#getStatusExtension <em>Status Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class A825ConfigurationImpl extends SuperConfigurationDeskIOHardwareTypeImpl implements A825Configuration {
	/**
	 * The default value of the '{@link #getChannelName() <em>Channel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelName()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANNEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChannelName() <em>Channel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelName()
	 * @generated
	 * @ordered
	 */
	protected String channelName = CHANNEL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTerminated() <em>Terminated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminated()
	 * @generated
	 * @ordered
	 */
	protected static final booleanType TERMINATED_EDEFAULT = booleanType.NOT_SET;

	/**
	 * The cached value of the '{@link #getTerminated() <em>Terminated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminated()
	 * @generated
	 * @ordered
	 */
	protected booleanType terminated = TERMINATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssignedChannelSet() <em>Assigned Channel Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedChannelSet()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSIGNED_CHANNEL_SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssignedChannelSet() <em>Assigned Channel Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedChannelSet()
	 * @generated
	 * @ordered
	 */
	protected String assignedChannelSet = ASSIGNED_CHANNEL_SET_EDEFAULT;

	/**
	 * The default value of the '{@link #getCanChannel() <em>Can Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanChannel()
	 * @generated
	 * @ordered
	 */
	protected static final String CAN_CHANNEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCanChannel() <em>Can Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanChannel()
	 * @generated
	 * @ordered
	 */
	protected String canChannel = CAN_CHANNEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelAccess() <em>Model Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelAccess()
	 * @generated
	 * @ordered
	 */
	protected static final ModelAccess MODEL_ACCESS_EDEFAULT = ModelAccess.NOT_SET;

	/**
	 * The cached value of the '{@link #getModelAccess() <em>Model Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelAccess()
	 * @generated
	 * @ordered
	 */
	protected ModelAccess modelAccess = MODEL_ACCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelPortBlockStructure() <em>Model Port Block Structure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelPortBlockStructure()
	 * @generated
	 * @ordered
	 */
	protected static final ModelPortBlockStructure MODEL_PORT_BLOCK_STRUCTURE_EDEFAULT = ModelPortBlockStructure.NOT_SET;

	/**
	 * The cached value of the '{@link #getModelPortBlockStructure() <em>Model Port Block Structure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelPortBlockStructure()
	 * @generated
	 * @ordered
	 */
	protected ModelPortBlockStructure modelPortBlockStructure = MODEL_PORT_BLOCK_STRUCTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getECU() <em>ECU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getECU()
	 * @generated
	 * @ordered
	 */
	protected static final String ECU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getECU() <em>ECU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getECU()
	 * @generated
	 * @ordered
	 */
	protected String eCU = ECU_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStatusExtension() <em>Status Extension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusExtension()
	 * @generated
	 * @ordered
	 */
	protected EList<SuperConfigurationDeskA825StatusExtensionType> statusExtension;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected A825ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DSpaceArinc825Package.Literals.A825_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChannelName() {
		return channelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannelName(String newChannelName) {
		String oldChannelName = channelName;
		channelName = newChannelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSpaceArinc825Package.A825_CONFIGURATION__CHANNEL_NAME, oldChannelName, channelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public booleanType getTerminated() {
		return terminated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminated(booleanType newTerminated) {
		booleanType oldTerminated = terminated;
		terminated = newTerminated == null ? TERMINATED_EDEFAULT : newTerminated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSpaceArinc825Package.A825_CONFIGURATION__TERMINATED, oldTerminated, terminated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssignedChannelSet() {
		return assignedChannelSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignedChannelSet(String newAssignedChannelSet) {
		String oldAssignedChannelSet = assignedChannelSet;
		assignedChannelSet = newAssignedChannelSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSpaceArinc825Package.A825_CONFIGURATION__ASSIGNED_CHANNEL_SET, oldAssignedChannelSet, assignedChannelSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCanChannel() {
		return canChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanChannel(String newCanChannel) {
		String oldCanChannel = canChannel;
		canChannel = newCanChannel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSpaceArinc825Package.A825_CONFIGURATION__CAN_CHANNEL, oldCanChannel, canChannel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAccess getModelAccess() {
		return modelAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelAccess(ModelAccess newModelAccess) {
		ModelAccess oldModelAccess = modelAccess;
		modelAccess = newModelAccess == null ? MODEL_ACCESS_EDEFAULT : newModelAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSpaceArinc825Package.A825_CONFIGURATION__MODEL_ACCESS, oldModelAccess, modelAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPortBlockStructure getModelPortBlockStructure() {
		return modelPortBlockStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelPortBlockStructure(ModelPortBlockStructure newModelPortBlockStructure) {
		ModelPortBlockStructure oldModelPortBlockStructure = modelPortBlockStructure;
		modelPortBlockStructure = newModelPortBlockStructure == null ? MODEL_PORT_BLOCK_STRUCTURE_EDEFAULT : newModelPortBlockStructure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSpaceArinc825Package.A825_CONFIGURATION__MODEL_PORT_BLOCK_STRUCTURE, oldModelPortBlockStructure, modelPortBlockStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getECU() {
		return eCU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setECU(String newECU) {
		String oldECU = eCU;
		eCU = newECU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSpaceArinc825Package.A825_CONFIGURATION__ECU, oldECU, eCU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SuperConfigurationDeskA825StatusExtensionType> getStatusExtension() {
		if (statusExtension == null) {
			statusExtension = new EObjectContainmentEList<SuperConfigurationDeskA825StatusExtensionType>(SuperConfigurationDeskA825StatusExtensionType.class, this, DSpaceArinc825Package.A825_CONFIGURATION__STATUS_EXTENSION);
		}
		return statusExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DSpaceArinc825Package.A825_CONFIGURATION__STATUS_EXTENSION:
				return ((InternalEList<?>)getStatusExtension()).basicRemove(otherEnd, msgs);
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
			case DSpaceArinc825Package.A825_CONFIGURATION__CHANNEL_NAME:
				return getChannelName();
			case DSpaceArinc825Package.A825_CONFIGURATION__TERMINATED:
				return getTerminated();
			case DSpaceArinc825Package.A825_CONFIGURATION__ASSIGNED_CHANNEL_SET:
				return getAssignedChannelSet();
			case DSpaceArinc825Package.A825_CONFIGURATION__CAN_CHANNEL:
				return getCanChannel();
			case DSpaceArinc825Package.A825_CONFIGURATION__MODEL_ACCESS:
				return getModelAccess();
			case DSpaceArinc825Package.A825_CONFIGURATION__MODEL_PORT_BLOCK_STRUCTURE:
				return getModelPortBlockStructure();
			case DSpaceArinc825Package.A825_CONFIGURATION__ECU:
				return getECU();
			case DSpaceArinc825Package.A825_CONFIGURATION__STATUS_EXTENSION:
				return getStatusExtension();
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
			case DSpaceArinc825Package.A825_CONFIGURATION__CHANNEL_NAME:
				setChannelName((String)newValue);
				return;
			case DSpaceArinc825Package.A825_CONFIGURATION__TERMINATED:
				setTerminated((booleanType)newValue);
				return;
			case DSpaceArinc825Package.A825_CONFIGURATION__ASSIGNED_CHANNEL_SET:
				setAssignedChannelSet((String)newValue);
				return;
			case DSpaceArinc825Package.A825_CONFIGURATION__CAN_CHANNEL:
				setCanChannel((String)newValue);
				return;
			case DSpaceArinc825Package.A825_CONFIGURATION__MODEL_ACCESS:
				setModelAccess((ModelAccess)newValue);
				return;
			case DSpaceArinc825Package.A825_CONFIGURATION__MODEL_PORT_BLOCK_STRUCTURE:
				setModelPortBlockStructure((ModelPortBlockStructure)newValue);
				return;
			case DSpaceArinc825Package.A825_CONFIGURATION__ECU:
				setECU((String)newValue);
				return;
			case DSpaceArinc825Package.A825_CONFIGURATION__STATUS_EXTENSION:
				getStatusExtension().clear();
				getStatusExtension().addAll((Collection<? extends SuperConfigurationDeskA825StatusExtensionType>)newValue);
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
			case DSpaceArinc825Package.A825_CONFIGURATION__CHANNEL_NAME:
				setChannelName(CHANNEL_NAME_EDEFAULT);
				return;
			case DSpaceArinc825Package.A825_CONFIGURATION__TERMINATED:
				setTerminated(TERMINATED_EDEFAULT);
				return;
			case DSpaceArinc825Package.A825_CONFIGURATION__ASSIGNED_CHANNEL_SET:
				setAssignedChannelSet(ASSIGNED_CHANNEL_SET_EDEFAULT);
				return;
			case DSpaceArinc825Package.A825_CONFIGURATION__CAN_CHANNEL:
				setCanChannel(CAN_CHANNEL_EDEFAULT);
				return;
			case DSpaceArinc825Package.A825_CONFIGURATION__MODEL_ACCESS:
				setModelAccess(MODEL_ACCESS_EDEFAULT);
				return;
			case DSpaceArinc825Package.A825_CONFIGURATION__MODEL_PORT_BLOCK_STRUCTURE:
				setModelPortBlockStructure(MODEL_PORT_BLOCK_STRUCTURE_EDEFAULT);
				return;
			case DSpaceArinc825Package.A825_CONFIGURATION__ECU:
				setECU(ECU_EDEFAULT);
				return;
			case DSpaceArinc825Package.A825_CONFIGURATION__STATUS_EXTENSION:
				getStatusExtension().clear();
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
			case DSpaceArinc825Package.A825_CONFIGURATION__CHANNEL_NAME:
				return CHANNEL_NAME_EDEFAULT == null ? channelName != null : !CHANNEL_NAME_EDEFAULT.equals(channelName);
			case DSpaceArinc825Package.A825_CONFIGURATION__TERMINATED:
				return terminated != TERMINATED_EDEFAULT;
			case DSpaceArinc825Package.A825_CONFIGURATION__ASSIGNED_CHANNEL_SET:
				return ASSIGNED_CHANNEL_SET_EDEFAULT == null ? assignedChannelSet != null : !ASSIGNED_CHANNEL_SET_EDEFAULT.equals(assignedChannelSet);
			case DSpaceArinc825Package.A825_CONFIGURATION__CAN_CHANNEL:
				return CAN_CHANNEL_EDEFAULT == null ? canChannel != null : !CAN_CHANNEL_EDEFAULT.equals(canChannel);
			case DSpaceArinc825Package.A825_CONFIGURATION__MODEL_ACCESS:
				return modelAccess != MODEL_ACCESS_EDEFAULT;
			case DSpaceArinc825Package.A825_CONFIGURATION__MODEL_PORT_BLOCK_STRUCTURE:
				return modelPortBlockStructure != MODEL_PORT_BLOCK_STRUCTURE_EDEFAULT;
			case DSpaceArinc825Package.A825_CONFIGURATION__ECU:
				return ECU_EDEFAULT == null ? eCU != null : !ECU_EDEFAULT.equals(eCU);
			case DSpaceArinc825Package.A825_CONFIGURATION__STATUS_EXTENSION:
				return statusExtension != null && !statusExtension.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (channelName: ");
		result.append(channelName);
		result.append(", terminated: ");
		result.append(terminated);
		result.append(", assignedChannelSet: ");
		result.append(assignedChannelSet);
		result.append(", canChannel: ");
		result.append(canChannel);
		result.append(", modelAccess: ");
		result.append(modelAccess);
		result.append(", modelPortBlockStructure: ");
		result.append(modelPortBlockStructure);
		result.append(", eCU: ");
		result.append(eCU);
		result.append(')');
		return result.toString();
	}

} //A825ConfigurationImpl
