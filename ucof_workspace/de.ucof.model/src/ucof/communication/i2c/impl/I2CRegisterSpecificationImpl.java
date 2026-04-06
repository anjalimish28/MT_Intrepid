/**
 */
package ucof.communication.i2c.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.common.enums.booleanType;

import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.SuperTrackingType;

import ucof.common.etypes.impl.SuperIdentifierTypeImpl;

import ucof.communication.i2c.I2CRegisterSpecification;
import ucof.communication.i2c.I2cPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>I2C Register Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.i2c.impl.I2CRegisterSpecificationImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link ucof.communication.i2c.impl.I2CRegisterSpecificationImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link ucof.communication.i2c.impl.I2CRegisterSpecificationImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link ucof.communication.i2c.impl.I2CRegisterSpecificationImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link ucof.communication.i2c.impl.I2CRegisterSpecificationImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link ucof.communication.i2c.impl.I2CRegisterSpecificationImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link ucof.communication.i2c.impl.I2CRegisterSpecificationImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link ucof.communication.i2c.impl.I2CRegisterSpecificationImpl#getRegisterName <em>Register Name</em>}</li>
 *   <li>{@link ucof.communication.i2c.impl.I2CRegisterSpecificationImpl#getRegisterPointerAddress <em>Register Pointer Address</em>}</li>
 *   <li>{@link ucof.communication.i2c.impl.I2CRegisterSpecificationImpl#getRegisterWidthBits <em>Register Width Bits</em>}</li>
 *   <li>{@link ucof.communication.i2c.impl.I2CRegisterSpecificationImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link ucof.communication.i2c.impl.I2CRegisterSpecificationImpl#getReadOnly <em>Read Only</em>}</li>
 * </ul>
 *
 * @generated
 */
public class I2CRegisterSpecificationImpl extends SuperIdentifierTypeImpl implements I2CRegisterSpecification {
	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected static final Date MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected Date modified = MODIFIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected static final String MODIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected String modifier = MODIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTraceLink() <em>Trace Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceLink()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACE_LINK_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTraceLink() <em>Trace Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceLink()
	 * @generated
	 * @ordered
	 */
	protected String traceLink = TRACE_LINK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected Date created = CREATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreator() <em>Creator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreator()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreator() <em>Creator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreator()
	 * @generated
	 * @ordered
	 */
	protected String creator = CREATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final float VERSION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected float version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegisterName() <em>Register Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterName()
	 * @generated
	 * @ordered
	 */
	protected static final String REGISTER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegisterName() <em>Register Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterName()
	 * @generated
	 * @ordered
	 */
	protected String registerName = REGISTER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegisterPointerAddress() <em>Register Pointer Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterPointerAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String REGISTER_POINTER_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegisterPointerAddress() <em>Register Pointer Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterPointerAddress()
	 * @generated
	 * @ordered
	 */
	protected String registerPointerAddress = REGISTER_POINTER_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegisterWidthBits() <em>Register Width Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterWidthBits()
	 * @generated
	 * @ordered
	 */
	protected static final int REGISTER_WIDTH_BITS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRegisterWidthBits() <em>Register Width Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterWidthBits()
	 * @generated
	 * @ordered
	 */
	protected int registerWidthBits = REGISTER_WIDTH_BITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final booleanType READ_ONLY_EDEFAULT = booleanType.NOT_SET;

	/**
	 * The cached value of the '{@link #getReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadOnly()
	 * @generated
	 * @ordered
	 */
	protected booleanType readOnly = READ_ONLY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected I2CRegisterSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return I2cPackage.Literals.I2C_REGISTER_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, I2cPackage.I2C_REGISTER_SPECIFICATION__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getModified() {
		return modified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModified(Date newModified) {
		Date oldModified = modified;
		modified = newModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, I2cPackage.I2C_REGISTER_SPECIFICATION__MODIFIED, oldModified, modified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModifier() {
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifier(String newModifier) {
		String oldModifier = modifier;
		modifier = newModifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, I2cPackage.I2C_REGISTER_SPECIFICATION__MODIFIER, oldModifier, modifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTraceLink() {
		return traceLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceLink(String newTraceLink) {
		String oldTraceLink = traceLink;
		traceLink = newTraceLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, I2cPackage.I2C_REGISTER_SPECIFICATION__TRACE_LINK, oldTraceLink, traceLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(Date newCreated) {
		Date oldCreated = created;
		created = newCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, I2cPackage.I2C_REGISTER_SPECIFICATION__CREATED, oldCreated, created));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreator() {
		return creator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreator(String newCreator) {
		String oldCreator = creator;
		creator = newCreator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, I2cPackage.I2C_REGISTER_SPECIFICATION__CREATOR, oldCreator, creator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(float newVersion) {
		float oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, I2cPackage.I2C_REGISTER_SPECIFICATION__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegisterName() {
		return registerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisterName(String newRegisterName) {
		String oldRegisterName = registerName;
		registerName = newRegisterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, I2cPackage.I2C_REGISTER_SPECIFICATION__REGISTER_NAME, oldRegisterName, registerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegisterPointerAddress() {
		return registerPointerAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisterPointerAddress(String newRegisterPointerAddress) {
		String oldRegisterPointerAddress = registerPointerAddress;
		registerPointerAddress = newRegisterPointerAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, I2cPackage.I2C_REGISTER_SPECIFICATION__REGISTER_POINTER_ADDRESS, oldRegisterPointerAddress, registerPointerAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRegisterWidthBits() {
		return registerWidthBits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisterWidthBits(int newRegisterWidthBits) {
		int oldRegisterWidthBits = registerWidthBits;
		registerWidthBits = newRegisterWidthBits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, I2cPackage.I2C_REGISTER_SPECIFICATION__REGISTER_WIDTH_BITS, oldRegisterWidthBits, registerWidthBits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, I2cPackage.I2C_REGISTER_SPECIFICATION__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public booleanType getReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadOnly(booleanType newReadOnly) {
		booleanType oldReadOnly = readOnly;
		readOnly = newReadOnly == null ? READ_ONLY_EDEFAULT : newReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, I2cPackage.I2C_REGISTER_SPECIFICATION__READ_ONLY, oldReadOnly, readOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case I2cPackage.I2C_REGISTER_SPECIFICATION__DOCUMENTATION:
				return getDocumentation();
			case I2cPackage.I2C_REGISTER_SPECIFICATION__MODIFIED:
				return getModified();
			case I2cPackage.I2C_REGISTER_SPECIFICATION__MODIFIER:
				return getModifier();
			case I2cPackage.I2C_REGISTER_SPECIFICATION__TRACE_LINK:
				return getTraceLink();
			case I2cPackage.I2C_REGISTER_SPECIFICATION__CREATED:
				return getCreated();
			case I2cPackage.I2C_REGISTER_SPECIFICATION__CREATOR:
				return getCreator();
			case I2cPackage.I2C_REGISTER_SPECIFICATION__VERSION:
				return getVersion();
			case I2cPackage.I2C_REGISTER_SPECIFICATION__REGISTER_NAME:
				return getRegisterName();
			case I2cPackage.I2C_REGISTER_SPECIFICATION__REGISTER_POINTER_ADDRESS:
				return getRegisterPointerAddress();
			case I2cPackage.I2C_REGISTER_SPECIFICATION__REGISTER_WIDTH_BITS:
				return getRegisterWidthBits();
			case I2cPackage.I2C_REGISTER_SPECIFICATION__DEFAULT_VALUE:
				return getDefaultValue();
			case I2cPackage.I2C_REGISTER_SPECIFICATION__READ_ONLY:
				return getReadOnly();
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
			case I2cPackage.I2C_REGISTER_SPECIFICATION__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case I2cPackage.I2C_REGISTER_SPECIFICATION__MODIFIED:
				setModified((Date)newValue);
				return;
			case I2cPackage.I2C_REGISTER_SPECIFICATION__MODIFIER:
				setModifier((String)newValue);
				return;
			case I2cPackage.I2C_REGISTER_SPECIFICATION__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case I2cPackage.I2C_REGISTER_SPECIFICATION__CREATED:
				setCreated((Date)newValue);
				return;
			case I2cPackage.I2C_REGISTER_SPECIFICATION__CREATOR:
				setCreator((String)newValue);
				return;
			case I2cPackage.I2C_REGISTER_SPECIFICATION__VERSION:
				setVersion((Float)newValue);
				return;
			case I2cPackage.I2C_REGISTER_SPECIFICATION__REGISTER_NAME:
				setRegisterName((String)newValue);
				return;
			case I2cPackage.I2C_REGISTER_SPECIFICATION__REGISTER_POINTER_ADDRESS:
				setRegisterPointerAddress((String)newValue);
				return;
			case I2cPackage.I2C_REGISTER_SPECIFICATION__REGISTER_WIDTH_BITS:
				setRegisterWidthBits((Integer)newValue);
				return;
			case I2cPackage.I2C_REGISTER_SPECIFICATION__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case I2cPackage.I2C_REGISTER_SPECIFICATION__READ_ONLY:
				setReadOnly((booleanType)newValue);
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
			case I2cPackage.I2C_REGISTER_SPECIFICATION__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case I2cPackage.I2C_REGISTER_SPECIFICATION__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case I2cPackage.I2C_REGISTER_SPECIFICATION__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case I2cPackage.I2C_REGISTER_SPECIFICATION__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case I2cPackage.I2C_REGISTER_SPECIFICATION__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case I2cPackage.I2C_REGISTER_SPECIFICATION__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case I2cPackage.I2C_REGISTER_SPECIFICATION__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case I2cPackage.I2C_REGISTER_SPECIFICATION__REGISTER_NAME:
				setRegisterName(REGISTER_NAME_EDEFAULT);
				return;
			case I2cPackage.I2C_REGISTER_SPECIFICATION__REGISTER_POINTER_ADDRESS:
				setRegisterPointerAddress(REGISTER_POINTER_ADDRESS_EDEFAULT);
				return;
			case I2cPackage.I2C_REGISTER_SPECIFICATION__REGISTER_WIDTH_BITS:
				setRegisterWidthBits(REGISTER_WIDTH_BITS_EDEFAULT);
				return;
			case I2cPackage.I2C_REGISTER_SPECIFICATION__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case I2cPackage.I2C_REGISTER_SPECIFICATION__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
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
			case I2cPackage.I2C_REGISTER_SPECIFICATION__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case I2cPackage.I2C_REGISTER_SPECIFICATION__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case I2cPackage.I2C_REGISTER_SPECIFICATION__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case I2cPackage.I2C_REGISTER_SPECIFICATION__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case I2cPackage.I2C_REGISTER_SPECIFICATION__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case I2cPackage.I2C_REGISTER_SPECIFICATION__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case I2cPackage.I2C_REGISTER_SPECIFICATION__VERSION:
				return version != VERSION_EDEFAULT;
			case I2cPackage.I2C_REGISTER_SPECIFICATION__REGISTER_NAME:
				return REGISTER_NAME_EDEFAULT == null ? registerName != null : !REGISTER_NAME_EDEFAULT.equals(registerName);
			case I2cPackage.I2C_REGISTER_SPECIFICATION__REGISTER_POINTER_ADDRESS:
				return REGISTER_POINTER_ADDRESS_EDEFAULT == null ? registerPointerAddress != null : !REGISTER_POINTER_ADDRESS_EDEFAULT.equals(registerPointerAddress);
			case I2cPackage.I2C_REGISTER_SPECIFICATION__REGISTER_WIDTH_BITS:
				return registerWidthBits != REGISTER_WIDTH_BITS_EDEFAULT;
			case I2cPackage.I2C_REGISTER_SPECIFICATION__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case I2cPackage.I2C_REGISTER_SPECIFICATION__READ_ONLY:
				return readOnly != READ_ONLY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SuperTrackingType.class) {
			switch (derivedFeatureID) {
				case I2cPackage.I2C_REGISTER_SPECIFICATION__DOCUMENTATION: return EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;
				case I2cPackage.I2C_REGISTER_SPECIFICATION__MODIFIED: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;
				case I2cPackage.I2C_REGISTER_SPECIFICATION__MODIFIER: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;
				case I2cPackage.I2C_REGISTER_SPECIFICATION__TRACE_LINK: return EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;
				case I2cPackage.I2C_REGISTER_SPECIFICATION__CREATED: return EtypesPackage.SUPER_TRACKING_TYPE__CREATED;
				case I2cPackage.I2C_REGISTER_SPECIFICATION__CREATOR: return EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;
				case I2cPackage.I2C_REGISTER_SPECIFICATION__VERSION: return EtypesPackage.SUPER_TRACKING_TYPE__VERSION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SuperTrackingType.class) {
			switch (baseFeatureID) {
				case EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION: return I2cPackage.I2C_REGISTER_SPECIFICATION__DOCUMENTATION;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED: return I2cPackage.I2C_REGISTER_SPECIFICATION__MODIFIED;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER: return I2cPackage.I2C_REGISTER_SPECIFICATION__MODIFIER;
				case EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK: return I2cPackage.I2C_REGISTER_SPECIFICATION__TRACE_LINK;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATED: return I2cPackage.I2C_REGISTER_SPECIFICATION__CREATED;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATOR: return I2cPackage.I2C_REGISTER_SPECIFICATION__CREATOR;
				case EtypesPackage.SUPER_TRACKING_TYPE__VERSION: return I2cPackage.I2C_REGISTER_SPECIFICATION__VERSION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (documentation: ");
		result.append(documentation);
		result.append(", modified: ");
		result.append(modified);
		result.append(", modifier: ");
		result.append(modifier);
		result.append(", traceLink: ");
		result.append(traceLink);
		result.append(", created: ");
		result.append(created);
		result.append(", creator: ");
		result.append(creator);
		result.append(", version: ");
		result.append(version);
		result.append(", registerName: ");
		result.append(registerName);
		result.append(", registerPointerAddress: ");
		result.append(registerPointerAddress);
		result.append(", registerWidthBits: ");
		result.append(registerWidthBits);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", readOnly: ");
		result.append(readOnly);
		result.append(')');
		return result.toString();
	}

} //I2CRegisterSpecificationImpl
