/**
 */
package targets.configdesk.ethernet.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import targets.configdesk.ethernet.ETHSetup;
import targets.configdesk.ethernet.EthernetPackage;
import targets.configdesk.ethernet.UDPConnection;

import targets.configdesk.impl.SuperConfigurationDeskIOHardwareTypeImpl;

import ucof.communication.basedonethernet.EthernetPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ETH Setup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.configdesk.ethernet.impl.ETHSetupImpl#getChannelSet <em>Channel Set</em>}</li>
 *   <li>{@link targets.configdesk.ethernet.impl.ETHSetupImpl#getChannel <em>Channel</em>}</li>
 *   <li>{@link targets.configdesk.ethernet.impl.ETHSetupImpl#getModelAccessiblePorts <em>Model Accessible Ports</em>}</li>
 *   <li>{@link targets.configdesk.ethernet.impl.ETHSetupImpl#getEthernetPort <em>Ethernet Port</em>}</li>
 *   <li>{@link targets.configdesk.ethernet.impl.ETHSetupImpl#getUDPConnection <em>UDP Connection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ETHSetupImpl extends SuperConfigurationDeskIOHardwareTypeImpl implements ETHSetup {
	/**
	 * The default value of the '{@link #getChannelSet() <em>Channel Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelSet()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANNEL_SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChannelSet() <em>Channel Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelSet()
	 * @generated
	 * @ordered
	 */
	protected String channelSet = CHANNEL_SET_EDEFAULT;

	/**
	 * The default value of the '{@link #getChannel() <em>Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANNEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChannel() <em>Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel()
	 * @generated
	 * @ordered
	 */
	protected String channel = CHANNEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelAccessiblePorts() <em>Model Accessible Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelAccessiblePorts()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_ACCESSIBLE_PORTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelAccessiblePorts() <em>Model Accessible Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelAccessiblePorts()
	 * @generated
	 * @ordered
	 */
	protected String modelAccessiblePorts = MODEL_ACCESSIBLE_PORTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEthernetPort() <em>Ethernet Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEthernetPort()
	 * @generated
	 * @ordered
	 */
	protected EthernetPort ethernetPort;

	/**
	 * The cached value of the '{@link #getUDPConnection() <em>UDP Connection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUDPConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<UDPConnection> uDPConnection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ETHSetupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EthernetPackage.Literals.ETH_SETUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChannelSet() {
		return channelSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannelSet(String newChannelSet) {
		String oldChannelSet = channelSet;
		channelSet = newChannelSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthernetPackage.ETH_SETUP__CHANNEL_SET, oldChannelSet, channelSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChannel() {
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannel(String newChannel) {
		String oldChannel = channel;
		channel = newChannel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthernetPackage.ETH_SETUP__CHANNEL, oldChannel, channel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelAccessiblePorts() {
		return modelAccessiblePorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelAccessiblePorts(String newModelAccessiblePorts) {
		String oldModelAccessiblePorts = modelAccessiblePorts;
		modelAccessiblePorts = newModelAccessiblePorts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthernetPackage.ETH_SETUP__MODEL_ACCESSIBLE_PORTS, oldModelAccessiblePorts, modelAccessiblePorts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EthernetPort getEthernetPort() {
		if (ethernetPort != null && ethernetPort.eIsProxy()) {
			InternalEObject oldEthernetPort = (InternalEObject)ethernetPort;
			ethernetPort = (EthernetPort)eResolveProxy(oldEthernetPort);
			if (ethernetPort != oldEthernetPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EthernetPackage.ETH_SETUP__ETHERNET_PORT, oldEthernetPort, ethernetPort));
			}
		}
		return ethernetPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EthernetPort basicGetEthernetPort() {
		return ethernetPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEthernetPort(EthernetPort newEthernetPort) {
		EthernetPort oldEthernetPort = ethernetPort;
		ethernetPort = newEthernetPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthernetPackage.ETH_SETUP__ETHERNET_PORT, oldEthernetPort, ethernetPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UDPConnection> getUDPConnection() {
		if (uDPConnection == null) {
			uDPConnection = new EObjectContainmentEList<UDPConnection>(UDPConnection.class, this, EthernetPackage.ETH_SETUP__UDP_CONNECTION);
		}
		return uDPConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EthernetPackage.ETH_SETUP__UDP_CONNECTION:
				return ((InternalEList<?>)getUDPConnection()).basicRemove(otherEnd, msgs);
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
			case EthernetPackage.ETH_SETUP__CHANNEL_SET:
				return getChannelSet();
			case EthernetPackage.ETH_SETUP__CHANNEL:
				return getChannel();
			case EthernetPackage.ETH_SETUP__MODEL_ACCESSIBLE_PORTS:
				return getModelAccessiblePorts();
			case EthernetPackage.ETH_SETUP__ETHERNET_PORT:
				if (resolve) return getEthernetPort();
				return basicGetEthernetPort();
			case EthernetPackage.ETH_SETUP__UDP_CONNECTION:
				return getUDPConnection();
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
			case EthernetPackage.ETH_SETUP__CHANNEL_SET:
				setChannelSet((String)newValue);
				return;
			case EthernetPackage.ETH_SETUP__CHANNEL:
				setChannel((String)newValue);
				return;
			case EthernetPackage.ETH_SETUP__MODEL_ACCESSIBLE_PORTS:
				setModelAccessiblePorts((String)newValue);
				return;
			case EthernetPackage.ETH_SETUP__ETHERNET_PORT:
				setEthernetPort((EthernetPort)newValue);
				return;
			case EthernetPackage.ETH_SETUP__UDP_CONNECTION:
				getUDPConnection().clear();
				getUDPConnection().addAll((Collection<? extends UDPConnection>)newValue);
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
			case EthernetPackage.ETH_SETUP__CHANNEL_SET:
				setChannelSet(CHANNEL_SET_EDEFAULT);
				return;
			case EthernetPackage.ETH_SETUP__CHANNEL:
				setChannel(CHANNEL_EDEFAULT);
				return;
			case EthernetPackage.ETH_SETUP__MODEL_ACCESSIBLE_PORTS:
				setModelAccessiblePorts(MODEL_ACCESSIBLE_PORTS_EDEFAULT);
				return;
			case EthernetPackage.ETH_SETUP__ETHERNET_PORT:
				setEthernetPort((EthernetPort)null);
				return;
			case EthernetPackage.ETH_SETUP__UDP_CONNECTION:
				getUDPConnection().clear();
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
			case EthernetPackage.ETH_SETUP__CHANNEL_SET:
				return CHANNEL_SET_EDEFAULT == null ? channelSet != null : !CHANNEL_SET_EDEFAULT.equals(channelSet);
			case EthernetPackage.ETH_SETUP__CHANNEL:
				return CHANNEL_EDEFAULT == null ? channel != null : !CHANNEL_EDEFAULT.equals(channel);
			case EthernetPackage.ETH_SETUP__MODEL_ACCESSIBLE_PORTS:
				return MODEL_ACCESSIBLE_PORTS_EDEFAULT == null ? modelAccessiblePorts != null : !MODEL_ACCESSIBLE_PORTS_EDEFAULT.equals(modelAccessiblePorts);
			case EthernetPackage.ETH_SETUP__ETHERNET_PORT:
				return ethernetPort != null;
			case EthernetPackage.ETH_SETUP__UDP_CONNECTION:
				return uDPConnection != null && !uDPConnection.isEmpty();
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
		result.append(" (channelSet: ");
		result.append(channelSet);
		result.append(", channel: ");
		result.append(channel);
		result.append(", modelAccessiblePorts: ");
		result.append(modelAccessiblePorts);
		result.append(')');
		return result.toString();
	}

} //ETHSetupImpl
