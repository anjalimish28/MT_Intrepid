/**
 */
package targets.avip.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import targets.avip.AvipPackage;
import targets.avip.PortUserConfiguration;

import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.SuperTrackingType;

import ucof.common.etypes.impl.SuperIdentifierTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port User Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.avip.impl.PortUserConfigurationImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link targets.avip.impl.PortUserConfigurationImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link targets.avip.impl.PortUserConfigurationImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link targets.avip.impl.PortUserConfigurationImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link targets.avip.impl.PortUserConfigurationImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link targets.avip.impl.PortUserConfigurationImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link targets.avip.impl.PortUserConfigurationImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link targets.avip.impl.PortUserConfigurationImpl#getLine_function <em>Line function</em>}</li>
 *   <li>{@link targets.avip.impl.PortUserConfigurationImpl#getSpecial_param_1 <em>Special param 1</em>}</li>
 *   <li>{@link targets.avip.impl.PortUserConfigurationImpl#getSpecial_param_2 <em>Special param 2</em>}</li>
 *   <li>{@link targets.avip.impl.PortUserConfigurationImpl#getSpecial_param_3 <em>Special param 3</em>}</li>
 *   <li>{@link targets.avip.impl.PortUserConfigurationImpl#getSpecial_param_4 <em>Special param 4</em>}</li>
 *   <li>{@link targets.avip.impl.PortUserConfigurationImpl#getSpecial_param_5 <em>Special param 5</em>}</li>
 *   <li>{@link targets.avip.impl.PortUserConfigurationImpl#getInit_default <em>Init default</em>}</li>
 *   <li>{@link targets.avip.impl.PortUserConfigurationImpl#getLoss_of_command <em>Loss of command</em>}</li>
 *   <li>{@link targets.avip.impl.PortUserConfigurationImpl#getNb_allowed_resets <em>Nb allowed resets</em>}</li>
 *   <li>{@link targets.avip.impl.PortUserConfigurationImpl#getReset_wait_time <em>Reset wait time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortUserConfigurationImpl extends SuperIdentifierTypeImpl implements PortUserConfiguration {
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
	 * The default value of the '{@link #getLine_function() <em>Line function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine_function()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_FUNCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLine_function() <em>Line function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine_function()
	 * @generated
	 * @ordered
	 */
	protected String line_function = LINE_FUNCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpecial_param_1() <em>Special param 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecial_param_1()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIAL_PARAM_1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecial_param_1() <em>Special param 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecial_param_1()
	 * @generated
	 * @ordered
	 */
	protected String special_param_1 = SPECIAL_PARAM_1_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpecial_param_2() <em>Special param 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecial_param_2()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIAL_PARAM_2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecial_param_2() <em>Special param 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecial_param_2()
	 * @generated
	 * @ordered
	 */
	protected String special_param_2 = SPECIAL_PARAM_2_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpecial_param_3() <em>Special param 3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecial_param_3()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIAL_PARAM_3_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecial_param_3() <em>Special param 3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecial_param_3()
	 * @generated
	 * @ordered
	 */
	protected String special_param_3 = SPECIAL_PARAM_3_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpecial_param_4() <em>Special param 4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecial_param_4()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIAL_PARAM_4_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecial_param_4() <em>Special param 4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecial_param_4()
	 * @generated
	 * @ordered
	 */
	protected String special_param_4 = SPECIAL_PARAM_4_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpecial_param_5() <em>Special param 5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecial_param_5()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIAL_PARAM_5_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecial_param_5() <em>Special param 5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecial_param_5()
	 * @generated
	 * @ordered
	 */
	protected String special_param_5 = SPECIAL_PARAM_5_EDEFAULT;

	/**
	 * The default value of the '{@link #getInit_default() <em>Init default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInit_default()
	 * @generated
	 * @ordered
	 */
	protected static final String INIT_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInit_default() <em>Init default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInit_default()
	 * @generated
	 * @ordered
	 */
	protected String init_default = INIT_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoss_of_command() <em>Loss of command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoss_of_command()
	 * @generated
	 * @ordered
	 */
	protected static final String LOSS_OF_COMMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoss_of_command() <em>Loss of command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoss_of_command()
	 * @generated
	 * @ordered
	 */
	protected String loss_of_command = LOSS_OF_COMMAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getNb_allowed_resets() <em>Nb allowed resets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNb_allowed_resets()
	 * @generated
	 * @ordered
	 */
	protected static final String NB_ALLOWED_RESETS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNb_allowed_resets() <em>Nb allowed resets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNb_allowed_resets()
	 * @generated
	 * @ordered
	 */
	protected String nb_allowed_resets = NB_ALLOWED_RESETS_EDEFAULT;

	/**
	 * The default value of the '{@link #getReset_wait_time() <em>Reset wait time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReset_wait_time()
	 * @generated
	 * @ordered
	 */
	protected static final String RESET_WAIT_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReset_wait_time() <em>Reset wait time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReset_wait_time()
	 * @generated
	 * @ordered
	 */
	protected String reset_wait_time = RESET_WAIT_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortUserConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AvipPackage.Literals.PORT_USER_CONFIGURATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.PORT_USER_CONFIGURATION__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.PORT_USER_CONFIGURATION__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.PORT_USER_CONFIGURATION__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.PORT_USER_CONFIGURATION__TRACE_LINK, oldTraceLink, traceLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.PORT_USER_CONFIGURATION__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.PORT_USER_CONFIGURATION__CREATOR, oldCreator, creator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.PORT_USER_CONFIGURATION__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLine_function() {
		return line_function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine_function(String newLine_function) {
		String oldLine_function = line_function;
		line_function = newLine_function;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.PORT_USER_CONFIGURATION__LINE_FUNCTION, oldLine_function, line_function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecial_param_1() {
		return special_param_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecial_param_1(String newSpecial_param_1) {
		String oldSpecial_param_1 = special_param_1;
		special_param_1 = newSpecial_param_1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.PORT_USER_CONFIGURATION__SPECIAL_PARAM_1, oldSpecial_param_1, special_param_1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecial_param_2() {
		return special_param_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecial_param_2(String newSpecial_param_2) {
		String oldSpecial_param_2 = special_param_2;
		special_param_2 = newSpecial_param_2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.PORT_USER_CONFIGURATION__SPECIAL_PARAM_2, oldSpecial_param_2, special_param_2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecial_param_3() {
		return special_param_3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecial_param_3(String newSpecial_param_3) {
		String oldSpecial_param_3 = special_param_3;
		special_param_3 = newSpecial_param_3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.PORT_USER_CONFIGURATION__SPECIAL_PARAM_3, oldSpecial_param_3, special_param_3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecial_param_4() {
		return special_param_4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecial_param_4(String newSpecial_param_4) {
		String oldSpecial_param_4 = special_param_4;
		special_param_4 = newSpecial_param_4;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.PORT_USER_CONFIGURATION__SPECIAL_PARAM_4, oldSpecial_param_4, special_param_4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecial_param_5() {
		return special_param_5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecial_param_5(String newSpecial_param_5) {
		String oldSpecial_param_5 = special_param_5;
		special_param_5 = newSpecial_param_5;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.PORT_USER_CONFIGURATION__SPECIAL_PARAM_5, oldSpecial_param_5, special_param_5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInit_default() {
		return init_default;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInit_default(String newInit_default) {
		String oldInit_default = init_default;
		init_default = newInit_default;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.PORT_USER_CONFIGURATION__INIT_DEFAULT, oldInit_default, init_default));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLoss_of_command() {
		return loss_of_command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoss_of_command(String newLoss_of_command) {
		String oldLoss_of_command = loss_of_command;
		loss_of_command = newLoss_of_command;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.PORT_USER_CONFIGURATION__LOSS_OF_COMMAND, oldLoss_of_command, loss_of_command));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNb_allowed_resets() {
		return nb_allowed_resets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNb_allowed_resets(String newNb_allowed_resets) {
		String oldNb_allowed_resets = nb_allowed_resets;
		nb_allowed_resets = newNb_allowed_resets;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.PORT_USER_CONFIGURATION__NB_ALLOWED_RESETS, oldNb_allowed_resets, nb_allowed_resets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReset_wait_time() {
		return reset_wait_time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReset_wait_time(String newReset_wait_time) {
		String oldReset_wait_time = reset_wait_time;
		reset_wait_time = newReset_wait_time;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.PORT_USER_CONFIGURATION__RESET_WAIT_TIME, oldReset_wait_time, reset_wait_time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AvipPackage.PORT_USER_CONFIGURATION__DOCUMENTATION:
				return getDocumentation();
			case AvipPackage.PORT_USER_CONFIGURATION__MODIFIED:
				return getModified();
			case AvipPackage.PORT_USER_CONFIGURATION__MODIFIER:
				return getModifier();
			case AvipPackage.PORT_USER_CONFIGURATION__TRACE_LINK:
				return getTraceLink();
			case AvipPackage.PORT_USER_CONFIGURATION__CREATED:
				return getCreated();
			case AvipPackage.PORT_USER_CONFIGURATION__CREATOR:
				return getCreator();
			case AvipPackage.PORT_USER_CONFIGURATION__VERSION:
				return getVersion();
			case AvipPackage.PORT_USER_CONFIGURATION__LINE_FUNCTION:
				return getLine_function();
			case AvipPackage.PORT_USER_CONFIGURATION__SPECIAL_PARAM_1:
				return getSpecial_param_1();
			case AvipPackage.PORT_USER_CONFIGURATION__SPECIAL_PARAM_2:
				return getSpecial_param_2();
			case AvipPackage.PORT_USER_CONFIGURATION__SPECIAL_PARAM_3:
				return getSpecial_param_3();
			case AvipPackage.PORT_USER_CONFIGURATION__SPECIAL_PARAM_4:
				return getSpecial_param_4();
			case AvipPackage.PORT_USER_CONFIGURATION__SPECIAL_PARAM_5:
				return getSpecial_param_5();
			case AvipPackage.PORT_USER_CONFIGURATION__INIT_DEFAULT:
				return getInit_default();
			case AvipPackage.PORT_USER_CONFIGURATION__LOSS_OF_COMMAND:
				return getLoss_of_command();
			case AvipPackage.PORT_USER_CONFIGURATION__NB_ALLOWED_RESETS:
				return getNb_allowed_resets();
			case AvipPackage.PORT_USER_CONFIGURATION__RESET_WAIT_TIME:
				return getReset_wait_time();
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
			case AvipPackage.PORT_USER_CONFIGURATION__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case AvipPackage.PORT_USER_CONFIGURATION__MODIFIED:
				setModified((Date)newValue);
				return;
			case AvipPackage.PORT_USER_CONFIGURATION__MODIFIER:
				setModifier((String)newValue);
				return;
			case AvipPackage.PORT_USER_CONFIGURATION__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case AvipPackage.PORT_USER_CONFIGURATION__CREATED:
				setCreated((Date)newValue);
				return;
			case AvipPackage.PORT_USER_CONFIGURATION__CREATOR:
				setCreator((String)newValue);
				return;
			case AvipPackage.PORT_USER_CONFIGURATION__VERSION:
				setVersion((Float)newValue);
				return;
			case AvipPackage.PORT_USER_CONFIGURATION__LINE_FUNCTION:
				setLine_function((String)newValue);
				return;
			case AvipPackage.PORT_USER_CONFIGURATION__SPECIAL_PARAM_1:
				setSpecial_param_1((String)newValue);
				return;
			case AvipPackage.PORT_USER_CONFIGURATION__SPECIAL_PARAM_2:
				setSpecial_param_2((String)newValue);
				return;
			case AvipPackage.PORT_USER_CONFIGURATION__SPECIAL_PARAM_3:
				setSpecial_param_3((String)newValue);
				return;
			case AvipPackage.PORT_USER_CONFIGURATION__SPECIAL_PARAM_4:
				setSpecial_param_4((String)newValue);
				return;
			case AvipPackage.PORT_USER_CONFIGURATION__SPECIAL_PARAM_5:
				setSpecial_param_5((String)newValue);
				return;
			case AvipPackage.PORT_USER_CONFIGURATION__INIT_DEFAULT:
				setInit_default((String)newValue);
				return;
			case AvipPackage.PORT_USER_CONFIGURATION__LOSS_OF_COMMAND:
				setLoss_of_command((String)newValue);
				return;
			case AvipPackage.PORT_USER_CONFIGURATION__NB_ALLOWED_RESETS:
				setNb_allowed_resets((String)newValue);
				return;
			case AvipPackage.PORT_USER_CONFIGURATION__RESET_WAIT_TIME:
				setReset_wait_time((String)newValue);
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
			case AvipPackage.PORT_USER_CONFIGURATION__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case AvipPackage.PORT_USER_CONFIGURATION__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case AvipPackage.PORT_USER_CONFIGURATION__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case AvipPackage.PORT_USER_CONFIGURATION__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case AvipPackage.PORT_USER_CONFIGURATION__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case AvipPackage.PORT_USER_CONFIGURATION__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case AvipPackage.PORT_USER_CONFIGURATION__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case AvipPackage.PORT_USER_CONFIGURATION__LINE_FUNCTION:
				setLine_function(LINE_FUNCTION_EDEFAULT);
				return;
			case AvipPackage.PORT_USER_CONFIGURATION__SPECIAL_PARAM_1:
				setSpecial_param_1(SPECIAL_PARAM_1_EDEFAULT);
				return;
			case AvipPackage.PORT_USER_CONFIGURATION__SPECIAL_PARAM_2:
				setSpecial_param_2(SPECIAL_PARAM_2_EDEFAULT);
				return;
			case AvipPackage.PORT_USER_CONFIGURATION__SPECIAL_PARAM_3:
				setSpecial_param_3(SPECIAL_PARAM_3_EDEFAULT);
				return;
			case AvipPackage.PORT_USER_CONFIGURATION__SPECIAL_PARAM_4:
				setSpecial_param_4(SPECIAL_PARAM_4_EDEFAULT);
				return;
			case AvipPackage.PORT_USER_CONFIGURATION__SPECIAL_PARAM_5:
				setSpecial_param_5(SPECIAL_PARAM_5_EDEFAULT);
				return;
			case AvipPackage.PORT_USER_CONFIGURATION__INIT_DEFAULT:
				setInit_default(INIT_DEFAULT_EDEFAULT);
				return;
			case AvipPackage.PORT_USER_CONFIGURATION__LOSS_OF_COMMAND:
				setLoss_of_command(LOSS_OF_COMMAND_EDEFAULT);
				return;
			case AvipPackage.PORT_USER_CONFIGURATION__NB_ALLOWED_RESETS:
				setNb_allowed_resets(NB_ALLOWED_RESETS_EDEFAULT);
				return;
			case AvipPackage.PORT_USER_CONFIGURATION__RESET_WAIT_TIME:
				setReset_wait_time(RESET_WAIT_TIME_EDEFAULT);
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
			case AvipPackage.PORT_USER_CONFIGURATION__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case AvipPackage.PORT_USER_CONFIGURATION__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case AvipPackage.PORT_USER_CONFIGURATION__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case AvipPackage.PORT_USER_CONFIGURATION__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case AvipPackage.PORT_USER_CONFIGURATION__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case AvipPackage.PORT_USER_CONFIGURATION__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case AvipPackage.PORT_USER_CONFIGURATION__VERSION:
				return version != VERSION_EDEFAULT;
			case AvipPackage.PORT_USER_CONFIGURATION__LINE_FUNCTION:
				return LINE_FUNCTION_EDEFAULT == null ? line_function != null : !LINE_FUNCTION_EDEFAULT.equals(line_function);
			case AvipPackage.PORT_USER_CONFIGURATION__SPECIAL_PARAM_1:
				return SPECIAL_PARAM_1_EDEFAULT == null ? special_param_1 != null : !SPECIAL_PARAM_1_EDEFAULT.equals(special_param_1);
			case AvipPackage.PORT_USER_CONFIGURATION__SPECIAL_PARAM_2:
				return SPECIAL_PARAM_2_EDEFAULT == null ? special_param_2 != null : !SPECIAL_PARAM_2_EDEFAULT.equals(special_param_2);
			case AvipPackage.PORT_USER_CONFIGURATION__SPECIAL_PARAM_3:
				return SPECIAL_PARAM_3_EDEFAULT == null ? special_param_3 != null : !SPECIAL_PARAM_3_EDEFAULT.equals(special_param_3);
			case AvipPackage.PORT_USER_CONFIGURATION__SPECIAL_PARAM_4:
				return SPECIAL_PARAM_4_EDEFAULT == null ? special_param_4 != null : !SPECIAL_PARAM_4_EDEFAULT.equals(special_param_4);
			case AvipPackage.PORT_USER_CONFIGURATION__SPECIAL_PARAM_5:
				return SPECIAL_PARAM_5_EDEFAULT == null ? special_param_5 != null : !SPECIAL_PARAM_5_EDEFAULT.equals(special_param_5);
			case AvipPackage.PORT_USER_CONFIGURATION__INIT_DEFAULT:
				return INIT_DEFAULT_EDEFAULT == null ? init_default != null : !INIT_DEFAULT_EDEFAULT.equals(init_default);
			case AvipPackage.PORT_USER_CONFIGURATION__LOSS_OF_COMMAND:
				return LOSS_OF_COMMAND_EDEFAULT == null ? loss_of_command != null : !LOSS_OF_COMMAND_EDEFAULT.equals(loss_of_command);
			case AvipPackage.PORT_USER_CONFIGURATION__NB_ALLOWED_RESETS:
				return NB_ALLOWED_RESETS_EDEFAULT == null ? nb_allowed_resets != null : !NB_ALLOWED_RESETS_EDEFAULT.equals(nb_allowed_resets);
			case AvipPackage.PORT_USER_CONFIGURATION__RESET_WAIT_TIME:
				return RESET_WAIT_TIME_EDEFAULT == null ? reset_wait_time != null : !RESET_WAIT_TIME_EDEFAULT.equals(reset_wait_time);
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
				case AvipPackage.PORT_USER_CONFIGURATION__DOCUMENTATION: return EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;
				case AvipPackage.PORT_USER_CONFIGURATION__MODIFIED: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;
				case AvipPackage.PORT_USER_CONFIGURATION__MODIFIER: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;
				case AvipPackage.PORT_USER_CONFIGURATION__TRACE_LINK: return EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;
				case AvipPackage.PORT_USER_CONFIGURATION__CREATED: return EtypesPackage.SUPER_TRACKING_TYPE__CREATED;
				case AvipPackage.PORT_USER_CONFIGURATION__CREATOR: return EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;
				case AvipPackage.PORT_USER_CONFIGURATION__VERSION: return EtypesPackage.SUPER_TRACKING_TYPE__VERSION;
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
				case EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION: return AvipPackage.PORT_USER_CONFIGURATION__DOCUMENTATION;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED: return AvipPackage.PORT_USER_CONFIGURATION__MODIFIED;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER: return AvipPackage.PORT_USER_CONFIGURATION__MODIFIER;
				case EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK: return AvipPackage.PORT_USER_CONFIGURATION__TRACE_LINK;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATED: return AvipPackage.PORT_USER_CONFIGURATION__CREATED;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATOR: return AvipPackage.PORT_USER_CONFIGURATION__CREATOR;
				case EtypesPackage.SUPER_TRACKING_TYPE__VERSION: return AvipPackage.PORT_USER_CONFIGURATION__VERSION;
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
		result.append(", line_function: ");
		result.append(line_function);
		result.append(", special_param_1: ");
		result.append(special_param_1);
		result.append(", special_param_2: ");
		result.append(special_param_2);
		result.append(", special_param_3: ");
		result.append(special_param_3);
		result.append(", special_param_4: ");
		result.append(special_param_4);
		result.append(", special_param_5: ");
		result.append(special_param_5);
		result.append(", init_default: ");
		result.append(init_default);
		result.append(", loss_of_command: ");
		result.append(loss_of_command);
		result.append(", nb_allowed_resets: ");
		result.append(nb_allowed_resets);
		result.append(", reset_wait_time: ");
		result.append(reset_wait_time);
		result.append(')');
		return result.toString();
	}

} //PortUserConfigurationImpl
