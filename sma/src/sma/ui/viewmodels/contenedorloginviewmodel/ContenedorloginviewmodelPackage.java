/**
 */
package sma.ui.viewmodels.contenedorloginviewmodel;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see sma.ui.viewmodels.contenedorloginviewmodel.ContenedorloginviewmodelFactory
 * @model kind="package"
 * @generated
 */
public interface ContenedorloginviewmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "contenedorloginviewmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///sma/ui/viewmodels/contenedorloginviewmodel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sma.ui.viewmodels.contenedorloginviewmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContenedorloginviewmodelPackage eINSTANCE = sma.ui.viewmodels.contenedorloginviewmodel.impl.ContenedorloginviewmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link sma.ui.viewmodels.contenedorloginviewmodel.impl.ContenedorDetalleLoginViewModelImpl <em>Contenedor Detalle Login View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.ui.viewmodels.contenedorloginviewmodel.impl.ContenedorDetalleLoginViewModelImpl
	 * @see sma.ui.viewmodels.contenedorloginviewmodel.impl.ContenedorloginviewmodelPackageImpl#getContenedorDetalleLoginViewModel()
	 * @generated
	 */
	int CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL__USUARIO = 0;

	/**
	 * The feature id for the '<em><b>Contrasenia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL__CONTRASENIA = 1;

	/**
	 * The feature id for the '<em><b>Owned By Contenedor Login View Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL__OWNED_BY_CONTENEDOR_LOGIN_VIEW_MODEL = 2;

	/**
	 * The number of structural features of the '<em>Contenedor Detalle Login View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link sma.ui.viewmodels.contenedorloginviewmodel.impl.ContenedorLoginViewModelImpl <em>Contenedor Login View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.ui.viewmodels.contenedorloginviewmodel.impl.ContenedorLoginViewModelImpl
	 * @see sma.ui.viewmodels.contenedorloginviewmodel.impl.ContenedorloginviewmodelPackageImpl#getContenedorLoginViewModel()
	 * @generated
	 */
	int CONTENEDOR_LOGIN_VIEW_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Owned By UI</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_LOGIN_VIEW_MODEL__OWNED_BY_UI = 0;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_LOGIN_VIEW_MODEL__USUARIO = 1;

	/**
	 * The feature id for the '<em><b>The Contenedor Detalle Login View Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_LOGIN_VIEW_MODEL__THE_CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL = 2;

	/**
	 * The number of structural features of the '<em>Contenedor Login View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_LOGIN_VIEW_MODEL_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link sma.ui.viewmodels.contenedorloginviewmodel.ContenedorDetalleLoginViewModel <em>Contenedor Detalle Login View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Detalle Login View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorloginviewmodel.ContenedorDetalleLoginViewModel
	 * @generated
	 */
	EClass getContenedorDetalleLoginViewModel();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorloginviewmodel.ContenedorDetalleLoginViewModel#getUsuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usuario</em>'.
	 * @see sma.ui.viewmodels.contenedorloginviewmodel.ContenedorDetalleLoginViewModel#getUsuario()
	 * @see #getContenedorDetalleLoginViewModel()
	 * @generated
	 */
	EAttribute getContenedorDetalleLoginViewModel_Usuario();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorloginviewmodel.ContenedorDetalleLoginViewModel#getContrasenia <em>Contrasenia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contrasenia</em>'.
	 * @see sma.ui.viewmodels.contenedorloginviewmodel.ContenedorDetalleLoginViewModel#getContrasenia()
	 * @see #getContenedorDetalleLoginViewModel()
	 * @generated
	 */
	EAttribute getContenedorDetalleLoginViewModel_Contrasenia();

	/**
	 * Returns the meta object for the container reference '{@link sma.ui.viewmodels.contenedorloginviewmodel.ContenedorDetalleLoginViewModel#getOwnedByContenedorLoginViewModel <em>Owned By Contenedor Login View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Contenedor Login View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorloginviewmodel.ContenedorDetalleLoginViewModel#getOwnedByContenedorLoginViewModel()
	 * @see #getContenedorDetalleLoginViewModel()
	 * @generated
	 */
	EReference getContenedorDetalleLoginViewModel_OwnedByContenedorLoginViewModel();

	/**
	 * Returns the meta object for class '{@link sma.ui.viewmodels.contenedorloginviewmodel.ContenedorLoginViewModel <em>Contenedor Login View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Login View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorloginviewmodel.ContenedorLoginViewModel
	 * @generated
	 */
	EClass getContenedorLoginViewModel();

	/**
	 * Returns the meta object for the container reference '{@link sma.ui.viewmodels.contenedorloginviewmodel.ContenedorLoginViewModel#getOwnedByUI <em>Owned By UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By UI</em>'.
	 * @see sma.ui.viewmodels.contenedorloginviewmodel.ContenedorLoginViewModel#getOwnedByUI()
	 * @see #getContenedorLoginViewModel()
	 * @generated
	 */
	EReference getContenedorLoginViewModel_OwnedByUI();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorloginviewmodel.ContenedorLoginViewModel#getUsuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usuario</em>'.
	 * @see sma.ui.viewmodels.contenedorloginviewmodel.ContenedorLoginViewModel#getUsuario()
	 * @see #getContenedorLoginViewModel()
	 * @generated
	 */
	EAttribute getContenedorLoginViewModel_Usuario();

	/**
	 * Returns the meta object for the containment reference '{@link sma.ui.viewmodels.contenedorloginviewmodel.ContenedorLoginViewModel#getTheContenedorDetalleLoginViewModel <em>The Contenedor Detalle Login View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Contenedor Detalle Login View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorloginviewmodel.ContenedorLoginViewModel#getTheContenedorDetalleLoginViewModel()
	 * @see #getContenedorLoginViewModel()
	 * @generated
	 */
	EReference getContenedorLoginViewModel_TheContenedorDetalleLoginViewModel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContenedorloginviewmodelFactory getContenedorloginviewmodelFactory();

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
		 * The meta object literal for the '{@link sma.ui.viewmodels.contenedorloginviewmodel.impl.ContenedorDetalleLoginViewModelImpl <em>Contenedor Detalle Login View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.ui.viewmodels.contenedorloginviewmodel.impl.ContenedorDetalleLoginViewModelImpl
		 * @see sma.ui.viewmodels.contenedorloginviewmodel.impl.ContenedorloginviewmodelPackageImpl#getContenedorDetalleLoginViewModel()
		 * @generated
		 */
		EClass CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL = eINSTANCE.getContenedorDetalleLoginViewModel();

		/**
		 * The meta object literal for the '<em><b>Usuario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL__USUARIO = eINSTANCE.getContenedorDetalleLoginViewModel_Usuario();

		/**
		 * The meta object literal for the '<em><b>Contrasenia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL__CONTRASENIA = eINSTANCE.getContenedorDetalleLoginViewModel_Contrasenia();

		/**
		 * The meta object literal for the '<em><b>Owned By Contenedor Login View Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL__OWNED_BY_CONTENEDOR_LOGIN_VIEW_MODEL = eINSTANCE.getContenedorDetalleLoginViewModel_OwnedByContenedorLoginViewModel();

		/**
		 * The meta object literal for the '{@link sma.ui.viewmodels.contenedorloginviewmodel.impl.ContenedorLoginViewModelImpl <em>Contenedor Login View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.ui.viewmodels.contenedorloginviewmodel.impl.ContenedorLoginViewModelImpl
		 * @see sma.ui.viewmodels.contenedorloginviewmodel.impl.ContenedorloginviewmodelPackageImpl#getContenedorLoginViewModel()
		 * @generated
		 */
		EClass CONTENEDOR_LOGIN_VIEW_MODEL = eINSTANCE.getContenedorLoginViewModel();

		/**
		 * The meta object literal for the '<em><b>Owned By UI</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_LOGIN_VIEW_MODEL__OWNED_BY_UI = eINSTANCE.getContenedorLoginViewModel_OwnedByUI();

		/**
		 * The meta object literal for the '<em><b>Usuario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_LOGIN_VIEW_MODEL__USUARIO = eINSTANCE.getContenedorLoginViewModel_Usuario();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Detalle Login View Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_LOGIN_VIEW_MODEL__THE_CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL = eINSTANCE.getContenedorLoginViewModel_TheContenedorDetalleLoginViewModel();

	}

} //ContenedorloginviewmodelPackage
