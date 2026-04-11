/**
 */
package targets.powergrid;

import ucof.common.enums.booleanType;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super Electrical Grid Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.powergrid.SuperElectricalGridType#getDefinedVoltage <em>Defined Voltage</em>}</li>
 *   <li>{@link targets.powergrid.SuperElectricalGridType#getNominalVoltage <em>Nominal Voltage</em>}</li>
 * </ul>
 *
 * @see targets.powergrid.PowergridPackage#getSuperElectricalGridType()
 * @model abstract="true"
 * @generated
 */
public interface SuperElectricalGridType extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Defined Voltage</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.booleanType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defined Voltage</em>' attribute.
	 * @see ucof.common.enums.booleanType
	 * @see #setDefinedVoltage(booleanType)
	 * @see targets.powergrid.PowergridPackage#getSuperElectricalGridType_DefinedVoltage()
	 * @model
	 * @generated
	 */
	booleanType getDefinedVoltage();

	/**
	 * Sets the value of the '{@link targets.powergrid.SuperElectricalGridType#getDefinedVoltage <em>Defined Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defined Voltage</em>' attribute.
	 * @see ucof.common.enums.booleanType
	 * @see #getDefinedVoltage()
	 * @generated
	 */
	void setDefinedVoltage(booleanType value);

	/**
	 * Returns the value of the '<em><b>Nominal Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Voltage</em>' attribute.
	 * @see #setNominalVoltage(double)
	 * @see targets.powergrid.PowergridPackage#getSuperElectricalGridType_NominalVoltage()
	 * @model
	 * @generated
	 */
	double getNominalVoltage();

	/**
	 * Sets the value of the '{@link targets.powergrid.SuperElectricalGridType#getNominalVoltage <em>Nominal Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Voltage</em>' attribute.
	 * @see #getNominalVoltage()
	 * @generated
	 */
	void setNominalVoltage(double value);

} // SuperElectricalGridType
