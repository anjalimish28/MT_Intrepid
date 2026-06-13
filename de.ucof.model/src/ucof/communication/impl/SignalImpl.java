/**
 */
package ucof.communication.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.SuperTrackingType;

import ucof.common.etypes.impl.SuperIdentifierTypeImpl;

import ucof.communication.CommunicationPackage;
import ucof.communication.DataTypes;
import ucof.communication.Endianess;
import ucof.communication.Signal;
import ucof.communication.SignedUnsigned;

import ucof.communication.arinc429.A429SignalSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.impl.SignalImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link ucof.communication.impl.SignalImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link ucof.communication.impl.SignalImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link ucof.communication.impl.SignalImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link ucof.communication.impl.SignalImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link ucof.communication.impl.SignalImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link ucof.communication.impl.SignalImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link ucof.communication.impl.SignalImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link ucof.communication.impl.SignalImpl#getSignedness <em>Signedness</em>}</li>
 *   <li>{@link ucof.communication.impl.SignalImpl#getBitLength <em>Bit Length</em>}</li>
 *   <li>{@link ucof.communication.impl.SignalImpl#getFactor <em>Factor</em>}</li>
 *   <li>{@link ucof.communication.impl.SignalImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link ucof.communication.impl.SignalImpl#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link ucof.communication.impl.SignalImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link ucof.communication.impl.SignalImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link ucof.communication.impl.SignalImpl#getByteOrder <em>Byte Order</em>}</li>
 *   <li>{@link ucof.communication.impl.SignalImpl#getA429Specification <em>A429 Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignalImpl extends SuperIdentifierTypeImpl implements Signal {
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
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final DataTypes DATA_TYPE_EDEFAULT = DataTypes.NOT_SET;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected DataTypes dataType = DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignedness() <em>Signedness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignedness()
	 * @generated
	 * @ordered
	 */
	protected static final SignedUnsigned SIGNEDNESS_EDEFAULT = SignedUnsigned.NOT_SET;

	/**
	 * The cached value of the '{@link #getSignedness() <em>Signedness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignedness()
	 * @generated
	 * @ordered
	 */
	protected SignedUnsigned signedness = SIGNEDNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBitLength() <em>Bit Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitLength()
	 * @generated
	 * @ordered
	 */
	protected static final int BIT_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBitLength() <em>Bit Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitLength()
	 * @generated
	 * @ordered
	 */
	protected int bitLength = BIT_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getFactor() <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double FACTOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFactor() <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactor()
	 * @generated
	 * @ordered
	 */
	protected double factor = FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final double OFFSET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected double offset = OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected double minValue = MIN_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected double maxValue = MAX_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getByteOrder() <em>Byte Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteOrder()
	 * @generated
	 * @ordered
	 */
	protected static final Endianess BYTE_ORDER_EDEFAULT = Endianess.NOT_SET;

	/**
	 * The cached value of the '{@link #getByteOrder() <em>Byte Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteOrder()
	 * @generated
	 * @ordered
	 */
	protected Endianess byteOrder = BYTE_ORDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getA429Specification() <em>A429 Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA429Specification()
	 * @generated
	 * @ordered
	 */
	protected A429SignalSpecification a429Specification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationPackage.Literals.SIGNAL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.SIGNAL__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.SIGNAL__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.SIGNAL__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.SIGNAL__TRACE_LINK, oldTraceLink, traceLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.SIGNAL__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.SIGNAL__CREATOR, oldCreator, creator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.SIGNAL__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypes getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(DataTypes newDataType) {
		DataTypes oldDataType = dataType;
		dataType = newDataType == null ? DATA_TYPE_EDEFAULT : newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.SIGNAL__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignedUnsigned getSignedness() {
		return signedness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignedness(SignedUnsigned newSignedness) {
		SignedUnsigned oldSignedness = signedness;
		signedness = newSignedness == null ? SIGNEDNESS_EDEFAULT : newSignedness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.SIGNAL__SIGNEDNESS, oldSignedness, signedness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBitLength() {
		return bitLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBitLength(int newBitLength) {
		int oldBitLength = bitLength;
		bitLength = newBitLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.SIGNAL__BIT_LENGTH, oldBitLength, bitLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFactor() {
		return factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactor(double newFactor) {
		double oldFactor = factor;
		factor = newFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.SIGNAL__FACTOR, oldFactor, factor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(double newOffset) {
		double oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.SIGNAL__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinValue() {
		return minValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValue(double newMinValue) {
		double oldMinValue = minValue;
		minValue = newMinValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.SIGNAL__MIN_VALUE, oldMinValue, minValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxValue() {
		return maxValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValue(double newMaxValue) {
		double oldMaxValue = maxValue;
		maxValue = newMaxValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.SIGNAL__MAX_VALUE, oldMaxValue, maxValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.SIGNAL__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Endianess getByteOrder() {
		return byteOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByteOrder(Endianess newByteOrder) {
		Endianess oldByteOrder = byteOrder;
		byteOrder = newByteOrder == null ? BYTE_ORDER_EDEFAULT : newByteOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.SIGNAL__BYTE_ORDER, oldByteOrder, byteOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A429SignalSpecification getA429Specification() {
		return a429Specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetA429Specification(A429SignalSpecification newA429Specification, NotificationChain msgs) {
		A429SignalSpecification oldA429Specification = a429Specification;
		a429Specification = newA429Specification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommunicationPackage.SIGNAL__A429_SPECIFICATION, oldA429Specification, newA429Specification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setA429Specification(A429SignalSpecification newA429Specification) {
		if (newA429Specification != a429Specification) {
			NotificationChain msgs = null;
			if (a429Specification != null)
				msgs = ((InternalEObject)a429Specification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommunicationPackage.SIGNAL__A429_SPECIFICATION, null, msgs);
			if (newA429Specification != null)
				msgs = ((InternalEObject)newA429Specification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommunicationPackage.SIGNAL__A429_SPECIFICATION, null, msgs);
			msgs = basicSetA429Specification(newA429Specification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.SIGNAL__A429_SPECIFICATION, newA429Specification, newA429Specification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommunicationPackage.SIGNAL__A429_SPECIFICATION:
				return basicSetA429Specification(null, msgs);
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
			case CommunicationPackage.SIGNAL__DOCUMENTATION:
				return getDocumentation();
			case CommunicationPackage.SIGNAL__MODIFIED:
				return getModified();
			case CommunicationPackage.SIGNAL__MODIFIER:
				return getModifier();
			case CommunicationPackage.SIGNAL__TRACE_LINK:
				return getTraceLink();
			case CommunicationPackage.SIGNAL__CREATED:
				return getCreated();
			case CommunicationPackage.SIGNAL__CREATOR:
				return getCreator();
			case CommunicationPackage.SIGNAL__VERSION:
				return getVersion();
			case CommunicationPackage.SIGNAL__DATA_TYPE:
				return getDataType();
			case CommunicationPackage.SIGNAL__SIGNEDNESS:
				return getSignedness();
			case CommunicationPackage.SIGNAL__BIT_LENGTH:
				return getBitLength();
			case CommunicationPackage.SIGNAL__FACTOR:
				return getFactor();
			case CommunicationPackage.SIGNAL__OFFSET:
				return getOffset();
			case CommunicationPackage.SIGNAL__MIN_VALUE:
				return getMinValue();
			case CommunicationPackage.SIGNAL__MAX_VALUE:
				return getMaxValue();
			case CommunicationPackage.SIGNAL__UNIT:
				return getUnit();
			case CommunicationPackage.SIGNAL__BYTE_ORDER:
				return getByteOrder();
			case CommunicationPackage.SIGNAL__A429_SPECIFICATION:
				return getA429Specification();
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
			case CommunicationPackage.SIGNAL__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case CommunicationPackage.SIGNAL__MODIFIED:
				setModified((Date)newValue);
				return;
			case CommunicationPackage.SIGNAL__MODIFIER:
				setModifier((String)newValue);
				return;
			case CommunicationPackage.SIGNAL__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case CommunicationPackage.SIGNAL__CREATED:
				setCreated((Date)newValue);
				return;
			case CommunicationPackage.SIGNAL__CREATOR:
				setCreator((String)newValue);
				return;
			case CommunicationPackage.SIGNAL__VERSION:
				setVersion((Float)newValue);
				return;
			case CommunicationPackage.SIGNAL__DATA_TYPE:
				setDataType((DataTypes)newValue);
				return;
			case CommunicationPackage.SIGNAL__SIGNEDNESS:
				setSignedness((SignedUnsigned)newValue);
				return;
			case CommunicationPackage.SIGNAL__BIT_LENGTH:
				setBitLength((Integer)newValue);
				return;
			case CommunicationPackage.SIGNAL__FACTOR:
				setFactor((Double)newValue);
				return;
			case CommunicationPackage.SIGNAL__OFFSET:
				setOffset((Double)newValue);
				return;
			case CommunicationPackage.SIGNAL__MIN_VALUE:
				setMinValue((Double)newValue);
				return;
			case CommunicationPackage.SIGNAL__MAX_VALUE:
				setMaxValue((Double)newValue);
				return;
			case CommunicationPackage.SIGNAL__UNIT:
				setUnit((String)newValue);
				return;
			case CommunicationPackage.SIGNAL__BYTE_ORDER:
				setByteOrder((Endianess)newValue);
				return;
			case CommunicationPackage.SIGNAL__A429_SPECIFICATION:
				setA429Specification((A429SignalSpecification)newValue);
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
			case CommunicationPackage.SIGNAL__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case CommunicationPackage.SIGNAL__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case CommunicationPackage.SIGNAL__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case CommunicationPackage.SIGNAL__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case CommunicationPackage.SIGNAL__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case CommunicationPackage.SIGNAL__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case CommunicationPackage.SIGNAL__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case CommunicationPackage.SIGNAL__DATA_TYPE:
				setDataType(DATA_TYPE_EDEFAULT);
				return;
			case CommunicationPackage.SIGNAL__SIGNEDNESS:
				setSignedness(SIGNEDNESS_EDEFAULT);
				return;
			case CommunicationPackage.SIGNAL__BIT_LENGTH:
				setBitLength(BIT_LENGTH_EDEFAULT);
				return;
			case CommunicationPackage.SIGNAL__FACTOR:
				setFactor(FACTOR_EDEFAULT);
				return;
			case CommunicationPackage.SIGNAL__OFFSET:
				setOffset(OFFSET_EDEFAULT);
				return;
			case CommunicationPackage.SIGNAL__MIN_VALUE:
				setMinValue(MIN_VALUE_EDEFAULT);
				return;
			case CommunicationPackage.SIGNAL__MAX_VALUE:
				setMaxValue(MAX_VALUE_EDEFAULT);
				return;
			case CommunicationPackage.SIGNAL__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case CommunicationPackage.SIGNAL__BYTE_ORDER:
				setByteOrder(BYTE_ORDER_EDEFAULT);
				return;
			case CommunicationPackage.SIGNAL__A429_SPECIFICATION:
				setA429Specification((A429SignalSpecification)null);
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
			case CommunicationPackage.SIGNAL__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case CommunicationPackage.SIGNAL__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case CommunicationPackage.SIGNAL__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case CommunicationPackage.SIGNAL__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case CommunicationPackage.SIGNAL__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case CommunicationPackage.SIGNAL__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case CommunicationPackage.SIGNAL__VERSION:
				return version != VERSION_EDEFAULT;
			case CommunicationPackage.SIGNAL__DATA_TYPE:
				return dataType != DATA_TYPE_EDEFAULT;
			case CommunicationPackage.SIGNAL__SIGNEDNESS:
				return signedness != SIGNEDNESS_EDEFAULT;
			case CommunicationPackage.SIGNAL__BIT_LENGTH:
				return bitLength != BIT_LENGTH_EDEFAULT;
			case CommunicationPackage.SIGNAL__FACTOR:
				return factor != FACTOR_EDEFAULT;
			case CommunicationPackage.SIGNAL__OFFSET:
				return offset != OFFSET_EDEFAULT;
			case CommunicationPackage.SIGNAL__MIN_VALUE:
				return minValue != MIN_VALUE_EDEFAULT;
			case CommunicationPackage.SIGNAL__MAX_VALUE:
				return maxValue != MAX_VALUE_EDEFAULT;
			case CommunicationPackage.SIGNAL__UNIT:
				return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
			case CommunicationPackage.SIGNAL__BYTE_ORDER:
				return byteOrder != BYTE_ORDER_EDEFAULT;
			case CommunicationPackage.SIGNAL__A429_SPECIFICATION:
				return a429Specification != null;
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
				case CommunicationPackage.SIGNAL__DOCUMENTATION: return EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;
				case CommunicationPackage.SIGNAL__MODIFIED: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;
				case CommunicationPackage.SIGNAL__MODIFIER: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;
				case CommunicationPackage.SIGNAL__TRACE_LINK: return EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;
				case CommunicationPackage.SIGNAL__CREATED: return EtypesPackage.SUPER_TRACKING_TYPE__CREATED;
				case CommunicationPackage.SIGNAL__CREATOR: return EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;
				case CommunicationPackage.SIGNAL__VERSION: return EtypesPackage.SUPER_TRACKING_TYPE__VERSION;
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
				case EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION: return CommunicationPackage.SIGNAL__DOCUMENTATION;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED: return CommunicationPackage.SIGNAL__MODIFIED;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER: return CommunicationPackage.SIGNAL__MODIFIER;
				case EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK: return CommunicationPackage.SIGNAL__TRACE_LINK;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATED: return CommunicationPackage.SIGNAL__CREATED;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATOR: return CommunicationPackage.SIGNAL__CREATOR;
				case EtypesPackage.SUPER_TRACKING_TYPE__VERSION: return CommunicationPackage.SIGNAL__VERSION;
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
		result.append(", dataType: ");
		result.append(dataType);
		result.append(", signedness: ");
		result.append(signedness);
		result.append(", bitLength: ");
		result.append(bitLength);
		result.append(", factor: ");
		result.append(factor);
		result.append(", offset: ");
		result.append(offset);
		result.append(", minValue: ");
		result.append(minValue);
		result.append(", maxValue: ");
		result.append(maxValue);
		result.append(", unit: ");
		result.append(unit);
		result.append(", byteOrder: ");
		result.append(byteOrder);
		result.append(')');
		return result.toString();
	}

} //SignalImpl
