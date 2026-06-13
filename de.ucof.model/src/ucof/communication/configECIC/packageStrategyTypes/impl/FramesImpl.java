/**
 */
package ucof.communication.configECIC.packageStrategyTypes.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.SuperTrackingType;

import ucof.common.etypes.impl.SuperIdentifierTypeImpl;

import ucof.communication.configECIC.packageStrategyTypes.Frame;
import ucof.communication.configECIC.packageStrategyTypes.Frames;
import ucof.communication.configECIC.packageStrategyTypes.LLC;
import ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Frames</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.FramesImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.FramesImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.FramesImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.FramesImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.FramesImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.FramesImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.FramesImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.FramesImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.FramesImpl#getLLC <em>LLC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FramesImpl extends SuperIdentifierTypeImpl implements Frames {
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
	 * The cached value of the '{@link #getFrame() <em>Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrame()
	 * @generated
	 * @ordered
	 */
	protected Frame frame;

	/**
	 * The cached value of the '{@link #getLLC() <em>LLC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLLC()
	 * @generated
	 * @ordered
	 */
	protected LLC llc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FramesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackageStrategyTypesPackage.Literals.FRAMES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.FRAMES__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.FRAMES__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.FRAMES__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.FRAMES__TRACE_LINK, oldTraceLink, traceLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.FRAMES__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.FRAMES__CREATOR, oldCreator, creator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.FRAMES__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Frame getFrame() {
		return frame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrame(Frame newFrame, NotificationChain msgs) {
		Frame oldFrame = frame;
		frame = newFrame;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.FRAMES__FRAME, oldFrame, newFrame);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrame(Frame newFrame) {
		if (newFrame != frame) {
			NotificationChain msgs = null;
			if (frame != null)
				msgs = ((InternalEObject)frame).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackageStrategyTypesPackage.FRAMES__FRAME, null, msgs);
			if (newFrame != null)
				msgs = ((InternalEObject)newFrame).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackageStrategyTypesPackage.FRAMES__FRAME, null, msgs);
			msgs = basicSetFrame(newFrame, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.FRAMES__FRAME, newFrame, newFrame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LLC getLLC() {
		return llc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLLC(LLC newLLC, NotificationChain msgs) {
		LLC oldLLC = llc;
		llc = newLLC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.FRAMES__LLC, oldLLC, newLLC);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLLC(LLC newLLC) {
		if (newLLC != llc) {
			NotificationChain msgs = null;
			if (llc != null)
				msgs = ((InternalEObject)llc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackageStrategyTypesPackage.FRAMES__LLC, null, msgs);
			if (newLLC != null)
				msgs = ((InternalEObject)newLLC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackageStrategyTypesPackage.FRAMES__LLC, null, msgs);
			msgs = basicSetLLC(newLLC, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.FRAMES__LLC, newLLC, newLLC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PackageStrategyTypesPackage.FRAMES__FRAME:
				return basicSetFrame(null, msgs);
			case PackageStrategyTypesPackage.FRAMES__LLC:
				return basicSetLLC(null, msgs);
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
			case PackageStrategyTypesPackage.FRAMES__DOCUMENTATION:
				return getDocumentation();
			case PackageStrategyTypesPackage.FRAMES__MODIFIED:
				return getModified();
			case PackageStrategyTypesPackage.FRAMES__MODIFIER:
				return getModifier();
			case PackageStrategyTypesPackage.FRAMES__TRACE_LINK:
				return getTraceLink();
			case PackageStrategyTypesPackage.FRAMES__CREATED:
				return getCreated();
			case PackageStrategyTypesPackage.FRAMES__CREATOR:
				return getCreator();
			case PackageStrategyTypesPackage.FRAMES__VERSION:
				return getVersion();
			case PackageStrategyTypesPackage.FRAMES__FRAME:
				return getFrame();
			case PackageStrategyTypesPackage.FRAMES__LLC:
				return getLLC();
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
			case PackageStrategyTypesPackage.FRAMES__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case PackageStrategyTypesPackage.FRAMES__MODIFIED:
				setModified((Date)newValue);
				return;
			case PackageStrategyTypesPackage.FRAMES__MODIFIER:
				setModifier((String)newValue);
				return;
			case PackageStrategyTypesPackage.FRAMES__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case PackageStrategyTypesPackage.FRAMES__CREATED:
				setCreated((Date)newValue);
				return;
			case PackageStrategyTypesPackage.FRAMES__CREATOR:
				setCreator((String)newValue);
				return;
			case PackageStrategyTypesPackage.FRAMES__VERSION:
				setVersion((Float)newValue);
				return;
			case PackageStrategyTypesPackage.FRAMES__FRAME:
				setFrame((Frame)newValue);
				return;
			case PackageStrategyTypesPackage.FRAMES__LLC:
				setLLC((LLC)newValue);
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
			case PackageStrategyTypesPackage.FRAMES__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case PackageStrategyTypesPackage.FRAMES__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case PackageStrategyTypesPackage.FRAMES__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case PackageStrategyTypesPackage.FRAMES__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case PackageStrategyTypesPackage.FRAMES__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case PackageStrategyTypesPackage.FRAMES__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case PackageStrategyTypesPackage.FRAMES__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case PackageStrategyTypesPackage.FRAMES__FRAME:
				setFrame((Frame)null);
				return;
			case PackageStrategyTypesPackage.FRAMES__LLC:
				setLLC((LLC)null);
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
			case PackageStrategyTypesPackage.FRAMES__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case PackageStrategyTypesPackage.FRAMES__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case PackageStrategyTypesPackage.FRAMES__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case PackageStrategyTypesPackage.FRAMES__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case PackageStrategyTypesPackage.FRAMES__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case PackageStrategyTypesPackage.FRAMES__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case PackageStrategyTypesPackage.FRAMES__VERSION:
				return version != VERSION_EDEFAULT;
			case PackageStrategyTypesPackage.FRAMES__FRAME:
				return frame != null;
			case PackageStrategyTypesPackage.FRAMES__LLC:
				return llc != null;
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
				case PackageStrategyTypesPackage.FRAMES__DOCUMENTATION: return EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;
				case PackageStrategyTypesPackage.FRAMES__MODIFIED: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;
				case PackageStrategyTypesPackage.FRAMES__MODIFIER: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;
				case PackageStrategyTypesPackage.FRAMES__TRACE_LINK: return EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;
				case PackageStrategyTypesPackage.FRAMES__CREATED: return EtypesPackage.SUPER_TRACKING_TYPE__CREATED;
				case PackageStrategyTypesPackage.FRAMES__CREATOR: return EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;
				case PackageStrategyTypesPackage.FRAMES__VERSION: return EtypesPackage.SUPER_TRACKING_TYPE__VERSION;
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
				case EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION: return PackageStrategyTypesPackage.FRAMES__DOCUMENTATION;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED: return PackageStrategyTypesPackage.FRAMES__MODIFIED;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER: return PackageStrategyTypesPackage.FRAMES__MODIFIER;
				case EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK: return PackageStrategyTypesPackage.FRAMES__TRACE_LINK;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATED: return PackageStrategyTypesPackage.FRAMES__CREATED;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATOR: return PackageStrategyTypesPackage.FRAMES__CREATOR;
				case EtypesPackage.SUPER_TRACKING_TYPE__VERSION: return PackageStrategyTypesPackage.FRAMES__VERSION;
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
		result.append(')');
		return result.toString();
	}

} //FramesImpl
