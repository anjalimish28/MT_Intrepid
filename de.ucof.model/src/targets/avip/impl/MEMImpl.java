/**
 */
package targets.avip.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import targets.avip.AvipPackage;
import targets.avip.MEM;
import targets.avip.MEMPortIDExtension;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MEM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.avip.impl.MEMImpl#getMemPortIDExtension <em>Mem Port ID Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MEMImpl extends SuperAVDPortTypeImpl implements MEM {
	/**
	 * The cached value of the '{@link #getMemPortIDExtension() <em>Mem Port ID Extension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemPortIDExtension()
	 * @generated
	 * @ordered
	 */
	protected EList<MEMPortIDExtension> memPortIDExtension;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MEMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AvipPackage.Literals.MEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MEMPortIDExtension> getMemPortIDExtension() {
		if (memPortIDExtension == null) {
			memPortIDExtension = new EObjectContainmentEList<MEMPortIDExtension>(MEMPortIDExtension.class, this, AvipPackage.MEM__MEM_PORT_ID_EXTENSION);
		}
		return memPortIDExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AvipPackage.MEM__MEM_PORT_ID_EXTENSION:
				return ((InternalEList<?>)getMemPortIDExtension()).basicRemove(otherEnd, msgs);
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
			case AvipPackage.MEM__MEM_PORT_ID_EXTENSION:
				return getMemPortIDExtension();
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
			case AvipPackage.MEM__MEM_PORT_ID_EXTENSION:
				getMemPortIDExtension().clear();
				getMemPortIDExtension().addAll((Collection<? extends MEMPortIDExtension>)newValue);
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
			case AvipPackage.MEM__MEM_PORT_ID_EXTENSION:
				getMemPortIDExtension().clear();
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
			case AvipPackage.MEM__MEM_PORT_ID_EXTENSION:
				return memPortIDExtension != null && !memPortIDExtension.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MEMImpl
