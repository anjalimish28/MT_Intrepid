/**
 */
package targets.intrepidgateway.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import targets.impl.SuperClassExtensionTypeImpl;

import targets.intrepidgateway.CanMailboxAddressFilter;
import targets.intrepidgateway.CanMailboxOutSlot;
import targets.intrepidgateway.IntrepidgatewayPackage;
import targets.intrepidgateway.MsgBoxExtension;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Msg Box Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.intrepidgateway.impl.MsgBoxExtensionImpl#getNumOfOutgoingMailboxes <em>Num Of Outgoing Mailboxes</em>}</li>
 *   <li>{@link targets.intrepidgateway.impl.MsgBoxExtensionImpl#getNumOfIncomingMailboxes <em>Num Of Incoming Mailboxes</em>}</li>
 *   <li>{@link targets.intrepidgateway.impl.MsgBoxExtensionImpl#getSmallBufferSize <em>Small Buffer Size</em>}</li>
 *   <li>{@link targets.intrepidgateway.impl.MsgBoxExtensionImpl#getSmallBufferCount <em>Small Buffer Count</em>}</li>
 *   <li>{@link targets.intrepidgateway.impl.MsgBoxExtensionImpl#getMediumBufferSize <em>Medium Buffer Size</em>}</li>
 *   <li>{@link targets.intrepidgateway.impl.MsgBoxExtensionImpl#getMediumBufferCount <em>Medium Buffer Count</em>}</li>
 *   <li>{@link targets.intrepidgateway.impl.MsgBoxExtensionImpl#getBigBufferSize <em>Big Buffer Size</em>}</li>
 *   <li>{@link targets.intrepidgateway.impl.MsgBoxExtensionImpl#getBigBufferCount <em>Big Buffer Count</em>}</li>
 *   <li>{@link targets.intrepidgateway.impl.MsgBoxExtensionImpl#getNodeAddr <em>Node Addr</em>}</li>
 *   <li>{@link targets.intrepidgateway.impl.MsgBoxExtensionImpl#getNodeAddressSymbol <em>Node Address Symbol</em>}</li>
 *   <li>{@link targets.intrepidgateway.impl.MsgBoxExtensionImpl#getIncomingDestinationFilter <em>Incoming Destination Filter</em>}</li>
 *   <li>{@link targets.intrepidgateway.impl.MsgBoxExtensionImpl#getSenderSourceFilter <em>Sender Source Filter</em>}</li>
 *   <li>{@link targets.intrepidgateway.impl.MsgBoxExtensionImpl#getOutgoingMailboxSlot <em>Outgoing Mailbox Slot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MsgBoxExtensionImpl extends SuperClassExtensionTypeImpl implements MsgBoxExtension {
	/**
	 * The default value of the '{@link #getNumOfOutgoingMailboxes() <em>Num Of Outgoing Mailboxes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfOutgoingMailboxes()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_OF_OUTGOING_MAILBOXES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumOfOutgoingMailboxes() <em>Num Of Outgoing Mailboxes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfOutgoingMailboxes()
	 * @generated
	 * @ordered
	 */
	protected int numOfOutgoingMailboxes = NUM_OF_OUTGOING_MAILBOXES_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumOfIncomingMailboxes() <em>Num Of Incoming Mailboxes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfIncomingMailboxes()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_OF_INCOMING_MAILBOXES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumOfIncomingMailboxes() <em>Num Of Incoming Mailboxes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfIncomingMailboxes()
	 * @generated
	 * @ordered
	 */
	protected int numOfIncomingMailboxes = NUM_OF_INCOMING_MAILBOXES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSmallBufferSize() <em>Small Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmallBufferSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SMALL_BUFFER_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSmallBufferSize() <em>Small Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmallBufferSize()
	 * @generated
	 * @ordered
	 */
	protected int smallBufferSize = SMALL_BUFFER_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSmallBufferCount() <em>Small Buffer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmallBufferCount()
	 * @generated
	 * @ordered
	 */
	protected static final int SMALL_BUFFER_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSmallBufferCount() <em>Small Buffer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmallBufferCount()
	 * @generated
	 * @ordered
	 */
	protected int smallBufferCount = SMALL_BUFFER_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMediumBufferSize() <em>Medium Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediumBufferSize()
	 * @generated
	 * @ordered
	 */
	protected static final int MEDIUM_BUFFER_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMediumBufferSize() <em>Medium Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediumBufferSize()
	 * @generated
	 * @ordered
	 */
	protected int mediumBufferSize = MEDIUM_BUFFER_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMediumBufferCount() <em>Medium Buffer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediumBufferCount()
	 * @generated
	 * @ordered
	 */
	protected static final int MEDIUM_BUFFER_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMediumBufferCount() <em>Medium Buffer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediumBufferCount()
	 * @generated
	 * @ordered
	 */
	protected int mediumBufferCount = MEDIUM_BUFFER_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBigBufferSize() <em>Big Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBigBufferSize()
	 * @generated
	 * @ordered
	 */
	protected static final int BIG_BUFFER_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBigBufferSize() <em>Big Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBigBufferSize()
	 * @generated
	 * @ordered
	 */
	protected int bigBufferSize = BIG_BUFFER_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBigBufferCount() <em>Big Buffer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBigBufferCount()
	 * @generated
	 * @ordered
	 */
	protected static final int BIG_BUFFER_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBigBufferCount() <em>Big Buffer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBigBufferCount()
	 * @generated
	 * @ordered
	 */
	protected int bigBufferCount = BIG_BUFFER_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNodeAddr() <em>Node Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeAddr()
	 * @generated
	 * @ordered
	 */
	protected static final int NODE_ADDR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNodeAddr() <em>Node Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeAddr()
	 * @generated
	 * @ordered
	 */
	protected int nodeAddr = NODE_ADDR_EDEFAULT;

	/**
	 * The default value of the '{@link #getNodeAddressSymbol() <em>Node Address Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeAddressSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_ADDRESS_SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNodeAddressSymbol() <em>Node Address Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeAddressSymbol()
	 * @generated
	 * @ordered
	 */
	protected String nodeAddressSymbol = NODE_ADDRESS_SYMBOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncomingDestinationFilter() <em>Incoming Destination Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingDestinationFilter()
	 * @generated
	 * @ordered
	 */
	protected EList<CanMailboxAddressFilter> incomingDestinationFilter;

	/**
	 * The cached value of the '{@link #getSenderSourceFilter() <em>Sender Source Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenderSourceFilter()
	 * @generated
	 * @ordered
	 */
	protected EList<CanMailboxAddressFilter> senderSourceFilter;

	/**
	 * The cached value of the '{@link #getOutgoingMailboxSlot() <em>Outgoing Mailbox Slot</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingMailboxSlot()
	 * @generated
	 * @ordered
	 */
	protected EList<CanMailboxOutSlot> outgoingMailboxSlot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MsgBoxExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntrepidgatewayPackage.Literals.MSG_BOX_EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumOfOutgoingMailboxes() {
		return numOfOutgoingMailboxes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumOfOutgoingMailboxes(int newNumOfOutgoingMailboxes) {
		int oldNumOfOutgoingMailboxes = numOfOutgoingMailboxes;
		numOfOutgoingMailboxes = newNumOfOutgoingMailboxes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntrepidgatewayPackage.MSG_BOX_EXTENSION__NUM_OF_OUTGOING_MAILBOXES, oldNumOfOutgoingMailboxes, numOfOutgoingMailboxes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumOfIncomingMailboxes() {
		return numOfIncomingMailboxes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumOfIncomingMailboxes(int newNumOfIncomingMailboxes) {
		int oldNumOfIncomingMailboxes = numOfIncomingMailboxes;
		numOfIncomingMailboxes = newNumOfIncomingMailboxes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntrepidgatewayPackage.MSG_BOX_EXTENSION__NUM_OF_INCOMING_MAILBOXES, oldNumOfIncomingMailboxes, numOfIncomingMailboxes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSmallBufferSize() {
		return smallBufferSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmallBufferSize(int newSmallBufferSize) {
		int oldSmallBufferSize = smallBufferSize;
		smallBufferSize = newSmallBufferSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntrepidgatewayPackage.MSG_BOX_EXTENSION__SMALL_BUFFER_SIZE, oldSmallBufferSize, smallBufferSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSmallBufferCount() {
		return smallBufferCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmallBufferCount(int newSmallBufferCount) {
		int oldSmallBufferCount = smallBufferCount;
		smallBufferCount = newSmallBufferCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntrepidgatewayPackage.MSG_BOX_EXTENSION__SMALL_BUFFER_COUNT, oldSmallBufferCount, smallBufferCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMediumBufferSize() {
		return mediumBufferSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMediumBufferSize(int newMediumBufferSize) {
		int oldMediumBufferSize = mediumBufferSize;
		mediumBufferSize = newMediumBufferSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntrepidgatewayPackage.MSG_BOX_EXTENSION__MEDIUM_BUFFER_SIZE, oldMediumBufferSize, mediumBufferSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMediumBufferCount() {
		return mediumBufferCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMediumBufferCount(int newMediumBufferCount) {
		int oldMediumBufferCount = mediumBufferCount;
		mediumBufferCount = newMediumBufferCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntrepidgatewayPackage.MSG_BOX_EXTENSION__MEDIUM_BUFFER_COUNT, oldMediumBufferCount, mediumBufferCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBigBufferSize() {
		return bigBufferSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBigBufferSize(int newBigBufferSize) {
		int oldBigBufferSize = bigBufferSize;
		bigBufferSize = newBigBufferSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntrepidgatewayPackage.MSG_BOX_EXTENSION__BIG_BUFFER_SIZE, oldBigBufferSize, bigBufferSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBigBufferCount() {
		return bigBufferCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBigBufferCount(int newBigBufferCount) {
		int oldBigBufferCount = bigBufferCount;
		bigBufferCount = newBigBufferCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntrepidgatewayPackage.MSG_BOX_EXTENSION__BIG_BUFFER_COUNT, oldBigBufferCount, bigBufferCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNodeAddr() {
		return nodeAddr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeAddr(int newNodeAddr) {
		int oldNodeAddr = nodeAddr;
		nodeAddr = newNodeAddr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntrepidgatewayPackage.MSG_BOX_EXTENSION__NODE_ADDR, oldNodeAddr, nodeAddr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNodeAddressSymbol() {
		return nodeAddressSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeAddressSymbol(String newNodeAddressSymbol) {
		String oldNodeAddressSymbol = nodeAddressSymbol;
		nodeAddressSymbol = newNodeAddressSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntrepidgatewayPackage.MSG_BOX_EXTENSION__NODE_ADDRESS_SYMBOL, oldNodeAddressSymbol, nodeAddressSymbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CanMailboxAddressFilter> getIncomingDestinationFilter() {
		if (incomingDestinationFilter == null) {
			incomingDestinationFilter = new EObjectContainmentEList<CanMailboxAddressFilter>(CanMailboxAddressFilter.class, this, IntrepidgatewayPackage.MSG_BOX_EXTENSION__INCOMING_DESTINATION_FILTER);
		}
		return incomingDestinationFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CanMailboxAddressFilter> getSenderSourceFilter() {
		if (senderSourceFilter == null) {
			senderSourceFilter = new EObjectContainmentEList<CanMailboxAddressFilter>(CanMailboxAddressFilter.class, this, IntrepidgatewayPackage.MSG_BOX_EXTENSION__SENDER_SOURCE_FILTER);
		}
		return senderSourceFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CanMailboxOutSlot> getOutgoingMailboxSlot() {
		if (outgoingMailboxSlot == null) {
			outgoingMailboxSlot = new EObjectContainmentEList<CanMailboxOutSlot>(CanMailboxOutSlot.class, this, IntrepidgatewayPackage.MSG_BOX_EXTENSION__OUTGOING_MAILBOX_SLOT);
		}
		return outgoingMailboxSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__INCOMING_DESTINATION_FILTER:
				return ((InternalEList<?>)getIncomingDestinationFilter()).basicRemove(otherEnd, msgs);
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__SENDER_SOURCE_FILTER:
				return ((InternalEList<?>)getSenderSourceFilter()).basicRemove(otherEnd, msgs);
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__OUTGOING_MAILBOX_SLOT:
				return ((InternalEList<?>)getOutgoingMailboxSlot()).basicRemove(otherEnd, msgs);
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
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__NUM_OF_OUTGOING_MAILBOXES:
				return getNumOfOutgoingMailboxes();
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__NUM_OF_INCOMING_MAILBOXES:
				return getNumOfIncomingMailboxes();
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__SMALL_BUFFER_SIZE:
				return getSmallBufferSize();
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__SMALL_BUFFER_COUNT:
				return getSmallBufferCount();
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__MEDIUM_BUFFER_SIZE:
				return getMediumBufferSize();
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__MEDIUM_BUFFER_COUNT:
				return getMediumBufferCount();
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__BIG_BUFFER_SIZE:
				return getBigBufferSize();
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__BIG_BUFFER_COUNT:
				return getBigBufferCount();
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__NODE_ADDR:
				return getNodeAddr();
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__NODE_ADDRESS_SYMBOL:
				return getNodeAddressSymbol();
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__INCOMING_DESTINATION_FILTER:
				return getIncomingDestinationFilter();
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__SENDER_SOURCE_FILTER:
				return getSenderSourceFilter();
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__OUTGOING_MAILBOX_SLOT:
				return getOutgoingMailboxSlot();
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
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__NUM_OF_OUTGOING_MAILBOXES:
				setNumOfOutgoingMailboxes((Integer)newValue);
				return;
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__NUM_OF_INCOMING_MAILBOXES:
				setNumOfIncomingMailboxes((Integer)newValue);
				return;
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__SMALL_BUFFER_SIZE:
				setSmallBufferSize((Integer)newValue);
				return;
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__SMALL_BUFFER_COUNT:
				setSmallBufferCount((Integer)newValue);
				return;
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__MEDIUM_BUFFER_SIZE:
				setMediumBufferSize((Integer)newValue);
				return;
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__MEDIUM_BUFFER_COUNT:
				setMediumBufferCount((Integer)newValue);
				return;
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__BIG_BUFFER_SIZE:
				setBigBufferSize((Integer)newValue);
				return;
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__BIG_BUFFER_COUNT:
				setBigBufferCount((Integer)newValue);
				return;
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__NODE_ADDR:
				setNodeAddr((Integer)newValue);
				return;
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__NODE_ADDRESS_SYMBOL:
				setNodeAddressSymbol((String)newValue);
				return;
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__INCOMING_DESTINATION_FILTER:
				getIncomingDestinationFilter().clear();
				getIncomingDestinationFilter().addAll((Collection<? extends CanMailboxAddressFilter>)newValue);
				return;
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__SENDER_SOURCE_FILTER:
				getSenderSourceFilter().clear();
				getSenderSourceFilter().addAll((Collection<? extends CanMailboxAddressFilter>)newValue);
				return;
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__OUTGOING_MAILBOX_SLOT:
				getOutgoingMailboxSlot().clear();
				getOutgoingMailboxSlot().addAll((Collection<? extends CanMailboxOutSlot>)newValue);
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
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__NUM_OF_OUTGOING_MAILBOXES:
				setNumOfOutgoingMailboxes(NUM_OF_OUTGOING_MAILBOXES_EDEFAULT);
				return;
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__NUM_OF_INCOMING_MAILBOXES:
				setNumOfIncomingMailboxes(NUM_OF_INCOMING_MAILBOXES_EDEFAULT);
				return;
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__SMALL_BUFFER_SIZE:
				setSmallBufferSize(SMALL_BUFFER_SIZE_EDEFAULT);
				return;
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__SMALL_BUFFER_COUNT:
				setSmallBufferCount(SMALL_BUFFER_COUNT_EDEFAULT);
				return;
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__MEDIUM_BUFFER_SIZE:
				setMediumBufferSize(MEDIUM_BUFFER_SIZE_EDEFAULT);
				return;
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__MEDIUM_BUFFER_COUNT:
				setMediumBufferCount(MEDIUM_BUFFER_COUNT_EDEFAULT);
				return;
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__BIG_BUFFER_SIZE:
				setBigBufferSize(BIG_BUFFER_SIZE_EDEFAULT);
				return;
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__BIG_BUFFER_COUNT:
				setBigBufferCount(BIG_BUFFER_COUNT_EDEFAULT);
				return;
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__NODE_ADDR:
				setNodeAddr(NODE_ADDR_EDEFAULT);
				return;
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__NODE_ADDRESS_SYMBOL:
				setNodeAddressSymbol(NODE_ADDRESS_SYMBOL_EDEFAULT);
				return;
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__INCOMING_DESTINATION_FILTER:
				getIncomingDestinationFilter().clear();
				return;
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__SENDER_SOURCE_FILTER:
				getSenderSourceFilter().clear();
				return;
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__OUTGOING_MAILBOX_SLOT:
				getOutgoingMailboxSlot().clear();
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
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__NUM_OF_OUTGOING_MAILBOXES:
				return numOfOutgoingMailboxes != NUM_OF_OUTGOING_MAILBOXES_EDEFAULT;
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__NUM_OF_INCOMING_MAILBOXES:
				return numOfIncomingMailboxes != NUM_OF_INCOMING_MAILBOXES_EDEFAULT;
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__SMALL_BUFFER_SIZE:
				return smallBufferSize != SMALL_BUFFER_SIZE_EDEFAULT;
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__SMALL_BUFFER_COUNT:
				return smallBufferCount != SMALL_BUFFER_COUNT_EDEFAULT;
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__MEDIUM_BUFFER_SIZE:
				return mediumBufferSize != MEDIUM_BUFFER_SIZE_EDEFAULT;
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__MEDIUM_BUFFER_COUNT:
				return mediumBufferCount != MEDIUM_BUFFER_COUNT_EDEFAULT;
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__BIG_BUFFER_SIZE:
				return bigBufferSize != BIG_BUFFER_SIZE_EDEFAULT;
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__BIG_BUFFER_COUNT:
				return bigBufferCount != BIG_BUFFER_COUNT_EDEFAULT;
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__NODE_ADDR:
				return nodeAddr != NODE_ADDR_EDEFAULT;
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__NODE_ADDRESS_SYMBOL:
				return NODE_ADDRESS_SYMBOL_EDEFAULT == null ? nodeAddressSymbol != null : !NODE_ADDRESS_SYMBOL_EDEFAULT.equals(nodeAddressSymbol);
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__INCOMING_DESTINATION_FILTER:
				return incomingDestinationFilter != null && !incomingDestinationFilter.isEmpty();
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__SENDER_SOURCE_FILTER:
				return senderSourceFilter != null && !senderSourceFilter.isEmpty();
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION__OUTGOING_MAILBOX_SLOT:
				return outgoingMailboxSlot != null && !outgoingMailboxSlot.isEmpty();
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
		result.append(" (numOfOutgoingMailboxes: ");
		result.append(numOfOutgoingMailboxes);
		result.append(", numOfIncomingMailboxes: ");
		result.append(numOfIncomingMailboxes);
		result.append(", smallBufferSize: ");
		result.append(smallBufferSize);
		result.append(", smallBufferCount: ");
		result.append(smallBufferCount);
		result.append(", mediumBufferSize: ");
		result.append(mediumBufferSize);
		result.append(", mediumBufferCount: ");
		result.append(mediumBufferCount);
		result.append(", bigBufferSize: ");
		result.append(bigBufferSize);
		result.append(", bigBufferCount: ");
		result.append(bigBufferCount);
		result.append(", nodeAddr: ");
		result.append(nodeAddr);
		result.append(", nodeAddressSymbol: ");
		result.append(nodeAddressSymbol);
		result.append(')');
		return result.toString();
	}

} //MsgBoxExtensionImpl
