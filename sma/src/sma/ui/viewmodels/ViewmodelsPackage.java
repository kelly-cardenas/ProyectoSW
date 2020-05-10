/**
 */
package sma.ui.viewmodels;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sma.ui.viewmodels.ViewmodelsFactory
 * @model kind="package"
 * @generated
 */
public interface ViewmodelsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "viewmodels";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///sma/ui/viewmodels.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sma.ui.viewmodels";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ViewmodelsPackage eINSTANCE = sma.ui.viewmodels.impl.ViewmodelsPackageImpl.init();

	/**
	 * The meta object id for the '{@link sma.ui.viewmodels.impl.ViewModelImpl <em>View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.ui.viewmodels.impl.ViewModelImpl
	 * @see sma.ui.viewmodels.impl.ViewmodelsPackageImpl#getViewModel()
	 * @generated
	 */
	int VIEW_MODEL = 0;

	/**
	 * The feature id for the '<em><b>The UI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL__THE_UI = 0;

	/**
	 * The number of structural features of the '<em>View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link sma.ui.viewmodels.ViewModel <em>View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Model</em>'.
	 * @see sma.ui.viewmodels.ViewModel
	 * @generated
	 */
	EClass getViewModel();

	/**
	 * Returns the meta object for the reference '{@link sma.ui.viewmodels.ViewModel#getTheUI <em>The UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The UI</em>'.
	 * @see sma.ui.viewmodels.ViewModel#getTheUI()
	 * @see #getViewModel()
	 * @generated
	 */
	EReference getViewModel_TheUI();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ViewmodelsFactory getViewmodelsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link sma.ui.viewmodels.impl.ViewModelImpl <em>View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.ui.viewmodels.impl.ViewModelImpl
		 * @see sma.ui.viewmodels.impl.ViewmodelsPackageImpl#getViewModel()
		 * @generated
		 */
		EClass VIEW_MODEL = eINSTANCE.getViewModel();

		/**
		 * The meta object literal for the '<em><b>The UI</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_MODEL__THE_UI = eINSTANCE.getViewModel_TheUI();

	}

} //ViewmodelsPackage
