/**
 */
package targets.configdesk.dSpaceArinc825;

import org.eclipse.emf.common.util.EList;

import targets.configdesk.SuperConfigurationDeskIOHardwareType;

import ucof.common.enums.booleanType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>A825 Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.configdesk.dSpaceArinc825.A825Configuration#getChannelName <em>Channel Name</em>}</li>
 *   <li>{@link targets.configdesk.dSpaceArinc825.A825Configuration#getTerminated <em>Terminated</em>}</li>
 *   <li>{@link targets.configdesk.dSpaceArinc825.A825Configuration#getAssignedChannelSet <em>Assigned Channel Set</em>}</li>
 *   <li>{@link targets.configdesk.dSpaceArinc825.A825Configuration#getCanChannel <em>Can Channel</em>}</li>
 *   <li>{@link targets.configdesk.dSpaceArinc825.A825Configuration#getModelAccess <em>Model Access</em>}</li>
 *   <li>{@link targets.configdesk.dSpaceArinc825.A825Configuration#getModelPortBlockStructure <em>Model Port Block Structure</em>}</li>
 *   <li>{@link targets.configdesk.dSpaceArinc825.A825Configuration#getECU <em>ECU</em>}</li>
 *   <li>{@link targets.configdesk.dSpaceArinc825.A825Configuration#getStatusExtension <em>Status Extension</em>}</li>
 * </ul>
 *
 * @see targets.configdesk.dSpaceArinc825.DSpaceArinc825Package#getA825Configuration()
 * @model
 * @generated
 */
public interface A825Configuration extends SuperConfigurationDeskIOHardwareType {
	/**
	 * Returns the value of the '<em><b>Channel Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel Name</em>' attribute.
	 * @see #setChannelName(String)
	 * @see targets.configdesk.dSpaceArinc825.DSpaceArinc825Package#getA825Configuration_ChannelName()
	 * @model
	 * @generated
	 */
	String getChannelName();

	/**
	 * Sets the value of the '{@link targets.configdesk.dSpaceArinc825.A825Configuration#getChannelName <em>Channel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Name</em>' attribute.
	 * @see #getChannelName()
	 * @generated
	 */
	void setChannelName(String value);

	/**
	 * Returns the value of the '<em><b>Terminated</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.booleanType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminated</em>' attribute.
	 * @see ucof.common.enums.booleanType
	 * @see #setTerminated(booleanType)
	 * @see targets.configdesk.dSpaceArinc825.DSpaceArinc825Package#getA825Configuration_Terminated()
	 * @model
	 * @generated
	 */
	booleanType getTerminated();

	/**
	 * Sets the value of the '{@link targets.configdesk.dSpaceArinc825.A825Configuration#getTerminated <em>Terminated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminated</em>' attribute.
	 * @see ucof.common.enums.booleanType
	 * @see #getTerminated()
	 * @generated
	 */
	void setTerminated(booleanType value);

	/**
	 * Returns the value of the '<em><b>Assigned Channel Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Channel Set</em>' attribute.
	 * @see #setAssignedChannelSet(String)
	 * @see targets.configdesk.dSpaceArinc825.DSpaceArinc825Package#getA825Configuration_AssignedChannelSet()
	 * @model
	 * @generated
	 */
	String getAssignedChannelSet();

	/**
	 * Sets the value of the '{@link targets.configdesk.dSpaceArinc825.A825Configuration#getAssignedChannelSet <em>Assigned Channel Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Channel Set</em>' attribute.
	 * @see #getAssignedChannelSet()
	 * @generated
	 */
	void setAssignedChannelSet(String value);

	/**
	 * Returns the value of the '<em><b>Can Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Channel</em>' attribute.
	 * @see #setCanChannel(String)
	 * @see targets.configdesk.dSpaceArinc825.DSpaceArinc825Package#getA825Configuration_CanChannel()
	 * @model
	 * @generated
	 */
	String getCanChannel();

	/**
	 * Sets the value of the '{@link targets.configdesk.dSpaceArinc825.A825Configuration#getCanChannel <em>Can Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Channel</em>' attribute.
	 * @see #getCanChannel()
	 * @generated
	 */
	void setCanChannel(String value);

	/**
	 * Returns the value of the '<em><b>Model Access</b></em>' attribute.
	 * The literals are from the enumeration {@link targets.configdesk.dSpaceArinc825.ModelAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Access</em>' attribute.
	 * @see targets.configdesk.dSpaceArinc825.ModelAccess
	 * @see #setModelAccess(ModelAccess)
	 * @see targets.configdesk.dSpaceArinc825.DSpaceArinc825Package#getA825Configuration_ModelAccess()
	 * @model
	 * @generated
	 */
	ModelAccess getModelAccess();

	/**
	 * Sets the value of the '{@link targets.configdesk.dSpaceArinc825.A825Configuration#getModelAccess <em>Model Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Access</em>' attribute.
	 * @see targets.configdesk.dSpaceArinc825.ModelAccess
	 * @see #getModelAccess()
	 * @generated
	 */
	void setModelAccess(ModelAccess value);

	/**
	 * Returns the value of the '<em><b>Model Port Block Structure</b></em>' attribute.
	 * The literals are from the enumeration {@link targets.configdesk.dSpaceArinc825.ModelPortBlockStructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Port Block Structure</em>' attribute.
	 * @see targets.configdesk.dSpaceArinc825.ModelPortBlockStructure
	 * @see #setModelPortBlockStructure(ModelPortBlockStructure)
	 * @see targets.configdesk.dSpaceArinc825.DSpaceArinc825Package#getA825Configuration_ModelPortBlockStructure()
	 * @model
	 * @generated
	 */
	ModelPortBlockStructure getModelPortBlockStructure();

	/**
	 * Sets the value of the '{@link targets.configdesk.dSpaceArinc825.A825Configuration#getModelPortBlockStructure <em>Model Port Block Structure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Port Block Structure</em>' attribute.
	 * @see targets.configdesk.dSpaceArinc825.ModelPortBlockStructure
	 * @see #getModelPortBlockStructure()
	 * @generated
	 */
	void setModelPortBlockStructure(ModelPortBlockStructure value);

	/**
	 * Returns the value of the '<em><b>ECU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ECU</em>' attribute.
	 * @see #setECU(String)
	 * @see targets.configdesk.dSpaceArinc825.DSpaceArinc825Package#getA825Configuration_ECU()
	 * @model
	 * @generated
	 */
	String getECU();

	/**
	 * Sets the value of the '{@link targets.configdesk.dSpaceArinc825.A825Configuration#getECU <em>ECU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ECU</em>' attribute.
	 * @see #getECU()
	 * @generated
	 */
	void setECU(String value);

	/**
	 * Returns the value of the '<em><b>Status Extension</b></em>' containment reference list.
	 * The list contents are of type {@link targets.configdesk.dSpaceArinc825.SuperConfigurationDeskA825StatusExtensionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Extension</em>' containment reference list.
	 * @see targets.configdesk.dSpaceArinc825.DSpaceArinc825Package#getA825Configuration_StatusExtension()
	 * @model containment="true"
	 * @generated
	 */
	EList<SuperConfigurationDeskA825StatusExtensionType> getStatusExtension();

} // A825Configuration
