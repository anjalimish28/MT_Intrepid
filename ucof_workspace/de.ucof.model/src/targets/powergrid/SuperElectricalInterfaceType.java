/**
 */
package targets.powergrid;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super Electrical Interface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.powergrid.SuperElectricalInterfaceType#getMinVoltage <em>Min Voltage</em>}</li>
 *   <li>{@link targets.powergrid.SuperElectricalInterfaceType#getMaxVoltage <em>Max Voltage</em>}</li>
 *   <li>{@link targets.powergrid.SuperElectricalInterfaceType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see targets.powergrid.PowergridPackage#getSuperElectricalInterfaceType()
 * @model abstract="true"
 * @generated
 */
public interface SuperElectricalInterfaceType extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Min Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Voltage</em>' attribute.
	 * @see #setMinVoltage(double)
	 * @see targets.powergrid.PowergridPackage#getSuperElectricalInterfaceType_MinVoltage()
	 * @model
	 * @generated
	 */
	double getMinVoltage();

	/**
	 * Sets the value of the '{@link targets.powergrid.SuperElectricalInterfaceType#getMinVoltage <em>Min Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Voltage</em>' attribute.
	 * @see #getMinVoltage()
	 * @generated
	 */
	void setMinVoltage(double value);

	/**
	 * Returns the value of the '<em><b>Max Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Voltage</em>' attribute.
	 * @see #setMaxVoltage(double)
	 * @see targets.powergrid.PowergridPackage#getSuperElectricalInterfaceType_MaxVoltage()
	 * @model
	 * @generated
	 */
	double getMaxVoltage();

	/**
	 * Sets the value of the '{@link targets.powergrid.SuperElectricalInterfaceType#getMaxVoltage <em>Max Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Voltage</em>' attribute.
	 * @see #getMaxVoltage()
	 * @generated
	 */
	void setMaxVoltage(double value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link targets.powergrid.interfaceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see targets.powergrid.interfaceType
	 * @see #setType(interfaceType)
	 * @see targets.powergrid.PowergridPackage#getSuperElectricalInterfaceType_Type()
	 * @model
	 * @generated
	 */
	interfaceType getType();

	/**
	 * Sets the value of the '{@link targets.powergrid.SuperElectricalInterfaceType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see targets.powergrid.interfaceType
	 * @see #getType()
	 * @generated
	 */
	void setType(interfaceType value);

} // SuperElectricalInterfaceType
