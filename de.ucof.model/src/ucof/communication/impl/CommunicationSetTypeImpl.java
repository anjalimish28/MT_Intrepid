/**
 */
package ucof.communication.impl;

import org.eclipse.emf.ecore.EClass;

import ucof.common.etypes.impl.SuperSetTypeImpl;

import ucof.communication.CommunicationPackage;
import ucof.communication.CommunicationSetType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class CommunicationSetTypeImpl extends SuperSetTypeImpl implements CommunicationSetType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationSetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationPackage.Literals.COMMUNICATION_SET_TYPE;
	}

} //CommunicationSetTypeImpl
