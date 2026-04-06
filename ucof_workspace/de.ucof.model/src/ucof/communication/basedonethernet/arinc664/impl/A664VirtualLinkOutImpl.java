/**
 */
package ucof.communication.basedonethernet.arinc664.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.communication.basedonethernet.arinc664.A664VirtualLinkOut;
import ucof.communication.basedonethernet.arinc664.Arinc664Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>A664 Virtual Link Out</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.impl.A664VirtualLinkOutImpl#getBAG <em>BAG</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.impl.A664VirtualLinkOutImpl#getMaxFrameSize <em>Max Frame Size</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.impl.A664VirtualLinkOutImpl#getOverSampling <em>Over Sampling</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.impl.A664VirtualLinkOutImpl#getPhase <em>Phase</em>}</li>
 * </ul>
 *
 * @generated
 */
public class A664VirtualLinkOutImpl extends A664VirtualLinkSuperImpl implements A664VirtualLinkOut {
	/**
	 * The default value of the '{@link #getBAG() <em>BAG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBAG()
	 * @generated
	 * @ordered
	 */
	protected static final String BAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBAG() <em>BAG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBAG()
	 * @generated
	 * @ordered
	 */
	protected String bAG = BAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxFrameSize() <em>Max Frame Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxFrameSize()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_FRAME_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxFrameSize() <em>Max Frame Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxFrameSize()
	 * @generated
	 * @ordered
	 */
	protected String maxFrameSize = MAX_FRAME_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOverSampling() <em>Over Sampling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverSampling()
	 * @generated
	 * @ordered
	 */
	protected static final String OVER_SAMPLING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOverSampling() <em>Over Sampling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverSampling()
	 * @generated
	 * @ordered
	 */
	protected String overSampling = OVER_SAMPLING_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhase() <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected static final String PHASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhase() <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected String phase = PHASE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected A664VirtualLinkOutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Arinc664Package.Literals.A664_VIRTUAL_LINK_OUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBAG() {
		return bAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBAG(String newBAG) {
		String oldBAG = bAG;
		bAG = newBAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Arinc664Package.A664_VIRTUAL_LINK_OUT__BAG, oldBAG, bAG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxFrameSize() {
		return maxFrameSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxFrameSize(String newMaxFrameSize) {
		String oldMaxFrameSize = maxFrameSize;
		maxFrameSize = newMaxFrameSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Arinc664Package.A664_VIRTUAL_LINK_OUT__MAX_FRAME_SIZE, oldMaxFrameSize, maxFrameSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOverSampling() {
		return overSampling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverSampling(String newOverSampling) {
		String oldOverSampling = overSampling;
		overSampling = newOverSampling;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Arinc664Package.A664_VIRTUAL_LINK_OUT__OVER_SAMPLING, oldOverSampling, overSampling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhase() {
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase(String newPhase) {
		String oldPhase = phase;
		phase = newPhase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Arinc664Package.A664_VIRTUAL_LINK_OUT__PHASE, oldPhase, phase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Arinc664Package.A664_VIRTUAL_LINK_OUT__BAG:
				return getBAG();
			case Arinc664Package.A664_VIRTUAL_LINK_OUT__MAX_FRAME_SIZE:
				return getMaxFrameSize();
			case Arinc664Package.A664_VIRTUAL_LINK_OUT__OVER_SAMPLING:
				return getOverSampling();
			case Arinc664Package.A664_VIRTUAL_LINK_OUT__PHASE:
				return getPhase();
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
			case Arinc664Package.A664_VIRTUAL_LINK_OUT__BAG:
				setBAG((String)newValue);
				return;
			case Arinc664Package.A664_VIRTUAL_LINK_OUT__MAX_FRAME_SIZE:
				setMaxFrameSize((String)newValue);
				return;
			case Arinc664Package.A664_VIRTUAL_LINK_OUT__OVER_SAMPLING:
				setOverSampling((String)newValue);
				return;
			case Arinc664Package.A664_VIRTUAL_LINK_OUT__PHASE:
				setPhase((String)newValue);
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
			case Arinc664Package.A664_VIRTUAL_LINK_OUT__BAG:
				setBAG(BAG_EDEFAULT);
				return;
			case Arinc664Package.A664_VIRTUAL_LINK_OUT__MAX_FRAME_SIZE:
				setMaxFrameSize(MAX_FRAME_SIZE_EDEFAULT);
				return;
			case Arinc664Package.A664_VIRTUAL_LINK_OUT__OVER_SAMPLING:
				setOverSampling(OVER_SAMPLING_EDEFAULT);
				return;
			case Arinc664Package.A664_VIRTUAL_LINK_OUT__PHASE:
				setPhase(PHASE_EDEFAULT);
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
			case Arinc664Package.A664_VIRTUAL_LINK_OUT__BAG:
				return BAG_EDEFAULT == null ? bAG != null : !BAG_EDEFAULT.equals(bAG);
			case Arinc664Package.A664_VIRTUAL_LINK_OUT__MAX_FRAME_SIZE:
				return MAX_FRAME_SIZE_EDEFAULT == null ? maxFrameSize != null : !MAX_FRAME_SIZE_EDEFAULT.equals(maxFrameSize);
			case Arinc664Package.A664_VIRTUAL_LINK_OUT__OVER_SAMPLING:
				return OVER_SAMPLING_EDEFAULT == null ? overSampling != null : !OVER_SAMPLING_EDEFAULT.equals(overSampling);
			case Arinc664Package.A664_VIRTUAL_LINK_OUT__PHASE:
				return PHASE_EDEFAULT == null ? phase != null : !PHASE_EDEFAULT.equals(phase);
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
		result.append(" (bAG: ");
		result.append(bAG);
		result.append(", maxFrameSize: ");
		result.append(maxFrameSize);
		result.append(", overSampling: ");
		result.append(overSampling);
		result.append(", phase: ");
		result.append(phase);
		result.append(')');
		return result.toString();
	}

} //A664VirtualLinkOutImpl
