/**
 */
package targets;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.HardwareInformation#getHardwareTopologyName <em>Hardware Topology Name</em>}</li>
 *   <li>{@link targets.HardwareInformation#getNameOfHardwareSystem <em>Name Of Hardware System</em>}</li>
 *   <li>{@link targets.HardwareInformation#getIPAddressOfHardwareSystem <em>IP Address Of Hardware System</em>}</li>
 * </ul>
 *
 * @see targets.TargetsPackage#getHardwareInformation()
 * @model abstract="true"
 * @generated
 */
public interface HardwareInformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Hardware Topology Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Topology Name</em>' attribute.
	 * @see #setHardwareTopologyName(String)
	 * @see targets.TargetsPackage#getHardwareInformation_HardwareTopologyName()
	 * @model
	 * @generated
	 */
	String getHardwareTopologyName();

	/**
	 * Sets the value of the '{@link targets.HardwareInformation#getHardwareTopologyName <em>Hardware Topology Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware Topology Name</em>' attribute.
	 * @see #getHardwareTopologyName()
	 * @generated
	 */
	void setHardwareTopologyName(String value);

	/**
	 * Returns the value of the '<em><b>Name Of Hardware System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Of Hardware System</em>' attribute.
	 * @see #setNameOfHardwareSystem(String)
	 * @see targets.TargetsPackage#getHardwareInformation_NameOfHardwareSystem()
	 * @model
	 * @generated
	 */
	String getNameOfHardwareSystem();

	/**
	 * Sets the value of the '{@link targets.HardwareInformation#getNameOfHardwareSystem <em>Name Of Hardware System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Of Hardware System</em>' attribute.
	 * @see #getNameOfHardwareSystem()
	 * @generated
	 */
	void setNameOfHardwareSystem(String value);

	/**
	 * Returns the value of the '<em><b>IP Address Of Hardware System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IP Address Of Hardware System</em>' attribute.
	 * @see #setIPAddressOfHardwareSystem(String)
	 * @see targets.TargetsPackage#getHardwareInformation_IPAddressOfHardwareSystem()
	 * @model
	 * @generated
	 */
	String getIPAddressOfHardwareSystem();

	/**
	 * Sets the value of the '{@link targets.HardwareInformation#getIPAddressOfHardwareSystem <em>IP Address Of Hardware System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IP Address Of Hardware System</em>' attribute.
	 * @see #getIPAddressOfHardwareSystem()
	 * @generated
	 */
	void setIPAddressOfHardwareSystem(String value);

} // HardwareInformation
