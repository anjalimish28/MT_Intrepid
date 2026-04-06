/**
 */
package targets.tricore299a653p4.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import targets.tricore299a653p4.Tricore299a653p4Package;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Tricore299a653p4XMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tricore299a653p4XMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		Tricore299a653p4Package.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Tricore299a653p4ResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new Tricore299a653p4ResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Tricore299a653p4ResourceFactoryImpl());
		}
		return registrations;
	}

} //Tricore299a653p4XMLProcessor
