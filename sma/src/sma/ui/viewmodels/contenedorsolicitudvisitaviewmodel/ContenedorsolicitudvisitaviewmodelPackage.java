/**
 */
package sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import sma.ui.viewmodels.ViewmodelsPackage;

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
 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorsolicitudvisitaviewmodelFactory
 * @model kind="package"
 * @generated
 */
public interface ContenedorsolicitudvisitaviewmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "contenedorsolicitudvisitaviewmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///sma/ui/viewmodels/contenedorsolicitudvisitaviewmodel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContenedorsolicitudvisitaviewmodelPackage eINSTANCE = sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.impl.ContenedorsolicitudvisitaviewmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.impl.ContenedorBusquedaViewModelImpl <em>Contenedor Busqueda View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.impl.ContenedorBusquedaViewModelImpl
	 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.impl.ContenedorsolicitudvisitaviewmodelPackageImpl#getContenedorBusquedaViewModel()
	 * @generated
	 */
	int CONTENEDOR_BUSQUEDA_VIEW_MODEL = 0;

	/**
	 * The feature id for the '<em><b>The UI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_BUSQUEDA_VIEW_MODEL__THE_UI = ViewmodelsPackage.VIEW_MODEL__THE_UI;

	/**
	 * The feature id for the '<em><b>Idcm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_BUSQUEDA_VIEW_MODEL__IDCM = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Placavehiculo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_BUSQUEDA_VIEW_MODEL__PLACAVEHICULO = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned By Contenedor Solicitud Visita View Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_BUSQUEDA_VIEW_MODEL__OWNED_BY_CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Contenedor Busqueda View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_BUSQUEDA_VIEW_MODEL_FEATURE_COUNT = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.impl.ContenedorDatosCmViewModelImpl <em>Contenedor Datos Cm View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.impl.ContenedorDatosCmViewModelImpl
	 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.impl.ContenedorsolicitudvisitaviewmodelPackageImpl#getContenedorDatosCmViewModel()
	 * @generated
	 */
	int CONTENEDOR_DATOS_CM_VIEW_MODEL = 1;

	/**
	 * The feature id for the '<em><b>The UI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DATOS_CM_VIEW_MODEL__THE_UI = ViewmodelsPackage.VIEW_MODEL__THE_UI;

	/**
	 * The feature id for the '<em><b>Nombrecm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DATOS_CM_VIEW_MODEL__NOMBRECM = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nombrerepresentante</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DATOS_CM_VIEW_MODEL__NOMBREREPRESENTANTE = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Direccion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DATOS_CM_VIEW_MODEL__DIRECCION = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned By Contenedor Solicitud Visita View Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DATOS_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Contenedor Datos Cm View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DATOS_CM_VIEW_MODEL_FEATURE_COUNT = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.impl.ContenedorSolicitudVisitaViewModelImpl <em>Contenedor Solicitud Visita View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.impl.ContenedorSolicitudVisitaViewModelImpl
	 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.impl.ContenedorsolicitudvisitaviewmodelPackageImpl#getContenedorSolicitudVisitaViewModel()
	 * @generated
	 */
	int CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL = 2;

	/**
	 * The feature id for the '<em><b>The UI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__THE_UI = ViewmodelsPackage.VIEW_MODEL__THE_UI;

	/**
	 * The feature id for the '<em><b>Owned By UI</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__OWNED_BY_UI = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>The Contenedor Busqueda View Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>The Contenedor Datos Cm View Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__THE_CONTENEDOR_DATOS_CM_VIEW_MODEL = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Contenedor Solicitud Visita View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL_FEATURE_COUNT = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorBusquedaViewModel <em>Contenedor Busqueda View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Busqueda View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorBusquedaViewModel
	 * @generated
	 */
	EClass getContenedorBusquedaViewModel();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorBusquedaViewModel#getIdcm <em>Idcm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idcm</em>'.
	 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorBusquedaViewModel#getIdcm()
	 * @see #getContenedorBusquedaViewModel()
	 * @generated
	 */
	EAttribute getContenedorBusquedaViewModel_Idcm();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorBusquedaViewModel#getPlacavehiculo <em>Placavehiculo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placavehiculo</em>'.
	 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorBusquedaViewModel#getPlacavehiculo()
	 * @see #getContenedorBusquedaViewModel()
	 * @generated
	 */
	EAttribute getContenedorBusquedaViewModel_Placavehiculo();

	/**
	 * Returns the meta object for the container reference '{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorBusquedaViewModel#getOwnedByContenedorSolicitudVisitaViewModel <em>Owned By Contenedor Solicitud Visita View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Contenedor Solicitud Visita View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorBusquedaViewModel#getOwnedByContenedorSolicitudVisitaViewModel()
	 * @see #getContenedorBusquedaViewModel()
	 * @generated
	 */
	EReference getContenedorBusquedaViewModel_OwnedByContenedorSolicitudVisitaViewModel();

	/**
	 * Returns the meta object for class '{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorDatosCmViewModel <em>Contenedor Datos Cm View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Datos Cm View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorDatosCmViewModel
	 * @generated
	 */
	EClass getContenedorDatosCmViewModel();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorDatosCmViewModel#getNombrecm <em>Nombrecm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombrecm</em>'.
	 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorDatosCmViewModel#getNombrecm()
	 * @see #getContenedorDatosCmViewModel()
	 * @generated
	 */
	EAttribute getContenedorDatosCmViewModel_Nombrecm();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorDatosCmViewModel#getNombrerepresentante <em>Nombrerepresentante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombrerepresentante</em>'.
	 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorDatosCmViewModel#getNombrerepresentante()
	 * @see #getContenedorDatosCmViewModel()
	 * @generated
	 */
	EAttribute getContenedorDatosCmViewModel_Nombrerepresentante();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorDatosCmViewModel#getDireccion <em>Direccion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direccion</em>'.
	 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorDatosCmViewModel#getDireccion()
	 * @see #getContenedorDatosCmViewModel()
	 * @generated
	 */
	EAttribute getContenedorDatosCmViewModel_Direccion();

	/**
	 * Returns the meta object for the container reference '{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorDatosCmViewModel#getOwnedByContenedorSolicitudVisitaViewModel <em>Owned By Contenedor Solicitud Visita View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Contenedor Solicitud Visita View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorDatosCmViewModel#getOwnedByContenedorSolicitudVisitaViewModel()
	 * @see #getContenedorDatosCmViewModel()
	 * @generated
	 */
	EReference getContenedorDatosCmViewModel_OwnedByContenedorSolicitudVisitaViewModel();

	/**
	 * Returns the meta object for class '{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorSolicitudVisitaViewModel <em>Contenedor Solicitud Visita View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Solicitud Visita View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorSolicitudVisitaViewModel
	 * @generated
	 */
	EClass getContenedorSolicitudVisitaViewModel();

	/**
	 * Returns the meta object for the container reference '{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorSolicitudVisitaViewModel#getOwnedByUI <em>Owned By UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By UI</em>'.
	 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorSolicitudVisitaViewModel#getOwnedByUI()
	 * @see #getContenedorSolicitudVisitaViewModel()
	 * @generated
	 */
	EReference getContenedorSolicitudVisitaViewModel_OwnedByUI();

	/**
	 * Returns the meta object for the containment reference '{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorSolicitudVisitaViewModel#getTheContenedorBusquedaViewModel <em>The Contenedor Busqueda View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Contenedor Busqueda View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorSolicitudVisitaViewModel#getTheContenedorBusquedaViewModel()
	 * @see #getContenedorSolicitudVisitaViewModel()
	 * @generated
	 */
	EReference getContenedorSolicitudVisitaViewModel_TheContenedorBusquedaViewModel();

	/**
	 * Returns the meta object for the containment reference '{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorSolicitudVisitaViewModel#getTheContenedorDatosCmViewModel <em>The Contenedor Datos Cm View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Contenedor Datos Cm View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorSolicitudVisitaViewModel#getTheContenedorDatosCmViewModel()
	 * @see #getContenedorSolicitudVisitaViewModel()
	 * @generated
	 */
	EReference getContenedorSolicitudVisitaViewModel_TheContenedorDatosCmViewModel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContenedorsolicitudvisitaviewmodelFactory getContenedorsolicitudvisitaviewmodelFactory();

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
		 * The meta object literal for the '{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.impl.ContenedorBusquedaViewModelImpl <em>Contenedor Busqueda View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.impl.ContenedorBusquedaViewModelImpl
		 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.impl.ContenedorsolicitudvisitaviewmodelPackageImpl#getContenedorBusquedaViewModel()
		 * @generated
		 */
		EClass CONTENEDOR_BUSQUEDA_VIEW_MODEL = eINSTANCE.getContenedorBusquedaViewModel();

		/**
		 * The meta object literal for the '<em><b>Idcm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_BUSQUEDA_VIEW_MODEL__IDCM = eINSTANCE.getContenedorBusquedaViewModel_Idcm();

		/**
		 * The meta object literal for the '<em><b>Placavehiculo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_BUSQUEDA_VIEW_MODEL__PLACAVEHICULO = eINSTANCE.getContenedorBusquedaViewModel_Placavehiculo();

		/**
		 * The meta object literal for the '<em><b>Owned By Contenedor Solicitud Visita View Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_BUSQUEDA_VIEW_MODEL__OWNED_BY_CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL = eINSTANCE.getContenedorBusquedaViewModel_OwnedByContenedorSolicitudVisitaViewModel();

		/**
		 * The meta object literal for the '{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.impl.ContenedorDatosCmViewModelImpl <em>Contenedor Datos Cm View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.impl.ContenedorDatosCmViewModelImpl
		 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.impl.ContenedorsolicitudvisitaviewmodelPackageImpl#getContenedorDatosCmViewModel()
		 * @generated
		 */
		EClass CONTENEDOR_DATOS_CM_VIEW_MODEL = eINSTANCE.getContenedorDatosCmViewModel();

		/**
		 * The meta object literal for the '<em><b>Nombrecm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_DATOS_CM_VIEW_MODEL__NOMBRECM = eINSTANCE.getContenedorDatosCmViewModel_Nombrecm();

		/**
		 * The meta object literal for the '<em><b>Nombrerepresentante</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_DATOS_CM_VIEW_MODEL__NOMBREREPRESENTANTE = eINSTANCE.getContenedorDatosCmViewModel_Nombrerepresentante();

		/**
		 * The meta object literal for the '<em><b>Direccion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_DATOS_CM_VIEW_MODEL__DIRECCION = eINSTANCE.getContenedorDatosCmViewModel_Direccion();

		/**
		 * The meta object literal for the '<em><b>Owned By Contenedor Solicitud Visita View Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_DATOS_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL = eINSTANCE.getContenedorDatosCmViewModel_OwnedByContenedorSolicitudVisitaViewModel();

		/**
		 * The meta object literal for the '{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.impl.ContenedorSolicitudVisitaViewModelImpl <em>Contenedor Solicitud Visita View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.impl.ContenedorSolicitudVisitaViewModelImpl
		 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.impl.ContenedorsolicitudvisitaviewmodelPackageImpl#getContenedorSolicitudVisitaViewModel()
		 * @generated
		 */
		EClass CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL = eINSTANCE.getContenedorSolicitudVisitaViewModel();

		/**
		 * The meta object literal for the '<em><b>Owned By UI</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__OWNED_BY_UI = eINSTANCE.getContenedorSolicitudVisitaViewModel_OwnedByUI();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Busqueda View Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL = eINSTANCE.getContenedorSolicitudVisitaViewModel_TheContenedorBusquedaViewModel();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Datos Cm View Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__THE_CONTENEDOR_DATOS_CM_VIEW_MODEL = eINSTANCE.getContenedorSolicitudVisitaViewModel_TheContenedorDatosCmViewModel();

	}

} //ContenedorsolicitudvisitaviewmodelPackage
