/**
 */
package ucof.communication.configECIC.packageStrategyTypes;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frames</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.Frames#getFrame <em>Frame</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.Frames#getLLC <em>LLC</em>}</li>
 * </ul>
 *
 * @see ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage#getFrames()
 * @model
 * @generated
 */
public interface Frames extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame</em>' containment reference.
	 * @see #setFrame(Frame)
	 * @see ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage#getFrames_Frame()
	 * @model containment="true"
	 * @generated
	 */
	Frame getFrame();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.packageStrategyTypes.Frames#getFrame <em>Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame</em>' containment reference.
	 * @see #getFrame()
	 * @generated
	 */
	void setFrame(Frame value);

	/**
	 * Returns the value of the '<em><b>LLC</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LLC</em>' containment reference.
	 * @see #setLLC(LLC)
	 * @see ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage#getFrames_LLC()
	 * @model containment="true"
	 * @generated
	 */
	LLC getLLC();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.packageStrategyTypes.Frames#getLLC <em>LLC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LLC</em>' containment reference.
	 * @see #getLLC()
	 * @generated
	 */
	void setLLC(LLC value);

} // Frames
