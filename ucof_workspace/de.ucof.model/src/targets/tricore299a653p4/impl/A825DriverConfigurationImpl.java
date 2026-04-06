/**
 */
package targets.tricore299a653p4.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import targets.tricore299a653p4.A825DriverConfiguration;
import targets.tricore299a653p4.Tricore299a653p4Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>A825 Driver Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.tricore299a653p4.impl.A825DriverConfigurationImpl#getFirstMsgBox <em>First Msg Box</em>}</li>
 *   <li>{@link targets.tricore299a653p4.impl.A825DriverConfigurationImpl#getNode <em>Node</em>}</li>
 *   <li>{@link targets.tricore299a653p4.impl.A825DriverConfigurationImpl#getRJW <em>RJW</em>}</li>
 *   <li>{@link targets.tricore299a653p4.impl.A825DriverConfigurationImpl#getRXSEL <em>RXSEL</em>}</li>
 * </ul>
 *
 * @generated
 */
public class A825DriverConfigurationImpl extends SuperTriCore299IOHardwareTypeImpl implements A825DriverConfiguration {
	/**
	 * The default value of the '{@link #getFirstMsgBox() <em>First Msg Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstMsgBox()
	 * @generated
	 * @ordered
	 */
	protected static final int FIRST_MSG_BOX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFirstMsgBox() <em>First Msg Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstMsgBox()
	 * @generated
	 * @ordered
	 */
	protected int firstMsgBox = FIRST_MSG_BOX_EDEFAULT;

	/**
	 * This is true if the First Msg Box attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean firstMsgBoxESet;

	/**
	 * The default value of the '{@link #getNode() <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected static final int NODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected int node = NODE_EDEFAULT;

	/**
	 * This is true if the Node attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nodeESet;

	/**
	 * The default value of the '{@link #getRJW() <em>RJW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRJW()
	 * @generated
	 * @ordered
	 */
	protected static final int RJW_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRJW() <em>RJW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRJW()
	 * @generated
	 * @ordered
	 */
	protected int rJW = RJW_EDEFAULT;

	/**
	 * This is true if the RJW attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rJWESet;

	/**
	 * The default value of the '{@link #getRXSEL() <em>RXSEL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXSEL()
	 * @generated
	 * @ordered
	 */
	protected static final int RXSEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRXSEL() <em>RXSEL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXSEL()
	 * @generated
	 * @ordered
	 */
	protected int rXSEL = RXSEL_EDEFAULT;

	/**
	 * This is true if the RXSEL attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rXSELESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected A825DriverConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tricore299a653p4Package.Literals.A825_DRIVER_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFirstMsgBox() {
		return firstMsgBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstMsgBox(int newFirstMsgBox) {
		int oldFirstMsgBox = firstMsgBox;
		firstMsgBox = newFirstMsgBox;
		boolean oldFirstMsgBoxESet = firstMsgBoxESet;
		firstMsgBoxESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tricore299a653p4Package.A825_DRIVER_CONFIGURATION__FIRST_MSG_BOX, oldFirstMsgBox, firstMsgBox, !oldFirstMsgBoxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFirstMsgBox() {
		int oldFirstMsgBox = firstMsgBox;
		boolean oldFirstMsgBoxESet = firstMsgBoxESet;
		firstMsgBox = FIRST_MSG_BOX_EDEFAULT;
		firstMsgBoxESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Tricore299a653p4Package.A825_DRIVER_CONFIGURATION__FIRST_MSG_BOX, oldFirstMsgBox, FIRST_MSG_BOX_EDEFAULT, oldFirstMsgBoxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFirstMsgBox() {
		return firstMsgBoxESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNode() {
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(int newNode) {
		int oldNode = node;
		node = newNode;
		boolean oldNodeESet = nodeESet;
		nodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tricore299a653p4Package.A825_DRIVER_CONFIGURATION__NODE, oldNode, node, !oldNodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNode() {
		int oldNode = node;
		boolean oldNodeESet = nodeESet;
		node = NODE_EDEFAULT;
		nodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Tricore299a653p4Package.A825_DRIVER_CONFIGURATION__NODE, oldNode, NODE_EDEFAULT, oldNodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNode() {
		return nodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRJW() {
		return rJW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRJW(int newRJW) {
		int oldRJW = rJW;
		rJW = newRJW;
		boolean oldRJWESet = rJWESet;
		rJWESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tricore299a653p4Package.A825_DRIVER_CONFIGURATION__RJW, oldRJW, rJW, !oldRJWESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRJW() {
		int oldRJW = rJW;
		boolean oldRJWESet = rJWESet;
		rJW = RJW_EDEFAULT;
		rJWESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Tricore299a653p4Package.A825_DRIVER_CONFIGURATION__RJW, oldRJW, RJW_EDEFAULT, oldRJWESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRJW() {
		return rJWESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRXSEL() {
		return rXSEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXSEL(int newRXSEL) {
		int oldRXSEL = rXSEL;
		rXSEL = newRXSEL;
		boolean oldRXSELESet = rXSELESet;
		rXSELESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tricore299a653p4Package.A825_DRIVER_CONFIGURATION__RXSEL, oldRXSEL, rXSEL, !oldRXSELESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRXSEL() {
		int oldRXSEL = rXSEL;
		boolean oldRXSELESet = rXSELESet;
		rXSEL = RXSEL_EDEFAULT;
		rXSELESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Tricore299a653p4Package.A825_DRIVER_CONFIGURATION__RXSEL, oldRXSEL, RXSEL_EDEFAULT, oldRXSELESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRXSEL() {
		return rXSELESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Tricore299a653p4Package.A825_DRIVER_CONFIGURATION__FIRST_MSG_BOX:
				return getFirstMsgBox();
			case Tricore299a653p4Package.A825_DRIVER_CONFIGURATION__NODE:
				return getNode();
			case Tricore299a653p4Package.A825_DRIVER_CONFIGURATION__RJW:
				return getRJW();
			case Tricore299a653p4Package.A825_DRIVER_CONFIGURATION__RXSEL:
				return getRXSEL();
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
			case Tricore299a653p4Package.A825_DRIVER_CONFIGURATION__FIRST_MSG_BOX:
				setFirstMsgBox((Integer)newValue);
				return;
			case Tricore299a653p4Package.A825_DRIVER_CONFIGURATION__NODE:
				setNode((Integer)newValue);
				return;
			case Tricore299a653p4Package.A825_DRIVER_CONFIGURATION__RJW:
				setRJW((Integer)newValue);
				return;
			case Tricore299a653p4Package.A825_DRIVER_CONFIGURATION__RXSEL:
				setRXSEL((Integer)newValue);
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
			case Tricore299a653p4Package.A825_DRIVER_CONFIGURATION__FIRST_MSG_BOX:
				unsetFirstMsgBox();
				return;
			case Tricore299a653p4Package.A825_DRIVER_CONFIGURATION__NODE:
				unsetNode();
				return;
			case Tricore299a653p4Package.A825_DRIVER_CONFIGURATION__RJW:
				unsetRJW();
				return;
			case Tricore299a653p4Package.A825_DRIVER_CONFIGURATION__RXSEL:
				unsetRXSEL();
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
			case Tricore299a653p4Package.A825_DRIVER_CONFIGURATION__FIRST_MSG_BOX:
				return isSetFirstMsgBox();
			case Tricore299a653p4Package.A825_DRIVER_CONFIGURATION__NODE:
				return isSetNode();
			case Tricore299a653p4Package.A825_DRIVER_CONFIGURATION__RJW:
				return isSetRJW();
			case Tricore299a653p4Package.A825_DRIVER_CONFIGURATION__RXSEL:
				return isSetRXSEL();
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
		result.append(" (firstMsgBox: ");
		if (firstMsgBoxESet) result.append(firstMsgBox); else result.append("<unset>");
		result.append(", node: ");
		if (nodeESet) result.append(node); else result.append("<unset>");
		result.append(", rJW: ");
		if (rJWESet) result.append(rJW); else result.append("<unset>");
		result.append(", rXSEL: ");
		if (rXSELESet) result.append(rXSEL); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //A825DriverConfigurationImpl
